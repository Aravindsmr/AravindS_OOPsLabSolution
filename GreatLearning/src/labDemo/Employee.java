package labDemo;

public class Employee {
    private String firstname;
    private String lastname;

    Employee(String firstname, String lastname) {

        this.firstname = firstname;
        if (lastname != null) {
            this.lastname = lastname;
        }
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        if (lastname != null) {
            return lastname;
        } else {
            return "";
        }
    }

}
