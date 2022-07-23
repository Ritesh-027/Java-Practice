
import java.util.*;
public class Tableof2to10{
  
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int table  = sc.nextInt();
    
    System.out.println("Pressed input table is printed below:");

        switch (table) {
            case 2: for(int i=1; i<=10;i++){
                System.out.println(2*i);
            }
            break;
            case 3: for(int i=1; i<=10;i++){
                System.out.println(3*i);
            }
            break;
            case 4: for(int i=1; i<=10;i++){
                System.out.println(4*i);
            }
            break;
            case 5: for(int i=1; i<=10;i++){
                System.out.println(5*i);
            }
            break;
            case 6: for(int i=1; i<=10;i++){
                System.out.println(6*i);
            }
            break;
            case 7: for(int i=1; i<=10;i++){
                System.out.println(7*i);
            }
            break;
            case 8: for(int i=1; i<=10;i++){
                System.out.println(8*i);
            }
            break;
            case 9: for(int i=1; i<=10;i++){
                System.out.println(9*i);
            }
            break;
            case 10: for(int i=1; i<=10;i++){
                System.out.println(10*i);
            }
            break;
            default:
            System.out.println("Valid inputs are from 1 to 10");
            break;
        }
               
    }
}