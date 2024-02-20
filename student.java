package OOP;
class Student{
    String name;
    int roll_number;
    String email;
    double psp;
    Student(){
        psp = 100.0;
        email = "xyz@gmail.com";
        roll_number = 12345;
    }
   
}
public class student {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Me";
        s.roll_number = 10221;
        s.email = "me@gmail.com";
        s.psp = 95.0;
        // System.out.println(s.name);
        Student s1 = s;
        s1.name = "Akshay";
        System.out.println(s.name);
    }
}
