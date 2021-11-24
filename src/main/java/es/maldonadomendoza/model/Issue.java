package es.maldonadomendoza.model;


import java.util.Date;
import java.util.List;

public class Issue {
    private long id;
    private long idJefe;
    private String titulo;
    private String texto;
    private Date fecha;
    private boolean estado;
    private Repositorio repositorio;
    private Comite programadores;
    private Repositorio proyecto;
    private List<Commit> commits;

    public Issue(long id, long idJefe, String titulo, String texto, Date fecha, boolean estado, Repositorio repositorio, Comite programadores, Repositorio proyecto, List<Commit> commits) {
        this.id = id;
        this.idJefe = idJefe;
        this.titulo = titulo;
        this.texto = texto;
        this.fecha = fecha;
        this.estado = estado;
        this.repositorio = repositorio;
        this.programadores = programadores;
        this.proyecto = proyecto;
        this.commits = commits;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdJefe() {
        return idJefe;
    }

    public void setIdJefe(long idJefe) {
        this.idJefe = idJefe;
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Repositorio getRepositorio() {
        return repositorio;
    }

    public void setRepositorio(Repositorio repositorio) {
        this.repositorio = repositorio;
    }

    public Comite getProgramadores() {
        return programadores;
    }

    public void setProgramadores(Comite programadores) {
        this.programadores = programadores;
    }

    public Repositorio getProyecto() {
        return proyecto;
    }

    public void setProyecto(Repositorio proyecto) {
        this.proyecto = proyecto;
    }

    public List<Commit> getCommits() {
        return commits;
    }

    public void setCommits(List<Commit> commits) {
        this.commits = commits;
    }
}
