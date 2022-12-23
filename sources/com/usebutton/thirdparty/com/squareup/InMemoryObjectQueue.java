package com.usebutton.thirdparty.com.squareup;

import com.usebutton.thirdparty.com.squareup.ObjectQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class InMemoryObjectQueue<T> implements ObjectQueue<T> {
    private ObjectQueue.Listener<T> listener;
    private final Queue<T> tasks = new LinkedList();

    public void add(T t) {
        this.tasks.add(t);
        ObjectQueue.Listener<T> listener2 = this.listener;
        if (listener2 != null) {
            listener2.onAdd(this, t);
        }
    }

    public T peek() {
        return this.tasks.peek();
    }

    public void remove() {
        this.tasks.remove();
        ObjectQueue.Listener<T> listener2 = this.listener;
        if (listener2 != null) {
            listener2.onRemove(this);
        }
    }

    public void setListener(ObjectQueue.Listener<T> listener2) {
        if (listener2 != null) {
            for (T onAdd : this.tasks) {
                listener2.onAdd(this, onAdd);
            }
        }
        this.listener = listener2;
    }

    public int size() {
        return this.tasks.size();
    }

    public List<T> peek(int i) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.tasks.iterator();
        while (it.hasNext() && arrayList.size() < i) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public void remove(int i) throws Exception {
        for (int i2 = 0; i2 < i; i2++) {
            this.tasks.remove();
        }
    }
}
