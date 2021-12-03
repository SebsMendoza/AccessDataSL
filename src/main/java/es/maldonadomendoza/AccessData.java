package es.maldonadomendoza;

import es.maldonadomendoza.controller.IssueController;
import es.maldonadomendoza.database.DataBaseController;
import es.maldonadomendoza.dto.IssueDTO;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.ResultSet;
import java.sql.SQLException;
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
}