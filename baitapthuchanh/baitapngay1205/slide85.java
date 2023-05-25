package baitapngay1205;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class slide85 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("cslt", "cslt");
        hashMap.put("1", "123");
        hashMap.put("2", "efdad");
        hashMap.put("3", "cslt4");
        hashMap.put("4", "csltasd");
        hashMap.put("5", "csltadas");
        

        Set<Map.Entry<String, String>> setHashMap = hashMap.entrySet();
        System.out.println("cac enty co trong hashMap");
        System.out.println(setHashMap);
    }
}
