package main;

import shapes.hinhchunhat;
import shapes.hinhvuong;
import shapes.HinhTru;
import shapes.Htron;

// public class MainClass {
//     public static void main(String[] args) {
//         // lop hinh tron
//         Htron htron = new Htron();
//         htron.XuatTen();
//         htron.nhapBanKinh();
//         htron.tinhChuVi();
//         htron.tinhDienTich();
//         htron.InDienTic();
//         htron.InChuVi();

//         // lop hinh tru
//         HinhTru htru = new HinhTru();
//         htru.XuatTen();
//         htru.nhapChieuCao();
//         htru.tinhTheTich();
//         htru.InTheTich();

//         // lop hinh chu nhat
//         hinhchunhat hcn = new hinhchunhat();
//         hcn.XuatTen();
//         hcn.nhapChieuDai();
//         hcn.nhapChieuRong();
//         hcn.tinhChuVi();
//         hcn.tinhDienTich();
//         hcn.InDienTic();
//         hcn.InChuVi();

//         // lop hinh vuong
//         hinhvuong hinhvuong = new hinhvuong();
//         hinhvuong.XuatTen();
//         hinhvuong.nhapCanh();
//         hinhvuong.tinhChuVi();
//         hinhvuong.tinhDienTich();
//         hinhvuong.InDienTic();
//         hinhvuong.InChuVi();
//     }

// }

public class MainClass {
    public static void main(String[] args) {
        // Tạo đối tượng hình tròn
        Htron hinhTron = new Htron();
        hinhTron.setTen("Hình tròn");
        hinhTron.setBanKinh(5);
        System.out.println(hinhTron.getTen() + " có diện tích là " + hinhTron.tinhDienTich());
        System.out.println(hinhTron.getTen() + " có chu vi là " + hinhTron.tinhChuVi());

        // Tạo đối tượng hình trụ
        HinhTru hinhTru = new HinhTru();
        hinhTru.setTen("Hình trụ");
        hinhTru.setBanKinhDay(3);
        hinhTru.setChieuCao(4);
        System.out.println(hinhTru.getTen() + " có diện tích là " + hinhTru.tinhDienTich());
        System.out.println(hinhTron.getTen() + " có chu vi là " + hinhTru.tinhChuVi());

        // Tạo đối tượng hình chữ nhật
        hinhchunhat hinhChuNhat = new hinhchunhat();
        hinhChuNhat.setTen("Hình chữ nhật");
        hinhChuNhat.setChieuDai(6);
        hinhChuNhat.setChieuRong(4);
        System.out.println(hinhChuNhat.getTen() + " có diện tích là " + hinhChuNhat.tinhDienTich());
        System.out.println(hinhTron.getTen() + " có chu vi là " + hinhChuNhat.tinhChuVi());

        // Tạo đối tượng hình vuông
        hinhvuong hinhVuong = new hinhvuong();
        hinhVuong.setTen("Hình vuông");
        hinhVuong.setCanh(3);
        System.out.println(hinhVuong.getTen() + " có diện tích là " + hinhVuong.tinhDienTich());
        System.out.println(hinhTron.getTen() + " có chu vi là " + hinhVuong.tinhChuVi());
    }

}