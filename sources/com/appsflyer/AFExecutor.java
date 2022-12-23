package com.appsflyer;

import android.net.TrafficStats;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class AFExecutor {
    private static AFExecutor $$a;
    public Executor $$b;
    public ScheduledExecutorService AFDateFormat;
    public final ThreadFactory valueOf = new ThreadFactory() {
        public final Thread newThread(final Runnable runnable) {
            return new Thread(new Runnable() {
                public final void run() {
                    TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
                    runnable.run();
                }
            });
        }
    };
    public ScheduledExecutorService values;

    private AFExecutor() {
    }

    public static AFExecutor getInstance() {
        if ($$a == null) {
            $$a = new AFExecutor();
        }
        return $$a;
    }

    public static void values(ExecutorService executorService) {
        try {
            AFLogger.afRDLog("shut downing executor ...");
            executorService.shutdown();
            executorService.awaitTermination(10, TimeUnit.SECONDS);
            if (!executorService.isTerminated()) {
                AFLogger.afRDLog("killing non-finished tasks");
            }
            executorService.shutdownNow();
        } catch (InterruptedException unused) {
            AFLogger.afRDLog("InterruptedException!!!");
            if (!executorService.isTerminated()) {
                AFLogger.afRDLog("killing non-finished tasks");
            }
            executorService.shutdownNow();
        } catch (Throwable th) {
            if (!executorService.isTerminated()) {
                AFLogger.afRDLog("killing non-finished tasks");
            }
            executorService.shutdownNow();
            throw th;
        }
    }

    public final ScheduledThreadPoolExecutor $$a() {
        boolean z;
        ScheduledExecutorService scheduledExecutorService = this.values;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown() || this.values.isTerminated()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.values = Executors.newScheduledThreadPool(2, this.valueOf);
        }
        return (ScheduledThreadPoolExecutor) this.values;
    }

    public Executor getThreadPoolExecutor() {
        boolean z;
        Executor executor = this.$$b;
        if (executor == null || ((executor instanceof ThreadPoolExecutor) && (((ThreadPoolExecutor) executor).isShutdown() || ((ThreadPoolExecutor) this.$$b).isTerminated() || ((ThreadPoolExecutor) this.$$b).isTerminating()))) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.$$b = Executors.newFixedThreadPool(2, this.valueOf);
        }
        return this.$$b;
    }
}
