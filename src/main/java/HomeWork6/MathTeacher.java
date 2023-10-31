package HomeWork6;

import HomeWork6.Teacher;

public class MathTeacher extends Teacher {

    protected MathTeacher(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String toString() {
        return "MathTeacher{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
