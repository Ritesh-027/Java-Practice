package Functions;

import java.util.Scanner;

public class CheMinMax {

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        minMax(a, b, c);
    }

    public static void minMax(int a,int b,int c){
//Practice - 1
        // if(a > b){
        //     System.out.println("a is great than b :"+ a +" > "+ b);
        // }else {
        //     System.out.println("b is less than a :"+ a +" < "+ b );
        // }
        // if(b > c){
        //     System.out.println("b is greater than a :"+ b +" > "+ c);
        // }else {
        //     System.out.println("c is less than b :"+ b +" < "+ c );
        // }
        // if(c > a){
        //     System.out.println("b is greater than c :"+ c +" > "+ a );
        // }else{
        //     System.out.println("a is less than c :"+ c +" < "+ a  );
        // }

// Practice - 2  - for logic!

        // if(a > b){
        //         if(b > c){
        //                 System.out.println("A is max & min is ! :"+ a +" & "+ c);
        //         }else{
        //             if(c > a){
        //                 System.out.println("C is max & min is ! :"+ a +" & "+ a);
        //             }else{
        //                 System.out.println("B is max & min is ! :"+ b +" & "+ a);
        //             }
        //         }
        // }else{
        //         if(b > c){
        //             if(a > c){
        //             System.out.println("A is max & C is mix! :"+ a+" & "+c);
        //             }
        //         }else{
        //             if(c >= a){
        //                     System.out.println("C is max number from the given inputs! :"+ c);
        //             }else{
        //                 System.out.println("A = C");
        //             }
        //         }
        //     }

        }
    }
