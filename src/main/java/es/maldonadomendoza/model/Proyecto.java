package es.maldonadomendoza.model;



import java.util.Date;
import java.util.List;

public class Proyecto {
    private long id;
    private long idJefe;
    private List<Equipo> equipos;
    private String nombre;
    private double presupuesto;
    private Date fechaInicio;
    private Date fechaFin;
    private List<String> tecnologias;
    private Repositorio repositorio;
    private long idDpt;

    public Proyecto(long id, long idJefe, List<Equipo> equipos, String nombre, double presupuesto, Date fechaInicio, Date fechaFin, List<String> tecnologias, Repositorio repositorio, long idDpt) {
        this.id = id;
        this.idJefe = idJefe;
        this.equipos = equipos;
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.tecnologias = tecnologias;
        this.repositorio = repositorio;
        this.idDpt = idDpt;
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

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public List<String> getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(List<String> tecnologias) {
        this.tecnologias = tecnologias;
    }

    public Repositorio getRepositorio() {
        return repositorio;
    }

    public void setRepositorio(Repositorio repositorio) {
        this.repositorio = repositorio;
    }

    public long getIdDpt() {
        return idDpt;
    }

    public void setIdDpt(long idDpt) {
        this.idDpt = idDpt;
    }
}
