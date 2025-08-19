
//video no 24  cwh

package com.company;

public class cwh_24_break_and_continue {
    public static void main(String[] args) {
        //break and continue using loops
//        for(int i=0;i<5;i++) {
//            System.out.println(i);
//            System.out.println("java is great");
//            if (i == 2) {
//                System.out.println("Ending the loop");
//                break;
//            }
//        }
//        int i=2;
//        while(i<5){
//            System.out.println(i);
//            System.out.println("Java is great");
//            if(i==2){
//                System.out.println("Ending the loop ");
//                break;
//            }
//            i++;
//
//        }
//        System.out.println("Loop ends here");

                          //THE SAME CODE CAN BE USED IN DO WHILE LOOP

//        int i=2;
//        do {
//            System.out.println(i);
//            System.out.println("Java is great");
//            if(i==2){
//                System.out.println("Ending the loop ");
//                break;
//            }
//            i++;
//
//        }while(i<5);
//        System.out.println("Loop ends here");




               //  THE  CONTINUE STATEMENT

//        for(int i=0;i<50;i++){
//            if(i==2){
//                System.out.println("Ending with loop");
//                continue;
//            }
//            System.out.println(i);
//            System.out.println("Java is great");
//        }



        //another  example in  continue  statement



        int i=0;
        do {
              i++;
            if(i==2) {
                System.out.println("Ending the loop ");
                continue;
            }
                System.out.println(i);
                System.out.println("Java is great");

        }while(i<5);
        System.out.println("Loop ends here");
      }
}
