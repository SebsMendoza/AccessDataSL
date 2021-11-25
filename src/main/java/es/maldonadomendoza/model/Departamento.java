package es.maldonadomendoza.model;


import java.util.List;


public class Departamento {
    private long id;
    private long idJefeDpt;
    private String nombre;
    private double presupuesto;
    private List<String> finalizado;
    private List<String> activo;
    private List<String> historico;
    private List<String> programadores;

    public Departamento(long id, long idJefeDpt, String nombre, double presupuesto, List<String> finalizado, List<String> activo, List<String> historico, List<String> programadores) {
        this.id = id;
        this.idJefeDpt = idJefeDpt;
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.finalizado = finalizado;
        this.activo = activo;
        this.historico = historico;
        this.programadores = programadores;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdJefeDpt() {
        return idJefeDpt;
    }

    public void setIdJefeDpt(long idJefeDpt) {
        this.idJefeDpt = idJefeDpt;
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

    public List<String> getFinalizado() {
        return finalizado;
    }

    public void setFinalizado(List<String> finalizado) {
        this.finalizado = finalizado;
    }

    public List<String> getActivo() {
        return activo;
    }

    public void setActivo(List<String> activo) {
        this.activo = activo;
    }

    public List<String> getHistorico() {
        return historico;
    }

    public void setHistorico(List<String> historico) {
        this.historico = historico;
    }

    public List<String> getProgramadores() {
        return programadores;
    }

    public void setProgramadores(List<String> programadores) {
        this.programadores = programadores;
    }
}
