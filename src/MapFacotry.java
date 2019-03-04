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

public class MapFacotry {// Factory que se usa pa la creacion de los diferentes tipos de mapas
    public AbstractMap getmap(int map){
        if (map==1){
            return new HashMap<String,String>();// se crea un Hash map
        }
        else if (map==2){
            return new LinkedHashMap<String,String>(); // se crea un linked has map
        }
        else if (map==3){
            return new TreeMap<String,String>();// se cre un tree map
        }
        return null;
    }
}
