package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoopParse {


public static void main(String[] args) {
    int counter;
    int max = 10;
    ArrayList arResult = new ArrayList();
    String name;
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
                    name = extractCI_Name( nextElement.toString() );    //extract CI Name from long string
                    arResult.add(name);  //add string line into array list

//                        System.out.println(counter +"\t"+nextElement);
                    counter++;

                }
            }
        }
        System.out.println(arResult);

    } catch (FileNotFoundException ex) {
        Logger.getLogger(LoopFile.class.getName()).log(Level.SEVERE, null, ex);
    }

    Iterator itrAllline = arResult.iterator();
    while (itrAllline.hasNext()) {
        System.out.println(itrAllline.next());
    }
}
    private static String extractCI_Name(String string) {
        String[] splitString = string.split(";");

        return splitString[0];
    }
}