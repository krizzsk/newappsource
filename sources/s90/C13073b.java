package s90;

import android.os.SystemClock;
import ce0.C21100e;
import com.moovit.MoovitApplication;
import com.moovit.network.model.ServerId;
import com.moovit.user.LocaleInfo;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p80.C12991b;
import p977zz.C20930c;
import p977zz.C20975x0;
import q80.C13013c;
import q80.C13015d;

/* renamed from: s90.b */
public final class C13073b implements Callable<C13072a> {

    /* renamed from: e */
    public static final long f32333e = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: b */
    public final MoovitApplication<?, ?, ?> f32334b;

    /* renamed from: c */
    public final AtomicReference<C13074a> f32335c;

    /* renamed from: d */
    public final boolean f32336d;

    /* renamed from: s90.b$a */
    public static class C13074a {

        /* renamed from: a */
        public final long f32337a;

        /* renamed from: b */
        public final ServerId f32338b;

        /* renamed from: c */
        public final LocaleInfo f32339c;

        /* renamed from: d */
        public final C13072a f32340d;

        public C13074a(long j, ServerId serverId, LocaleInfo localeInfo, C13072a aVar) {
            this.f32337a = j;
            C21100e.m49373x(serverId, "metroId");
            this.f32338b = serverId;
            this.f32339c = localeInfo;
            this.f32340d = aVar;
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("CacheEntry{timestamp=");
            k.append(this.f32337a);
            k.append(", metroId=");
            k.append(this.f32338b);
            k.append(", locale=");
            k.append(this.f32339c);
            k.append(", data=");
            k.append(this.f32340d);
            k.append('}');
            return k.toString();
        }
    }

    public C13073b(MoovitApplication<?, ?, ?> moovitApplication, AtomicReference<C13074a> atomicReference, boolean z) {
        C21100e.m49373x(moovitApplication, "application");
        this.f32334b = moovitApplication;
        C21100e.m49373x(atomicReference, "reference");
        this.f32335c = atomicReference;
        Boolean valueOf = Boolean.valueOf(z);
        C21100e.m49373x(valueOf, "bypassCache");
        this.f32336d = valueOf.booleanValue();
    }

    public final Object call() throws Exception {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ServerId serverId = this.f32334b.mo44560l().f33853b.f50160a.f32927c;
        LocaleInfo localeInfo = new LocaleInfo(C20930c.m49020b(this.f32334b));
        C13074a aVar = this.f32335c.get();
        boolean z = false;
        if (aVar != null && elapsedRealtime - aVar.f32337a < f32333e && C20975x0.m49118e(aVar.f32338b, serverId)) {
            z = localeInfo.equals(aVar.f32339c);
        }
        if (!this.f32336d && z) {
            return aVar.f32340d;
        }
        C13015d dVar = (C13015d) new C13013c(this.f32334b.mo44560l(), (C12991b) this.f32334b.f37321e.mo50700l("TICKETING_CONFIGURATION"), this.f32336d).mo52626J();
        C13072a aVar2 = dVar.f32209m;
        aVar2.toString();
        if (!dVar.f32210n) {
            this.f32335c.set(new C13074a(elapsedRealtime, serverId, localeInfo, aVar2));
        } else if (!z) {
            this.f32335c.set((Object) null);
        }
        return aVar2;
    }
}
