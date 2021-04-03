package Cicles;

import java.sql.SQLOutput;

public class For {
    public static void main(String[] args) {
        String[] names = new String[5];
        names[0] = "Kirill";
        names[1] = "Vasia";
        names[2] = "Massha";
        names[3] = "Nasha";
        names[4] = "Trollolo";
        String[] colors = {"Blue", "White","Black","Pink"};
        int[] numbers = {1,2,4,5,6,7};

        //(Type var  : vars)
        //Type var - опеределение тип и переменная того же типа
        //vars - переменная, список или массив
        for (String col : colors) {
            System.out.println("Проходя по массиву выводим цвет:" + col);
        }

        for (int num : numbers) {
            System.out.println("Также и с цифрами " + num);
        }

    }

}
