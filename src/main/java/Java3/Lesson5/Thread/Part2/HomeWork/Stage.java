package Java3.Lesson5.Thread.Part2.HomeWork;

import java.util.concurrent.CyclicBarrier;

public abstract class Stage {
    protected int length;
    protected String description;

    public String getDescription() {
        return description;
    }

    //Метод для прохождения этапа в который мы передём машину
    public abstract void go(Car c);


}
