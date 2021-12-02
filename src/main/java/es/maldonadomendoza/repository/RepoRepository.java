package es.maldonadomendoza.repository;

import es.maldonadomendoza.database.DataBaseController;
import es.maldonadomendoza.model.Repositorio;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RepoRepository implements CrudRepository<Repositorio, Integer> {
    @Override
    public List<Repositorio> findAll() throws SQLException {
        String query = "SELECT * FROM repositorio";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        ResultSet result = db.select(query).orElseThrow(() -> new SQLException("Error RepoRepository al consultar registros de Repositorio"));
        ArrayList<Repositorio> list = new ArrayList<Repositorio>();
        while (result.next()){
            list.add(
                    new Repositorio(
                            result.getInt("id"),
                            result.getInt("id_proyecto"),
                            result.getInt("id_commit"),
                            result.getInt("id_isuue"),
                            result.getString("nombre"),
                            result.getDate("fechaCreacion")
                    )
            );
        }
        db.close();
        return list;
    }

    @Override
    public Repositorio getById(Integer id) throws SQLException {
        String query = "SELECT * FROM repositorio WHERE id = ?";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        ResultSet result = db.select(query, id).orElseThrow(() -> new SQLException("Error al consultar repositorio con ID: " +id));
        if (result.next()){
            Repositorio repo = new Repositorio(result.getInt("id"),
                    result.getInt("id_proyecto"),
                    result.getInt("id_commit"),
                    result.getInt("id_isuue"),
                    result.getString("nombre"),
                    result.getDate("fechaCreacion"));
            db.close();
            return repo;
        }
        else
            throw  new SQLException("Error no existe repositorio con ID: "+id);
    }

    @Override
    public Repositorio save(Repositorio repositorio) throws SQLException {
        String query = "INSERT INTO repositorio VALUES (?, ?, ?, ?, ?, ?)";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        ResultSet result = db.select(query, repositorio.getId(), repositorio.getProyecto(), repositorio.getCommits(), repositorio.getIssues(), repositorio.getNombre(), repositorio.getCreacion()).orElseThrow(() -> new SQLException("Error RepoRepository al insertar Repositorio"));



        return repositorio;
    }

    @Override
    public Repositorio update(Repositorio repositorio) throws SQLException {
        String query = "UPDATE repositorio SET nombre = ? where id = ?";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        int result = db.update(query, repositorio.getNombre(), repositorio.getId());
        db.close();
        if (result > 0)
            return repositorio;
        else
            throw new SQLException("Error RepoRepository al actualizar repositorio con id: " +repositorio.getId());

    }

    @Override
    public Repositorio delete(Repositorio repositorio) throws SQLException {
        String query = "DELETE FROM repositorio WHERE id = ?";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        int result = db.delete(query,repositorio.getId());
        db.close();
        if (result > 0)
        return repositorio;
        throw new SQLException("Error RepoRepository al borrar repositorio con id: " + repositorio.getId());
    }
}
