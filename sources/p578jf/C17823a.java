package p578jf;

import ci0.C21211f;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.perf.config.RemoteConfigManager;
import java.util.concurrent.Executors;
import p532hf.C17426a;
import p626lf.C18200a;
import p790sf.C19453a;
import p790sf.C19454b;

/* renamed from: jf.a */
public final class C17823a {

    /* renamed from: d */
    public static final C18200a f45788d = C18200a.m44901d();

    /* renamed from: e */
    public static volatile C17823a f45789e;

    /* renamed from: a */
    public final RemoteConfigManager f45790a = RemoteConfigManager.getInstance();

    /* renamed from: b */
    public C19453a f45791b = new C19453a();

    /* renamed from: c */
    public C17842t f45792c;

    public C17823a() {
        C17842t tVar;
        C18200a aVar = C17842t.f45811c;
        synchronized (C17842t.class) {
            if (C17842t.f45812d == null) {
                C17842t.f45812d = new C17842t(Executors.newSingleThreadExecutor());
            }
            tVar = C17842t.f45812d;
        }
        this.f45792c = tVar;
    }

    /* renamed from: e */
    public static synchronized C17823a m44161e() {
        C17823a aVar;
        synchronized (C17823a.class) {
            if (f45789e == null) {
                f45789e = new C17823a();
            }
            aVar = f45789e;
        }
        return aVar;
    }

    /* renamed from: m */
    public static boolean m44162m(long j) {
        return j >= 0;
    }

    /* renamed from: n */
    public static boolean m44163n(String str) {
        if (str.trim().isEmpty()) {
            return false;
        }
        for (String trim : str.split(";")) {
            String trim2 = trim.trim();
            Boolean bool = C17426a.f44884a;
            if (trim2.equals("20.1.1")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    public static boolean m44164o(long j) {
        return j >= 0;
    }

    /* renamed from: q */
    public static boolean m44165q(float f) {
        return BitmapDescriptorFactory.HUE_RED <= f && f <= 1.0f;
    }

    /* renamed from: a */
    public final C19454b<Boolean> mo50404a(C21211f fVar) {
        C17842t tVar = this.f45792c;
        String h = fVar.mo43443h();
        if (h == null) {
            tVar.getClass();
            C17842t.f45811c.mo50610a();
            return new C19454b<>();
        }
        if (tVar.f45813a == null) {
            tVar.mo50417b(C17842t.m44220a());
            if (tVar.f45813a == null) {
                return new C19454b<>();
            }
        }
        if (!tVar.f45813a.contains(h)) {
            return new C19454b<>();
        }
        try {
            return new C19454b<>(Boolean.valueOf(tVar.f45813a.getBoolean(h, false)));
        } catch (ClassCastException e) {
            C17842t.f45811c.mo50611b("Key %s from sharedPreferences has type other than long: %s", h, e.getMessage());
            return new C19454b<>();
        }
    }

    /* renamed from: b */
    public final C19454b<Float> mo50405b(C21211f fVar) {
        C17842t tVar = this.f45792c;
        String h = fVar.mo43443h();
        if (h == null) {
            tVar.getClass();
            C17842t.f45811c.mo50610a();
            return new C19454b<>();
        }
        if (tVar.f45813a == null) {
            tVar.mo50417b(C17842t.m44220a());
            if (tVar.f45813a == null) {
                return new C19454b<>();
            }
        }
        if (!tVar.f45813a.contains(h)) {
            return new C19454b<>();
        }
        try {
            return new C19454b<>(Float.valueOf(tVar.f45813a.getFloat(h, BitmapDescriptorFactory.HUE_RED)));
        } catch (ClassCastException e) {
            C17842t.f45811c.mo50611b("Key %s from sharedPreferences has type other than float: %s", h, e.getMessage());
            return new C19454b<>();
        }
    }

    /* renamed from: c */
    public final C19454b<Long> mo50406c(C21211f fVar) {
        C17842t tVar = this.f45792c;
        String h = fVar.mo43443h();
        if (h == null) {
            tVar.getClass();
            C17842t.f45811c.mo50610a();
            return new C19454b<>();
        }
        if (tVar.f45813a == null) {
            tVar.mo50417b(C17842t.m44220a());
            if (tVar.f45813a == null) {
                return new C19454b<>();
            }
        }
        if (!tVar.f45813a.contains(h)) {
            return new C19454b<>();
        }
        try {
            return new C19454b<>(Long.valueOf(tVar.f45813a.getLong(h, 0)));
        } catch (ClassCastException e) {
            C17842t.f45811c.mo50611b("Key %s from sharedPreferences has type other than long: %s", h, e.getMessage());
            return new C19454b<>();
        }
    }

    /* renamed from: d */
    public final C19454b<String> mo50407d(C21211f fVar) {
        C17842t tVar = this.f45792c;
        String h = fVar.mo43443h();
        if (h == null) {
            tVar.getClass();
            C17842t.f45811c.mo50610a();
            return new C19454b<>();
        }
        if (tVar.f45813a == null) {
            tVar.mo50417b(C17842t.m44220a());
            if (tVar.f45813a == null) {
                return new C19454b<>();
            }
        }
        if (!tVar.f45813a.contains(h)) {
            return new C19454b<>();
        }
        try {
            return new C19454b<>(tVar.f45813a.getString(h, ""));
        } catch (ClassCastException e) {
            C17842t.f45811c.mo50611b("Key %s from sharedPreferences has type other than String: %s", h, e.getMessage());
            return new C19454b<>();
        }
    }

    /* renamed from: f */
    public final Boolean mo50408f() {
        C17824b bVar;
        synchronized (C17824b.class) {
            if (C17824b.f45793b == null) {
                C17824b.f45793b = new C17824b();
            }
            bVar = C17824b.f45793b;
        }
        C19454b<Boolean> h = mo50410h(bVar);
        if (h.mo51862b()) {
            return h.mo51861a();
        }
        return Boolean.FALSE;
    }

    /* renamed from: g */
    public final Boolean mo50409g() {
        C17825c cVar;
        if (mo50408f().booleanValue()) {
            return Boolean.FALSE;
        }
        synchronized (C17825c.class) {
            if (C17825c.f45794b == null) {
                C17825c.f45794b = new C17825c();
            }
            cVar = C17825c.f45794b;
        }
        C19454b<Boolean> a = mo50404a(cVar);
        if (a.mo51862b()) {
            return a.mo51861a();
        }
        C19454b<Boolean> h = mo50410h(cVar);
        if (h.mo51862b()) {
            return h.mo51861a();
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020 A[SYNTHETIC, Splitter:B:9:0x0020] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p790sf.C19454b<java.lang.Boolean> mo50410h(ci0.C21211f r6) {
        /*
            r5 = this;
            sf.a r0 = r5.f45791b
            java.lang.String r6 = r6.mo50416l()
            r1 = 1
            r2 = 0
            if (r6 == 0) goto L_0x0014
            android.os.Bundle r3 = r0.f49471a
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L_0x0017
            r3 = 1
            goto L_0x0018
        L_0x0014:
            r0.getClass()
        L_0x0017:
            r3 = 0
        L_0x0018:
            if (r3 != 0) goto L_0x0020
            sf.b r6 = new sf.b
            r6.<init>()
            goto L_0x0050
        L_0x0020:
            android.os.Bundle r0 = r0.f49471a     // Catch:{ ClassCastException -> 0x0038 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ ClassCastException -> 0x0038 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ ClassCastException -> 0x0038 }
            if (r0 != 0) goto L_0x0031
            sf.b r0 = new sf.b     // Catch:{ ClassCastException -> 0x0038 }
            r0.<init>()     // Catch:{ ClassCastException -> 0x0038 }
            r6 = r0
            goto L_0x0050
        L_0x0031:
            sf.b r3 = new sf.b     // Catch:{ ClassCastException -> 0x0038 }
            r3.<init>(r0)     // Catch:{ ClassCastException -> 0x0038 }
            r6 = r3
            goto L_0x0050
        L_0x0038:
            r0 = move-exception
            lf.a r3 = p790sf.C19453a.f49470b
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r6
            java.lang.String r6 = r0.getMessage()
            r4[r1] = r6
            java.lang.String r6 = "Metadata key %s contains type other than boolean: %s"
            r3.mo50611b(r6, r4)
            sf.b r6 = new sf.b
            r6.<init>()
        L_0x0050:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p578jf.C17823a.mo50410h(ci0.f):sf.b");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020 A[SYNTHETIC, Splitter:B:9:0x0020] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p790sf.C19454b<java.lang.Float> mo50411i(ci0.C21211f r6) {
        /*
            r5 = this;
            sf.a r0 = r5.f45791b
            java.lang.String r6 = r6.mo50416l()
            r1 = 1
            r2 = 0
            if (r6 == 0) goto L_0x0014
            android.os.Bundle r3 = r0.f49471a
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L_0x0017
            r3 = 1
            goto L_0x0018
        L_0x0014:
            r0.getClass()
        L_0x0017:
            r3 = 0
        L_0x0018:
            if (r3 != 0) goto L_0x0020
            sf.b r6 = new sf.b
            r6.<init>()
            goto L_0x0050
        L_0x0020:
            android.os.Bundle r0 = r0.f49471a     // Catch:{ ClassCastException -> 0x0038 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ ClassCastException -> 0x0038 }
            java.lang.Float r0 = (java.lang.Float) r0     // Catch:{ ClassCastException -> 0x0038 }
            if (r0 != 0) goto L_0x0031
            sf.b r0 = new sf.b     // Catch:{ ClassCastException -> 0x0038 }
            r0.<init>()     // Catch:{ ClassCastException -> 0x0038 }
            r6 = r0
            goto L_0x0050
        L_0x0031:
            sf.b r3 = new sf.b     // Catch:{ ClassCastException -> 0x0038 }
            r3.<init>(r0)     // Catch:{ ClassCastException -> 0x0038 }
            r6 = r3
            goto L_0x0050
        L_0x0038:
            r0 = move-exception
            lf.a r3 = p790sf.C19453a.f49470b
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r6
            java.lang.String r6 = r0.getMessage()
            r4[r1] = r6
            java.lang.String r6 = "Metadata key %s contains type other than float: %s"
            r3.mo50611b(r6, r4)
            sf.b r6 = new sf.b
            r6.<init>()
        L_0x0050:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p578jf.C17823a.mo50411i(ci0.f):sf.b");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020 A[SYNTHETIC, Splitter:B:9:0x0020] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p790sf.C19454b<java.lang.Long> mo50412j(ci0.C21211f r6) {
        /*
            r5 = this;
            sf.a r0 = r5.f45791b
            java.lang.String r6 = r6.mo50416l()
            r1 = 1
            r2 = 0
            if (r6 == 0) goto L_0x0014
            android.os.Bundle r3 = r0.f49471a
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L_0x0017
            r3 = 1
            goto L_0x0018
        L_0x0014:
            r0.getClass()
        L_0x0017:
            r3 = 0
        L_0x0018:
            if (r3 != 0) goto L_0x0020
            sf.b r6 = new sf.b
            r6.<init>()
            goto L_0x0050
        L_0x0020:
            android.os.Bundle r0 = r0.f49471a     // Catch:{ ClassCastException -> 0x0038 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ ClassCastException -> 0x0038 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ ClassCastException -> 0x0038 }
            if (r0 != 0) goto L_0x0031
            sf.b r0 = new sf.b     // Catch:{ ClassCastException -> 0x0038 }
            r0.<init>()     // Catch:{ ClassCastException -> 0x0038 }
            r6 = r0
            goto L_0x0050
        L_0x0031:
            sf.b r3 = new sf.b     // Catch:{ ClassCastException -> 0x0038 }
            r3.<init>(r0)     // Catch:{ ClassCastException -> 0x0038 }
            r6 = r3
            goto L_0x0050
        L_0x0038:
            r0 = move-exception
            lf.a r3 = p790sf.C19453a.f49470b
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r6
            java.lang.String r6 = r0.getMessage()
            r4[r1] = r6
            java.lang.String r6 = "Metadata key %s contains type other than int: %s"
            r3.mo50611b(r6, r4)
            sf.b r6 = new sf.b
            r6.<init>()
        L_0x0050:
            boolean r0 = r6.mo51862b()
            if (r0 == 0) goto L_0x006b
            java.lang.Object r6 = r6.mo51861a()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            long r0 = (long) r6
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            sf.b r0 = new sf.b
            r0.<init>(r6)
            goto L_0x0070
        L_0x006b:
            sf.b r0 = new sf.b
            r0.<init>()
        L_0x0070:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p578jf.C17823a.mo50412j(ci0.f):sf.b");
    }

    /* renamed from: k */
    public final long mo50413k() {
        C17830h hVar;
        boolean z;
        synchronized (C17830h.class) {
            if (C17830h.f45799b == null) {
                C17830h.f45799b = new C17830h();
            }
            hVar = C17830h.f45799b;
        }
        C19454b<Long> l = mo50414l(hVar);
        boolean z2 = true;
        if (l.mo51862b()) {
            if (l.mo51861a().longValue() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f45792c.mo50419d(l.mo51861a().longValue(), "com.google.firebase.perf.TimeLimitSec");
                return l.mo51861a().longValue();
            }
        }
        C19454b<Long> c = mo50406c(hVar);
        if (c.mo51862b()) {
            if (c.mo51861a().longValue() <= 0) {
                z2 = false;
            }
            if (z2) {
                return c.mo51861a().longValue();
            }
        }
        Long l2 = 600L;
        return l2.longValue();
    }

    /* renamed from: l */
    public final C19454b<Long> mo50414l(C21211f fVar) {
        return this.f45790a.getLong(fVar.mo43444p());
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cd A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo50415p() {
        /*
            r6 = this;
            java.lang.Boolean r0 = r6.mo50409g()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.booleanValue()
            if (r0 != r2) goto L_0x00ce
        L_0x000e:
            java.lang.Class<jf.j> r0 = p578jf.C17832j.class
            monitor-enter(r0)
            jf.j r3 = p578jf.C17832j.f45801b     // Catch:{ all -> 0x00cf }
            if (r3 != 0) goto L_0x001c
            jf.j r3 = new jf.j     // Catch:{ all -> 0x00cf }
            r3.<init>()     // Catch:{ all -> 0x00cf }
            p578jf.C17832j.f45801b = r3     // Catch:{ all -> 0x00cf }
        L_0x001c:
            jf.j r3 = p578jf.C17832j.f45801b     // Catch:{ all -> 0x00cf }
            monitor-exit(r0)
            com.google.firebase.perf.config.RemoteConfigManager r0 = r6.f45790a
            r3.getClass()
            java.lang.String r4 = "fpr_enabled"
            sf.b r0 = r0.getBoolean(r4)
            boolean r4 = r0.mo51862b()
            if (r4 == 0) goto L_0x0056
            com.google.firebase.perf.config.RemoteConfigManager r3 = r6.f45790a
            boolean r3 = r3.isLastFetchFailed()
            if (r3 == 0) goto L_0x003a
            r0 = 0
            goto L_0x006c
        L_0x003a:
            jf.t r3 = r6.f45792c
            java.lang.String r4 = "com.google.firebase.perf.SdkEnabled"
            java.lang.Object r5 = r0.mo51861a()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r3.mo50421f(r4, r5)
            java.lang.Object r0 = r0.mo51861a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x006c
        L_0x0056:
            sf.b r0 = r6.mo50404a(r3)
            boolean r3 = r0.mo51862b()
            if (r3 == 0) goto L_0x006b
            java.lang.Object r0 = r0.mo51861a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x006c
        L_0x006b:
            r0 = 1
        L_0x006c:
            if (r0 == 0) goto L_0x00ca
            java.lang.Class<jf.i> r0 = p578jf.C17831i.class
            monitor-enter(r0)
            jf.i r3 = p578jf.C17831i.f45800b     // Catch:{ all -> 0x00c7 }
            if (r3 != 0) goto L_0x007c
            jf.i r3 = new jf.i     // Catch:{ all -> 0x00c7 }
            r3.<init>()     // Catch:{ all -> 0x00c7 }
            p578jf.C17831i.f45800b = r3     // Catch:{ all -> 0x00c7 }
        L_0x007c:
            jf.i r3 = p578jf.C17831i.f45800b     // Catch:{ all -> 0x00c7 }
            monitor-exit(r0)
            com.google.firebase.perf.config.RemoteConfigManager r0 = r6.f45790a
            r3.getClass()
            java.lang.String r4 = "fpr_disabled_android_versions"
            sf.b r0 = r0.getString(r4)
            boolean r4 = r0.mo51862b()
            if (r4 == 0) goto L_0x00a8
            jf.t r3 = r6.f45792c
            java.lang.String r4 = "com.google.firebase.perf.SdkDisabledVersions"
            java.lang.Object r5 = r0.mo51861a()
            java.lang.String r5 = (java.lang.String) r5
            r3.mo50420e(r4, r5)
            java.lang.Object r0 = r0.mo51861a()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = m44163n(r0)
            goto L_0x00c3
        L_0x00a8:
            sf.b r0 = r6.mo50407d(r3)
            boolean r3 = r0.mo51862b()
            if (r3 == 0) goto L_0x00bd
            java.lang.Object r0 = r0.mo51861a()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = m44163n(r0)
            goto L_0x00c3
        L_0x00bd:
            java.lang.String r0 = ""
            boolean r0 = m44163n(r0)
        L_0x00c3:
            if (r0 != 0) goto L_0x00ca
            r0 = 1
            goto L_0x00cb
        L_0x00c7:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00ca:
            r0 = 0
        L_0x00cb:
            if (r0 == 0) goto L_0x00ce
            r1 = 1
        L_0x00ce:
            return r1
        L_0x00cf:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p578jf.C17823a.mo50415p():boolean");
    }
}
