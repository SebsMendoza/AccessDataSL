package es.maldonadomendoza.utils;

import java.util.ArrayList;
import java.util.List;

public class CheckNulls {
    public List<String> checkNulls(String cadena) {
        if (cadena == null) {
            return new ArrayList();
        } else
            return List.of(cadena.split(" "));
    }
}
