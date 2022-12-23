package com.moovit.app.ads;

import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.ads.AdView;
import com.moovit.MoovitActivity;
import com.moovit.MoovitApplication;

/* renamed from: com.moovit.app.ads.g */
public final class C14740g extends C14749m {

    /* renamed from: i */
    public final /* synthetic */ AdView f37519i;

    /* renamed from: j */
    public final /* synthetic */ C14738f f37520j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14740g(C14738f fVar, MoovitApplication moovitApplication, MoovitActivity moovitActivity, boolean z, String str, AdView adView, AdView adView2) {
        super(moovitApplication, moovitActivity, z, str, adView);
        this.f37520j = fVar;
        this.f37519i = adView2;
    }

    public final void onAdLoaded() {
        super.onAdLoaded();
        ViewParent parent = this.f37519i.getParent();
        if (parent instanceof View) {
            int i = this.f37520j.f37517l;
            ((View) parent).setPadding(i, i, i, i);
        }
    }
}
