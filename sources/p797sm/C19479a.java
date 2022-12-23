package p797sm;

import java.util.Comparator;
import p891wk.C20362q;

/* renamed from: sm.a */
public final class C19479a implements C19492m {

    /* renamed from: b */
    public final Comparator<Long> f49541b;

    public C19479a(Comparator<Long> comparator) {
        this.f49541b = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        return this.f49541b.compare(((C20362q) obj).f51608n.f51509d, ((C20362q) obj2).f51608n.f51509d);
    }
}
