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
import q80.C13012b0;
import q80.C13014c0;

/* renamed from: s90.g */
public final class C13081g implements Callable<C13076d> {

    /* renamed from: e */
    public static final long f32361e = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: b */
    public final MoovitApplication<?, ?, ?> f32362b;

    /* renamed from: c */
    public final AtomicReference<C13082a> f32363c;

    /* renamed from: d */
    public final boolean f32364d;

    /* renamed from: s90.g$a */
    public static class C13082a {

        /* renamed from: a */
        public final long f32365a;

        /* renamed from: b */
        public final ServerId f32366b;

        /* renamed from: c */
        public final LocaleInfo f32367c;

        /* renamed from: d */
        public final C13076d f32368d;

        public C13082a(long j, ServerId serverId, LocaleInfo localeInfo, C13076d dVar) {
            this.f32365a = j;
            C21100e.m49373x(serverId, "metroId");
            this.f32366b = serverId;
            this.f32367c = localeInfo;
            this.f32368d = dVar;
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("CacheEntry{timestamp=");
            k.append(this.f32365a);
            k.append(", metroId=");
            k.append(this.f32366b);
            k.append(", locale=");
            k.append(this.f32367c);
            k.append(", data=");
            k.append(this.f32368d);
            k.append('}');
            return k.toString();
        }
    }

    public C13081g(MoovitApplication<?, ?, ?> moovitApplication, AtomicReference<C13082a> atomicReference, boolean z) {
        C21100e.m49373x(moovitApplication, "application");
        this.f32362b = moovitApplication;
        C21100e.m49373x(atomicReference, "reference");
        this.f32363c = atomicReference;
        Boolean valueOf = Boolean.valueOf(z);
        C21100e.m49373x(valueOf, "bypassCache");
        this.f32364d = valueOf.booleanValue();
    }

    public final Object call() throws Exception {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ServerId serverId = this.f32362b.mo44560l().f33853b.f50160a.f32927c;
        LocaleInfo localeInfo = new LocaleInfo(C20930c.m49020b(this.f32362b));
        C13082a aVar = this.f32363c.get();
        boolean z = false;
        if (aVar != null && elapsedRealtime - aVar.f32365a < f32361e && C20975x0.m49118e(aVar.f32366b, serverId)) {
            z = localeInfo.equals(aVar.f32367c);
        }
        if (!this.f32364d && z) {
            return aVar.f32368d;
        }
        C13014c0 c0Var = (C13014c0) new C13012b0(this.f32362b.mo44560l(), (C12991b) this.f32362b.f37321e.mo50700l("TICKETING_CONFIGURATION"), this.f32364d).mo52626J();
        C13076d dVar = c0Var.f32207m;
        dVar.toString();
        if (!c0Var.f32208n) {
            this.f32363c.set(new C13082a(elapsedRealtime, serverId, localeInfo, dVar));
        } else if (!z) {
            this.f32363c.set((Object) null);
        }
        return dVar;
    }
}
