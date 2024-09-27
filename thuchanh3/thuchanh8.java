import java.util.Scanner;

public class thuchanh8 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Xin moi nhap canh a: ");
        double a=console.nextDouble();

        System.out.println("Xin moi nhap canh b: ");
        double b=console.nextDouble();

        System.out.println("Xin moi nhap canh c: ");
        double c=console.nextDouble();

        System.out.println("chu vi la: " + tinhchuvi(a, b, c));
        System.out.println("nua chu vi la: " + tinhnuachuvi(a, b, c));
        System.out.println("dien tich la: " + tinhdientich(a, b, c));

        console.close();
    }
    public static double tinhchuvi(double a, double b, double c) {
        double p = a + b + c;
        return p;
    }
    public static double tinhnuachuvi(double a, double b, double c) {
        tinhchuvi(a, b, c);
        double p = tinhchuvi(a, b, c) /2;
        return p;
    }
    public static double tinhdientich(double a, double b, double c) {
        tinhchuvi(a,b,c);
        double p = tinhchuvi(a, b, c);
        double tinhdientich = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return tinhdientich;
    }
}
