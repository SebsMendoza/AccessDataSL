package es.maldonadomendoza.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class Proyecto {
    private long id;
    private long idJefe;
    private long idDpt;
    private String nombre;
    private double presupuesto;
    private Date fechaInicio;
    private Date fechaFin;
    private List<String> tecnologias;
    private List<String> equipos;
    private List<String> repositorios;
}
