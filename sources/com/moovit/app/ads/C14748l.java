package com.moovit.app.ads;

import a00.C13382a;
import android.app.Application;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.moovit.app.ads.consent.AdjustAdsPreferencesActivity;
import com.moovit.app.ads.consent.PrivacyPersonalizedAdsConsentActivity;
import com.moovit.app.help.feedback.FeedbackFormActivity;
import com.moovit.app.help.feedback.FeedbackTypeSelectionActivity;
import com.moovit.app.help.helpcenter.HelpCenterActivity;
import com.moovit.app.home.dashboard.FavoriteLocationEditorActivity;
import com.moovit.app.intro.getstarted.GetStartedFirstTimeUseActivity;
import com.moovit.app.intro.onboarding.OnboardingActivity;
import com.moovit.app.intro.onboarding.OnboardingLoginActivity;
import com.moovit.app.intro.onboarding.UserOnboardingActivity;
import com.moovit.app.mot.activation.MotActivationConfirmationActivity;
import com.moovit.app.mot.activation.MotActivationDetailsActivity;
import com.moovit.app.mot.p417qr.MotQrCodeViewerActivity;
import com.moovit.app.mot.purchase.MotQrCodeActivationActivity;
import com.moovit.app.mot.purchase.MotQrCodeScanActivity;
import com.moovit.app.mot.purchase.MotStationEntranceActivationActivity;
import com.moovit.app.mot.purchase.MotStationEntranceOnlyActivationActivity;
import com.moovit.app.mot.purchase.MotStationExitActivationActivity;
import com.moovit.app.mot.welcome.MotAccountCreationWelcomeActivity;
import com.moovit.app.tod.order.TodOrderActivity;
import com.moovit.app.tod.shuttle.booking.TodShuttleBookingActivity;
import com.moovit.app.tod.shuttle.booking.TodShuttleBookingConfirmationActivity;
import com.moovit.app.useraccount.campaigns.onboarding.OnBoardingCampaignActivity;
import com.moovit.home.lines.search.SearchLineActivity;
import com.moovit.home.lines.search.SearchLinePagerActivity;
import com.moovit.micromobility.purchase.MicroMobilityPurchaseActivity;
import com.moovit.payment.registration.PaymentRegistrationActivity;
import com.moovit.search.SearchLocationActivity;
import com.moovit.ticketing.purchase.PurchaseTicketActivity;
import com.moovit.ticketing.purchase.cart.PurchaseCartConfirmationActivity;
import com.moovit.ticketing.purchase.extrainfo.split.PurchaseSplitActivity;
import com.moovit.ticketing.purchase.fare.PurchaseTicketConfirmedActivity;
import com.moovit.ticketing.purchase.fare.PurchaseTicketsConfirmedActivity;
import com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueConfirmedActivity;
import com.moovit.ticketing.ticket.TicketDetailsActivity;
import com.moovit.ticketing.validation.TicketValidationActivity;
import com.moovit.web.WebViewActivity;
import java.util.Arrays;
import java.util.HashSet;
import p862vf.C20118b;
import p977zz.C20944i0;

/* renamed from: com.moovit.app.ads.l */
public final class C14748l {

    /* renamed from: a */
    public static final HashSet f37536a = new HashSet(Arrays.asList(new Class[]{GetStartedFirstTimeUseActivity.class, OnboardingActivity.class, OnboardingLoginActivity.class, OnBoardingCampaignActivity.class, UserOnboardingActivity.class, PrivacyPersonalizedAdsConsentActivity.class, AdjustAdsPreferencesActivity.class, PaymentRegistrationActivity.class, MotAccountCreationWelcomeActivity.class, MotQrCodeActivationActivity.class, MotStationEntranceOnlyActivationActivity.class, MotStationEntranceActivationActivity.class, MotStationExitActivationActivity.class, MotActivationConfirmationActivity.class, MotActivationDetailsActivity.class, MotQrCodeScanActivity.class, MotQrCodeViewerActivity.class, FavoriteLocationEditorActivity.class, TodOrderActivity.class, TodShuttleBookingActivity.class, TodShuttleBookingConfirmationActivity.class, PurchaseCartConfirmationActivity.class, PurchaseStoredValueConfirmedActivity.class, PurchaseTicketActivity.class, PurchaseSplitActivity.class, PurchaseTicketsConfirmedActivity.class, PurchaseTicketConfirmedActivity.class, TicketValidationActivity.class, TicketDetailsActivity.class, FeedbackFormActivity.class, FeedbackTypeSelectionActivity.class, WebViewActivity.class, SearchLocationActivity.class, SearchLineActivity.class, SearchLinePagerActivity.class, HelpCenterActivity.class, MicroMobilityPurchaseActivity.class}));

    /* renamed from: a */
    public static C20944i0<String, String> m37128a() {
        C20118b e = C20118b.m47697e();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            if (sb.length() > 0) {
                sb.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            }
            sb.append(e.mo52358f("ads_experiment_name_" + i));
            if (sb2.length() > 0) {
                sb2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            }
            sb2.append(e.mo52358f("ads_experiment_value_" + i));
        }
        return new C20944i0<>(sb.toString(), sb2.toString());
    }

    /* renamed from: b */
    public static boolean m37129b(Application application, AdSource adSource) {
        if (adSource.accessibilitySupported) {
            return true;
        }
        if (!C13382a.m33671g(application) || application.getResources().getConfiguration().fontScale >= 1.6f) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0061 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0063 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003a  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m37130c(com.moovit.app.ads.AdSource r5, long r6) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = r5.adUnitIdKey
            java.lang.String r1 = "_user_age"
            java.lang.String r5 = p001a0.C0016g.m31o(r0, r5, r1)
            vf.b r0 = p862vf.C20118b.m47697e()
            wf.g r0 = r0.f51045g
            wf.c r1 = r0.f51484c
            wf.d r1 = p886wf.C20302g.m47870b(r1)
            r2 = 0
            if (r1 != 0) goto L_0x001d
            goto L_0x0029
        L_0x001d:
            org.json.JSONObject r1 = r1.f51470b     // Catch:{ JSONException -> 0x0028 }
            long r3 = r1.getLong(r5)     // Catch:{ JSONException -> 0x0028 }
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch:{ JSONException -> 0x0028 }
            goto L_0x002a
        L_0x0028:
        L_0x0029:
            r1 = r2
        L_0x002a:
            if (r1 == 0) goto L_0x003a
            wf.c r2 = r0.f51484c
            wf.d r2 = p886wf.C20302g.m47870b(r2)
            r0.mo52469a(r2, r5)
            long r0 = r1.longValue()
            goto L_0x005d
        L_0x003a:
            wf.c r0 = r0.f51485d
            wf.d r0 = p886wf.C20302g.m47870b(r0)
            if (r0 != 0) goto L_0x0043
            goto L_0x004f
        L_0x0043:
            org.json.JSONObject r0 = r0.f51470b     // Catch:{ JSONException -> 0x004e }
            long r0 = r0.getLong(r5)     // Catch:{ JSONException -> 0x004e }
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch:{ JSONException -> 0x004e }
            goto L_0x004f
        L_0x004e:
        L_0x004f:
            if (r2 == 0) goto L_0x0056
            long r0 = r2.longValue()
            goto L_0x005d
        L_0x0056:
            java.lang.String r0 = "Long"
            p886wf.C20302g.m47873f(r5, r0)
            r0 = 0
        L_0x005d:
            int r5 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r5 < 0) goto L_0x0063
            r5 = 1
            goto L_0x0064
        L_0x0063:
            r5 = 0
        L_0x0064:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.ads.C14748l.m37130c(com.moovit.app.ads.AdSource, long):boolean");
    }
}
