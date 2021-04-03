package Java2.Lesson5.MultyTread;
/*
Создаём класс имплементирующий Runnable
в котором обязательно должен быть
переопределён единсвенный метод run()
 */
public class MyRunnableClass implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
