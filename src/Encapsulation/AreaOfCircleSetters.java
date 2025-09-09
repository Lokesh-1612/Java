package Encapsulation;

public class AreaOfCircleSetters {
    private double radius;

    //setters
    public void setRadius(double radius) {
        this.radius = radius;
    }
    //getters

    public double getRadius() {
        return radius;
    }

    //methos
    private void printAreaOfCircle() {
        double Area = Math.PI * radius * radius;
        System.out.println("Area of Circle " + Area);
    }

    //testing
    public static void main(String[] args) {
        //creting object
        AreaOfCircleSetters AC = new AreaOfCircleSetters();
        AC.setRadius(5);
        System.out.println("Radius " +AC.getRadius());
        AC.printAreaOfCircle();

    }

}