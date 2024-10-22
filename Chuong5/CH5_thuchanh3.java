import java.util.Scanner;

public class CH5_thuchanh3 {
    public static void main(String[] args) {
        System.out.println("Vui long nhap so (hoac -1 de ket thuc): ");
        Scanner console = new Scanner(System.in);
        
        int sum = 0;
        int nhap = 0;
        
        while (true) {
            nhap = console.nextInt();
            if (nhap == -1) {
                break;
            }
            sum += nhap;
            System.out.println("Vui long nhap so (hoac -1 de ket thuc): ");
        }
        
        System.out.println("Tong cac so = " + sum);
        console.close();
    }
}
