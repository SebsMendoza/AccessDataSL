package es.maldonadomendoza.service;

import es.maldonadomendoza.dto.CommitDTO;
import es.maldonadomendoza.mapper.CommitMapper;
import es.maldonadomendoza.model.Commit;
import es.maldonadomendoza.repository.CommitRepository;

import java.sql.SQLException;
import java.util.List;

public class CommitService extends BaseService<Commit, Integer, CommitRepository> {
    CommitMapper mapper = new CommitMapper();

    public CommitService(CommitRepository repository) {
        super(repository);
    }

    public List<CommitDTO> getAllCommits() throws SQLException {
        return mapper.toDTO(this.findAll());
    }

    public CommitDTO getCommitById(Integer id) throws SQLException {
        return mapper.toDTO(this.getById(id));
    }

    public CommitDTO updateCommit(CommitDTO commitDTO) throws SQLException {
        Commit re = this.update(mapper.fromDTO(commitDTO));
        return mapper.toDTO(re);
    }

    public CommitDTO deleteCommit(CommitDTO commitDTO) throws SQLException {
        Commit re = this.delete(mapper.fromDTO(commitDTO));
        return mapper.toDTO(re);
    }
}
