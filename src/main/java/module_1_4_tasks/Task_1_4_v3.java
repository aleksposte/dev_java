package module_1_4_tasks;

import java.util.concurrent.Semaphore;

public class Task_1_4_v3 {
    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo();

        new Thread(() -> {
            try {
                foo.third(new Runnable() {
                    @Override
                    public void run() {}
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                foo.first(new Runnable() {
                    @Override
                    public void run() {}
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                foo.second(new Runnable() {
                    @Override
                    public void run() {}
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}


class Foo {
    private Semaphore firstFinish = new Semaphore(1);
    private Semaphore secondFinish = new Semaphore(0);

    public Foo() {}

    public void first(Runnable runnable) throws InterruptedException {
        runnable.run();
        System.out.println("first " + Thread.currentThread().getName());
        firstFinish.release();
    }

    public void second(Runnable runnable) throws InterruptedException {
        firstFinish.acquire();
        runnable.run();
        System.out.println("second " + Thread.currentThread().getName());
        secondFinish.release();
    }

    public void third(Runnable runnable) throws InterruptedException {
        secondFinish.acquire();
        runnable.run();
        System.out.println("third " + Thread.currentThread().getName());
    }
}
