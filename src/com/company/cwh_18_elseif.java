//video no 18

package com.company;

import java.util.Scanner;

public class cwh_18_elseif {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age");
        Scanner sc =new Scanner(System.in);
        age=sc.nextInt();
        switch (age){
            case 18:
                System.out.println("You are going to become an Adult!");
                break;

                  case 23:
                System.out.println("You are going to get a Job!");                    //one of the switch example where the cases can b e print
                                                                                         /* break is the ending programm to break to exit from the given switch */
                break;

                     case 60:
                System.out.println("You are going to get retired !");
                break;

            default:
                System.out.println("Enjoy your life");
        }
     /*
        if(age>56) {
            System.out.println("You are experienced");
                                                              this is an example of if else ladder where u can use multiple option to written down until ending with else
        }
        else if(age>46){
            System.out.println("You are semi experienced ");
        }
        else {
            System.out.println("You are not experienced");
        }
        if (age>2){
            System.out.println("You are a baby");
         }
      */

    }
}
