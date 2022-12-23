package kc0;

import ac0.C7557a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import ce0.C21100e;
import com.cubic.umo.p045ad.ext.types.UMOAdKitError;
import com.cubic.umo.p045ad.playback.p046ui.activities.AKInterstitialAdActivity;
import com.cubic.umo.p045ad.playback.p046ui.views.AKWebView;
import com.umo.ads.p342c.zza;
import com.umo.ads.p350u.zzc;
import com.umo.ads.p350u.zzk;
import hc0.C12751a;
import java.util.concurrent.CancellationException;
import mf0.C24362h;
import nc0.C12954d;
import p043ch.qos.logback.classic.Logger;
import p584jl.C17885a;
import vb0.C13197a;
import wh0.C25203o1;

@SuppressLint({"ViewConstructor"})
/* renamed from: kc0.b */
public final class C12836b extends AKWebView {

    /* renamed from: o */
    public static final /* synthetic */ int f31706o = 0;

    /* renamed from: d */
    public final String f31707d;

    /* renamed from: e */
    public final C12837a f31708e;

    /* renamed from: f */
    public zzc f31709f = zzc.INLINE;

    /* renamed from: g */
    public String f31710g;

    /* renamed from: h */
    public zza f31711h = zza.NONE;

    /* renamed from: i */
    public String f31712i;

    /* renamed from: j */
    public boolean f31713j;

    /* renamed from: k */
    public boolean f31714k;

    /* renamed from: l */
    public final String f31715l;

    /* renamed from: m */
    public ViewGroup f31716m;

    /* renamed from: n */
    public C25203o1 f31717n;

    /* renamed from: kc0.b$a */
    public interface C12837a {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12836b(String str, Context context, C12837a aVar) {
        super(context);
        String str2;
        C24362h.m61211f(str, "spotId");
        this.f31707d = str;
        this.f31708e = aVar;
        if (C12954d.m32800c(str)) {
            str2 = C17885a.m44403H0(str);
        } else {
            str2 = "";
        }
        this.f31715l = str2;
    }

    /* renamed from: c */
    public final void mo39656c(String str, UMOAdKitError uMOAdKitError) {
        String str2;
        boolean c = C12954d.m32800c(str);
        if (C12954d.m32800c(this.f31710g)) {
            if (c && !C24362h.m61206a(this.f31710g, str)) {
                return;
            }
        } else if (c) {
            return;
        }
        if (!this.f31713j) {
            this.f31713j = true;
            mo39657d(false);
            C12837a aVar = this.f31708e;
            if (aVar != null) {
                String str3 = this.f31707d;
                C12751a aVar2 = (C12751a) aVar;
                C24362h.m61211f(str3, "spotId");
                C24362h.m61211f(uMOAdKitError, "akError");
                Logger logger = C7557a.f23040a;
                StringBuilder J0 = C21100e.m49315J0("HTML_AD: onHtmlAdError");
                if (C12954d.m32800c(str3)) {
                    str2 = C17885a.m44403H0(str3);
                } else {
                    str2 = "";
                }
                J0.append(str2);
                J0.append(": akError: ");
                J0.append(uMOAdKitError.name());
                logger.mo6667d(J0.toString());
                if (aVar2.mo39548f()) {
                    C13197a aVar3 = aVar2.f31499d;
                    if (aVar3 != null) {
                        aVar3.mo39578v(str3, uMOAdKitError);
                        return;
                    }
                    return;
                }
                aVar2.mo39545c(zzk.BROADCAST_ACTION_INTERSTITIAL_FAIL, uMOAdKitError.name());
                C12751a.C12752a aVar4 = aVar2.f31498c;
                if (aVar4 != null) {
                    ((AKInterstitialAdActivity) aVar4).mo11140b1(str3);
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo39657d(boolean z) {
        if (this.f31717n != null) {
            if (!z) {
                Logger logger = C7557a.f23040a;
                StringBuilder J0 = C21100e.m49315J0("HTML_AD: Stopping Ad Load Tracking Job");
                J0.append(this.f31715l);
                J0.append("...");
                logger.mo6672i(J0.toString());
            }
            C25203o1 o1Var = this.f31717n;
            if (o1Var != null) {
                o1Var.mo61776a((CancellationException) null);
            }
            this.f31717n = null;
        }
    }

    public final zzc getAdPlacement() {
        return this.f31709f;
    }

    public final String getBannerData() {
        String str = this.f31712i;
        if (str != null) {
            return str;
        }
        C24362h.m61217l("bannerData");
        throw null;
    }

    public final zza getBannerType() {
        return this.f31711h;
    }

    public final String getBannerUrl() {
        return this.f31710g;
    }

    public final void onPause() {
        stopLoading();
        loadUrl("");
    }

    public final void setAdPlacement(zzc zzc) {
        C24362h.m61211f(zzc, "<set-?>");
        this.f31709f = zzc;
    }

    public final void setBannerData(String str) {
        C24362h.m61211f(str, "<set-?>");
        this.f31712i = str;
    }

    public final void setBannerType(zza zza) {
        C24362h.m61211f(zza, "<set-?>");
        this.f31711h = zza;
    }

    public final void setBannerUrl(String str) {
        this.f31710g = str;
    }
}
