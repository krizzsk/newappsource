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
import t30.C6563e;
import t30.C6564f;

/* renamed from: b40.b */
public final class C1473b implements Callable<C1472a> {

    /* renamed from: e */
    public static final long f5349e = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: b */
    public final MoovitApplication<?, ?, ?> f5350b;

    /* renamed from: c */
    public final AtomicReference<C1474a> f5351c;

    /* renamed from: d */
    public final boolean f5352d = false;

    /* renamed from: b40.b$a */
    public static class C1474a {

        /* renamed from: a */
        public final long f5353a;

        /* renamed from: b */
        public final ServerId f5354b;

        /* renamed from: c */
        public final LocaleInfo f5355c;

        /* renamed from: d */
        public final C1472a f5356d;

        public C1474a(long j, ServerId serverId, LocaleInfo localeInfo, C1472a aVar) {
            this.f5353a = j;
            C21100e.m49373x(serverId, "metroId");
            this.f5354b = serverId;
            this.f5355c = localeInfo;
            this.f5356d = aVar;
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("CacheEntry{timestamp=");
            k.append(this.f5353a);
            k.append(", metroId=");
            k.append(this.f5354b);
            k.append(", locale=");
            k.append(this.f5355c);
            k.append(", data=");
            k.append(this.f5356d);
            k.append('}');
            return k.toString();
        }
    }

    public C1473b(MoovitApplication moovitApplication, AtomicReference atomicReference) {
        C21100e.m49373x(moovitApplication, "application");
        this.f5350b = moovitApplication;
        C21100e.m49373x(atomicReference, "reference");
        this.f5351c = atomicReference;
        C21100e.m49373x(Boolean.FALSE, "bypassCache");
    }

    public final Object call() throws Exception {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ServerId serverId = this.f5350b.mo44560l().f33853b.f50160a.f32927c;
        LocaleInfo localeInfo = new LocaleInfo(C20930c.m49020b(this.f5350b));
        C1474a aVar = this.f5351c.get();
        boolean z = false;
        if (aVar != null && elapsedRealtime - aVar.f5353a < f5349e && C20975x0.m49118e(aVar.f5354b, serverId)) {
            z = localeInfo.equals(aVar.f5355c);
        }
        if (!this.f5352d && z) {
            return aVar.f5356d;
        }
        C6564f fVar = (C6564f) new C6563e(this.f5350b.mo44560l()).mo52626J();
        C1472a aVar2 = fVar.f20376m;
        aVar2.toString();
        if (!fVar.f20377n) {
            this.f5351c.set(new C1474a(elapsedRealtime, serverId, localeInfo, aVar2));
        } else if (!z) {
            this.f5351c.set((Object) null);
        }
        return aVar2;
    }
}
