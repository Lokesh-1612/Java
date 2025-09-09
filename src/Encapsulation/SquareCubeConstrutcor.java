package Encapsulation;

public class SquareCubeConstrutcor {
    //data
    private  double num1;
    //initializing
    public SquareCubeConstrutcor(double num1){
        this.num1=num1;
    }
    //retriving values from a data using toString class
    @Override //annotation
    public String toString(){

        return  "SquareCube[ num1 "+num1 +"]";
    }
    //methods
    //logic for Square
    private double findSquare(){
        double Square = num1 *num1;
        return  Square;
    }
    //Logic for Cubic
    private double findCube(){
        double Cube=num1*num1*num1;
        return Cube;
    }
    //testing
    public static void main(String[] args) {
        // creating a objcet

        SquareCubeConstrutcor sc =new SquareCubeConstrutcor(10);
        //calling Constructor
        System.out.println(sc);
        //calling methods
        sc.toString();
        System.out.println("Square of "+ sc.num1+" is ="+sc.findSquare());
        System.out.println("cube is "+ sc.findCube());

    }

}
