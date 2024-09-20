package generics;

public class ParameterizedClass {

    public static void main(String[] args) {
        Info<String> s = new Info<>("hello");
    }
}


class Info<T extends String>{ // extends можно super нельзя

    T value; // переменная не может быть статик

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "value: " + value;
    }
}