package baitapngay1905;

import java.util.*;

class SinhVien {
    private String maSV;
    private String hoTen;
    private String lop;

    public SinhVien(String maSV, String hoTen, String lop) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getLop() {
        return lop;
    }
}

public class slide114 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, SinhVien> danhSachSinhVien = new HashMap<>();

        // Nhập danh sách n sinh viên
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng new line

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            System.out.print("Mã sinh viên: ");
            String maSV = scanner.nextLine();
            System.out.print("Họ và tên: ");
            String hoTen = scanner.nextLine();
            System.out.print("Lớp: ");
            String lop = scanner.nextLine();

            SinhVien sinhVien = new SinhVien(maSV, hoTen, lop);
            danhSachSinhVien.put(maSV, sinhVien);
        }

        // Nhập tên Lớp từ bàn phím và hiển thị sinh viên thuộc Lớp đó
        System.out.print("Nhập tên Lớp: ");
        String tenLop = scanner.nextLine();

        System.out.println("Danh sách sinh viên thuộc lớp " + tenLop + ":");
        for (SinhVien sv : danhSachSinhVien.values()) {
            if (sv.getLop().equalsIgnoreCase(tenLop)) {
                System.out.println("Mã sinh viên: " + sv.getMaSV());
                System.out.println("Họ và tên: " + sv.getHoTen());
                System.out.println("Lớp: " + sv.getLop());
                System.out.println();
            }
        }

        // Nhập Mã sinh viên từ bàn phím và hiển thị họ tên và Lớp tương ứng
        System.out.print("Nhập Mã sinh viên: ");
        String maSinhVien = scanner.nextLine();

        SinhVien sinhVien = danhSachSinhVien.get(maSinhVien);
        if (sinhVien != null) {
            System.out.println("Họ và tên: " + sinhVien.getHoTen());
            System.out.println("Lớp: " + sinhVien.getLop());
        }
    }
}