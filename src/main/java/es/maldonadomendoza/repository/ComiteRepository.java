package es.maldonadomendoza.repository;

import es.maldonadomendoza.database.DataBaseController;
import es.maldonadomendoza.model.Comite;
import es.maldonadomendoza.utils.CheckNulls;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ComiteRepository implements CrudRepository<Comite, Integer> {
    CheckNulls cn = new CheckNulls();

    @Override
    public List<Comite> findAll() throws SQLException {
        String query = "SELECT * FROM comite";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        ResultSet result = db.select(query).orElseThrow(() -> new SQLException("Error ComiteRepository al consultar " + "registros de programador"));
        ArrayList<Comite> list = new ArrayList<Comite>();
        while (result.next()) {
            list.add(new Comite(
                    result.getInt("id"),
                    cn.checkNulls(result.getString("id_prog")),
                    result.getInt("id_issue")
            ));
        }
        db.close();
        return list;
    }

    @Override
    public Comite getById(Integer id) throws SQLException {
        String query = "SELECT * FROM comite where id = ?";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        ResultSet result = db.select(query, id).orElseThrow(() -> new SQLException("Error al consultar comite con ID" + id));
        if (result.next()) {
            Comite comite = new Comite(
                    result.getInt("id"),
                    cn.checkNulls(result.getString("id_prog")),
                    result.getInt("id_issue")

            );
            db.close();
            return comite;
        } else
            throw new SQLException("Error no existe comite con id: " + id);

    }

    @Override
    public Comite save(Comite comite) throws SQLException {
        String query = "INSERT INTO comite VALUES (? ? ?)";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        ResultSet res = db.insert(query, comite.getId(), comite.getProgramadores(), comite.getIssues()).orElseThrow(() -> new SQLException("Error ComiteRepository al insertar Comite"));
        if (res.next()) {
            comite.setId(res.getInt(1));
            db.close();
            return comite;
        } else
            throw new SQLException("Error ComiteRepository al insertar comite en BD");

    }

    @Override
    public Comite update(Comite comite) throws SQLException {
        String query = "UPDATE comite SET id_prog = ?, id_issue = ? where id = ?";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        int res = db.update(query, comite.getProgramadores(), comite.getIssues(), comite.getId());
        db.close();
        if (res > 0)
        return comite;
        else
            throw new SQLException("Error ComiteRepository al actualizar comite con id: " + comite.getId());
    }

    @Override
    public Comite delete(Comite comite) throws SQLException {
        String query = "DELETE FROM comite WHERE id = ?";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        int res = db.delete(query,comite.getId());
        db.close();
        if (res > 0)
            return comite;
        throw new SQLException("Error ComiteRepository al actualizar comite con id: " + comite.getId());

    }


}
