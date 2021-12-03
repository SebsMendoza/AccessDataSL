package es.maldonadomendoza.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import es.maldonadomendoza.dto.JefeDTO;
import es.maldonadomendoza.repository.JefeRepository;
import es.maldonadomendoza.service.JefeService;

import java.sql.SQLException;

public class JefeController {
    private static JefeController controller = null;

    private final JefeService jefeService;

    public JefeController(JefeService jefeService) {
        this.jefeService = jefeService;
    }

    public static JefeController getInstance() {
        if (controller == null) {
            controller = new JefeController(new JefeService(new JefeRepository()));
        }
        return controller;
    }

    public String getAllJefesJSON() {
        try {
            final Gson prettyGson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
            return prettyGson.toJson(jefeService.getAllJefes());
        } catch (SQLException e) {
            System.err.println("Error IssueController en getAllJefes: " + e.getMessage());
            return "Error IssueController en getAllJefes: " + e.getMessage();
        }
    }

    public String getJefeByIdJSON(Integer id) {
        try {
            final Gson prettyGson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
            return prettyGson.toJson(jefeService.getJefeById(id));
        } catch (SQLException e) {
            System.err.println("Error IssueController en getJefeById: " + e.getMessage());
            return "Error IssueController en getJefeById: " + e.getMessage();
        }
    }

    public String updateJefeJSON(JefeDTO jefeDTO) {
        try {
            final Gson prettyGson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
            return prettyGson.toJson(jefeService.updateJefe(jefeDTO));
        } catch (SQLException e) {
            System.err.println("Error IssueController en updateJefe: " + e.getMessage());
            return "Error IssueController en updateJefe: " + e.getMessage();
        }
    }

    public String deleteJefe(JefeDTO jefeDTO) {
        try {
            final Gson prettyGson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
            return prettyGson.toJson(jefeService.deleteJefe(jefeDTO));
        } catch (SQLException e) {
            System.err.println("Error IssueController en deleteJefe: " + e.getMessage());
            return "Error IssueController en deleteJefe: " + e.getMessage();
        }
    }
}
