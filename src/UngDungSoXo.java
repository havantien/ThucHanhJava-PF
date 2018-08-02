
import java.util.Random;
import java.util.Scanner;

public class UngDungSoXo {
    public static void main(String[] args) {
        Random rd = new Random();
        int lottery = rd.nextInt(100);
        System.out.println("Kết quả xổ số hôm nay là: " + lottery);

        Scanner sc = new Scanner(System.in);
        int guessDigit1;
        int guessDigit2;
        do {
            System.out.print("Nhập vào chữ số đầu tiên: ");
            guessDigit1 = sc.nextInt();
            System.out.print("Nhập vào chữ số thứ hai: ");
            guessDigit2 = sc.nextInt();
            if (guessDigit1 < 0 || guessDigit1 > 9 || guessDigit2 < 0 || guessDigit2 > 9) {
                System.out.println("Chữ số không hợp lệ. Mời bạn nhập lại!");
            }
        } while (guessDigit1 < 0 || guessDigit1 > 9 || guessDigit2 < 0 || guessDigit2 > 9);

        int number1 = lottery/10;
        int number2 = lottery%10;

        if (guessDigit1 == number1 && guessDigit2 == number2) {
            System.out.print("$10000 đã được cộng vào tài khoản của bạn!");
        } else if (guessDigit1 == number2 && guessDigit2 == number1) {
            System.out.print("$3000 đã được cộng vào tài khoản của bạn!");
        } else if (guessDigit1 == number1 || guessDigit1 == number2 || guessDigit2 == number1 || guessDigit2 == number2) {
            System.out.print("$1000 đã đươc cộng vào tài khoản của bạn!");
        } else {
            System.out.print("Chúc bạn may mắn lần sau");
        }


    }
}