package es.maldonadomendoza.repository;

import es.maldonadomendoza.database.DataBaseController;
import es.maldonadomendoza.model.Proyecto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProyectoRepository implements CrudRepository<Proyecto, Integer>{
    @Override
    public List<Proyecto> findAll() throws SQLException {
        String query = "SELECT * FROM proyecto ";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        ResultSet result = db.select(query).orElseThrow(() -> new SQLException("Error ProyectoRepository al consultar registros de Proyecto"));
        ArrayList<Proyecto> list = new ArrayList<Proyecto>();
        while (result.next()) {
            list.add(
                    new Proyecto(
                            result.getInt("id"),
                            result.getInt("id_jefe"),
                            result.getInt("id_dpt"),
                            result.getInt("id_repo"),
                            result.getString("nombre"),
                            result.getDouble("presupuesto"),
                            result.getDate("fecha_ini"),
                            result.getDate("fecha_fin"),
                            result.getString("tecnologias")

                    )
            );
        }
        db.close();
        return list;
    }

    @Override
    public Proyecto getById(Integer id) throws SQLException {
        String query = "SELECT * FROM proyecto WHERE id = ?";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        ResultSet result = db.select(query, id).orElseThrow(() -> new SQLException("Error al consultar proyecto con ID: " + id));
        if (result.next()){
            Proyecto proyecto = new Proyecto(result.getInt("id"),
                    result.getInt("id_jefe"),
                    result.getInt("id_dpt"),
                    result.getInt("id_repo"),
                    result.getString("nombre"),
                    result.getDouble("presupuesto"),
                    result.getDate("fecha_ini"),
                    result.getDate("fecha_fin"),
                    result.getString("tecnologias"));
            db.close();
            return proyecto;
        }
        else
            throw new SQLException("Error no existe proyecto con ID: "+ id);

    }

    @Override
    public Proyecto save(Proyecto proyecto) throws SQLException {
        String query = "INSERT INTO programador VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        ResultSet result = db.insert(query, proyecto.getId(), proyecto.getIdJefe(), proyecto.getEquipos(), proyecto.getIdDpt(), proyecto.getRepositorios(), proyecto.getNombre(), proyecto.getPresupuesto(), proyecto.getFechaInicio(), proyecto.getFechaFin(), proyecto.getTecnologias()).orElseThrow(() -> new SQLException("Error ProyectoRepository al insertar"));
        if (result.next()){
            proyecto.setId(result.getInt(1));
            db.close();
            return proyecto;
        }else
            throw new SQLException("Error ProyectoRepository al insertar proyecto en BD");
    }

    @Override
    public Proyecto update(Proyecto proyecto) throws SQLException {
        String query = "UPDATE proyecto SET nombre = ? WHERE id = ?";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        int result = db.update(query, proyecto.getNombre(), proyecto.getId());
        db.close();
        if (result > 0)
            return proyecto;
        else
            throw  new SQLException("Error ProyectoRepository al actualizar proyecto con id: " + proyecto.getId());
    }

    @Override
    public Proyecto delete(Proyecto proyecto) throws SQLException {
        String query = "DELETE FROM proyecto WHERE id = ?";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        int result = db.delete(query, proyecto.getId());
        db.close();
        if (result > 0)
        return proyecto;
        throw new SQLException("Error ProyectoRepository al borrar proyecto con id: "+proyecto.getId());
    }
}
