package es.maldonadomendoza.mapper;

import es.maldonadomendoza.dto.EquipoDTO;
import es.maldonadomendoza.model.Equipo;

public class EquipoMapper extends BaseMapper<Equipo, EquipoDTO> {
    @Override
    public Equipo fromDTO(EquipoDTO item) {
        return Equipo.builder()
                .id(item.getId())
                .programadores(item.getProgramadores())
                .proyectos(item.getProyectos())
                .build();
    }

    @Override
    public EquipoDTO toDTO(Equipo item) {
        return EquipoDTO.builder()
                .id(item.getId())
                .programadores(item.getProgramadores())
                .proyectos(item.getProyectos())
                .build();
    }
}
