package Java3.Lesson5.Thread.Part2.HomeWork;

import java.util.concurrent.Semaphore;

public class Tunnel extends Stage {
    //Для тунеля создаём семафор
    private Semaphore semaphore;

    //Конструктор абстрактного класса родителя Stage
    public Tunnel() {
        this.length = 80;
        this.description = "Тоннель " + length + " метров";
        //доавляем в констуктор поле семафора - количество это поле Cars_Count из класса Main
        this.semaphore = new Semaphore(Main.CARS_COUNT / 2, true);
    }

    //Перегрузка метода абстрактного класса родителя Stage
    @Override
    public void go(Car c) {
        try {
            //проверяем заняты ли потоками semaphore, если да - ждём.
            if (!semaphore.tryAcquire()) {
                System.out.println(c.getName() + " готовится к этапу(ждет): " + description);
                semaphore.acquire();
            }
            System.out.println(c.getName() + " начал этап: " + description);
            Thread.sleep(length / c.getSpeed() * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(c.getName() + " закончил этап: " + description);
        }
        semaphore.release();
    }
}
