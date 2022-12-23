package androidx.activity.result;

import androidx.activity.result.C0210e;
import androidx.lifecycle.C1025n;
import androidx.lifecycle.C1033p;
import androidx.lifecycle.Lifecycle;
import p065e.C4410a;

class ActivityResultRegistry$1 implements C1025n {

    /* renamed from: b */
    public final /* synthetic */ String f530b;

    /* renamed from: c */
    public final /* synthetic */ C0206a f531c;

    /* renamed from: d */
    public final /* synthetic */ C4410a f532d;

    /* renamed from: e */
    public final /* synthetic */ C0210e f533e;

    public ActivityResultRegistry$1(C0210e eVar, String str, C0206a aVar, C4410a aVar2) {
        this.f533e = eVar;
        this.f530b = str;
        this.f531c = aVar;
        this.f532d = aVar2;
    }

    /* renamed from: f */
    public final void mo740f(C1033p pVar, Lifecycle.Event event) {
        if (Lifecycle.Event.ON_START.equals(event)) {
            this.f533e.f549f.put(this.f530b, new C0210e.C0211a(this.f532d, this.f531c));
            if (this.f533e.f550g.containsKey(this.f530b)) {
                Object obj = this.f533e.f550g.get(this.f530b);
                this.f533e.f550g.remove(this.f530b);
                this.f531c.mo771b(obj);
            }
            ActivityResult activityResult = (ActivityResult) this.f533e.f551h.getParcelable(this.f530b);
            if (activityResult != null) {
                this.f533e.f551h.remove(this.f530b);
                this.f531c.mo771b(this.f532d.mo3997c(activityResult.f528b, activityResult.f529c));
            }
        } else if (Lifecycle.Event.ON_STOP.equals(event)) {
            this.f533e.f549f.remove(this.f530b);
        } else if (Lifecycle.Event.ON_DESTROY.equals(event)) {
            this.f533e.mo778f(this.f530b);
        }
    }
}
