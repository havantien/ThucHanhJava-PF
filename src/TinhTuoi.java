import java.util.Scanner;

public class TinhTuoi {
    public static void main(String[] args) {
        int ns;
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập vào năm sinh của bạn");
        ns = sc.nextInt();
        int tuoi = 2018 - ns;
        System.out.println("in ra tuổi  của  bạn là : "+ tuoi);
    }
}
