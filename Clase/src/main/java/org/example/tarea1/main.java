package main.java.org.example.tarea1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
                .collect(Collectors.toList()));

        //Map: Obtener una lista con los nombres de las personas.
        System.out.println(personas.stream()
                .map(Persona::getNombre)
                .collect(Collectors.toList()));

        //Reduce: Obtener la suma de las edades de todas las personas.
        System.out.println(personas.stream()
                .map(Persona::getEdad)
                .reduce(0, Integer::sum));

        //Ejercicios Extra

        //Contar la cantidad de personas de cada género.
        System.out.println(personas.stream()
                .collect(Collectors.groupingBy(Persona::getGenero, Collectors.counting())));

        //Calcular el promedio de edades de las personas.
        System.out.println(personas.stream()
                .mapToInt(Persona::getEdad)
                .average());

        //Encontrar la persona de mayor edad.
        System.out.println(personas.stream()
                .max(Comparator.comparingInt(Persona::getEdad)));
    }
}
