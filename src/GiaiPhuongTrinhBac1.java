
import java.util.Scanner;

public class GiaiPhuongTrinhBac1 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập số a: ");
        a = sc.nextInt();
        System.out.println("nhập số b: ");
        b = sc.nextInt();
        if(a == 0){
            if(b == 0){
                System.out.println(" phương trình có nghiệm duy nhất");
            } else {
                System.out.println(" phương trình vô nghiệm");
            }
        } else {
            float x = (float) -b/a;
            System.out.println(" phươn trình có nghiệm là: "+ x);
        }
    }
}
