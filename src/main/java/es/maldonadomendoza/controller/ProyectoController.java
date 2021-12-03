package es.maldonadomendoza.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import es.maldonadomendoza.dto.ProyectoDTO;
import es.maldonadomendoza.repository.ProyectoRepository;
import es.maldonadomendoza.service.ProyectoService;

import java.sql.SQLException;

public class ProyectoController {
    private static ProyectoController controller = null;

    private final ProyectoService proyectoService;

    public ProyectoController(ProyectoService proyectoService) {
        this.proyectoService = proyectoService;
    }

    public static ProyectoController getInstance() {
        if (controller == null) {
            controller = new ProyectoController(new ProyectoService(new ProyectoRepository()));
        }
        return controller;
    }

    public String getAllProyectosJSON() {
        try {
            final Gson prettyGson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
            return prettyGson.toJson(proyectoService.getAllProyectos());
        } catch (SQLException e) {
            System.err.println("Error IssueController en getAllProyectos: " + e.getMessage());
            return "Error IssueController en getAllProyectos: " + e.getMessage();
        }
    }

    public String getProyectoByIdJSON(Integer id) {
        try {
            final Gson prettyGson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
            return prettyGson.toJson(proyectoService.getProyectoById(id));
        } catch (SQLException e) {
            System.err.println("Error IssueController en getProyectoById: " + e.getMessage());
            return "Error IssueController en getProyectoById: " + e.getMessage();
        }
    }

    public String updateProyectoJSON(ProyectoDTO proyectoDTO) {
        try {
            final Gson prettyGson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
            return prettyGson.toJson(proyectoService.updateProyecto(proyectoDTO));
        } catch (SQLException e) {
            System.err.println("Error IssueController en updateProyecto: " + e.getMessage());
            return "Error IssueController en updateProyecto: " + e.getMessage();
        }
    }

    public String deleteProyecto(ProyectoDTO proyectoDTO) {
        try {
            final Gson prettyGson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
            return prettyGson.toJson(proyectoService.deleteProyecto(proyectoDTO));
        } catch (SQLException e) {
            System.err.println("Error IssueController en deleteProyecto: " + e.getMessage());
            return "Error IssueController en deleteProyecto: " + e.getMessage();
        }
    }
}
