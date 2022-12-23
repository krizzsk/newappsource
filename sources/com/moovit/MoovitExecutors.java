package com.moovit;

import androidx.annotation.Keep;
import com.google.android.gms.tasks.TaskExecutors;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p172m9.C5720b;
import p977zz.C20932c0;

@Keep
public final class MoovitExecutors {
    public static final ExecutorService COMPUTATION = C5720b.m14033A(100, "m-computation");

    /* renamed from: IO */
    public static final ExecutorService f37327IO = C5720b.m14033A(5, "m-io");
    public static final Executor MAIN_THREAD = TaskExecutors.MAIN_THREAD;
    public static final ExecutorService SINGLE = Executors.newSingleThreadExecutor(C20932c0.m49025a("m-single"));

    private MoovitExecutors() {
        throw new IllegalStateException("No instances!");
    }
}
