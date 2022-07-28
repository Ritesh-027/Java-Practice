import java.util.Scanner;

public class ArrayWithName {
    public static void main(String args[]){
        Scanner name = new Scanner(System.in);
        int getName = name.nextInt();
        String ary[] = new String[getName];

        for(int i=0; i<getName; i++){
            ary[i] = name.next();
        }

        for(int j=0; j <ary.length; j++){
            System.out.println(j+1+"=> Name is :"+ary[j]);
            System.out.println();
        }
    
    }
    
}
