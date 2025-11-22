package org.generation.main;

import org.generation.model.Diccionario;
import org.generation.service.DiccionarioService;

import java.util.List;

public class Main {
    public static void main(String[] args){
        Diccionario diccionario = new Diccionario();

        DiccionarioService service = new DiccionarioService(diccionario);
        List<String> palabrasAleatorias = service.seleccionarPalabras(5);
        int correctas = service.evaluarRespuestas(palabrasAleatorias);

        System.out.println("\n==== RESULTADOS ====");
        System.out.println("Correctas: " + correctas);
        System.out.println("Incorrectas: " + (5 - correctas));
    }

}
