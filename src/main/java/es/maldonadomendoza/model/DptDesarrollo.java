package es.maldonadomendoza.model;


import java.util.List;


public class DptDesarrollo {
    private long id;
    private long idJefeDpt;
    private String nombre;
    double presupuesto;
    private List<Proyecto> finalizado;
    private List<Proyecto> activo;
    private List<Programador> historico;
    private List<Programador> programadores;

    public DptDesarrollo(long id, long idJefeDpt, String nombre, double presupuesto, List<Proyecto> finalizado, List<Proyecto> activo, List<Programador> historico, List<Programador> programadores) {
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

    public List<Proyecto> getFinalizado() {
        return finalizado;
    }

    public void setFinalizado(List<Proyecto> finalizado) {
        this.finalizado = finalizado;
    }

    public List<Proyecto> getActivo() {
        return activo;
    }

    public void setActivo(List<Proyecto> activo) {
        this.activo = activo;
    }

    public List<Programador> getHistorico() {
        return historico;
    }

    public void setHistorico(List<Programador> historico) {
        this.historico = historico;
    }

    public List<Programador> getProgramadores() {
        return programadores;
    }

    public void setProgramadores(List<Programador> programadores) {
        this.programadores = programadores;
    }
}
