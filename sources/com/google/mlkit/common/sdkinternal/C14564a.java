package com.google.mlkit.common.sdkinternal;

import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_common.zza;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p627lg.C18217p;

@KeepForSdk
/* renamed from: com.google.mlkit.common.sdkinternal.a */
public final class C14564a {

    /* renamed from: b */
    public static final Object f36783b = new Object();

    /* renamed from: c */
    public static C14564a f36784c;

    /* renamed from: a */
    public zza f36785a;

    public C14564a(Looper looper) {
        this.f36785a = new zza(looper);
    }

    @KeepForSdk
    /* renamed from: a */
    public static C14564a m36403a() {
        C14564a aVar;
        synchronized (f36783b) {
            if (f36784c == null) {
                HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                handlerThread.start();
                f36784c = new C14564a(handlerThread.getLooper());
            }
            aVar = f36784c;
        }
        return aVar;
    }

    @KeepForSdk
    /* renamed from: b */
    public static Task m36404b(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zzh.INSTANCE.execute(new C18217p(callable, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @KeepForSdk
    /* renamed from: c */
    public static Executor m36405c() {
        return zzh.INSTANCE;
    }
}
