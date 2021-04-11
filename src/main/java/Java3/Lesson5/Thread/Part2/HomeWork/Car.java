package Java3.Lesson5.Thread.Part2.HomeWork;

import java.util.concurrent.CyclicBarrier;

public class Car implements Runnable {
    private static int CARS_COUNT;
    private Race race;
    private int speed;
    private String name;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    //Конструктор Car подразумевает передачу сюда ссылку на race - ставим машину на гоночный трек
    //В самом race определяем этапы каждый из которых переписывает метод машины go.
    public Car(Race race, int speed) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int)(Math.random() * 800));
            System.out.println(this.name + " готов");
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
