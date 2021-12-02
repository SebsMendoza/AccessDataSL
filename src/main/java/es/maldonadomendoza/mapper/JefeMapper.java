package es.maldonadomendoza.mapper;

import es.maldonadomendoza.dto.JefeDTO;
import es.maldonadomendoza.model.Jefe;

public class JefeMapper extends BaseMapper<Jefe, JefeDTO> {
    @Override
    public Jefe fromDTO(JefeDTO item) {
        return Jefe.builder()
                .idJefe(item.getIdJefe())
                .idProyecto(item.getIdProyecto())
                .idProg(item.getIdProg())
                .idIssue(item.getIdIssue())
                .build();
    }

    @Override
    public JefeDTO toDTO(Jefe item) {
        return JefeDTO.builder()
                .idJefe(item.getIdJefe())
                .idProyecto(item.getIdProyecto())
                .idProg(item.getIdProg())
                .idIssue(item.getIdIssue())
                .build();
    }
}
