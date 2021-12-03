package es.maldonadomendoza.service;

import es.maldonadomendoza.dto.RepoDTO;
import es.maldonadomendoza.mapper.RepoMapper;
import es.maldonadomendoza.model.Repositorio;
import es.maldonadomendoza.repository.RepoRepository;

import java.sql.SQLException;
import java.util.List;

public class RepoService extends BaseService<Repositorio, Integer, RepoRepository> {
    RepoMapper mapper = new RepoMapper();

    public RepoService(RepoRepository repository) {
        super(repository);
    }

    public List<RepoDTO> getAllRepos() throws SQLException {
        return mapper.toDTO(this.findAll());
    }

    public RepoDTO getRepoById(Integer id) throws SQLException {
        return mapper.toDTO(this.getById(id));
    }

    public RepoDTO updateRepo(RepoDTO repoDTO) throws SQLException {
        Repositorio re = this.update(mapper.fromDTO(repoDTO));
        return mapper.toDTO(re);
    }

    public RepoDTO deleteRepo(RepoDTO repoDTO) throws SQLException {
        Repositorio re = this.delete(mapper.fromDTO(repoDTO));
        return mapper.toDTO(re);
    }
}
