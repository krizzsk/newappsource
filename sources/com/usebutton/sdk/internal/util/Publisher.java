package com.usebutton.sdk.internal.util;

import com.usebutton.sdk.internal.functional.Observable;
import java.util.WeakHashMap;

public class Publisher<T> implements Observable<T> {
    private final WeakHashMap<T, Object> mObservers = new WeakHashMap<>();

    public interface Action<T> {
        void perform(T t);
    }

    public synchronized void perform(Action<T> action) {
        for (Object perform : new WeakHashMap(this.mObservers).keySet()) {
            action.perform(perform);
        }
    }

    public synchronized void subscribeWeak(T t) {
        if (!this.mObservers.containsKey(t)) {
            this.mObservers.put(t, (Object) null);
        }
    }

    public synchronized void unsubscribe(T t) {
        this.mObservers.remove(t);
    }
}
