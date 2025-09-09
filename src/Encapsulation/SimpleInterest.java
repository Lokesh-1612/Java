package Encapsulation;

public class SimpleInterest {
    //data
    public double principle,rate_of_interest;
    public int tenure;
    //initializing
    public SimpleInterest (double principle,double rate_of_interest,int tenure){
        this.principle=principle;
        this.tenure = tenure;
        this.rate_of_interest = rate_of_interest;
    }
    //retriving values
    @Override
    public String toString(){

        return  "SimpleInterest[ principle = "+principle+"  tenure = "+tenure+" rate_of_interest = "+rate_of_interest+"]";
    }
    //methods
    private double showInterest() {
        double interest = (principle * tenure * rate_of_interest) / 100;
       // System.out.println("siple interest = "+interest);
        return  interest;
    }
    //testing
    public static void main(String[] args) {
        //craeting object
        SimpleInterest SI = new SimpleInterest(10000,2,2);
      System.out.println(SI.toString());
        //SI.toString();
        //callling methods
        System.out.println("Simple Interest is  "+ SI.showInterest());
    }
}
