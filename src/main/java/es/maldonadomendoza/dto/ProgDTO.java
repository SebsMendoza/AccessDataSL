package es.maldonadomendoza.dto;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Date;
import java.util.List;

public class ProgDTO {
    ExclusionStrategy strategy = new ExclusionStrategy() {
        @Override
        public boolean shouldSkipField(FieldAttributes field) {
            return field.getName().startsWith("password");
        }

        @Override
        public boolean shouldSkipClass(Class<?> aClass) {
            return false;
        }
    };
    private int id;
    private int idEquipo;
    private int idDpt;
    private int idComite;
    private List<String> commits;
    private List<String> issues;
    private String nombre;
    private String password;
    private String experto;
    private Date fecha_alta;
    private double salario;
    private List<String> proyectos;

    public static ProgDTO fromJSON(String json) {
        final Gson gson = new Gson();
        return gson.fromJson(json, ProgDTO.class);
    }

    public String toJSON() {
        final Gson prettyGson = new GsonBuilder()
                .addDeserializationExclusionStrategy(strategy)
                .setPrettyPrinting()
                .create();
        return prettyGson.toJson(this);
    }
}
