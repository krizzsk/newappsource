package com.appsflyer.internal.referrer;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

public abstract class Referrer extends Observable {
    private State $$a = State.NOT_STARTED;
    /* access modifiers changed from: private */
    public final Runnable $$b;
    public final Map<String, Object> map = new HashMap();
    private final String valueOf;
    private long values;

    public enum State {
        NOT_STARTED,
        STARTED,
        FINISHED
    }

    public Referrer(String str, Runnable runnable) {
        this.$$b = runnable;
        this.valueOf = str;
    }

    public void finish() {
        this.map.put("source", this.valueOf);
        this.map.putAll(new MandatoryFields());
        this.map.put(Payload.LATENCY, Long.valueOf(System.currentTimeMillis() - this.values));
        this.$$a = State.FINISHED;
        setChanged();
        notifyObservers();
    }

    public String getSource() {
        return this.valueOf;
    }

    public State getState() {
        return this.$$a;
    }

    public void start() {
        this.values = System.currentTimeMillis();
        this.$$a = State.STARTED;
        addObserver(new Observer() {
            public final void update(Observable observable, Object obj) {
                Referrer.this.$$b.run();
            }
        });
    }

    public abstract void start(Context context);
}
