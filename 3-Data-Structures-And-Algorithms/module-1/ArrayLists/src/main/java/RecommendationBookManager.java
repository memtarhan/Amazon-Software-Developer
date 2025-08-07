import java.util.ArrayList;

public class RecommendationBookManager {
    static class Book {
        String title;
        String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        @Override
        public String toString() {
            return title + " by " + author;
        }
    }

    public static void main(String[] args) {
        ArrayList<Book> recommendations = new ArrayList<>();
        recommendations.add(new Book("Effective Java", "Joshua "));
        recommendations.add(new Book("Clean Code", "Robert C. "));
        recommendations.add(new Book("Java Concurrency", "Brian"));

        // Adding new recommendations
        recommendations.add(new Book("The Programmer", "Andrew "));
        recommendations.add(new Book("Design Patterns", "Erich "));
        recommendations.add(new Book("Refactoring", "Martin "));
        System.out.println("Recommendations after adding new books: \n " + recommendations + "\n");

        // Updating existing recommendations
        recommendations.set(1, new Book("Clean Code", "Robert C."));
        recommendations.set(2, new Book("Java Concurrency", "Brian"));
        System.out.println("Recommendations after updating some books: \n" + recommendations + "\n");

        // Removing outdated recommendations
        recommendations.remove(0); // Remove the first book ("Effective Java")
        recommendations.remove(3); // Remove the fourth book ("Refactoring")
        System.out.println("Recommendations after removing outdated books: \n" + recommendations);
    }
}