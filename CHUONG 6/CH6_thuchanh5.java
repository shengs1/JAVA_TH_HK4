import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CH6_thuchanh5 {
    public static void main(String[] args) {
        int[] count = new int[5]; // đếm các phần tử từ 0 - 4

        try {
            File file = new File("tally.txt");
            try (Scanner input = new Scanner(file)) {
                while (input.hasNextInt()) {
                    int next = input.nextInt();
                    count[next]++; // next = so thu tu mang            
                }
            }                                     

            System.out.println("Gia tri\tSo luong");
            for (int i = 0; i < count.length; i++) {
                System.out.println(i + "\t" + count[i]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("ko tiem thay file");
        }
    }
}
