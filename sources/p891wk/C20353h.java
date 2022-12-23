package p891wk;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p752qn.C19148f;
import p752qn.C19149g;

/* renamed from: wk.h */
public final class C20353h {

    /* renamed from: a */
    public final String f51535a;

    /* renamed from: b */
    public final C19148f f51536b;

    /* renamed from: c */
    public final C19148f f51537c;

    /* renamed from: d */
    public final Boolean f51538d;

    /* renamed from: e */
    public final String f51539e;

    /* renamed from: f */
    public final List<C20354i> f51540f;

    /* renamed from: g */
    public final List<C19149g> f51541g;

    /* renamed from: h */
    public final String f51542h;

    /* renamed from: i */
    public final String f51543i;

    public C20353h(String str, C19148f fVar, C19148f fVar2, Boolean bool, String str2, ArrayList arrayList, ArrayList arrayList2, String str3, String str4) {
        this.f51535a = str;
        this.f51536b = fVar;
        this.f51537c = fVar2;
        this.f51538d = bool;
        this.f51539e = str2;
        this.f51540f = arrayList;
        this.f51541g = arrayList2;
        this.f51542h = str3;
        this.f51543i = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20353h.class != obj.getClass()) {
            return false;
        }
        C20353h hVar = (C20353h) obj;
        if (!this.f51535a.equals(hVar.f51535a) || !this.f51536b.equals(hVar.f51536b) || !this.f51537c.equals(hVar.f51537c) || !Objects.equals(this.f51538d, hVar.f51538d) || !Objects.equals(this.f51539e, hVar.f51539e) || !Objects.equals(this.f51540f, hVar.f51540f) || !Objects.equals(this.f51541g, hVar.f51541g) || !Objects.equals(this.f51542h, hVar.f51542h) || !Objects.equals(this.f51543i, hVar.f51543i)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f51535a, this.f51536b, this.f51537c, this.f51538d, this.f51539e, this.f51540f, this.f51541g, this.f51542h, this.f51543i});
    }
}
