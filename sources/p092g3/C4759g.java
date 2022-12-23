package p092g3;

import android.text.TextUtils;
import androidx.work.ExistingWorkPolicy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p081f3.C4656h;
import p081f3.C4660j;
import p081f3.C4669n;
import p081f3.C4670o;
import p205p3.C6040e;
import p218q3.C6166b;

/* renamed from: g3.g */
public final class C4759g extends C4669n {

    /* renamed from: a */
    public final C4763k f16056a;

    /* renamed from: b */
    public final String f16057b;

    /* renamed from: c */
    public final ExistingWorkPolicy f16058c;

    /* renamed from: d */
    public final List<? extends C4670o> f16059d;

    /* renamed from: e */
    public final ArrayList f16060e;

    /* renamed from: f */
    public final ArrayList f16061f;

    /* renamed from: g */
    public final List<C4759g> f16062g;

    /* renamed from: h */
    public boolean f16063h;

    /* renamed from: i */
    public C4754c f16064i;

    static {
        C4656h.m11961e("WorkContinuationImpl");
    }

    public C4759g() {
        throw null;
    }

    public C4759g(C4763k kVar, String str, ExistingWorkPolicy existingWorkPolicy, List<? extends C4670o> list) {
        this(kVar, str, existingWorkPolicy, list, 0);
    }

    /* renamed from: f */
    public static boolean m12073f(C4759g gVar, HashSet hashSet) {
        hashSet.addAll(gVar.f16060e);
        HashSet g = m12074g(gVar);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (g.contains((String) it.next())) {
                return true;
            }
        }
        List<C4759g> list = gVar.f16062g;
        if (list != null && !list.isEmpty()) {
            for (C4759g f : list) {
                if (m12073f(f, hashSet)) {
                    return true;
                }
            }
        }
        hashSet.removeAll(gVar.f16060e);
        return false;
    }

    /* renamed from: g */
    public static HashSet m12074g(C4759g gVar) {
        HashSet hashSet = new HashSet();
        List<C4759g> list = gVar.f16062g;
        if (list != null && !list.isEmpty()) {
            for (C4759g gVar2 : list) {
                hashSet.addAll(gVar2.f16060e);
            }
        }
        return hashSet;
    }

    /* renamed from: e */
    public final C4660j mo20273e() {
        if (!this.f16063h) {
            C6040e eVar = new C6040e(this);
            ((C6166b) this.f16056a.f16073d).mo22153a(eVar);
            this.f16064i = eVar.f19265c;
        } else {
            C4656h c = C4656h.m11960c();
            String.format("Already enqueued work ids (%s)", new Object[]{TextUtils.join(", ", this.f16060e)});
            c.mo20179f(new Throwable[0]);
        }
        return this.f16064i;
    }

    public C4759g(C4763k kVar, String str, ExistingWorkPolicy existingWorkPolicy, List list, int i) {
        this.f16056a = kVar;
        this.f16057b = str;
        this.f16058c = existingWorkPolicy;
        this.f16059d = list;
        this.f16062g = null;
        this.f16060e = new ArrayList(list.size());
        this.f16061f = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String uuid = ((C4670o) list.get(i2)).f15904a.toString();
            this.f16060e.add(uuid);
            this.f16061f.add(uuid);
        }
    }
}
