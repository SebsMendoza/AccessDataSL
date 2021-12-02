package es.maldonadomendoza.dto;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class JefeDTO {
    private int idJefe;
    private int idProyecto;
    private int idProg;
    private int idIssue;

    public static JefeDTO fromJSON(String json) {
        final Gson gson = new Gson();
        return gson.fromJson(json, JefeDTO.class);
    }

    public String toJSON() {
        final Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
        return prettyGson.toJson(this);
    }
}
