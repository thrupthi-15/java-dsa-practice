package oops.Constructor;

class Student {

    private Student() {
        System.out.println("This is Private Constructor");
    }

    public static void displayMessage() {
        System.out.println("Hello,\"Welcome to Private Constructor\"");
        Student s = new Student();
    }
}

public class PrivateConstructor {

    public static void main(String[] args) {
        Student.displayMessage();
    }
}
