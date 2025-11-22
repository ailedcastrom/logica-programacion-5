package org.generation.service;

import org.generation.model.Diccionario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DiccionarioService {
    private final Diccionario diccionario;

    public DiccionarioService(Diccionario diccionario) {
        this.diccionario = diccionario;
    }

    public List<String> seleccionarPalabras(int numPalabras) {
        List<String> lista = new ArrayList<>(diccionario.getPalabras().keySet());
        Collections.shuffle(lista);
        return lista.subList(0, numPalabras);
    }

    public int evaluarRespuestas(List<String> palabrasAleatorias) {
        Scanner scanner = new Scanner(System.in);
        int correctas = 0;

        for (String palabraEsp : palabrasAleatorias) {
            System.out.println("Traduce al inglés la palabra: " + palabraEsp);
            String respuestaUsuario = scanner.nextLine().trim().toLowerCase();

            String respuestaCorrecta = diccionario.getPalabras().get(palabraEsp).toLowerCase();

            if (respuestaUsuario.equals(respuestaCorrecta)) {
                System.out.println("Correcto");
                correctas++;
            } else {
                System.out.println("Incorrecto. La respuesta correcta es: " + respuestaCorrecta);
            }
        }

        return correctas;
    }
}
