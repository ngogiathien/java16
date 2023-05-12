package Lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Student {
    public String FullName;
    public int Age;

  

    public void nhapThongTin(ArrayList<Student> arrlist, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap ten student " + (i + 1) + ":");
            FullName = sc.nextLine();
            System.out.println("Nhap tuoi student " + (i + 1) + ":");
            Age = sc.nextInt();
            sc.nextLine();
            Student student = new Student();
            student.FullName = FullName;
            student.Age = Age;
            arrlist.add(student);
        }
    }

    public void hienThiThongTin(ArrayList<Student> arrlist) {
        for (Student std : arrlist) {
            System.out.println("Ten: " + std.FullName + " - " + " tuoi: " + std.Age);
        }
    }

    public void suaThongTin(ArrayList<Student> arrlist) {
        Scanner sc = new Scanner(System.in);
        System.out.println("tim kiem can sua:");
        String searchName = sc.nextLine();
        for (int i = 0; i < arrlist.size(); i++) {
            if (arrlist.get(i).FullName.equals(searchName)) {
                System.out.println("Thong tin moi:");
                String updateName = sc.nextLine();
                int updateAge = sc.nextInt();
                Student std = new Student();
                std.FullName = updateName;
                std.Age = updateAge;
                arrlist.set(i, std);
            }
        }
    }

    public void xoaThongTin(ArrayList<Student> arrlist) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten can xoa:");
        String searchName = sc.nextLine();
        for (int i = 0; i < arrlist.size(); i++) {
            if (arrlist.get(i).FullName.equals(searchName)) {
                System.out.println("da xoa!");
                String updateName = sc.nextLine();
                Student std = new Student();
                std.FullName = updateName;
                arrlist.remove(i);
            } else {
                System.out.println("ten ban nhap khong co trong du lieu");
            }
        }
    }
}
