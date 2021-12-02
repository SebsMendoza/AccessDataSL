package es.maldonadomendoza.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class Programador {
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

    public Programador(int id, int id_equipo, int id_dpt, List<String> id_commit, List<String> id_comite,
                       List<String> id_issue, String nombre, String experto, Date fecha_alta, double salario) {
    }
}
