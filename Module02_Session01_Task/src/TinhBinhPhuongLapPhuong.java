import java.util.Scanner;

public class TinhBinhPhuongLapPhuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        int a = sc.nextInt();
        System.out.println("Bình phương: " + a*a);
        System.out.println("Lập phương: " + a*a*a);
    }
}
