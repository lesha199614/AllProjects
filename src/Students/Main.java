package Students;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> AliakseiMarks = new ArrayList<>();
        ArrayList<Integer> LizaMarks = new ArrayList<>();
        ArrayList<Student> BNTUStudents = new ArrayList<>();
        Student Aliaksei = new Student("Aliaksei", 26, AliakseiMarks);
        Student Liza = new Student("Liza", 24, LizaMarks);
        University bntu = new University("BNTU",BNTUStudents);
        BNTUStudents.add(Aliaksei);
        BNTUStudents.add(Liza);
        AliakseiMarks.add(10);
        AliakseiMarks.add(8);
        LizaMarks.add(9);
        LizaMarks.add(6);
        //методы
        bntu.addStudentScanner();
        bntu.addMarkToStudent();
        bntu.getListOfStudents();
        bntu.searchName();
        bntu.rating();
        bntu.deleteStudentScanner();
        bntu.getListOfStudents();
    }

}
