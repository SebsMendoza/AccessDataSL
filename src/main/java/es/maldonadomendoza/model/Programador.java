package es.maldonadomendoza.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class Programador {
    private long id;
    private long idDpt;
    private long idEquipo;
    private long idComite;
    private String nombre;
    private String experto;
    private Date alta;
    private double salario;
    private String password;
    private List<String> proyectos;
    private List<String> commits;
    private List<String> issues;
    private List<String> conocimientos;

    public Programador(int id, int id_equipo, int id_dpt, List<String> id_commit, List<String> id_comite,
                       List<String> id_issue, String nombre, String experto, Date fecha_alta, double salario) {
    }
}
