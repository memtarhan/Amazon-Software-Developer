import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
//        writeToFileWithBufferedWriter();
//        writeToFileWithFileWriter();
//        writeToFileWithPrintWriter();
        readFileWithBufferedReader();
    }

    // MARK: - Using the Writer classes

    // MARK: - Using BufferedWriter to write a text file
    public static void writeToFileWithBufferedWriter() {
        try {
            FileOutputStream outputStream = new FileOutputStream("EmployeeList.txt");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, StandardCharsets.UTF_16);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

            Employee employee = new Employee("John", 23, 50000);

            bufferedWriter.write(employee.toString());
            bufferedWriter.newLine();

            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Exception:" + e.getMessage());
        }
    }

    // MARK: - Using FileWriter to write a text file
    public static void writeToFileWithFileWriter() {
        try {
            FileWriter writer = new FileWriter("EmployeeList.txt");

            Employee employee = new Employee("Jake", 21, 50000);

            writer.write(employee.toString());
            writer.write("\r\n"); // The \r\n adds a new line in the file after the employee data, ensuring each entry appears on a separate line.
            writer.close();

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    // MARK: - Using PrintWriter to write a text file
    public static void writeToFileWithPrintWriter() {
        try {
            Employee employee = new Employee("John", 23, 50000);

            FileWriter fileWriter = new FileWriter("Employee.txt");

            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(employee);
//            printWriter.printf("Name: %s, Age: %d, Salary: %.2f%n",employee.getName(), employee.getAge(), employee.getSalary());
            printWriter.close();

        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    // MARK: - Reader classes
    // MARK: - Using InputStreamReader to read a text file
    public static void readFileWithInputStreamReader() {
//        try {
//            FileInputStream inputStream = new FileInputStream("EmployeeList.txt");
//            InputStreamReader reader = new InputStreamReader(inputStream);
//
//            int character;
//            while ((character = reader.read()) != -1) {
//                System.out.print((char) character);
//            }
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        }

        try {
            FileReader reader = new FileReader("EmployeeList.txt");
            int character;

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("Exception:" + e.getMessage());
        }

    }

    // MARK: - Using FileReader and BufferedReader to read a text file
    public static void readFileWithBufferedReader() {
        try {
            FileReader reader = new FileReader("EmployeeList.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("Exception:" + e.getMessage());
            ;
        }
    }
}


class Employee {
    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + this.name + '\'' + ", age=" + this.age + ", salary= $" + this.salary + '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}

