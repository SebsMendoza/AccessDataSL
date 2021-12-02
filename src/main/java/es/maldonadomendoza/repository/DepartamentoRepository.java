package es.maldonadomendoza.repository;

import es.maldonadomendoza.database.DataBaseController;
import es.maldonadomendoza.model.Departamento;
import es.maldonadomendoza.utils.CheckNulls;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartamentoRepository implements CrudRepository<Departamento, Integer> {
    @Override
    public List<Departamento> findAll() throws SQLException {
        String query = "SELECT * FROM departamento";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        ResultSet result = db.select(query).orElseThrow(() -> new SQLException("Error DepartamentoRepository al consultar departamentos "));
        ArrayList<Departamento> list = new ArrayList<Departamento>();
        while (result.next()) {
            list.add(new Departamento(
                    result.getInt("id"),
                    result.getInt("id_jefe"),
                    result.getString("nombre"),
                    result.getDouble("presupuesto")
            ));
        }
        db.close();
        return list;
    }

    @Override
    public Departamento getById(Integer id) throws SQLException {
        String query = "SELECT * FROM departamento";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        ResultSet result = db.select(query).orElseThrow(() -> new SQLException("Error al consultar departamento con ID" +id));
        if(result.next()){
            Departamento dep = new Departamento(result.getInt("id"),
                    result.getInt("id_jefe"),
                    result.getString("nombre"),
                    result.getDouble("presupuesto"));
            db.close();
            return dep;
        }
        else
            throw new SQLException("Error no existe departamento con id: +id");
    }

    @Override
    public Departamento save(Departamento departamento) throws SQLException {
        String query = "INSERT INTO departamento VALUES (?, ?, ?, ?)";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        ResultSet result = db.insert(query, departamento.getId(), departamento.getIdJefeDpt(), departamento.getNombre(), departamento.getPresupuesto()).orElseThrow(() -> new SQLException("Error DepartamentoRepository al insertar Departamento"));
        if (result.next()){
            departamento.setId(result.getInt(1));
            db.close();
            return departamento;
        }
        else
            throw new SQLException("Error DepartamentoRepository al insertar departamente en BD");
    }

    @Override
    public Departamento update(Departamento departamento) throws SQLException {
        String query = "UPDATE departamento SET id_jefe = ?, nombre = ? where id = ?";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        int res = db.update(query, departamento.getIdJefeDpt(), departamento.getNombre(), departamento.getId());
        db.close();
        if (res > 0)
        return departamento;
        else
            throw new SQLException("Error DepartamentoRepository al actualizar departamento con id: " + departamento.getId());
    }

    @Override
    public Departamento delete(Departamento departamento) throws SQLException {
        String query = "DELETE FROM departamento WHERE id = ?";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        int res = db.delete(query,departamento.getId());
        db.close();
        if(res > 0)
        return departamento;
        throw new SQLException("Error DepartamentoRepository al actualiza departamento con id: " + departamento.getId());
    }
}
