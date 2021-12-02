package es.maldonadomendoza.service;

import es.maldonadomendoza.dto.ProgDTO;
import es.maldonadomendoza.mapper.ProgMapper;
import es.maldonadomendoza.model.Programador;
import es.maldonadomendoza.repository.ProgRepository;

import java.sql.SQLException;
import java.util.List;

public class ProgService extends BaseService<Programador, Integer, ProgRepository> {
    ProgMapper mapper = new ProgMapper();

    public ProgService(ProgRepository repository) {
        super(repository);
    }

    public List<ProgDTO> getAllProg() throws SQLException {
        return mapper.toDTO(this.findAll());
    }

    public ProgDTO getProgById(Integer id) throws SQLException {
        return mapper.toDTO(this.getById(id));
    }

    public ProgDTO updateProg(ProgDTO progDTO) throws SQLException {
        Programador pro = this.update(mapper.fromDTO(progDTO));
        return mapper.toDTO(pro);
    }

    public ProgDTO deleteProg(ProgDTO progDTO) throws SQLException {
        Programador pro = this.delete(mapper.fromDTO(progDTO));
        return mapper.toDTO(pro);
    }
}
