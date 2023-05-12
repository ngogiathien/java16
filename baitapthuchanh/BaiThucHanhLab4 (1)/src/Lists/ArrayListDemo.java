package Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) throws Exception {
        ArrayList<Student> arrlist = new ArrayList<Student>();
        Student std = new Student();
        int n;
        do {
            System.out.println("nhap so luong hoc sinh: ");
            Scanner sc = new Scanner(System.in);
             n = sc.nextInt();
        } while (n < 1);
        std.nhapThongTin(arrlist, n);
        arrlist.add(std);
        std.hienThiThongTin(arrlist);
        std.suaThongTin(arrlist);
        std.xoaThongTin(arrlist);
    };
};
