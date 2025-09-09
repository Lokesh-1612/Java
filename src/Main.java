

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // reading array sie
        System.out.println("enter array row size");
        int  row_size = sc.nextInt();
        //  int row[]=new int[row_size];
        //rading column size
        System.out.println("enter array column size");
        int col_size = sc.nextInt();
        // col[]=new int[col_size];

        int array[][]= new int[row_size][col_size];
        // reading the console
        System.out.println("enter  "+(row_size*col_size)+"  into array");
        for(int r=0 ;r<array.length;r++){
            for(int c = 0; c< array[r].length;c++){
                array[r][c]= sc.nextInt();

            }

        }
        // writing into console
        System.out.println("Array elements are");
        for(int r=0 ;r<array.length;r++){
            for(int c = 0; c< array[r].length;c++){
                System.out.print(array[r][c]+ "\t");
            }
            System.out.println();
        }

        //row
        System.out.println("row1");

        for(int r=0 ;r<array.length;r++){
            for(int c = 0; c< array[r].length;c++){
                if(r==0)
                    System.out.print(array[r][c]+ "\t");
            }
            System.out.println();
        }

        System.out.println("Row 2 elemnts are");
        for(int r=0;r<array.length;r++){
            for(int c=0;c<array[r].length;c++){
                if(r==1)
                    System.out.print(array[r][c]+ "\t");
            }
            System.out.println();
        }

        System.out.println("diagonal elemnts are");
        for(int r=0;r<array.length;r++){
            for(int c=0;c<array[r].length;c++){
                if(r==c)
                    System.out.print(array[r][c]+ "\t");
            }
            System.out.println();
        }
        //anti-diagonal
        System.out.println("Anti-diagonal elemnts are");
        for(int r=0;r<array.length;r++){
            for(int c=0;c<array[r].length;c++){
                if(r+c==2)
                    System.out.print(array[r][c]+ "\t");
            }
            System.out.println();
        }
        // lower triangular
        System.out.println("lower- triangular elemnts are");
        for(int r=0;r<array.length;r++){
            for(int c=0;c<array[r].length;c++){
                if(r<c)
                    System.out.print(array[r][c]+ "\t");
            }
            System.out.println();
        }
        //upper traiangular
        System.out.println("upper- triangular elemnts are");
        for(int r=0;r<array.length;r++){
            for(int c=0;c<array[r].length;c++){
                if(r>c)
                    System.out.print(array[r][c]+ "\t");
            }
            System.out.println();
        }
        // sum of elements
        int sum=0;
        System.out.println("sum of  elemnts are");
        for(int r=0;r<array.length;r++){
            for(int c=0;c<array[r].length;c++){
                sum = sum+array[r][c];

            }
        }
        System.out.print(sum);



    }


}

