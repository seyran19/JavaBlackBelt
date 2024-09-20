package generics;

import java.util.ArrayList;

public class WildCard {

    public static void main(String[] args) {
        // сюда ничего не добавим т.к при добавлении компилятор сверяет тип
        // добавляемого объекта с типом нашего лмста, а тип нашего листа не указан))
        ArrayList<?> list = new ArrayList<Integer>();
        ArrayList<? extends Number> list2 = new ArrayList<Integer>();

        // тут можно добавлять но получать будем всегда Object
        ArrayList<? super Number> list3 = new ArrayList<Object>();

    }
    /// Такая же ошибка при переопределении может быть т.к типы стираются!!!
    public void abc(ArrayList<Integer> list) {}
    public void abc(ArrayList<String> list2) {}
}
