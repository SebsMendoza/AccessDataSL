package es.maldonadomendoza.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class Repositorio {
    private long id;
    private String nombre;
    private Date creacion;
    private Proyecto proyecto;
    private List<String> commits;
    private List<String> issues;
}
