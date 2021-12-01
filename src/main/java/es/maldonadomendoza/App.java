package es.maldonadomendoza;

import repository.ProgRepository;

public class App {
    public static void main(String[] args) {
        AccessData adsl = AccessData.getInstance();
        adsl.checkService();
        adsl.initData();
    }
}
