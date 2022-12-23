package p161la;

import com.google.android.exoplayer2.drm.C3912b;

/* renamed from: la.a */
public final /* synthetic */ class C5652a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C3912b.C3913a f18408b;

    /* renamed from: c */
    public final /* synthetic */ C3912b f18409c;

    /* renamed from: d */
    public final /* synthetic */ int f18410d;

    public /* synthetic */ C5652a(C3912b.C3913a aVar, C3912b bVar, int i) {
        this.f18408b = aVar;
        this.f18409c = bVar;
        this.f18410d = i;
    }

    public final void run() {
        C3912b.C3913a aVar = this.f18408b;
        C3912b bVar = this.f18409c;
        int i = this.f18410d;
        int i2 = aVar.f13725a;
        bVar.mo15997f();
        bVar.mo15998g0(aVar.f13725a, aVar.f13726b, i);
    }
}
