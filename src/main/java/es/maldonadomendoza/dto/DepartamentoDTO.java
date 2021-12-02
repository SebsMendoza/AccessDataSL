package es.maldonadomendoza.dto;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class DepartamentoDTO {
    private int id;
    private int idJefeDpt;
    private String nombre;
    private double presupuesto;
    private List<String> finalizado;
    private List<String> activo;
    private List<String> historico;

    public static DepartamentoDTO fromJSON(String json) {
        final Gson gson = new Gson();
        return gson.fromJson(json, DepartamentoDTO.class);
    }

    public String toJSON() {
        final Gson prettyGson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        return prettyGson.toJson(this);
    }

}
