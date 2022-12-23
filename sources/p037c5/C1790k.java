package p037c5;

import android.content.Context;
import android.content.Intent;
import p530hd.C17376a;
import p530hd.C17378c;
import p530hd.C17385j;
import p530hd.C17386k;

/* renamed from: c5.k */
public final class C1790k {

    /* renamed from: a */
    public final Object f6258a;

    /* renamed from: b */
    public final Object f6259b;

    /* renamed from: c */
    public final Object f6260c;

    /* renamed from: d */
    public final Object f6261d;

    public /* synthetic */ C1790k(C17386k kVar, C17378c cVar, Intent intent, Context context) {
        this.f6261d = kVar;
        this.f6258a = cVar;
        this.f6259b = intent;
        this.f6260c = context;
    }

    public /* synthetic */ C1790k(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f6258a = obj;
        this.f6259b = obj2;
        this.f6260c = obj3;
        this.f6261d = obj4;
    }

    /* renamed from: a */
    public final void mo6605a(int i) {
        C17386k kVar = (C17386k) this.f6261d;
        kVar.f44781g.post(new C17385j(kVar, (C17376a) this.f6258a, 6, i));
    }
}
