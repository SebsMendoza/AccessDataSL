package es.maldonadomendoza.mapper;

import es.maldonadomendoza.dto.RepoDTO;
import es.maldonadomendoza.model.Repositorio;

public class RepoMapper extends BaseMapper<Repositorio, RepoDTO> {
    @Override
    public Repositorio fromDTO(RepoDTO item) {
        return Repositorio.builder()
                .id(item.getId())
                .proyecto(item.getProyecto())
                .commits(item.getCommits())
                .issues(item.getIssues())
                .nombre(item.getNombre())
                .creacion(item.getCreacion())
                .build();
    }

    @Override
    public RepoDTO toDTO(Repositorio item) {
        return RepoDTO.builder()
                .id(item.getId())
                .proyecto(item.getProyecto())
                .commits(item.getCommits())
                .issues(item.getIssues())
                .nombre(item.getNombre())
                .creacion(item.getCreacion())
                .build();
    }
}
