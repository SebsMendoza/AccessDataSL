package es.maldonadomendoza.mapper;

import es.maldonadomendoza.dto.ProyectoDTO;
import es.maldonadomendoza.model.Proyecto;

public class ProyectoMapper extends BaseMapper<Proyecto, ProyectoDTO> {
    @Override
    public Proyecto fromDTO(ProyectoDTO item) {
        return Proyecto.builder()
                .id(item.getId())
                .idJefe(item.getIdJefe())
                .equipos(item.getEquipos())
                .idDpt(item.getIdDpt())
                .repositorios(item.getRepositorios())
                .nombre(item.getNombre())
                .presupuesto(item.getPresupuesto())
                .fechaInicio(item.getFechaInicio())
                .fechaFin(item.getFechaFin())
                .tecnologias(item.getTecnologias())
                .build();
    }

    @Override
    public ProyectoDTO toDTO(Proyecto item) {
        return ProyectoDTO.builder()
                .id(item.getId())
                .idJefe(item.getIdJefe())
                .equipos(item.getEquipos())
                .idDpt(item.getIdDpt())
                .repositorios(item.getRepositorios())
                .nombre(item.getNombre())
                .presupuesto(item.getPresupuesto())
                .fechaInicio(item.getFechaInicio())
                .fechaFin(item.getFechaFin())
                .tecnologias(item.getTecnologias())
                .build();
    }
}
