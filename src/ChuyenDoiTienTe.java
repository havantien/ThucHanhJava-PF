import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        double vn = 23000;
        double usd;
        Scanner sc= new Scanner(System.in);
        System.out.println("nhập vào số tiền usd");
        usd = sc.nextDouble();
        double quydoi = 23000*usd;
        System.out.println(" sô tiền việt nam là: " + quydoi);

    }
}
