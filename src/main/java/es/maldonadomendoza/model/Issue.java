package es.maldonadomendoza.model;



import java.util.Date;
public class Issue {
    private long id;
    private String titulo;
    private String texto;
    private Date   fecha;
    private Repositorio repositorio;
    private Comite programadores;
    private Repositorio proyecto;
    private boolean estado;

    public Issue(long id, String titulo, String texto, Date fecha, Repositorio repositorio, Comite programadores, Repositorio proyecto, boolean estado) {
        this.id = id;
        this.titulo = titulo;
        this.texto = texto;
        this.fecha = fecha;
        this.repositorio = repositorio;
        this.programadores = programadores;
        this.proyecto = proyecto;
        this.estado = estado;
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
