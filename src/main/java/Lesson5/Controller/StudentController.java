package Lesson5.Controller;

import Lesson5.Model.Student;


import java.util.ArrayList;
import java.util.List;

//Создаем класс StudentController – реализующий логику, путем написания и вызова соответствующих методов :
//        1. Создание Студента
//        2. Возвращение всех студентов в сервисе
//        3. Вызов view и передача списка найденных студентов

public class StudentController {
    private List<Student> student;
    // List<Student> student список студентов.

    public StudentController() {
        this.student = new ArrayList<>();
    }

    /**
     * @params addStudent - добавляет студента в список.
     */

    public void addStudent(String name, int age, String studentId) {

        student.add(new Student(name, age, studentId));
    }
    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }
    /**
     * @params getStudent - выводит результат поиска студента в списке..
     */
    public Student getStudent(String name) {
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).getName().equals(name)) {
                System.out.println("Student found!");
                System.out.println(student.get(i));
            } else {
                System.out.println("No student");
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "StudentController{" +
                "student=" + student +
                '}';
    }
}
