package baitapngay1905;

import java.util.LinkedList;
import java.util.Scanner;

class Student {
    private String name;
    private double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }
}

public class slide112 {
    public static void main(String[] args) {
        LinkedList<Student> studentList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        // Thêm sinh viên vào danh sách
        System.out.println("Nhập số sinh viên cần nhập:");
        int n = scanner.nextInt();
        for(int i = 0; i<n; i++){
            System.out.printf("sinh viên thứ: %d \n",i+1);
            System.out.print("Tên sinh viên: \n");
            String name = scanner.next();
            System.out.print("Điểm sinh viên: \n");
            double score = scanner.nextDouble();   
            Student student = new Student(name, score);
            studentList.add(student);
        }
    

        // Đếm số sinh viên phải thi lại và hiển thị thông tin của những sinh viên đó ra
        System.out.println("Sinh viên phải thi lại:");
        int countRetake = 0;
        for (Student student : studentList) {
            if (student.getScore() <= 5) {
                System.out.println("Tên: " + student.getName() + ", Điểm: " + student.getScore());
                countRetake++;
            }
        }
        System.out.println("Tổng số sinh viên phải thi lại: " + countRetake);

        // Hiển thị sinh viên có điểm cao nhất
        double maxScore = Double.MIN_VALUE;
        System.out.println("Sinh viên có điểm cao nhất:");
        for (Student student : studentList) {
            if (student.getScore() > maxScore) {
                maxScore = student.getScore();
            }
        }
        for (Student student : studentList) {
            if (student.getScore() == maxScore) {
                System.out.println("Tên: " + student.getName() + ", Điểm: " + student.getScore());
            }
        }

        // Tìm kiếm sinh viên theo tên và hiển thị thông tin sinh viên vừa tìm được
        System.out.print("Nhập tên sinh viên cần tìm: ");
        String searchName = scanner.next();
        boolean found = false;
        for (Student student : studentList) {
            if (student.getName().equals(searchName)) {
                System.out.println("Thông tin sinh viên:");
                System.out.println("Tên: " + student.getName() + ", Điểm: " + student.getScore());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sinh viên có tên \"" + searchName + "\"");
        }
    }
}

