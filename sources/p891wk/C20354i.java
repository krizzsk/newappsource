package p891wk;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p752qn.C19148f;
import p752qn.C19149g;

/* renamed from: wk.i */
public final class C20354i {

    /* renamed from: a */
    public final String f51544a;

    /* renamed from: b */
    public final List<C20357l> f51545b;

    /* renamed from: c */
    public final C19148f f51546c;

    /* renamed from: d */
    public final List<C19149g> f51547d;

    /* renamed from: e */
    public final C19148f f51548e;

    /* renamed from: f */
    public final String f51549f;

    /* renamed from: g */
    public final String f51550g;

    /* renamed from: h */
    public final Integer f51551h;

    /* renamed from: i */
    public final String f51552i;

    /* renamed from: j */
    public final String f51553j;

    public C20354i(String str, ArrayList arrayList, C19148f fVar, ArrayList arrayList2, C19148f fVar2, String str2, String str3, Integer num, String str4, String str5) {
        this.f51544a = str;
        this.f51545b = arrayList;
        this.f51546c = fVar;
        this.f51547d = arrayList2;
        this.f51548e = fVar2;
        this.f51549f = str2;
        this.f51550g = str3;
        this.f51551h = num;
        this.f51552i = str4;
        this.f51553j = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20354i.class != obj.getClass()) {
            return false;
        }
        C20354i iVar = (C20354i) obj;
        if (!this.f51544a.equals(iVar.f51544a) || !this.f51545b.equals(iVar.f51545b) || !this.f51546c.equals(iVar.f51546c) || !Objects.equals(this.f51547d, iVar.f51547d) || !this.f51548e.equals(iVar.f51548e) || !Objects.equals(this.f51549f, iVar.f51549f) || !this.f51550g.equals(iVar.f51550g) || !this.f51551h.equals(iVar.f51551h) || !Objects.equals(this.f51552i, iVar.f51552i) || !Objects.equals(this.f51553j, iVar.f51553j)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f51544a, this.f51545b, this.f51546c, this.f51547d, this.f51548e, this.f51549f, this.f51550g, this.f51551h, this.f51552i, this.f51553j});
    }
}
