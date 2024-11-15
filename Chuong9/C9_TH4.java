import java.io.*;
import java.util.*;


public class C9_TH4 {
    public static void main(String[] args) {
        ArrayList<String> ungvien = new ArrayList<>();
        ArrayList<String> phieubau = new ArrayList<>();

        try (Scanner input = new Scanner(new File("phieu.txt"))) {
            while (input.hasNext()) {
                String vote = input.next();
                phieubau.add(vote);


                for (char c : vote.toCharArray()) {
                    String name = String.valueOf(c);
                    if (!ungvien.contains(name)) {
                        ungvien.add(name);
                    }
                }
            }

            input.close();

            Collections.sort(ungvien);

            int[] demphieu = new int[ungvien.size()];

            for (String vote : phieubau) {
                for (int i = 0; i < vote.length(); i++) {
                    char candidate = vote.charAt(i);
                    int index = ungvien.indexOf(String.valueOf(candidate));
                    if (index != -1) {
                        demphieu[index]++;
                    }
                }
            }

            int maxVotes = 0;
            String winner = "";
            for (int i = 0; i < demphieu.length; i++) {
                if (demphieu[i] > maxVotes) {
                    maxVotes = demphieu[i];
                    winner = ungvien.get(i);
                }
            }

            int totalVotes = phieubau.size();

            System.out.printf("%-10s%-10s%-10s\n", "Ung vien", "So phieu", "Ty le bau (%)");

            for (int i = 0; i < ungvien.size(); i++) {
                double percentage = (totalVotes > 0) ? (double) demphieu[i] / totalVotes * 100 : 0.0;
                System.out.printf("%-10s%-10d%-10.2f\n", ungvien.get(i), demphieu[i], percentage);
            }

            System.out.println("Nguoi Chien Thang La: " + winner);
            
            System.out.println("Danh sach ung vien: " + ungvien);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
