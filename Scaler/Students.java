package OOP.Scaler;

class Student {
    String name;
    String email;
    String password;
    double PSP;
    String mentor;
    String ta;
    String batch;
    public Student(String name , String email, String password, String mentor, String ta, String batch, double PSP){
        this.name = name;
        this.email = email;
        this.password = password;
        this.mentor = mentor;
        this.ta =ta;
        this.PSP = PSP;
        this.batch = batch;
    }
}
