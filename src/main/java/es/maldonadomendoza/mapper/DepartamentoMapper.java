package es.maldonadomendoza.mapper;

import es.maldonadomendoza.dto.DepartamentoDTO;
import es.maldonadomendoza.model.Departamento;

public class DepartamentoMapper extends BaseMapper<Departamento, DepartamentoDTO> {
    @Override
    public Departamento fromDTO(DepartamentoDTO item) {

        return Departamento.builder()
                .id(item.getId())
                .idJefeDpt(item.getIdJefeDpt())
                .nombre(item.getNombre())
                .presupuesto(item.getPresupuesto())
                .finalizado(item.getFinalizado())
                .activo(item.getFinalizado())
                .historico(item.getHistorico())
                .build();
    }

    @Override
    public DepartamentoDTO toDTO(Departamento item) {
        return DepartamentoDTO.builder()
                .id(item.getId())
                .idJefeDpt(item.getIdJefeDpt())
                .nombre(item.getNombre())
                .presupuesto(item.getPresupuesto())
                .finalizado(item.getFinalizado())
                .activo(item.getFinalizado())
                .historico(item.getHistorico())
                .build();
    }
}
