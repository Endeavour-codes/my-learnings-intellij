//video no 19


package com.company;

import java.util.Scanner;

public class cwh_19_ps_04 {
    public static void main(String[] args) {
 //       Question 1

//           int a = 10;
//          if (a == 11) {
//            System.out.println("I am 11");
//        }
//        else {
//            System.out.println("I am not 11");
//        }


 //                    Question 2
//            byte m1,m2,m3;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your marks in Physics ");
//          m1= sc.nextByte();
//
//        System.out.println("Enter your marks in Physics ");
//        m2= sc.nextByte();
//
//        System.out.println("Enter your marks in Physics ");
//        m3= sc.nextByte();
//
//        float avg = (m1+m2+m3)/3.0f;
//        System.out.println("Overall percentage is;"+avg );
//
//        if(avg>40 && m1>=33 && m2>=33 && m3>=33 ){
//            System.out.println("Congratulation you have been promoted");
//        }
//        else {
//            System.out.println("Sorry ,you have been not promoted");
//        }


 //       Question 3


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income in lacks per annum");
        float tax = 0;
        float income= sc.nextFloat();

        if (income < 2.5) {
            tax = tax + 0;
        }

        if (income> 2.5f && income <= 5f) {
            tax = tax + 0.05f * (income - 2.5f);                                     //pleas revise this code u should be better grasp in mathematics in here for conversion
        }

        if (income> 5.0f && income <= 10f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.02f * (income - 2.5f);
        }

        if (income > 10f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.02f * (10.0f - 2.5f);
            tax = tax + 0.03f * (income - 10.0f);

        }
        System.out.println("Thr total tax paid by the employee is:"+tax);



//                         Question no. 4
//         Scanner sc=new Scanner(System.in);
//        int day= sc.nextInt();
//        switch(day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thrusday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//
//
//        }
//
// //                     Question 5
//        Scanner sc= new Scanner(System.in);
//        String website=sc.next();
//        if(website.endsWith(".org")) {
//            System.out.println("THis is an Organisation website");
//        }
//        if(website.endsWith(".in")) {
//            System.out.println("THis is an Indian  website");
//        }
//        if(website.endsWith(".com")) {
//            System.out.println("THis is an commercial  website");
//        }


    }

}