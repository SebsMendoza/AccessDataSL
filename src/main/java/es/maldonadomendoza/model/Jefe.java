package es.maldonadomendoza.model;

import java.util.Date;
import java.util.List;


public class Jefe extends Programador {
    private long idJefe;
    private long idProyecto;

    public Jefe(long id, long idDpt, List<Proyecto> proyectos, List<Issue> issues, long idJefe, long idProyecto) {
        super(id, idDpt, proyectos, issues);
        this.idJefe = idJefe;
        this.idProyecto = idProyecto;
    }

}


