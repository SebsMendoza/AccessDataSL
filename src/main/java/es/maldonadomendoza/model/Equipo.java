package es.maldonadomendoza.model;



import java.util.List;

public class Equipo {
    private long id;
    private List<Programador> programadores;
    private List<Proyecto> proyectos;

    public Equipo(long id, List<Programador> programadores, List<Proyecto> proyectos) {
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

    public List<Programador> getProgramadores() {
        return programadores;
    }

    public void setProgramadores(List<Programador> programadores) {
        this.programadores = programadores;
    }

    public List<Proyecto> getProyectos() {
        return proyectos;
    }
    public void setProyectos(List<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

}
