package es.maldonadomendoza.repository;

import es.maldonadomendoza.database.DataBaseController;
import es.maldonadomendoza.model.Equipo;
import es.maldonadomendoza.utils.CheckNulls;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EquipoRepository implements CrudRepository<Equipo, Integer>{
    CheckNulls cn = new CheckNulls();
    @Override
    public List<Equipo> findAll() throws SQLException {
        String query = "SELECT * FROM equipo";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        ResultSet result = db.select(query).orElseThrow(() -> new SQLException ("Error EquipoRepository al consultar registros de Equipo"));
        ArrayList<Equipo> list = new ArrayList<Equipo>();
        while (result.next()) {
            list.add(new Equipo(result.getInt("id"),
                     cn.checkNulls(result.getString("id_prog")), cn.checkNulls(result.getString("id_proyecto"))));
        }
        db.close();
        return list;
    }

    @Override
    public Equipo getById(Integer id) throws SQLException {
        String query = "SELECT * FROM equipo where id = ?";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        ResultSet result = db.select(query).orElseThrow(() -> new SQLException("Error al consultar equipo con ID" + id));
        if (result.next()){
            Equipo equipo = new Equipo(
                    result.getInt("id"),
                    cn.checkNulls(result.getString("id_prog")), cn.checkNulls(result.getString("id_proyecto"))

            );
            db.close();
            return equipo;
        }
        else throw new SQLException("Error no existe equipo con id: " +id);
    }

    @Override
    public Equipo save(Equipo equipo) throws SQLException {
        String query = "INSERT INTO equipo VALUES (?, ?, ?)";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        ResultSet res = db.insert(query, equipo.getId(), equipo.getProgramadores(), equipo.getProyectos()).orElseThrow(() -> new SQLException ("Error EquipoRepository al insertar Equipo"));
        if (res.next()){
            equipo.setId(res.getInt(1));
            db.close();
            return equipo;
        }else
            throw new SQLException("Error EquipoRepository al insertar equipo en BD");
    }

    @Override
    public Equipo update(Equipo equipo) throws SQLException {
        String query = "UPDATE equipo SET id_prog = ?, id_proyecto = ? where id = ?";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        int res = db.update(query, equipo.getProgramadores(), equipo.getProyectos(), equipo.getId());
        db.close();
        if (res > 0)
        return equipo;
     else
        throw new SQLException("Error EquipoRepository al actualizar equipo con id " + equipo.getId());
    }

    @Override
    public Equipo delete(Equipo equipo) throws SQLException {
        String query = "DELETE FROM equipo WHERE id = ?";
        DataBaseController db =DataBaseController.getInstance();
        db.open();
        int res = db.delete(query, equipo.getId());
        db.close();
        if (res > 0)
        return equipo;
        throw new SQLException("Error EquipoRepository al actualizar equipo con id: " + equipo.getId());
    }
}
