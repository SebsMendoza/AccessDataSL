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
    private List<String> equipos;
    private long idDpt;
    private List<String> repositorios;
    private String nombre;
    private double presupuesto;
    private Date fechaInicio;
    private Date fechaFin;
    private List<String> tecnologias;

}
