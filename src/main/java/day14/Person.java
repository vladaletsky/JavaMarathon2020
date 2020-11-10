package day14;

public class Person {

    public Person(String name, int year){
        this.name = name;
        this.year = year;
    }

    private String name;
    private int year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + year +
                '}';
    }
}
