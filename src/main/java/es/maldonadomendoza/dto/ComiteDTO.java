package es.maldonadomendoza.dto;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import es.maldonadomendoza.model.Issue;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ComiteDTO {
    private int id;
    private List<String> programadores;
    private Issue issues;

    public static ComiteDTO fromJSON(String json) {
        final Gson gson = new Gson();
        return gson.fromJson(json, ComiteDTO.class);
    }

    public String toJSON() {
        final Gson prettyGson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        return prettyGson.toJson(this);
    }
}
