package day9.Task1;

public class Student extends Human {

    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    private String groupName;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Этот студент с именем " +getName());
    }


}