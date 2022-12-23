package p054d0;

import androidx.camera.core.C0550f;
import androidx.camera.core.CameraX;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.Executor;

/* renamed from: d0.n */
public final /* synthetic */ class C4296n implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ CameraX f15220b;

    /* renamed from: c */
    public final /* synthetic */ Executor f15221c;

    /* renamed from: d */
    public final /* synthetic */ long f15222d;

    /* renamed from: e */
    public final /* synthetic */ CallbackToFutureAdapter.C0673a f15223e;

    public /* synthetic */ C4296n(CameraX cameraX, Executor executor, long j, CallbackToFutureAdapter.C0673a aVar) {
        this.f15220b = cameraX;
        this.f15221c = executor;
        this.f15222d = j;
        this.f15223e = aVar;
    }

    public final void run() {
        CameraX cameraX = this.f15220b;
        Executor executor = this.f15221c;
        long j = this.f15222d;
        executor.execute(new C0550f(cameraX, cameraX.f1836i, executor, this.f15223e, j));
    }
}
