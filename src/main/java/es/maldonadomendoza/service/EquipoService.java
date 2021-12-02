package es.maldonadomendoza.service;

import es.maldonadomendoza.dto.EquipoDTO;
import es.maldonadomendoza.mapper.EquipoMapper;
import es.maldonadomendoza.model.Equipo;
import es.maldonadomendoza.repository.EquipoRepository;

import java.sql.SQLException;
import java.util.List;

public class EquipoService extends BaseService<Equipo, Integer, EquipoRepository> {
    EquipoMapper mapper = new EquipoMapper();

    public EquipoService(EquipoRepository repository) {
        super(repository);
    }

    public List<EquipoDTO> getAllEquipos() throws SQLException {
        return mapper.toDTO(this.findAll());
    }

    public EquipoDTO getEquipoById(Integer id) throws SQLException {
        return mapper.toDTO(this.getById(id));
    }

    public EquipoDTO updateEquipo(EquipoDTO equipoDTO) throws SQLException {
        Equipo eq = this.update(mapper.fromDTO(equipoDTO));
        return mapper.toDTO(eq);
    }

    public EquipoDTO deleteEquipo(EquipoDTO equipoDTO) throws SQLException {
        Equipo eq = this.delete(mapper.fromDTO(equipoDTO));
        return mapper.toDTO(eq);
    }
}

