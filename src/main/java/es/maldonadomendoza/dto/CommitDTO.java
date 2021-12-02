package es.maldonadomendoza.dto;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import es.maldonadomendoza.model.Issue;
import es.maldonadomendoza.model.Repositorio;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class CommitDTO {
        private int id;
        private int idProg;
        private Repositorio repositorio;
        private int idProyecto;
        private Issue Issues;
        private String titulo;
        private String texto;
        private Date fecha;

    public static CommitDTO fromJSON(String json) {
        final Gson gson = new Gson();
        return gson.fromJson(json, CommitDTO.class);
    }

    public String toJSON() {
        final Gson prettyGson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        return prettyGson.toJson(this);
    }
}
