package es.maldonadomendoza.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class Proyecto {
    private int id;
    private int idJefe;
    private List<String> equipos;
    private int idDpt;
    private List<String> repositorios;
    private String nombre;
    private double presupuesto;
    private Date fechaInicio;
    private Date fechaFin;
    private List<String> tecnologias;

    public Proyecto(int id, int id_jefe, int id_dpt, int id_repo, String nombre, double presupuesto, java.sql.Date fecha_ini, java.sql.Date fecha_fin, String tecnologias) {

    }
}
