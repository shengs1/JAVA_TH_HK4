
import java.util.Random;
import java.util.Scanner;

public class CH5_thuchanh2 {
    public static void main(String[] args) {
        System.out.println("Day la chuong trinh tung 2 xuc sac.");
        System.out.println("Ban bam [p] hay [P] de choi [Q] hay [q] de thoat chuong trinh.");

        Random r=new Random();
        Scanner console = new Scanner(System.in);
        String bam=console.next();

        int cout = 1;
        int sum = 0;
        while(bam.equalsIgnoreCase("P"))
        {
            int xucsac1 = r.nextInt(7)+1;
            int xucsac2 = r.nextInt(7)+1;
            sum = xucsac1+xucsac2;
            if(sum == 7)
            {
                break;
            }
            System.out.println("Ban bam [p] hay [P] de choi [Q] hay [q] de thoat chuong trinh.");
            bam = console.next();
            if(bam.equalsIgnoreCase("Q"))
            {
                break;
            }
            cout++;
        }
        System.out.println("So lan ban da tung la: " + cout + " lan");
    }
}
