package b40;

import android.os.SystemClock;
import ce0.C21100e;
import com.moovit.MoovitApplication;
import com.moovit.network.model.ServerId;
import com.moovit.user.LocaleInfo;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p977zz.C20930c;
import p977zz.C20975x0;
import t30.C6583w;
import t30.C6584x;

/* renamed from: b40.e */
public final class C1477e implements Callable<C1476d> {

    /* renamed from: e */
    public static final long f5363e = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: b */
    public final MoovitApplication<?, ?, ?> f5364b;

    /* renamed from: c */
    public final AtomicReference<C1478a> f5365c;

    /* renamed from: d */
    public final boolean f5366d = false;

    /* renamed from: b40.e$a */
    public static class C1478a {

        /* renamed from: a */
        public final long f5367a;

        /* renamed from: b */
        public final ServerId f5368b;

        /* renamed from: c */
        public final LocaleInfo f5369c;

        /* renamed from: d */
        public final C1476d f5370d;

        public C1478a(long j, ServerId serverId, LocaleInfo localeInfo, C1476d dVar) {
            this.f5367a = j;
            C21100e.m49373x(serverId, "metroId");
            this.f5368b = serverId;
            this.f5369c = localeInfo;
            this.f5370d = dVar;
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("CacheEntry{timestamp=");
            k.append(this.f5367a);
            k.append(", metroId=");
            k.append(this.f5368b);
            k.append(", locale=");
            k.append(this.f5369c);
            k.append(", data=");
            k.append(this.f5370d);
            k.append('}');
            return k.toString();
        }
    }

    public C1477e(MoovitApplication moovitApplication, AtomicReference atomicReference) {
        C21100e.m49373x(moovitApplication, "application");
        this.f5364b = moovitApplication;
        C21100e.m49373x(atomicReference, "reference");
        this.f5365c = atomicReference;
        C21100e.m49373x(Boolean.FALSE, "bypassCache");
    }

    public final Object call() throws Exception {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ServerId serverId = this.f5364b.mo44560l().f33853b.f50160a.f32927c;
        LocaleInfo localeInfo = new LocaleInfo(C20930c.m49020b(this.f5364b));
        C1478a aVar = this.f5365c.get();
        boolean z = false;
        if (aVar != null && elapsedRealtime - aVar.f5367a < f5363e && C20975x0.m49118e(aVar.f5368b, serverId)) {
            z = localeInfo.equals(aVar.f5369c);
        }
        if (!this.f5366d && z) {
            return aVar.f5370d;
        }
        C6584x xVar = (C6584x) new C6583w(this.f5364b.mo44560l()).mo52626J();
        C1476d dVar = xVar.f20401m;
        dVar.toString();
        if (!xVar.f20402n) {
            this.f5365c.set(new C1478a(elapsedRealtime, serverId, localeInfo, dVar));
        } else if (!z) {
            this.f5365c.set((Object) null);
        }
        return dVar;
    }
}
