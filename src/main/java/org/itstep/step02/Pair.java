package org.itstep.step02;

public class Pair<T,D> {

    private final T first;
    private final D second;

    public Pair(T first, D second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public D getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "<" + first.toString() + ", " + second.toString() + ">";
    }

}
