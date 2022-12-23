package mc0;

import android.view.ViewGroup;
import android.view.WindowInsets;
import ce0.C21100e;
import com.cubic.umo.p045ad.ext.types.UMOAdKitBannerParams;
import com.cubic.umo.p045ad.ext.types.UMOAdKitBannerState;
import com.cubic.umo.p045ad.lifecycle.AKAdViewLifecycleObserver;
import com.umo.ads.p350u.zzj;
import mf0.C24362h;
import p001a0.C0017h;
import p039c7.C1798a;
import yb0.C13308i;

/* renamed from: mc0.d */
public final class C12912d {

    /* renamed from: a */
    public final String f31965a;

    /* renamed from: b */
    public UMOAdKitBannerParams f31966b;

    /* renamed from: c */
    public String f31967c = "";

    /* renamed from: d */
    public UMOAdKitBannerState f31968d = UMOAdKitBannerState.INITIALIZED;

    /* renamed from: e */
    public UMOAdKitBannerState f31969e = UMOAdKitBannerState.NONE;

    /* renamed from: f */
    public C1798a f31970f;

    /* renamed from: g */
    public boolean f31971g;

    /* renamed from: h */
    public boolean f31972h;

    /* renamed from: i */
    public ViewGroup f31973i;

    /* renamed from: j */
    public C13308i f31974j;

    /* renamed from: k */
    public boolean f31975k;

    /* renamed from: l */
    public zzj f31976l = zzj.VISIBLE;

    /* renamed from: m */
    public WindowInsets f31977m;

    /* renamed from: n */
    public AKAdViewLifecycleObserver f31978n;

    public C12912d(String str) {
        this.f31965a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12912d) && C24362h.m61206a(this.f31965a, ((C12912d) obj).f31965a);
    }

    public final int hashCode() {
        return this.f31965a.hashCode();
    }

    public final String toString() {
        return C0017h.m57N(C21100e.m49315J0("AKBannerInfo(spotId="), this.f31965a, ')');
    }
}
