package module_1_4_tasks;

public class Foo_V1 {
    public static void main(String[] args) {
//        // v_1
        Thread PrintOne = new Thread(new PrintOne());
        Thread PrintTwo = new Thread(new PrintTwo());
        Thread PrintThree = new Thread(new PrintThree());

        PrintOne.start();
        try {
            PrintOne.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        PrintTwo.start();
        try {
            PrintTwo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        PrintThree.start();

//         end v_1
    }
}

class PrintOne implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("PrintOne "  + Thread.currentThread().getName());
        }

    }
}

class PrintTwo implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("PrintTwo " + Thread.currentThread().getName());
        }
    }
}


class PrintThree implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("PrintThree " + Thread.currentThread().getName());
        }
    }
}

