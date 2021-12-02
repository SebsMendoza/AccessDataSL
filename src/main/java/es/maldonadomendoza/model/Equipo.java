package es.maldonadomendoza.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class Equipo {
    private int id;
    private List<String> programadores;
    private List<String> proyectos;


}
