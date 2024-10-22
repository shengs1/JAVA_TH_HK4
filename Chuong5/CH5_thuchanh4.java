
import java.util.Scanner;

public class CH5_thuchanh4 {
    public static void main(String[] args) {
        System.out.println("Day la chuong trinh doan so cho truoc.");
        System.out.println("Xin moi nhap so ma ban muon doan");

        int so=42;

        Scanner console = new Scanner(System.in);
        int sodoan = console.nextInt();

        int cout = 0;

        while (sodoan!=so){
            System.out.println("Ban da doan sai so roi. Xin moi nhap lai");
            sodoan = console.nextInt();
            cout++;
        }
        System.out.println("Chuc mung ba da doan dung. So lan ban da doan la " + cout + " lan");
    }
}
