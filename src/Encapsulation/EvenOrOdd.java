package Encapsulation;

public class EvenOrOdd {
  private int num1;
  public EvenOrOdd(int num1){
      this.num1 = num1;
  }
  @Override
    public String toString(){
      return "EvenOrOdd[ num1 = "+ num1+"]";

  }
  private boolean isEvenOrodd() {
    if (num1 % 2 == 0) {

        return true;
      }
    else{
      return false;
    }



  }

  public static void main(String[] args) {

    EvenOrOdd EO = new EvenOrOdd(10);
    System.out.println(EO.num1);
    System.out.println(EO.toString());
    System.out.println(EO.isEvenOrodd());
  }

  }
