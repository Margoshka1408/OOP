package HomeWork6;
// OCP
// создаем класс SaveTeacherInGroup, который имплиментирует интерфейс SaveTeacherInTeacherGroup, чтобы
// сохранить учителя в список
import java.util.List;

public class SaveTeacherInGroup implements SaveTeacherInTeacherGroup {
    @Override
    public void saveTeacherInGroup(Teacher teacher, List<Teacher> teacherList) {
        teacherList.add(teacher);
    }

}
