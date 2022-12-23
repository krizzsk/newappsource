package hc0;

import ac0.C7557a;
import android.content.Context;
import android.view.ViewGroup;
import ce0.C21100e;
import com.cubic.umo.p045ad.ext.types.UMOAdKitError;
import com.cubic.umo.p045ad.playback.p046ui.activities.AKVPaidAdActivity;
import com.umo.ads.p347l.zzd;
import com.umo.ads.p350u.zzk;
import gc0.C12724b;
import lc0.C12856a;
import lc0.C12859b;
import mf0.C24362h;
import nc0.C12954d;
import p043ch.qos.logback.classic.Logger;
import p584jl.C17885a;
import uh0.C25081h;
import vb0.C13197a;
import vb0.C13201e;
import wb0.C13233c;

/* renamed from: hc0.c */
public final class C12755c implements C12856a.C12857a {

    /* renamed from: a */
    public final String f31514a;

    /* renamed from: b */
    public final C12756a f31515b;

    /* renamed from: c */
    public C13197a f31516c;

    /* renamed from: d */
    public C13201e f31517d;

    /* renamed from: e */
    public C12724b f31518e;

    /* renamed from: f */
    public boolean f31519f;

    /* renamed from: hc0.c$a */
    public interface C12756a {
    }

    public C12755c(String str, C12756a aVar) {
        C24362h.m61211f(str, "spotId");
        this.f31514a = str;
        this.f31515b = aVar;
    }

    /* renamed from: a */
    public final void mo39605a(zzk zzk, String str) {
        Context context;
        Context context2 = C13233c.f32842a;
        ViewGroup c = C13233c.m33334c(this.f31514a);
        if (c == null) {
            context = null;
        } else {
            context = c.getContext();
        }
        if (context != null) {
            int i = zzd.f30827d;
            zzd.C12091a.m32061a(context, this.f31514a, zzk.zza, str);
        }
    }

    /* renamed from: b */
    public final void mo39606b(String str, boolean z, boolean z2) {
        C12724b bVar = this.f31518e;
        boolean z3 = false;
        if (bVar != null) {
            bVar.f31428e = false;
        }
        if (!z2) {
            if (bVar != null && bVar.f31429f) {
                z3 = true;
            }
            if (z3) {
                if (bVar != null) {
                    bVar.f31430g = true;
                    return;
                }
                return;
            }
        }
        if (!mo39609e()) {
            if (z) {
                mo39605a(zzk.BROADCAST_ACTION_AD_STOPPED, String.valueOf(z2));
            } else {
                mo39605a(zzk.BROADCAST_ACTION_AD_SKIPPED, (String) null);
            }
            C12756a aVar = this.f31515b;
            if (aVar != null) {
                ((AKVPaidAdActivity) aVar).mo11141b1(str);
            }
        } else if (z) {
            C13201e eVar = this.f31517d;
            if (eVar != null) {
                eVar.zza(str, z2);
            }
        } else {
            C13201e eVar2 = this.f31517d;
            if (eVar2 != null) {
                eVar2.zzq(str);
            }
        }
    }

    /* renamed from: c */
    public final void mo39607c(C12856a aVar, com.umo.ads.p342c.zzd zzd) {
        String str;
        C24362h.m61211f(zzd, "vastError");
        if (aVar != null) {
            Logger logger = C7557a.f23040a;
            StringBuilder J0 = C21100e.m49315J0("VPAID_BRIDGE_CALLBACK: onVPaidEventAdError");
            String str2 = aVar.f31786a;
            if (C12954d.m32800c(str2)) {
                str = C17885a.m44403H0(str2);
            } else {
                str = "";
            }
            J0.append(str);
            J0.append(": VASTError: ");
            J0.append(zzd.name());
            logger.mo6667d(J0.toString());
            if (zzd == com.umo.ads.p342c.zzd.NONE) {
                C12859b bVar = aVar.f31789d;
                C7557a.f23040a.mo6667d(C24362h.m61216k(bVar.f31800d, "VPAID Error: "));
                if (C25081h.m62830A(bVar.f31800d, "VPAID API Response Timed out", true)) {
                    zzd = com.umo.ads.p342c.zzd.AD_DISPLAY_TIMED_OUT;
                } else {
                    zzd = com.umo.ads.p342c.zzd.AD_CREATIVE_DISPLAY_ERROR;
                }
            }
            this.f31519f = true;
            C12724b bVar2 = this.f31518e;
            if (bVar2 != null && aVar == bVar2.f31442s) {
                bVar2.mo39531l();
                C12724b.m32486h(bVar2);
            }
            if (mo39609e()) {
                C13201e eVar = this.f31517d;
                if (eVar != null) {
                    eVar.mo39559c(aVar.f31786a, UMOAdKitError.AD_PLAY_FAILED, zzd);
                    return;
                }
                return;
            }
            mo39605a(zzk.BROADCAST_ACTION_AD_ERROR, zzd.name());
            C12756a aVar2 = this.f31515b;
            if (aVar2 != null) {
                ((AKVPaidAdActivity) aVar2).mo11141b1(this.f31514a);
            }
        }
    }

    /* renamed from: d */
    public final void mo39608d(C12856a aVar, boolean z) {
        String str;
        if (aVar != null) {
            Logger logger = C7557a.f23040a;
            StringBuilder J0 = C21100e.m49315J0("VPAID_BRIDGE_CALLBACK: onVPaidEventAdStopped");
            String str2 = aVar.f31786a;
            if (C12954d.m32800c(str2)) {
                str = C17885a.m44403H0(str2);
            } else {
                str = "";
            }
            J0.append(str);
            J0.append(": isForceStop: ");
            J0.append(z);
            J0.append(", isCompletedEventSent: ");
            J0.append(this.f31519f);
            J0.append(",, ignoreAdStoppedEvent: ");
            J0.append(aVar.f31791f);
            logger.mo6666c(J0.toString());
            if (!this.f31519f && !aVar.f31791f) {
                mo39606b(this.f31514a, true, z);
            }
        }
    }

    /* renamed from: e */
    public final boolean mo39609e() {
        C12724b bVar = this.f31518e;
        if (bVar == null) {
            return false;
        }
        return bVar.mo39529j();
    }
}
