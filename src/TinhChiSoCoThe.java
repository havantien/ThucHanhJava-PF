import java.util.Scanner;

public class TinhChiSoCoThe {
    public static void main(String[] args) {
        double weight;
        double height;
        double bmi;
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập cân nặng");
        weight = sc.nextDouble();
        System.out.println(" nhập chiều cao");
        height = sc.nextDouble();
        bmi = weight / Math.pow(height, 2);
        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
         else if
            (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
         else if
            (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
         else
            System.out.printf("%-20.2f%s", bmi, "Obese");

    }
}
