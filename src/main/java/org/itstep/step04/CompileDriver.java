package org.itstep.step04;

import org.itstep.step02.Pair;

/**
 * Обобщения. Вопросы о компиляции
 *
 * @author Nathan Sprague
 * @version V1, 8/2016
 */
public class CompileDriver {

    public static void main(String[] args) {

        // TODO: перед удалением комментариев отметьте каждую строчку, где есть присвоение - сокмпилируется ли код или нет
        Pair<String, Integer> p1;
        Pair<String, Number> p2;//Первый раз про Number слышу
        Pair<Object, Object> p3;
        Pair<?, ?> p4;
        Pair<?, ? extends Number> p5;

        p1 = new Pair<String, Integer>("A", 7);//+ Строка к строке, int запакуется и присваиваем соответствующей переменной
        int a = p1.getSecond();//+ Integer распакуется

        //p1 = new Pair<Integer, Double>(23, 12.0);//- int to Integer, Double to Double но присваиваем не соответствующей переменной

        //p2 = new Pair<String, Integer>("B", 8);//- Не смотря на то что Inteher наследуется от Number, это не про наши дженерики сказано

        //p3 = new Pair<String, Integer>("C", 9);//- Не смотря на то что Inteher наследуется от Object, это не про наши дженерики сказано

        p4 = new Pair<String, String>("House", "Car");//+ String to String и в подходящию переменную
        p4 = new Pair<String, Integer>("D", 10);//+ Хотя не уверен на счет перезаписывания переменной

        //Integer b = p4.getSecond();//- Мы не ограничивали через наследования переменную, не каждый Object можно записать в Integer
        Integer c = (Integer) p4.getSecond();//+ Явное присвоение и не такое может

        //p5 = new Pair<String, String>("E", "G");//- String don't extends of Integer
        p5 = new Pair<String, Double>("E", 11.0);//+ Double extends of Number
        p5 = new Pair<String, Integer>("E", 11);////+ Integer extends of Number

        //Integer d = p5.getSecond();//- Integet enstends of Number, not Number of Integer
        Integer e = (Integer) p5.getSecond();//Не ну компиляцию это пройдет (вроде-бы), но ошибка при выполнении обеспечина, на правильное явное приведение типов
        //Я в шоке, чесно всё делал (только Number загуглил) и получилось не плохо
    }

}
