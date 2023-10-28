package HomeWork5.ServiceGroup;

import HomeWork5.Model.Student;
import HomeWork5.Model.StudyGroup;
import HomeWork5.Model.Teacher;
import java.util.List;

public class StudyGroupService extends StudyGroup {
    private StudyGroup studyGroup;
    List<Student> students;
    public StudyGroupService() {
    }
    public int getTeacherId(Teacher teacher) {
        return teacher.getTID();
    }

    public StudyGroup createStudyGroupService(Teacher teacher, List<Student> students) {
        studyGroup = new StudyGroup(teacher, students);
        return studyGroup;
    }
}
