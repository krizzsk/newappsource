package p304x;

import android.hardware.camera2.TotalCaptureResult;
import p102h0.C5015a;
import p304x.C7045f0;
import p695od.C18728c;

/* renamed from: x.g0 */
public final /* synthetic */ class C7056g0 implements C5015a {

    /* renamed from: a */
    public final /* synthetic */ C7045f0.C7048c f21948a;

    /* renamed from: b */
    public final /* synthetic */ int f21949b;

    public /* synthetic */ C7056g0(C7045f0.C7048c cVar, int i) {
        this.f21948a = cVar;
        this.f21949b = i;
    }

    public final C18728c apply(Object obj) {
        C7045f0.C7048c cVar = this.f21948a;
        int i = this.f21949b;
        TotalCaptureResult totalCaptureResult = (TotalCaptureResult) obj;
        cVar.getClass();
        if (C7045f0.m16553a(i, totalCaptureResult)) {
            cVar.f21929f = C7045f0.C7048c.f21923j;
        }
        return cVar.f21931h.mo23303a(totalCaptureResult);
    }
}
