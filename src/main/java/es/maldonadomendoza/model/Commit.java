package es.maldonadomendoza.model;



import java.util.Date;

public class Commit {
    private long id;
    private String titulo;
    private String texto;
    private Date fecha;
    private Repositorio repositorio;
    private long idProg;
    private Issue Issues;
    private long idProyecto;

    public Commit(long id, String titulo, String texto, Date fecha, Repositorio repositorio, long idProg, Issue issues, long idProyecto) {
        this.id = id;
        this.titulo = titulo;
        this.texto = texto;
        this.fecha = fecha;
        this.repositorio = repositorio;
        this.idProg = idProg;
        Issues = issues;
        this.idProyecto = idProyecto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Repositorio getRepositorio() {
        return repositorio;
    }

    public void setRepositorio(Repositorio repositorio) {
        this.repositorio = repositorio;
    }

    public long getIdProg() {
        return idProg;
    }

    public void setIdProg(long idProg) {
        this.idProg = idProg;
    }

    public Issue getIssues() {
        return Issues;
    }

    public void setIssues(Issue issues) {
        Issues = issues;
    }

    public long getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(long idProyecto) {
        this.idProyecto = idProyecto;
    }
}
