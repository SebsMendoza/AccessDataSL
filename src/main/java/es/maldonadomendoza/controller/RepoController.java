package es.maldonadomendoza.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import es.maldonadomendoza.dto.RepoDTO;
import es.maldonadomendoza.repository.RepoRepository;
import es.maldonadomendoza.service.RepoService;

import java.sql.SQLException;

public class RepoController {
    private static RepoController controller = null;

    private final RepoService repoService;

    public RepoController(RepoService repoService) {
        this.repoService = repoService;
    }

    public static RepoController getInstance() {
        if (controller == null) {
            controller = new RepoController(new RepoService(new RepoRepository()));
        }
        return controller;
    }

    public String getAllReposJSON() {
        try {
            final Gson prettyGson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
            return prettyGson.toJson(repoService.getAllRepos());
        } catch (SQLException e) {
            System.err.println("Error IssueController en getAllRepos: " + e.getMessage());
            return "Error IssueController en getAllRepos: " + e.getMessage();
        }
    }

    public String getRepoByIdJSON(Integer id) {
        try {
            final Gson prettyGson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
            return prettyGson.toJson(repoService.getRepoById(id));
        } catch (SQLException e) {
            System.err.println("Error IssueController en getRepoById: " + e.getMessage());
            return "Error IssueController en getRepoById: " + e.getMessage();
        }
    }

    public String updateRepoJSON(RepoDTO repoDTO) {
        try {
            final Gson prettyGson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
            return prettyGson.toJson(repoService.updateRepo(repoDTO));
        } catch (SQLException e) {
            System.err.println("Error IssueController en updateRepo: " + e.getMessage());
            return "Error IssueController en updateRepo: " + e.getMessage();
        }
    }

    public String deleteRepo(RepoDTO repoDTO) {
        try {
            final Gson prettyGson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
            return prettyGson.toJson(repoService.deleteRepo(repoDTO));
        } catch (SQLException e) {
            System.err.println("Error IssueController en deleteRepo: " + e.getMessage());
            return "Error IssueController en deleteRepo: " + e.getMessage();
        }
    }
}
