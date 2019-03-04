/*
*Andres Berthet 171504
* Hoja de Trabajo 6
* 3 de Marzo de 2019
* Algoritmos y estructura de deatos
* */

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String [] args) throws IOException {
        System.out.println("Cual de los 3 mapas desea usar \n  1, HashMap \n  2, LinkedHashMap \n  3, TreeMap \n ingrese el numero");
        Scanner input = new Scanner(System.in);
        int map = input.nextInt();
        MapFacotry factory = new MapFacotry();
        AbstractMap<String, String> Mapa = factory.getmap(map);// se usa el factory para saber cual de los tres mapoas se quiere usar

        System.out.println("ingrese donde se localiza el archivo con las cartas: ");// bufferReader codigo basado de los ejemplos encontrados en la pagina : https://www.geeksforgeeks.org/different-ways-reading-text-file-java/
        String fileName = input.next();
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            //process the line
            String[] parts = line.split("[|]");// se separa el string que da el buffer reader
            Mapa.put(parts[0], parts[1]);// se guarda la carta en el mapa con su key y value adecuado

        }
        AbstractMap<String, String> Deck = new HashMap<String, String>();// se crea un hash map para guardar las cartas personales del usuario
        int continuar =0;
        while (continuar == 0) {
            System.out.println("Que deseas hacer \n    1. Ver todas las cartas disponibles \n    2. Agregar una carta por su nombre al deck \n    3. Ver el deck \n    4. Salir");
            int opcion = input.nextInt();// se le pide al usuario que decida que va a hacer
            if (opcion == 1) {// para la opcion se imprimen todas las cartas que contiene el archivo
            for (AbstractMap.Entry<String, String> entry : Mapa.entrySet())
            {
                System.out.println(entry.getKey() + "|" + entry.getValue());
            }
                System.out.println("Desea ver el deck de manera ordenada por tipo? \n ingrese el numero \n    1. si \n    2. no ");
            // se le pregunta si desea ver las cartas en orden y se imprimen en orden con los forloops siguientes
                int orden = input.nextInt();
                if (orden==1){
                    for (AbstractMap.Entry<String, String> entry : Mapa.entrySet())
                    {
                        System.out.println(entry.getKey() + "|Trampa");
                    }
                    for (AbstractMap.Entry<String, String> entry : Mapa.entrySet())
                    {
                        System.out.println(entry.getKey() + "|Monstruo");
                    }
                    for (AbstractMap.Entry<String, String> entry : Mapa.entrySet())
                    {
                        System.out.println(entry.getKey() + "|Hechizo");
                    }
                }
            }
            if (opcion == 2) {// En la opcion dos se le pide al usuario que ingrese el nombre de una carta y esta se busca en el mapa para se imprime con su key y value para despues ser agregado al deck del usuario
                System.out.println("Ingrese el nombre de su carta ");
                input.nextLine();
                String carta = input.nextLine();
                carta = carta + "|" + Mapa.get(carta); // imprime la carta que se busca y se le asigna su valor segun la ingformacion que se encuentra en el mapa
                System.out.println(carta);
                String[] partes = carta.split("[|]");
                Deck.put(partes[0], partes[1]);// se agrega esta carta al mapa o deck personal del usauraio
            }
            if (opcion == 3) {// opcion 3 se imprimen las cartas que tiene el usuario
                for (AbstractMap.Entry<String, String> entry : Deck.entrySet())
                {
                    System.out.println(entry.getKey() + "|" + entry.getValue());
                }
                System.out.println("Desea ver el deck de manera ordenada por tipo? \n ingrese el numero \n    1. si \n    2. no "); // esta imprime las cartas en el deck del usuario ordnadas por tipo
                int orden = input.nextInt();
                if (orden==1){
                    for (AbstractMap.Entry<String, String> entry : Deck.entrySet())
                    {
                        System.out.println(entry.getKey() + "|Trampa");
                    }
                    for (AbstractMap.Entry<String, String> entry : Deck.entrySet())
                    {
                        System.out.println(entry.getKey() + "|Monstruo");
                    }
                    for (AbstractMap.Entry<String, String> entry : Deck.entrySet())
                    {
                        System.out.println(entry.getKey() + "|Hechizo");
                    }
                }
            }
            if (opcion == 4 ){// opcion 4 es para salir del while loop
                continuar= 1;
            }
        }
    }
}
//C:\Users\ticoa\OneDrive\Desktop\Cosas\EstructuraDeDatos\Tarea6\cartas
