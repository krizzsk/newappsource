package com.usebutton.sdk.internal.util;

import android.os.SystemClock;

public class TtlReference<T> {
    public static final TimeProvider REALTIME_MILLIS_PROVIDER = new TimeProvider() {
        public long getTimeInMs() {
            return SystemClock.elapsedRealtime();
        }
    };
    private final T mObject;
    private final long mTimeOfDeath;
    private final TimeProvider mTimeProvider;

    public TtlReference(TimeProvider timeProvider, T t, long j) {
        this.mObject = t;
        this.mTimeOfDeath = timeProvider.getTimeInMs() + j;
        this.mTimeProvider = timeProvider;
    }

    public T get() {
        if (isDead()) {
            return null;
        }
        return this.mObject;
    }

    public boolean isDead() {
        return this.mTimeProvider.getTimeInMs() > this.mTimeOfDeath;
    }
}
