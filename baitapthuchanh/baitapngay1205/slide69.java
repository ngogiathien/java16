package baitapngay1205;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class slide69 {
    public static void main(String[] args) {
        int number;
        TreeSet<Integer> IntTreeSet = new TreeSet<>();
        Scanner sc = new Scanner(System.in);

        // them phan tu
        IntTreeSet.add(0);
        IntTreeSet.add(1);
        IntTreeSet.add(2);
        IntTreeSet.add(3);
        IntTreeSet.add(4);
        IntTreeSet.add(5);
        IntTreeSet.add(6);

        // hien thi phan tu
        System.out.println("cac phan tu trong treesetint");
        System.out.println(IntTreeSet);
        System.out.println("nhap cac phan tu can them");
        number = sc.nextInt();
        if (!IntTreeSet.contains(number)) {
            IntTreeSet.add(number);
            System.out.println("them thanh cong");
            System.out.println("cac phan tu trong treeset");
            System.out.println(IntTreeSet);
        } else {
            System.out.println("phan tu" + number + "da ton tai");

        }
    }
}
