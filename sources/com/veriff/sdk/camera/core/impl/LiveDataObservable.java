package com.veriff.sdk.camera.core.impl;

import androidx.lifecycle.C1043v;
import androidx.lifecycle.C1044w;
import com.veriff.sdk.camera.core.impl.Observable;
import com.veriff.sdk.camera.core.impl.utils.executor.CameraXExecutors;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p001a0.C0016g;

public final class LiveDataObservable<T> implements Observable<T> {
    public final C1043v<Result<T>> mLiveData = new C1043v<>();
    private final Map<Observable.Observer<? super T>, LiveDataObserverAdapter<T>> mObservers = new HashMap();

    public static final class LiveDataObserverAdapter<T> implements C1044w<Result<T>> {
        public final AtomicBoolean mActive = new AtomicBoolean(true);
        public final Executor mExecutor;
        public final Observable.Observer<? super T> mObserver;

        public LiveDataObserverAdapter(Executor executor, Observable.Observer<? super T> observer) {
            this.mExecutor = executor;
            this.mObserver = observer;
        }

        /* access modifiers changed from: private */
        public void lambda$onChanged$0(Result result) {
            if (this.mActive.get()) {
                if (result.completedSuccessfully()) {
                    this.mObserver.onNewData(result.getValue());
                    return;
                }
                result.getError().getClass();
                this.mObserver.onError(result.getError());
            }
        }

        public void disable() {
            this.mActive.set(false);
        }

        public void onChanged(Result<T> result) {
            this.mExecutor.execute(new C12531c(this, result));
        }
    }

    public static final class Result<T> {
        private final Throwable mError;
        private final T mValue;

        private Result(T t, Throwable th) {
            this.mValue = t;
            this.mError = th;
        }

        public static <T> Result<T> fromValue(T t) {
            return new Result<>(t, (Throwable) null);
        }

        public boolean completedSuccessfully() {
            return this.mError == null;
        }

        public Throwable getError() {
            return this.mError;
        }

        public T getValue() {
            if (completedSuccessfully()) {
                return this.mValue;
            }
            throw new IllegalStateException("Result contains an error. Does not contain a value.");
        }

        public String toString() {
            String str;
            StringBuilder k = C13555b.m33972k("[Result: <");
            if (completedSuccessfully()) {
                StringBuilder k2 = C13555b.m33972k("Value: ");
                k2.append(this.mValue);
                str = k2.toString();
            } else {
                StringBuilder k3 = C13555b.m33972k("Error: ");
                k3.append(this.mError);
                str = k3.toString();
            }
            return C0016g.m31o(k, str, ">]");
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$addObserver$2(LiveDataObserverAdapter liveDataObserverAdapter, LiveDataObserverAdapter liveDataObserverAdapter2) {
        if (liveDataObserverAdapter != null) {
            this.mLiveData.removeObserver(liveDataObserverAdapter);
        }
        this.mLiveData.observeForever(liveDataObserverAdapter2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$removeObserver$3(LiveDataObserverAdapter liveDataObserverAdapter) {
        this.mLiveData.removeObserver(liveDataObserverAdapter);
    }

    public void addObserver(Executor executor, Observable.Observer<? super T> observer) {
        synchronized (this.mObservers) {
            LiveDataObserverAdapter liveDataObserverAdapter = this.mObservers.get(observer);
            if (liveDataObserverAdapter != null) {
                liveDataObserverAdapter.disable();
            }
            LiveDataObserverAdapter liveDataObserverAdapter2 = new LiveDataObserverAdapter(executor, observer);
            this.mObservers.put(observer, liveDataObserverAdapter2);
            CameraXExecutors.mainThreadExecutor().execute(new C12529a(this, liveDataObserverAdapter, liveDataObserverAdapter2));
        }
    }

    public void postValue(T t) {
        this.mLiveData.postValue(Result.fromValue(t));
    }

    public void removeObserver(Observable.Observer<? super T> observer) {
        synchronized (this.mObservers) {
            LiveDataObserverAdapter remove = this.mObservers.remove(observer);
            if (remove != null) {
                remove.disable();
                CameraXExecutors.mainThreadExecutor().execute(new C12530b(this, remove));
            }
        }
    }
}
