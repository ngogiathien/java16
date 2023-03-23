import java.util.Scanner;

public class Bai3 {
    // Viết chương trình nhập vào tên và một số tương ứng là năm. Sau đó xuất ra
    // nhóm tuổi của người đó như sau:
    // Nếu tuổi người đó < 16 thì hiện thông báo "Bạn [Tên] ở độ tuổi vị thành
    // niên". 
    // Nếu tuổi người đó >= 16 và nhỏ hơn 18 thì hiện thông báo "Bạn [Tên] ở độ tuổi
    // trưởng thành". 
    // Nếu tuổi người đó >= 18 thì hiện thông báo "Bạn [Tên] đã già". 
    public static void main(String[] args) throws Exception {
       
        int tuoi;
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap ten cua ban:");
       String ten = sc.nextLine();
        do{
            System.out.printf("nhap tuoi cua ban:");
            tuoi = sc.nextInt();
        }while(tuoi<0 || tuoi>150);
        if(tuoi< 16){
            System.out.println("Bạn "+ ten+" ở độ tuổi vị thàn niên");
        }else if(tuoi >=16 && tuoi <18){
            System.out.println("Bạn "+ ten+" ở độ tuổi trưởng thành");
        }
        else{
            System.out.println("Bạn "+ ten +" da gia");
        }
        

    }
}
