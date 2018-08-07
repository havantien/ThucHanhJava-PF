import java.util.Scanner;

public class TimMax {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(" nhập size: ");
            size = sc.nextInt();
            if ( size > 20 )
                System.out.println(" kích thước không vượt quá 20");
            } while ( size > 20 );
            array = new int[size];
            int i = 0;
            while (i < array.length) {
                System.out.print("nhập phần tử" + (i + 1) + " : ");
                array[i] = sc.nextInt();
                i++;
            }
            System.out.print("danh sách: ");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + "\t");
            }
            int max = array[0];
            int index = 1;
            for (int j = 0; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    index = j + 1;
                }
            }
            System.out.println("giá trị lớn nhất " + max + " ,vị trí " + index);

        }
    }
