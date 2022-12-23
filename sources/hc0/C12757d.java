package hc0;

import ac0.C7557a;
import android.content.Context;
import android.view.ViewGroup;
import ce0.C21100e;
import com.cubic.umo.p045ad.ext.types.UMOAdKitError;
import com.cubic.umo.p045ad.playback.p046ui.activities.AKVideoAdActivity;
import com.umo.ads.p347l.zzd;
import com.umo.ads.p348o.zzc;
import com.umo.ads.p350u.zzk;
import mf0.C24362h;
import nc0.C12954d;
import p043ch.qos.logback.classic.Logger;
import p584jl.C17885a;
import vb0.C13197a;
import vb0.C13199c;
import wb0.C13233c;

/* renamed from: hc0.d */
public final class C12757d implements zzc.C12093a {

    /* renamed from: a */
    public final String f31520a;

    /* renamed from: b */
    public final C12758a f31521b;

    /* renamed from: c */
    public C13197a f31522c;

    /* renamed from: d */
    public C13199c f31523d;

    /* renamed from: e */
    public zzc f31524e;

    /* renamed from: hc0.d$a */
    public interface C12758a {
    }

    public C12757d(String str, C12758a aVar) {
        C24362h.m61211f(str, "spotId");
        this.f31520a = str;
        this.f31521b = aVar;
    }

    /* renamed from: a */
    public final void mo39610a(zzk zzk, String str) {
        Context context;
        Context context2 = C13233c.f32842a;
        ViewGroup c = C13233c.m33334c(this.f31520a);
        if (c == null) {
            context = null;
        } else {
            context = c.getContext();
        }
        if (context != null) {
            int i = zzd.f30827d;
            zzd.C12091a.m32061a(context, this.f31520a, zzk.zza, str);
        }
    }

    /* renamed from: b */
    public final void mo39611b(String str) {
        String str2;
        C24362h.m61211f(str, "spotId");
        Logger logger = C7557a.f23040a;
        if (C12954d.m32800c(str)) {
            str2 = C17885a.m44403H0(str);
        } else {
            str2 = "";
        }
        logger.mo6666c(C24362h.m61216k(str2, "VIDEO_PLAYER_CALLBACK: onVideoCompleted"));
        if (mo39612c()) {
            C13197a aVar = this.f31522c;
            if (aVar != null) {
                aVar.zzl(str);
                return;
            }
            return;
        }
        mo39610a(zzk.BROADCAST_ACTION_AD_PLAYBACK_COMPLETED, (String) null);
        C12758a aVar2 = this.f31521b;
        if (aVar2 != null) {
            ((AKVideoAdActivity) aVar2).mo11143b1(str);
        }
    }

    /* renamed from: c */
    public final boolean mo39612c() {
        zzc zzc = this.f31524e;
        if (zzc == null) {
            return false;
        }
        return zzc.mo35797E();
    }

    /* renamed from: d */
    public final void mo39613d(String str, com.umo.ads.p342c.zzd zzd) {
        String str2;
        C24362h.m61211f(str, "spotId");
        C24362h.m61211f(zzd, "vastError");
        Logger logger = C7557a.f23040a;
        StringBuilder J0 = C21100e.m49315J0("VIDEO_PLAYER_CALLBACK: onVideoError");
        if (C12954d.m32800c(str)) {
            str2 = C17885a.m44403H0(str);
        } else {
            str2 = "";
        }
        J0.append(str2);
        J0.append(": ");
        J0.append(zzd.name());
        logger.mo6667d(J0.toString());
        if (mo39612c()) {
            C13197a aVar = this.f31522c;
            if (aVar != null) {
                aVar.mo39550B(str, UMOAdKitError.AD_PLAY_FAILED, zzd);
                return;
            }
            return;
        }
        mo39610a(zzk.BROADCAST_ACTION_AD_PLAYBACK_FAILED, zzd.name());
        C12758a aVar2 = this.f31521b;
        if (aVar2 != null) {
            ((AKVideoAdActivity) aVar2).mo11143b1(str);
        }
    }
}
