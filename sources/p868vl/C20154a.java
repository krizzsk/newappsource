package p868vl;

import java.util.List;

/* renamed from: vl.a */
public final class C20154a {

    /* renamed from: a */
    public final List<String> f51160a;

    /* renamed from: b */
    public final boolean f51161b;

    /* renamed from: c */
    public final boolean f51162c;

    public C20154a(List<String> list, boolean z, boolean z2) {
        this.f51160a = list;
        this.f51161b = z;
        this.f51162c = z2;
    }

    /* renamed from: a */
    public final boolean mo52404a() {
        return this.f51160a.contains("all") || this.f51160a.contains("universal-ticket");
    }
}
