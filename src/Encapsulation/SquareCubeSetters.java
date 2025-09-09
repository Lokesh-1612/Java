package Encapsulation;

public class SquareCubeSetters {
    private  double num1;
    //initializing setters

    public void setNum1(double num1) {
        this.num1 = num1;
    }
    //retriving values
    public double getNum1(double num1){
        return num1;
    }
    //methods
    public double findSquare(){
        double square = num1 * num1;
        return  square;

    }
    public double findCube(){
        double cube = num1 * num1 *num1;
        return cube;
    }
    //testing
    public static void main(String[] args) {
        SquareCubeSetters sc= new SquareCubeSetters();
        //calling getters
        sc.setNum1(10);
        //calling setters
        System.out.println(sc.getNum1(10));
       System.out.println("Square of "+sc.num1+ " is "+sc.findSquare());
       System.out.println("cube of "+sc.num1+ " is "+sc.findCube());
    }
}
