/*
15. Write a program to demonstrate use of constructor and destructor.
(Note: Java does not have a real destructor. Here we demonstrate a constructor and a cleanup method.
The finalize() method is deprecated; we avoid using it.)
*/
public class ConstructorDestructorDemo {
    private String resource;

    // Constructor
    public ConstructorDestructorDemo() {
        resource = "Some resource allocated";
        System.out.println("Constructor: resource created.");
    }

    // cleanup method (simulating destructor work)
    public void cleanup() {
        resource = null;
        System.out.println("Cleanup: resource released.");
    }

    public static void main(String[] args) {
        ConstructorDestructorDemo obj = new ConstructorDestructorDemo();
        // ... do something ...
        obj.cleanup(); // call cleanup before program ends
    }
}
