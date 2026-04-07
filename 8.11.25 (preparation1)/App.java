import java.util.List;

public class App {
    public static void main(String[] args) {
    GradeManager manager = new GradeManager();

    Student student1 = new Student("Bob",82);
    Student student2 = new Student("Karen",76);
    Student student3 = new Student("Mindy",47);
    Student student4 = new Student("Jim",50);

    manager.addStudent(student1);
    manager.addStudent(student2);
    manager.addStudent(student3);
    manager.addStudent(student4);
    
    

    System.out.println("Top student: " + manager.FindhighestGrade());
    }
}
