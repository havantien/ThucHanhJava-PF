import java.util.Scanner;

public class TinhSvaCHinhTron {
    public static void main(String[] args) {
//        System.out.println("tinh chu vi dien tich hinh tron");
        double cv;
        double pi = 3.14;
        double s;
        Scanner sc = new Scanner(System.in);
//        cv = sc.nextDouble();
//        s = sc.nextDouble();
        System.out.println(" nhap vap ban kinh duong tron");
        double r = sc.nextDouble();
        cv = 2 * r * pi;
        System.out.println(" in re chu vi hinh tron"+ cv);
        s = r * r * pi;
        System.out.println(" in ra dien tich hinh tron"+ s);
    }
}
