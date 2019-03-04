import java.util.AbstractMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapFacotry {
    public AbstractMap getmap(int map){
        if (map==1){
            return new HashMap<String,String>();
        }
        else if (map==2){
            return new LinkedHashMap<String,String>();
        }
        else if (map==3){
            return new TreeMap<String,String>();
        }
        return null;
    }
}
