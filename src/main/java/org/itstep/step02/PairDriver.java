package org.itstep.step02;

import java.util.ArrayList;
import java.util.List;

public class PairDriver {
    public static void main(String[] args) {


        //List<Pair<String, Integer>> stadiums = new ArrayList<>();
        Pair<String, Integer>[] stadiums = new Pair[3];//Тут не уверен как правильно с массивом работать
        /*К сожалению, в Java невозможно напрямую создать массив обобщенных объектов.
        Этот код не скомпилируется:
        pairs = new Pair<K, V>[CAPACITY];
        В этом случае самое простое решение - использовать так называемый "сырой" ("raw") массив:
        pairs = new Pair[CAPACITY];*/
        //Аррррррр
        stadiums[0] = new Pair<String, Integer>("Bridgeforth Stadium", 25000);
        stadiums[1] = new Pair<String, Integer>("Michigan Stadium", 109901);
        stadiums[2] = new Pair<String, Integer>("Lane Stadium", 66233);

        System.out.println(stadiums[0]);

        System.out.println(largestStadium(stadiums));

        /*БОНУСНЫЙ ВОПРОС: Что произойдет, если вы повторно воспроизведете проблему, которую вы исправили на шаге 1 из предыдущего блока?
        Будет ли компилироваться полученный код? Как вы думаете, почему обобщенные классы коллекций иногда называют «типобезопасными» коллекциями?*/

        //Компиляция не пройдет из-за несовместимости типов (не возможности преобразовать String to Integer)
        //Типообразность в програмировании обозначает надежность, Обобщенные классы позволяют сохранить строгую типизацию.

        //БОНУСНЫЙ ВОПРОС: Перечислите некоторые причины, по которым класс Pair может быть предпочтительнее класса ObjectPair.
        // Можете ли вы предположить ситуации, в которых класс ObjectPair может быть предпочтительнее класса Pair?

        //Строгая типизация, обнаружение проблем на этапе компиляции
        //В ситуации при которрй мы хотим хранить разные типы данных и правильно их обрабатываем (например int, double, String),

    }

    public static String largestStadium(Pair<String, Integer>[] stadiums) {
        if (stadiums == null || stadiums.length == 0){
            return "Тут мои полномочия всё";
        } else if (stadiums.length == 1){
            if (stadiums[0].getFirst() == null){return "Object == null";}
            return stadiums[0].getFirst().toString();
        } else {
            if (stadiums[0].getSecond() == null){return "Object == null";}
            double max = Double.parseDouble(stadiums[0].getSecond().toString());
            int index = 0;
            for (int i = 1; i < stadiums.length; i++) {
                if (stadiums[i].getSecond() == null){return "Object == null";}
                int tmp = stadiums[i].getSecond();
                if ( tmp > max){
                    max = tmp;
                    index = i;
                }
            }
            if (stadiums[index].getFirst() == null){return "Object == null";}
            return stadiums[index].getFirst().toString();
        }
    }

}
