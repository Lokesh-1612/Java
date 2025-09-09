import java.util.Scanner;

public class pattern_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num  ");
        int num = sc.nextInt();
        for(int r= 1;r<=num;r++){
            for(int s=1;s<=r;s++){
                System.out.print("\t");

            }
            for(int c= num;c>=r;c--){
                System.out.print("*"+"\t");


            }
            System.out.println();
        }
    }
}
