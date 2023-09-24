public class StudentRunner {
    public static void main(String[] arg) {

     Student student1 = new Student("Gene", 3.5);
     student1.studentIntroduction();
     student1.gpaMessage();

     Student student2 = new Student("Carl", 4.0);
     student2.studentIntroduction();
     student2.gpaMessage();

    }
}