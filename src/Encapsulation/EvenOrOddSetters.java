package Encapsulation;

public class EvenOrOddSetters {
    private int num1;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    /// getters value individual
    public int getNum1() {
        return num1;
    }

    //method
    private boolean isEvenOrodd() {
        if (num1 % 2 == 0) {

            return true;
        } else {
            return false;
        }
    }

    //testing
    public static void main(String[] args) {


        EvenOrOddSetters EOS = new EvenOrOddSetters();
        EOS.setNum1(10);
        System.out.println(EOS.getNum1());
       System.out.println( EOS.num1 +"  is  " +EOS.isEvenOrodd());
    }
}
