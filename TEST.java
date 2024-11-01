public class TEST {
    public static void main(String[] args) {
        System.out.println("+-------+");
        vehinh();
        System.out.println("+-------+");
        vehinh2();
        System.out.println("+-------+");
        System.out.println();
    }
    public static void vehinh() {
        for(int i = 1; i <= 4; i++){
            System.out.print("|");
            for(int j = 1; j <= (i - 1); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (9 - 2 * i); j++){
                System.out.print("*");
            }
            for(int j = 1; j <= (i - 1); j++){
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println();
        }
    }
    public static void vehinh2() {            
        for(int i = 4; i >= 1; i--){ 
            System.out.print("|");     
            for(int j = 1; j <= (i - 1); j++){   
                System.out.print(" ");   
            }    
            for(int j = 1; j <= (9 - 2 * i); j++){  
                System.out.print("*");  
            }
            for(int j = 1; j <= (i - 1); j++){
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println();        
        }                                                           
    }  
}
