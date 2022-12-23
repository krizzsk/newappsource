package p176n0;

import androidx.camera.view.C0655a;
import java.util.ArrayList;
import java.util.List;
import p054d0.C4288j;
import p066e0.C4424e;
import p066e0.C4443m;
import p102h0.C5018c;

/* renamed from: n0.d */
public final class C5785d implements C5018c<Void> {

    /* renamed from: a */
    public final /* synthetic */ List f18726a;

    /* renamed from: b */
    public final /* synthetic */ C4288j f18727b;

    /* renamed from: c */
    public final /* synthetic */ C0655a f18728c;

    public C5785d(C0655a aVar, ArrayList arrayList, C4443m mVar) {
        this.f18728c = aVar;
        this.f18726a = arrayList;
        this.f18727b = mVar;
    }

    public final void onFailure(Throwable th) {
        this.f18728c.f2255e = null;
        if (!this.f18726a.isEmpty()) {
            for (C4424e b : this.f18726a) {
                ((C4443m) this.f18727b).mo19977b(b);
            }
            this.f18726a.clear();
        }
    }

    public final void onSuccess(Object obj) {
        Void voidR = (Void) obj;
        this.f18728c.f2255e = null;
    }
}
