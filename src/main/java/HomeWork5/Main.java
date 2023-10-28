package HomeWork5;

import HomeWork5.Controller.Controller;
import HomeWork5.Model.Student;
import HomeWork5.Model.Teacher;
import HomeWork5.View.ModelView;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Teacher teacherOleg = new Teacher(" Oleg ", " Petrov ", 31, " History ", 7);

        Student studentSveta = new Student("Sveta", "Petrova", 20, 45);
        Student studentDmitrii = new Student("Dmitrii", "Semenov", 21, 33);

        List<Student> studentList = new ArrayList<>();
        studentList.add(studentSveta);
        studentList.add(studentDmitrii);

        Controller controller = new Controller();

        ModelView modelView = new ModelView();
        modelView.getTeacherID(controller,teacherOleg);
        modelView.getStudentID(controller,studentSveta);

        modelView.getAllGroup(studentList,teacherOleg,controller);
    }

}
