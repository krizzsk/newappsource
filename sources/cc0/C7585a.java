package cc0;

import bc0.C7570a;
import bf0.C21049c;
import com.umo.ads.p346k.zzb;
import com.umo.ads.p346k.zzd;
import com.umo.ads.p346k.zzf;
import ff0.C23349c;
import hi0.C23538f;
import hi0.C23562t;
import hi0.C23566v;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;
import mf0.C24362h;
import p335z7.C7492a;
import p583jk.C17884p;
import wb0.C13233c;
import wh0.C25177g;

/* renamed from: cc0.a */
public final class C7585a {

    /* renamed from: b */
    public static final C23562t f23100b = C23562t.m57743c("application/json; charset=UTF-8");

    /* renamed from: a */
    public C23566v f23101a;

    public C7585a(int i, int i2) {
        i2 = i2 <= 0 ? 10 : i2;
        i = i <= 0 ? 10 : i;
        C23566v.C23568b bVar = new C23566v.C23568b();
        long j = (long) i2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        bVar.mo58716b(j, timeUnit);
        bVar.mo58717c((long) i, timeUnit);
        bVar.mo58715a(new C7570a(C13233c.m33333b()));
        this.f23101a = new C23566v(bVar);
    }

    /* renamed from: a */
    public final void mo23844a(String str, C23538f fVar) {
        C24362h.m61211f(str, "reqUrl");
        C21049c<zzb> cVar = zzb.f30809c;
        zzb a = zzb.C12084a.m32052a();
        C23566v vVar = this.f23101a;
        if (vVar != null) {
            a.getClass();
            C25177g.m63218b(C7492a.f22973b, CoroutineContext.DefaultImpls.m58548a(C17884p.m44356a(), new C7586b(fVar)), new zzd(a, str, (C23349c) null, fVar, vVar), 2);
            return;
        }
        C24362h.m61217l("client");
        throw null;
    }

    /* renamed from: b */
    public final void mo23845b(String str, String str2, C23538f fVar) {
        C24362h.m61211f(str, "reqUrl");
        C24362h.m61211f(str2, "reqPayload");
        C21049c<zzb> cVar = zzb.f30809c;
        zzb a = zzb.C12084a.m32052a();
        C23566v vVar = this.f23101a;
        if (vVar != null) {
            a.getClass();
            C25177g.m63218b(C7492a.f22973b, CoroutineContext.DefaultImpls.m58548a(C17884p.m44356a(), new C7587c(fVar)), new zzf(vVar, str2, a, str, fVar, (C23349c<? super zzf>) null), 2);
            return;
        }
        C24362h.m61217l("client");
        throw null;
    }
}
