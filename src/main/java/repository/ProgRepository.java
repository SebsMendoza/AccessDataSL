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
        public List<Programador> findAll() throws SQLException {
            String query = "SELECT * FROM programador";
            DataBaseController db = DataBaseController.getInstance();
            db.open();
            ResultSet result = db.select(query).orElseThrow(()-> new SQLException("Error ProgRepository al consultar " +
                    "registros de Programador"));
            ArrayList<Programador> list = new ArrayList<Programador>();
            while (result.next()) {
                list.add(
                        new Programador(
                                result.getInt("id"),
                                result.getInt("id_equipo"),
                                result.getInt("id_dpt"),
                                
                        )
                )
            }
        }
        return null;
    }

    @Override
    public Programador getById(Integer integer) throws SQLException {
        return null;
    }

    @Override
    public Programador save(Programador programador) throws SQLException {
        return null;
    }

    @Override
    public Programador update(Programador programador) throws SQLException {
        return null;
    }

    @Override
    public Programador delete(Programador programador) throws SQLException {
        return null;
    }
    private List<String> comprobarNulosLectura(String cadena){
        if(cadena==null){
            return new ArrayList();
        }else
            return List.of(cadena.split(" "));
    }
}
