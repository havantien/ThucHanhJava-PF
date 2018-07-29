import java.util.Scanner;

public class NhapDiemMonHoc {
    public static void main(String[] args) {
        float vatly;
        float hoahoc;
        float sinhhoc;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap diem vat ly");
        vatly = sc.nextFloat();
        System.out.println("nhap diem hoa hoc");
        hoahoc = sc.nextFloat();
        System.out.println("nhap diem sinh hoc ");
        sinhhoc = sc.nextFloat();
        float dtb = (vatly+hoahoc+sinhhoc)/3;
        System.out.println("diem trung binh cua 3 mon hoc" + dtb);
        float tong = vatly + hoahoc + sinhhoc;
        System.out.println("tong diem 3 mon hoc"+ tong);
    }
}
