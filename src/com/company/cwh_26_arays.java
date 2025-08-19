
//video no 26 and 27 cwh

package com.company;


public class cwh_26_arays {
    public static void main(String[] args) {
        //classroom of 500 students - yo have to store marks of these 500 students
        // tou have two option ;
 /*   1 create 500 variable
     use arrays (recommended)
     there are three main ways to create a java
     1 is declaration and memory allocation
     2 is declaration and then memory allocation
     3  is declaration, memory allocation and initialization together
  */
        // Using an array to store marks of 5 students
//        int[] marks = new int[5];
//        marks[0] = 100;
//        marks[1] = 60;
//        marks[2] = 70;
//        marks[3] = 80;
//        marks[4] = 90;
//        mark[5]=96; - throws an error because the array bound is of for 5
//        System.out.println(marks[4]);  // Accessing and printing the last mark

//        int[] marks = {90,45,65,67,99};
        //example of 3 declaration , memory allocation and initialization
        //marks [5] throws an error
//        System.out.println(marks[4]);


        //we gonna se array length in array
//        String[] students={"rahul","vicky","aryan","kanishk"};
//        System.out.println(students.length);
//        System.out.println(students[1]);


        int [] marks = {70,80,90,100};
     //   System.out.println(marks.length);
        //displaying The Array [naive way]
        System.out.println("printing using naive way ");
       System.out.println(marks[0]);
       System.out.println(marks[1]);
       System.out.println(marks[2]);
       System.out.println(marks[3]);

       //displaying The Array [for loop]
        System.out.println("printing using for loop ");
        for (int mark : marks) {
            System.out.println(mark);
        }

        //Displaying the array i reverse roder  loop
        System.out.println("printing in decrementing order ");
        for (int i= marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }


        // Displaying array For Each Loop
        System.out.println("printing For each loop ");
        for (int element:marks){
            System.out.println(element);
        }


        //how to make a multidimensional array
        //these multidimensional array are arrays of array
        //example of 2-D array
//        int[] marks;
//        int[][] flat;
//        flat = new int[2][3];
//        flat[0][0] = 101;
//        flat[0][1] = 102;
//        flat[0][2] = 103;
//        flat[1][0] = 201;
//        flat[1][1] = 202;
//        flat[1][2] = 203;
//        System.out.println("printing 2-D using loop");
//        for(int i=0;i< flat.length;i++){
//            for (int j=0;j<flat[i].length;j++){
//                System.out.print(flat[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println("");
//        }

    }

}
