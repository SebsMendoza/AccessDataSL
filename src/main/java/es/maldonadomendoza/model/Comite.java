package es.maldonadomendoza.model;


import java.util.List;


public class Comite {
    private long id;
    private List<String> programadores;
    private Issue issues;

    public Comite(long id, List<String> programadores, Issue issues) {
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

    public List<String> getProgramadores() {
        return programadores;
    }

    public void setProgramadores(List<String> programadores) {
        this.programadores = programadores;
    }

    public Issue getIssues() {
        return issues;
    }

    public void setIssues(Issue issues) {
        this.issues = issues;
    }
}
