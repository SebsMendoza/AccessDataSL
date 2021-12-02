package es.maldonadomendoza.service;

import es.maldonadomendoza.dto.JefeDTO;
import es.maldonadomendoza.mapper.JefeMapper;
import es.maldonadomendoza.model.Jefe;
import es.maldonadomendoza.repository.JefeRepository;

import java.sql.SQLException;
import java.util.List;

public class JefeService extends BaseService<Jefe, Integer, JefeRepository> {
    JefeMapper mapper = new JefeMapper();

    public JefeService(JefeRepository repository) {
        super(repository);
    }

    public List<JefeDTO> getAllJefes() throws SQLException {
        return mapper.toDTO(this.findAll());
    }

    public JefeDTO getJefeById(Integer id) throws SQLException {
        return mapper.toDTO(this.getById(id));
    }

    public JefeDTO updateJefe(JefeDTO jefeDTO) throws SQLException {
        Jefe jf = this.update(mapper.fromDTO(jefeDTO));
        return mapper.toDTO(jf);
    }

    public JefeDTO deleteJefe(JefeDTO jefeDTO) throws SQLException {
        Jefe jf = this.delete(mapper.fromDTO(jefeDTO));
        return mapper.toDTO(jf);
    }
}
