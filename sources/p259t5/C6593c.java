package p259t5;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.appboy.p044ui.inappmessage.DefaultInAppMessageViewWrapper;
import com.facebook.appevents.C2338j;
import com.google.android.exoplayer2.p052ui.C4060z;
import com.google.android.exoplayer2.p052ui.StyledPlayerControlView;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.masabi.justride.sdk.p415ui.features.ticket.ValidationMode;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.carpool.history.CarpoolHistoryActivity;
import com.moovit.app.general.aboutandcontact.AboutAndContactActivity;
import com.moovit.app.help.helpcenter.HelpCenterActivity;
import com.moovit.app.help.helpcenter.model.HelpCenterSimpleSection;
import com.moovit.app.home.lines.favorites.FavoriteLinesFragment;
import com.moovit.app.intro.UserCreationFailureActivity;
import com.moovit.app.intro.onboarding.OnboardingLoginActivity;
import com.moovit.app.intro.onboarding.UserOnboardingActivity;
import com.moovit.app.linedetail.p416ui.C15101a;
import com.moovit.app.linedetail.p416ui.LineDetailActivity;
import com.moovit.app.linedetail.p416ui.LineTripPatternActivity;
import com.moovit.app.lineschedule.LineScheduleActivity;
import com.moovit.app.metro.selection.SelectMetroActivity;
import com.moovit.app.mot.p417qr.MotQrCodeViewerActivity;
import com.moovit.app.mot.purchase.MotQrCodeActivationActivity;
import com.moovit.app.mot.purchase.model.MotQrCodeActivationFare;
import com.moovit.app.mot.welcome.MotAccountCreationWelcomeActivity;
import com.moovit.app.ridesharing.C15246b;
import com.moovit.app.ridesharing.booking.EventBookingActivity;
import com.moovit.app.ridesharing.booking.EventBookingParams;
import com.moovit.app.ridesharing.registration.RideSharingProfileUpdateActivity;
import com.moovit.app.share.proxy.SharedEntityProxyItineraryFragment;
import com.moovit.app.stoparrivals.StopArrivalsActivity;
import com.moovit.app.suggestedroutes.TripPlanOptions;
import com.moovit.app.suggestedroutes.TripPlanOptionsActivity;
import com.moovit.app.tracking.TrackingEvent;
import com.moovit.home.lines.search.SearchLineActivity;
import com.moovit.network.model.ServerId;
import com.moovit.payment.registration.PaymentRegistrationActivity;
import com.moovit.payment.registration.PaymentRegistrationType;
import com.moovit.ridesharing.model.Event;
import com.moovit.transit.LocationDescriptor;
import com.moovit.transit.TransitAgency;
import com.moovit.transit.TransitStop;
import com.moovit.transit.TransitType;
import com.moovit.tripplanner.TripPlannerAlgorithmType;
import com.moovit.tripplanner.TripPlannerTransportType;
import com.moovit.util.time.Time;
import com.moovit.web.WebViewActivity;
import com.tranzmate.R;
import com.usebutton.sdk.internal.widget.FullScreenWidgetActivity;
import ja0.C12797f;
import java.util.Collections;
import java.util.HashSet;
import mf0.C24362h;
import p001a0.C0016g;
import p001a0.C0017h;
import p009a8.C0098d0;
import p009a8.C0108h;
import p009a8.C0115o;
import p262t8.C6606a;
import p401bz.C13713g;
import p472er.C16861c;
import p523gu.C17228a;
import p543hq.C17474b;
import p567iq.C17635b;
import p572iw.C17663f;
import p613kq.C18116c;
import p688nu.C18633e;
import p713ov.C18836e;
import p713ov.C18845j;
import p716oy.C18860a;
import p733pr.C18961c;
import p775ro.C19297d;
import p775ro.C19305j;
import p778rr.C19318b;
import p805su.C19548g;
import p805su.C19560p;
import p824tp.C19728f;
import p828tt.C19760b;
import p923xs.C20577i;
import p923xs.C20579j;
import p923xs.C20582l;
import p952yy.C20787c;
import q00.C19047a;
import v50.C20101a;
import v90.C13187a;
import z20.C20806a;

/* renamed from: t5.c */
public final /* synthetic */ class C6593c implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f20413b;

    /* renamed from: c */
    public final /* synthetic */ Object f20414c;

    public /* synthetic */ C6593c(Object obj, int i) {
        this.f20413b = i;
        this.f20414c = obj;
    }

    public final void onClick(View view) {
        int i;
        C20579j.C20580a aVar;
        int o;
        int k;
        TransitAgency transitAgency;
        Time time = null;
        switch (this.f20413b) {
            case 0:
                ((DefaultInAppMessageViewWrapper) this.f20414c).lambda$createButtonClickListener$2(view);
                return;
            case 1:
                C0108h hVar = (C0108h) this.f20414c;
                int i2 = C0108h.f317j;
                if (!C6606a.m15601b(C0108h.class)) {
                    try {
                        C24362h.m61211f(hVar, "this$0");
                        Context context = hVar.getContext();
                        if (!C6606a.m15601b(hVar)) {
                            C2338j jVar = new C2338j(context, (String) null);
                            String str = hVar.f319c;
                            C0115o oVar = C0115o.f331a;
                            if (C0098d0.m169b()) {
                                jVar.mo12486f(str, (Bundle) null);
                            }
                        }
                    } catch (Throwable th) {
                        C6606a.m15600a(C0108h.class, th);
                        return;
                    }
                    View.OnClickListener onClickListener = hVar.f321e;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        return;
                    }
                    View.OnClickListener onClickListener2 = hVar.f320d;
                    if (onClickListener2 != null) {
                        onClickListener2.onClick(view);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                StyledPlayerControlView.C4017i iVar = (StyledPlayerControlView.C4017i) this.f20414c;
                DefaultTrackSelector defaultTrackSelector = StyledPlayerControlView.this.f14297E0;
                if (defaultTrackSelector != null) {
                    DefaultTrackSelector.Parameters d = defaultTrackSelector.mo16302d();
                    d.getClass();
                    DefaultTrackSelector.C3989c cVar = new DefaultTrackSelector.C3989c(d);
                    for (int i3 = 0; i3 < iVar.f14385g.size(); i3++) {
                        int intValue = iVar.f14385g.get(i3).intValue();
                        cVar.mo16321b(intValue);
                        cVar.mo16324e(intValue, true);
                    }
                    DefaultTrackSelector defaultTrackSelector2 = StyledPlayerControlView.this.f14297E0;
                    defaultTrackSelector2.getClass();
                    defaultTrackSelector2.mo16303i(cVar);
                    StyledPlayerControlView.this.f14291B0.dismiss();
                    return;
                }
                return;
            case 3:
                C4060z.m10920a((C4060z) this.f20414c, view);
                return;
            case 4:
                C19297d dVar = (C19297d) this.f20414c;
                int i4 = C19297d.f49059N;
                ValidationMode validationMode = ((C19305j) dVar.f45311c).f49135z;
                ValidationMode validationMode2 = ValidationMode.BARCODE;
                if (validationMode == validationMode2) {
                    dVar.mo51714J1(ValidationMode.VISUAL_VALIDATOR);
                    return;
                } else {
                    dVar.mo51714J1(validationMode2);
                    return;
                }
            case 5:
                C18116c cVar2 = (C18116c) this.f20414c;
                int[] iArr = C18116c.f46317q;
                if (cVar2.getContext() != null) {
                    cVar2.mo50556r2(view);
                    return;
                }
                return;
            case 6:
                int i5 = C16861c.f43864j;
                ((C16861c) this.f20414c).dismiss();
                return;
            case 7:
                int i6 = CarpoolHistoryActivity.f37778m0;
                ((CarpoolHistoryActivity) this.f20414c).mo44866y2();
                return;
            case 8:
                int i7 = C18961c.f48272j;
                ((C18961c) this.f20414c).mo51475O1();
                return;
            case 9:
                C19318b bVar = (C19318b) this.f20414c;
                int i8 = C19318b.f49162j;
                C17635b.m43779f(bVar.getContext()).f50172b.mo42913b(new C13713g(bVar.getContext(), 5, Collections.singletonMap(FullScreenWidgetActivity.EXTRA_DISMISS, (String) bVar.f49164i.getTag())), true);
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "carpool_booking_survey_clicked");
                bVar.mo22564R1(aVar2.mo49933a());
                bVar.dismissAllowingStateLoss();
                return;
            case 10:
                AboutAndContactActivity aboutAndContactActivity = (AboutAndContactActivity) this.f20414c;
                int i9 = AboutAndContactActivity.f38043U;
                aboutAndContactActivity.startActivity(WebViewActivity.m18168y2(aboutAndContactActivity, aboutAndContactActivity.getString(R.string.terms_of_use_url), aboutAndContactActivity.getString(R.string.terms_of_service_link)));
                return;
            case 11:
                C20579j jVar2 = (C20579j) this.f20414c;
                jVar2.getClass();
                int adapterPosition = ((C12797f) view.getTag()).getAdapterPosition();
                if (adapterPosition != -1 && (aVar = jVar2.f52061i) != null) {
                    HelpCenterSimpleSection helpCenterSimpleSection = jVar2.f52060h.get(adapterPosition - 1);
                    C20582l lVar = (C20582l) aVar;
                    C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar3.mo49939g(AnalyticsAttributeKey.TYPE, "help_center_section_clicked");
                    aVar3.mo49936d(AnalyticsAttributeKey.ID, helpCenterSimpleSection.f38124b);
                    lVar.mo46797j2(aVar3.mo49933a());
                    HelpCenterActivity helpCenterActivity = (HelpCenterActivity) lVar.f40822c;
                    helpCenterActivity.getClass();
                    long j = helpCenterSimpleSection.f38124b;
                    String str2 = helpCenterSimpleSection.f38125c;
                    int i11 = C20577i.f52051t;
                    Bundle bundle = new Bundle();
                    bundle.putLong("ownerSectionId", j);
                    bundle.putString("ownerSectionName", str2);
                    C20577i iVar2 = new C20577i();
                    iVar2.setArguments(bundle);
                    helpCenterActivity.mo45063z2(iVar2, true);
                    return;
                }
                return;
            case 12:
                FavoriteLinesFragment.C15006k kVar = (FavoriteLinesFragment.C15006k) this.f20414c;
                kVar.getClass();
                C12797f fVar = (C12797f) view.getTag();
                int adapterPosition2 = fVar.getAdapterPosition();
                if (adapterPosition2 != -1 && (o = kVar.mo51053o(adapterPosition2)) >= 0 && (k = kVar.mo51050k(adapterPosition2, o)) >= 0) {
                    FavoriteLinesFragment.C15003h hVar2 = (FavoriteLinesFragment.C15003h) kVar.mo51052n(o).getItem(k);
                    int itemViewType = fVar.getItemViewType();
                    if (itemViewType == 11 || itemViewType == 12) {
                        FavoriteLinesFragment favoriteLinesFragment = FavoriteLinesFragment.this;
                        int i12 = FavoriteLinesFragment.f38373E;
                        favoriteLinesFragment.getClass();
                        C17474b.C17475a aVar4 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                        aVar4.mo49939g(AnalyticsAttributeKey.TYPE, "line_from_favorites_clicked");
                        aVar4.mo49941i(AnalyticsAttributeKey.IS_CONNECTED_TO_STOP, false);
                        favoriteLinesFragment.mo46797j2(aVar4.mo49933a());
                        favoriteLinesFragment.startActivity(LineDetailActivity.m38386y2(favoriteLinesFragment.getContext(), ((FavoriteLinesFragment.C15002g) hVar2).f38400a.f23694b, (ServerId) null, (ServerId) null, (Time) null));
                        return;
                    } else if (itemViewType == 15 || itemViewType == 16) {
                        FavoriteLinesFragment favoriteLinesFragment2 = FavoriteLinesFragment.this;
                        FavoriteLinesFragment.C15005j jVar3 = (FavoriteLinesFragment.C15005j) hVar2;
                        int i13 = FavoriteLinesFragment.f38373E;
                        favoriteLinesFragment2.getClass();
                        C17474b.C17475a aVar5 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                        aVar5.mo49939g(AnalyticsAttributeKey.TYPE, "line_from_favorites_clicked");
                        aVar5.mo49941i(AnalyticsAttributeKey.IS_CONNECTED_TO_STOP, true);
                        favoriteLinesFragment2.mo46797j2(aVar5.mo49933a());
                        ServerId serverId = jVar3.f38400a.f23694b;
                        ServerId serverId2 = jVar3.f38404d.get(0).f23687c;
                        ServerId serverId3 = jVar3.f38403c.f23730b;
                        if (TransitType.ViewType.TRIPS.equals(jVar3.f38400a.f23696d.get().f23674d.get().f23761f)) {
                            C20787c cVar3 = jVar3.f38406f;
                            if (cVar3 != null) {
                                time = cVar3.f52458c.mo24326m();
                            }
                            if (time != null) {
                                favoriteLinesFragment2.startActivity(LineTripPatternActivity.m38437z2(favoriteLinesFragment2.getContext(), serverId, serverId2, serverId3, time));
                                return;
                            }
                            return;
                        }
                        favoriteLinesFragment2.startActivity(LineDetailActivity.m38386y2(favoriteLinesFragment2.getContext(), serverId, serverId2, serverId3, (Time) null));
                        return;
                    } else {
                        throw new IllegalStateException(C16759e.m42349e("Unknown favorite line item view type: ", itemViewType));
                    }
                } else {
                    return;
                }
            case 13:
                UserCreationFailureActivity userCreationFailureActivity = (UserCreationFailureActivity) this.f20414c;
                int i14 = UserCreationFailureActivity.f38450X;
                userCreationFailureActivity.getClass();
                int i15 = SelectMetroActivity.f38970p0;
                userCreationFailureActivity.startActivityForResult(new Intent(userCreationFailureActivity, SelectMetroActivity.class), 1042);
                userCreationFailureActivity.mo45251A2();
                return;
            case 14:
                C19760b bVar2 = (C19760b) this.f20414c;
                C13187a aVar6 = (C13187a) bVar2.mo46776J1("TRIP_PLANNER_CONFIGURATION");
                for (TripPlannerTransportType next : aVar6.mo40063d()) {
                    if (bVar2.f50240o.contains(next) && !bVar2.f50241p.contains(next)) {
                        HashSet hashSet = new HashSet(aVar6.f32743d.mo49542a());
                        hashSet.remove(next);
                        aVar6.f32743d.mo49544c(hashSet);
                    }
                }
                C17474b.C17475a aVar7 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar7.mo49939g(AnalyticsAttributeKey.TYPE, "save_clicked");
                aVar7.mo49939g(AnalyticsAttributeKey.ACTIVITY_NAME, bVar2.mo52089n2());
                aVar7.mo49942j(AnalyticsAttributeKey.SET_SETTINGS_MASK, C0017h.m50G(aVar6.mo40063d()));
                bVar2.mo46797j2(aVar7.mo49933a());
                ((UserOnboardingActivity) bVar2.f40822c).mo45265y2();
                return;
            case 15:
                OnboardingLoginActivity onboardingLoginActivity = (OnboardingLoginActivity) this.f20414c;
                int i16 = OnboardingLoginActivity.f38468U;
                onboardingLoginActivity.getClass();
                C17474b.C17475a aVar8 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar8.mo49939g(AnalyticsAttributeKey.TYPE, "ok_clicked");
                onboardingLoginActivity.mo44545v2(aVar8.mo49933a());
                String str3 = (String) ((C19047a) onboardingLoginActivity.mo44537r1("CONFIGURATION")).mo51505b(C20101a.f51007T);
                if (str3 == null) {
                    onboardingLoginActivity.mo45260y2();
                    return;
                } else {
                    onboardingLoginActivity.startActivityForResult(PaymentRegistrationActivity.m41717A2(onboardingLoginActivity, PaymentRegistrationType.REGISTRATION, str3), 2354);
                    return;
                }
            case 16:
                C17228a.C17229a aVar9 = ((C17228a) this.f20414c).f44534g;
                if (aVar9 != null) {
                    ((C15101a) aVar9).mo45446B0();
                    return;
                }
                return;
            case 17:
                int i17 = LineScheduleActivity.f38859w0;
                ((LineScheduleActivity) this.f20414c).mo45307g((TransitStop) null);
                return;
            case 18:
                C18633e eVar = C18633e.this;
                if (eVar.f40824e) {
                    int i18 = C18633e.f47485r;
                    eVar.mo51016m2();
                    return;
                }
                return;
            case 19:
                C19548g.C19549a aVar10 = (C19548g.C19549a) this.f20414c;
                aVar10.getClass();
                MotQrCodeActivationFare motQrCodeActivationFare = (MotQrCodeActivationFare) view.getTag();
                if (motQrCodeActivationFare != null) {
                    C19548g gVar = C19548g.this;
                    int i19 = C19548g.f49674o;
                    gVar.getClass();
                    C17474b.C17475a aVar11 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar11.mo49939g(AnalyticsAttributeKey.TYPE, "fare_clicked");
                    aVar11.mo49937e(AnalyticsAttributeKey.ID, motQrCodeActivationFare.f39055b.f39016b);
                    aVar11.mo49937e(AnalyticsAttributeKey.ITEM_ID, motQrCodeActivationFare.f39056c.f39013b.f39009b);
                    aVar11.mo49936d(AnalyticsAttributeKey.BALANCE, C0016g.m19b(motQrCodeActivationFare.f39056c.f39014c.f39005b));
                    aVar11.mo49939g(AnalyticsAttributeKey.CURRENCY_CODE, motQrCodeActivationFare.f39056c.f39014c.f39005b.f23844b);
                    gVar.mo46797j2(aVar11.mo49933a());
                    ((MotQrCodeActivationActivity) gVar.f40822c).mo45584y2(motQrCodeActivationFare, (ServerId) null, (ServerId) null, false);
                    return;
                }
                return;
            case 20:
                C19560p pVar = (C19560p) this.f20414c;
                int i21 = C19560p.f49719q;
                if (pVar.getContext() != null && pVar.mo46775H1()) {
                    C17474b.C17475a aVar12 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar12.mo49939g(AnalyticsAttributeKey.TYPE, "search_clicked");
                    pVar.mo46797j2(aVar12.mo49933a());
                    C19728f fVar2 = (C19728f) pVar.mo46776J1("METRO_CONTEXT");
                    ServerId serverId4 = pVar.mo51896n2().f39063c;
                    if (serverId4 != null) {
                        transitAgency = (TransitAgency) fVar2.f50167c.get(serverId4);
                    } else {
                        transitAgency = null;
                    }
                    Context requireContext = pVar.requireContext();
                    int i22 = SearchLineActivity.f41621U;
                    Intent intent = new Intent(requireContext, SearchLineActivity.class);
                    intent.putExtra("transitType", (Parcelable) null);
                    intent.putExtra("agency", transitAgency);
                    intent.putExtra("emptySearchLineViewFactory", (Parcelable) null);
                    pVar.startActivityForResult(intent, 5556);
                    return;
                }
                return;
            case 21:
                int i23 = MotQrCodeViewerActivity.f39075X;
                ((MotQrCodeViewerActivity) this.f20414c).mo45624z2();
                return;
            case 22:
                MotAccountCreationWelcomeActivity motAccountCreationWelcomeActivity = (MotAccountCreationWelcomeActivity) this.f20414c;
                int i24 = MotAccountCreationWelcomeActivity.f39100U;
                motAccountCreationWelcomeActivity.getClass();
                C17474b.C17475a aVar13 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar13.mo49939g(AnalyticsAttributeKey.TYPE, "account_creation_intro_continue_clicked");
                motAccountCreationWelcomeActivity.mo44545v2(aVar13.mo49933a());
                TrackingEvent trackingEvent = TrackingEvent.MOT_ACCOUNT_CREATION_WELCOME;
                SharedPreferences sharedPreferences = motAccountCreationWelcomeActivity.getSharedPreferences("events_tracker_store", 0);
                sharedPreferences.edit().putInt(trackingEvent.getPrefsKey(), sharedPreferences.getInt(trackingEvent.getPrefsKey(), 0) + 1).apply();
                motAccountCreationWelcomeActivity.startActivity(PaymentRegistrationActivity.m41717A2(motAccountCreationWelcomeActivity, PaymentRegistrationType.PURCHASE, "IsraelMot"));
                motAccountCreationWelcomeActivity.finish();
                return;
            case 23:
                C15246b bVar3 = (C15246b) this.f20414c;
                int i25 = C15246b.f39321A;
                bVar3.getClass();
                Event event = (Event) view.getTag();
                if (event != null) {
                    bVar3.startActivity(EventBookingActivity.m38987y2(view.getContext(), new EventBookingParams(event.f42911b, (LocationDescriptor) null)));
                    return;
                }
                return;
            case 24:
                int i26 = C18836e.f47953t;
                ((C18836e) this.f20414c).mo51317q2();
                return;
            case 25:
                int i27 = C18845j.f47983r;
                ((C18845j) this.f20414c).mo51336w2(1567);
                return;
            case 26:
                int i28 = RideSharingProfileUpdateActivity.f39364r0;
                ((RideSharingProfileUpdateActivity) this.f20414c).mo45775y2();
                return;
            case 27:
                SharedEntityProxyItineraryFragment.m39175m2((SharedEntityProxyItineraryFragment) this.f20414c, view);
                return;
            case 28:
                StopArrivalsActivity stopArrivalsActivity = (StopArrivalsActivity) this.f20414c;
                int i29 = StopArrivalsActivity.f39603q0;
                C24362h.m61211f(stopArrivalsActivity, "this$0");
                ViewPager2 viewPager2 = stopArrivalsActivity.f39609m0;
                if (viewPager2 != null) {
                    viewPager2.setCurrentItem(0);
                    return;
                } else {
                    C24362h.m61217l("viewPager");
                    throw null;
                }
            default:
                C17663f fVar3 = (C17663f) this.f20414c;
                int i31 = C17663f.f45392x;
                TripPlanOptions tripPlanOptions = (TripPlanOptions) fVar3.f40537p;
                Context requireContext2 = fVar3.requireContext();
                if (C18860a.m45884a().f48028p == TripPlannerAlgorithmType.PREFERRED) {
                    i = R.string.trip_plan_trip_preference_label;
                } else {
                    i = R.string.trip_plan_options;
                }
                fVar3.startActivityForResult(TripPlanOptionsActivity.m39353y2(requireContext2, i, tripPlanOptions.f39804c, tripPlanOptions.f39805d, tripPlanOptions.f39806e, tripPlanOptions.f39807f, tripPlanOptions.f39808g), 1374);
                fVar3.mo46797j2(new C17474b.C17475a(AnalyticsEventKey.EDIT_ROUTE_TYPE_CLICKED).mo49933a());
                new C20806a.C20807a("filter_route_preferences_tap").mo52935c();
                return;
        }
    }
}
