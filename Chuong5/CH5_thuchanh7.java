import java.util.Random;
import java.util.Scanner;

public class CH5_thuchanh7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Hay doan 1 con so tu 1-10");
        int dapan = console.nextInt();

        Random random = new Random();
        int solandoan = 0;
        int somaydoan = 0;
        String phanhoi;
        boolean dadoandung = false;
        

        while(!dadoandung){
            somaydoan = random.nextInt(10) + 1;
            solandoan++;

            System.out.println("Co phai la so " + somaydoan + "? (y/n)");
            phanhoi = console.nextLine();

            if(phanhoi.equalsIgnoreCase("y")){
                dadoandung = true;

                System.out.println("Toi da doan dung so lan cua ban sau " + solandoan + " lan");
            }
        }
        console.close();
    }
}
