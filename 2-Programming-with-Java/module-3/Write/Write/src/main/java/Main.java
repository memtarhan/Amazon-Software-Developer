import java.io.File;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.BufferedWriter;

public class Main {
    public static void main(String[] args) {
//        createNewFileWithFile();
//        createNewFileWithFileOutputStream();
//        writeToFileWithFileOutputStream();
        writeToFileWithBufferedWriter();
    }

    private static void createNewFileWithFile() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the name of the file: ");
        String fileName = keyboard.next();
        keyboard.close();

        File file = new File("src/main/resources/" + fileName + ".txt");

        try {
            boolean isFileCreated = file.createNewFile();
            if (isFileCreated) {
                System.out.println("File \"" + fileName + ".txt\" created successfully!");
            }
        } catch (IOException ioException) {
            System.err.println("I/O Exception occurred!");
            System.err.println(ioException.getMessage());
        }
    }

    private static void createNewFileWithFileOutputStream() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the name of the file: ");
        String fileName = keyboard.next();
        keyboard.close();

        File file = new File("src/main/resources/" + fileName + ".txt");

        try (FileOutputStream outputStream = new FileOutputStream(file)) {
            String fileContents = "Sample description for the file";
            byte[] fileContentsBytes = fileContents.getBytes();
            outputStream.write(fileContentsBytes);

        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("File Not Found!");
        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }
    }

    private static void writeToFileWithFileOutputStream() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the name of the file: ");
        String fileName = keyboard.next();
        keyboard.close();

        File file = new File("src/main/resources/" + fileName + ".txt");

        try (FileOutputStream outputStream = new FileOutputStream(file)) {
            String fileContents = "Hello, World!";
            byte[] fileContentsBytes = fileContents.getBytes();
            outputStream.write(fileContentsBytes);
            System.out.println("Data written to file successfully!");
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("File Not Found!");
        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }
    }

    private static void writeToFileWithBufferedWriter() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the name of the file: ");
        String fileName = keyboard.next();
        keyboard.close();

        File file = new File("src/" + fileName + ".txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write("This is a sample string content for the file.");
            System.out.println("Data written to file successfully!");
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("File Not Found!");
        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }
    }
}
