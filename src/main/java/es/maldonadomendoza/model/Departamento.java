package es.maldonadomendoza.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Departamento {
    private long id;
    private long idJefeDpt;
    private String nombre;
    private double presupuesto;
    private List<String> finalizado;
    private List<String> activo;
    private List<String> historico;

    public Departamento(int id, int id_jefe, String nombre, double presupuesto) {

    }
}
