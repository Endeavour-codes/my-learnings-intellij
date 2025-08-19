//

                                      //write a program to calculate percentage  using marks of 5 subjects

//package com.company;
//
      //import javax.swing.plaf.synth.SynthOptionPaneUI;
      //import java.util.Scanner;
//public class CBSE cgpa {
//      public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//           float total= 500;

//      pub//
//        System.out.println("ENTER YOUR MARKS FOR 5 SUBJECTS");
//        System.out.println("ENGLISH");
//         float a = sc.nextFloat();
//
//        System.out.println("MATHEMATICS");
//        float b = sc.nextFloat();
//
//        System.out.println("CHEMISTRY");
//        float c = sc.nextFloat();
//
//        System.out.println("HINDI");
//        float d = sc.nextFloat();
//
//        System.out.println("PHYSICS");
//        float e = sc.nextFloat();
//
//        float sum = a+b+c+d;
//        System.out.println("TOTAL SUM OF MARKS OF 5 SUBJECTS ARE");
//        System.out.println(sum);
//
//        float percentage = (sum/total)*100;
//        System.out.println("MARKS IN PERCENTAGE IS ");
//        System.out.print(percentage);
//    }
//  }



// write a program which asks the user to enter his/her name and greets them with "HELLO< Name > have a good day

//   package com.company;

//   import java.util.Scanner;

//   class exerciseQUES {
//      public static void main(String[] args) {
//
//          Scanner str = new Scanner(System.in);
//          System.out.println("WHAT IS YOUR NAME ");
//          String NAME= str.nextLine();
//          System.out.println("hello" + NAME +  "have a good day");
//
//
//      }
//   }


                               //convert kilometers to miles

 package com.company;

import java.util.Scanner;

class exerciseQUES{
  public static void main(String[] args) {
      Scanner scanner= new Scanner(System.in);
      System.out.println(" kilometers to mile ");
       double kilometers = scanner.nextDouble();

       double miles = kilometers*0.621371;
      System.out.println("kilometers is equal to"  + miles + "miles");
      scanner.close();
  }
}