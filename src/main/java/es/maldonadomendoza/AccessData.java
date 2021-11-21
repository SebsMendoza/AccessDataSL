package es.maldonadomendoza;

import es.maldonadomendoza.database.DataBaseController;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class AccessData {
    private static AccessData instance;

    private AccessData() {}

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
            }
        } catch (SQLException e) {
            System.err.println("Error al conectar al servidor de Base de Datos: " + e.getMessage());
            System.exit(1);
        }
    }
}