package es.maldonadomendoza.model;

import java.util.Date;
import java.util.List;



public class Jefe extends Programador {
    private long id;
    private String nombre;
    private long idProyecto;
    private List<Issue> Issues;

    public Jefe(long id, String nombre, Date fecha_alta, long idDpt, long idComite, List<Proyecto> proyectos, List<Commit> commits, List<Issue> issues, List<String> conocimientos, double salario) {
        super(id, nombre, fecha_alta, idDpt, idComite, proyectos, commits, issues, conocimientos, salario);
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(long idProyecto) {
        this.idProyecto = idProyecto;
    }

    @Override
    public List<Issue> getIssues() {
        return Issues;
    }

    @Override
    public void setIssues(List<Issue> issues) {
        Issues = issues;
    }
}


