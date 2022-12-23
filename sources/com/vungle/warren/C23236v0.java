package com.vungle.warren;

import android.annotation.SuppressLint;
import android.content.Context;
import ce0.C21103h;
import ce0.C21119t;
import com.google.gson.Gson;
import com.vungle.warren.downloader.C23128i;
import com.vungle.warren.downloader.Downloader;
import com.vungle.warren.persistence.C23192a;
import de0.C23265c;
import java.util.Collection;
import java.util.HashMap;
import md0.C24338a;
import nd0.C24486e;
import sd0.C24849b;
import sd0.C24850c;
import td0.C24927a;
import td0.C24932c;
import td0.C24933d;
import ud0.C25022f;
import ud0.C25024h;
import ud0.C25025i;

/* renamed from: com.vungle.warren.v0 */
public final class C23236v0 {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: d */
    public static C23236v0 f58971d;

    /* renamed from: e */
    public static final C23237a f58972e = new C23237a();

    /* renamed from: f */
    public static final C23238b f58973f = new C23238b();

    /* renamed from: a */
    public final Context f58974a;

    /* renamed from: b */
    public HashMap f58975b = new HashMap();

    /* renamed from: c */
    public HashMap f58976c = new HashMap();

    /* renamed from: com.vungle.warren.v0$a */
    public class C23237a implements C23252x1 {
        /* renamed from: a */
        public final Collection<String> mo58353a() {
            return Vungle.getValidPlacements();
        }

        public final boolean isInitialized() {
            return Vungle.isInitialized();
        }
    }

    /* renamed from: com.vungle.warren.v0$b */
    public class C23238b implements C25025i.C25026a {
    }

    /* renamed from: com.vungle.warren.v0$c */
    public abstract class C23239c<T> {
        /* renamed from: a */
        public abstract T mo58092a();
    }

    public C23236v0(Context context) {
        this.f58974a = context.getApplicationContext();
        this.f58975b.put(C25022f.class, new C23111d1(this));
        this.f58975b.put(C25024h.class, new C23133e1(this));
        this.f58975b.put(C23097c.class, new C23136f1(this));
        this.f58975b.put(Downloader.class, new C23148g1(this));
        this.f58975b.put(VungleApiClient.class, new C23151h1(this));
        this.f58975b.put(C23192a.class, new C23160i1(this));
        this.f58975b.put(C24486e.class, new C23169j1(this));
        this.f58975b.put(C24932c.class, new C23172k1(this));
        this.f58975b.put(C24927a.class, new C23174l0(this));
        this.f58975b.put(C23265c.class, new C23177m0(this));
        this.f58975b.put(C21103h.class, new C23180n0());
        this.f58975b.put(C23171k0.class, new C23185o0());
        this.f58975b.put(C23252x1.class, new C23188p0());
        this.f58975b.put(C23157i0.class, new C23215q0(this));
        this.f58975b.put(C23128i.class, new C23218r0(this));
        this.f58975b.put(C23186o1.class, new C23221s0(this));
        this.f58975b.put(C21119t.class, new C23227t0());
        this.f58975b.put(C23130e0.class, new C23230u0());
        this.f58975b.put(C24849b.class, new C23247w0(this));
        this.f58975b.put(C24850c.C24851a.class, new C23251x0());
        this.f58975b.put(C23217r.class, new C23257y0(this));
        this.f58975b.put(C24933d.class, new C23259z0(this));
        this.f58975b.put(Gson.class, new C23093a1());
        this.f58975b.put(C24338a.class, new C23096b1());
        this.f58975b.put(C23187p.class, new C23108c1(this));
    }

    /* renamed from: a */
    public static synchronized C23236v0 m57280a(Context context) {
        C23236v0 v0Var;
        synchronized (C23236v0.class) {
            if (f58971d == null) {
                f58971d = new C23236v0(context);
            }
            v0Var = f58971d;
        }
        return v0Var;
    }

    /* renamed from: b */
    public final <T> T mo58349b(Class<T> cls) {
        Class d = mo58351d(cls);
        T t = this.f58976c.get(d);
        if (t != null) {
            return t;
        }
        C23239c cVar = (C23239c) this.f58975b.get(d);
        if (cVar != null) {
            T a = cVar.mo58092a();
            if (!(cVar instanceof C23215q0)) {
                this.f58976c.put(d, a);
            }
            return a;
        }
        throw new IllegalArgumentException("Unknown class");
    }

    /* renamed from: c */
    public final synchronized <T> T mo58350c(Class<T> cls) {
        return mo58349b(cls);
    }

    /* renamed from: d */
    public final Class mo58351d(Class cls) {
        for (Class cls2 : this.f58975b.keySet()) {
            if (cls2.isAssignableFrom(cls)) {
                return cls2;
            }
        }
        throw new IllegalArgumentException(C25541a.m63880j("Unknown dependency for ", cls));
    }

    /* renamed from: e */
    public final synchronized <T> boolean mo58352e(Class<T> cls) {
        return this.f58976c.containsKey(mo58351d(cls));
    }
}
