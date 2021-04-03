package Java2.Lesson5.MultyTread;

public class MainApp {
    public static void main(String[] args) {
        //Работаем с ранее созданным классом. Создаём объект от Thread
//        new Thread(new MyRunnableClass()).start();
//        new Thread(new MyRunnableClass()).start();


        //new Runnable() - анонимный внутренний класс
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(i);
                }
            }
        });
/*
        //Узнать имя потока, в которым мы находимся
        System.out.println(Thread.currentThread().getName());

        //Запуск потока
        t.start();

        //Просто выполняет метод, а не как поток
        t.run();
*/// Базовое определение потоков и запуска
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(i);
                }
            }
        });

        //Ожидание завершения потока перед выполнением след операции - join()
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("END");

        //Запись через лямбду
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        });
        t2.start();


    }

}
