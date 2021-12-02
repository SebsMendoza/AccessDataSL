package es.maldonadomendoza.mapper;

import es.maldonadomendoza.dto.ComiteDTO;
import es.maldonadomendoza.model.Comite;

public class ComiteMapper extends BaseMapper<Comite, ComiteDTO> {

    @Override
    public Comite fromDTO(ComiteDTO item) {
        return Comite.builder()
                .id(item.getId())
                .programadores(item.getProgramadores())
                .issues(item.getIssues())
                .build();

    }

    @Override
    public ComiteDTO toDTO(Comite item) {
        return ComiteDTO.builder()
                .id(item.getId())
                .programadores(item.getProgramadores())
                .issues(item.getIssues())
                .build();
    }
}
