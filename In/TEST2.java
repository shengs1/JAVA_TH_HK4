public class TEST2 {
    public static void main(String[] args) {
        System.out.println("+------+");
        Top();
        System.out.println("+------+");
        Bottom();
        System.out.println("+------+");
    }
    public static void Top() {
        for (int line = 1; line <= 3; line++) {
            System.out.print("|");
            for (int i = 1; i < line; i++) {
                System.out.print(" ");
            }
            System.out.print("\\");
            for (int i = 1; i <= (6 - 2 * line); i++) {
                System.out.print(".");
            }
            System.out.print("/");
            for (int i = 1; i < line; i++) {
                System.out.print(" ");
            }
            System.out.print("|");
            for (int i = 1; i < line; i++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void Bottom() {
        for (int line = 3; line >= 1; line--) {
            System.out.print("|");
            for (int i = 1; i < line; i++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int i = 1; i <= (6 - 2 * line); i++) {
                System.out.print(".");
            }
            System.out.print("\\");
            for (int i = 1; i < line; i++) {
                System.out.print(" ");
            }
            System.out.print("|");
            for (int i = 1; i < line; i++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void writespace(int number) {
        for(int i=1; i <= number; i++){
            System.out.print(" ");
        }
    }
}

