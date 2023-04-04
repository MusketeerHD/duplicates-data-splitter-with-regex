package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.logging.*;

public class DetailedChange {

    public static void main(String[] args) {

        String filename = "Detail_Change.csv";
        Stack originalList = new Stack<>();
        final Set ciSub = new HashSet();
        File file = new File(filename);

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String next = scanner.nextLine();
                String[] row = next.split(";");

                if (row.length != 0) {
                    originalList.add(next);

                    ciSub.add(row[0]);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DetailedChange.class.getName()).log(Level.SEVERE, null, ex);
        }
        List list = new ArrayList(originalList);
        Collections.sort(list);

        //List list = new ArrayList(allLine);
        Iterator itrAllline = ciSub.iterator();
        while (itrAllline.hasNext()) {
            System.out.println(itrAllline.next());
        }
        System.out.println("Sebelum Duplikat : "+originalList.size());
        System.out.println("Setelah Duplikat : "+ciSub.size());
    }
}