package androidx.activity;

import androidx.activity.ComponentActivity;
import androidx.activity.result.C0206a;
import androidx.activity.result.C0210e;
import p065e.C4410a;

/* renamed from: androidx.activity.e */
public final class C0197e implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f516b;

    /* renamed from: c */
    public final /* synthetic */ C4410a.C4411a f517c;

    /* renamed from: d */
    public final /* synthetic */ ComponentActivity.C0190b f518d;

    public C0197e(ComponentActivity.C0190b bVar, int i, C4410a.C4411a aVar) {
        this.f518d = bVar;
        this.f516b = i;
        this.f517c = aVar;
    }

    public final void run() {
        C0206a<O> aVar;
        ComponentActivity.C0190b bVar = this.f518d;
        int i = this.f516b;
        T t = this.f517c.f15474a;
        String str = (String) bVar.f545b.get(Integer.valueOf(i));
        if (str != null) {
            C0210e.C0211a aVar2 = (C0210e.C0211a) bVar.f549f.get(str);
            if (aVar2 == null || (aVar = aVar2.f552a) == null) {
                bVar.f551h.remove(str);
                bVar.f550g.put(str, t);
            } else if (bVar.f548e.remove(str)) {
                aVar.mo771b(t);
            }
        }
    }
}
