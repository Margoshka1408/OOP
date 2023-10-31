package HomeWork6;

import Lesson4.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserIterator<T extends User> implements Iterator<T> {
    private List<T> teacherList;
    private int counter;

    public UserIterator(List<T> teacherGroup) {
        this.teacherList = teacherGroup;
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < teacherList.size() - 1;
    }

    @Override
    public T next() {
        if (hasNext()) {
            return teacherList.get(counter++);
        }
        return null;
    }

    @Override
    public void remove() {
        teacherList = new ArrayList<>();
        counter = 0;
    }
}
