package com.moovit.app.ads;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdView;
import com.moovit.C15682c;
import com.moovit.app.MoovitAppActivity;
import com.tranzmate.R;

/* renamed from: com.moovit.app.ads.a */
public abstract class C14733a extends C15682c<MoovitAppActivity> {

    /* renamed from: n */
    public AdSource f37496n = null;

    /* renamed from: o */
    public C14741h f37497o = null;

    /* renamed from: p */
    public ViewGroup f37498p;

    /* renamed from: q */
    public View f37499q;

    public C14733a() {
        super(MoovitAppActivity.class);
    }

    /* renamed from: m2 */
    public abstract AdView mo44730m2();

    /* renamed from: n2 */
    public void mo44731n2() {
        AdView m2 = mo44730m2();
        if (m2 != null) {
            this.f37498p.removeView(m2);
        }
        this.f37499q.setVisibility(8);
    }

    /* renamed from: o2 */
    public final void mo44739o2(AdSource adSource, C14741h hVar) {
        if (this.f37496n != adSource || !hVar.equals(this.f37497o)) {
            this.f37496n = adSource;
            this.f37497o = hVar;
            mo44740q2();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.anchored_banner_ad_framgnet, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f37498p = (ViewGroup) view.findViewById(R.id.banner_ads_container);
        this.f37499q = view.findViewById(R.id.divider);
        mo44740q2();
    }

    /* renamed from: p2 */
    public abstract void mo44732p2(AdSource adSource, C14741h hVar);

    /* renamed from: q2 */
    public final void mo44740q2() {
        C14741h hVar;
        if (this.f37498p != null) {
            AdSource adSource = this.f37496n;
            if (adSource == null || (hVar = this.f37497o) == null) {
                mo44731n2();
            } else {
                mo44732p2(adSource, hVar);
            }
        }
    }
}
