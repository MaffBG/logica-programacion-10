package Dictionary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main { 

	public static void main(String[] args) {
		// Se crea un diccionario Español-Inglés utilizando un HashMap.
		HashMap<String, String> diccionario = new HashMap<>();

		// Se almacenan 20 claves (palabras en español) y sus respectivos valores (traducciones al inglés).
		diccionario.put("carro", "car");
		diccionario.put("comer", "eat");
		diccionario.put("manzana", "apple");
		diccionario.put("comida", "food");
		diccionario.put("agua", "water");
		diccionario.put("escuela", "school");
		diccionario.put("pluma", "pen");
		diccionario.put("lápiz", "pencil");
		diccionario.put("libro", "book");
		diccionario.put("amarillo", "yellow");
		diccionario.put("rojo", "red");
		diccionario.put("azul", "blue");
		diccionario.put("amor", "love");
		diccionario.put("familia", "family");
		diccionario.put("amigo", "friend");
		diccionario.put("padre", "father");
		diccionario.put("madre", "mother");
		diccionario.put("mascota", "pet");
		diccionario.put("perro", "dog");
		diccionario.put("gato", "cat");

		// Se seleccionan aleatoriamente 5 palabras del diccionario
		// Para empezar, se convierten las claves en una lista.
		List<String> palabras = new ArrayList<>(diccionario.keySet());
		// Se mezclan aleatoriamente las palabras en español (claves)
		Collections.shuffle(palabras); 
		// Se toman las primeras 5 palabras para que...
		List<String> seleccionadas = palabras.subList(0, 5); 

		// Se muestren al usuario las palabras seleccionadas
		System.out.println("Estas son las 5 palabras seleccionadas:");
        for (String palabra : seleccionadas) {
            System.out.println("- " + palabra);
        }
        // Se imprime un salto de línea (sólo por estética)
        System.out.println();
		
		// Se crean contadores de respuestas correctas e incorrectas.
		int respuestasCorrectas = 0;
		int respuestasIncorrectas = 0;

		// Se crea un objeto Scanner para leer las respuestas del usuario.
		Scanner scanner = new Scanner(System.in);

		System.out.println("¡Tu turno! Traduce las palabras anteriores al inglés:");

		// Se itera sobre las palabras seleccionadas
		for (String palabra : seleccionadas) {
			System.out.print("Traducción de \"" + palabra + "\": ");
			String respuesta = scanner.nextLine().trim().toLowerCase(); // Lee y procesa la respuesta.

			// Se verifica si la respuesta es correcta.
			if (respuesta.equals(diccionario.get(palabra))) {
				System.out.println("¡Correcto, well done!");
				respuestasCorrectas++;
			} else {
				System.out.println("Incorrecto. La respuesta correcta es: " + diccionario.get(palabra));
				respuestasIncorrectas++;
			}
		}

		// Se muestran los resultados finales.
		System.out.println("\nRESULTADOS FINALES:");
		System.out.println("Respuestas correctas: " + respuestasCorrectas);
		System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);

		// ¡Fin! Se cierra el objeto Scanner.
		scanner.close();
	}
}