package es.maldonadomendoza.service;

import es.maldonadomendoza.repository.CrudRepository;
import lombok.RequiredArgsConstructor;

import java.sql.SQLException;
import java.util.List;

@RequiredArgsConstructor
public abstract class BaseService<T, Integer, R extends CrudRepository<T, Integer>> {
    protected final R repository;

    public List<T> findAll() throws SQLException {
        return repository.findAll();
    }

    public T getById(java.lang.Integer id) throws SQLException {
        return repository.getById((Integer) id);
    }

    public T save(T t) throws SQLException {
        return repository.save(t);
    }

    public T update(T t) throws SQLException {
        return repository.update(t);
    }

    public T delete(T t) throws SQLException {
        return repository.delete(t);
    }
}
