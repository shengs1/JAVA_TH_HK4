public class btvn1 {
    public static void main(String[] args) {
        int i,j;
        for(i = 1; i <= 4; i++){
            for(j = 1; j<=(i-1); j++)
            {
                System.out.print("\\\\");
            }

            //in dấu !; 18 là số lần in ban đầu + 2, 4 là hệ số print giảm * i, 
            for(j = 1; j <= (18-4*i); j++){
                System.out.print("!");
            }
            
            for(j = 1; j<=(i-1); j++)
            {
                System.out.print("//");
            } 
           
            System.out.println();
            
            
        }
    }
}
