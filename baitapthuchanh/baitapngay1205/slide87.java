package baitapngay1205;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class slide87 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Qng", "qunag ngai");
        hashMap.put("QN", "quang Nam");
        hashMap.put("QN", "quang Ninh");

        System.out.println("ds cac tp");
        Set<Map.Entry<String, String>> setCitySet = hashMap.entrySet();
        System.out.println(setCitySet);

        System.out.println("Qng" + hashMap.get("Qng"));

        System.out.println("QN" + hashMap.get("QN"));
        if(hashMap.containsValue("quang nam")){
            System.out.println("tp quang nam");
        }
    }
}
