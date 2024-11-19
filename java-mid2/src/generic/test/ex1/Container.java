package generic.test.ex1;

public class Container<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public boolean isEmpty() {
        return this.value != null;
    }
}
