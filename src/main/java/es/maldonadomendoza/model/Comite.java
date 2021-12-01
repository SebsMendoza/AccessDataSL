package es.maldonadomendoza.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Comite {
    private long id;
    private List<String> programadores;
    private Issue issues;

    public Comite(int id, List<String> id_prog, int id_issue) {

    }
}
