package com.company;

public class cwh_09_ch2_op_pre {
    public static void main(String[] args) {
//        int a = 6*5-34/2;
        /*
        highest precedence goes to * and /
        They are then evaluated on the basis from left to right
           =30-34/2
           =30-17
           =13    this is precedence
         */
 //       int b = 60/5-34*2;
        /* (here the precedence of * and / are equal)
           here the associativity of * / will be determined from left to right
            so the ans is
            =12-34*2
            =12-68
            =-56
         */
 //       System.out.println(b);
     //here in java there is no BODMAS the java uses precedence and associativity       like * has the upmost priority here


        //quick quiz
        int x=6;
        int y =1;
     //  int k= x * y/2;
        int b=1;
        int c=4;
        int a=5;
       int k= b*b - (4*a*c)/(2*a);
        System.out.println(k);


    }
}
