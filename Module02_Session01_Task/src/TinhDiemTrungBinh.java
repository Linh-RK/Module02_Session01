import java.util.Scanner;

public class TinhDiemTrungBinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập điểm toán: ");
        int toan = sc.nextInt();
        System.out.println("Mời bạn nhập điểm văn: ");
        int van = sc.nextInt();
        System.out.println("Mời bạn nhập điểm anh: ");
        int anh = sc.nextInt();
        float sum = toan + van + anh;
        float average = sum / 3;
        System.out.println("Tổng điểm: "+ sum);
        System.out.println("Điêm trung bình: " + average);
    }
}
//Viết chương trình nhập từ bàn phím 3 số thực điểm Toán, Văn, Anh. Tính tổng điểm và điểm trung bình và in kết quả ra màn hình console (chính xác tới 2 số thập phân)
//Hướng dẫn :
//Bước 1: Tạo dự án mới và khai báo hàm main()
//Bước 2: Nhập điểm 3 môn Toán, Văn, Anh.
//Bước 3: Tính tổng điểm 3 môn và điểm trung bình
//Bước 4: In kết quả ra màn hình.