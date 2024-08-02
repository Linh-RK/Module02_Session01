import java.util.Scanner;

public class TinhChuViDienTichHinhVuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width: ");
        int width = sc.nextInt();
        System.out.println("Enter height: ");
        int height = sc.nextInt();
        int C = (width*height)*2;
        int S = width*height;
        System.out.println("C = " + C);
        System.out.println("S = " + S);
    }
}
