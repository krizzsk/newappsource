package p265tb;

import android.content.Context;
import p265tb.C6654g;
import p265tb.C6664o;

/* renamed from: tb.n */
public final class C6663n implements C6654g.C6655a {

    /* renamed from: a */
    public final Context f20723a;

    /* renamed from: b */
    public final C6671u f20724b = null;

    /* renamed from: c */
    public final C6654g.C6655a f20725c;

    public C6663n(Context context, String str) {
        C6664o.C6665a aVar = new C6664o.C6665a();
        aVar.f20741b = str;
        this.f20723a = context.getApplicationContext();
        this.f20725c = aVar;
    }

    /* renamed from: a */
    public final C6654g mo22825a() {
        C6662m mVar = new C6662m(this.f20723a, this.f20725c.mo22825a());
        C6671u uVar = this.f20724b;
        if (uVar != null) {
            mVar.mo20680d(uVar);
        }
        return mVar;
    }
}
