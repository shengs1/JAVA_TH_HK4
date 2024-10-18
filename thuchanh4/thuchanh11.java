public class thuchanh11 {
    public static void main(String[] args) {
        int rows = 11;

        for (int i = 0; i < rows; i++) {
            int number = 1;

            // Print leading spaces for center alignment
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.printf("%4s", " ");
            }

            // Print the numbers in Pascal's Triangle
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", number);
                number = number * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}
