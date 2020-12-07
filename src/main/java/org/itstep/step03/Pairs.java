package org.itstep.step03;

import org.itstep.step02.Pair;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Pairs<K, V> implements Iterable<Pair<K, V>> {
    private static final int MAX_SIZE= 10;
    private Pair<K, V>[] pairs;
    private int size;

    public Pairs() {
        pairs = new Pair[MAX_SIZE];//не понял как подавить предупреждение аннотацией
        size = 0;
    }

    public boolean addPair(K first, V second) {
        if (size < MAX_SIZE){
            pairs[size++] = new Pair<>(first, second);
            return true;
        }
        else {
            return false;
        }
    }


    @Override
    public Iterator<Pair<K, V>> iterator() {
        return new PairIterator();
    }

    private class PairIterator implements Iterator<Pair<K, V>> {
        private int index;
        private boolean chek = true;

        @Override
        public boolean hasNext() {
            if (index < size){
                return true;
            }
            else {
                return false;
            }
        }

        @Override
        public Pair<K, V> next() {
            if (index < size){
                chek = false;
                return pairs[index++];
            }
            throw new NoSuchElementException("Элементов больше нет");
        }

        @Override
        public void remove() {
            if (chek){
                throw new IllegalStateException();//Вот это исключение подстава подстав, как и ссылка на англ ресурс
            }
            for (int i = index; i < size; i++) {
                pairs[i - 1] = pairs[i];
            }
            pairs[--size] = null;
            chek = true;
        }
    }
}
