package es.maldonadomendoza.service;

import es.maldonadomendoza.dto.DepartamentoDTO;
import es.maldonadomendoza.mapper.DepartamentoMapper;
import es.maldonadomendoza.model.Departamento;
import es.maldonadomendoza.repository.DepartamentoRepository;

import java.sql.SQLException;
import java.util.List;

public class DepartamentoService extends BaseService<Departamento, Integer, DepartamentoRepository> {
    DepartamentoMapper mapper = new DepartamentoMapper();

    public DepartamentoService(DepartamentoRepository repository) {
        super(repository);
    }

    public List<DepartamentoDTO> getAllDepartamentos() throws SQLException {
        return mapper.toDTO(this.findAll());
    }

    public DepartamentoDTO getDepartamentoById(Integer id) throws SQLException {
        return mapper.toDTO(this.getById(id));
    }

    public DepartamentoDTO updateDepartamento(DepartamentoDTO DepartamentoDTO) throws SQLException {
        Departamento re = this.update(mapper.fromDTO(DepartamentoDTO));
        return mapper.toDTO(re);
    }

    public DepartamentoDTO deleteDepartamento(DepartamentoDTO departamentoDTO) throws SQLException {
        Departamento re = this.delete(mapper.fromDTO(departamentoDTO));
        return mapper.toDTO(re);
    }
}
