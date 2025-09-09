import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter num");
        int num = sc.nextInt();
        for(int r =1;r <= num;r++){
            for( int s = num;s >= r; s--){
                System.out.print(" "+"\t");
            }
            for( int c =1;c<=r;c++ ){
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
        for(int r =1;r <= num-1 ;r++){
            for( int s = 1;s <= r+1; s++){
                System.out.print(" "+"\t");
            }
            for( int c =num-1;c>=r;c--){
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
    }
}
