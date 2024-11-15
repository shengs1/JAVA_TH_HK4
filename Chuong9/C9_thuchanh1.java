
import java.util.ArrayList;

public class C9_thuchanh1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Hoa");
        names.add("Mai");
        names.add("Dung");
        names.add("Hoang");
        names.add("Hai");
        names.add("Vinh");
        names.add("Tu");
        names.add("Bao");
        names.add("Anh");
        names.add(2,"Tung");
        names.add("Oanh");
        System.out.println("Gia tri tai vi tri 7: " + names.get(7));
        System.out.println("Chieu dai cua mang tren: " + names.size());
        names.remove(3);
        names.remove(6);
        names.set(2, "Toang");
        System.out.println("Chieu dai cua day: " + names.size());
        System.out.println("Danh sach: " + names);
    }
}