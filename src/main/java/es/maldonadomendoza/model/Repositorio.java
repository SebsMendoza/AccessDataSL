package es.maldonadomendoza.model;


import java.util.Date;
import java.util.List;

public class Repositorio {
    private long id;
    private String nombre;
    private Date creacion;
    private Proyecto proyecto;
    private List<String> commits;
    private List<String> issues;

    public Repositorio(long id, String nombre, Date creacion, Proyecto proyecto, List<String> commits, List<String> issues) {
        this.id = id;
        this.nombre = nombre;
        this.creacion = creacion;
        this.proyecto = proyecto;
        this.commits = commits;
        this.issues = issues;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getCreacion() {
        return creacion;
    }

    public void setCreacion(Date creacion) {
        this.creacion = creacion;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public List<String> getCommits() {
        return commits;
    }

    public void setCommits(List<String> commits) {
        this.commits = commits;
    }

    public List<String> getIssues() {
        return issues;
    }

    public void setIssues(List<String> issues) {
        this.issues = issues;
    }
}
