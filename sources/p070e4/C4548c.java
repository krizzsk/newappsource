package p070e4;

import java.util.ArrayList;
import java.util.Iterator;
import p132j4.C5383a;
import p258t4.C6589c;
import p283v4.C6858c;
import p283v4.C6859d;
import p283v4.C6860e;
import p283v4.C6861f;

/* renamed from: e4.c */
public final class C4548c {

    /* renamed from: a */
    public final ArrayList f15668a = new ArrayList();

    /* renamed from: b */
    public final C5383a<C6859d> f15669b = new C5383a<>();

    /* renamed from: c */
    public final C6589c f15670c = new C6589c();

    /* renamed from: d */
    public int f15671d = 0;

    /* renamed from: e */
    public final ArrayList f15672e = new ArrayList();

    /* renamed from: f */
    public final C6589c f15673f = new C6589c();

    /* renamed from: a */
    public final void mo20056a(C6860e eVar) {
        synchronized (this.f15673f) {
            try {
                Iterator it = this.f15672e.iterator();
                while (it.hasNext()) {
                    ((C6861f) it.next()).mo23110c(eVar);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        int i = eVar.f21212a;
        if (i > this.f15671d) {
            this.f15671d = i;
        }
        synchronized (this.f15670c) {
            if (this.f15668a.size() < 150) {
                this.f15668a.add(eVar);
            } else {
                C5383a<C6859d> aVar = this.f15669b;
                E[] eArr = aVar.f17695a;
                int i2 = aVar.f17697c;
                eArr[i2] = eVar;
                int i3 = i2 + 1;
                aVar.f17697c = i3;
                int i4 = aVar.f17699e;
                if (i3 == i4) {
                    aVar.f17697c = 0;
                }
                int i5 = aVar.f17698d;
                if (i5 < i4) {
                    aVar.f17698d = i5 + 1;
                } else {
                    int i6 = aVar.f17696b + 1;
                    aVar.f17696b = i6;
                    if (i6 == i4) {
                        aVar.f17696b = 0;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean mo20057b(C6861f fVar) {
        boolean z;
        synchronized (this.f15673f) {
            if (fVar instanceof C6858c) {
                ArrayList arrayList = this.f15672e;
                Class<?> cls = fVar.getClass();
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C6861f) it.next()).getClass() == cls) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    return false;
                }
            }
            this.f15672e.add(fVar);
            return true;
        }
    }

    /* renamed from: c */
    public final ArrayList mo20058c() {
        ArrayList arrayList;
        E e;
        synchronized (this.f15670c) {
            arrayList = new ArrayList(this.f15668a);
            C5383a<C6859d> aVar = this.f15669b;
            aVar.getClass();
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            while (true) {
                int i2 = aVar.f17698d;
                if (i < i2) {
                    if (i >= 0) {
                        if (i < i2) {
                            e = aVar.f17695a[(aVar.f17696b + i) % aVar.f17699e];
                            arrayList2.add(e);
                            i++;
                        }
                    }
                    e = null;
                    arrayList2.add(e);
                    i++;
                } else {
                    arrayList.addAll(arrayList2);
                }
            }
        }
        return arrayList;
    }
}
