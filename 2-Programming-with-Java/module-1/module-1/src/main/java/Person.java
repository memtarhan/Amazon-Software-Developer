abstract class Person {
    String name;
    int age;

    void getDetails() {
        System.out.println("Name: " + name + " - Age: " + age);
    }
}

interface EmployeeInterface {
    float computeSalary();
    float computeTax();

    abstract void test();
}

interface A {}
interface B {}
interface C extends A, B {}