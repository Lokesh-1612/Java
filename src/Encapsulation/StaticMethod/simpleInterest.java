package Encapsulation.StaticMethod;

public class simpleInterest {
    public double principle,rate_of_interest;
    public int tenure;

    private static double showInterest(double principle,double rate_of_interest, int tenure) {
        double interest = (principle * tenure * rate_of_interest) / 100;
        // System.out.println("siple interest = "+interest);
        return  interest;
    }
    //testing
    public static void main(String[] args) {
    System.out.println("SI = "+simpleInterest.showInterest(10000,2,2));
    }
}
