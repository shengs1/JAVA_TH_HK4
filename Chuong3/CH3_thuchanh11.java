public class CH3_thuchanh11 {
    public static void main(String[] args) {
        caythong();
    }

    public static void caythong() {
        // Phần đầu của cây
        for (int i = 4; i >= 1; i--) {
            // In khoảng trắng để căn giữa phần đầu
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            // In các dấu "*" tạo phần lá cây
            for (int j = 1; j <= (9 - 2 * i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Phần dưới của cây
        for (int i = 3; i >= 1; i--) {
            // In khoảng trắng để căn giữa phần dưới
            for (int j = 1; j <= (i - 1); j++) {
                System.out.print(" ");
            }
            // In các dấu "*" tạo phần dưới của cây
            for (int j = 1; j <= (11 - 2 * i); j++) { // Điều chỉnh để có cùng số sao
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
