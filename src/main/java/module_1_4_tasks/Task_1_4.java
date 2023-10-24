package module_1_4_tasks;

public class Task_1_4 {
    public static void main(String[] args) throws InterruptedException {
        Foo Foo = new Foo();

        Thread A = new Thread(Foo::first);
        Thread B = new Thread(Foo::second);
        Thread C = new Thread(Foo::third);

        A.start();
        A.join();
        B.start();
        B.join();
        C.start();
    }
}

class Foo implements Runnable {
    @Override
    public void run() {}

    public void first() {
        for (int i = 0; i < 10; i++) {
            System.out.println("first" + Thread.currentThread().getName());
        }
    };

    public void second() {
        for (int i = 0; i < 10; i++) {
            System.out.println("second"  + Thread.currentThread().getName());
        }
    };

    public void third() {
        for (int i = 0; i < 10; i++) {
            System.out.println("third"  + Thread.currentThread().getName());
        }
    };
}

