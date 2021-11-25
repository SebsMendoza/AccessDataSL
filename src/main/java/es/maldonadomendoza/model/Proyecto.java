package es.maldonadomendoza.model;


import java.util.Date;
import java.util.List;

public class Proyecto {
    private long id;
    private long idJefe;
    private long idDpt;
    private String nombre;
    private double presupuesto;
    private Date fechaInicio;
    private Date fechaFin;
    private List<String> tecnologias;
    private List<String> equipos;
    private List<String> repositorios;

    public Proyecto(long id, long idJefe, long idDpt, String nombre, double presupuesto, Date fechaInicio, Date fechaFin, List<String> tecnologias, List<String> equipos, List<String> repositorios) {
        this.id = id;
        this.idJefe = idJefe;
        this.idDpt = idDpt;
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.tecnologias = tecnologias;
        this.equipos = equipos;
        this.repositorios = repositorios;
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

    public long getIdDpt() {
        return idDpt;
    }

    public void setIdDpt(long idDpt) {
        this.idDpt = idDpt;
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

    public List<String> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<String> equipos) {
        this.equipos = equipos;
    }

    public List<String> getRepositorios() {
        return repositorios;
    }

    public void setRepositorios(List<String> repositorios) {
        this.repositorios = repositorios;
    }
}
