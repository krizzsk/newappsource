package p664mu;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import c00.C13720d;
import c00.C13722f;
import c70.C13752e;
import ce0.C21100e;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitApplication;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.app.mot.model.MotActivation;
import com.moovit.app.mot.protocol.GetMotUserActivationsRequest;
import com.moovit.appdata.UserContextLoader;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.image.model.Image;
import com.moovit.network.model.ServerId;
import com.moovit.user.LocaleInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p009a8.C0114n;
import p054d0.C4273c0;
import p066e0.C4452q0;
import p172m9.C5720b;
import p273u6.C6716g;
import p578jf.C17843u;
import p583jk.C17884p;
import p638lr.C18262i;
import p646lz.C18299a;
import p736pu.C18998g;
import p824tp.C19722a0;
import p824tp.C19728f;
import p977zz.C20930c;
import r10.C19220d;
import w40.C25761d;

/* renamed from: mu.f */
public final class C18443f {

    /* renamed from: d */
    public static final long f47012d = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: e */
    public static volatile C18443f f47013e;

    /* renamed from: f */
    public static final ThreadPoolExecutor f47014f = C5720b.m14033A(1, "m-m");

    /* renamed from: a */
    public final MoovitApplication<?, ?, ?> f47015a;

    /* renamed from: b */
    public final AtomicReference<C18445b> f47016b = new AtomicReference<>((Object) null);

    /* renamed from: c */
    public final AtomicReference<C18445b> f47017c = new AtomicReference<>((Object) null);

    /* renamed from: mu.f$a */
    public class C18444a extends BroadcastReceiver {
        public C18444a() {
        }

        public final void onReceive(Context context, Intent intent) {
            C18443f.this.mo50890g();
        }
    }

    /* renamed from: mu.f$b */
    public static class C18445b {

        /* renamed from: a */
        public final long f47019a;

        /* renamed from: b */
        public final ServerId f47020b;

        /* renamed from: c */
        public final LocaleInfo f47021c;

        /* renamed from: d */
        public final List<MotActivation> f47022d;

        public C18445b(long j, ServerId serverId, LocaleInfo localeInfo, ArrayList arrayList) {
            List<MotActivation> list;
            this.f47019a = j;
            C21100e.m49373x(serverId, "metroId");
            this.f47020b = serverId;
            this.f47021c = localeInfo;
            if (arrayList != null) {
                list = Collections.unmodifiableList(arrayList);
            } else {
                list = null;
            }
            this.f47022d = list;
        }
    }

    /* renamed from: mu.f$c */
    public static class C18446c implements Callable<List<MotActivation>> {

        /* renamed from: b */
        public final GetMotUserActivationsRequest.Source f47023b;

        /* renamed from: c */
        public final AtomicReference<C18445b> f47024c;

        public C18446c(GetMotUserActivationsRequest.Source source, AtomicReference<C18445b> atomicReference) {
            C21100e.m49373x(source, "source");
            this.f47023b = source;
            C21100e.m49373x(atomicReference, "cacheRef");
            this.f47024c = atomicReference;
        }

        /* renamed from: a */
        public static boolean m45305a(C18445b bVar, ServerId serverId, LocaleInfo localeInfo) {
            if (bVar != null && SystemClock.elapsedRealtime() - bVar.f47019a < C18443f.f47012d && serverId.equals(bVar.f47020b)) {
                return !bVar.f47021c.equals(localeInfo);
            }
            return true;
        }

        public final Object call() throws Exception {
            MoovitApplication<?, ?, ?> moovitApplication = MoovitApplication.f37317k;
            C21100e.m49355o();
            if (UserContextLoader.m40004l(moovitApplication)) {
                C18299a aVar = moovitApplication.f37321e;
                C19722a0 a0Var = (C19722a0) aVar.mo50695h("USER_CONTEXT", false);
                if (a0Var != null) {
                    C21100e.m49355o();
                    C18299a aVar2 = moovitApplication.f37321e;
                    C19728f fVar = (C19728f) aVar2.mo50695h("METRO_CONTEXT", false);
                    if (fVar != null) {
                        ServerId serverId = a0Var.f50160a.f32927c;
                        LocaleInfo localeInfo = new LocaleInfo(C20930c.m49020b(moovitApplication));
                        C18445b bVar = this.f47024c.get();
                        if (m45305a(bVar, serverId, localeInfo)) {
                            synchronized (this.f47024c) {
                                bVar = this.f47024c.get();
                                if (m45305a(bVar, serverId, localeInfo)) {
                                    ArrayList arrayList = ((C18998g) new GetMotUserActivationsRequest(new C13752e(moovitApplication, a0Var, (AnalyticsFlowKey) null), fVar, this.f47023b).mo52626J()).f48345m;
                                    for (Image image : C13720d.m34277g(arrayList, (C13722f) null, new C18262i(3))) {
                                        if (image != null) {
                                            C19220d<Drawable> o0 = C17884p.m44353X(moovitApplication).mo51642v(image).mo51628o0(image);
                                            o0.mo10848R(new C6716g(o0.f6922C));
                                        }
                                    }
                                    C18445b bVar2 = new C18445b(SystemClock.elapsedRealtime(), serverId, localeInfo, arrayList);
                                    this.f47024c.set(bVar2);
                                    bVar = bVar2;
                                }
                            }
                        }
                        return bVar.f47022d;
                    }
                    StringBuilder k = C13555b.m33972k("Failed to load metro context: ");
                    k.append(aVar2.mo50694g("METRO_CONTEXT"));
                    throw new ApplicationBugException(k.toString());
                }
                StringBuilder k2 = C13555b.m33972k("Failed to load user context: ");
                k2.append(aVar.mo50694g("USER_CONTEXT"));
                throw new ApplicationBugException(k2.toString());
            }
            throw new ApplicationBugException("Missing user context!");
        }
    }

    /* renamed from: mu.f$d */
    public static class C18447d implements Callable<Void> {

        /* renamed from: b */
        public final List<AtomicReference<?>> f47025b;

        public C18447d(AtomicReference<?>... atomicReferenceArr) {
            this.f47025b = Arrays.asList(atomicReferenceArr);
        }

        public final Object call() throws Exception {
            for (AtomicReference<?> atomicReference : this.f47025b) {
                atomicReference.set((Object) null);
            }
            return null;
        }
    }

    public C18443f(MoovitApplication<?, ?, ?> moovitApplication) {
        C21100e.m49373x(moovitApplication, "application");
        this.f47015a = moovitApplication;
        C25761d.m64300h(moovitApplication, new C18444a());
    }

    /* renamed from: d */
    public static C18443f m45298d() {
        C18443f fVar = f47013e;
        if (fVar != null) {
            return fVar;
        }
        throw new IllegalStateException("you must call initialize first");
    }

    /* renamed from: e */
    public static Task m45299e(GetMotUserActivationsRequest.Source source, AtomicReference atomicReference) {
        if (!C25761d.m64299a().mo83590e()) {
            return Tasks.forResult(Collections.emptyList());
        }
        return Tasks.call(f47014f, new C18446c(source, atomicReference)).addOnFailureListener((Executor) MoovitExecutors.COMPUTATION, (OnFailureListener) new C18442e());
    }

    /* renamed from: f */
    public static synchronized void m45300f(MoovitApplication<?, ?, ?> moovitApplication) {
        synchronized (C18443f.class) {
            if (f47013e == null) {
                f47013e = new C18443f(moovitApplication);
            }
        }
    }

    /* renamed from: a */
    public final Task<List<MotActivation>> mo50887a(String str) {
        C18441d dVar = new C18441d(str);
        Task<List<MotActivation>> c = mo50889c();
        ExecutorService executorService = MoovitExecutors.COMPUTATION;
        return c.onSuccessTask(executorService, dVar).onSuccessTask(executorService, new C4273c0(2, this, dVar));
    }

    /* renamed from: b */
    public final Task<List<MotActivation>> mo50888b() {
        return m45299e(GetMotUserActivationsRequest.Source.CURRENT, this.f47016b).onSuccessTask(MoovitExecutors.COMPUTATION, new C4452q0(11));
    }

    /* renamed from: c */
    public final Task<List<MotActivation>> mo50889c() {
        return m45299e(GetMotUserActivationsRequest.Source.CURRENT, this.f47016b).onSuccessTask(MoovitExecutors.COMPUTATION, new C0114n(12));
    }

    /* renamed from: g */
    public final void mo50890g() {
        Tasks.call(f47014f, new C18447d(this.f47016b, this.f47017c)).addOnSuccessListener(MoovitExecutors.MAIN_THREAD, new C17843u(this, 3));
    }
}
