package Encapsulation;

public class CalculatorSetters {

    //data
    private double num1,num2;
    //innitializing values individual :::setters

    private void setNum1(double num1){
        this.num1 = num1;
    }
    private void setNum2(double num2){
        this.num2 = num2;
    }
    //retriving values individual


    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }
    //method
    public double dosum(){
        double sum =num1 + num2;
        return  sum;
    }
    public double dosub(){
        double sub =num1 - num2;
        return  sub;
    }public double domul(){
        double mul =num1 * num2;
        return  mul;
    }public double dodiv(){
        double div =num1 / num2;
        return  div;
    }
    //testing
    public static void main(String[] args) {

        //create obj
        CalculatorSetters cal= new CalculatorSetters();
        //calling setters'
        cal.setNum1(10);
        cal.setNum2(20);
        //getters
        System.out.println(cal.getNum1());
        System.out.println(cal.getNum2());
        //mthod

        System.out.println("Addition is = "+cal.dosum());
        System.out.println("Subtraction is = "+cal.dosub());
        System.out.println("Multiplication is = "+cal.domul());
        System.out.println("Division is = "+cal.dodiv());


    }





}
