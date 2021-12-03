package es.maldonadomendoza.controller;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import es.maldonadomendoza.dto.ProgDTO;
import es.maldonadomendoza.repository.ProgRepository;
import es.maldonadomendoza.service.ProgService;

import java.sql.SQLException;

public class ProgController {
    private static ProgController controller = null;

    private final ProgService progService;

    ExclusionStrategy strategy = new ExclusionStrategy() {
        @Override
        public boolean shouldSkipClass(Class<?> clazz) {
            return false;
        }

        @Override
        public boolean shouldSkipField(FieldAttributes field) {
            return field.getName().startsWith("password");
        }
    };

    public ProgController(ProgService progService) {
        this.progService = progService;
    }

    public static ProgController getInstance() {
        if (controller == null) {
            controller = new ProgController(new ProgService(new ProgRepository()));
        }
        return controller;
    }

    public String getAllProgJSON() {
        try {
            final Gson prettyGson = new GsonBuilder()
                    .addSerializationExclusionStrategy(strategy)
                    .setPrettyPrinting()
                    .create();
            return prettyGson.toJson(progService.getAllProg());
        } catch (Exception e) {
            System.err.println("Error ProgController en getAllProg: " + e.getMessage());
            return "Error ProgController en getAllProg: " + e.getMessage();
        }
    }

    public String getProgByIdJSON(Integer id) {
        try {
            final Gson prettyGson = new GsonBuilder()
                    .addSerializationExclusionStrategy(strategy)
                    .setPrettyPrinting()
                    .create();
            return prettyGson.toJson(progService.getProgById(id));
        } catch (SQLException e) {
            System.err.println("Error IssueController en getProgById: " + e.getMessage());
            return "Error IssueController en getProgById: " + e.getMessage();
        }
    }

    public String updateProgJSON(ProgDTO progDTO) {
        try {
            final Gson prettyGson = new GsonBuilder()
                    .addSerializationExclusionStrategy(strategy)
                    .setPrettyPrinting()
                    .create();
            return prettyGson.toJson(progService.updateProg(progDTO));
        } catch (SQLException e) {
            System.err.println("Error IssueController en updateProg: " + e.getMessage());
            return "Error IssueController en updateProg: " + e.getMessage();
        }
    }

    public String deleteProg(ProgDTO progDTO) {
        try {
            final Gson prettyGson = new GsonBuilder()
                    .addSerializationExclusionStrategy(strategy)
                    .setPrettyPrinting()
                    .create();
            return prettyGson.toJson(progService.deleteProg(progDTO));
        } catch (SQLException e) {
            System.err.println("Error IssueController en deleteProg: " + e.getMessage());
            return "Error IssueController en deleteProg: " + e.getMessage();
        }
    }
}
