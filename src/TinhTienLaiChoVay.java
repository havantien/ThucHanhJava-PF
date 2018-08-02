import java.util.Scanner;

public class TinhTienLaiChoVay {
    public static void main(String[] args) {
        int month = 1;
        double monny = 1.0;
        double interset_rate = 1.0;
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập số tháng gửi");
        month = sc.nextInt();
        System.out.println(" nhập số tiền gửi");
        monny = sc.nextDouble();
        System.out.println(" nhập lãi suất");
        interset_rate = sc.nextDouble();
        double total_interset = 0;
        for (int i = 0; i < month; i++) {
            total_interset = monny * (interset_rate / 100 / 12) * 3;
        }
        System.out.println(" lãi suất nhận được: " + total_interset);
    }
}
