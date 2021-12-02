package es.maldonadomendoza.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class Commit {
    private int id;
    private int idProg;
    private Repositorio repositorio;
    private int idProyecto;
    private Issue Issues;
    private String titulo;
    private String texto;
    private Date fecha;

    public Commit(int id, int id_prog, int repo, int id_proyecto, int id_issue, String titulo, List<String> texto, LocalDate fecha) {

    }
}
