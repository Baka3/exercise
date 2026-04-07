public class Student{
    private String name;
    private int grade;

    public Student(String pName, int pGrade){
        this.name = pName;
        this.grade = pGrade;
    }
    public String toString(){
       return  "Name: " + getName() + " grade " + getGrade();
    }
    public String getName(){
        return name;
    }
    public void setName(String pName){
        this.name = pName;
    }
     public int getGrade(){
        return grade;
    }
    public void setGrade(int pGrade){
        this.grade = pGrade;
    }
}