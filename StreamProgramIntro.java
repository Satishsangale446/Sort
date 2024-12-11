package StreamJava8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StreamProgramIntro {
    public static void main(String[] args) {

        ArrayList<String> listNames = new ArrayList<>(19);
        listNames.add("Prafful");
        listNames.add("Arti");
        listNames.add("Asha");
        listNames.add("Akshara");
        listNames.add("Ananya");
        listNames.add("Akash");
        listNames.add("Akshay");
        listNames.add("Animal");
        listNames.add("Abhay");
        listNames.add("Aditya");
        listNames.add("Lahu");
        listNames.add("Bhaskar");
        listNames.add("Karan");
        listNames.add("Omakar");
        listNames.add("Ashish");
        listNames.add("Ashwin");
        listNames.add("Ashwini");
        listNames.add("Akshada");
        listNames.add("Satish");
        listNames.add("Manoj");

        Collections.sort(listNames, Comparator.comparingInt(String::length));

        for (int i = 0; i < listNames.size(); i++){
            if (listNames.get(i).startsWith("A")){
                System.out.println(listNames.get(i) + "-" + listNames.get(i).length());
            }
        }


    }






}
