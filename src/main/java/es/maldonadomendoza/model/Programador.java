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
    private long idEquipo;
    private long idDpt;
    private long idComite;
    private List<String> commits;
    private List<String> issues;
    private String nombre;
    private String password;
    private String experto;
    private Date fecha_alta;
    private double salario;
    private List<String> proyectos;
    private List<String> expertos;
}
