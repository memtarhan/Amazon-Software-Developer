import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int number = 1; number < 10; number++) {
            numbers.add(number);
        }
        System.out.println("Numbers: " + numbers); // Numbers: [1, 2, 3, 4, 5, 6, 7, 8, 9]

        numbers.remove(0);
        System.out.println("Numbers: " + numbers); // Numbers: [2, 3, 4, 5, 6, 7, 8, 9]

        Integer number = numbers.get(0);
        System.out.println("Number: " + number); // Number: 2

        Integer numberOfItems = numbers.size();
        System.out.println(numberOfItems);

        boolean contains = numbers.contains(3);
        System.out.println(contains);
    }
}
