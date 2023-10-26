package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //programlama
        //eleimizdeki ham verinin yönetilerek yazılım ürününe çeviririz.

        //Programming Consepts

        //variables - değişkenler

        //type-safe
        String text = "Merhaba, Tobeto";
        Integer number=10;
        int number2 = 15;
        //RAM'de tutuluyorlar.
        System.out.println(text);
        System.out.println(number);
        System.out.println(number2);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers);

        //scope => kapsam, alan

        if(1==1)
        {
            System.out.println(numbers);
            String text2 = "Merhaba";
        }
        else {
            System.out.println("Koşul yanlış");}

            //Sart blokları

            //mantıksal operatorlerle karşılaştırma yapmak
            int number3=1;
            int number4=2;
            if(number3>number4) //boolean değer çıkarır true yada false
            {
               System.out.println("Number 3 daha büyük.");
            }
            else {
                System.out.println("Number 3 daha küçük.");
        }
        }
    }
}