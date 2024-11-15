
import java.util.ArrayList;
import java.util.Collections;

public class C9_TH3 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("four");
        words.add("score");
        words.add(" and");
        words.add(" seven");
        words.add(" years");
        words.add(" ago");
        


        for(String s: words) {
            System.out.println(s);
        }
        System.out.println();
        
        Collections.sort(words);
       
        for(String s: words) {
            System.out.println(s);
        }
    }
}
