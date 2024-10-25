
import java.util.Scanner;

public class CH6_thuchanh1{
    public static void main(String[] args) {
        System.out.println("Ban muon nhap nhiet do bao nhieu ngay? ");

        try (Scanner cosole = new Scanner(System.in)) {
            int days= cosole.nextInt();

            double sum =0;

            for(int i =1; i<= days; i++){
                System.out.println("Nhiet do ngay thu " + i + ": ");
                int next = cosole.nextInt();
                sum += next;
            }

            double trungbinh = sum / days;
            System.out.println("Nhiet do trung binh =" + trungbinh);
        }
    }
}