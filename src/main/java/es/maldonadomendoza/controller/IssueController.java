package es.maldonadomendoza.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import es.maldonadomendoza.dto.IssueDTO;
import es.maldonadomendoza.repository.IssueRepository;
import es.maldonadomendoza.service.IssueService;

import java.sql.SQLException;

public class IssueController {
    private static IssueController controller = null;

    private final IssueService issueService;

    public IssueController(IssueService issueService) {
        this.issueService = issueService;
    }

    public static IssueController getInstance() {
        if (controller == null) {
            controller = new IssueController(new IssueService(new IssueRepository()));
        }
        return controller;
    }

    public String getAllIssuesJSON() {
        try {
            final Gson prettyGson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
            return prettyGson.toJson(issueService.getAllIssues());
        } catch (SQLException e) {
            System.err.println("Error IssueController en getAllIssues: " + e.getMessage());
            return "Error IssueController en getAllIssues: " + e.getMessage();
        }
    }

    public String getIssueByIdJSON(Integer id) {
        try {
            final Gson prettyGson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
            return prettyGson.toJson(issueService.getIssueById(id));
        } catch (SQLException e) {
            System.err.println("Error IssueController en getIssueById: " + e.getMessage());
            return "Error IssueController en getIssueById: " + e.getMessage();
        }
    }

    public String updateIssueJSON(IssueDTO issueDTO) {
        try {
            final Gson prettyGson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
            return prettyGson.toJson(issueService.updateIssue(issueDTO));
        } catch (SQLException e) {
            System.err.println("Error IssueController en updateIssue: " + e.getMessage());
            return "Error IssueController en updateIssue: " + e.getMessage();
        }
    }

    public String deleteIssueJSON(IssueDTO issueDTO) {
        try {
            final Gson prettyGson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
            return prettyGson.toJson(issueService.deleteIssue(issueDTO));
        } catch (SQLException e) {
            System.err.println("Error IssueController en deleteIssue: " + e.getMessage());
            return "Error IssueController en deleteIssue: " + e.getMessage();
        }
    }
}
