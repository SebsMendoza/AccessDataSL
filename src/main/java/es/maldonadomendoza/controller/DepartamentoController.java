package es.maldonadomendoza.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import es.maldonadomendoza.dto.DepartamentoDTO;
import es.maldonadomendoza.repository.DepartamentoRepository;
import es.maldonadomendoza.service.DepartamentoService;

import java.sql.SQLException;

public class DepartamentoController {
    private static DepartamentoController controller = null;

    private final DepartamentoService departamentoService;

    public DepartamentoController(DepartamentoService departamentoService) {
        this.departamentoService = departamentoService;
    }

    public static DepartamentoController getInstance() {
        if (controller == null) {
            controller = new DepartamentoController(new DepartamentoService(new DepartamentoRepository()));
        }
        return controller;
    }

    public String getAllDepartamentosJSON() {
        try {
            final Gson prettyGson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
            return prettyGson.toJson(departamentoService.getAllDepartamentos());
        } catch (SQLException e) {
            System.err.println("Error DepartamentoController en getAllDepartamento: " + e.getMessage());
            return "Error DepartamentoController en getAllIssues: " + e.getMessage();
        }
    }

    public String getDepartamentoByIdJSON(Integer id) {
        try {
            final Gson prettyGson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
            return prettyGson.toJson(departamentoService.getDepartamentoById(id));
        } catch (SQLException e) {
            System.err.println("Error DepartamentoController en getDepartamentoById: " + e.getMessage());
            return "Error DepartamentoController en getDepartamentoById: " + e.getMessage();
        }
    }

    public String updateDepartamentoJSON(DepartamentoDTO departamentoDTO) {
        try {
            final Gson prettyGson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
            return prettyGson.toJson(departamentoService.updateDepartamento(departamentoDTO));
        } catch (SQLException e) {
            System.err.println("Error DepartamentoController en updateDepartamento: " + e.getMessage());
            return "Error DepartamentoController en updateDepartamento: " + e.getMessage();
        }
    }

    public String deleteDepartamento(DepartamentoDTO departamentoDTO) {
        try {
            final Gson prettyGson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
            return prettyGson.toJson(departamentoService.deleteDepartamento(departamentoDTO));
        } catch (SQLException e) {
            System.err.println("Error DepartamentoController en deleteDepartamento: " + e.getMessage());
            return "Error DepartamentoController en deleteDepartamento: " + e.getMessage();
        }
    }
}
