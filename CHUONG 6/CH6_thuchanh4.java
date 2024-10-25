public class CH6_thuchanh4 {
    public static void main(String[] args) {
        int[][] tamgiac = new int[10][];
        thietlaptamgiac(tamgiac);
        printmatran(tamgiac);
    }

    public static void thietlaptamgiac(int[][] tamgiac) {
        for (int i = 0; i < tamgiac.length; i++) {
            tamgiac[i] = new int[i + 1]; //thiet lập giá trị mảng của hàng
            tamgiac[i][0] = 1; //giá trị đầu của mảng
            tamgiac[i][i] = 1; // giá trị cuối của mảng

            for (int j = 1; j < i; j++) {
                tamgiac[i][j] = tamgiac[i - 1][j - 1] + tamgiac[i - 1][j];
            }
        }
    }

    public static void printmatran(int[][] tamgiac) {
        for (int i = 0; i < tamgiac.length; i++) 
        {
            //in lan lượt giá trị hàng i
            for (int j = 0; j < tamgiac[i].length; j++) {
                System.out.print(tamgiac[i][j] + " ");
            }
            //hết for xuống hàng
            System.out.println("");
        }
    }
}
