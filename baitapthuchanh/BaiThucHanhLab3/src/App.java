import javax.swing.text.html.HTML;

public class App {
    public static void main(String[] args) throws Exception {
        ////// Hinh Tron///////
        System.out.println("---Thong tin hinh tron---");
        HinhTron ht = new HinhTron();
        ht.nhapBanKinh();
        ht.tinhChuVi();
        ht.tinhDienTich();
        ht.hienThiThongTin();
        ////// Hinh Tru Tron///////
        System.out.println("---Thong tin hinh tru tron---");
        HinhTruTron htt = new HinhTruTron();
        htt.nhapBanKinh();
        htt.nhapChieuCao();
        htt.tinhChuVi();
        htt.tinhDienTich();
        htt.tinhTheTich();
        htt.hienThiThongTin();
        ////// Nhan vien///////
        System.out.println("---Thong tin Nhan vien---");
        Nhanvien nv = new Nhanvien();
        nv.NhapThongTin();
        nv.TinhLuong();
        nv.HienThiThongTin();
    }
}
