package es.maldonadomendoza.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Commit {
    private long id;
    private long idProg;
    private long idProyecto;
    private String titulo;
    private String texto;
    private Date fecha;
    private Repositorio repositorio;
    private Issue Issues;
}
