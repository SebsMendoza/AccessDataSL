package es.maldonadomendoza.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class Jefe {
    private int idJefe;
    private int idProyecto;
    private int idProg;
    private int idIssue;

    public Jefe(int id, int id_proyecto, int id_prog, List<String> id_issue) {

    }
}


