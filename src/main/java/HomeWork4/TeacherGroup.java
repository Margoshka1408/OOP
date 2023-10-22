package HomeWork4;

import Lesson4.Student;

import java.util.ArrayList;
import java.util.List;

public abstract class TeacherGroup implements Iterable<Teacher> {
    private String groupName;
    private List<Teacher> teachersList;
    public TeacherGroup(String groupName, List<Teacher> teachersList){
        this.groupName = groupName;
        this.teachersList = new ArrayList<>();
    }
    public int getSize() {
        return teachersList.size();
    }
    public Teacher getIndex(int index) {
        return teachersList.get(index);
    }

    public String getGroupName() {
        return groupName;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public List<Teacher> getStudentList() {
        return teachersList;
    }

    public void setTeachersList(List<Teacher> teacherList) {
        this.teachersList = teacherList;
    }

    @Override
    public String toString() {
        return "TeacherGroup{" +
                "groupName='" + groupName + '\'' +
                ", teachersList=" + teachersList +
                '}';
    }
}
