

import java.util.Scanner;

public class matrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // reading array sie
        System.out.println("enter array row size");
        int row_size = sc.nextInt();
        //  int row[]=new int[row_size];
        //rading column size
        System.out.println("enter array column size");
        int col_size = sc.nextInt();
        // col[]=new int[col_size];

        int array[][] = new int[row_size][col_size];
        // reading the console
        System.out.println("enter  " + (row_size * col_size) + "  into array");
        for (int r = 0; r < array.length; r++) {
            for (int c = 0; c < array[r].length; c++) {
                array[r][c] = sc.nextInt();

            }

        }
        // writing into console
        System.out.println("diagonal elemnts are");
        for (int r = 0; r < array.length; r++) {
            for (int c = 0; c < array[r].length; c++) {
                if (r == c) {
                    System.out.print("@" + "\t");
                } else {
                    System.out.print(array[r][c] + "\t");
                }
                System.out.println();
            }
        }
    }}