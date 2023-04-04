package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LoopFile {

    public static void main(String[] args) {
        int counter;
        int max = 10;
        ArrayList arResult = new ArrayList();
        File file = new File("Detail_Change.csv");

        try {
            Scanner scannerFile  = new Scanner(file);

            counter = 1;
            while (scannerFile.hasNext()) {
                Object nextElement = scannerFile.nextLine();

                if(counter > max)
                    break;
                else{
                    if (counter == 1){
                        counter++;
                        continue;
                    }else{
                        arResult.add(nextElement);  //add string line into array list

                        System.out.println(counter +"\t"+nextElement);
                        counter++;
                    }
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(LoopFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}