package com.company;
import java.util.Scanner;
public class chw_12_practiceset {
    public static void main(String[] args) {
//        float a = (7/4.0f) * (9/2.0f);
//        System.out.println(a);
//      Scanner sc= new Scanner(System.in);
//      int a= sc.nextInt();
//        System.out.println(a>8);
//     int x= 7;
//    int a = (7*49/7) + (35/7) ;
//        System.out.println(a);
               Scanner sc = new Scanner(System.in);
                System.out.println("What is value of V");
                float v = sc.nextFloat();
                System.out.println("What is value of U");
                float u = sc.nextFloat();
                System.out.println("What is value of A");
                float a = sc.nextFloat();
                float answer = (v*v)-(u*u)/(2*a*5);
                System.out.println(answer);
    }
}
