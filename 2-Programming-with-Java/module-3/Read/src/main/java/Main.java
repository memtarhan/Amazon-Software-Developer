import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/main/java/file.txt");

//        if (file.exists()) {
//            System.out.println("The file is accessible");
//
//        } else {
//            System.out.println("The file does not exist");
//        }

//        try {
//            FileInputStream inputStream = new FileInputStream(file);
//
//        } catch (FileNotFoundException exception) {
//            System.err.println(exception.getMessage());
//        }

        // Reading file contents
        try (BufferedReader inputStream = new BufferedReader(new FileReader(file))) {
            int character;
            while ((character = inputStream.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("File Not Found!");
        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }
    }
}
