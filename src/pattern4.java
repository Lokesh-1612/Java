import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
     /*   Scanner sc = new Scanner(System.in);
        System.out.println("enter  num");
        int num = sc.nextInt();
        for(int r=1;r<=4;r++){
            for(int s=1;s<=num-r;s++){
                System.out.print("-");
            }
            for(int c=1;c<=r;c++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }/*

      */
        for (int r = 1; r <= 4; r++) {
            for (int s = 1; s <= 4 - r; s++) {
                System.out.println(" ");

            }
            for (int c = 1; c <= r; c++) {
                System.out.println("* ");
            }
            System.out.println();
        }
    }
}
