package repository;

import es.maldonadomendoza.model.Programador;

import java.sql.SQLException;
import java.util.List;

public class ProgRepository implements CrudRepository<Programador, Long> {
    @Override
    public List<Programador> findAll() throws SQLException {
        return null;
    }

    @Override
    public Programador getById(Long aLong) throws SQLException {
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
}
