package Encapsulation;

public class AreaOfCircle {
    private double radius;
    //constructors
    public AreaOfCircle(double radius){
        this.radius = radius;
    }
    //retriving
    public String toString(){

        return "AreaOfCircle [ num1 = "+radius +"]";
    }
    //method
    private void printAreaOfCircle(){
        double Area = Math.PI * radius * radius;
        System.out.println("Area of Circle = "+ Area);
    }
    public static void main(String[] args) {
        AreaOfCircle AC = new AreaOfCircle(10) ;

        //calling toString
        System.out.println( AC.toString());
        AC.printAreaOfCircle();
    }
}
