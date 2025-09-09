import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num =sc.nextInt();
        for(int r=1;r<=num;r++){
            for(int c= num;c>=r;c--){
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
    }
}
