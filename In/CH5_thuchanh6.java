
import java.util.Scanner;

public class CH5_thuchanh6 {
    public static void main(String[] args) {
        int dapan = 10;

        System.out.println("Vui long nhap so ban doan tu 0-99");
        Scanner console = new Scanner(System.in);
        int sodoan = console.nextInt();

        int cout = 0;

        while((sodoan < 0 || sodoan >= 100)){
            System.out.println("So ban da nhap vuot qua cho phep");
            System.out.println("Xin moi nhap so ma ban muon doan [0-99]");
            sodoan =console.nextInt();
            cout++;
            if(sodoan == dapan){
                System.out.println("Chuc mung ban da doan dung");
                break;
            }
            else{
                int correctDigits = demsodung(dapan,sodoan);
                System.out.println("So ban da doan sai. So ky tu dung: " + correctDigits);
            }
            System.out.println("ban da doan dung sau: " + cout + " lan");
            console.close();
        }
    }
    public static int demsodung(int dapan, int sodoan){
        String secret = String.format("%02d", dapan);
        String sodoann = String.format("%02d", sodoan);

        int correctDigits = 0;
        for (int i = 0; i < secret.length(); i++){
            if(secret.charAt(i) == sodoann.charAt(i)){
                correctDigits++;
            }
        }
        return correctDigits;
    }
}
