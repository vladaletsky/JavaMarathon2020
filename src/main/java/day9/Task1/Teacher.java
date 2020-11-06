package day9.Task1;

public class Teacher extends Human {

    public Teacher (String name, String subjectName){
        super(name);
        this.subjectName = subjectName;
    }

    private String subjectName;

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + getName());
    }
}