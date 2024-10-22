
import java.util.Random;
import java.util.Scanner;

public class CH5_thuchanh1{
    public static void main(String[] args) {
        System.err.println("DAy la chuong trinh tro choi doan chu");
        System.out.println("Sinh vien thuc hien: ");

        Random r = new  Random();
        int soao = r.nextInt(10)+1;

        System.err.println("Xin moi nhap so ma ban doan: ");
        try (Scanner console = new Scanner(System.in)) {
            int sodoan = console.nextInt();
            
            int cout = 1;
            while(soao!= sodoan){
                System.out.println("Rat tiec ban da doan sai. ");
                System.out.println("Xin moi nhap so ma ban doan: ");
                sodoan = console.nextInt();
                cout++;
            }
            System.out.println("___________");
            System.out.println("Chuc mung ban da doan dung. Ban da doan " + cout + " lan");
        }
    }
}