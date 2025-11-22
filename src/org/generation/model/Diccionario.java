package org.generation.model;

import java.util.HashMap;
import java.util.Map;

public class Diccionario {
    private final Map<String, String> palabras;

    public Diccionario() {
        palabras = new HashMap<>();
        cargarPalabras();
    }

    private void cargarPalabras() {
        palabras.put("desarrollador", "developer");
        palabras.put("programación", "programming");
        palabras.put("mantenimiento", "maintenance");
        palabras.put("pruebas", "test");
        palabras.put("independiente", "freelance");
        palabras.put("hibrido", "hybrid");
        palabras.put("controlador", "controller");
        palabras.put("usuario", "user");
        palabras.put("lógica", "logic");
        palabras.put("módulos", "modules");
        palabras.put("responsabilidades", "responsibilities");
        palabras.put("aplicaciones", "applications");
        palabras.put("soluciones", "solutions");
        palabras.put("arquitectura", "architecture");
        palabras.put("marcos", "frameworks");
        palabras.put("configuraciones", "settings");
        palabras.put("autentificación", "authentication");
        palabras.put("seguridad", "security");
        palabras.put("servidor", "server");
        palabras.put("sostenible", "sustainable");
        palabras.put("certificación", "certification");
        palabras.put("profesional", "professional");
        palabras.put("diseño", "design");
        palabras.put("habilidades", "skills");
    }

    public Map<String, String> getPalabras() {
        return palabras;
    }
}
