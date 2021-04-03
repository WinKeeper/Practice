package Java3.Lesson1.Generic;

//Объявляем обобщенный класс
public class GenericPractice<T> {
    //T - параметизированный тип
    private T obj;

    public GenericPractice(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}
