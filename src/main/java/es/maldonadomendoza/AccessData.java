package es.maldonadomendoza;

import es.maldonadomendoza.controller.CommitController;
import es.maldonadomendoza.controller.EquipoController;
import es.maldonadomendoza.controller.IssueController;
import es.maldonadomendoza.database.DataBaseController;
import es.maldonadomendoza.dto.CommitDTO;
import es.maldonadomendoza.dto.EquipoDTO;
import es.maldonadomendoza.dto.IssueDTO;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AccessData {
    private static AccessData instance;

    private AccessData() {
    }

    public static AccessData getInstance() {
        if (instance == null) {
            instance = new AccessData();
        }
        return instance;
    }

    public void checkService() {
        DataBaseController controller = DataBaseController.getInstance();
        try {
            controller.open();
            Optional<ResultSet> rs = controller.select("SELECT 'Hello World'");
            if (rs.isPresent()) {
                rs.get().next();
                controller.close();
                System.out.println("Conexión correcta");
            }
        } catch (SQLException e) {
            System.err.println("Error al conectar al servidor de Base de Datos: " + e.getMessage());
            System.exit(1);
        }
    }

    public void initData() {
        System.out.println("Iniciamos los datos");
        DataBaseController controller = DataBaseController.getInstance();
        String sqlFile = System.getProperty("user.dir") + File.separator + "sql" + File.separator + "adsl.sql";
        System.out.println(sqlFile);
        try {
            controller.open();
            controller.initData(sqlFile);
            controller.close();
        } catch (SQLException e) {
            System.err.println("Error al conectar al servidor de Base de Datos: " + e.getMessage());
            System.exit(1);
        } catch (FileNotFoundException e) {
            System.err.println("Error al leer el fichero de datos iniciales: " + e.getMessage());
            System.exit(1);
        }
    }

    public void Issue(){

        IssueController issueController = IssueController.getInstance();

        System.out.println("Get Todas las issues");
        System.out.println(issueController.getAllIssuesJSON());

        System.out.println("Get Issue con ID = 2");
        System.out.println(issueController.getIssueByIdJSON(2));

        System.out.println("UPDATE Issue con ID = 4");
        IssueDTO issueDTO = IssueDTO.builder()
                .id(4)
                .texto("Prueba update")
                .build();
        System.out.println(issueController);
    }
    public void Equipo(){
        EquipoController equipoController = EquipoController.getInstance();
        System.out.println("GET Todos los equipos");
        System.out.println(equipoController.getAllEquiposJSON());

        System.out.println("GET Equipo con ID = 2");
        System.out.println(equipoController.getEquipoByIdJSON(2));

        System.out.println("UPDATE Equipo con ID = 5");
        List<String> cambios = new ArrayList<String>();
        cambios.add("Pablo");
        EquipoDTO equipoDTO = EquipoDTO.builder()
                .id(5)
                .programadores(cambios)
                .build();
        System.out.println(equipoController.updateEquipoJSON(equipoDTO));
        System.out.println("DELETE Equipo con ID = 5");
        equipoDTO = EquipoDTO.builder()
                .id(5)
                .build();
        System.out.println(equipoController.deleteEquipoJSON(equipoDTO));

    }
    public void Commit(){
        CommitController commitController = CommitController.getInstance();

        System.out.println("GET Todos los commits");
        System.out.println(commitController.getAllCommitsJSON());

        System.out.println("GET Commit con ID = 2");
        System.out.println(commitController.getCommitByIdJSON(2));

        System.out.println("UPDATE Comite con ID = 5");
        CommitDTO commitDTO = CommitDTO.builder()
                .id(5)
                .titulo("actualizacion")
                .build();
        System.out.println(commitController.updateCommitJSON(commitDTO));

        System.out.println("DELETE Commit con ID = 5");
        commitDTO = CommitDTO.builder()
                .id(5)
                .build();
        System.out.println(commitController.deleteCommitJSON(commitDTO));
    }
}