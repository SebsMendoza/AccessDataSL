package es.maldonadomendoza.service;

import es.maldonadomendoza.dto.IssueDTO;
import es.maldonadomendoza.mapper.IssueMapper;
import es.maldonadomendoza.model.Issue;
import es.maldonadomendoza.repository.IssueRepository;

import java.sql.SQLException;
import java.util.List;

public class IssueService extends BaseService<Issue, Integer, IssueRepository> {
    IssueMapper mapper = new IssueMapper();

    public IssueService(IssueRepository repository) {
        super(repository);
    }

    public List<IssueDTO> getAllIssues() throws SQLException {
        return mapper.toDTO(this.findAll());
    }

    public IssueDTO getIssueById(Integer id) throws SQLException {
        return mapper.toDTO(this.getById(id));
    }

    public IssueDTO updateIssue(IssueDTO issueDTO) throws SQLException {
        Issue is = this.update(mapper.fromDTO(issueDTO));
        return mapper.toDTO(is);
    }

    public IssueDTO deleteIssue(IssueDTO issueDTO) throws SQLException {
        Issue is = this.delete(mapper.fromDTO(issueDTO));
        return mapper.toDTO(is);
    }
}
