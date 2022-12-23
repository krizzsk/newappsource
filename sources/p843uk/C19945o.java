package p843uk;

import ce0.C21100e;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import mf0.C24361g;
import p634ln.C18247a;
import p752qn.C19148f;

/* renamed from: uk.o */
public final class C19945o {

    /* renamed from: a */
    public final String f50666a;

    /* renamed from: b */
    public final Long f50667b;

    /* renamed from: c */
    public final Map<Integer, C19918a0> f50668c;

    /* renamed from: d */
    public final List<String> f50669d;

    /* renamed from: e */
    public final Map<Integer, Integer> f50670e;

    /* renamed from: f */
    public final C18247a f50671f;

    /* renamed from: g */
    public final C18247a f50672g;

    /* renamed from: h */
    public final int f50673h;

    public C19945o(String str, Long l, Map<Integer, C19918a0> map, List<String> list, Map<Integer, Integer> map2, int i, C18247a aVar, C18247a aVar2) {
        this.f50666a = str;
        this.f50667b = l;
        this.f50668c = C24361g.m61133C(map);
        this.f50669d = C21100e.m49306F(list);
        this.f50670e = C24361g.m61133C(map2);
        this.f50673h = i;
        this.f50671f = aVar;
        this.f50672g = aVar2;
    }

    /* renamed from: a */
    public final C19148f mo52238a() {
        Map<Integer, C19918a0> map = this.f50668c;
        Map<Integer, Integer> map2 = this.f50670e;
        String str = map.values().iterator().next().f50578j.f48694a;
        Integer num = 0;
        for (Map.Entry next : map2.entrySet()) {
            num = Integer.valueOf((((Integer) next.getValue()).intValue() * map.get((Integer) next.getKey()).f50578j.f48695b.intValue()) + num.intValue());
        }
        return new C19148f(str, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19945o.class != obj.getClass()) {
            return false;
        }
        C19945o oVar = (C19945o) obj;
        if (this.f50673h != oVar.f50673h || !Objects.equals(this.f50666a, oVar.f50666a) || !Objects.equals(this.f50667b, oVar.f50667b) || !Objects.equals(this.f50668c, oVar.f50668c) || !Objects.equals(this.f50669d, oVar.f50669d) || !Objects.equals(this.f50670e, oVar.f50670e) || !Objects.equals(this.f50671f, oVar.f50671f) || !Objects.equals(this.f50672g, oVar.f50672g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f50666a, this.f50667b, this.f50668c, this.f50669d, this.f50670e, Integer.valueOf(this.f50673h), this.f50671f, this.f50672g});
    }
}
