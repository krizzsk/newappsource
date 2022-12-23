package com.google.mlkit.vision.common.internal;

import androidx.lifecycle.C1031o;
import androidx.lifecycle.C1045x;
import androidx.lifecycle.Lifecycle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p554id.C17569h;
import p627lg.C18207f;
import p791sg.C19459a;
import p815tg.C19675e;
import p815tg.C19676f;
import p815tg.C19677g;

@KeepForSdk
public class MobileVisionBase<DetectionResultT> implements Closeable, C1031o {

    /* renamed from: f */
    public static final GmsLogger f36787f = new GmsLogger("MobileVisionBase", "");

    /* renamed from: b */
    public final AtomicBoolean f36788b = new AtomicBoolean(false);

    /* renamed from: c */
    public final C18207f f36789c;

    /* renamed from: d */
    public final CancellationTokenSource f36790d;

    /* renamed from: e */
    public final Executor f36791e;

    @KeepForSdk
    public MobileVisionBase(C18207f<DetectionResultT, C19459a> fVar, Executor executor) {
        this.f36789c = fVar;
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        this.f36790d = cancellationTokenSource;
        this.f36791e = executor;
        fVar.f46470b.incrementAndGet();
        fVar.mo50627a(executor, C19677g.f49957b, cancellationTokenSource.getToken()).addOnFailureListener(C19675e.f49954b);
    }

    @KeepForSdk
    /* renamed from: a */
    public final synchronized Task<DetectionResultT> mo43887a(C19459a aVar) {
        Preconditions.checkNotNull(aVar, "InputImage can not be null");
        if (this.f36788b.get()) {
            return Tasks.forException(new MlKitException("This detector is already closed!", 14));
        } else if (aVar.f49481c < 32 || aVar.f49482d < 32) {
            return Tasks.forException(new MlKitException("InputImage width and height should be at least 32!", 3));
        } else {
            return this.f36789c.mo50627a(this.f36791e, new C19676f(this, aVar), this.f36790d.getToken());
        }
    }

    @C1045x(Lifecycle.Event.ON_DESTROY)
    @KeepForSdk
    public synchronized void close() {
        boolean z = true;
        if (!this.f36788b.getAndSet(true)) {
            this.f36790d.cancel();
            C18207f fVar = this.f36789c;
            Executor executor = this.f36791e;
            if (fVar.f46470b.get() <= 0) {
                z = false;
            }
            Preconditions.checkState(z);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            fVar.f46469a.mo50632a(new C17569h(fVar, taskCompletionSource), executor);
            taskCompletionSource.getTask();
        }
    }
}
