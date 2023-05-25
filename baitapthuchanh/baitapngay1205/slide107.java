package baitapngay1205;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class slide107 {
    public static void main(String args[]) {
        TreeMap<Integer, Double> treemap = new TreeMap<>();
        treemap.put(1, 9d);
        treemap.put(4, 10.1d);
        treemap.put(2, 7.2d);
        treemap.put(8, 28.28d);
        System.out.println("cac phan tu treeMap");
         Set<Map.Entry<Integer, Double>> setTreeMap = treemap.entrySet();
         System.out.println(setTreeMap);

         treemap.replace(4,20.11d);
         treemap.replace(2,10.11d);
        System.out.println("tree map da thay the ");
        setTreeMap = treemap.entrySet();
        System.out.println(setTreeMapbaithuchanh1905);
    }

 
}
    

 




