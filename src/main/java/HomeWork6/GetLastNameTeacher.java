package HomeWork6;
// SRP
//выносим в отдельный класс LastName
public class GetLastNameTeacher extends Teacher {
    public GetLastNameTeacher(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public String getLastName() {
        return lastName;
    }
}
