package Lesson5.View;

import Lesson5.Controller.StudentController;
import Lesson5.Model.Student;

//1. Создать package – view. Работу продолжаем в нем
//2. Создать класс StudentView, содержащий в себе метод вывода в консоль данных студента поданных на вход
public class StudentView {
    StudentController controllerStudent = new StudentController();

    public StudentView() {
        this.controllerStudent = controllerStudent;
    }

    public void saveStudent(String name, String group, int age, String studentId) {
        controllerStudent.addStudent(name, age, studentId);
    }

    public void getStudent(String name) {
        controllerStudent.getStudent(name);
    }
}
