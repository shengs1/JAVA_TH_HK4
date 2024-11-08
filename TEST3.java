public class TEST3 {
    public static void main(String[] args) {
        CH3_TH3();
    }
    public static void CH3_TH3() {
        for(int i = 1; i <= 20; i++){
            System.out.print("=");
        }
        System.out.println();
        for(int i = 1; i <= 11; i++){
            for(int j =1; j <= i; j++){
                System.out.print(">");
            }
            for(int j =1; j <= (20-2*i); j++){
                System.out.print(" ");
            }
            for(int j =1; j <= i; j++){
                System.out.print("<");
            }
            System.out.println("");
        }
    }
}
