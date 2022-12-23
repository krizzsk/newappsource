package com.moovit.app.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.ads.AdView;
import com.moovit.MoovitActivity;
import com.moovit.MoovitExecutors;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.ads.C14764y;
import com.moovit.app.home.HomeActivity;
import com.moovit.app.tracking.TrackingCondition;
import com.moovit.commons.utils.UiUtils;
import com.tranzmate.R;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import p001a0.C0017h;
import p130j2.C5367a;
import p241s0.C6302b;
import p874vr.C20199a;
import q00.C19047a;

public class MoovitAnchoredBannerAdFragment extends C14733a implements C14764y.C14765a {

    /* renamed from: t */
    public static final Set<Class<? extends MoovitActivity>> f37478t = Collections.singleton(HomeActivity.class);

    /* renamed from: r */
    public final C14731a f37479r = new C14731a();

    /* renamed from: s */
    public final C6302b f37480s = new C6302b(AdSource.values().length);

    /* renamed from: com.moovit.app.ads.MoovitAnchoredBannerAdFragment$a */
    public class C14731a extends BroadcastReceiver {
        public C14731a() {
        }

        public final void onReceive(Context context, Intent intent) {
            MoovitAnchoredBannerAdFragment.this.mo44740q2();
        }
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return Collections.singleton("CONFIGURATION");
    }

    /* renamed from: n2 */
    public final void mo44731n2() {
        super.mo44731n2();
        mo44734s2();
    }

    public final void onDestroyView() {
        super.onDestroyView();
        Context requireContext = requireContext();
        C14731a aVar = this.f37479r;
        EnumSet<AdSource> enumSet = MobileAdsManager.f37451p;
        C5367a.m13473a(requireContext).mo21148d(aVar);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        MobileAdsManager.m37075o(requireContext(), this.f37479r);
    }

    /* renamed from: p2 */
    public final void mo44732p2(AdSource adSource, C14741h hVar) {
        MobileAdsManager.m37073h().mo44706c(adSource).addOnCompleteListener(MoovitExecutors.MAIN_THREAD, new C14762w(0, this, adSource, hVar));
    }

    /* renamed from: r2 */
    public final AdView mo44730m2() {
        ViewGroup viewGroup = this.f37498p;
        if (viewGroup != null) {
            return (AdView) UiUtils.m40251j(viewGroup, AdView.class);
        }
        return null;
    }

    /* renamed from: s2 */
    public final void mo44734s2() {
        Fragment A;
        if (isAdded() && (A = getChildFragmentManager().mo3923A("subscriptions_promo_cell_fragment")) != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            childFragmentManager.getClass();
            C0909a aVar = new C0909a(childFragmentManager);
            aVar.mo4050p(A);
            aVar.mo4043i();
        }
    }

    /* renamed from: t2 */
    public final void mo44735t2() {
        boolean z;
        boolean z2;
        if (this.f37496n == null) {
            mo44731n2();
            return;
        }
        MobileAdsManager.m37073h();
        AdView adView = (AdView) this.f37480s.getOrDefault(MobileAdsManager.m37072g(this.f37496n), null);
        if (adView == null) {
            mo44731n2();
            return;
        }
        AdView r2 = mo44730m2();
        if (r2 != adView) {
            if (adView.getResponseInfo() != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (r2 != null) {
                    this.f37498p.removeView(r2);
                }
                C19047a aVar = (C19047a) mo46776J1("CONFIGURATION");
                if (!((Boolean) aVar.mo51505b(C20199a.f51277g1)).booleanValue() || !((Boolean) aVar.mo51505b(C20199a.f51279h1)).booleanValue() || !f37478t.contains(((MoovitAppActivity) this.f40822c).getClass()) || !TrackingCondition.SUBSCRIPTIONS_PROMO.isValid(requireContext())) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2 && (isAdded() || getChildFragmentManager().mo3923A("subscriptions_promo_cell_fragment") == null)) {
                    C14764y yVar = new C14764y();
                    FragmentManager childFragmentManager = getChildFragmentManager();
                    C0909a K = C0017h.m54K(childFragmentManager, childFragmentManager);
                    K.mo4041e(R.id.fragment_container, yVar, "subscriptions_promo_cell_fragment", 1);
                    K.mo4043i();
                }
                this.f37498p.addView(adView, 0);
                this.f37499q.setVisibility(0);
            }
        }
    }

    /* renamed from: x1 */
    public final void mo44736x1() {
        mo44734s2();
    }
}
