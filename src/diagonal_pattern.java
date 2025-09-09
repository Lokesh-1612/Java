import java.util.Scanner;

public class diagonal_pattern {
    public static void main(String[] args) {

       for(int r= 1;r<=4;r--){
           for(int c=4;c<=r;c++){
               System.out.print("*"+ " \t");
           }
           System.out.println();
       }



    }
}
