import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        int nam;
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập năm");
        nam = sc.nextInt();
//        if(year % 4 == 0){
//            if(year % 100 == 0){
//                if(year % 400 == 0){
//                    System.out.printf("%d is a leap year", year);
//                } else {
//                    System.out.printf("%d is NOT a leap year", year);
//                }
//            } else {
//                System.out.printf("%d is a leap year", year);
//            }
//        } else {
//            System.out.printf("%d is NOT a leap year", year);
//        }
        if(nam % 4 == 0){
            if(nam % 100 == 0){
                if(nam % 400 == 0 ){
                    System.out.println(" là năm nhuận");
                } else {
                    System.out.println(" không là năm nhuận");
                    }
                } else{
                    System.out.println(" là năm nhuận");
                    }
                } else {
                    System.out.println(" không là năm nhuận");
        }
    }
}
