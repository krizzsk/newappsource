package com.usebutton.thirdparty.com.squareup;

import java.util.List;

public interface ObjectQueue<T> {

    public interface Listener<T> {
        void onAdd(ObjectQueue<T> objectQueue, T t);

        void onRemove(ObjectQueue<T> objectQueue);
    }

    void add(T t);

    T peek();

    List<T> peek(int i);

    void remove();

    void remove(int i) throws Exception;

    void setListener(Listener<T> listener);

    int size();
}
