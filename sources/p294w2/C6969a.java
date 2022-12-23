package p294w2;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import androidx.startup.StartupException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p319y2.C7286a;

/* renamed from: w2.a */
public final class C6969a {

    /* renamed from: d */
    public static volatile C6969a f21732d;

    /* renamed from: e */
    public static final Object f21733e = new Object();

    /* renamed from: a */
    public final HashMap f21734a = new HashMap();

    /* renamed from: b */
    public final HashSet f21735b = new HashSet();

    /* renamed from: c */
    public final Context f21736c;

    public C6969a(Context context) {
        this.f21736c = context.getApplicationContext();
    }

    /* renamed from: c */
    public static C6969a m16442c(Context context) {
        if (f21732d == null) {
            synchronized (f21733e) {
                if (f21732d == null) {
                    f21732d = new C6969a(context);
                }
            }
        }
        return f21732d;
    }

    /* renamed from: a */
    public final void mo23217a(Bundle bundle) {
        String string = this.f21736c.getString(C6971c.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String next : bundle.keySet()) {
                    if (string.equals(bundle.getString(next, (String) null))) {
                        Class<?> cls = Class.forName(next);
                        if (C6970b.class.isAssignableFrom(cls)) {
                            this.f21735b.add(cls);
                        }
                    }
                }
                Iterator it = this.f21735b.iterator();
                while (it.hasNext()) {
                    mo23218b((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e) {
                throw new StartupException(e);
            }
        }
    }

    /* renamed from: b */
    public final Object mo23218b(Class cls, HashSet hashSet) {
        Object obj;
        if (C7286a.m16884a()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (!hashSet.contains(cls)) {
            if (!this.f21734a.containsKey(cls)) {
                hashSet.add(cls);
                C6970b bVar = (C6970b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends C6970b<?>>> dependencies = bVar.dependencies();
                if (!dependencies.isEmpty()) {
                    for (Class next : dependencies) {
                        if (!this.f21734a.containsKey(next)) {
                            mo23218b(next, hashSet);
                        }
                    }
                }
                obj = bVar.create(this.f21736c);
                hashSet.remove(cls);
                this.f21734a.put(cls, obj);
            } else {
                obj = this.f21734a.get(cls);
            }
            Trace.endSection();
            return obj;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", new Object[]{cls.getName()}));
    }
}
