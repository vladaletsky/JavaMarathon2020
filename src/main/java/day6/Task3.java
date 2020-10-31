package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Jackson", "Music");
        Student student = new Student("Michael");
        teacher.evaluate(student);
    }
}
