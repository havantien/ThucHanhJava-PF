import java.util.Scanner;

public class TinhNgayTrongThang {
    public static void main(String[] args) {
        int thang;
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập tháng trong năm");
        thang = sc.nextInt();
        switch (thang){
            case 1:
                System.out.println(" tháng 1 có 31 ngày");
                break;
            case 2:
                System.out.println(" tháng 2 có 28 hoặc 29 ngày");
                break;
            case 3:
                System.out.println("tháng 3 có 31 ngày");
                break;
            case 4:
                System.out.println(" tháng 5 có 30 ngày");
                break;
            case 5:
                System.out.println(" tháng 5 có 31 ngày");
                break;
            case 6:
                System.out.println(" tháng 6 có 30 ngày");
                break;
            case 7:
                System.out.println(" tháng 7 có 30 ngày");
                break;
            case 8:
                System.out.println(" tháng  8 có 31 ngày");
                break;
            case 9:
                System.out.println(" tháng 9 có 30 ngày");
                break;
            case 10:
                System.out.println(" tháng 10 có 31 ngày ");
                break;
            case 11:
                System.out.println(" tháng 11 có 30 ngày");
                break;
            case 12:
                System.out.println(" tháng 12 có 31 ngày");
                break;
        }
    }
}
