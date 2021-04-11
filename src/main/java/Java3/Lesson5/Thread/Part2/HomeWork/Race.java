package Java3.Lesson5.Thread.Part2.HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Race {
    private static final CyclicBarrier cb = new CyclicBarrier(Main.CARS_COUNT + 1);

    //Создаем список этапов для прохождения
    private ArrayList<Stage> stages;
    public ArrayList<Stage> getStages() { return stages; }
    //Так как все этапы являются наследниками "Стадии", то мы можем их добавить в список.
    public Race(Stage... stages) {
        this.stages = new ArrayList<>(Arrays.asList(stages));
    }


    //Простой метод для сбора всех участников
    public void waitCompetitors() {
        try {
            cb.await();
        } catch (InterruptedException| BrokenBarrierException e){
            e.printStackTrace();
        }
    }

}
