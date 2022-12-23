package androidx.transition;

import android.view.View;
import java.util.ArrayList;

/* renamed from: androidx.transition.e */
public final class C1326e extends C1327f {

    /* renamed from: a */
    public final /* synthetic */ Object f5002a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f5003b;

    /* renamed from: c */
    public final /* synthetic */ Object f5004c = null;

    /* renamed from: d */
    public final /* synthetic */ ArrayList f5005d = null;

    /* renamed from: e */
    public final /* synthetic */ Object f5006e;

    /* renamed from: f */
    public final /* synthetic */ ArrayList f5007f;

    /* renamed from: g */
    public final /* synthetic */ C1323d f5008g;

    public C1326e(C1323d dVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f5008g = dVar;
        this.f5002a = obj;
        this.f5003b = arrayList;
        this.f5006e = obj2;
        this.f5007f = arrayList2;
    }

    /* renamed from: d */
    public final void mo5377d(Transition transition) {
        transition.mo5427w(this);
    }

    /* renamed from: e */
    public final void mo5432e() {
        Object obj = this.f5002a;
        if (obj != null) {
            this.f5008g.mo5449t(obj, this.f5003b, (ArrayList<View>) null);
        }
        Object obj2 = this.f5004c;
        if (obj2 != null) {
            this.f5008g.mo5449t(obj2, this.f5005d, (ArrayList<View>) null);
        }
        Object obj3 = this.f5006e;
        if (obj3 != null) {
            this.f5008g.mo5449t(obj3, this.f5007f, (ArrayList<View>) null);
        }
    }
}
