package es.maldonadomendoza.mapper;

import es.maldonadomendoza.dto.ProgDTO;
import es.maldonadomendoza.model.Programador;

public class ProgMapper extends BaseMapper<Programador, ProgDTO> {
    @Override
    public Programador fromDTO(ProgDTO item) {
        return Programador.builder()
                .id(item.getId())
                .idEquipo(item.getIdEquipo())
                .idDpt(item.getIdDpt())
                .idComite(item.getIdComite())
                .commits(item.getCommits())
                .issues(item.getIssues())
                .nombre(item.getNombre())
                .password(item.getPassword())
                .experto(item.getExperto())
                .fecha_alta(item.getFecha_alta())
                .salario(item.getSalario())
                .proyectos(item.getProyectos())
                .build();
    }

    @Override
    public ProgDTO toDTO(Programador item) {
        return ProgDTO.builder()
                .id(item.getId())
                .idEquipo(item.getIdEquipo())
                .idDpt(item.getIdDpt())
                .idComite(item.getIdComite())
                .commits(item.getCommits())
                .issues(item.getIssues())
                .nombre(item.getNombre())
                .password(item.getPassword())
                .experto(item.getExperto())
                .fecha_alta(item.getFecha_alta())
                .salario(item.getSalario())
                .proyectos(item.getProyectos())
                .build();
    }
}
