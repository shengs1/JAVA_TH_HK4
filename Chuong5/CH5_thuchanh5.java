import java.util.Scanner;

public class CH5_thuchanh5 {
    public static void main(String[] args) {
        System.out.println("Day la chuong trinh doan so cho truoc.");
        System.out.println("Xin moi nhap so ma ban muon doan");

        int so = 42;

        Scanner console = new Scanner(System.in);
        int sodoan = console.nextInt();

        int cout = 0;

        while (sodoan!=so) { 
            System.out.println("Ban doan sai so roi (");

            int hit = 0;
            if((sodoan/10 == so /10) && (sodoan/10 == so %10)){
                hit++;
            }
            if((sodoan%10 == so %10) && (sodoan%10 == so %10)){
                hit++;
            }
            System.out.println("Ban da doan dung " + hit +" so) \n");
            System.out.println("Xin moi nhap lai");
            sodoan = console.nextInt();
            cout++;
        }
        System.out.println("Chuc mung ban da doan dung. So lan ban doan la " + cout + " lan");
    }
}
