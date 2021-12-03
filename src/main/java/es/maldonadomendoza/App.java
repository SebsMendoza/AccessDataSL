package es.maldonadomendoza;

public class App {
    public static void main(String[] args) {
        AccessData adsl = AccessData.getInstance();
        adsl.checkService();
        adsl.initData();

        adsl.Departamento();
        adsl.Proyecto();
        adsl.Issue();
        adsl.Comite();
        adsl.Repositorio();
        adsl.Jefe();
        adsl.Programador();
        adsl.Commit();
        adsl.Equipo();
    }
}