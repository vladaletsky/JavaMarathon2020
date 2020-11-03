package day9.Task1;

public class Student extends Human {

    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    String groupName;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void printInfo(){
        System.out.println("Этот человек с именем " + super.name);
        System.out.println("Этот студент с именем " + this.name);
    }


}