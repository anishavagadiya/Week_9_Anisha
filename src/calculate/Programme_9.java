package calculate;
// Create a HashMap object called people that will store String keys and Integer
// values: And use for each loop to iterate the value from Map.

import java.util.HashMap;
import java.util.Map;

public class Programme_9 {
    public static void main(String[] args) {
        Map<String, Integer> list = new HashMap();
        list.put("John", 32);
        list.put("Jiya", 30);
        list.put("Karen",40);
        list.put("Nick", 41);
        for(Map.Entry<String, Integer> personAge : list.entrySet()){
            System.out.println(personAge);
        }


    }

}
