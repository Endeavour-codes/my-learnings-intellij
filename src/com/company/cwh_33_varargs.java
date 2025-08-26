package com.company;

public class cwh_33_varargs {
//    static int sum(int a, int b ) {
//        return a + b;
//    }
//    static int sum(int a, int b, int c ) {
//        return a + b + c ;
//    }
    static int sum(int ...arr){
     //  available as  int [] arr;
        int result=0;
        for (int a: arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
            System.out.println("welcome to varargs");
        System.out.println("If the sum contains nothing then return:" + sum());
            System.out.println("The sum of 4 and 5 is:" + sum( 4,5));
            System.out.println("The sum of 4,3 and 5 is:" + sum( 4,3,5));
            System.out.println("The sum of 4.3 and 5 is: " + sum( 2,4,3,5));


            // A function with varargs can be created in java using the following syntax shown

        // you don't have to always make a special method for each var  simply using that syntax you can simply pull all variables in one arr
       //if you out nothing in the sum it will simply return 0 o output
    }
}
