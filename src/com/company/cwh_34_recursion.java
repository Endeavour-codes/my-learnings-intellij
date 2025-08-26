//in this I showed you two techniques to showcase the factorials
//1 recursion approach
//2 iterative approach

package com.company;

public class cwh_34_recursion {
    static int factorial (int n ){
        //factorial (0)= 1
        //factorial (n) = n-1 *....1
        //factorial (5) = 5* 4*3*2*1 i.e. it is factorial of 5! i.e 120
        //factorial (n-1) = n * factorial (n-1)

            if (n==0 || n==1){
            return 1;
            }
            else {
            return n* factorial(n-1);

            // this is a recursion method we can also do it in iterative approach also

        }
    }
    static int factorial_iterative (int n ){

            if (n==0 || n==1){
            return 1;
            }
            else {
             int product = 1;
             for (int i=1;i<=n;i++){ // 1 to n
                 product *=i;
             }
             return product;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int x = 7;
        System.out.println("the value of factorial n is:" + factorial(n));
        System.out.println("the value of factorial n is:" + factorial_iterative(x));

    }
}

