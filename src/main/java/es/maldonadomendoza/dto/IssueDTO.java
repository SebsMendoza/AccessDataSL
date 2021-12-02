package es.maldonadomendoza.dto;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import es.maldonadomendoza.model.Comite;
import es.maldonadomendoza.model.Repositorio;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder
public class IssueDTO {
    private int id;
    private int idJefe;
    private List<String> commits;
    private Repositorio repositorio;
    private Comite programadores;
    private String titulo;
    private String texto;
    private Date fecha;
    private boolean estado;
    private Repositorio proyecto;

    public static IssueDTO fromJSON(String json) {
        final Gson gson = new Gson();
        return gson.fromJson(json, IssueDTO.class);
    }

    public String toJSON() {
        final Gson prettyGson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        return prettyGson.toJson(this);
    }
}
