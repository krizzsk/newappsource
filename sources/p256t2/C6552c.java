package p256t2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.C1013i;
import androidx.savedstate.Recreator;
import java.util.Iterator;
import java.util.Map;
import mf0.C24362h;
import p214q.C6120b;
import p358af.C13437d;

@SuppressLint({"RestrictedApi"})
/* renamed from: t2.c */
public final class C6552c {

    /* renamed from: a */
    public final C6120b<String, C6554b> f20357a = new C6120b<>();

    /* renamed from: b */
    public boolean f20358b;

    /* renamed from: c */
    public Bundle f20359c;

    /* renamed from: d */
    public boolean f20360d;

    /* renamed from: e */
    public Recreator.C1262a f20361e;

    /* renamed from: f */
    public boolean f20362f = true;

    /* renamed from: t2.c$a */
    public interface C6553a {
        /* renamed from: a */
        void mo4305a(C6556e eVar);
    }

    /* renamed from: t2.c$b */
    public interface C6554b {
        /* renamed from: a */
        Bundle mo747a();
    }

    /* renamed from: a */
    public final Bundle mo22663a(String str) {
        if (this.f20360d) {
            Bundle bundle = this.f20359c;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = this.f20359c;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.f20359c;
            boolean z = false;
            if (bundle4 != null && !bundle4.isEmpty()) {
                z = true;
            }
            if (!z) {
                this.f20359c = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    /* renamed from: b */
    public final C6554b mo22664b() {
        Map.Entry entry;
        C6554b bVar;
        Iterator<Map.Entry<String, C6554b>> it = this.f20357a.iterator();
        do {
            C6120b.C6125e eVar = (C6120b.C6125e) it;
            if (!eVar.hasNext()) {
                return null;
            }
            entry = (Map.Entry) eVar.next();
            C24362h.m61210e(entry, "components");
            bVar = (C6554b) entry.getValue();
        } while (!C24362h.m61206a((String) entry.getKey(), "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return bVar;
    }

    /* renamed from: c */
    public final void mo22665c(String str, C6554b bVar) {
        boolean z;
        C24362h.m61211f(str, LinksConfiguration.KEY_KEY);
        C24362h.m61211f(bVar, "provider");
        if (this.f20357a.mo22080b(str, bVar) == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    /* renamed from: d */
    public final void mo22666d() {
        Class<C1013i.C1014a> cls = C1013i.C1014a.class;
        if (this.f20362f) {
            Recreator.C1262a aVar = this.f20361e;
            if (aVar == null) {
                aVar = new Recreator.C1262a(this);
            }
            this.f20361e = aVar;
            try {
                cls.getDeclaredConstructor(new Class[0]);
                Recreator.C1262a aVar2 = this.f20361e;
                if (aVar2 != null) {
                    aVar2.f4751a.add(cls.getName());
                }
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException(C13437d.m33705j(cls, C13555b.m33972k("Class "), " must have default constructor in order to be automatically recreated"), e);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
    }
}
