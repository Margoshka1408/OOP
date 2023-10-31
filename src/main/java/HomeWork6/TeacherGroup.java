package HomeWork6;

import java.util.List;

public class TeacherGroup implements Iterable<Teacher>{

    public List<Teacher> teacherList;

    public TeacherGroup(List<Teacher> teacherList) {

        this.teacherList = teacherList;
    }


    @Override
    public UserIterator iterator() {

        return new UserIterator(teacherList);

    }
}
