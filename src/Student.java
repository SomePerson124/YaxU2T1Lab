public class Student {

    private String name;
    private double gpa;

    public Student(String studentName, double studentGpa){
        name = studentName;
        gpa = studentGpa;
    }

    public void studentIntroduction() {
        System.out.println("Hi, my name is " + name);
    }

    public void gpaMessage() {
        System.out.println("I have a gpa of " + gpa);
    }

}