package baitapngay1205;

import java.util.LinkedHashSet;
import java.util.Set;

public class slide59 {
    public static void main(String[] args) {
        Set<String> lkHasdSet = new LinkedHashSet<String>();
        lkHasdSet.add("java");
        lkHasdSet.add("java1");
        lkHasdSet.add("java2");
        lkHasdSet.add("java3");
        for(String str : lkHasdSet){
            System.out.println(str);
        }
    }
}
