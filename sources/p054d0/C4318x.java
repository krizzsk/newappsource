package p054d0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.C0556i;
import androidx.camera.core.C0608j;
import androidx.camera.core.C0627p;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.p017os.OperationCanceledException;
import p066e0.C4450p0;

/* renamed from: d0.x */
public final /* synthetic */ class C4318x implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C0608j f15288b;

    /* renamed from: c */
    public final /* synthetic */ C0627p f15289c;

    /* renamed from: d */
    public final /* synthetic */ Matrix f15290d;

    /* renamed from: e */
    public final /* synthetic */ C0627p f15291e;

    /* renamed from: f */
    public final /* synthetic */ Rect f15292f;

    /* renamed from: g */
    public final /* synthetic */ C0556i.C0557a f15293g;

    /* renamed from: h */
    public final /* synthetic */ CallbackToFutureAdapter.C0673a f15294h;

    public /* synthetic */ C4318x(C0608j jVar, C0627p pVar, Matrix matrix, C0627p pVar2, Rect rect, C0556i.C0557a aVar, CallbackToFutureAdapter.C0673a aVar2) {
        this.f15288b = jVar;
        this.f15289c = pVar;
        this.f15290d = matrix;
        this.f15291e = pVar2;
        this.f15292f = rect;
        this.f15293g = aVar;
        this.f15294h = aVar2;
    }

    public final void run() {
        int i;
        C0608j jVar = this.f15288b;
        C0627p pVar = this.f15289c;
        Matrix matrix = this.f15290d;
        C0627p pVar2 = this.f15291e;
        Rect rect = this.f15292f;
        C0556i.C0557a aVar = this.f15293g;
        CallbackToFutureAdapter.C0673a aVar2 = this.f15294h;
        if (jVar.f2101t) {
            C4450p0 tagBundle = pVar.getImageInfo().getTagBundle();
            long timestamp = pVar.getImageInfo().getTimestamp();
            if (jVar.f2087f) {
                i = 0;
            } else {
                i = jVar.f2084c;
            }
            C4310t0 t0Var = new C4310t0(pVar2, (Size) null, new C4277e(tagBundle, timestamp, i, matrix));
            if (!rect.isEmpty()) {
                t0Var.setCropRect(rect);
            }
            aVar.mo2442c(t0Var);
            aVar2.mo2697b(null);
            return;
        }
        aVar2.mo2698c(new OperationCanceledException("ImageAnalysis is detached"));
    }
}
