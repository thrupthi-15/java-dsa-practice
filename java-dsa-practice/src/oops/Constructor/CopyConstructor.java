package oops.Constructor;

class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student(Student obj2) {
        this.name = obj2.name;
        this.age = obj2.age;
    }
}

public class CopyConstructor {

    public static void main(String[] args) {
        System.out.println("First Object");
        Student s1 = new Student("Alice", 20);
        System.out.println("Name: " + s1.name + " Age: " + s1.age);
        System.out.println("Second Object");
        Student s2 = new Student(s1);
        System.out.println("Name: " + s2.name + " Age: " + s2.age);
    }
}
