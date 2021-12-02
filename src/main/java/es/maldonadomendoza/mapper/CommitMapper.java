package es.maldonadomendoza.mapper;

import es.maldonadomendoza.dto.CommitDTO;
import es.maldonadomendoza.model.Commit;

public class CommitMapper extends BaseMapper<Commit, CommitDTO> {
    @Override
    public Commit fromDTO(CommitDTO item) {
        return Commit.builder()
                .id(item.getId())
                .idProg(item.getIdProg())
                .repositorio(item.getRepositorio())
                .idProyecto(item.getIdProyecto())
                .Issues(item.getIssues())
                .titulo(item.getTitulo())
                .texto(item.getTexto())
                .fecha(item.getFecha())
                .build();

    }

    @Override
    public CommitDTO toDTO(Commit item) {
        return CommitDTO.builder()
                .id(item.getId())
                .idProg(item.getIdProg())
                .repositorio(item.getRepositorio())
                .idProyecto(item.getIdProyecto())
                .Issues(item.getIssues())
                .titulo(item.getTitulo())
                .texto(item.getTexto())
                .fecha(item.getFecha())
                .build();
    }
}
