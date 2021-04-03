package Java2.Lesson5.MultyTread;

public class LambdaApp {
    public static void main(String[] args) {

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(1);
            }
        });

        //Можно создать lambda из
        //FunctionalInterface - интерфейс с одним методом
        //где () перед "->" это тело метода
        Thread t1 = new Thread(() -> System.out.println(1));

        //Если выделить Runnable и прожать Alt+Enter можно создать лямбду сборщиком
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(1);
            }
        });



    }
}
