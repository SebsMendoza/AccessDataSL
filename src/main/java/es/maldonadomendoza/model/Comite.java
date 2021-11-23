package es.maldonadomendoza.model;


import java.util.List;


public class Comite {
    private long id;
    private List<Programador> programadores;
    private List<Issue> issues;

    public Comite(long id, List<Programador> programadores, List<Issue> issues) {
        this.id = id;
        this.programadores = programadores;
        this.issues = issues;
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

    public List<Issue> getIssues() {
        return issues;
    }

    public void setIssues(List<Issue> issues) {
        this.issues = issues;
    }
}
