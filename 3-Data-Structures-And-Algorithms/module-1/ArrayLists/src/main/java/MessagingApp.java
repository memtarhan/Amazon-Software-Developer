import java.util.ArrayList;
import java.util.Objects;

public class MessagingApp {
    public static void main(String[] args) {

        ArrayList<Friend> friendList = new ArrayList<>();
        Friend toni = new Friend("Toni", "123");
        friendList.add(toni);
        friendList.add(new Friend("Alex", "444"));
        friendList.add(new Friend("Taylor", "666"));

        System.out.println("The friends: " + friendList);

        int indexOfSearch = friendList.indexOf(toni);
        if (indexOfSearch != -1) {
            String name = friendList.get(indexOfSearch).getName();
            System.out.println("the name is: " + name);
        }
    }
}

class Friend {
    private String phoneNumber;
    private String name;

    public Friend(String name, String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Friend friend = (Friend) o;
        return Objects.equals(phoneNumber, friend.phoneNumber) && Objects.equals(name, friend.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber, name);
    }
}
