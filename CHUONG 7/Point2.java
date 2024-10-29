public class Point2 {
    private int x;
    private int y;

    public Point2() {
        this.x =0;
        this.y =0;
    }
    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public double khoangcach() {
        return Math.sqrt(x*x+y*y);
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setLocation(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void dich(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }
    @Override
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
 

    public static void main(String[] args) {
        Point2 p = new Point2();
        p.x = 5;
        p.y = 6;
        System.out.println("Toa do bat dau: " + p);

        System.out.println("Khoang cach den goc toa do: " + p.khoangcach());

        p.dich(1,5);
        System.out.println("Toa do sau khi  dich chuyen: "+ p);
        System.out.println("Khoang cach den goc toa do khi thay doi: " + p.khoangcach());
    }

}
