package Encapsulation;

public class code5 {
    int i;
    static  int j;
    private code5(int i,int j) {
        System.out.println(i++);
        j++;
        System.out.println(i+","+j);
    }

    public static void main(String[] args) {
        code5 ob1 = new code5(6,7);
    }
}