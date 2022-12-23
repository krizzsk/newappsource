package com.moovit.app.ads;

import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import c00.C13717b;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.moovit.MoovitActivity;
import com.moovit.MoovitApplication;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.app.tod.TodRidesProvider;
import com.moovit.app.tod.bookingflow.TodBookingOrderViewModel;
import com.moovit.app.tod.bookingflow.model.FailureReason;
import com.moovit.app.tod.bookingflow.model.TodBookingDropOffLocationState;
import com.moovit.app.tod.model.TodRide;
import com.moovit.app.tod.model.TodSubscription;
import com.moovit.transit.LocationDescriptor;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import p172m9.C5720b;
import p250s9.C6489b;
import p269u2.C6677a;
import p394br.C13660f;
import p543hq.C17474b;
import p977zz.C20930c;
import p977zz.C20944i0;

/* renamed from: com.moovit.app.ads.w */
public final /* synthetic */ class C14762w implements OnCompleteListener {

    /* renamed from: b */
    public final /* synthetic */ int f37577b;

    /* renamed from: c */
    public final /* synthetic */ Object f37578c;

    /* renamed from: d */
    public final /* synthetic */ Object f37579d;

    /* renamed from: e */
    public final /* synthetic */ Object f37580e;

    public /* synthetic */ C14762w(int i, Object obj, Object obj2, Object obj3) {
        this.f37577b = i;
        this.f37578c = obj;
        this.f37579d = obj2;
        this.f37580e = obj3;
    }

    public final void onComplete(Task task) {
        FailureReason failureReason;
        String str;
        switch (this.f37577b) {
            case 0:
                MoovitAnchoredBannerAdFragment moovitAnchoredBannerAdFragment = (MoovitAnchoredBannerAdFragment) this.f37578c;
                AdSource adSource = (AdSource) this.f37579d;
                C14741h hVar = (C14741h) this.f37580e;
                Set<Class<? extends MoovitActivity>> set = MoovitAnchoredBannerAdFragment.f37478t;
                FragmentActivity activity = moovitAnchoredBannerAdFragment.getActivity();
                if (!(activity instanceof MoovitActivity)) {
                    moovitAnchoredBannerAdFragment.mo44731n2();
                    return;
                }
                Application application = activity.getApplication();
                if (!(application instanceof MoovitApplication)) {
                    moovitAnchoredBannerAdFragment.mo44731n2();
                    return;
                }
                if (task.isSuccessful()) {
                    str = (String) task.getResult();
                } else {
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    moovitAnchoredBannerAdFragment.mo44731n2();
                    return;
                } else if (!C14748l.m37130c(adSource, C20930c.m49023e(application))) {
                    moovitAnchoredBannerAdFragment.mo44731n2();
                    return;
                } else {
                    AdManagerAdRequest a = MobileAdsManager.m37073h().mo44705a(hVar);
                    if (a == null) {
                        moovitAnchoredBannerAdFragment.mo44731n2();
                        return;
                    } else if (((AdView) moovitAnchoredBannerAdFragment.f37480s.getOrDefault(str, null)) == null) {
                        MoovitApplication moovitApplication = (MoovitApplication) application;
                        AdView adView = new AdView(moovitAnchoredBannerAdFragment.f37498p.getContext());
                        adView.setAdUnitId(str);
                        ViewGroup viewGroup = moovitAnchoredBannerAdFragment.f37498p;
                        Context context = viewGroup.getContext();
                        adView.setAdSize(AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(context, Math.max(0, ((int) Math.ceil((double) (((float) 0) / context.getResources().getDisplayMetrics().density))) + ((int) Math.ceil((double) (((float) (viewGroup.getWidth() - (viewGroup.getPaddingRight() + viewGroup.getPaddingLeft()))) / viewGroup.getContext().getResources().getDisplayMetrics().density))))));
                        C14763x xVar = r4;
                        C14763x xVar2 = new C14763x(moovitAnchoredBannerAdFragment, moovitApplication, (MoovitActivity) activity, a.isTestDevice(moovitApplication), adSource.adUnitIdKey, adView);
                        adView.setAdListener(xVar);
                        adView.loadAd(a);
                        MobileAdsManager h = MobileAdsManager.m37073h();
                        String j = h.mo44709j();
                        C20944i0<String, String> d = h.mo44707d();
                        C6677a aVar = moovitApplication.mo44558j().f50173c;
                        AnalyticsFlowKey analyticsFlowKey = AnalyticsFlowKey.ADS;
                        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.AD);
                        aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "ad_banner_initialization");
                        aVar2.mo49939g(AnalyticsAttributeKey.AD_ID, adView.getAdUnitId());
                        aVar2.mo49939g(AnalyticsAttributeKey.AD_ID_KEY, adSource.adUnitIdKey);
                        aVar2.mo49944l(AnalyticsAttributeKey.ANALYTICS_FLOW_KEY_ID, C5720b.m14057h(moovitAnchoredBannerAdFragment.f40822c));
                        aVar2.mo49945m(AnalyticsAttributeKey.SESSION_ID, j);
                        aVar2.mo49945m(AnalyticsAttributeKey.AB_TESTING_VARIABLE_NAME, (String) d.f52692a);
                        aVar2.mo49945m(AnalyticsAttributeKey.AB_TESTING_VARIABLE_VALUE, (String) d.f52693b);
                        C17474b[] bVarArr = {aVar2.mo49933a()};
                        aVar.getClass();
                        C6677a.m15759j(moovitApplication, analyticsFlowKey, false, bVarArr);
                        moovitAnchoredBannerAdFragment.f37480s.put(str, adView);
                        return;
                    } else {
                        moovitAnchoredBannerAdFragment.mo44735t2();
                        return;
                    }
                }
            case 1:
                TodRidesProvider.C15455a aVar3 = (TodRidesProvider.C15455a) this.f37578c;
                List<TodRide> list = (List) this.f37579d;
                List<TodSubscription> list2 = (List) this.f37580e;
                TodRidesProvider.C15456b bVar = TodRidesProvider.this.f40034c;
                bVar.f40039a = list;
                bVar.f40040b = C13717b.m34254a(list, new C6489b(1));
                bVar.f40041c = list2;
                bVar.f40042d = C13717b.m34254a(list2, new C13660f(3));
                bVar.f40043e = SystemClock.elapsedRealtime();
                TodRidesProvider.m39560a(TodRidesProvider.this, (IOException) null);
                return;
            default:
                TodBookingOrderViewModel todBookingOrderViewModel = (TodBookingOrderViewModel) this.f37578c;
                LocationDescriptor locationDescriptor = (LocationDescriptor) this.f37579d;
                LocationDescriptor locationDescriptor2 = (LocationDescriptor) this.f37580e;
                todBookingOrderViewModel.getClass();
                if (task.isSuccessful()) {
                    failureReason = (FailureReason) task.getResult();
                } else {
                    failureReason = FailureReason.NONE;
                }
                TodBookingDropOffLocationState todBookingDropOffLocationState = new TodBookingDropOffLocationState(locationDescriptor, locationDescriptor2, failureReason);
                todBookingOrderViewModel.f40080l.postValue(Boolean.FALSE);
                todBookingOrderViewModel.f40079k.postValue(todBookingDropOffLocationState);
                return;
        }
    }
}
