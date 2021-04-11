package Java3.Lesson4.Thread.Part1;


public class Wait_Notify_Notifyall {
    private boolean Flag = true;
    private final Object mon = new Object();
    private volatile char currentChar = 'A'; //не помню, чтобы мы обсуждали Volatile (непостоянный)

    public static void main(String[] args) {
        Wait_Notify_Notifyall obj = new Wait_Notify_Notifyall();
        Thread t1 = new Thread(() -> {
            obj.typeA();
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.typeB();
            }
        });
        Thread t3 = new Thread(() -> {
            obj.typeC();
        });
        t1.start();
        t2.start();
        t3.start();
    }

    //По идее можно было сделать статичный класс synchronized static - вызывая классом
    public void typeA() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (currentChar != 'A') {
                        mon.wait();
                    }
                    System.out.println('A');
                    currentChar = 'B';
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void typeB() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (currentChar != 'B') {
                        mon.wait();
                    }
                    System.out.println('B');
                    currentChar = 'C';
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void typeC() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (currentChar != 'C') {
                        mon.wait();
                    }
                    System.out.println('C');
                    currentChar = 'A';
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
