package es.maldonadomendoza.repository;

import es.maldonadomendoza.database.DataBaseController;
import es.maldonadomendoza.model.Programador;
import es.maldonadomendoza.utils.CheckNulls;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProgRepository implements CrudRepository<Programador, Integer> {
    CheckNulls cn = new CheckNulls();

    @Override
    public List<Programador> findAll() throws SQLException {
        String query = "SELECT * FROM programador";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        ResultSet result = db.select(query).orElseThrow(() -> new SQLException("Error ProgRepository al consultar registros de Programador"));
        ArrayList<Programador> list = new ArrayList<Programador>();
        while (result.next()) {
            list.add(
                    new Programador(
                            result.getInt("id"),
                            result.getInt("id_equipo"),
                            result.getInt("id_dpt"),
                            cn.checkNulls(result.getString("id_commit")),
                            cn.checkNulls(result.getString("id_comite")),
                            cn.checkNulls(result.getString("id_issue")),
                            result.getString("nombre"),
                            result.getString("experto"),
                            result.getDate("fecha_alta"),
                            result.getDouble("salario")
                    )
            );
        }
        db.close();
        return list;
    }

    @Override
    public Programador getById(Integer id) throws SQLException {
        String query = "SELECT * FROM programador WHERE id = ?";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        ResultSet result = db.select(query, id).orElseThrow(() -> new SQLException("Error al consultar programador con ID: " + id));
        if (result.next()) {
            Programador prog = new Programador(
                    result.getInt("id"),
                    result.getInt("id_equipo"),
                    result.getInt("id_dpt"),
                    cn.checkNulls(result.getString("id_commit")),
                    cn.checkNulls(result.getString("id_comite")),
                    cn.checkNulls(result.getString("id_issue")),
                    result.getString("nombre"),
                    result.getString("experto"),
                    result.getDate("fecha_alta"),
                    result.getDouble("salario")
            );
            db.close();
            return prog;
        } else
            throw new SQLException("Error no existe programador con ID: " + id);
    }

    @Override
    public Programador save(Programador programador) throws SQLException {
        String query = "INSERT INTO programador VALUES (?, ?, ?, ?, ?, ?, ?, ? , ?, ?)";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        ResultSet result = db.insert(query, programador.getId(), programador.getIdEquipo(), programador.getIdDpt(), programador.getCommits(), programador.getIdComite(), programador.getIssues(), programador.getNombre(), programador.getExperto(), programador.getFecha_alta(), programador.getSalario()).orElseThrow(() -> new SQLException("Error ProgRepository al insertar Programador"));
        if (result.next()) {
            programador.setId(result.getInt(1));
            db.close();
            return programador;
        } else
            throw new SQLException("Error ProgRepository al insertar programador en BD");
    }

    @Override
    public Programador update(Programador programador) throws SQLException {
        String query = "UPDATE programador SET nombre = ? WHERE id = ?";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        int result = db.update(query, programador.getNombre(), programador.getId());
        db.close();
        if (result > 0)
            return programador;
        else
            throw new SQLException("Error ProgRepository al actualizar programador con id: " + programador.getId());
    }

    @Override
    public Programador delete(Programador programador) throws SQLException {
        String query = "DELETE FROM programador WHERE id = ?";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        int result = db.delete(query, programador.getId());
        db.close();
        if (result > 0)
            return programador;
        throw new SQLException("Error ProgRepository al borrar programador con id: " + programador.getId());
    }
}
