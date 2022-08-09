package lamdaPractice;

public class Student implements Cloneable, Comparable<Student>{

    private int id;
    public String name;

    public Student() {
        this.name = "Guest";
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
