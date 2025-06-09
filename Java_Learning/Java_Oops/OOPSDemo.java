package Java_Oops;

// Abstract class to demonstrate abstraction
abstract class Person {
    // Abstract method (no body)
    abstract void displayInfo();

    // Concrete method
    void greet() {
        System.out.println("Hello from Person!");
    }
}

// Class demonstrating inheritance (Student is-a Person)
class Student extends Person {
    // Instance variables (Encapsulation with private access)
    private String name;
    private int age;
    private int rollNumber;

    // Constructor (special method to initialize objects)
    public Student(String name, int age, int rollNumber) {
        this.name = name;         // 'this' refers to current object's variable
        this.age = age;
        this.rollNumber = rollNumber;
    }

    // Getters (for encapsulation)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    // Setters (for encapsulation)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    // Method Overloading (Compile-time Polymorphism)
    public void displayInfo(String prefix) {
        System.out.println(prefix + ": " + name + ", " + age + " years, Roll #" + rollNumber);
    }

    // Method Overriding (Run-time Polymorphism, from abstract class)
    @Override
    public void displayInfo() {
        System.out.println("Student Info: " + name + ", Age: " + age + ", Roll No: " + rollNumber);
    }
}

// Main class to run the program
public class OOPSDemo {
    public static void main(String[] args) {
        // Creating object (instance) of Student class
        Student student1 = new Student("Hemant", 21, 101);

        // Accessing method (Polymorphism in action)
        student1.displayInfo(); // Overridden method
        student1.displayInfo("Details"); // Overloaded method

        // Using encapsulation (getters/setters)
        System.out.println("Name using getter: " + student1.getName());

        // Changing data using setter
        student1.setAge(22);
        System.out.println("Updated Age: " + student1.getAge());

        // Using method from abstract parent class
        student1.greet();
    }
}
