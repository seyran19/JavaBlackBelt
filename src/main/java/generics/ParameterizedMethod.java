package generics;

import java.util.ArrayList;

public class ParameterizedMethod {
}

class GenType{

    public static <T> T add(ArrayList<T> list){ // extends можно super нельзя
        return list.get(0);
    }
}
