package Java2.Lesson3.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Collections {
    //Лекция занятие
    public static void main(String[] args) {
        //Коллекции работают только с ссылочными типами данных
        //Обёртка над массивом
        //По умолчанию имеет 10 ячеек (0-9) - capacity ёмкость
        ArrayList<String> al = new ArrayList<>();
        System.out.println(al.size());
        for (int i = 0; i < 10; i++) {
            al.add("sSs");
        }
        System.out.println(al.get(1));
        al.add(1, "ASDRE");
        al.get(1);
        al.size();
        //Происходит смещение элементов вправо
        al.add(1, "123123");
        //Происходит смещение элементов влево
        al.remove(1);
        //Удалит ближайшее вхождение в массив (первое слева)
        al.remove("sSs");
        System.out.println(al);
        while (al.remove("sSs"));
        //Замена элемента массива
        al.set(1, "Zamena elementa");
        System.out.println(al);
    }

    //Пару примеров из домашнего задания
    public static void homeWorkExample() {
        List<String> list = new ArrayList<>(Arrays.asList(
                "Cat", "Cat", "Dog", "Better",
                "Better", "Day", "Cat", "Better",
                "Then", "Cat", "Day", "Better",
                "Day", "Better", "Cat", "Dog",
                "Can", "Do", "While", "Cat", "Better"));


        System.out.println("");
        //Задание №2 Телефонный справочник
        System.out.println("Задание 2 - Телефонный справочник");

//        TelephoneBook book1 = new TelephoneBook(new HashMap<>());
//        book1.addPerson("Kirill", new ArrayList<>(Arrays.asList("51-52-53", "54-56-67")));
//        book1.addPerson("Kirill", new ArrayList<>(Arrays.asList("51-3-53", "54-564-67")));
//        book1.addPerson("Vasia", new ArrayList<>(Arrays.asList("54-522-53", "414-99-67")));
//        book1.addPerson("Fokiar", new ArrayList<>(Arrays.asList("54-838-67")));
//        book1.addPerson("Fokiar", new ArrayList<>(Arrays.asList("41-5112-53")));
//        book1.addPerson("Gavriil", new ArrayList<>(Arrays.asList("56-582-41")));
//        book1.getPerson("Vasia");
    }
}
