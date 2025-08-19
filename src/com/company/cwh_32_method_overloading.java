package com.company;

public class cwh_32_method_overloading {
//    static void change1(int a){
//        a=98;
//    }
//    static void change2( int[] arr ) {
//        arr[0] = 98;
//    }
//    static void tellJoke(){
//        System.out.println("I invented a new word!\n" +
//                "plagirism!");
//    }
//
//    public static void main(String[] args) {
//       tellJoke();
//
//
//     // case 1 changing the integer
//        // int [] marks = {52, 72, 77, 89, 98 ,94};
//       int x =45 ;
//      change1(x);
//        System.out.println("The value of x after running change is -  " + x);
//
//
//        // case 2 changing the array
//        int [] marks = {52, 72, 77, 89, 98 ,94};
//        change2(marks);
//        System.out.println("The value of x after running change is - " + marks[0]);

                                   //method overloading


        static void foo(){
            System.out.println("Good morning bro ");
        }
        static void foo( int a ){
            System.out.println("Good morning " +  a  + " bro ");
        }

    public static void main(String[] args) {
        foo();

        //arguments are actual!


    }
 }

