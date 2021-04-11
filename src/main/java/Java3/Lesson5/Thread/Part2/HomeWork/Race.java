package Java3.Lesson5.Thread.Part2.HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Race {

    //Создаем список этапов для прохождения
    private ArrayList<Stage> stages;
    public ArrayList<Stage> getStages() { return stages; }
    //Так как все этапы являются наследниками "Стадии", то мы можем их добавить в список.
    public Race(Stage... stages) {
        this.stages = new ArrayList<>(Arrays.asList(stages));
    }


}
