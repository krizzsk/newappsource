package p073e7;

import android.content.Context;
import android.content.Intent;
import android.content.UriMatcher;
import android.os.Bundle;
import android.view.View;
import ce0.C21100e;
import com.cubic.umo.p045ad.playback.p046ui.activities.AKBrowserActivity;
import com.cubic.umo.p045ad.playback.p046ui.views.AKWebView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.play.core.appupdate.C14226d;
import com.google.android.play.core.assetpacks.C14333w2;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppApplication;
import com.moovit.app.ads.consent.PrivacyPersonalizedAdsConsentActivity;
import com.moovit.app.carpool.driver.CarpoolDriverProfileActivity;
import com.moovit.app.carpool.fastbooking.CarpoolRideRequestDetailsActivity;
import com.moovit.app.gallery.GalleryActivity;
import com.moovit.app.gcm.popup.rate.C14885b;
import com.moovit.app.gcm.popup.rate.C14888e;
import com.moovit.app.gcm.popup.rate.RateUsCompletePresentationType;
import com.moovit.app.general.aboutandcontact.AboutAndContactActivity;
import com.moovit.app.general.settings.privacy.C14894a;
import com.moovit.app.help.feedback.CategoryType;
import com.moovit.app.help.feedback.FeedbackFormActivity;
import com.moovit.app.help.feedback.FeedbackType;
import com.moovit.app.help.feedback.FeedbackTypeSelectionActivity;
import com.moovit.app.home.dashboard.C14926b;
import com.moovit.app.home.dashboard.C14946k;
import com.moovit.app.home.dashboard.C14988w;
import com.moovit.app.home.dashboard.suggestions.itinerary.LatestItinerarySuggestionFragment;
import com.moovit.app.intro.UserCreationFailureActivity;
import com.moovit.app.intro.getstarted.GetStartedFirstTimeUseActivity;
import com.moovit.app.itinerary.ItineraryStepsBaseActivity;
import com.moovit.app.mot.activation.MotActivationConfirmationActivity;
import com.moovit.app.mot.p417qr.MotQrCodeViewerActivity;
import com.moovit.app.stoparrivals.StopArrivalsActivity;
import com.moovit.app.stopdetail.StopDetailActivity;
import com.moovit.app.suggestedroutes.SuggestedRoutesDelegationSearchLocationCallback;
import com.moovit.app.taxi.TaxiOrder;
import com.moovit.app.taxi.providers.TaxiAppInfo;
import com.moovit.app.taxi.providers.TaxiProvider;
import com.moovit.app.tod.TodRideActivity;
import com.moovit.app.tod.model.TodDaysOfWeek;
import com.moovit.app.tod.pincode.TodAutonomousRidePinCodeDialogFragment;
import com.moovit.app.tod.shuttle.C15536a;
import com.moovit.app.tod.shuttle.booking.TodShuttleBookingConfirmationActivity;
import com.moovit.app.tod.shuttle.booking.subscriptionenroll.TodShuttleBookingSubscriptionEnrollDialogFragment;
import com.moovit.app.tod.shuttle.booking.subscriptionenroll.TodShuttleBookingSubscriptionEnrollState;
import com.moovit.app.tod.shuttle.model.TodSubscriptionEnroll;
import com.moovit.app.tod.shuttle.model.TodSubscriptionProposal;
import com.moovit.app.tod.shuttle.model.TodWeeklySubscriptionEnroll;
import com.moovit.app.useraccount.manager.favorites.LocationFavorite;
import com.moovit.carpool.CarpoolRideRequest;
import com.moovit.commons.utils.AppDeepLink;
import com.moovit.commons.view.pager.ViewPager;
import com.moovit.design.dialog.AlertDialogFragment;
import com.moovit.design.view.DaysOfWeekPickerView;
import com.moovit.design.view.PinCodeView;
import com.moovit.design.view.list.ListItemView;
import com.moovit.gcm.payload.RateUsPayload;
import com.moovit.home.lines.search.SearchLineFragment;
import com.moovit.itinerary.C16080a;
import com.moovit.itinerary.model.leg.CarpoolLeg;
import com.moovit.network.model.ServerId;
import com.moovit.payment.account.PaymentAccountUpdateEmailActivity;
import com.moovit.payment.gateway.C16328a;
import com.moovit.payment.gateway.PaymentGatewayFragment;
import com.moovit.search.SearchLocationActivity;
import com.moovit.transit.LocationDescriptor;
import com.moovit.transit.TransitAgency;
import com.moovit.transit.TransitStop;
import com.moovit.web.WebViewActivity;
import com.tranzmate.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptySet;
import mf0.C24362h;
import p001a0.C0016g;
import p066e0.C4452q0;
import p090g1.C4732a;
import p216q1.C6133b;
import p502fx.C17118c;
import p543hq.C17474b;
import p544hr.C17480a;
import p565io.C17625b;
import p605ki.C18047b;
import p664mu.C18451j;
import p664mu.C18462q;
import p667mx.C18476a;
import p688nu.C18636f;
import p713ov.C18846k;
import p716oy.C18860a;
import p739px.C19039c;
import p775ro.C19297d;
import p775ro.C19305j;
import p778rr.C19323f;
import p782rv.C19356m;
import p799so.C19496a;
import p923xs.C20568d;
import p988j$.time.DayOfWeek;
import z00.C20795a;

/* renamed from: e7.b */
public final /* synthetic */ class C4584b implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f15765b;

    /* renamed from: c */
    public final /* synthetic */ Object f15766c;

    public /* synthetic */ C4584b(Object obj, int i) {
        this.f15765b = i;
        this.f15766c = obj;
    }

    public final void onClick(View view) {
        String str;
        Object obj;
        int i;
        boolean z = false;
        switch (this.f15765b) {
            case 0:
                AKBrowserActivity aKBrowserActivity = (AKBrowserActivity) this.f15766c;
                WeakReference<AKBrowserActivity> weakReference = AKBrowserActivity.f7313G;
                C24362h.m61211f(aKBrowserActivity, "this$0");
                AKWebView aKWebView = aKBrowserActivity.f7320x;
                if (aKWebView != null) {
                    aKWebView.reload();
                    return;
                }
                return;
            case 1:
                C19297d dVar = (C19297d) this.f15766c;
                int i2 = C19297d.f49059N;
                C18047b bVar = dVar.f45307b;
                String str2 = ((C19305j) dVar.f45311c).f49132w;
                int i3 = C17625b.f45308d;
                C24362h.m61211f(bVar, "justrideSDK");
                Bundle bundle = new Bundle();
                bundle.putString("KEY_SDK_INSTANCE_IDENTIFIER", bVar.mo50524c());
                bundle.putString("KEY_TICKET_ID", str2);
                C19496a aVar = new C19496a();
                aVar.setArguments(bundle);
                aVar.show(dVar.getParentFragmentManager(), "ticket_action_fragment");
                return;
            case 2:
                PrivacyPersonalizedAdsConsentActivity privacyPersonalizedAdsConsentActivity = (PrivacyPersonalizedAdsConsentActivity) this.f15766c;
                int i4 = PrivacyPersonalizedAdsConsentActivity.f37502Z;
                privacyPersonalizedAdsConsentActivity.getClass();
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "accept_clicked");
                privacyPersonalizedAdsConsentActivity.mo44545v2(aVar2.mo49933a());
                if (privacyPersonalizedAdsConsentActivity.f37504X && !C14894a.m37560b(privacyPersonalizedAdsConsentActivity).mo45017g()) {
                    privacyPersonalizedAdsConsentActivity.f37505Y = "PRIVACY_AGREED_BY_CTA_CLICK";
                    C14894a.m37560b(privacyPersonalizedAdsConsentActivity).mo45018h();
                }
                C14894a.C14895a a = C14894a.m37560b(privacyPersonalizedAdsConsentActivity).mo45012a();
                a.mo45022d(true);
                a.mo45019a();
                privacyPersonalizedAdsConsentActivity.finish();
                return;
            case 3:
                CarpoolDriverProfileActivity carpoolDriverProfileActivity = (CarpoolDriverProfileActivity) this.f15766c;
                int i5 = CarpoolDriverProfileActivity.f37706n0;
                carpoolDriverProfileActivity.getClass();
                C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar3.mo49939g(AnalyticsAttributeKey.TYPE, "carpool_sms_driver_clicked");
                carpoolDriverProfileActivity.mo44545v2(aVar3.mo49933a());
                ((C17480a) carpoolDriverProfileActivity.getSupportFragmentManager().mo3923A(C17480a.f45011t)).mo49951m2(false);
                return;
            case 4:
                C19323f fVar = (C19323f) this.f15766c;
                CarpoolLeg carpoolLeg = fVar.f49172i;
                AppDeepLink appDeepLink = carpoolLeg.f41979o;
                if (appDeepLink == null) {
                    appDeepLink = carpoolLeg.f41978n;
                }
                if (appDeepLink != null) {
                    C17474b.C17475a aVar4 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar4.mo49939g(AnalyticsAttributeKey.TYPE, "download_app");
                    aVar4.mo49939g(AnalyticsAttributeKey.SOURCE, C16080a.m40960p(fVar.f49172i.f41971g).name());
                    aVar4.mo49938f(AnalyticsAttributeKey.URI, appDeepLink.f40998c);
                    fVar.mo22564R1(aVar4.mo49933a());
                    appDeepLink.mo46946c(view.getContext());
                    return;
                }
                return;
            case 5:
                int i6 = GalleryActivity.f38010Y;
                ((GalleryActivity) this.f15766c).getClass();
                return;
            case 6:
                C14888e eVar = (C14888e) this.f15766c;
                int i7 = C14888e.f38039j;
                eVar.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                eVar.f38040h = true;
                C17474b.C17475a aVar5 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar5.mo49939g(AnalyticsAttributeKey.TYPE, "popup_rate_us_choose_rating_button_type");
                aVar5.mo49935c(AnalyticsAttributeKey.RATING, intValue);
                eVar.mo22564R1(aVar5.mo49933a());
                RateUsCompletePresentationType rateUsCompletePresentationType = (RateUsCompletePresentationType) eVar.f38041i.floorEntry(Integer.valueOf(intValue)).getValue();
                RateUsPayload rateUsPayload = (RateUsPayload) eVar.mo46752K1().getParcelable("payload");
                String str3 = C14885b.f38035i;
                Bundle bundle2 = new Bundle();
                if (rateUsPayload != null) {
                    bundle2.putParcelable("payload", rateUsPayload);
                }
                C21100e.m49373x(rateUsCompletePresentationType, "presentationType");
                bundle2.putParcelable("presentationType", rateUsCompletePresentationType);
                C14885b bVar2 = new C14885b();
                bVar2.setArguments(bundle2);
                bVar2.show(eVar.getFragmentManager(), C14885b.f38035i);
                eVar.dismiss();
                return;
            case 7:
                AboutAndContactActivity aboutAndContactActivity = (AboutAndContactActivity) this.f15766c;
                int i8 = AboutAndContactActivity.f38043U;
                aboutAndContactActivity.startActivity(WebViewActivity.m18168y2(aboutAndContactActivity, aboutAndContactActivity.getString(R.string.cobrand_wondo_privacy_url), aboutAndContactActivity.getString(R.string.privacy_text)));
                return;
            case 8:
                FeedbackFormActivity feedbackFormActivity = (FeedbackFormActivity) this.f15766c;
                int i9 = FeedbackFormActivity.f38102u0;
                feedbackFormActivity.getClass();
                C17474b.C17475a aVar6 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar6.mo49939g(AnalyticsAttributeKey.TYPE, "feedback_form_select_type_clicked");
                feedbackFormActivity.mo44545v2(aVar6.mo49933a());
                CategoryType categoryType = feedbackFormActivity.f38103U;
                FeedbackType feedbackType = feedbackFormActivity.f38104X;
                Intent intent = new Intent(feedbackFormActivity, FeedbackTypeSelectionActivity.class);
                intent.putExtra("category_type", categoryType);
                intent.putExtra("feedback_type", feedbackType);
                feedbackFormActivity.startActivityForResult(intent, 1001);
                return;
            case 9:
                C20568d dVar2 = (C20568d) this.f15766c;
                UriMatcher uriMatcher = C20568d.f52024u;
                dVar2.getClass();
                C17474b.C17475a aVar7 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar7.mo49939g(AnalyticsAttributeKey.TYPE, "send_feedback_clicked");
                dVar2.mo46797j2(aVar7.mo49933a());
                Context requireContext = dVar2.requireContext();
                StringBuilder k = C13555b.m33972k("HC-");
                k.append(dVar2.f52025n);
                dVar2.startActivity(FeedbackFormActivity.m37597y2(requireContext, k.toString()));
                return;
            case 10:
                C14926b bVar3 = (C14926b) this.f15766c;
                C14926b.C14927a aVar8 = C14926b.f38185s;
                bVar3.getClass();
                CarpoolRideRequest carpoolRideRequest = (CarpoolRideRequest) view.getTag();
                Context context = view.getContext();
                int i11 = CarpoolRideRequestDetailsActivity.f37749m0;
                Intent intent2 = new Intent(context, CarpoolRideRequestDetailsActivity.class);
                C21100e.m49373x(carpoolRideRequest, "rideRequest");
                intent2.putExtra("ride_request", carpoolRideRequest);
                bVar3.startActivity(intent2);
                return;
            case 11:
                C14946k kVar = (C14946k) this.f15766c;
                int i12 = C14946k.f38246t;
                kVar.getClass();
                LocationFavorite locationFavorite = (LocationFavorite) view.getTag();
                if (LocationDescriptor.LocationType.STOP.equals(((LocationDescriptor) locationFavorite.f52687b).f23647b)) {
                    LocationDescriptor locationDescriptor = (LocationDescriptor) locationFavorite.f52687b;
                    C17474b.C17475a aVar9 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar9.mo49939g(AnalyticsAttributeKey.TYPE, "location_stop_view");
                    aVar9.mo49945m(AnalyticsAttributeKey.SELECTED_CAPTION, locationDescriptor.mo24313f());
                    aVar9.mo49939g(AnalyticsAttributeKey.SELECTED_TYPE, C0016g.m13C(locationDescriptor.f23647b));
                    aVar9.mo49943k(AnalyticsAttributeKey.SELECTED_ID, locationDescriptor.f23649d);
                    kVar.mo46797j2(aVar9.mo49933a());
                    kVar.startActivity(StopDetailActivity.m39207B2(kVar.requireContext(), locationDescriptor.f23649d, (ServerId) null, (TransitStop) null, (List) null));
                    return;
                }
                return;
            case 12:
                C14988w wVar = (C14988w) this.f15766c;
                int i13 = C14988w.f38360o;
                wVar.getClass();
                Context context2 = view.getContext();
                TaxiProvider taxiProvider = (TaxiProvider) view.getTag();
                if (taxiProvider != null) {
                    TaxiAppInfo taxiAppInfo = taxiProvider.f39976k;
                    C17474b.C17475a aVar10 = new C17474b.C17475a(AnalyticsEventKey.TAXI_CLICKED);
                    aVar10.mo49939g(AnalyticsAttributeKey.PROVIDER, taxiProvider.f39968c);
                    aVar10.mo49941i(AnalyticsAttributeKey.TAXI_APP_INSTALLED, taxiAppInfo.mo46103c(context2));
                    wVar.mo46797j2(aVar10.mo49933a());
                    taxiAppInfo.mo46102b().mo52438b(wVar.f40822c, taxiProvider, new TaxiOrder(TaxiOrder.Source.DASHBOARD, LocationDescriptor.m17772m(context2), (LocationDescriptor) null, (Map<String, String>) null), (String) null);
                    return;
                }
                return;
            case 13:
                LatestItinerarySuggestionFragment latestItinerarySuggestionFragment = (LatestItinerarySuggestionFragment) this.f15766c;
                int i14 = LatestItinerarySuggestionFragment.f38329t;
                C24362h.m61211f(latestItinerarySuggestionFragment, "this$0");
                latestItinerarySuggestionFragment.f40822c.mo44535p2(latestItinerarySuggestionFragment.getText(R.string.smart_component_recently_viewed_trip_title), latestItinerarySuggestionFragment.getText(R.string.smart_component_recently_viewed_trip_description));
                C17474b.C17475a aVar11 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar11.mo49939g(AnalyticsAttributeKey.TYPE, "more_info_clicked");
                aVar11.mo49939g(AnalyticsAttributeKey.SOURCE, "suggestion_latest_route");
                latestItinerarySuggestionFragment.mo46797j2(aVar11.mo49933a());
                return;
            case 14:
                SearchLineFragment searchLineFragment = (SearchLineFragment) this.f15766c;
                C17474b.C17475a aVar12 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar12.mo49939g(AnalyticsAttributeKey.TYPE, "location_search_clicked");
                aVar12.mo49939g(AnalyticsAttributeKey.TRANSIT_TYPE, C0016g.m15E(searchLineFragment.f41628r));
                AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.AGENCY_NAME;
                TransitAgency transitAgency = searchLineFragment.f41629s;
                if (transitAgency != null) {
                    str = transitAgency.f23673c;
                } else {
                    str = "All";
                }
                aVar12.mo49939g(analyticsAttributeKey, str);
                aVar12.mo49939g(AnalyticsAttributeKey.QUERY_STRING, searchLineFragment.f41630t);
                searchLineFragment.mo46797j2(aVar12.mo49933a());
                if (searchLineFragment.f40824e) {
                    Context context3 = view.getContext();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(C14226d.m35335A0(context3));
                    arrayList.add(SearchLocationActivity.m17347y2(context3, new SuggestedRoutesDelegationSearchLocationCallback(), "search_line", searchLineFragment.f41630t));
                    if (!arrayList.isEmpty()) {
                        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                        if (!C4732a.startActivities(context3, intentArr, (Bundle) null)) {
                            Intent intent3 = new Intent(intentArr[intentArr.length - 1]);
                            intent3.addFlags(268435456);
                            context3.startActivity(intent3);
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
                }
                return;
            case 15:
                UserCreationFailureActivity userCreationFailureActivity = (UserCreationFailureActivity) this.f15766c;
                int i15 = UserCreationFailureActivity.f38450X;
                userCreationFailureActivity.getClass();
                userCreationFailureActivity.mo44545v2(new C17474b(AnalyticsEventKey.USER_CREATION_RETRY_CLICKED));
                MoovitAppApplication x = MoovitAppApplication.m37038x();
                Intent y2 = userCreationFailureActivity.mo45252y2();
                x.f37321e.mo50689b("USER_CONTEXT");
                x.mo44574v(userCreationFailureActivity, y2);
                return;
            case 16:
                GetStartedFirstTimeUseActivity getStartedFirstTimeUseActivity = (GetStartedFirstTimeUseActivity) this.f15766c;
                int i16 = GetStartedFirstTimeUseActivity.f38453p0;
                getStartedFirstTimeUseActivity.getClass();
                C17474b.C17475a aVar13 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                AnalyticsAttributeKey analyticsAttributeKey2 = AnalyticsAttributeKey.TYPE;
                aVar13.mo49939g(analyticsAttributeKey2, "get_started_clicked");
                getStartedFirstTimeUseActivity.mo44545v2(aVar13.mo49933a());
                C14894a.m37560b(getStartedFirstTimeUseActivity).mo45018h();
                if (C18860a.m45884a().f48021i) {
                    C17474b.C17475a aVar14 = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
                    aVar14.mo49939g(analyticsAttributeKey2, "appsflyer_consent");
                    getStartedFirstTimeUseActivity.mo44545v2(aVar14.mo49933a());
                    AlertDialogFragment.C15856a h = new AlertDialogFragment.C15856a((Context) getStartedFirstTimeUseActivity).mo47682k("apps_flyer_data_sharing_consent").mo47683l(R.string.appsflyer_data_sharing_title).mo47679h(C6133b.m14694a(getStartedFirstTimeUseActivity.getString(R.string.appsflyer_data_sharing_message, new Object[]{getStartedFirstTimeUseActivity.getString(R.string.appsflyer_data_sharing_privacy_link), getStartedFirstTimeUseActivity.getString(R.string.appsflyer_data_sharing_cookie_link)})));
                    h.f41328b.putBoolean("isMessageLinkify", true);
                    getStartedFirstTimeUseActivity.mo44530n2(h.mo47681j(R.string.appsflyer_data_sharing_accept).mo47680i(R.string.appsflyer_data_sharing_refuse).mo47673b());
                    return;
                }
                getStartedFirstTimeUseActivity.mo45254F2();
                return;
            case 17:
                ViewPager viewPager = ((ItineraryStepsBaseActivity) this.f15766c).f38502l0;
                viewPager.mo47356e(Math.min(viewPager.getCurrentLogicalItem() + 1, viewPager.getPageCount()), true);
                return;
            case 18:
                C18451j jVar = (C18451j) this.f15766c;
                int i17 = C18451j.f47036q;
                jVar.getClass();
                C17474b.C17475a aVar15 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar15.mo49939g(AnalyticsAttributeKey.TYPE, "mot_buy_ticket_clicked");
                jVar.mo46797j2(aVar15.mo49933a());
                C18462q.m45321a(jVar.f40822c);
                return;
            case 19:
                MotActivationConfirmationActivity motActivationConfirmationActivity = (MotActivationConfirmationActivity) this.f15766c;
                int i18 = MotActivationConfirmationActivity.f38971Y;
                motActivationConfirmationActivity.getClass();
                C17474b.C17475a aVar16 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar16.mo49939g(AnalyticsAttributeKey.TYPE, "mot_activation_confirmation_show_qr_clicked");
                aVar16.mo49937e(AnalyticsAttributeKey.ID, motActivationConfirmationActivity.f38973X.f38985b);
                aVar16.mo49935c(AnalyticsAttributeKey.COUNT, motActivationConfirmationActivity.f38972U.size());
                motActivationConfirmationActivity.mo44545v2(aVar16.mo49933a());
                motActivationConfirmationActivity.startActivity(MotQrCodeViewerActivity.m38705y2(motActivationConfirmationActivity, (ServerId) null, motActivationConfirmationActivity.f38973X.f38989f));
                return;
            case 20:
                C18636f fVar2 = C18636f.this;
                if (fVar2.f40824e) {
                    int i19 = C18636f.f47492s;
                    fVar2.mo51018m2();
                    return;
                }
                return;
            case 21:
                int i21 = C18846k.f47987o;
                ((C18846k) this.f15766c).mo51317q2();
                return;
            case 22:
                int i22 = C19356m.f49247B;
                ((C19356m) this.f15766c).mo51765s2();
                return;
            case 23:
                StopArrivalsActivity.C15316a aVar17 = (StopArrivalsActivity.C15316a) this.f15766c;
                C24362h.m61211f(aVar17, "this$0");
                aVar17.mo45869m();
                return;
            case 24:
                TodAutonomousRidePinCodeDialogFragment todAutonomousRidePinCodeDialogFragment = (TodAutonomousRidePinCodeDialogFragment) this.f15766c;
                int i23 = TodAutonomousRidePinCodeDialogFragment.f40368m;
                C24362h.m61211f(todAutonomousRidePinCodeDialogFragment, "this$0");
                String str4 = (String) todAutonomousRidePinCodeDialogFragment.mo46414S1().f45426b.mo4292b("actionId");
                if (str4 != null) {
                    PinCodeView pinCodeView = todAutonomousRidePinCodeDialogFragment.f40372k;
                    if (pinCodeView != null) {
                        String pinCode = pinCodeView.getPinCode();
                        C24362h.m61210e(pinCode, "pinCodeView.pinCode");
                        if (pinCode.length() > 0) {
                            z = true;
                        }
                        if (z) {
                            TodRideActivity todRideActivity = (TodRideActivity) todAutonomousRidePinCodeDialogFragment.f40792c;
                            todRideActivity.getClass();
                            todRideActivity.mo46177D2(new C14333w2(3, (Object) null, new C17118c(pinCode)), str4);
                        }
                    } else {
                        C24362h.m61217l("pinCodeView");
                        throw null;
                    }
                }
                todAutonomousRidePinCodeDialogFragment.dismissAllowingStateLoss();
                return;
            case 25:
                TodShuttleBookingSubscriptionEnrollDialogFragment todShuttleBookingSubscriptionEnrollDialogFragment = (TodShuttleBookingSubscriptionEnrollDialogFragment) this.f15766c;
                int i24 = TodShuttleBookingSubscriptionEnrollDialogFragment.f40407n;
                C24362h.m61211f(todShuttleBookingSubscriptionEnrollDialogFragment, "this$0");
                TodShuttleBookingSubscriptionEnrollState value = ((C18476a) todShuttleBookingSubscriptionEnrollDialogFragment.f40408h.getValue()).f47079b.getValue();
                if (value != null) {
                    TodSubscriptionEnroll todSubscriptionEnroll = value.f40416d;
                    if (todSubscriptionEnroll instanceof TodWeeklySubscriptionEnroll) {
                        obj = ((TodWeeklySubscriptionEnroll) todSubscriptionEnroll).f40443d.f40238b;
                    } else {
                        obj = EmptySet.f60175b;
                    }
                    DaysOfWeekPickerView daysOfWeekPickerView = todShuttleBookingSubscriptionEnrollDialogFragment.f40413m;
                    if (daysOfWeekPickerView != null) {
                        Set<DayOfWeek> selectedDays = daysOfWeekPickerView.getSelectedDays();
                        if (!C24362h.m61206a(obj, selectedDays)) {
                            TodSubscriptionProposal todSubscriptionProposal = value.f40415c.f40440d.f40441b;
                            if (todSubscriptionProposal != null) {
                                TodWeeklySubscriptionEnroll todWeeklySubscriptionEnroll = new TodWeeklySubscriptionEnroll(todSubscriptionProposal.getId(), new TodDaysOfWeek(selectedDays));
                                C17474b.C17475a aVar18 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                                aVar18.mo49939g(AnalyticsAttributeKey.TYPE, "tod_shuttle_recurring_set_submit");
                                aVar18.mo49938f(AnalyticsAttributeKey.SELECTED_DAYS, C15536a.m39718a(todWeeklySubscriptionEnroll));
                                todShuttleBookingSubscriptionEnrollDialogFragment.mo22564R1(aVar18.mo49933a());
                                TodShuttleBookingConfirmationActivity todShuttleBookingConfirmationActivity = (TodShuttleBookingConfirmationActivity) todShuttleBookingSubscriptionEnrollDialogFragment.f40792c;
                                todShuttleBookingConfirmationActivity.f40388q0 = todWeeklySubscriptionEnroll;
                                todShuttleBookingConfirmationActivity.f40385n0.setSubtitle((CharSequence) C15536a.m39720c(todShuttleBookingConfirmationActivity, todWeeklySubscriptionEnroll));
                                ListItemView listItemView = todShuttleBookingConfirmationActivity.f40385n0;
                                List<Integer> a2 = C15536a.m39718a(todWeeklySubscriptionEnroll);
                                if (a2 != null) {
                                    z = !a2.isEmpty();
                                }
                                if (z) {
                                    i = R.string.action_change;
                                } else {
                                    i = R.string.action_set;
                                }
                                listItemView.setAccessoryText(i);
                            } else {
                                return;
                            }
                        }
                        todShuttleBookingSubscriptionEnrollDialogFragment.dismissAllowingStateLoss();
                        return;
                    }
                    C24362h.m61217l("daysOfWeekPickerView");
                    throw null;
                }
                return;
            case 26:
                C19039c cVar = (C19039c) this.f15766c;
                FloatingActionButton floatingActionButton = cVar.f48418j;
                floatingActionButton.setActivated(!floatingActionButton.isActivated());
                cVar.mo51497T1();
                return;
            case 27:
                ((C20795a) this.f15766c).getClass();
                return;
            case 28:
                int i25 = PaymentAccountUpdateEmailActivity.f63839o0;
                ((PaymentAccountUpdateEmailActivity) this.f15766c).mo83333y2();
                return;
            default:
                C16328a aVar19 = (C16328a) this.f15766c;
                int i26 = C16328a.f42681h;
                aVar19.getClass();
                aVar19.mo46753L1(PaymentGatewayFragment.class, new C4452q0(14));
                aVar19.dismissAllowingStateLoss();
                return;
        }
    }
}
