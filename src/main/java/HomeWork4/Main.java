package HomeWork4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<User> teachers = new ArrayList<>();
        User teacher1 = new User(" Ivanova ", " Svetlana ");
        User teacher2 = new User(" Smirnov ", " Oleg ");
        User MathTeacher = new User(" Petrov ", " Vladimir ");

        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(MathTeacher);

        teachers.sort(new UserComparator<>());
        System.out.println(teachers);
    }
}
