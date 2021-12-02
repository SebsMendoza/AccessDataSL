package es.maldonadomendoza.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class Departamento {
    private int id;
    private int idJefeDpt;
    private String nombre;
    private double presupuesto;
    private List<String> finalizado;
    private List<String> activo;
    private List<String> historico;

    public Departamento(int id, int id_jefe, String nombre, double presupuesto) {

    }
}
