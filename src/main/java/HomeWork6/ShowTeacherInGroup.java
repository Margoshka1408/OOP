package HomeWork6;
// ISP
// разделяем интерфейс сохранения учителя в группе
import java.util.List;

public interface ShowTeacherInGroup extends SaveTeacherInTeacherGroup {

    public default void showTeacher(List<Teacher> teacherList) {
        for (Teacher list2 : teacherList)
            System.out.println(list2);

    }
}
