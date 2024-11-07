public class TEST4 {
    public static void main(String[] args) {
        int n = 5;
        tamgiac(n);
        thantenlua(n);
        vietnam(n);
        thantenlua(n);
        tamgiac(n);
    }

    public static void tamgiac(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("     /\\");
            System.out.print("       ");
        }
        
        System.out.println();
  
        for (int i = 0; i < n; i++) {
            System.out.print("    /  \\");
            System.out.print("      ");
        }
       
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print("   /    \\");
            System.out.print("     ");
        }
        System.out.println();
    }

    public static void thantenlua(int n) {
        for(int i = 0; i < n; i++){
            System.out.print("  +------+");
            System.out.print("    ");
        }
        System.out.println();
        
        for(int i = 0; i < n; i++) {
            System.out.print("  |      |");
            System.out.print("    ");
       
        }
        System.out.println();

        for(int i = 0; i < n; i++) {
            System.out.print("  |      |");
            System.out.print("    ");
        }
        System.out.println();

        for(int i = 0; i < n; i++){
            System.out.print("  +------+");
            System.out.print("    ");
        }
        System.out.println();
    }

    public static void vietnam(int n) {
        for(int i = 0; i < n; i++){
            System.out.print("  |  viet|");
            System.out.print("    ");
        }
        System.out.println();

        for(int i = 0; i < n; i++){
            System.out.print("  |   nam|");
            System.out.print("    ");
        }
        System.out.println("");
    }
}

