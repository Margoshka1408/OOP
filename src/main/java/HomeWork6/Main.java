package HomeWork6;

import HomeWork6.User;
import HomeWork6.UserComparator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Teacher teacher1 = new Teacher(" Ivanova ", " Svetlana ");
        Teacher teacher2 = new Teacher(" Smirnov ", " Oleg ");
        Teacher MathTeacher = new Teacher(" Petrov ", " Vladimir ");

        List<Teacher> teachers = new ArrayList<>();
        SaveTeacherInGroup saveTeacherInGroup = new SaveTeacherInGroup();

        saveTeacherInGroup.saveTeacherInGroup(teacher1,teachers);
        saveTeacherInGroup.saveTeacherInGroup(teacher2, teachers);
        saveTeacherInGroup.saveTeacherInGroup(MathTeacher, teachers);

        ShowTeacherGroupList showTeacherGroupList = new ShowTeacherGroupList();
        showTeacherGroupList.showTeacher(teachers);
    }
}
