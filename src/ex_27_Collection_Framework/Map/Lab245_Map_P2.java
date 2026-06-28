package ex_27_Collection_Framework.Map;

import java.util.HashMap;
import java.util.Map;

public class Lab245_Map_P2 {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        m1.put("id", "1");
        m1.put("id", "2");
        m1.put("id2", "3");
        m1.put("id3", null);
        m1.put(null, null);
        m1.put(null, "07");

        System.out.println(m1);
        System.out.println(m1.keySet());
        System.out.println(m1.get("id"));
        System.out.println(m1.isEmpty());
    }
}
