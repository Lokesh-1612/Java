import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num:  ");
        int num = sc.nextInt();
        for(int r= 1;r<=num;r++){
            for(int c= 1;c<=r;c++){
                System.out.print("*" +"\t");

            }
            System.out.println();
        }
        for(int r= 1;r<=num;r++){
            for(int c=num-1;c>=r; c--){
                System.out.print("*" +"\t");

            }
            System.out.println();


        }
    }
}
