package p072e6;

import java.util.ArrayList;
import java.util.HashMap;
import p072e6.C4578l;

/* renamed from: e6.g */
public final class C4569g<K extends C4578l, V> {

    /* renamed from: a */
    public final C4570a<K, V> f15730a = new C4570a<>();

    /* renamed from: b */
    public final HashMap f15731b = new HashMap();

    /* renamed from: e6.g$a */
    public static class C4570a<K, V> {

        /* renamed from: a */
        public final K f15732a;

        /* renamed from: b */
        public ArrayList f15733b;

        /* renamed from: c */
        public C4570a<K, V> f15734c;

        /* renamed from: d */
        public C4570a<K, V> f15735d;

        public C4570a() {
            this((Object) null);
        }

        public C4570a(K k) {
            this.f15735d = this;
            this.f15734c = this;
            this.f15732a = k;
        }
    }

    /* renamed from: a */
    public final V mo20088a(K k) {
        int i;
        C4570a<K, V> aVar = (C4570a) this.f15731b.get(k);
        if (aVar == null) {
            aVar = new C4570a<>(k);
            this.f15731b.put(k, aVar);
        } else {
            k.mo20097a();
        }
        C4570a<K, V> aVar2 = aVar.f15735d;
        aVar2.f15734c = aVar.f15734c;
        aVar.f15734c.f15735d = aVar2;
        C4570a<K, V> aVar3 = this.f15730a;
        aVar.f15735d = aVar3;
        C4570a<K, V> aVar4 = aVar3.f15734c;
        aVar.f15734c = aVar4;
        aVar4.f15735d = aVar;
        aVar.f15735d.f15734c = aVar;
        ArrayList arrayList = aVar.f15733b;
        if (arrayList != null) {
            i = arrayList.size();
        } else {
            i = 0;
        }
        if (i > 0) {
            return aVar.f15733b.remove(i - 1);
        }
        return null;
    }

    /* renamed from: b */
    public final void mo20089b(K k, V v) {
        C4570a<K, V> aVar = (C4570a) this.f15731b.get(k);
        if (aVar == null) {
            aVar = new C4570a<>(k);
            C4570a<K, V> aVar2 = aVar.f15735d;
            aVar2.f15734c = aVar.f15734c;
            aVar.f15734c.f15735d = aVar2;
            C4570a<K, V> aVar3 = this.f15730a;
            aVar.f15735d = aVar3.f15735d;
            aVar.f15734c = aVar3;
            aVar3.f15735d = aVar;
            aVar.f15735d.f15734c = aVar;
            this.f15731b.put(k, aVar);
        } else {
            k.mo20097a();
        }
        if (aVar.f15733b == null) {
            aVar.f15733b = new ArrayList();
        }
        aVar.f15733b.add(v);
    }

    /* renamed from: c */
    public final V mo20090c() {
        int i;
        C4570a<K, V> aVar = this.f15730a.f15735d;
        while (true) {
            V v = null;
            if (aVar.equals(this.f15730a)) {
                return null;
            }
            ArrayList arrayList = aVar.f15733b;
            if (arrayList != null) {
                i = arrayList.size();
            } else {
                i = 0;
            }
            if (i > 0) {
                v = aVar.f15733b.remove(i - 1);
            }
            if (v != null) {
                return v;
            }
            C4570a<K, V> aVar2 = aVar.f15735d;
            aVar2.f15734c = aVar.f15734c;
            aVar.f15734c.f15735d = aVar2;
            this.f15731b.remove(aVar.f15732a);
            ((C4578l) aVar.f15732a).mo20097a();
            aVar = aVar.f15735d;
        }
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (C4570a<K, V> aVar = this.f15730a.f15734c; !aVar.equals(this.f15730a); aVar = aVar.f15734c) {
            z = true;
            sb.append('{');
            sb.append(aVar.f15732a);
            sb.append(':');
            ArrayList arrayList = aVar.f15733b;
            if (arrayList != null) {
                i = arrayList.size();
            } else {
                i = 0;
            }
            sb.append(i);
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
