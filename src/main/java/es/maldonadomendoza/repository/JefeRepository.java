package es.maldonadomendoza.repository;

import es.maldonadomendoza.database.DataBaseController;
import es.maldonadomendoza.model.Jefe;
import es.maldonadomendoza.utils.CheckNulls;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JefeRepository implements CrudRepository<Jefe, Integer> {
    CheckNulls cn = new CheckNulls();

    @Override
    public List<Jefe> findAll() throws SQLException {
        String query = "SELECT * FROM jefe";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        ResultSet result = db.select(query).orElseThrow(() -> new SQLException("Error JefeRepository al consultar registros de Jefe"));
        ArrayList<Jefe> list = new ArrayList<Jefe>();
        while (result.next()) {
            list.add(
                    new Jefe(
                            result.getInt("id"),
                            result.getInt("id_proyecto"),
                            result.getInt("id_prog"),
                            cn.checkNulls(result.getString("id_issue"))
                    )
            );
        }
        db.close();
        return list;
    }

    @Override
    public Jefe getById(Integer id) throws SQLException {
        String query = "SELECT * FROM jefe WHERE = ?";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        ResultSet result = db.select(query, id).orElseThrow(() -> new SQLException("Error al consultar jefe con ID: " + id));
        if (result.next()) {
            Jefe jefe = new Jefe(
                    result.getInt("id"),
                    result.getInt("id_proyecto"),
                    result.getInt("id_prog"),
                    cn.checkNulls(result.getString("id_issue"))
            );
            db.close();
            return jefe;
        } else
            throw new SQLException("Error no existe jefe con ID: " + id);
    }

    @Override
    public Jefe save(Jefe jefe) throws SQLException {
        String query = "INSERT INTO jefe VALUES (?, ?, ?, ?)";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        ResultSet result = db.select(query, jefe.getIdJefe(), jefe.getIdProg(), jefe.getIdProyecto(), jefe.getIdIssue()).orElseThrow(() -> new SQLException("Error JefeRepository al insertar Jefe"));
        if (result.next()) {
            jefe.setIdJefe(result.getInt(1));
            db.close();
            return jefe;
        } else
            throw new SQLException("Error JefeRepository al insertar jefe en BD");
    }

    @Override
    public Jefe update(Jefe jefe) throws SQLException {
        String query = "UPDATE jefe SET id_prog = ? WHERE id = ?";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        int result = db.update(query, jefe.getIdProg(), jefe.getIdJefe());
        db.close();
        if (result > 0)
            return jefe;
        else
            throw new SQLException("Error JefeRepository al actualizar jefe con id: " + jefe.getIdJefe());
    }

    @Override
    public Jefe delete(Jefe jefe) throws SQLException {
        String query = "DELETE FROM jefe WHERE id = ?";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        int result = db.delete(query, jefe.getIdJefe());
        db.close();
        if (result > 0)
            return jefe;
        throw new SQLException("Error JefeRepository al borrar jefe con id: " + jefe.getIdJefe());
    }
}
