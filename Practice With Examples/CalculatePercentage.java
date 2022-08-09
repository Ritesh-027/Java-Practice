
//Calculate marks from 5 subjects and give the total percentage obtained by student.

import java.util.Scanner;

public class CalculatePercentage{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); // Taking input from the keyboard.
        
        System.out.println("Subject 1 :- Enter Total Marks obtained out of 100");
        
        int s1 = sc.nextInt();
        
        System.out.println("Subject 2 :- Enter Total Marks obtained out of 100");
        
        int s2 = sc.nextInt();
        
        System.out.println("Subject 3 :- Enter Total Marks obtained out of 100");
        
        int s3 = sc.nextInt();
        
        System.out.println("Subject 4 :- Enter Total Marks obtained out of 100");
        
        int s4 = sc.nextInt();
        
        System.out.println("Subject 5 :- Enter Total Marks obtained out of 100");
        
        int s5 = sc.nextInt();

        int sum = s1+s2+s3+s4+s5;
        System.out.println("Total marks out of 500 from the 5 subjects is : " + sum);
        System.out.print("Percentage of the student is : ");
        int percentage = sum * 100 / 500;
        
        System.out.println(percentage + " % ");


        System.out.print("Remarks from the Principle : ");
        
        if(sum<=100){
        
            System.out.println("Needs improvment!");
        
        }else if(sum>100 && sum<=200){
            
            System.out.println("Poor marks obtained, must need to care about it and give more and more focus in study!");

        }else if(sum>200 && sum<=300){

            System.out.println("Average marks obtained, need more & more efforts !");

        }else if(sum>300 && sum<=400){

            System.out.println("Good Marks, Keep it growing!");
        
        }else if(sum>400 && sum<=500){
        
            System.out.println("Ecxellent! Keep it up!");
        
        }
    }
}