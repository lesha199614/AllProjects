package Students;


import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private ArrayList<Integer> studentMarks;

    public Student(String name, int age, ArrayList<Integer> studentMarks) {
        this.name = name;
        this.age = age;
        this.studentMarks = studentMarks;
    }

    public void addMark(Integer value) {
        studentMarks.add(value);
    }

    protected double averageStudentMark() {
        int sum = 0;
        if (studentMarks.size() == 0) {
            return 0;
        }
        for (Integer mark : studentMarks) {
            sum += mark;
        }
        return (double) sum / studentMarks.size();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<Integer> getStudentMarks() {
        return studentMarks;
    }
}