package androidx.lifecycle;

import android.app.Application;
import com.appsflyer.internal.referrer.Payload;
import java.lang.reflect.InvocationTargetException;
import mf0.C24362h;
import p091g2.C4746a;
import p091g2.C4749c;

/* renamed from: androidx.lifecycle.n0 */
public final class C1026n0 {

    /* renamed from: a */
    public final C1034p0 f3962a;

    /* renamed from: b */
    public final C1028b f3963b;

    /* renamed from: c */
    public final C4746a f3964c;

    /* renamed from: androidx.lifecycle.n0$a */
    public static class C1027a extends C1029c {

        /* renamed from: c */
        public static C1027a f3965c;

        /* renamed from: b */
        public final Application f3966b;

        public C1027a(Application application) {
            this.f3966b = application;
        }

        /* renamed from: a */
        public final <T extends C1019k0> T mo4064a(Class<T> cls) {
            Application application = this.f3966b;
            if (application != null) {
                return mo4315c(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        /* renamed from: b */
        public final C1019k0 mo4065b(Class cls, C4749c cVar) {
            if (this.f3966b != null) {
                return mo4064a(cls);
            }
            Application application = (Application) cVar.f16032a.get(C1024m0.f3961a);
            if (application != null) {
                return mo4315c(cls, application);
            }
            if (!C0989a.class.isAssignableFrom(cls)) {
                return super.mo4064a(cls);
            }
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }

        /* renamed from: c */
        public final <T extends C1019k0> T mo4315c(Class<T> cls, Application application) {
            if (!C0989a.class.isAssignableFrom(cls)) {
                return super.mo4064a(cls);
            }
            try {
                T t = (C1019k0) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{application});
                C24362h.m61210e(t, "{\n                try {\n…          }\n            }");
                return t;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(C25541a.m63880j("Cannot create an instance of ", cls), e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(C25541a.m63880j("Cannot create an instance of ", cls), e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException(C25541a.m63880j("Cannot create an instance of ", cls), e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException(C25541a.m63880j("Cannot create an instance of ", cls), e4);
            }
        }
    }

    /* renamed from: androidx.lifecycle.n0$b */
    public interface C1028b {
        /* renamed from: a */
        <T extends C1019k0> T mo4064a(Class<T> cls);

        /* renamed from: b */
        C1019k0 mo4065b(Class cls, C4749c cVar);
    }

    /* renamed from: androidx.lifecycle.n0$c */
    public static class C1029c implements C1028b {

        /* renamed from: a */
        public static C1029c f3967a;

        /* renamed from: a */
        public <T extends C1019k0> T mo4064a(Class<T> cls) {
            try {
                T newInstance = cls.newInstance();
                C24362h.m61210e(newInstance, "{\n                modelC…wInstance()\n            }");
                return (C1019k0) newInstance;
            } catch (InstantiationException e) {
                throw new RuntimeException(C25541a.m63880j("Cannot create an instance of ", cls), e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(C25541a.m63880j("Cannot create an instance of ", cls), e2);
            }
        }

        /* renamed from: b */
        public C1019k0 mo4065b(Class cls, C4749c cVar) {
            return mo4064a(cls);
        }
    }

    /* renamed from: androidx.lifecycle.n0$d */
    public static class C1030d {
        /* renamed from: c */
        public void mo4300c(C1019k0 k0Var) {
        }
    }

    public C1026n0(C1034p0 p0Var, C1028b bVar, C4746a aVar) {
        C24362h.m61211f(p0Var, Payload.TYPE_STORE);
        C24362h.m61211f(bVar, "factory");
        C24362h.m61211f(aVar, "defaultCreationExtras");
        this.f3962a = p0Var;
        this.f3963b = bVar;
        this.f3964c = aVar;
    }

    /* renamed from: a */
    public final <T extends C1019k0> T mo4313a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return mo4314b(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: b */
    public final C1019k0 mo4314b(Class cls, String str) {
        C1019k0 k0Var;
        C1030d dVar;
        C24362h.m61211f(str, LinksConfiguration.KEY_KEY);
        C1019k0 k0Var2 = this.f3962a.f3969a.get(str);
        if (cls.isInstance(k0Var2)) {
            C1028b bVar = this.f3963b;
            if (bVar instanceof C1030d) {
                dVar = (C1030d) bVar;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                C24362h.m61210e(k0Var2, "viewModel");
                dVar.mo4300c(k0Var2);
            }
            if (k0Var2 != null) {
                return k0Var2;
            }
            throw new NullPointerException("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        }
        C4749c cVar = new C4749c(this.f3964c);
        cVar.f16032a.put(C1032o0.f3968a, str);
        try {
            k0Var = this.f3963b.mo4065b(cls, cVar);
        } catch (AbstractMethodError unused) {
            k0Var = this.f3963b.mo4064a(cls);
        }
        C1019k0 put = this.f3962a.f3969a.put(str, k0Var);
        if (put != null) {
            put.onCleared();
        }
        return k0Var;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C1026n0(C1034p0 p0Var, C1028b bVar) {
        this(p0Var, bVar, C4746a.C4747a.f16033b);
        C24362h.m61211f(p0Var, Payload.TYPE_STORE);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1026n0(androidx.lifecycle.C1037q0 r5) {
        /*
            r4 = this;
            java.lang.String r0 = "owner"
            mf0.C24362h.m61211f(r5, r0)
            androidx.lifecycle.p0 r0 = r5.getViewModelStore()
            java.lang.String r1 = "owner.viewModelStore"
            mf0.C24362h.m61210e(r0, r1)
            boolean r1 = r5 instanceof androidx.lifecycle.C1010h
            if (r1 == 0) goto L_0x001f
            r2 = r5
            androidx.lifecycle.h r2 = (androidx.lifecycle.C1010h) r2
            androidx.lifecycle.n0$b r2 = r2.getDefaultViewModelProviderFactory()
            java.lang.String r3 = "owner.defaultViewModelProviderFactory"
            mf0.C24362h.m61210e(r2, r3)
            goto L_0x002f
        L_0x001f:
            androidx.lifecycle.n0$c r2 = androidx.lifecycle.C1026n0.C1029c.f3967a
            if (r2 != 0) goto L_0x002a
            androidx.lifecycle.n0$c r2 = new androidx.lifecycle.n0$c
            r2.<init>()
            androidx.lifecycle.C1026n0.C1029c.f3967a = r2
        L_0x002a:
            androidx.lifecycle.n0$c r2 = androidx.lifecycle.C1026n0.C1029c.f3967a
            mf0.C24362h.m61208c(r2)
        L_0x002f:
            if (r1 == 0) goto L_0x003e
            androidx.lifecycle.h r5 = (androidx.lifecycle.C1010h) r5
            g2.a r5 = r5.getDefaultViewModelCreationExtras()
            java.lang.String r1 = "{\n        owner.defaultV…ModelCreationExtras\n    }"
            mf0.C24362h.m61210e(r5, r1)
            goto L_0x0040
        L_0x003e:
            g2.a$a r5 = p091g2.C4746a.C4747a.f16033b
        L_0x0040:
            r4.<init>(r0, r2, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C1026n0.<init>(androidx.lifecycle.q0):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1026n0(androidx.lifecycle.C1037q0 r3, androidx.lifecycle.C1026n0.C1028b r4) {
        /*
            r2 = this;
            java.lang.String r0 = "owner"
            mf0.C24362h.m61211f(r3, r0)
            androidx.lifecycle.p0 r0 = r3.getViewModelStore()
            java.lang.String r1 = "owner.viewModelStore"
            mf0.C24362h.m61210e(r0, r1)
            boolean r1 = r3 instanceof androidx.lifecycle.C1010h
            if (r1 == 0) goto L_0x001f
            androidx.lifecycle.h r3 = (androidx.lifecycle.C1010h) r3
            g2.a r3 = r3.getDefaultViewModelCreationExtras()
            java.lang.String r1 = "{\n        owner.defaultV…ModelCreationExtras\n    }"
            mf0.C24362h.m61210e(r3, r1)
            goto L_0x0021
        L_0x001f:
            g2.a$a r3 = p091g2.C4746a.C4747a.f16033b
        L_0x0021:
            r2.<init>(r0, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C1026n0.<init>(androidx.lifecycle.q0, androidx.lifecycle.n0$b):void");
    }
}
