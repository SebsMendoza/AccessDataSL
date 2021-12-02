package es.maldonadomendoza.dto;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import es.maldonadomendoza.model.Proyecto;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder
public class RepoDTO {
    private int id;
    private Proyecto proyecto;
    private List<String> commits;
    private List<String> issues;
    private String nombre;
    private Date creacion;

    public static RepoDTO fromJSON(String json) {
        final Gson gson = new Gson();
        return gson.fromJson(json, RepoDTO.class);
    }

    public String toJSON() {
        final Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
        return prettyGson.toJson(this);
    }
}
