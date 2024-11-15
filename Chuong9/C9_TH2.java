
import java.util.ArrayList;

public class C9_TH2 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(13);
        list.add(47);
        list.add(15);
        list.add(9);
        list.add(5);
        list.add(2);
        list.add(89);
        int sum = 0;

        for(Integer s: list){
            sum += s;
        }
        
        System.out.println("Total of lengths = " + sum);
    }
}