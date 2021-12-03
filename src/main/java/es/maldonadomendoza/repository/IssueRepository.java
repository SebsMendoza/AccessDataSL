package es.maldonadomendoza.repository;

import es.maldonadomendoza.database.DataBaseController;
import es.maldonadomendoza.model.Issue;
import es.maldonadomendoza.utils.CheckNulls;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class IssueRepository implements CrudRepository<Issue, Integer> {
    CheckNulls cn = new CheckNulls();

    @Override
    public List<Issue> findAll() throws SQLException {
        String query = "SELECT * FROM issue";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        ResultSet result = db.select(query).orElseThrow(() -> new SQLException("Error IssueRepository al consultar registros de Issue"));
        ArrayList<Issue> list = new ArrayList<Issue>();
        while (result.next()) {
            list.add(new Issue(
                    result.getInt("id"),
                    result.getInt("id_jefe"),
                    result.getInt("id_commit"),
                    result.getInt("id_repo"),
                    result.getInt("id_comite"),
                    result.getString("titulo"),
                    cn.checkNulls(result.getString("texto")),
                    result.getDate("fecha"),
                    result.getBoolean("estado")
            ));
        }
        db.close();
        return list;
    }

    @Override
    public Issue getById(Integer id) throws SQLException {
        String query = "SELECT * FROM issue where id = ?";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        ResultSet result = db.select(query, id).orElseThrow(() -> new SQLException("Error al consultar issue con ID: " + id));
        if (result.next()) {
            Issue issue = new Issue(
                    result.getInt("id"),
                    result.getInt("id_jefe"),
                    result.getInt("id_commit"),
                    result.getInt("id_repo"),
                    result.getInt("id_comite"),
                    result.getString("titulo"),
                    cn.checkNulls(result.getString("texto")),
                    result.getDate("fecha"),
                    result.getBoolean("estado")
            );
            db.close();
            return issue;
        } else
            throw new SQLException("Error no existe issue con ID: " + id);
    }

    @Override
    public Issue save(Issue issue) throws SQLException {
        String query = "INSERT INTO issue VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        ResultSet res = db.insert(query, issue.getId(), issue.getIdJefe(), issue.getCommits(), issue.getRepositorio(), issue.getProgramadores(), issue.getTitulo(), issue.getTexto(), issue.getFecha(), issue.isEstado()).orElseThrow(() -> new SQLException("Error IssueRepository al insertar Issue"));
        if (res.next()) {
            issue.setId(res.getInt(1));
            db.close();
            return issue;
        } else
            throw new SQLException("Error IssueRepository al insertar issue en BD");
    }

    @Override
    public Issue update(Issue issue) throws SQLException {
        String query = "UPDATE issue SET titulo = ? WHERE id = ?";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        int res = db.update(query, issue.getTitulo(), issue.getId());
        if (res > 0)
            return issue;
        else
            throw new SQLException("Error IssueRepository al actualizar issue con id: " + issue.getId());
    }

    @Override
    public Issue delete(Issue issue) throws SQLException {
        String query = "DELETE FROM issue WHERE id = ?";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        int res = db.delete(query, issue.getId());
        db.close();
        if (res > 0)
            return issue;
        throw new SQLException("Error IssueRepository al borrar issue con id: " + issue.getId());
    }
}
