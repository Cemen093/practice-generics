package org.itstep.step01;

/**
 * Класс для тестирования кортежа ObjectPair
 *
 * @author Nathan Sprague
 * @version V1, 8/2016
 */
public class ObjectPairDriver {

    /**
     * Создайте несколько пар стадионов, затем распечатайте название стадиона с наибольшей вместимостью.
     *
     * @param args Не используется
     */
    public static void main(String[] args) {

        ObjectPair[] stadiums = new ObjectPair[3];
        stadiums[0] = new ObjectPair("Bridgeforth Stadium", 25000);
        stadiums[1] = new ObjectPair("Michigan Stadium", 109901);
        stadiums[2] = new ObjectPair("Lane Stadium", 66233);

        System.out.println(stadiums[0]);

        System.out.println(largestStadium(stadiums));

        //1. Предоставленный код компилируется, но в основном методе есть логическая ошибка, которая, вероятно,
        // приведет к ошибке времени выполнения, когда вы в методе largestStadium() будете обходить в цикле массива стадионов.
        // Найдите проблему и устраните ее.
        //ХМ, запятая? ХМ, запятая и Строка


        //3. БОНУСНЫЙ ВОПРОС: Почему компилируется эта строка кода?
        //   stadiums[0] = new ObjectPair("Bridgeforth Stadium", 25000);
        //АвтоУпаковщик запаковывает int to Integer при компиляции
    }

    /**
     * Возвращает название стадиона с наибольшей вместимостью.
     *
     * @param stadiums Массив ObjectPairs, где каждая пара содержит название стадиона, за которым следует целое число
     * @return Название стадиона с наибольшей вместимостью
     */
    public static String largestStadium(ObjectPair[] stadiums) {
        if (stadiums == null || stadiums.length == 0){
            return "Тут мои полномочия всё";
        } else if (stadiums.length == 1){
            if (stadiums[0].getFirst() == null){return "Object == null";}
            return stadiums[0].getFirst().toString();
        } else {
            if (stadiums[0].getSecond() == null){return "Object == null";}
            int max = (int)stadiums[0].getSecond();
            int index = 0;
            for (int i = 1; i < stadiums.length; i++) {
                if (stadiums[i].getSecond() == null){return "Object == null";}
                int tmp = (int)stadiums[i].getSecond();
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
