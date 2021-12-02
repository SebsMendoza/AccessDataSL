package es.maldonadomendoza.dto;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder
public class ProyectoDTO {
    private int id;
    private int idJefe;
    private List<String> equipos;
    private int idDpt;
    private List<String> repositorios;
    private String nombre;
    private double presupuesto;
    private Date fechaInicio;
    private Date fechaFin;
    private List<String> tecnologias;

    public static ProyectoDTO fromJSON(String json) {
        final Gson gson = new Gson();
        return gson.fromJson(json, ProyectoDTO.class);
    }

    public String toJSON() {
        final Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
        return prettyGson.toJson(this);
    }
}
