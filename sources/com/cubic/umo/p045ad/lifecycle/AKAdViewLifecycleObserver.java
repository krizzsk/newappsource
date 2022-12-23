package com.cubic.umo.p045ad.lifecycle;

import ac0.C7557a;
import android.content.Context;
import androidx.lifecycle.C1031o;
import androidx.lifecycle.C1045x;
import androidx.lifecycle.Lifecycle;
import com.cubic.umo.p045ad.ext.interfaces.UMOAdKitBannerView;
import kotlin.Metadata;
import mf0.C24362h;
import nc0.C12954d;
import p584jl.C17885a;
import wb0.C13233c;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007¨\u0006\u0005"}, mo59060d2 = {"Lcom/cubic/umo/ad/lifecycle/AKAdViewLifecycleObserver;", "Landroidx/lifecycle/o;", "Lbf0/d;", "onResume", "onStop", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
/* renamed from: com.cubic.umo.ad.lifecycle.AKAdViewLifecycleObserver */
public final class AKAdViewLifecycleObserver implements C1031o {

    /* renamed from: b */
    public final String f7311b;

    /* renamed from: c */
    public final String f7312c;

    public AKAdViewLifecycleObserver(String str) {
        String str2;
        C24362h.m61211f(str, "spotId");
        this.f7311b = str;
        if (C12954d.m32800c(str)) {
            str2 = C17885a.m44403H0(str);
        } else {
            str2 = "";
        }
        this.f7312c = str2;
    }

    @C1045x(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        C7557a.f23040a.mo6672i(C24362h.m61216k(this.f7312c, "LIFECYCLE_EVENT: ON_RESUME"));
        Context context = C13233c.f32842a;
        UMOAdKitBannerView s = C13233c.m33350s(this.f7311b);
        if (s != null) {
            s.mo11062i(0);
        }
    }

    @C1045x(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        C7557a.f23040a.mo6672i(C24362h.m61216k(this.f7312c, "LIFECYCLE_EVENT: ON_STOP"));
        Context context = C13233c.f32842a;
        UMOAdKitBannerView s = C13233c.m33350s(this.f7311b);
        if (s != null) {
            s.mo11062i(4);
        }
    }
}
