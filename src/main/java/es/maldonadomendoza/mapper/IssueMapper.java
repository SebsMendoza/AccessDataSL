package es.maldonadomendoza.mapper;

import es.maldonadomendoza.dto.IssueDTO;
import es.maldonadomendoza.model.Issue;

public class IssueMapper extends BaseMapper<Issue, IssueDTO> {
    @Override
    public Issue fromDTO(IssueDTO item) {
        return Issue.builder()
                .id(item.getId())
                .idJefe(item.getIdJefe())
                .commits(item.getCommits())
                .repositorio(item.getRepositorio())
                .programadores(item.getProgramadores())
                .titulo(item.getTitulo())
                .texto(item.getTexto())
                .fecha(item.getFecha())
                .estado(item.isEstado())
                .proyecto(item.getProyecto())
                .build();
    }

    @Override
    public IssueDTO toDTO(Issue item) {
        return IssueDTO.builder()
                .id(item.getId())
                .idJefe(item.getIdJefe())
                .commits(item.getCommits())
                .repositorio(item.getRepositorio())
                .programadores(item.getProgramadores())
                .titulo(item.getTitulo())
                .texto(item.getTexto())
                .fecha(item.getFecha())
                .estado(item.isEstado())
                .proyecto(item.getProyecto())
                .build();
    }
}
