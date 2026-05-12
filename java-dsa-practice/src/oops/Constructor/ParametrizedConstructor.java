package oops.Constructor;

class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name of the student is " + name + " and Age is " + age);
    }
}

public class ParametrizedConstructor {

    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20);
        s1.displayDetails();
    }
}
