package p305x0;

import androidx.constraintlayout.core.C0680c;
import androidx.constraintlayout.core.widgets.C0695b;
import androidx.constraintlayout.core.widgets.C0697d;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p001a0.C0016g;
import p358af.C13437d;

/* renamed from: x0.j */
public final class C7139j {

    /* renamed from: f */
    public static int f22173f;

    /* renamed from: a */
    public ArrayList<ConstraintWidget> f22174a = new ArrayList<>();

    /* renamed from: b */
    public int f22175b;

    /* renamed from: c */
    public int f22176c;

    /* renamed from: d */
    public ArrayList<C7140a> f22177d = null;

    /* renamed from: e */
    public int f22178e = -1;

    /* renamed from: x0.j$a */
    public class C7140a {
        public C7140a(ConstraintWidget constraintWidget, C0680c cVar) {
            new WeakReference(constraintWidget);
            ConstraintAnchor constraintAnchor = constraintWidget.f2394K;
            cVar.getClass();
            C0680c.m1925n(constraintAnchor);
            C0680c.m1925n(constraintWidget.f2395L);
            C0680c.m1925n(constraintWidget.f2396M);
            C0680c.m1925n(constraintWidget.f2397N);
            C0680c.m1925n(constraintWidget.f2398O);
        }
    }

    public C7139j(int i) {
        int i2 = f22173f;
        f22173f = i2 + 1;
        this.f22175b = i2;
        this.f22176c = i;
    }

    /* renamed from: a */
    public final boolean mo23393a(ConstraintWidget constraintWidget) {
        if (this.f22174a.contains(constraintWidget)) {
            return false;
        }
        this.f22174a.add(constraintWidget);
        return true;
    }

    /* renamed from: b */
    public final void mo23394b(ArrayList<C7139j> arrayList) {
        int size = this.f22174a.size();
        if (this.f22178e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C7139j jVar = arrayList.get(i);
                if (this.f22178e == jVar.f22175b) {
                    mo23396d(this.f22176c, jVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* renamed from: c */
    public final int mo23395c(C0680c cVar, int i) {
        int i2;
        int i3;
        if (this.f22174a.size() == 0) {
            return 0;
        }
        ArrayList<ConstraintWidget> arrayList = this.f22174a;
        C0697d dVar = (C0697d) arrayList.get(0).f2406W;
        cVar.mo2755t();
        dVar.mo2792e(cVar, false);
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            arrayList.get(i4).mo2792e(cVar, false);
        }
        if (i == 0 && dVar.f2515F0 > 0) {
            C0695b.m2049a(dVar, cVar, arrayList, 0);
        }
        if (i == 1 && dVar.f2516G0 > 0) {
            C0695b.m2049a(dVar, cVar, arrayList, 1);
        }
        try {
            cVar.mo2751p();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f22177d = new ArrayList<>();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            this.f22177d.add(new C7140a(arrayList.get(i5), cVar));
        }
        if (i == 0) {
            i2 = C0680c.m1925n(dVar.f2394K);
            i3 = C0680c.m1925n(dVar.f2396M);
            cVar.mo2755t();
        } else {
            i2 = C0680c.m1925n(dVar.f2395L);
            i3 = C0680c.m1925n(dVar.f2397N);
            cVar.mo2755t();
        }
        return i3 - i2;
    }

    /* renamed from: d */
    public final void mo23396d(int i, C7139j jVar) {
        Iterator<ConstraintWidget> it = this.f22174a.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            jVar.mo23393a(next);
            if (i == 0) {
                next.f2451u0 = jVar.f22175b;
            } else {
                next.f2453v0 = jVar.f22175b;
            }
        }
        this.f22178e = jVar.f22175b;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = this.f22176c;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else if (i == 2) {
            str = "Both";
        } else {
            str = "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        String l = C13437d.m33707l(sb, this.f22175b, "] <");
        Iterator<ConstraintWidget> it = this.f22174a.iterator();
        while (it.hasNext()) {
            StringBuilder t = C0016g.m36t(l, " ");
            t.append(it.next().f2433l0);
            l = t.toString();
        }
        return C25541a.m63881k(l, " >");
    }
}
