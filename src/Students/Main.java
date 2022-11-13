package Students;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> aliakseiMarks = new ArrayList<>();
        ArrayList<Integer> lizaMarks = new ArrayList<>();
        ArrayList<Student> bntuStudents = new ArrayList<>();
        Student aliaksei = new Student("Aliaksei", 26, aliakseiMarks);
        Student liza = new Student("Liza", 24, lizaMarks);
        University bntu = new University("BNTU", bntuStudents);
        bntuStudents.add(aliaksei);
        bntuStudents.add(liza);
        aliakseiMarks.add(10);
        aliakseiMarks.add(8);
        lizaMarks.add(9);
        lizaMarks.add(6);
        //методы
        bntu.addStudentScanner();
        bntu.addMarkToStudent();
        bntu.getListOfStudents();
        bntu.searchName();
        bntu.rating();
        bntu.deleteStudentScanner();
        bntu.getListOfStudents();
        bntu.addAverageStudentMark();
    }

}
