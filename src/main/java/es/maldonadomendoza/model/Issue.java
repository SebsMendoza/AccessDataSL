package es.maldonadomendoza.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class Issue {
    private int id;
    private int idJefe;
    private List<String> commits;
    private Repositorio repositorio;
    private Comite programadores;
    private String titulo;
    private String texto;
    private Date fecha;
    private boolean estado;
    private Repositorio proyecto;

    public Issue(int id, int id_jefe, int id_commit, int id_repo, int id_comite, String titulo, List<String> texto, Date fecha, boolean estado) {
    }

}
