package es.maldonadomendoza.model;


import java.util.List;

public class Equipo {
    private long id;
    private List<String> programadores;
    private List<String> proyectos;

    public Equipo(long id, List<String> programadores, List<String> proyectos) {
        this.id = id;
        this.programadores = programadores;
        this.proyectos = proyectos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<String> getProgramadores() {
        return programadores;
    }

    public void setProgramadores(List<String> programadores) {
        this.programadores = programadores;
    }

    public List<String> getProyectos() {
        return proyectos;
    }

    public void setProyectos(List<String> proyectos) {
        this.proyectos = proyectos;
    }
}
