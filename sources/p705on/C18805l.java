package p705on;

import ce0.C21100e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p364al.C13487h;
import p634ln.C18247a;
import p657mn.C18406b;
import p702ok.C18777c;
import p752qn.C19148f;
import p772rl.C19287b;
import p843uk.C19918a0;

/* renamed from: on.l */
public final class C18805l {

    /* renamed from: a */
    public final boolean f47898a;

    /* renamed from: b */
    public final String f47899b;

    /* renamed from: c */
    public final C18406b f47900c;

    /* renamed from: d */
    public final Integer f47901d;

    /* renamed from: e */
    public final Integer f47902e;

    /* renamed from: f */
    public final String f47903f;

    /* renamed from: g */
    public final C19148f f47904g;

    /* renamed from: h */
    public final C18406b f47905h;

    /* renamed from: i */
    public final String f47906i;

    /* renamed from: j */
    public final String f47907j;

    /* renamed from: k */
    public final List<C18247a> f47908k;

    /* renamed from: l */
    public final String f47909l;

    /* renamed from: m */
    public final String f47910m;

    /* renamed from: n */
    public final List<String> f47911n;

    /* renamed from: o */
    public final List<Integer> f47912o;

    /* renamed from: p */
    public final boolean f47913p;

    /* renamed from: on.l$a */
    public static class C18806a {

        /* renamed from: a */
        public C19287b f47914a;

        public C18806a(C19287b bVar) {
            this.f47914a = bVar;
        }

        /* renamed from: a */
        public final ArrayList mo51295a(Collection collection) {
            ArrayList arrayList = new ArrayList(collection.size());
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(mo51296b((C19918a0) it.next()));
            }
            return arrayList;
        }

        /* renamed from: b */
        public final C18805l mo51296b(C19918a0 a0Var) {
            boolean z;
            S s;
            C19918a0 a0Var2 = a0Var;
            Integer num = a0Var2.f50584p;
            if (num == null || num.intValue() <= 0) {
                z = false;
            } else {
                z = true;
            }
            boolean booleanValue = a0Var2.f50569a.booleanValue();
            String str = a0Var2.f50572d;
            C18406b bVar = a0Var2.f50573e;
            Integer num2 = a0Var2.f50574f;
            Integer num3 = a0Var2.f50576h;
            String str2 = a0Var2.f50577i;
            C19148f fVar = a0Var2.f50578j;
            C18406b bVar2 = a0Var2.f50579k;
            String str3 = a0Var2.f50571c;
            String str4 = a0Var2.f50575g;
            List<Integer> list = a0Var2.f50570b;
            ArrayList arrayList = new ArrayList();
            if (list == null) {
                list = Collections.emptyList();
            }
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                Iterator<Integer> it2 = it;
                C13487h<C18777c> a = this.f47914a.mo51698a(it.next());
                if (!a.mo40399a() && (s = a.f33365a) != null) {
                    arrayList.add(((C18777c) s).mo51257a());
                }
                it = it2;
            }
            String str5 = a0Var2.f50582n;
            String str6 = a0Var2.f50586r;
            List<String> list2 = a0Var2.f50587s;
            List<Integer> list3 = a0Var2.f50588t;
            if (list3 == null) {
                list3 = Collections.emptyList();
            }
            return new C18805l(booleanValue, str, bVar, num2, num3, str2, fVar, bVar2, str3, str4, arrayList, str5, str6, list2, list3, z);
        }
    }

    public C18805l(boolean z, String str, C18406b bVar, Integer num, Integer num2, String str2, C19148f fVar, C18406b bVar2, String str3, String str4, ArrayList arrayList, String str5, String str6, List list, List list2, boolean z2) {
        this.f47898a = z;
        this.f47899b = str;
        this.f47900c = bVar;
        this.f47901d = num;
        this.f47902e = num2;
        this.f47903f = str2;
        this.f47904g = fVar;
        this.f47905h = bVar2;
        this.f47906i = str3;
        this.f47907j = str4;
        this.f47908k = C21100e.m49306F(arrayList);
        this.f47909l = str5;
        this.f47910m = str6;
        this.f47911n = C21100e.m49306F(list);
        this.f47912o = C21100e.m49306F(list2);
        this.f47913p = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18805l.class != obj.getClass()) {
            return false;
        }
        C18805l lVar = (C18805l) obj;
        if (this.f47898a != lVar.f47898a || this.f47913p != lVar.f47913p || !this.f47899b.equals(lVar.f47899b) || !Objects.equals(this.f47900c, lVar.f47900c) || !this.f47901d.equals(lVar.f47901d) || !this.f47902e.equals(lVar.f47902e) || !this.f47903f.equals(lVar.f47903f) || !this.f47904g.equals(lVar.f47904g) || !Objects.equals(this.f47905h, lVar.f47905h) || !this.f47906i.equals(lVar.f47906i) || !this.f47907j.equals(lVar.f47907j) || !this.f47908k.equals(lVar.f47908k) || !Objects.equals(this.f47909l, lVar.f47909l) || !Objects.equals(this.f47910m, lVar.f47910m) || !this.f47911n.equals(lVar.f47911n) || !this.f47912o.equals(lVar.f47912o)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(this.f47898a), this.f47899b, this.f47900c, this.f47901d, this.f47902e, this.f47903f, this.f47904g, this.f47905h, this.f47906i, this.f47907j, this.f47908k, this.f47909l, this.f47910m, this.f47911n, this.f47912o, Boolean.valueOf(this.f47913p)});
    }
}
