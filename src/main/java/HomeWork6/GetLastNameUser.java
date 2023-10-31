package HomeWork6;
// SRP
//выносим в отдельный класс LastName
public class GetLastNameUser extends User{
    public GetLastNameUser(String firstName, String lastName) {

        super(firstName, lastName);
    }
    public String getLastName() {
        return lastName;
    }
}

