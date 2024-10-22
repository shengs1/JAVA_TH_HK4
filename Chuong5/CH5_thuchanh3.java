
import java.util.Scanner;

public class CH5_thuchanh3 {
    public static void main(String[] args) {
        System.out.println("Vui long nhap so: ");
        Scanner console = new Scanner(System.in);
            int nhap=console.nextInt();
            
            int sum = 0;
            while(nhap != -1){
                if(nhap == -1){
                    break;
                }
                else{
                    for(int i = 1; i <= nhap; i++)
                    {
                        System.out.println("Nhap so thu " + i + ": ");
                        int number = console.nextInt();
                    
                        sum += number;
                    
                        System.out.println("So #" + i + " = " + number);
                    }
                }
            }
            System.out.println("Tong cac so= " +  sum);
    }
}
