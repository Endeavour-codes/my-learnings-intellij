// video no 14 cwh

package com.company;

public class cwh_14_stringmethod {
    public static void main(String[] args) {
        String name = "Harry";
       int  value = name.length();
        System.out.println(value);

//      String lString = name.toLowerCase();   // using this the all upper case will replace to lower case
//        System.out.println(lString);
//
//        String uString = name.toUpperCase();
//        System.out.println(uString);         // the all characters will be replaced in upper cases as shown in the output
//
//        String nontrimmedString = "  vicky   ";  //this print as it is including space
//        System.out.println(nontrimmedString);
//        String trimmedString =nontrimmedString.trim();  //here trim returns the new string after removing all the leading and trailing spaces as shown in the result
//        System.out.println(trimmedString);

//        System.out.println(name.substring(3));  // index trim has the ry in this position i.e ry
//        System.out.println(name.substring(1,4));         // only the remaining words will be displayed
//
//        System.out.println(name.replace('r','p'));   //it replaces the one char to the other ie harrry turns to happy as the r is replaced to p
//        System.out.println(name.replace("rry", "ppier"));
//
//        System.out.println(name.startsWith("Har"));           // it can be also shown to show in boolean manner
//        System.out.println(name.endsWith("y"));              // true because it do ends with y though

//        System.out.println(name.charAt(3));   // it will show the char whos the particularity word is placed i.e r
//        System.out.println(name.indexOf("ry"));    // now it will show the index no in the output s total opp result of name.charAt

        String modifiedname = "harryrry";
       System.out.println(modifiedname.indexOf("rry"));
       System.out.println(modifiedname.indexOf("rry",4));

        System.out.println(modifiedname.lastIndexOf("rry",4));

        System.out.println(name.equals("Harry"));
        System.out.println(name.equalsIgnoreCase("harRy"));   // it ignore cases and only matches the input vs the written value

        System.out.println("i am escape sequence \" double quote");




    }
}
