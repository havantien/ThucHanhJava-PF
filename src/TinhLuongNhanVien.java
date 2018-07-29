import java.util.Scanner;

public class TinhLuongNhanVien {
    public static void main(String[] args) {
        int hs;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập hệ số lương");
        hs = sc.nextInt();
        System.out.println("nhập năm làm việc");
        n = sc.nextInt();
        int luong = hs*4000000+n*500;
        System.out.println(" lương của nhân viên: " +luong);
    }
}
