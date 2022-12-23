package s00;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import java.util.ArrayList;
import java.util.Iterator;
import p241s0.C6302b;

/* renamed from: s00.a */
public abstract class C19388a implements ComponentCallbacks {

    /* renamed from: b */
    public final ArrayList f49318b = new ArrayList();

    /* renamed from: c */
    public final C6302b f49319c = new C6302b();

    /* renamed from: a */
    public final <E extends C19389b> E mo51794a(Class<E> cls) {
        return (C19389b) cls.cast((C19389b) this.f49319c.getOrDefault(cls, null));
    }

    /* renamed from: b */
    public final <E extends C19389b> void mo51795b(E e) {
        this.f49318b.add(e);
        this.f49319c.put(e.getClass(), e);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        Iterator it = this.f49318b.iterator();
        while (it.hasNext()) {
            ((C19389b) it.next()).mo51798b(configuration);
        }
    }

    public final void onLowMemory() {
        Iterator it = this.f49318b.iterator();
        while (it.hasNext()) {
            ((C19389b) it.next()).mo51799c();
        }
    }
}
