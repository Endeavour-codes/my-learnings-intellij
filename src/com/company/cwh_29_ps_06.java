//chapter 06 practise set video no 29

package com.company;

public class cwh_29_ps_06 {
    public static void main(String[] args) {
         //create an array of 5 floats
//float []marks={45.5f,55.5f,63.7f,99.2f,100.0f};
//float sum=0;
//for(float element:marks){
//    sum = sum + element;
//
//}
//        System.out.println("The value of sum is " +sum);



        //write a program to find out whether a given integer is present in an array

        int [] marks={22,23,24};
        int num = 23;
        boolean isInArray= false;
        for(float element:marks){
            if(num==element){
                isInArray= true ;
                break;
            }
        }
        if (isInArray){
            System.out.println("The value is present in the Array ");

        }
            else {
            System.out.println("The value is not present in array  Array");
        }
    }
}
