package es.maldonadomendoza.service;

import es.maldonadomendoza.dto.ProyectoDTO;
import es.maldonadomendoza.mapper.ProyectoMapper;
import es.maldonadomendoza.model.Proyecto;
import es.maldonadomendoza.repository.ProyectoRepository;

import java.sql.SQLException;
import java.util.List;

public class ProyectoService extends BaseService<Proyecto, Integer, ProyectoRepository> {
    ProyectoMapper mapper = new ProyectoMapper();

    public ProyectoService(ProyectoRepository repository) {
        super(repository);
    }

    public List<ProyectoDTO> getAllProyectos() throws SQLException {
        return mapper.toDTO(this.findAll());
    }

    public ProyectoDTO getProyectoById(Integer id) throws SQLException {
        return mapper.toDTO(this.getById(id));
    }

    public ProyectoDTO updateProyecto(ProyectoDTO proyectoDTO) throws SQLException {
        Proyecto pro = this.update(mapper.fromDTO(proyectoDTO));
        return mapper.toDTO(pro);
    }

    public ProyectoDTO deleteProyecto(ProyectoDTO proyectoDTO) throws SQLException {
        Proyecto pro = this.delete(mapper.fromDTO(proyectoDTO));
        return mapper.toDTO(pro);
    }
}
