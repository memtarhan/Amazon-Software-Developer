// Class design best practices


// ------------------------------
// Choose an appropriate class name and Use small classes
public class Student {
    int id;
    StudentDetails details;
    StudentSubject subject;
    StudentAddress address;
    double percentage;
}

class StudentSubject {
    String id;
    String name;
    int credits;
}

class StudentAddress {
    String street;
    String city;
    String state;
    String country;
    int zipCode;
}
class StudentDetails {
    String firstName;
    String middleName;
    String lastName;
}
// ------------------------------


// ------------------------------
// Encapsulation
// A better approach is to hide the data members of the class from the outside world by declaring them private.
// Then, declare the public methods that can access the data members.
class Person {
    private String name;
    private  String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}