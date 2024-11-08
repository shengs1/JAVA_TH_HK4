import java.util.Scanner;

public class CH3_thuchanh12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ngay dau tien cua thang (1=Chu Nhat, 2=Thu Hai, ..., 7=Thu Bay): ");
        int startDay = scanner.nextInt();

        System.out.print("Nhap so ngay trong thang: ");
        int daysInMonth = scanner.nextInt();

        System.out.println("+----+----+----+----+----+----+----+");
        System.out.println("| Sun| Mon| Tue| Wed| Thu| Fri| Sat|");
        System.out.println("+----+----+----+----+----+----+----+");

        int currentDay = 1;
        for (int i = 1; i < startDay; i++) {
            System.out.print("|    ");
            currentDay++;
        }

        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("| %2d ", day);

            if (currentDay % 7 == 0) {
                System.out.println("|");
                System.out.println("+----+----+----+----+----+----+----+");
            }
            currentDay++;
        }

        if ((currentDay - 1) % 7 != 0) {
            while ((currentDay - 1) % 7 != 0) {
                System.out.print("|    ");
                currentDay++;
            }
            System.out.println("|");
            System.out.println("+----+----+----+----+----+----+----+");
        }

        scanner.close();
    }
}
