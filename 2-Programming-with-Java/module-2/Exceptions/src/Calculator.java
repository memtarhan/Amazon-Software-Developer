import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Calculator {
    int firstNumber;
    int secondNumber;

    int add() {
        return firstNumber + secondNumber;
    }

//    void readNumbersFromFile() throws FileNotFoundException {
//        Scanner fileScanner = new Scanner(new File("src/numbers.txt"));
//        int firstNumber = fileScanner.nextInt();
//        int secondNumber = fileScanner.nextInt();
//    }

    void readNumbersFromFile() {
        try {
            Scanner fileScanner = new Scanner(new File("src/numbers.txt"));
            int firstNumber = fileScanner.nextInt();
            int secondNumber = fileScanner.nextInt();

        } catch (FileNotFoundException exception) {
            System.err.println(exception.getMessage());
        }
    }
}
