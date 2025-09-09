package Encapsulation;

public class Student {
    //instance variable
    private int rollno;
    private String name;
    private long phoneNumber;
    //static variables
    private  static  String courseName = "java FullStack";
    private  static  String trainerNAme = "chanti";
    private static  int Duration = 90;
    //3.static final
    private static  final double courseFee = 30000D;
    private  static final String countryCode = "+91";

    //constructor
    private Student( int rollno,String name,long phoneNumber)//local variables
     {
        this.rollno = rollno;
        this.name = name;
        this.phoneNumber = phoneNumber;

    }
    //test
    public static void main(String[] args) {
        Student student1 = new Student(1,"Lokesh",7995825350L);
        System.out.println(student1);//Adress of the object if there is no toString method
        //Accesing Instance variable --(By obj Name)
        System.out.println(student1.rollno);
        System.out.println(student1.name);
        System.out.println(student1.phoneNumber);
        //aceesing static variable by using class name
        System.out.println(Student.courseName);
        System.out.println(Student.trainerNAme);
        System.out.println(Student.Duration);

        //accesing  static & final variable using className
        System.out.println(Student.courseFee);
        System.out.println(Student.countryCode);

    }


}

