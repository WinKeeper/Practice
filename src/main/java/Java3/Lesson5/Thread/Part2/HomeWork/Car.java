package Java3.Lesson5.Thread.Part2.HomeWork;

import java.util.concurrent.CyclicBarrier;

public class Car implements Runnable {
    private static int CARS_COUNT;
    private Race race;
    private int speed;
    private String name;
    //Казалось можно создать общий барьер на классы.
    private CyclicBarrier cb;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    //Конструктор Car подразумевает передачу сюда ссылку на race - ставим машину на гоночный трек
    //В самом race определяем этапы каждый из которых переписывает метод машины go.
    //Передаём в конструктор барьер из Main this.cb = cb.
    public Car(Race race, int speed, CyclicBarrier cb) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
        this.cb = cb;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int)(Math.random() * 800));
            System.out.println(this.name + " готов");
            cb.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }
        if (Main.latch.getCount() != 0) {
            Main.latch.countDown();
            System.out.println(this.name + " победил!");
        }
    }


}
