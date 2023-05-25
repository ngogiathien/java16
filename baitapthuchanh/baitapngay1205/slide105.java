package baitapngay1205;

import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class slide105 {
 
    public static void main(String args[]) {
        TreeMap<Integer, Character> treeMap = new TreeMap<>();

        treeMap.put(6, 'A');

        treeMap.put(5, 'B');

        treeMap.put(1, 'C');

        treeMap.put(2, 'D');

        treeMap.put(8, 'E');

        // tao 1 Set c6 tén 1a setTreeMap

        // chita toan b6 cac entry (vita key vita value)

        // cha treeMap

        Set<Entry<Integer, Character>> setTreeMap = treeMap.entrySet();

        // cdc entry trong setTreeMap sé dugc sap xép tang dan theo khéa
        System.out.println("Cac entry cé trong setTreeMap:");
        System.out.println(setTreeMap);
    }
}
