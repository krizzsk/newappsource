package com.vungle.warren;

import com.vungle.warren.C23097c;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.persistence.DatabaseHelper;
import java.util.Objects;
import od0.C24545c;
import od0.C24566m;
import p359ag.C13447d;
import p359ag.C13450g;
import p359ag.C13451h;
import p359ag.C13452i;
import qd0.C24732e;

/* renamed from: com.vungle.warren.g */
public final class C23137g implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C24732e f58730b;

    /* renamed from: c */
    public final /* synthetic */ C23097c.C23101d f58731c;

    public C23137g(C23097c.C23101d dVar, C24732e eVar) {
        this.f58731c = dVar;
        this.f58730b = eVar;
    }

    public final void run() {
        VungleException vungleException;
        C23097c.C23101d dVar = this.f58731c;
        C24566m mVar = (C24566m) C23097c.this.f58620f.mo58281p(C24566m.class, dVar.f58636a.f58643a.mo58041f()).get();
        if (mVar == null) {
            int i = C23097c.f58614q;
            StringBuilder k = C13555b.m33972k("Placement metadata not found for requested advertisement. request = ");
            k.append(this.f58731c.f58636a.f58643a);
            VungleLogger.m57029b("AdLoader#fetchAdMetadata; loadAd sequence", k.toString());
            C23097c.this.mo58110q(new VungleException(2), this.f58731c.f58636a.f58643a, (String) null);
            return;
        }
        boolean z = true;
        if (!this.f58730b.mo61217a()) {
            VungleApiClient vungleApiClient = C23097c.this.f58622h;
            C24732e eVar = this.f58730b;
            vungleApiClient.getClass();
            long g = VungleApiClient.m57014g(eVar);
            if (g <= 0 || (!mVar.mo60832b() && !mVar.mo60833c())) {
                int i2 = C23097c.f58614q;
                VungleLogger.m57029b("AdLoader#fetchAdMetadata; loadAd sequence", String.format("Response was not successful, not retrying;request = %1$s; responseCode = %2$s", new Object[]{this.f58731c.f58636a.f58643a, Integer.valueOf(this.f58730b.f62601a.f59412d)}));
                C23097c cVar = C23097c.this;
                int i3 = this.f58730b.f62601a.f59412d;
                cVar.getClass();
                if (i3 != 408 && (500 > i3 || i3 >= 600)) {
                    z = false;
                }
                if (z) {
                    vungleException = new VungleException(22);
                } else {
                    vungleException = new VungleException(21);
                }
                cVar.mo58110q(vungleException, this.f58731c.f58636a.f58643a, (String) null);
                return;
            }
            C23097c.C23101d dVar2 = this.f58731c;
            C23097c.this.mo58106m(mVar, dVar2.f58636a.f58644b, g, false);
            StringBuilder k2 = C13555b.m33972k("Response was not successful, retrying; request = ");
            k2.append(this.f58731c.f58636a.f58643a);
            VungleLogger.m57029b("AdLoader#fetchAdMetadata; loadAd sequence", k2.toString());
            C23097c.this.mo58110q(new VungleException(14), this.f58731c.f58636a.f58643a, (String) null);
            return;
        }
        C13452i iVar = (C13452i) this.f58730b.f62602b;
        int i4 = C23097c.f58614q;
        Objects.toString(iVar);
        if (iVar != null && iVar.mo40354L("ads")) {
            C13450g I = iVar.mo40351I("ads");
            I.getClass();
            if (!(I instanceof C13451h)) {
                C13447d J = iVar.mo40352J("ads");
                if (J == null || J.size() == 0) {
                    StringBuilder k3 = C13555b.m33972k("Response was successful, but no ads; request = ");
                    k3.append(this.f58731c.f58636a.f58643a);
                    VungleLogger.m57029b("AdLoader#fetchAdMetadata; loadAd sequence", k3.toString());
                    C23097c.this.mo58110q(new VungleException(1), this.f58731c.f58636a.f58643a, (String) null);
                    return;
                }
                C13452i u = J.mo40329E(0).mo40342u();
                C13452i u2 = u.mo40351I("ad_markup").mo40342u();
                C23097c.C23101d dVar3 = this.f58731c;
                C23097c cVar2 = C23097c.this;
                C23097c.C23105g gVar = dVar3.f58636a;
                long j = dVar3.f58637b;
                cVar2.getClass();
                try {
                    cVar2.mo58102h(gVar, j, new C24545c(u), mVar, u2);
                    return;
                } catch (IllegalArgumentException unused) {
                    if (u2.mo40354L("sleep")) {
                        long p = 1000 * ((long) u2.mo40351I("sleep").mo40337p());
                        mVar.f62260d = System.currentTimeMillis() + p;
                        try {
                            VungleLogger.m57032e("AdLoader#fetchAdMetadata; loadAd sequence", String.format("badAd - snoozed placement %1$s; request = %2$s", new Object[]{mVar, gVar.f58643a}));
                            cVar2.f58620f.mo58288w(mVar);
                            cVar2.mo58106m(mVar, gVar.f58644b, p, false);
                        } catch (DatabaseHelper.DBException unused2) {
                            VungleLogger.m57029b("AdLoader#fetchAdMetadata; loadAd sequence", String.format("badAd - can't save snoozed placement %1$s; request = %2$s", new Object[]{mVar, gVar.f58643a}));
                            cVar2.mo58110q(new VungleException(26), gVar.f58643a, (String) null);
                            return;
                        }
                    }
                    VungleLogger.m57029b("AdLoader#fetchAdMetadata; loadAd sequence", String.format("badAd; can't proceed %1$s; request = %2$s", new Object[]{mVar, gVar.f58643a}));
                    cVar2.mo58110q(new VungleException(1), gVar.f58643a, (String) null);
                    return;
                }
            }
        }
        VungleLogger.m57029b("AdLoader#fetchAdMetadata; loadAd sequence", String.format("Response has no ads; placement = %1$s;op.request = %2$s; response = %3$s", new Object[]{mVar, this.f58731c.f58636a.f58643a, iVar}));
        C23097c.this.mo58110q(new VungleException(1), this.f58731c.f58636a.f58643a, (String) null);
    }
}
