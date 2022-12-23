package p190o1;

import android.graphics.Typeface;
import android.os.Handler;
import p129j1.C5355e;
import p190o1.C5917k;
import p609km.C18097c;

/* renamed from: o1.c */
public final class C5908c {

    /* renamed from: a */
    public final C18097c f18982a;

    /* renamed from: b */
    public final Handler f18983b;

    public C5908c(C5355e.C5356a aVar, Handler handler) {
        this.f18982a = aVar;
        this.f18983b = handler;
    }

    /* renamed from: a */
    public final void mo21904a(C5917k.C5918a aVar) {
        boolean z;
        int i = aVar.f19006b;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Typeface typeface = aVar.f19005a;
            this.f18983b.post(new C5906a(this.f18982a, typeface));
            return;
        }
        this.f18983b.post(new C5907b(this.f18982a, i));
    }
}
