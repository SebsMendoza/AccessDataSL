package es.maldonadomendoza.dto;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class EquipoDTO {
    private int id;
    private List<String> programadores;
    private List<String> proyectos;

    public static EquipoDTO fromJSON(String json) {
        final Gson gson = new Gson();
        return gson.fromJson(json, EquipoDTO.class);
    }

    public String toJSON() {
        final Gson prettyGson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        return prettyGson.toJson(this);
    }
}
