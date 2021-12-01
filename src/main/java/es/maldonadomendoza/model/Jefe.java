package es.maldonadomendoza.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class Jefe {
    private long idJefe;
    private long idProg;
    private long idProyecto;
}


