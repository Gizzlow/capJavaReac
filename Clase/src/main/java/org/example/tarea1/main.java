package main.java.org.example.tarea1;

import java.util.Arrays;
import java.util.List;

public class main {

    public static void main(String[] args) {


        List<Persona> personas = Arrays.asList(
                new Persona("Juan", 25, "Masculino"),
                new Persona("María", 30, "Femenino"),
                new Persona("Pedro", 40, "Masculino"),
                new Persona("Ana", 20, "Femenino")
        );

        //Filter: Filtrar personas mayores de 25 años.
        System.out.println(personas.stream()
                .filter(persona -> persona.getEdad() >= 25)
                .toList());

        //Map: Obtener una lista con los nombres de las personas.
        System.out.println(personas.stream()
                .map(Persona::getNombre)
                .toList());

        //Reduce: Obtener la suma de las edades de todas las personas.
        System.out.println(personas.stream()
                .map(Persona::getEdad)
                .reduce(0,Integer::sum));
    }
}
