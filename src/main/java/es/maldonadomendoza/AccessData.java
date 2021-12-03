package es.maldonadomendoza;


import es.maldonadomendoza.controller.CommitController;
import es.maldonadomendoza.controller.EquipoController;
import es.maldonadomendoza.controller.IssueController;
import es.maldonadomendoza.database.DataBaseController;
import es.maldonadomendoza.dto.CommitDTO;
import es.maldonadomendoza.dto.EquipoDTO;
import es.maldonadomendoza.dto.IssueDTO;

import es.maldonadomendoza.controller.*;
import es.maldonadomendoza.database.DataBaseController;
import es.maldonadomendoza.dto.*;
import es.maldonadomendoza.model.Repositorio;


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

    public void Issue() {

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
        System.out.println(issueController.updateIssueJSON(issueDTO));

        System.out.println("DELETE issue con ID = 5");
        issueDTO = IssueDTO.builder()
                .id(5)
                .build();
        System.out.println(issueController.deleteIssueJSON(issueDTO));
    }

    public void Comite() {
        ComiteController comiteController = ComiteController.getInstance();

        System.out.println("GET Todos los comite");
        System.out.println(comiteController.getAllComiteJSON());

        System.out.println("GET Comite con ID = 2");
        System.out.println(comiteController.getComiteByIdJSON(2));

        System.out.println("UPDATE Comite con ID = 5");
        List<String> cambios = new ArrayList<String>();
        cambios.add("Pepe");
        ComiteDTO comiteDTO = ComiteDTO.builder()
                .id(5)
                .programadores(cambios)
                .build();
        System.out.println(comiteController.updateComiteJSON(comiteDTO));

        System.out.println("DELETE Comite con ID = 5");
        comiteDTO = ComiteDTO.builder()
                .id(5)
                .build();
        System.out.println(comiteController.deleteComiteJSON(comiteDTO));
    }

    public void Departamento() {
        DepartamentoController departamentoController = DepartamentoController.getInstance();

        System.out.println("GET todos los departamentos");
        System.out.println(departamentoController.getAllDepartamentosJSON());

        System.out.println("GET Departamento con ID = 2");
        System.out.println(departamentoController.getDepartamentoByIdJSON(2));

        System.out.println("UPDATE Departamento con ID = 4");
        DepartamentoDTO departamentoDTO = DepartamentoDTO.builder()
                .id(4)
                .nombre("Estadistica")
                .build();
        System.out.println(departamentoController.updateDepartamentoJSON(departamentoDTO));

        System.out.println("DELETE Departamento con ID = 5");
        departamentoDTO = DepartamentoDTO.builder()
                .id(5)
                .build();
        System.out.println(departamentoController.deleteDepartamento(departamentoDTO));
    }

    public void Programador() {
        ProgController progController = ProgController.getInstance();

        System.out.println("GET todos los programadores");
        System.out.println(progController.getAllProgJSON());

        System.out.println("GET programador con ID = 4");
        System.out.println(progController.getProgByIdJSON(4));

        System.out.println("UPDATE programador con ID = 4");
        ProgDTO progDTO = ProgDTO.builder()
                .id(4)
                .nombre("Matias")
                .build();
        System.out.println(progController.updateProgJSON(progDTO));

        System.out.println("DELETE programador con ID = 6");
        progDTO = ProgDTO.builder()
                .id(6)
                .build();
        System.out.println(progController.deleteProg(progDTO));
    }

    public void Repositorio() {
        RepoController repoController = RepoController.getInstance();

        System.out.println("GET todos los repositorios");
        System.out.println(repoController.getAllReposJSON());

        System.out.println("GET repositorio con ID = 3");
        System.out.println(repoController.getRepoByIdJSON(3));

        System.out.println("UPDATE repositorio con ID = 7");
        RepoDTO repoDTO = RepoDTO.builder()
                .id(7)
                .nombre("Fenix")
                .build();
        System.out.println(repoController.updateRepoJSON(repoDTO));

        System.out.println("DELETE repositorio con ID = 5");
        repoDTO = RepoDTO.builder()
                .id(5)
                .build();
        System.out.println(repoController.deleteRepo(repoDTO));
    }

    public void Proyecto() {
        ProyectoController proyectoController = ProyectoController.getInstance();

        System.out.println("GET todos los proyectos");
        System.out.println(proyectoController.getAllProyectosJSON());

        System.out.println("GET proyecto con ID = 8");
        System.out.println(proyectoController.getProyectoByIdJSON(8));

        System.out.println("UPDATE proyecto con ID = 2");
        ProyectoDTO proyectoDTO = ProyectoDTO.builder()
                .id(2)
                .nombre("Jerico")
                .build();
        System.out.println(proyectoController.updateProyectoJSON(proyectoDTO));

        System.out.println("DELETE proyecto con ID = 2");
        proyectoDTO = ProyectoDTO.builder()
                .id(2)
                .build();
        System.out.println(proyectoController.deleteProyecto(proyectoDTO));
    }

    public void Jefe() {
        JefeController jefeController = JefeController.getInstance();

        System.out.println("GET todos los jefes");
        System.out.println(jefeController.getAllJefesJSON());

        System.out.println("GET jefe con ID = 3");
        System.out.println(jefeController.getJefeByIdJSON(3));

        System.out.println("UPDATE jefe con ID = 1");
        JefeDTO jefeDTO = JefeDTO.builder()
                .idJefe(1)
                .idProg(2)
                .build();
        System.out.println(jefeController.updateJefeJSON(jefeDTO));

        System.out.println("DELETE jefe con ID = 3");
        jefeDTO = JefeDTO.builder()
                .idJefe(3)
                .build();
        System.out.println(jefeController.deleteJefe(jefeDTO));
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