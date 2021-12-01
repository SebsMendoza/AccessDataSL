package es.maldonadomendoza.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class Issue {
    private long id;
    private long idJefe;
    private String titulo;
    private String texto;
    private Date fecha;
    private boolean estado;
    private Repositorio repositorio;
    private Comite programadores;
    private Repositorio proyecto;
    private List<String> commits;
}
