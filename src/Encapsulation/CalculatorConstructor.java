package Encapsulation;

public class CalculatorConstructor {


        //Data
        private double num1,num2;

        //initializing constructors
      private CalculatorConstructor(double num1,double num2)
      {
          this.num1=num1;
          this.num2= num2;
     }

     //retriving values from data :tosring
     @Override
    public String toString()
    {

        return  "CalculatorConstructor[num1 ="+num1+"],[num2 ="+num2+"]";
    }
    //method Business Logic
    private  double dosum(){
          double sum =num1 + num2;
          return sum;
    }
   private double dosub(){
          double sub= num1-num2;//constructo supply values to num1,num2
          return sub;

    }
    private double domul(){
        double mul= num1*num2;
        return mul;
    }
    private double dodiv(){
        double div= num1/num2;
        return div;
    }
    private double domod(){
        double mod= num1%num2;
        return mod;
    }
    //testing
    public static void main(String[] args) {
        //creating parametrized object
        CalculatorConstructor cal = new CalculatorConstructor(10,20);
        System.out.println(cal);
        //calling construtors
      // cal.toString();
       //calling methods
        System.out.println("Addition is="+cal.dosum());
       System.out.println("Subtraction is="+cal.dosub());
        System.out.println("Multiplication is="+cal.domul());
        System.out.println("Division is="+cal.dodiv());
        System.out.println("Modulus is="+cal.domod());



    }
}
