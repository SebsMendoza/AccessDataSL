package es.maldonadomendoza.model;




import java.util.Date;
import java.util.List;


public class Programador {
    private long id;
    private String nombre;
    private Date fecha_alta;
    private long idDpt;
    private long idComite;
    private List<Proyecto> proyectos;
    private List<Commit> commits;
    private List<Issue> issues;
    private List<String> conocimientos;
    private double salario;

    public Programador(long id, String nombre, Date fecha_alta, long idDpt, long idComite, List<Proyecto> proyectos, List<Commit> commits, List<Issue> issues, List<String> conocimientos, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.fecha_alta = fecha_alta;
        this.idDpt = idDpt;
        this.idComite = idComite;
        this.proyectos = proyectos;
        this.commits = commits;
        this.issues = issues;
        this.conocimientos = conocimientos;
        this.salario = salario;
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

    public Date getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(Date fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public long getIdDpt() {
        return idDpt;
    }

    public void setIdDpt(long idDpt) {
        this.idDpt = idDpt;
    }

    public long getIdComite() {
        return idComite;
    }

    public void setIdComite(long idComite) {
        this.idComite = idComite;
    }

    public List<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(List<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    public List<Commit> getCommits() {
        return commits;
    }

    public void setCommits(List<Commit> commits) {
        this.commits = commits;
    }

    public List<Issue> getIssues() {
        return issues;
    }

    public void setIssues(List<Issue> issues) {
        this.issues = issues;
    }

    public List<String> getConocimientos() {
        return conocimientos;
    }

    public void setConocimientos(List<String> conocimientos) {
        this.conocimientos = conocimientos;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
