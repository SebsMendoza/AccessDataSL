package es.maldonadomendoza.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import es.maldonadomendoza.dto.EquipoDTO;
import es.maldonadomendoza.repository.EquipoRepository;
import es.maldonadomendoza.service.EquipoService;

import java.sql.SQLException;

public class EquipoController {
    private static EquipoController controller = null;

    private final EquipoService equipoService;

    public EquipoController(EquipoService equipoService) {
        this.equipoService = equipoService;
    }

    public static EquipoController getInstance() {
        if (controller == null) {
            controller = new EquipoController(new EquipoService(new EquipoRepository()));
        }
        return controller;
    }

    public String getAllEquiposJSON() {
        try {
            final Gson prettyGson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
            return prettyGson.toJson(equipoService.getAllEquipos());
        } catch (SQLException e) {
            System.err.println("Error EquipoController en getAllEquipos: " + e.getMessage());
            return "Error EquipoController en getAllEquipos: " + e.getMessage();
        }
    }

    public String getEquipoByIdJSON(Integer id) {
        try {
            final Gson prettyGson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
            return prettyGson.toJson(equipoService.getEquipoById(id));
        } catch (SQLException e) {
            System.err.println("Error EquipoController en getEquipoById: " + e.getMessage());
            return "Error EquipoController en getEquipoById: " + e.getMessage();
        }
    }

    public String updateEquipoJSON(EquipoDTO equipoDTO) {
        try {
            final Gson prettyGson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
            return prettyGson.toJson(equipoService.updateEquipo(equipoDTO));
        } catch (SQLException e) {
            System.err.println("Error EquipoController en updateEquipo: " + e.getMessage());
            return "Error EquipoController en updateEquipo: " + e.getMessage();
        }
    }

    public String deleteEquipoJSON(EquipoDTO equipoDTO) {
        try {
            final Gson prettyGson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
            return prettyGson.toJson(equipoService.deleteEquipo(equipoDTO));
        } catch (SQLException e) {
            System.err.println("Error EquipoController en deleteIssue: " + e.getMessage());
            return "Error EquipoController en deleteIssue: " + e.getMessage();
        }
    }
}
