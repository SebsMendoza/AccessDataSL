package es.maldonadomendoza.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import es.maldonadomendoza.dto.CommitDTO;
import es.maldonadomendoza.repository.CommitRepository;
import es.maldonadomendoza.service.CommitService;

import java.sql.SQLException;

public class CommitController {
    private static CommitController controller = null;

    private final CommitService commitService;

    public CommitController(CommitService commitService) {
        this.commitService = commitService;
    }

    public static CommitController getInstance() {
        if (controller == null) {
            controller = new CommitController(new CommitService(new CommitRepository()));
        }
        return controller;
    }

    public String getAllCommitsJSON() {
        try {
            final Gson prettyGson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
            return prettyGson.toJson(commitService.getAllCommits());
        } catch (SQLException e) {
            System.err.println("Error IssueController en getAllIssues: " + e.getMessage());
            return "Error IssueController en getAllIssues: " + e.getMessage();
        }
    }

    public String getCommitByIdJSON(Integer id) {
        try {
            final Gson prettyGson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
            return prettyGson.toJson(commitService.getCommitById(id));
        } catch (SQLException e) {
            System.err.println("Error IssueController en getIssueById: " + e.getMessage());
            return "Error IssueController en getIssueById: " + e.getMessage();
        }
    }

    public String updateCommitJSON(CommitDTO commitDTO) {
        try {
            final Gson prettyGson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
            return prettyGson.toJson(commitService.updateCommit(commitDTO));
        } catch (SQLException e) {
            System.err.println("Error IssueController en updateIssue: " + e.getMessage());
            return "Error IssueController en updateIssue: " + e.getMessage();
        }
    }

    public String deleteCommitJSON(CommitDTO commitDTO) {
        try {
            final Gson prettyGson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
            return prettyGson.toJson(commitService.deleteCommit(commitDTO));
        } catch (SQLException e) {
            System.err.println("Error IssueController en deleteIssue: " + e.getMessage());
            return "Error IssueController en deleteIssue: " + e.getMessage();
        }
    }
}
