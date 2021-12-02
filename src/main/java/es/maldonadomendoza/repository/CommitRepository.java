package es.maldonadomendoza.repository;

import es.maldonadomendoza.database.DataBaseController;
import es.maldonadomendoza.model.Commit;
import es.maldonadomendoza.utils.CheckNulls;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CommitRepository implements CrudRepository<Commit, Integer>{
    CheckNulls cn = new CheckNulls();
    @Override
    public List<Commit> findAll() throws SQLException {
        String query = "SELECT * FROM commit";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        ResultSet result = db.select(query).orElseThrow(() -> new SQLException("Error ComiteRepositor al consultar "+ "registros de commit"));
        ArrayList<Commit> list = new ArrayList<Commit>();
        while (result.next()) {
            list.add(
                    new Commit(
                            result.getInt("id"),
                            result.getInt("id_prog"),
                            result.getInt("repo"),
                            result.getInt("id_proyecto"),
                            result.getInt("id_issue"),
                            result.getString("titulo"),
                            cn.checkNulls(result.getString("texto")),
                            result.getDate("fecha").toLocalDate()
                                    )



                    );

        }
        db.close();
        return list;
    }

    @Override
    public Commit getById(Integer id) throws SQLException {
        String query = "SELECT * FROM commit where id = ?";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        ResultSet result = db.select(query, id).orElseThrow(() -> new SQLException("Error al consultar el commit con ID" + id));
        if (result.next()) {
            Commit commit = new Commit(result.getInt("id"),
                    result.getInt("id_prog"),
                    result.getInt("repo"),
                    result.getInt("id_proyecto"),
                    result.getInt("id_issue"),
                    result.getString("titulo"),
                    cn.checkNulls(result.getString("texto")),
                    result.getDate("fecha").toLocalDate()
            );
              db.close();
              return commit;

        } else
            throw new SQLException("Error no existe commit con id " +id);
    }

    @Override
    public Commit save(Commit commit) throws SQLException {
        String query = "INSERT INTO commit VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        ResultSet res = db.insert(query, commit.getId(), commit.getRepositorio(), commit.getIdProyecto(), commit.getIssues(), commit.getTitulo(), commit.getTitulo(), commit.getFecha()).orElseThrow(() -> new SQLException("Error CommitRepository al insertar Commit "));
            if (res.next()) {
                commit.setId(res.getInt(1));
                db.close();
                return commit;
            }else
                throw new SQLException("Error CommitRepository al insertar commit en BD");
    }

    @Override
    public Commit update(Commit commit) throws SQLException {
        String query = "UPDATE commit SET id_prog = ?, io_issue? where id = ?";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        int res = db.update(query, commit.getIdProg(), commit.getIssues(), commit.getId());
        db.close();
        if (res > 0)
        return commit;
        else
            throw new SQLException("Error CommitRepository al actualizar Commit con id: " + commit.getId());
    }

    @Override
    public Commit delete(Commit commit) throws SQLException {
        String query = "DELETE FROM commit WHERE id = ?";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        int res = db.delete(query, commit.getId());
        db.close();
        if (res > 0)
            return commit;
        throw new SQLException("Error CommitRepository al actualizar commit con id: " + commit.getId());
    }
}
