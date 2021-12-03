package es.maldonadomendoza.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class Jefe {
    private int idJefe;
    private int idProyecto;
    private int idProg;
    private int idIssue;

    public Jefe(int id, int id_proyecto, int id_prog, List<String> id_issue) {

    }
}


