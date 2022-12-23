package p054d0;

import android.util.Size;
import androidx.camera.core.C0627p;
import androidx.camera.core.C0636s;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.Collections;
import p066e0.C4462z;

/* renamed from: d0.b */
public final /* synthetic */ class C4269b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f15176b;

    /* renamed from: c */
    public final /* synthetic */ Object f15177c;

    /* renamed from: d */
    public final /* synthetic */ Object f15178d;

    public /* synthetic */ C4269b(int i, Object obj, Object obj2) {
        this.f15176b = i;
        this.f15177c = obj;
        this.f15178d = obj2;
    }

    public final void run() {
        boolean z;
        switch (this.f15176b) {
            case 0:
                C4272c cVar = (C4272c) this.f15177c;
                cVar.getClass();
                ((C4462z.C4463a) this.f15178d).mo2538c(cVar);
                return;
            case 1:
                C4305r rVar = (C4305r) this.f15177c;
                C0627p pVar = (C0627p) this.f15178d;
                synchronized (rVar.f15248h) {
                    z = rVar.f15249i;
                }
                if (!z) {
                    Size size = new Size(pVar.getWidth(), pVar.getHeight());
                    rVar.f15247g.getClass();
                    String next = rVar.f15247g.getTagBundle().mo19987b().iterator().next();
                    int intValue = ((Integer) rVar.f15247g.getTagBundle().mo19986a(next)).intValue();
                    C4310t0 t0Var = new C4310t0(pVar, size, rVar.f15247g);
                    rVar.f15247g = null;
                    C4312u0 u0Var = new C4312u0(Collections.singletonList(Integer.valueOf(intValue)), next);
                    u0Var.mo19830a(t0Var);
                    try {
                        rVar.f15242b.mo19822a(u0Var);
                    } catch (Exception e) {
                        e.getMessage();
                        C4289j0.m11435b("CaptureProcessorPipeline");
                    }
                }
                synchronized (rVar.f15248h) {
                    rVar.f15250j = false;
                }
                rVar.mo19824c();
                return;
            default:
                C0636s sVar = (C0636s) this.f15177c;
                CallbackToFutureAdapter.C0673a aVar = (CallbackToFutureAdapter.C0673a) this.f15178d;
                synchronized (sVar.f2175a) {
                    if (!sVar.f2193s.isDone()) {
                        sVar.f2193s.cancel(true);
                    }
                    sVar.f2191q.mo19832c();
                }
                if (aVar != null) {
                    aVar.mo2697b(null);
                    return;
                }
                return;
        }
    }
}
