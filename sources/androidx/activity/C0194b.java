package androidx.activity;

import androidx.camera.core.C0609k;
import androidx.camera.core.C0627p;
import androidx.core.widget.ContentLoadingProgressBar;
import com.google.android.exoplayer2.p052ui.C4060z;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.ads.consent.PrivacyPersonalizedAdsConsentActivity;
import com.moovit.app.general.settings.privacy.C14894a;
import com.moovit.app.tod.bottomsheet.stateviews.TodActiveRideRemoteScreenView;
import com.moovit.web.WebViewActivity;
import com.tranzmate.R;
import java.util.Map;
import p030bo.app.C1566e3;
import p100gb.C5001x;
import p242s1.C6333d0;
import p543hq.C17474b;
import p687nt.C18595e;
import p738pw.C19036d;
import p950yw.C20774b;

/* renamed from: androidx.activity.b */
public final /* synthetic */ class C0194b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f512b;

    /* renamed from: c */
    public final /* synthetic */ Object f513c;

    public /* synthetic */ C0194b(Object obj, int i) {
        this.f512b = i;
        this.f513c = obj;
    }

    public final void run() {
        switch (this.f512b) {
            case 0:
                ((ComponentActivity) this.f513c).invalidateMenu();
                return;
            case 1:
                C0609k kVar = (C0609k) this.f513c;
                synchronized (kVar.f2103w) {
                    kVar.f2105y = null;
                    C0627p pVar = kVar.f2104x;
                    if (pVar != null) {
                        kVar.f2104x = null;
                        kVar.mo2541f(pVar);
                    }
                }
                return;
            case 3:
                ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) this.f513c;
                contentLoadingProgressBar.f3354b = -1;
                contentLoadingProgressBar.f3357e = false;
                contentLoadingProgressBar.removeCallbacks(contentLoadingProgressBar.f3358f);
                contentLoadingProgressBar.f3355c = false;
                if (!contentLoadingProgressBar.f3356d) {
                    contentLoadingProgressBar.postDelayed(contentLoadingProgressBar.f3359g, 500);
                    contentLoadingProgressBar.f3356d = true;
                    return;
                }
                return;
            case 4:
                ((C1566e3) this.f513c).m4137b();
                return;
            case 5:
                Map<String, String> map = C5001x.f16891N;
                ((C5001x) this.f513c).mo20714x();
                return;
            case 6:
                ((C4060z) this.f513c).f14533n.start();
                return;
            case 7:
                PrivacyPersonalizedAdsConsentActivity privacyPersonalizedAdsConsentActivity = (PrivacyPersonalizedAdsConsentActivity) this.f513c;
                int i = PrivacyPersonalizedAdsConsentActivity.f37502Z;
                if (privacyPersonalizedAdsConsentActivity.f37311x) {
                    C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar.mo49939g(AnalyticsAttributeKey.TYPE, "privacy_policy_clicked");
                    privacyPersonalizedAdsConsentActivity.mo44545v2(aVar.mo49933a());
                    if (privacyPersonalizedAdsConsentActivity.mo44741y2()) {
                        privacyPersonalizedAdsConsentActivity.f37505Y = "PRIVACY_AGREED_BY_LEARN_MORE";
                        C14894a.m37560b(privacyPersonalizedAdsConsentActivity).mo45018h();
                    }
                    privacyPersonalizedAdsConsentActivity.startActivity(WebViewActivity.m18168y2(privacyPersonalizedAdsConsentActivity, privacyPersonalizedAdsConsentActivity.getString(R.string.privacy_url), privacyPersonalizedAdsConsentActivity.getString(R.string.privacy_text)));
                    return;
                }
                return;
            case 8:
                ((C18595e) this.f513c).f47357h.setVisibility(8);
                return;
            case 9:
                ((C19036d) this.f513c).dismissAllowingStateLoss();
                return;
            case 10:
                C20774b bVar = (C20774b) this.f513c;
                bVar.f52417b.setVisibility(0);
                C6333d0.m15013a(bVar.f52417b).mo22499i(BitmapDescriptorFactory.HUE_RED);
                return;
            default:
                TodActiveRideRemoteScreenView todActiveRideRemoteScreenView = (TodActiveRideRemoteScreenView) this.f513c;
                if (todActiveRideRemoteScreenView.f40127N.getTag() != null) {
                    todActiveRideRemoteScreenView.mo3461g(130);
                    return;
                }
                return;
        }
    }
}
