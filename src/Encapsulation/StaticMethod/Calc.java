package Encapsulation.StaticMethod;

public class Calc {


    //Data
    private double num1,num2;
    //method Business Logic
    private  static double dosum( double num1,double num2){
        double sum =num1 + num2;
        return sum;
    }
    private static double dosub( double num1,double num2){
        double sub= num1-num2;//constructo supply values to num1,num2
        return sub;

    }
    private static double domul( double num1,double num2){
        double mul= num1*num2;
        return mul;
    }
    private static  double dodiv( double num1,double num2){
        double div= num1/num2;
        return div;
    }

    //testing
    public static void main(String[] args) {

        System.out.println("Addition is= "+Calc.dosum(10,20));
        System.out.println("Subtraction is= "+Calc.dosub(10,20));
        System.out.println("Multiplication is= "+Calc.domul(10,20));
        System.out.println("Division is= "+ Calc.dodiv(10,20));



    }
}

