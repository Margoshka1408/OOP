package HomeWork5.Controller;


import HomeWork5.Model.Student;
import HomeWork5.Model.StudyGroup;
import HomeWork5.Model.Teacher;
import HomeWork5.ServiceGroup.StudyGroupService;
import java.util.List;

public class Controller extends StudyGroupService {
    StudyGroupService studyGroupService;
    StudyGroup studyGroup = new StudyGroup();
    public Controller() {
        super();
        this.studyGroupService = new StudyGroupService();
    }
    public StudyGroup showGroup(Teacher teacher, List<Student> listOfStudents) {
        if (teacher != null && listOfStudents != null) {
            studyGroup = studyGroupService.createStudyGroupService(teacher, listOfStudents);
        } else {
            System.out.println("Impossible to create group!");
        }
        return studyGroup;
    }
}
