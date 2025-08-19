//code with harry playlist of java
// video no 5
// topic ; getting user input in java

//   package com.company;
//   import javax.swing.plaf.basic.BasicColorChooserUI;
//   import java.util.Scanner;
//   public class CWH_05_takinginput {
//    public static void main(String[] args) {    //just write main the system will automatically write the public syntax for u
//        System.out.println("taking input from the user");   //simply write t=scout for system.out,println syntax'
//        Scanner sc = new Scanner(System.in);
        //when we write new scanner it means i want to make a new instance of that perticullar
        //class or eg i want to make a new object
//        System.out.println("Enter number 1");
//        System.out.println(b1);
//        int a = sc.nextInt();  //we can also write it ini a float format eg
//        //float a = sc.nextFloat()   //this is for adding the decimal class
//        System.out.println("Enter number 2");
//        int b = sc.nextInt();
//        //float a = sc.nextFloat() //this is for adding the decimal class
//        int sum = a+b;
//        System.out.println("sum of these numbers is");
//        System.out.println(sum);


//        boolean b1 = sc.hasNextInt();  //rn u not gonna use this more frequently
//        System.out.println(b1);  // this is being used when you want to lean a validity of a expression
//       String str = sc.next();     //use this for only a single character read
//        String str = sc.nextLine(); // use this for total sentence read
//        System.out.println(str);

//    }
// }


//write a program to sum 3 numbers    ( this code is my first successful question solved )
package com.company;
     import java.util.Scanner;
     public class CWH_05_takinginput {
        public static void main(String[] args) {
            System.out.println("Taking Input From THe User ");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number 01");
            System.out.println("a");
            float a = sc.nextFloat();
            System.out.println("Enter Number 02");
            System.out.println("b");
            float b = sc.nextFloat();
            System.out.println("Enter NUmber 03");
            System.out.println("c");
            float c = sc.nextFloat();
            float sum = a + b + c;
            System.out.println("THe Sum Of The Number Is");
            System.out.println(sum);


        }

    }

