package com.company;

import java.util.Random;
import java.util.Scanner;

public class rps_game {
    public static void main(String[] args) {
        System.out.println("Select 0 for Rock \n\t select 2 for paper \n\t select  3 Scissors ");

        Scanner sc=new Scanner(System.in);
        Random rc= new Random();

        System.out.println("Its your turn");
          int human = sc.nextInt(3);
          if(human==0){
              System.out.println("You have selected rock");
          }
          if(human==1){
              System.out.println("You have selected paper");
          }
          if(human==2){
              System.out.println("You have selected Scissors");
          }
                System.out.println("Its Computer turn");
          int computer = sc.nextInt(3);
          if(computer==0){
              System.out.println("computer have selected rock");
          }
           if(computer==1){
              System.out.println("computer have selected paper");
          }
           if(computer==2){
              System.out.println(" computer have selected Scissors");
          }
           if(human==computer){
               System.out.println("Draw");
           }
           else if(human==0 & computer==2 || computer == 0 && human == 1 && human == 2 && computer == 1){
               System.out.println("Congratulation you have won ");
           }
           else {
               System.out.println("You loose better luck next time ");
           }
    }
}
