package p099ga;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p100gb.C4967d0;

/* renamed from: ga.w0 */
public final class C4947w0 extends C4855a {

    /* renamed from: f */
    public final int f16725f;

    /* renamed from: g */
    public final int f16726g;

    /* renamed from: h */
    public final int[] f16727h;

    /* renamed from: i */
    public final int[] f16728i;

    /* renamed from: j */
    public final C4879e1[] f16729j;

    /* renamed from: k */
    public final Object[] f16730k;

    /* renamed from: l */
    public final HashMap<Object, Integer> f16731l = new HashMap<>();

    public C4947w0(List list, C4967d0 d0Var) {
        super(d0Var);
        int size = list.size();
        this.f16727h = new int[size];
        this.f16728i = new int[size];
        this.f16729j = new C4879e1[size];
        this.f16730k = new Object[size];
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            C4920o0 o0Var = (C4920o0) it.next();
            this.f16729j[i3] = o0Var.mo20446b();
            this.f16728i[i3] = i;
            this.f16727h[i3] = i2;
            i += this.f16729j[i3].mo20463o();
            i2 += this.f16729j[i3].mo20458h();
            this.f16730k[i3] = o0Var.mo20445a();
            this.f16731l.put(this.f16730k[i3], Integer.valueOf(i3));
            i3++;
        }
        this.f16725f = i;
        this.f16726g = i2;
    }

    /* renamed from: h */
    public final int mo20458h() {
        return this.f16726g;
    }

    /* renamed from: o */
    public final int mo20463o() {
        return this.f16725f;
    }
}
