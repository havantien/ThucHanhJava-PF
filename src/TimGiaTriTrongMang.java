import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] student = {" Tien, TuanAnh, Tam, Dat, Sang, AnhSon, ChiThao, Long "};
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập tên sinh viên");
        String input_name = sc.next();
        boolean isExist = false;
        for(int i = 0; i < student.length; i++ ) {
            if (student[i].equals(input_name)) {
                System.out.println("Position of the students in the list " + input_name + " is: " + (i + 1));
                isExist = true;
                break;
                }
            }
            if( !isExist )
        System.out.println("Not found" + input_name + " in the list.");
        }

    }
