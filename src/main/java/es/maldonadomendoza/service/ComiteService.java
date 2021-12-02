package es.maldonadomendoza.service;

import es.maldonadomendoza.dto.ComiteDTO;
import es.maldonadomendoza.mapper.ComiteMapper;
import es.maldonadomendoza.model.Comite;
import es.maldonadomendoza.model.Repositorio;
import es.maldonadomendoza.repository.ComiteRepository;

import java.sql.SQLException;
import java.util.List;

public class ComiteService extends BaseService<Comite, Integer, ComiteRepository> {
    ComiteMapper mapper = new ComiteMapper();

    public ComiteService(ComiteRepository repository) {
        super(repository);
    }

    public List<ComiteDTO> getAllComites() throws SQLException {
        return mapper.toDTO(this.findAll());
    }

    public ComiteDTO getComiteById(Integer id) throws SQLException {
        return mapper.toDTO(this.getById(id));
    }

    public ComiteDTO updateComite(ComiteDTO comiteDTO) throws
            SQLException {
        Comite re = this.update(mapper.fromDTO(comiteDTO));
        return mapper.toDTO(re);
    }

    public ComiteDTO deleteComite(ComiteDTO comiteDTO) throws SQLException {
        Comite re = this.delete(mapper.fromDTO(comiteDTO));
        return mapper.toDTO(re);
    }
}



