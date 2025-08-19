//video no 15 practise set

package com.company;

import com.sun.jdi.InconsistentDebugInfoException;

import java.util.Locale;

public class cwh_15_ps2 {
    public static void main(String[] args) {
//         problem 1
           String name= "VIKRANT BHAMARE ";
           name =  name.toLowerCase();
        System.out.println(name);

        //problem 2
        String text= "to lower case ";
        text = text.replace(" ","_");
        System.out.println(text);

        //problem 3

        String letter ="Dear <|name|> , thanks a lot! ";
        letter =letter.replace("<|name|>","vikrant");
        System.out.println(letter);

        //problem 4

        String myString = "This String contains  Double and triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        //problem 5

        String letter2="Dear vicky\n\t u doing great\n\t thanks!";
        System.out.println(letter2);



    }
}
