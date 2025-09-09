package Encapsulation;

public class SimpleInterestSetters {
    private double principle,rate_of_interest;
    private int tenure;
    //iniatialing setters

    public void setPrinciple(double principle) {
        this.principle = principle;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public void setRate_of_interest(double rate_of_interest) {
        this.rate_of_interest = rate_of_interest;
    }

    //getters retriving data
    public double getPrinciple() {
        return principle;
    }

    public int getTenure() {
        return tenure;
    }

    public double getRate_of_interest() {
        return rate_of_interest;
    }
    //methods
    private void showInterest() {
        double interest = (principle * tenure * rate_of_interest) / 100;
        System.out.println("siple interest = "+interest);

    }
    //testing
    public static void main(String[] args) {
        SimpleInterestSetters Si = new SimpleInterestSetters();
        //calling setters
        Si.setPrinciple(10000);
        Si.setTenure(2);
        Si.setRate_of_interest(2);
        //calling getters
        System.out.println( "Principle  amount "+Si.getPrinciple());
        System.out.println("Time period : "+Si.getTenure());
        System.out.println("Rate of Interest : " +Si.getRate_of_interest());
        //methods
        Si.showInterest();

    }

}
