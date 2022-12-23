package p743qd;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.heartbeatinfo.C14458a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p177n1.C5815m;
import p241s0.C6302b;
import p241s0.C6307g;
import p404ce.C13784b;
import p404ce.C13788e;
import p404ce.C13795j;
import p404ce.C13796k;
import p404ce.C13802o;
import p460ef.C16817a;
import p956ze.C20839b;
import p957zf.C20841b;

/* renamed from: qd.d */
public final class C19107d {

    /* renamed from: j */
    public static final Object f48565j = new Object();

    /* renamed from: k */
    public static final C19110c f48566k = new C19110c();

    /* renamed from: l */
    public static final C6302b f48567l = new C6302b();

    /* renamed from: a */
    public final Context f48568a;

    /* renamed from: b */
    public final String f48569b;

    /* renamed from: c */
    public final C19113f f48570c;

    /* renamed from: d */
    public final C13796k f48571d;

    /* renamed from: e */
    public final AtomicBoolean f48572e;

    /* renamed from: f */
    public final AtomicBoolean f48573f = new AtomicBoolean();

    /* renamed from: g */
    public final C13802o<C16817a> f48574g;

    /* renamed from: h */
    public final C20839b<C14458a> f48575h;

    /* renamed from: i */
    public final CopyOnWriteArrayList f48576i;

    @KeepForSdk
    /* renamed from: qd.d$a */
    public interface C19108a {
        @KeepForSdk
        void onBackgroundStateChanged(boolean z);
    }

    @TargetApi(14)
    /* renamed from: qd.d$b */
    public static class C19109b implements BackgroundDetector.BackgroundStateChangeListener {

        /* renamed from: a */
        public static AtomicReference<C19109b> f48577a = new AtomicReference<>();

        public final void onBackgroundStateChanged(boolean z) {
            synchronized (C19107d.f48565j) {
                Iterator it = new ArrayList(C19107d.f48567l.values()).iterator();
                while (it.hasNext()) {
                    C19107d dVar = (C19107d) it.next();
                    if (dVar.f48572e.get()) {
                        Iterator it2 = dVar.f48576i.iterator();
                        while (it2.hasNext()) {
                            ((C19108a) it2.next()).onBackgroundStateChanged(z);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: qd.d$c */
    public static class C19110c implements Executor {

        /* renamed from: b */
        public static final Handler f48578b = new Handler(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            f48578b.post(runnable);
        }
    }

    @TargetApi(24)
    /* renamed from: qd.d$d */
    public static class C19111d extends BroadcastReceiver {

        /* renamed from: b */
        public static AtomicReference<C19111d> f48579b = new AtomicReference<>();

        /* renamed from: a */
        public final Context f48580a;

        public C19111d(Context context) {
            this.f48580a = context;
        }

        public final void onReceive(Context context, Intent intent) {
            synchronized (C19107d.f48565j) {
                Iterator it = ((C6307g.C6312e) C19107d.f48567l.values()).iterator();
                while (it.hasNext()) {
                    ((C19107d) it.next()).mo51539g();
                }
            }
            this.f48580a.unregisterReceiver(this);
        }
    }

    public C19107d(Context context, C19113f fVar, String str) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f48572e = atomicBoolean;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f48576i = copyOnWriteArrayList;
        new CopyOnWriteArrayList();
        this.f48568a = (Context) Preconditions.checkNotNull(context);
        this.f48569b = Preconditions.checkNotEmpty(str);
        this.f48570c = (C19113f) Preconditions.checkNotNull(fVar);
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList a = new C13788e(context, new C13788e.C13789a(ComponentDiscoveryService.class)).mo40721a();
        Trace.endSection();
        Trace.beginSection("Runtime");
        C19110c cVar = f48566k;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(a);
        arrayList.add(new C13795j(new FirebaseCommonRegistrar()));
        arrayList2.add(C13784b.m34445b(context, Context.class, new Class[0]));
        arrayList2.add(C13784b.m34445b(this, C19107d.class, new Class[0]));
        arrayList2.add(C13784b.m34445b(fVar, C19113f.class, new Class[0]));
        C13796k kVar = new C13796k(cVar, arrayList, arrayList2, new C20841b());
        this.f48571d = kVar;
        Trace.endSection();
        this.f48574g = new C13802o<>(new C19105b(this, context));
        this.f48575h = kVar.mo40719h(C14458a.class);
        C19106c cVar2 = new C19106c(this);
        mo51535a();
        if (atomicBoolean.get() && BackgroundDetector.getInstance().isInBackground()) {
            cVar2.onBackgroundStateChanged(true);
        }
        copyOnWriteArrayList.add(cVar2);
        Trace.endSection();
    }

    /* renamed from: c */
    public static ArrayList m46264c() {
        ArrayList arrayList = new ArrayList();
        synchronized (f48565j) {
            Iterator it = ((C6307g.C6312e) f48567l.values()).iterator();
            while (it.hasNext()) {
                C19107d dVar = (C19107d) it.next();
                dVar.mo51535a();
                arrayList.add(dVar.f48569b);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: d */
    public static C19107d m46265d() {
        C19107d dVar;
        synchronized (f48565j) {
            dVar = (C19107d) f48567l.getOrDefault("[DEFAULT]", null);
            if (dVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return dVar;
    }

    /* renamed from: e */
    public static C19107d m46266e(String str) {
        C19107d dVar;
        String str2;
        synchronized (f48565j) {
            dVar = (C19107d) f48567l.getOrDefault(str.trim(), null);
            if (dVar != null) {
                dVar.f48575h.get().mo43362c();
            } else {
                ArrayList c = m46264c();
                if (c.isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "Available app names: " + TextUtils.join(", ", c);
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", new Object[]{str, str2}));
            }
        }
        return dVar;
    }

    /* renamed from: h */
    public static C19107d m46267h(Context context, C19113f fVar) {
        C19107d dVar;
        boolean z;
        AtomicReference<C19109b> atomicReference = C19109b.f48577a;
        if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
            Application application = (Application) context.getApplicationContext();
            if (C19109b.f48577a.get() == null) {
                C19109b bVar = new C19109b();
                AtomicReference<C19109b> atomicReference2 = C19109b.f48577a;
                while (true) {
                    if (!atomicReference2.compareAndSet((Object) null, bVar)) {
                        if (atomicReference2.get() != null) {
                            z = false;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    BackgroundDetector.initialize(application);
                    BackgroundDetector.getInstance().addListener(bVar);
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f48565j) {
            C6302b bVar2 = f48567l;
            Preconditions.checkState(true ^ bVar2.containsKey("[DEFAULT]"), "FirebaseApp name [DEFAULT] already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            dVar = new C19107d(context, fVar, "[DEFAULT]");
            bVar2.put("[DEFAULT]", dVar);
        }
        dVar.mo51539g();
        return dVar;
    }

    /* renamed from: i */
    public static void m46268i(Context context) {
        synchronized (f48565j) {
            if (f48567l.containsKey("[DEFAULT]")) {
                m46265d();
                return;
            }
            C19113f a = C19113f.m46274a(context);
            if (a != null) {
                m46267h(context, a);
            }
        }
    }

    /* renamed from: a */
    public final void mo51535a() {
        Preconditions.checkState(!this.f48573f.get(), "FirebaseApp was deleted");
    }

    @KeepForSdk
    /* renamed from: b */
    public final <T> T mo51536b(Class<T> cls) {
        mo51535a();
        return this.f48571d.mo314b(cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19107d)) {
            return false;
        }
        String str = this.f48569b;
        C19107d dVar = (C19107d) obj;
        dVar.mo51535a();
        return str.equals(dVar.f48569b);
    }

    @KeepForSdk
    /* renamed from: f */
    public final String mo51538f() {
        StringBuilder sb = new StringBuilder();
        mo51535a();
        sb.append(Base64Utils.encodeUrlSafeNoPadding(this.f48569b.getBytes(Charset.defaultCharset())));
        sb.append("+");
        mo51535a();
        sb.append(Base64Utils.encodeUrlSafeNoPadding(this.f48570c.f48582b.getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    /* renamed from: g */
    public final void mo51539g() {
        boolean z;
        Context context = this.f48568a;
        boolean z2 = true;
        if (Build.VERSION.SDK_INT >= 24) {
            z = C5815m.m14248a(context);
        } else {
            z = true;
        }
        if (!z) {
            mo51535a();
            Context context2 = this.f48568a;
            if (C19111d.f48579b.get() == null) {
                C19111d dVar = new C19111d(context2);
                AtomicReference<C19111d> atomicReference = C19111d.f48579b;
                while (true) {
                    if (!atomicReference.compareAndSet((Object) null, dVar)) {
                        if (atomicReference.get() != null) {
                            z2 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z2) {
                    context2.registerReceiver(dVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                    return;
                }
                return;
            }
            return;
        }
        mo51535a();
        C13796k kVar = this.f48571d;
        mo51535a();
        kVar.mo40723q("[DEFAULT]".equals(this.f48569b));
        this.f48575h.get().mo43362c();
    }

    public final int hashCode() {
        return this.f48569b.hashCode();
    }

    @KeepForSdk
    /* renamed from: j */
    public final boolean mo51541j() {
        boolean z;
        mo51535a();
        C16817a aVar = this.f48574g.get();
        synchronized (aVar) {
            z = aVar.f43780b;
        }
        return z;
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("name", this.f48569b).add("options", this.f48570c).toString();
    }
}
