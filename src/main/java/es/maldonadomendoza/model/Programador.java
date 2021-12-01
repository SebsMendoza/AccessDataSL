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
}
