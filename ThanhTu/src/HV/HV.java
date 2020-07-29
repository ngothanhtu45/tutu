package HV;
import java.util.Scanner;
public class HV {
	protected int chieuDaiCanh;
    public static double tinhDienTich(double chieuDaiCanh) {
        return chieuDaiCanh * chieuDaiCanh;
    }
    public static double tinhChuVi(double chieuDaiCanh){
        return chieuDaiCanh * 4;
    }
    public static void main(String[] args) {
        double canh;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài cạnh hình vuông: ");
        canh = scanner.nextDouble();
        System.out.println("Diện tích hình vuông là: " + tinhDienTich(canh));
        System.out.println("Chu vi hình vuông là: "+ tinhChuVi(canh));
        System.out.println("----------------------------");
        System.out.println("Chương trình nay được đăng tại Freetuts.net");
    }
}
