package com.usebutton.sdk.internal.core;

import java.util.LinkedHashSet;
import java.util.Set;

public abstract class Command<T> {
    private boolean mCancelled;
    public final Set<FailableReceiver<T>> mReceivers;

    public Command() {
        this.mReceivers = new LinkedHashSet();
        this.mCancelled = false;
    }

    public synchronized void cancel() {
        this.mReceivers.clear();
        this.mCancelled = true;
    }

    public void deliverFailure() {
        for (FailableReceiver<T> onError : this.mReceivers) {
            onError.onError();
        }
    }

    public void deliverSuccess(T t) {
        for (FailableReceiver<T> onResult : this.mReceivers) {
            onResult.onResult(t);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return key().equals(((Command) obj).key());
    }

    public abstract T execute() throws Exception;

    public int hashCode() {
        return key().hashCode();
    }

    public synchronized boolean isCancelled() {
        return this.mCancelled;
    }

    public void join(Command command) {
        if (command.key().equals(key())) {
            this.mReceivers.addAll(command.mReceivers);
        }
    }

    public abstract String key();

    public String toString() {
        StringBuilder k = C13555b.m33972k("Command{key=");
        k.append(key());
        k.append(", mCancelled=");
        return C13715c.m34247m(k, this.mCancelled, '}');
    }

    public Command(FailableReceiver<T> failableReceiver) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.mReceivers = linkedHashSet;
        this.mCancelled = false;
        linkedHashSet.add(failableReceiver);
    }
}
