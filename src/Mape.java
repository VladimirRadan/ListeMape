import java.util.HashMap;
import java.util.Map;

public class Mape {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap();
        map.put(1, "No 1");
        map.put(2, "No 2");
        map.put(3, "No 3");
        map.put(4, "No 4");
        map.put(4, "No 4");

        for (Map.Entry m: map.entrySet()){
            System.out.println("Key: " + m.getKey() + " Value: " + m.getValue());
        }

        Map<String, Boolean> map1 = new HashMap();
        map1.put("1", true);



    }





}
