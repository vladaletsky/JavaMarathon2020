package day6;

import java.util.Random;

public class Teacher {
    Random random = new Random();
    private String name;
    private String lesson;

    public Teacher(String name, String lesson) {
        this.name = name;
        this.lesson = lesson;
    }

    public void evaluate(Student student) {
        int grade = random.nextInt(5) + 1;
        String gradeWord = null;
        switch (grade) {
            case 5:
                gradeWord = "отлично";
                break;
            case 4:
                gradeWord = "хорошо";
                break;
            case 3:
                gradeWord = "удовлетворительно";
                break;
            case 2:
                gradeWord = "неудовлетворительно";
                break;
            case 1:
            case 0:
                gradeWord = "Неправильная оценка";
                break;
        }
        System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.getName() + " по предмету " + lesson + " на оценку " + gradeWord);
    }
}
