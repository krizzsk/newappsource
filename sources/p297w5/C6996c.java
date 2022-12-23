package p297w5;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.appboy.p044ui.inappmessage.views.AppboyInAppMessageModalView;
import com.cubic.umo.p045ad.playback.p046ui.activities.AKBrowserActivity;
import com.cubic.umo.p045ad.playback.p046ui.views.AKWebView;
import com.facebook.login.DeviceAuthDialog;
import com.google.android.play.core.appupdate.C14226d;
import com.masabi.justride.sdk.p415ui.features.ticket_info.TicketInfoActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.ads.consent.AdjustAdsPreferencesActivity;
import com.moovit.app.carpool.CarpoolTripPlanActivity;
import com.moovit.app.carpool.driver.CarpoolDriverProfileActivity;
import com.moovit.app.gcm.popup.rate.C14888e;
import com.moovit.app.general.aboutandcontact.AboutAndContactActivity;
import com.moovit.app.general.settings.privacy.C14894a;
import com.moovit.app.home.dashboard.C14946k;
import com.moovit.app.intro.UserCreationFailureActivity;
import com.moovit.app.intro.onboarding.UserOnboardingActivity;
import com.moovit.app.itinerary.ItineraryStepsBaseActivity;
import com.moovit.app.linedetail.p416ui.C15101a;
import com.moovit.app.linedetail.p416ui.LineDetailActivity;
import com.moovit.app.linedetail.p416ui.LineTripPatternActivity;
import com.moovit.app.mot.activation.MotActivationConfirmationActivity;
import com.moovit.app.mot.purchase.MotStationActivationAbstractActivity;
import com.moovit.app.realtimehelp.RealTimeHelpActivity;
import com.moovit.app.ridesharing.AllEventsActivity;
import com.moovit.app.ridesharing.C15246b;
import com.moovit.app.ridesharing.EventDetailActivity;
import com.moovit.app.ridesharing.booking.EventBookingActivity;
import com.moovit.app.ridesharing.booking.EventBookingParams;
import com.moovit.app.ridesharing.registration.RideSharingRegistrationInfo;
import com.moovit.app.servicealerts.ServiceAlertDetailsActivity;
import com.moovit.app.stopdetail.StopDetailActivity;
import com.moovit.app.suggestedroutes.SuggestRoutesActivity;
import com.moovit.app.suggestedroutes.SuggestedRoutesDelegationSearchLocationCallback;
import com.moovit.app.useraccount.manager.favorites.LocationFavorite;
import com.moovit.commons.view.pager.ViewPager;
import com.moovit.home.lines.search.SearchLineFragment;
import com.moovit.network.model.ServerId;
import com.moovit.payment.registration.PaymentRegistrationActivity;
import com.moovit.payment.registration.PaymentRegistrationType;
import com.moovit.request.RequestOptions;
import com.moovit.ridesharing.model.Event;
import com.moovit.ridesharing.model.EventInstance;
import com.moovit.ridesharing.model.EventRequest;
import com.moovit.ridesharing.model.RideSharingRegistrationSteps;
import com.moovit.search.SearchLocationActivity;
import com.moovit.servicealerts.ServiceAlert;
import com.moovit.servicealerts.ServiceStatusCategory;
import com.moovit.suggestedroutes.TripPlanParams;
import com.moovit.transit.LocationDescriptor;
import com.moovit.transit.TransitAgency;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitStop;
import com.moovit.transit.TransitType;
import com.moovit.util.time.Time;
import com.moovit.view.dialogs.DropDownListPopup;
import com.moovit.web.WebViewActivity;
import com.tranzmate.R;
import com.usebutton.sdk.internal.widget.FullScreenWidgetActivity;
import j80.C12775d;
import ja0.C12797f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import mf0.C24362h;
import p001a0.C0016g;
import p090g1.C4732a;
import p398bv.C13691a;
import p398bv.C13692b;
import p399bw.C13697b;
import p455dy.C16753e;
import p524gv.C17237d;
import p543hq.C17474b;
import p544hr.C17480a;
import p565io.C17624a;
import p589jq.C17910b;
import p605ki.C18047b;
import p605ki.C18057k;
import p661mr.C18427d;
import p664mu.C18451j;
import p687nt.C18591c;
import p687nt.C18604l;
import p687nt.C18618p;
import p775ro.C19297d;
import p775ro.C19305j;
import p778rr.C19321e;
import p782rv.C19337d;
import p782rv.C19356m;
import p823to.C19718a;
import p828tt.C19768i;
import p923xs.C20582l;
import p926xv.C20630k;
import p952yy.C20787c;
import p977zz.C20927a0;
import p977zz.C20964s0;
import x00.C20440a;
import z90.C13350h;
import z90.C13352j;

/* renamed from: w5.c */
public final /* synthetic */ class C6996c implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f21771b;

    /* renamed from: c */
    public final /* synthetic */ Object f21772c;

    public /* synthetic */ C6996c(Object obj, int i) {
        this.f21771b = i;
        this.f21772c = obj;
    }

    public final void onClick(View view) {
        AKWebView aKWebView;
        String str;
        List list;
        ServiceStatusCategory serviceStatusCategory;
        TransitType transitType;
        Time time;
        String str2;
        ServiceStatusCategory serviceStatusCategory2;
        boolean z = true;
        String str3 = null;
        boolean z2 = false;
        switch (this.f21771b) {
            case 0:
                ((AppboyInAppMessageModalView) this.f21772c).lambda$resetMessageMargins$0(view);
                return;
            case 1:
                AKBrowserActivity aKBrowserActivity = (AKBrowserActivity) this.f21772c;
                WeakReference<AKBrowserActivity> weakReference = AKBrowserActivity.f7313G;
                C24362h.m61211f(aKBrowserActivity, "this$0");
                AKWebView aKWebView2 = aKBrowserActivity.f7320x;
                if (aKWebView2 == null || !aKWebView2.canGoForward()) {
                    z = false;
                }
                if (z && (aKWebView = aKBrowserActivity.f7320x) != null) {
                    aKWebView.goForward();
                    return;
                }
                return;
            case 2:
                DeviceAuthDialog deviceAuthDialog = (DeviceAuthDialog) this.f21772c;
                int i = DeviceAuthDialog.f8757m;
                C24362h.m61211f(deviceAuthDialog, "this$0");
                deviceAuthDialog.mo12620L1();
                return;
            case 3:
                C19297d dVar = (C19297d) this.f21772c;
                int i2 = C19297d.f49059N;
                C18047b bVar = dVar.f45307b;
                Context context = dVar.getContext();
                String str4 = ((C19305j) dVar.f45311c).f49132w;
                int i3 = TicketInfoActivity.f37205y;
                Bundle H1 = C17624a.m43768H1(bVar);
                H1.putString("KEY_TICKET_ID", str4);
                H1.putBoolean("KEY_TICKET_INFO_TAB_ACTIVE", true);
                Intent intent = new Intent(context, TicketInfoActivity.class);
                intent.putExtras(H1);
                context.startActivity(intent);
                dVar.getActivity().overridePendingTransition(C18057k.animate_sub_navigation_enter_in, C18057k.animate_sub_navigation_static);
                return;
            case 4:
                C19718a aVar = (C19718a) this.f21772c;
                int i4 = C19718a.f50136n;
                Fragment targetFragment = aVar.getTargetFragment();
                if (targetFragment != null) {
                    targetFragment.onActivityResult(aVar.getTargetRequestCode(), 0, (Intent) null);
                }
                aVar.dismiss();
                return;
            case 5:
                AdjustAdsPreferencesActivity adjustAdsPreferencesActivity = (AdjustAdsPreferencesActivity) this.f21772c;
                int i5 = AdjustAdsPreferencesActivity.f37501U;
                adjustAdsPreferencesActivity.getClass();
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "reject_clicked");
                adjustAdsPreferencesActivity.mo44545v2(aVar2.mo49933a());
                C14894a.C14895a a = C14894a.m37560b(adjustAdsPreferencesActivity).mo45012a();
                a.mo45022d(false);
                a.mo45019a();
                adjustAdsPreferencesActivity.finish();
                return;
            case 6:
                CarpoolTripPlanActivity carpoolTripPlanActivity = (CarpoolTripPlanActivity) this.f21772c;
                C17910b bVar2 = CarpoolTripPlanActivity.f37678q0;
                carpoolTripPlanActivity.getClass();
                C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar3.mo49939g(AnalyticsAttributeKey.TYPE, "share_with_driver_clicked");
                carpoolTripPlanActivity.mo44545v2(aVar3.mo49933a());
                new C18427d().show(carpoolTripPlanActivity.getSupportFragmentManager(), "share_referral_dialog");
                return;
            case 7:
                CarpoolDriverProfileActivity carpoolDriverProfileActivity = (CarpoolDriverProfileActivity) this.f21772c;
                int i6 = CarpoolDriverProfileActivity.f37706n0;
                carpoolDriverProfileActivity.getClass();
                C17474b.C17475a aVar4 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar4.mo49939g(AnalyticsAttributeKey.TYPE, "carpool_call_driver_clicked");
                carpoolDriverProfileActivity.mo44545v2(aVar4.mo49933a());
                C17480a aVar5 = (C17480a) carpoolDriverProfileActivity.getSupportFragmentManager().mo3923A(C17480a.f45011t);
                String str5 = aVar5.f45014p.f40878e;
                if (str5 != null) {
                    C20927a0.m49017l(aVar5.requireContext(), C20927a0.m49011f(str5));
                    return;
                }
                return;
            case 8:
                C19321e eVar = (C19321e) this.f21772c;
                int i7 = C19321e.f49168j;
                eVar.getClass();
                C17474b.C17475a aVar6 = new C17474b.C17475a(AnalyticsEventKey.CARPOOL_DRIVER_SHOW_REPORT);
                aVar6.mo49941i(AnalyticsAttributeKey.TYPE, false);
                eVar.mo22564R1(aVar6.mo49933a());
                Fragment targetFragment2 = eVar.getTargetFragment();
                if (targetFragment2 instanceof C19321e.C19322a) {
                    ((C19321e.C19322a) targetFragment2).mo44902v0();
                }
                FragmentActivity activity = eVar.getActivity();
                if (activity instanceof C19321e.C19322a) {
                    ((C19321e.C19322a) activity).mo44902v0();
                }
                eVar.dismiss();
                return;
            case 9:
                int i8 = C14888e.f38039j;
                ((C14888e) this.f21772c).dismiss();
                return;
            case 10:
                AboutAndContactActivity aboutAndContactActivity = (AboutAndContactActivity) this.f21772c;
                int i9 = AboutAndContactActivity.f38043U;
                aboutAndContactActivity.startActivity(WebViewActivity.m18168y2(aboutAndContactActivity, aboutAndContactActivity.getString(R.string.cobrand_wondo_terms_of_use_url), aboutAndContactActivity.getString(R.string.terms_of_service_link)));
                return;
            case 11:
                C20582l lVar = C20582l.this;
                if (lVar.f40824e) {
                    lVar.f52066o.mo52903d();
                    return;
                }
                return;
            case 12:
                C14946k kVar = (C14946k) this.f21772c;
                int i11 = C14946k.f38246t;
                kVar.getClass();
                LocationFavorite locationFavorite = (LocationFavorite) view.getTag();
                LocationDescriptor locationDescriptor = (LocationDescriptor) locationFavorite.f52687b;
                C17474b.C17475a aVar7 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar7.mo49939g(AnalyticsAttributeKey.TYPE, "fav_custom_clicked");
                aVar7.mo49945m(AnalyticsAttributeKey.SELECTED_CAPTION, locationDescriptor.mo24313f());
                aVar7.mo49939g(AnalyticsAttributeKey.SELECTED_TYPE, C0016g.m13C(locationDescriptor.f23647b));
                aVar7.mo49943k(AnalyticsAttributeKey.SELECTED_ID, locationDescriptor.f23649d);
                kVar.mo46797j2(aVar7.mo49933a());
                TripPlanParams.C7626d dVar2 = new TripPlanParams.C7626d();
                dVar2.f23791b = (LocationDescriptor) locationFavorite.f52687b;
                kVar.startActivity(SuggestRoutesActivity.m39325M2(kVar.requireContext(), dVar2.mo23958a(), true));
                return;
            case 13:
                SearchLineFragment searchLineFragment = (SearchLineFragment) this.f21772c;
                C17474b.C17475a aVar8 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar8.mo49939g(AnalyticsAttributeKey.TYPE, "location_search_clicked");
                aVar8.mo49939g(AnalyticsAttributeKey.QUERY_STRING, searchLineFragment.f41630t);
                searchLineFragment.mo46797j2(aVar8.mo49933a());
                if (searchLineFragment.f40824e) {
                    Context context2 = view.getContext();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(C14226d.m35335A0(context2));
                    arrayList.add(SearchLocationActivity.m17347y2(context2, new SuggestedRoutesDelegationSearchLocationCallback(), "search_line", searchLineFragment.f41630t));
                    if (!arrayList.isEmpty()) {
                        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                        if (!C4732a.startActivities(context2, intentArr, (Bundle) null)) {
                            Intent intent2 = new Intent(intentArr[intentArr.length - 1]);
                            intent2.addFlags(268435456);
                            context2.startActivity(intent2);
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
                }
                return;
            case 14:
                C18591c cVar = (C18591c) this.f21772c;
                C20440a aVar9 = C18591c.f47329l;
                cVar.getClass();
                int adapterPosition = ((C12797f) view.getTag()).getAdapterPosition();
                if (adapterPosition != -1) {
                    int itemViewType = cVar.getItemViewType(adapterPosition);
                    if (itemViewType == 2 || itemViewType == 3 || itemViewType == 4) {
                        TransitStop transitStop = cVar.f47331h.get(adapterPosition).f47339b;
                        C18604l.C18612h hVar = (C18604l.C18612h) cVar;
                        ServerId serverId = transitStop.f23730b;
                        C16753e eVar2 = C18604l.this.f47405z;
                        if (eVar2 == null || !eVar2.mo49442q(serverId)) {
                            z = false;
                        }
                        C18604l lVar2 = C18604l.this;
                        C17474b.C17475a aVar10 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                        AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.TYPE;
                        if (C18604l.this.f47379E.getCurrentLogicalItem() == 0) {
                            str = "station_card_clicked";
                        } else {
                            str = "stop_from_favorites_clicked";
                        }
                        aVar10.mo49939g(analyticsAttributeKey, str);
                        aVar10.mo49941i(AnalyticsAttributeKey.IS_FAVORITE, z);
                        lVar2.mo46797j2(aVar10.mo49933a());
                        C18618p.C18626h hVar2 = C18604l.this.f47375A;
                        if (hVar2 != null) {
                            list = hVar2.f47466c.get(serverId);
                        } else {
                            list = null;
                        }
                        C18604l lVar3 = C18604l.this;
                        lVar3.startActivity(StopDetailActivity.m39207B2(lVar3.f40822c, serverId, (ServerId) null, transitStop, list));
                        return;
                    } else if (itemViewType == 5) {
                        C18591c.C18593b bVar3 = cVar.f47331h.get(adapterPosition);
                        C12775d dVar3 = bVar3.f47344g;
                        if (dVar3 != null) {
                            serviceStatusCategory = dVar3.f31580b.f23213b;
                        } else {
                            serviceStatusCategory = null;
                        }
                        TransitStop transitStop2 = bVar3.f47339b;
                        TransitLine transitLine = bVar3.f47340c;
                        C20787c cVar2 = bVar3.f47341d;
                        C18604l.C18612h hVar3 = (C18604l.C18612h) cVar;
                        TransitAgency transitAgency = transitLine.mo24369b().f23696d.get();
                        if (transitAgency != null && (transitType = transitAgency.f23674d.get()) != null) {
                            ServerId serverId2 = transitLine.mo24369b().f23694b;
                            ServerId serverId3 = transitLine.f23687c;
                            ServerId serverId4 = transitStop2.f23730b;
                            if (!TransitType.ViewType.TRIPS.equals(transitType.f23761f) || cVar2 == null) {
                                time = null;
                            } else {
                                time = cVar2.f52458c.mo24326m();
                            }
                            C16753e eVar3 = C18604l.this.f47405z;
                            if (eVar3 == null || !eVar3.mo49441p(serverId2)) {
                                z = false;
                            }
                            C18604l lVar4 = C18604l.this;
                            C17474b.C17475a aVar11 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                            AnalyticsAttributeKey analyticsAttributeKey2 = AnalyticsAttributeKey.TYPE;
                            if (C18604l.this.f47379E.getCurrentLogicalItem() == 0) {
                                str2 = "line_from_nearby_clicked";
                            } else {
                                str2 = "line_from_favorites_clicked";
                            }
                            aVar11.mo49939g(analyticsAttributeKey2, str2);
                            aVar11.mo49941i(AnalyticsAttributeKey.IS_FAVORITE, z);
                            aVar11.mo49945m(AnalyticsAttributeKey.SERVICE_ALERT_TYPE, C0016g.m12B(serviceStatusCategory));
                            lVar4.mo46797j2(aVar11.mo49933a());
                            if (time != null) {
                                C18604l lVar5 = C18604l.this;
                                lVar5.startActivity(LineTripPatternActivity.m38437z2(lVar5.f40822c, serverId2, serverId3, serverId4, time));
                                return;
                            }
                            C18604l lVar6 = C18604l.this;
                            lVar6.startActivity(LineDetailActivity.m38386y2(lVar6.f40822c, serverId2, serverId3, serverId4, (Time) null));
                            return;
                        }
                        return;
                    } else {
                        throw new IllegalStateException(C16759e.m42349e("Unknown clickable view type: ", itemViewType));
                    }
                } else {
                    return;
                }
            case 15:
                UserCreationFailureActivity userCreationFailureActivity = (UserCreationFailureActivity) this.f21772c;
                int i12 = UserCreationFailureActivity.f38450X;
                userCreationFailureActivity.getClass();
                userCreationFailureActivity.mo44545v2(new C17474b(AnalyticsEventKey.NETWORK_SETTINGS_CLICKED));
                userCreationFailureActivity.startActivity(new Intent("android.settings.WIRELESS_SETTINGS"));
                return;
            case 16:
                C19768i iVar = (C19768i) this.f21772c;
                int i13 = C19768i.f50257r;
                iVar.getClass();
                C17474b.C17475a aVar12 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar12.mo49939g(AnalyticsAttributeKey.TYPE, "micro_mobility_preferences_dismiss_clicked");
                iVar.mo46797j2(aVar12.mo49933a());
                ((UserOnboardingActivity) iVar.f40822c).mo45265y2();
                return;
            case 17:
                ViewPager viewPager = ((ItineraryStepsBaseActivity) this.f21772c).f38502l0;
                viewPager.mo47356e(Math.max(viewPager.getCurrentLogicalItem() - 1, 0), true);
                return;
            case 18:
                C15101a aVar13 = (C15101a) this.f21772c;
                int i14 = C15101a.f38810T;
                A a2 = aVar13.f40822c;
                int i15 = RealTimeHelpActivity.f39173U;
                aVar13.startActivity(new Intent(a2, RealTimeHelpActivity.class));
                aVar13.mo46797j2(new C17474b(AnalyticsEventKey.RT_HELP_BANNER_LINK_CLICKED));
                return;
            case 19:
                C18451j jVar = (C18451j) this.f21772c;
                int i16 = C18451j.f47036q;
                jVar.getClass();
                C17474b.C17475a aVar14 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar14.mo49939g(AnalyticsAttributeKey.TYPE, "reconnect_clicked");
                jVar.mo46797j2(aVar14.mo49933a());
                jVar.startActivity(PaymentRegistrationActivity.m41717A2(jVar.requireContext(), PaymentRegistrationType.PURCHASE, "IsraelMot"));
                return;
            case 20:
                MotActivationConfirmationActivity motActivationConfirmationActivity = (MotActivationConfirmationActivity) this.f21772c;
                int i17 = MotActivationConfirmationActivity.f38971Y;
                motActivationConfirmationActivity.getClass();
                C17474b.C17475a aVar15 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar15.mo49939g(AnalyticsAttributeKey.TYPE, FullScreenWidgetActivity.EXTRA_DISMISS);
                motActivationConfirmationActivity.mo44545v2(aVar15.mo49933a());
                motActivationConfirmationActivity.finish();
                return;
            case 21:
                int i18 = MotStationActivationAbstractActivity.f39032Y;
                ((MotStationActivationAbstractActivity) this.f21772c).mo45591B2();
                return;
            case 22:
                C13692b bVar4 = (C13692b) this.f21772c;
                int i19 = C13692b.f33750t;
                bVar4.getClass();
                Context context3 = view.getContext();
                ArrayAdapter arrayAdapter = new ArrayAdapter(context3, R.layout.spinner_text_item_dropdown);
                arrayAdapter.add(bVar4.getString(R.string.time_picker_leave_now));
                arrayAdapter.add(bVar4.getString(R.string.time_picker_depart_at));
                DropDownListPopup dropDownListPopup = new DropDownListPopup(context3);
                dropDownListPopup.setAdapter(arrayAdapter);
                dropDownListPopup.setModal(true);
                dropDownListPopup.setAnchorView(view);
                dropDownListPopup.setOnItemClickListener(new C13691a(bVar4, dropDownListPopup, 0));
                dropDownListPopup.show();
                bVar4.mo46797j2(new C17474b.C17475a(AnalyticsEventKey.EDIT_TIME_CLICKED).mo49933a());
                return;
            case 23:
                int i21 = C17237d.f44558r;
                ((C17237d) this.f21772c).mo49797n2();
                return;
            case 24:
                AllEventsActivity allEventsActivity = (AllEventsActivity) this.f21772c;
                int i22 = AllEventsActivity.f39262U;
                allEventsActivity.getClass();
                Event event = (Event) view.getTag();
                if (event != null) {
                    allEventsActivity.startActivity(EventBookingActivity.m38987y2(allEventsActivity, new EventBookingParams(event.f42911b, (LocationDescriptor) null)));
                    return;
                }
                return;
            case 25:
                C15246b bVar5 = (C15246b) this.f21772c;
                int i23 = C15246b.f39321A;
                bVar5.getClass();
                EventInstance eventInstance = ((EventRequest) view.getTag()).f42953c;
                bVar5.startActivity(EventDetailActivity.m38909y2(bVar5.getContext(), eventInstance.f42943b.f42911b, eventInstance.f42944c));
                return;
            case 26:
                C19337d dVar4 = (C19337d) this.f21772c;
                if (C20964s0.m49092j(dVar4.f49205q.getText())) {
                    C17474b.C17475a aVar16 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar16.mo49939g(AnalyticsAttributeKey.TYPE, "skip_clicked");
                    dVar4.mo46797j2(aVar16.mo49933a());
                    RideSharingRegistrationInfo m2 = dVar4.mo51742m2();
                    RideSharingRegistrationSteps rideSharingRegistrationSteps = m2.f39387c;
                    if (rideSharingRegistrationSteps == null || !rideSharingRegistrationSteps.f42977b) {
                        z = false;
                    }
                    m2.f39387c = new RideSharingRegistrationSteps(z, false, false, false);
                    dVar4.mo51745p2(false);
                    return;
                }
                if (!C20964s0.m49093k(dVar4.f49205q.getText())) {
                    dVar4.f49206r.setVisibility(0);
                } else {
                    z2 = true;
                }
                if (z2) {
                    C17474b.C17475a aVar17 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar17.mo49939g(AnalyticsAttributeKey.TYPE, "email_continue_clicked");
                    dVar4.mo46797j2(aVar17.mo49933a());
                    RideSharingRegistrationInfo m22 = dVar4.mo51742m2();
                    m22.f39397m = C20964s0.m49082C(dVar4.f49205q.getText());
                    dVar4.f40822c.mo44540t2(R.string.ride_sharing_registration_sending_personal_info);
                    C13350h hVar4 = new C13350h(dVar4.mo46783R1(), m22.f39395k, m22.f39396l, m22.f39397m);
                    RequestOptions L1 = dVar4.mo46777L1();
                    L1.f42909f = true;
                    dVar4.mo46793f2("set_user_info", hVar4, L1, dVar4.f49204p);
                    return;
                }
                return;
            case 27:
                C19356m mVar = (C19356m) this.f21772c;
                int i24 = C19356m.f49247B;
                mVar.getClass();
                C17474b.C17475a aVar18 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar18.mo49939g(AnalyticsAttributeKey.TYPE, "resend_code_clicked");
                mVar.mo46797j2(aVar18.mo49933a());
                RideSharingRegistrationInfo m23 = mVar.mo51742m2();
                C13352j jVar2 = new C13352j(mVar.mo46783R1(), m23.f39390f, m23.f39391g);
                String O = jVar2.mo40234O();
                RequestOptions L12 = mVar.mo46777L1();
                L12.f42909f = true;
                mVar.mo46793f2(O, jVar2, L12, mVar.f49251p);
                return;
            case 28:
                C20630k kVar2 = (C20630k) this.f21772c;
                int i25 = C20630k.f52155o;
                kVar2.getClass();
                C17474b.C17475a aVar19 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar19.mo49939g(AnalyticsAttributeKey.TYPE, "read_more");
                AnalyticsAttributeKey analyticsAttributeKey3 = AnalyticsAttributeKey.SERVICE_ALERT_TYPE;
                ServiceAlert serviceAlert = kVar2.f52159k;
                if (serviceAlert != null) {
                    serviceStatusCategory2 = serviceAlert.f23191c.f23213b;
                } else {
                    serviceStatusCategory2 = null;
                }
                aVar19.mo49945m(analyticsAttributeKey3, C0016g.m12B(serviceStatusCategory2));
                AnalyticsAttributeKey analyticsAttributeKey4 = AnalyticsAttributeKey.ALERT_ID;
                ServiceAlert serviceAlert2 = kVar2.f52159k;
                if (serviceAlert2 != null) {
                    str3 = serviceAlert2.f23190b;
                }
                aVar19.mo49945m(analyticsAttributeKey4, str3);
                kVar2.mo22564R1(aVar19.mo49933a());
                kVar2.startActivity(ServiceAlertDetailsActivity.m39148z2(view.getContext(), kVar2.f52157i, kVar2.f52158j));
                kVar2.dismissAllowingStateLoss();
                return;
            default:
                int i26 = C13697b.f33757n;
                ((C13697b) this.f21772c).mo40565S1();
                return;
        }
    }
}
