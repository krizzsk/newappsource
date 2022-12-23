package p474et;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import mf0.C24362h;

/* renamed from: et.h */
public final class C16876h {

    /* renamed from: a */
    public final int f43892a;

    /* renamed from: b */
    public final ArrayList f43893b;

    /* renamed from: c */
    public final List<C16872d> f43894c;

    /* renamed from: d */
    public final int f43895d;

    public C16876h(int i) {
        this.f43892a = i;
        ArrayList arrayList = new ArrayList();
        this.f43893b = arrayList;
        List<C16872d> unmodifiableList = Collections.unmodifiableList(arrayList);
        C24362h.m61210e(unmodifiableList, "unmodifiableList(mutableCards)");
        this.f43894c = unmodifiableList;
        this.f43895d = arrayList.size();
    }

    public C16876h() {
        this(Integer.MAX_VALUE);
    }
}
