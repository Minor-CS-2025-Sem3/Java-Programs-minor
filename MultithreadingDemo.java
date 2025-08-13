/*
18. Develop a simple real life application to illustrate the use of multithreading.
*/
class Task extends Thread {
    private String taskName;
    public Task(String name) { this.taskName = name; }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + " step " + i);
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
        System.out.println(taskName + " completed.");
    }
}

public class MultithreadingDemo {
    public static void main(String[] args) {
        Task t1 = new Task("Washing Clothes");
        Task t2 = new Task("Cooking Food");
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {}
        System.out.println("All tasks done.");
    }
}
