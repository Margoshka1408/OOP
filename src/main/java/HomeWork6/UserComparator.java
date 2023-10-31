package HomeWork6;

import HomeWork6.User;

import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {

        return o1.firstName.length() - o2.firstName.length();
    }
}