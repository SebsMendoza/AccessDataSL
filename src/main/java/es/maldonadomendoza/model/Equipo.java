package es.maldonadomendoza.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Equipo {
    private long id;
    private List<String> programadores;
    private List<String> proyectos;
}
