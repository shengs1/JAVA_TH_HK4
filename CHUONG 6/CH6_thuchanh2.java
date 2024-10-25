import java.util.Scanner;

public class CH6_thuchanh2 {
    public static void main(String[] args) {
        System.out.println("Ban muon nhap nhiet do bao nhieu ngay? ");

        try (Scanner cosole = new Scanner(System.in)) {
            int days= cosole.nextInt();

            double[] dayso = new double[days];

            double sum =0;

            for(int i =0; i < days; i++){
                System.out.println("Nhiet do ngay thu " + (i + 1) + ": ");
                int next = cosole.nextInt();
                sum += next;
                dayso[i] =next;
            }

            double trungbinh = sum / days;

            int cout =0;
            for(int i =0; i<dayso.length-1;i++){
                if(dayso[i] > trungbinh){
                    cout ++;
                }
            }

            System.out.println("Nhiet do trung binh = " + trungbinh);
            System.out.println("So ngay lon hon trung binh = " + cout);
        }
    }
}
