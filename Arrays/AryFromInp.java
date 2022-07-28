import java.util.Scanner;

public class AryFromInp {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        String user[] = new String[input];
        
        //For input!
        for(int j=0; j<input; j++){
            user[j] = scan.nextLine();
        }
        //For output!
        System.out.println("Created array data is shown below :");
        for(int i=0; i<input; i++){
            System.out.println(user[i]);
            System.out.println();
        }
    }
}
