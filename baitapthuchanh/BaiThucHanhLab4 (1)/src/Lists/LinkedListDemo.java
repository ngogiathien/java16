package Lists;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDemo {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<Student>();

        // Thêm sinh viên
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập thông tin sinh viên thứ %d:\n", i + 1);
            System.out.print("Họ tên: ");
            String fullName = scanner.nextLine();
            System.out.print("Tuổi: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            Student student = new Student();
            student.FullName = fullName;
            student.Age = age;
            students.add(student);
        }

        // Hiển thị danh sách sinh viên
        System.out.println("Danh sách sinh viên:");
        for (Student student : students) {
            System.out.printf("Họ tên: %s, Tuổi: %d\n", student.FullName, student.Age);
        }

        // Xóa sinh viên
        System.out.print("Nhập họ tên sinh viên cần xóa: ");
        String fullNameToDelete = scanner.nextLine();
        Student studentToDelete = null;
        for (Student student : students) {
            if (student.FullName.equals(fullNameToDelete)) {
                studentToDelete = student;
                break;
            }
        }
        if (studentToDelete != null) {
            students.remove(studentToDelete);
            System.out.println("Đã xóa sinh viên: " + studentToDelete.FullName);
        } else {
            System.out.println("Không tìm thấy sinh viên có họ tên: " + fullNameToDelete);
        }

        // Sửa thông tin sinh viên
        System.out.print("Nhập họ tên sinh viên cần sửa: ");
        String fullNameToUpdate = scanner.nextLine();
        for (Student student : students) {
            if (student.FullName.equals(fullNameToUpdate)) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Thong tin moi:");
                System.out.println("Nhap ten ");
                String updateName = sc.nextLine();
                System.out.println("Nhap tuoi");
                int updateAge = sc.nextInt();
                Student Newstd = new Student();
                Newstd.FullName = updateName;
                Newstd.Age = updateAge;
                students.remove(student); // Xóa đối tượng cũ
                students.add(Newstd); 
                System.out.println("da sua ");

            }else {
                System.out.println("Không tìm thấy sinh viên có họ tên: " + fullNameToUpdate);
            }
        } 

        // Hiển thị danh sách sinh viên sau khi sửa và xóa
        System.out.println("Danh sách sinh viên sau khi sửa và xóa:");
        for (Student student : students) {
            System.out.printf("Họ tên: %s, Tuổi: %d\n", student.FullName, student.Age);
        }
    }
};
