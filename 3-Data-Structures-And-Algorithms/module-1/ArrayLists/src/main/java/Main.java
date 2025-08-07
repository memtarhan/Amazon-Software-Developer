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

        ArrayList<String> ads = new ArrayList<>();
        ads.add("Buy One Get One Free");
        ads.add("Clearance Sale - Up to 70% Off");
        ads.add("Free Shipping on Orders Over $50");

        System.out.println("Original ads: " + ads);

        // Removing an ad by index
        ads.remove(0); // Remove the first ad
        System.out.println("Ads after removing the first ad: " + ads);

        // Removing an ad by content
        ads.remove("Clearance Sale - Up to 70% Off");
        System.out.println("Ads after removing 'Clearance Sale': " + ads);

        System.out.println("Ads size before clearing: " + ads.size());

        // Clear all elements from the list
        ads.clear();
        if (ads != null) {
            System.out.println("Ads size after clearing: " + ads.size());
        }
    }
}
