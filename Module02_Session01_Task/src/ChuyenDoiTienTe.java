import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        int rate = 23000;
        int USD;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào lượng USD cần đổi:");
        USD = scanner.nextInt();
        System.out.println("Tiền việt: " + (USD * rate) + "VND");

    }
}
