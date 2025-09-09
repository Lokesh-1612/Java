package Encapsulation;

public class MarksReport {

    private int[] marks=new int[6];
    //constructor
    public MarksReport(int[] marks){
        this.marks = marks;

    }
    @Override
    public String toString(){

        return "student_marks[marks[] "+ marks+"]";

    }
    private int getTotal() {
        int total = 0;
        for (int i = 0; i < marks.length; i++)
        {
           total += marks[i];

        }
        return total;
    }
    private static void printMarksOfEachSubject(int marks[]) {
            for (int i=0;i< marks.length;i++){
                System.out.println(marks[i]+" ");
            }
    }
    private double getAverage(){
        double avg= getTotal()/6;
        return  avg ;

    }
    public double findPercentage(){
        double per = getTotal()/6;
        return per;
    }

    public void printGrade(){
        double per=findPercentage();
        if(per >= 75){
            System.out.println("your Grade is A");
        } else if (per>60 && per<=75) {
            System.out.println("your Grade is B");
        }else if (per>50 && per<=60) {
            System.out.println("your Grade is c");
        }else {
            System.out.println("your Grade is D");
        }
    }
    private boolean isPassorFail(int marks[])
    {
        boolean temp=false;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > 35)
                temp = true;
            else
                temp = false;
            break;
        }
        return temp;
    }

   /* static  int count =0;
    private static void printResultsOfEachSubject(int marks[]){
        for(int i=0;i<=marks.length;i++)
        {
            if(marks[i]<35){
                System.out.println("in "+(i+1)+"th subject you are failed");
                count =count+1;
            }else{
                System.out.println("in "+(i+1)+"th subject you are failed");
            }

        }
    }*/
    public static void main(String[] args) {

        MarksReport sm = new MarksReport(new int[]{79,63,85,34,75,99});
        System.out.println( "total marks you got is "+sm.getTotal());
        System.out.println("average of total marks aare = "+sm.getAverage());
        System.out.println("percentage = "+sm.findPercentage()+"%");
        sm.printGrade();
      //  sm.printResultsOfEachSubject(sm.marks);
        boolean result = sm.isPassorFail(sm.marks);
        if(result){
            System.out.println("You are Passed ");
        }else{
            System.out.println("You are Failed in");
            sm.printMarksOfEachSubject(sm.marks);

        }


    }


}



