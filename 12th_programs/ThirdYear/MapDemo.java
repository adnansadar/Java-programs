package ThirdYear;
import java.util.*;

public class MapDemo
{
    public static void main(String args[])
    {
        Map<Integer, String> map  = new HashMap<Integer, String>();
        map.put(9,"Adnan");
        map.put(11,"Zaid");
        map.put(7,"Angelo");
        map.put(8,"Angelo");
        map.put(1,"Angelo");
        System.out.println("Map: "+map);
        System.out.println(map.get(23));
        System.out.println(map.remove(8));
        System.out.println("Keys: "+map.keySet());
        System.out.println("Values: "+map.values());
    }
}
