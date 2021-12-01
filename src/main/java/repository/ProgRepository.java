package repository;

import es.maldonadomendoza.database.DataBaseController;
import es.maldonadomendoza.model.Programador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgRepository implements CrudRepository<Programador, Integer> {
    @Override
    public List<Programador> findAll() throws SQLException {
        String query = "SELECT * FROM programador";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        ResultSet result = db.select(query).orElseThrow(() -> new SQLException("Error ProgRepository al consultar " +
                "registros de Programador"));
        ArrayList<Programador> list = new ArrayList<Programador>();
        while (result.next()) {
            list.add(
                    new Programador(
                            result.getInt("id"),
                            result.getInt("id_equipo"),
                            result.getInt("id_dpt"),
                            checkNulls(result.getString("id_commit")),
                            checkNulls(result.getString("id_comite")),
                            checkNulls(result.getString("id_issue")),
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
        String query = "SELECT * FROM programador where id = ?";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        ResultSet result = db.select(query, id).orElseThrow(() -> new SQLException("Error al consultar programador con ID" + id));
        if (result.next()) {
            Programador prog = new Programador(
                    result.getInt("id"),
                    result.getInt("id_equipo"),
                    result.getInt("id_dpt"),
                    checkNulls(result.getString("id_commit")),
                    checkNulls(result.getString("id_comite")),
                    checkNulls(result.getString("id_issue")),
                    result.getString("nombre"),
                    result.getString("experto"),
                    result.getDate("fecha_alta"),
                    result.getDouble("salario")
            );
            db.close();
            return prog;
        } else
            throw new SQLException("Error no existe programador con id: " + id);

    }

    @Override
    public Programador save(Programador programador) throws SQLException {
        String query = "INSERT INTO programador VALUES (?, ?, ?, ?, ?)";
        DataBaseController db = DataBaseController.getInstance();
        db.open();
        ResultSet res = db.insert(query, programador.getId(), programador.getIdEquipo(), programador.getIdDpt(), programador.getCommits(), programador.getIdComite(), programador.getIssues(), programador.getNombre(), programador.getExperto(), programador.getAlta(), programador.getSalario()).orElseThrow(() -> new SQLException("Error ProgRepository al insertar Programador"));
        if (res.next()) {
            programador.setId(res.getInt(1));
            db.close();
            return programador;
        } else
            throw new SQLException("Error ProgRepository al insertar usuario en BD");
    }

    @Override
    public Programador update(Programador programador) throws SQLException {
        return null;
    }

    @Override
    public Programador delete(Programador programador) throws SQLException {
        return null;
    }

    private List<String> checkNulls(String cadena) {
        if (cadena == null) {
            return new ArrayList();
        } else
            return List.of(cadena.split(" "));
    }
}
