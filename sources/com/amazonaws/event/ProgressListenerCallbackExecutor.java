package com.amazonaws.event;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;

public class ProgressListenerCallbackExecutor {
    public static ExecutorService executor = createNewExecutorService();
    /* access modifiers changed from: private */
    public final ProgressListener listener;

    public ProgressListenerCallbackExecutor(ProgressListener progressListener) {
        this.listener = progressListener;
    }

    public static ExecutorService createNewExecutorService() {
        return Executors.newSingleThreadExecutor(new ThreadFactory() {
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                thread.setName("android-sdk-progress-listener-callback-thread");
                thread.setDaemon(true);
                return thread;
            }
        });
    }

    public static ExecutorService getExecutorService() {
        return executor;
    }

    public static Future<?> progressChanged(final ProgressListener progressListener, final ProgressEvent progressEvent) {
        if (progressListener == null) {
            return null;
        }
        return executor.submit(new Runnable() {
            public void run() {
                progressListener.progressChanged(progressEvent);
            }
        });
    }

    public static ProgressListenerCallbackExecutor wrapListener(ProgressListener progressListener) {
        if (progressListener == null) {
            return null;
        }
        return new ProgressListenerCallbackExecutor(progressListener);
    }

    public ProgressListener getListener() {
        return this.listener;
    }

    public void progressChanged(final ProgressEvent progressEvent) {
        if (this.listener != null) {
            executor.submit(new Runnable() {
                public void run() {
                    ProgressListenerCallbackExecutor.this.listener.progressChanged(progressEvent);
                }
            });
        }
    }

    public ProgressListenerCallbackExecutor() {
        this.listener = null;
    }
}
