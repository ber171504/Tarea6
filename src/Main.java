import java.util.AbstractMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String [] args){
        System.out.println("Cual de los 3 mapas desea usar \n  1, HashMap \n  2, LinkedHashMap \n  3, TreeMap \n ingrese el numero");
        Scanner input  = new Scanner(System.in);
        int map = input.nextInt();
        MapFacotry factory = new MapFacotry();
        AbstractMap Mapa = factory.getmap(map);
        System.out.println(type(Mapa));

        String fileName = input.next();
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine()) != null){
            //process the line
            split(line,"|");
            Mapa.put(split.0,split.1);
        }


    }
}
