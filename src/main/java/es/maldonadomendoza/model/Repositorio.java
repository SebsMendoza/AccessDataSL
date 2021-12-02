package es.maldonadomendoza.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class Repositorio {
    private int id;
    private Proyecto proyecto;
    private List<String> commits;
    private List<String> issues;
    private String nombre;
    private Date creacion;


    public Repositorio(int id, int id_proyecto, int id_commit, int id_isuue, String nombre, java.sql.Date fechaCreacion) {

    }
}
