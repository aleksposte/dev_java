package module_1_4_tasks;

public class Task_1_4_v2 {
    public static void main(String[] args) throws InterruptedException {
        FooV2 foo = new FooV2();

        new Thread(() -> {
            try {
                foo.first(new Thread());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                foo.second(new Thread());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                foo.third(new Thread());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}

class FooV2 {
    private boolean firstFinish = false;
    private boolean secondFinish = false;
    private final Object lock = new Object();

    public void first(Thread thread) throws InterruptedException {
        synchronized (lock) {
            System.out.println("first " + Thread.currentThread().getName());

            thread.run();
            firstFinish = true;
            lock.notifyAll();
        }
    }

    public void second(Thread thread) throws InterruptedException {
        synchronized (lock) {
            while (!firstFinish) {
                lock.wait();
            }

            System.out.println("second " + Thread.currentThread().getName());

            thread.run();
            secondFinish = true;
            lock.notifyAll();
        }
    }

    public void third(Thread thread) throws InterruptedException {
        synchronized (lock) {
            while (!secondFinish) {
                lock.wait();
            }

            System.out.println("third " + Thread.currentThread().getName());

            thread.run();
            lock.notifyAll();
        }
    }
}
