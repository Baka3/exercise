import java.util.LinkedList;
import java.util.List;

public class GradeManager {
    private List<Student> students = new LinkedList<>();
    
    public void addStudent(Student s){
        this.students.add(s);
    }

    public String FindhighestGrade(){
        int highestGrade = 0;
        String topStudent = "";  // обов'язково написати ту штуку пысля дорівнює
        for(Student student:students){  //ВКАЗУВАТИ ТИП ЗІННОЇ
        System.out.println(student);
        if (student.getGrade()>highestGrade){
            highestGrade = student.getGrade();
            topStudent = student.getName();
        }
        }
        return topStudent;
    }
}
