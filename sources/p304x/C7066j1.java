package p304x;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import androidx.camera.core.impl.C0578e;
import androidx.camera.core.impl.C0589m;
import androidx.camera.core.impl.C0590n;
import androidx.camera.core.impl.utils.executor.SequentialExecutor;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.Collections;
import java.util.concurrent.Executor;
import p291w.C6956a;

/* renamed from: x.j1 */
public final class C7066j1 {

    /* renamed from: j */
    public static final MeteringRectangle[] f21969j = new MeteringRectangle[0];

    /* renamed from: a */
    public final C7090q f21970a;

    /* renamed from: b */
    public final Executor f21971b;

    /* renamed from: c */
    public volatile boolean f21972c = false;

    /* renamed from: d */
    public int f21973d = 1;

    /* renamed from: e */
    public C7057g1 f21974e = null;

    /* renamed from: f */
    public MeteringRectangle[] f21975f;

    /* renamed from: g */
    public MeteringRectangle[] f21976g;

    /* renamed from: h */
    public MeteringRectangle[] f21977h;

    /* renamed from: i */
    public CallbackToFutureAdapter.C0673a<Void> f21978i;

    public C7066j1(C7090q qVar, SequentialExecutor sequentialExecutor) {
        MeteringRectangle[] meteringRectangleArr = f21969j;
        this.f21975f = meteringRectangleArr;
        this.f21976g = meteringRectangleArr;
        this.f21977h = meteringRectangleArr;
        this.f21978i = null;
        this.f21970a = qVar;
        this.f21971b = sequentialExecutor;
    }

    /* renamed from: a */
    public final void mo23309a(boolean z, boolean z2) {
        if (this.f21972c) {
            C0578e.C0579a aVar = new C0578e.C0579a();
            aVar.f1981e = true;
            aVar.f1979c = this.f21973d;
            C0589m t = C0589m.m1674t();
            if (z) {
                t.mo2503w(C6956a.m16424s(CaptureRequest.CONTROL_AF_TRIGGER), 2);
            }
            if (Build.VERSION.SDK_INT >= 23 && z2) {
                t.mo2503w(C6956a.m16424s(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER), 2);
            }
            aVar.mo2481c(new C6956a(C0590n.m1678s(t)));
            this.f21970a.mo23337p(Collections.singletonList(aVar.mo2482d()));
        }
    }
}
