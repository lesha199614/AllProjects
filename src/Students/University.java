package Students;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class University {
    private String universityName;
    private ArrayList<Student> listOfStudents;
    Scanner scanner = new Scanner(System.in);

    public University(String universityName, ArrayList<Student> listOfStudents) {
        this.universityName = universityName;
        this.listOfStudents = listOfStudents;
    }

    public void getListOfStudents() {
        System.out.println("Список студентов " + universityName + ":");
        for (Student student : listOfStudents) {
            System.out.println("Name: " + student.getName() + ", age: " + student.getAge() +
                    ", marks: " + student.getStudentMarks().toString());
        }
        System.out.println("====================");
    }

    public void rating() {
        double sum = 0;
        double rating = 0;
        int amountOfStudents = 0;
        for (Student student : listOfStudents) {
            amountOfStudents++;
            sum += student.averageStudentMark();
        }
        if (amountOfStudents != 0) {
            rating = sum / amountOfStudents;
        }
        System.out.println("Рейтинг университета - " + universityName + ":" + rating);
        System.out.println("=========================");
    }

    public void searchName() {
        System.out.println("Поиск студента по имени в " + universityName + ": ");
        System.out.println("Введи имя студента");
        String name = scanner.next();
        if (isStudentExist(name)) {
            System.out.println("Такой студент есть");
        } else {
            System.out.println("Такого студента нет");
        }
        System.out.println("=====================");
    }

    private boolean isStudentExist(String name) {
        boolean studentExist = false;
        for (Student student : listOfStudents)
            if (name.equals(student.getName())) {
                studentExist = true;
            }
        return studentExist;
    }

    public void addStudentScanner() {
        System.out.println("Добавление нового студента в " + universityName + ":");
        System.out.println("Введи имя студента");
        String name = scanner.next();
        System.out.println("Введи возраст");
        int age = scannerIntPrivate();
        Student student = new Student(name, age, new ArrayList<>());
        listOfStudents.add(student);
        System.out.println("===========================");
    }

    public void addMarkToStudent() {
        System.out.println("Добавление оценку студенту " + universityName + ":");
        System.out.println("Введи имя студента");
        String name = scanner.next();
        if (isStudentExist(name)) {
            System.out.println("Введи балл");
            int mark = scannerIntPrivate();
            for (Student student : listOfStudents) {
                if (name.equals(student.getName())) {
                    student.getStudentMarks().add(mark);
                }
            }
        } else {
            System.out.println("Такого студента нет");
        }
        System.out.println("========================");
    }

    public void deleteStudentScanner() {
        List<Student> studentsToRemove = new ArrayList<>();
        System.out.println("Исключение студента из " + universityName + ":");
        System.out.println("Введи имя студента");
        String name = scanner.next();
        if (isStudentExist(name)) {
            for (Student student : listOfStudents) {
                if (name.equals(student.getName())) {
                    studentsToRemove.add(student);
                }
            }
            listOfStudents.removeAll(studentsToRemove);
            System.out.println("Студент исключен");
        } else {
            System.out.println("Такого студента нет");
        }
        System.out.println("===========================");
    }

    private int scannerIntPrivate() {
        while (!scanner.hasNextInt()) {
            System.out.println("Введи валидное число");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public void addAverageStudentMark() {
        System.out.println("Средний балл студента " + universityName + ":");
        System.out.println("Введи имя студента");
        String name = scanner.next();
        if (isStudentExist(name)) {
            for (Student student : listOfStudents) {
                if (name.equals(student.getName())) {
                    System.out.println(student.averageStudentMark());
                }
            }

        } else {
            System.out.println("Такого студента нет");
        }
        System.out.println("========================");
    }
}
