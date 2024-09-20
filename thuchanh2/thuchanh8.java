public class thuchanh8 {
    public static void main(String[] args) {
        line();
        tophalf();

    }
    public static void line() {
        System.out.println("+------+");
    }
    public static void tophalf() {
        int i,j;
        for( i = 1; i <= 3; i++)
        {
            
            System.out.print("|");
            for(j = 1; j<=(i-1); j++)
            {
                System.out.print(" ");
            }
            System.out.print("\\");
            
            for (j=1;j<=(6-2*i);j++)
            {
                System.out.print(".");
            }
            System.out.print("/");
            for(j = 1; j<=(i-1); j++)
            {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println();
        }

        for( i = 3; i >= 1; i--)
        {
            System.out.print("|");
            for(j = 1; j<=(i-1); j++)
            {
                System.out.print(" ");
            }
            System.out.print("/");

            for(j = 1; j <=(i-1); j++)
            {
                System.out.print(" ");
            }
            for (j=1;j<=(6-2*i);j++)
            {
                System.out.print(".");
            }
            System.out.print("\\");
            for(j = 1; j <=(i-1); j++)
            {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("+---------+");
    } 
}
