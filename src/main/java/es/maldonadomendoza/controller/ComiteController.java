package es.maldonadomendoza.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import es.maldonadomendoza.dto.ComiteDTO;
import es.maldonadomendoza.repository.ComiteRepository;
import es.maldonadomendoza.service.ComiteService;

import java.sql.SQLException;

public class ComiteController {
    private static ComiteController controller = null;

    private final ComiteService comiteService;

    public ComiteController(ComiteService comiteService){
        this.comiteService = comiteService;
    }
    public static ComiteController getInstance(){
        if(controller == null){
            controller = new ComiteController (new ComiteService(new ComiteRepository()));
        }
        return controller;
    }

    public String getAllCommitsJSON(){
        try{
            final Gson prettyGson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
            return prettyGson.toJson(comiteService.getAllComites());
        } catch (SQLException e){
            System.err.println("Error ComiteController en getAllComites: "+ e.getMessage());
            return "Error ComiteController en getAllComites "+ e.getMessage();
        }
    }
    public String getComiteByIdJSON(Integer id) {
        try {
            final Gson prettyGson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
            return prettyGson.toJson(comiteService.getComiteById(id));
        } catch (SQLException e) {
            System.err.println("Error IssueController en getIssueById: " + e.getMessage());
            return "Error IssueController en getIssueById: " + e.getMessage();
        }
    }
    public String updateIssueJSON(ComiteDTO comiteDTO) {
        try {
            final Gson prettyGson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
            return prettyGson.toJson(comiteService.updateComite(comiteDTO));
        } catch (SQLException e) {
            System.err.println("Error IssueController en updateIssue: " + e.getMessage());
            return "Error IssueController en updateIssue: " + e.getMessage();
        }
    }

    public String deleteIssue(ComiteDTO comiteDTO) {
        try {
            final Gson prettyGson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
            return prettyGson.toJson(comiteService.deleteComite(comiteDTO));
        } catch (SQLException e) {
            System.err.println("Error IssueController en deleteIssue: " + e.getMessage());
            return "Error IssueController en deleteIssue: " + e.getMessage();
        }
    }
}
