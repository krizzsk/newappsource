package com.google.android.exoplayer2.p052ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import b00.C13556a;
import c00.C13717b;
import com.google.android.gms.tasks.Tasks;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.ataf.AtafTicketsActivity;
import com.moovit.app.carpool.ridedetails.C14838d;
import com.moovit.app.general.SpreadTheLoveActivity;
import com.moovit.app.general.aboutandcontact.AboutAndContactActivity;
import com.moovit.app.home.dashboard.C14952o;
import com.moovit.app.home.dashboard.FavoriteLocationEditorActivity;
import com.moovit.app.home.dashboard.LocationServicesStateSection;
import com.moovit.app.intro.UserCreationFailureActivity;
import com.moovit.app.itinerary.ItineraryActivity;
import com.moovit.app.itinerary.view.leg.AbstractLegView;
import com.moovit.app.mot.model.MotActivation;
import com.moovit.app.mot.p417qr.C15177c;
import com.moovit.app.mot.purchase.MotQrCodeActivationActivity;
import com.moovit.app.mot.purchase.MotStationEntranceActivationActivity;
import com.moovit.app.mot.purchase.MotStationExitActivationActivity;
import com.moovit.app.reports.list.ReportsListActivity;
import com.moovit.app.servicealerts.ServiceAlertFragment;
import com.moovit.app.suggestedroutes.C15374a;
import com.moovit.app.suggestedroutes.TripPlanOptionsActivity;
import com.moovit.app.suggestedroutes.TripPlanWalkingPrefActivity;
import com.moovit.app.tod.C15462b;
import com.moovit.app.tod.TodRideRatingDialogFragment;
import com.moovit.app.tod.bookingflow.TodBookingOrderViewModel;
import com.moovit.app.tod.bookingflow.model.TodBookingPickupLocationState;
import com.moovit.app.tod.bottomsheet.stateviews.TodAutonomousRideHeadingDropOffView;
import com.moovit.app.tod.center.TodRidesCenterActivity;
import com.moovit.app.tod.model.TodRideVehicleAction;
import com.moovit.app.tod.shuttle.C15536a;
import com.moovit.app.tod.shuttle.booking.TodShuttleBookingActivity;
import com.moovit.app.tod.shuttle.booking.TodShuttleBookingConfirmationActivity;
import com.moovit.app.tod.shuttle.booking.subscriptionenroll.TodShuttleBookingSubscriptionEnrollDialogFragment;
import com.moovit.app.tod.shuttle.booking.subscriptionenroll.TodShuttleBookingSubscriptionEnrollState;
import com.moovit.app.tripplanner.C15578a;
import com.moovit.itinerary.C16080a;
import com.moovit.location.C16202a;
import com.moovit.location.LocationSettingsFixer;
import com.moovit.request.RequestOptions;
import com.moovit.transit.LocationDescriptor;
import com.moovit.web.WebViewActivity;
import com.tranzmate.R;
import f00.C16919g;
import h60.C17327j1;
import ja0.C12797f;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import l80.C12849a;
import p009a8.C0113m;
import p019b0.C1436m;
import p041ca.C1825k;
import p054d0.C4314v;
import p376ax.C13546h;
import p472er.C16867h;
import p543hq.C17474b;
import p572iw.C17666h;
import p596jx.C17970r;
import p688nu.C18627a;
import p691nx.C18642a;
import p738pw.C19036d;
import p782rv.C19363n;
import p801sq.C19519h;
import p805su.C19548g;
import p805su.C19554k;
import p808sx.C19572h;
import p824tp.C19728f;
import p977zz.C20934d0;
import p977zz.C20963s;
import p977zz.C20964s0;
import p977zz.C20975x0;
import q00.C19047a;

/* renamed from: com.google.android.exoplayer2.ui.r */
public final /* synthetic */ class C4052r implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f14502b;

    /* renamed from: c */
    public final /* synthetic */ Object f14503c;

    public /* synthetic */ C4052r(Object obj, int i) {
        this.f14502b = i;
        this.f14503c = obj;
    }

    public final void onClick(View view) {
        long j;
        String str;
        boolean z = false;
        String str2 = "";
        switch (this.f14502b) {
            case 0:
                StyledPlayerControlView.m10795a((StyledPlayerControlView) this.f14503c);
                return;
            case 1:
                String str3 = MoovitActivity.f37291T;
                ((MoovitActivity) this.f14503c).recreate();
                return;
            case 2:
                AtafTicketsActivity atafTicketsActivity = (AtafTicketsActivity) this.f14503c;
                C16919g.C16920a aVar = AtafTicketsActivity.f37610U;
                atafTicketsActivity.startActivity(WebViewActivity.m18168y2(atafTicketsActivity, atafTicketsActivity.getString(R.string.terms_of_use_url), atafTicketsActivity.getString(R.string.ataf_terms_of_use_action)));
                return;
            case 3:
                C16867h hVar = (C16867h) this.f14503c;
                int i = C16867h.f43872j;
                hVar.getClass();
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "open_app");
                aVar2.mo49939g(AnalyticsAttributeKey.SOURCE, C16080a.m40960p(hVar.f43873h).name());
                aVar2.mo49938f(AnalyticsAttributeKey.URI, hVar.f43874i.f40998c);
                hVar.mo22564R1(aVar2.mo49933a());
                hVar.f43874i.mo46946c(hVar.f40792c);
                hVar.dismissAllowingStateLoss();
                return;
            case 4:
                C14838d dVar = (C14838d) this.f14503c;
                String str4 = C14838d.f37890i;
                dVar.getClass();
                C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar3.mo49939g(AnalyticsAttributeKey.TYPE, "carpool_cancel_ride_clicked");
                dVar.mo22564R1(aVar3.mo49933a());
                dVar.dismiss();
                dVar.mo46753L1(C14838d.C14839a.class, new C17327j1(dVar, 10));
                dVar.dismiss();
                return;
            case 5:
                SpreadTheLoveActivity.m37518y2((SpreadTheLoveActivity) this.f14503c, view);
                return;
            case 6:
                AboutAndContactActivity aboutAndContactActivity = (AboutAndContactActivity) this.f14503c;
                int i2 = AboutAndContactActivity.f38043U;
                aboutAndContactActivity.startActivity(WebViewActivity.m18168y2(aboutAndContactActivity, aboutAndContactActivity.getString(R.string.wondo_promotions_policy_url), aboutAndContactActivity.getString(R.string.wondo_promotions_policy_text)));
                return;
            case 7:
                int i3 = FavoriteLocationEditorActivity.f38158s0;
                ((FavoriteLocationEditorActivity) this.f14503c).mo45101G2();
                return;
            case 8:
                LocationServicesStateSection locationServicesStateSection = (LocationServicesStateSection) this.f14503c;
                int i4 = LocationServicesStateSection.f38179r;
                if (locationServicesStateSection.f40822c != null) {
                    C17474b.C17475a aVar4 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar4.mo49939g(AnalyticsAttributeKey.TYPE, "fix_clicked");
                    locationServicesStateSection.mo46797j2(aVar4.mo49933a());
                    new LocationSettingsFixer.C16198a((C15682c<?>) locationServicesStateSection).mo48528a(new C14952o(locationServicesStateSection));
                    return;
                }
                return;
            case 9:
                UserCreationFailureActivity userCreationFailureActivity = (UserCreationFailureActivity) this.f14503c;
                int i5 = UserCreationFailureActivity.f38450X;
                userCreationFailureActivity.getClass();
                C17474b.C17475a aVar5 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar5.mo49939g(AnalyticsAttributeKey.TYPE, "allow_location_permission");
                aVar5.mo49939g(AnalyticsAttributeKey.USER_CREATION_FAILURE_REASON, "location_permission_missing");
                userCreationFailureActivity.mo44545v2(aVar5.mo49933a());
                C1436m mVar = new C1436m(userCreationFailureActivity, 5);
                Context context = view.getContext();
                if (C20934d0.m49032c(context)) {
                    mVar.mo5770h(0, userCreationFailureActivity);
                    return;
                } else {
                    C16202a.get(context).requestLocationPermissions((MoovitActivity) userCreationFailureActivity, (C16202a.C16205c<MoovitActivity>) mVar);
                    return;
                }
            case 10:
                ItineraryActivity itineraryActivity = (ItineraryActivity) this.f14503c;
                int i6 = ItineraryActivity.f38474B0;
                itineraryActivity.mo45272G2(-1);
                C17474b.C17475a aVar6 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar6.mo49939g(AnalyticsAttributeKey.TYPE, "itinerary_earlier_button_type");
                itineraryActivity.mo44545v2(aVar6.mo49933a());
                return;
            case 11:
                AbstractLegView abstractLegView = (AbstractLegView) this.f14503c;
                abstractLegView.mo45371D(view, abstractLegView.f38709z, abstractLegView.f38689A);
                return;
            case 12:
                C18627a aVar7 = (C18627a) this.f14503c;
                aVar7.getClass();
                int adapterPosition = ((C12797f) view.getTag()).getAdapterPosition();
                if (adapterPosition != -1) {
                    MotActivation motActivation = aVar7.f47475k.get(adapterPosition);
                    C18627a.C18629b bVar = aVar7.f47476l;
                    if (bVar != null) {
                        bVar.mo51015Q0(motActivation);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                MotStationEntranceActivationActivity motStationEntranceActivationActivity = (MotStationEntranceActivationActivity) this.f14503c;
                int i7 = MotStationEntranceActivationActivity.f39036p0;
                motStationEntranceActivationActivity.getClass();
                C17474b.C17475a aVar8 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar8.mo49939g(AnalyticsAttributeKey.TYPE, "cancel_clicked");
                motStationEntranceActivationActivity.mo44545v2(aVar8.mo49933a());
                motStationEntranceActivationActivity.finish();
                return;
            case 14:
                C19554k kVar = (C19554k) this.f14503c;
                int i8 = C19554k.f49700n;
                kVar.getClass();
                C17474b.C17475a aVar9 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar9.mo49939g(AnalyticsAttributeKey.TYPE, "mot_suggestions_manual_fare_selection_clicked");
                kVar.mo46797j2(aVar9.mo49933a());
                MotQrCodeActivationActivity motQrCodeActivationActivity = (MotQrCodeActivationActivity) kVar.f40822c;
                motQrCodeActivationActivity.getClass();
                motQrCodeActivationActivity.mo45585z2(new C19548g(), "manual_fare_selection", true);
                return;
            case 15:
                C15177c cVar = (C15177c) this.f14503c;
                C17474b.C17475a aVar10 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar10.mo49939g(AnalyticsAttributeKey.TYPE, "mot_end_ride_clicked");
                aVar10.mo49943k(AnalyticsAttributeKey.ID, ((MotActivation) C13717b.m34256c(cVar.f39097o)).f38985b);
                cVar.mo46797j2(aVar10.mo49933a());
                cVar.startActivity(MotStationExitActivationActivity.m38689y2(cVar.requireContext(), cVar.f39097o));
                return;
            case 16:
                TextView textView = (TextView) this.f14503c;
                int i9 = ReportsListActivity.f39183n0;
                String str5 = (String) view.getTag();
                if (str5 == null || str5.isEmpty()) {
                    textView.setMaxLines(Integer.MAX_VALUE);
                    view.setTag("expand");
                    return;
                }
                textView.setMaxLines(3);
                view.setTag(str2);
                return;
            case 17:
                C19363n nVar = (C19363n) this.f14503c;
                int i11 = C19363n.f49268p;
                nVar.getClass();
                C17474b.C17475a aVar11 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar11.mo49939g(AnalyticsAttributeKey.TYPE, "enter_credit_card");
                nVar.mo46797j2(aVar11.mo49933a());
                nVar.mo51745p2(false);
                return;
            case 18:
                ServiceAlertFragment serviceAlertFragment = (ServiceAlertFragment) this.f14503c;
                int i12 = ServiceAlertFragment.f39556x;
                serviceAlertFragment.getClass();
                String str6 = (String) view.getTag();
                if (str6 != null) {
                    A a = serviceAlertFragment.f40822c;
                    serviceAlertFragment.startActivity(C12849a.m32653a(a, C19047a.m46164a(a), str6));
                    return;
                }
                return;
            case 19:
                C15374a aVar12 = (C15374a) this.f14503c;
                int i13 = C15374a.f39822l;
                aVar12.getClass();
                aVar12.mo46753L1(C15374a.C15375a.class, new C1436m(aVar12, 7));
                aVar12.dismissAllowingStateLoss();
                return;
            case 20:
                TripPlanOptionsActivity tripPlanOptionsActivity = (TripPlanOptionsActivity) this.f14503c;
                int i14 = TripPlanOptionsActivity.f39809o0;
                tripPlanOptionsActivity.getClass();
                C17474b.C17475a aVar13 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar13.mo49939g(AnalyticsAttributeKey.TYPE, "trip_plan_walk_options_clicked");
                tripPlanOptionsActivity.mo44545v2(aVar13.mo49933a());
                tripPlanOptionsActivity.f39810U.mo772a(new Intent(tripPlanOptionsActivity, TripPlanWalkingPrefActivity.class));
                return;
            case 21:
                C17666h hVar2 = (C17666h) this.f14503c;
                int i15 = C17666h.f45402O;
                hVar2.getClass();
                hVar2.mo46786U1(C19572h.C19573a.class, new C4314v(hVar2, 8));
                return;
            case 22:
                C19036d dVar2 = (C19036d) this.f14503c;
                C19728f fVar = dVar2.f48410l;
                if (fVar != null) {
                    String str7 = fVar.f50165a.f16129d;
                    try {
                        str7 = URLEncoder.encode(str7, "UTF-8");
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                    str2 = str7;
                }
                dVar2.startActivity(WebViewActivity.m18168y2(dVar2.getContext(), dVar2.getString(dVar2.f48408j.getFeedbackUrlResId(), str2).toString(), (CharSequence) null));
                dVar2.dismissAllowingStateLoss();
                return;
            case 23:
                TodRideRatingDialogFragment todRideRatingDialogFragment = (TodRideRatingDialogFragment) this.f14503c;
                int floor = (int) Math.floor((double) todRideRatingDialogFragment.f40021i.getRating());
                String obj = todRideRatingDialogFragment.f40024l.getText().toString();
                C13556a aVar14 = todRideRatingDialogFragment.f40027o;
                if (aVar14 != null) {
                    aVar14.cancel(true);
                    todRideRatingDialogFragment.f40027o = null;
                }
                todRideRatingDialogFragment.mo46192S1(true);
                A a2 = todRideRatingDialogFragment.f40792c;
                C17970r rVar = new C17970r(floor, a2.mo44548x1(), todRideRatingDialogFragment.f40020h, obj);
                StringBuilder sb = new StringBuilder();
                C13715c.m34249o(C17970r.class, sb, "_");
                sb.append(rVar.f46052w);
                sb.append("_");
                sb.append(rVar.f46053x);
                String sb2 = sb.toString();
                RequestOptions requestOptions = new RequestOptions();
                requestOptions.f42909f = true;
                todRideRatingDialogFragment.f40027o = a2.mo44527k2(sb2, rVar, requestOptions, todRideRatingDialogFragment.f40028p);
                C17474b.C17475a aVar15 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar15.mo49939g(AnalyticsAttributeKey.TYPE, "submit_rating_clicked");
                aVar15.mo49935c(AnalyticsAttributeKey.RATING, floor);
                aVar15.mo49941i(AnalyticsAttributeKey.HAS_COMMENT, !C20964s0.m49090h(obj));
                todRideRatingDialogFragment.mo22564R1(aVar15.mo49933a());
                return;
            case 24:
                C15462b bVar2 = (C15462b) this.f14503c;
                int i16 = C15462b.f40053x;
                bVar2.getClass();
                C17474b.C17475a aVar16 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar16.mo49939g(AnalyticsAttributeKey.TYPE, "tod_ride_center_clicked");
                bVar2.mo46797j2(aVar16.mo49933a());
                Context context2 = view.getContext();
                int i17 = TodRidesCenterActivity.f40201l0;
                bVar2.startActivity(new Intent(context2, TodRidesCenterActivity.class));
                return;
            case 25:
                C13546h hVar3 = (C13546h) this.f14503c;
                int i18 = C13546h.f33483w;
                TodBookingOrderViewModel p2 = hVar3.mo40436p2();
                TodBookingPickupLocationState value = p2.f40074f.getValue();
                if (value != null) {
                    LocationDescriptor locationDescriptor = value.f40099b;
                    hVar3.mo40434n2().mo52906b((CharSequence) null);
                    C17474b.C17475a aVar17 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar17.mo49939g(AnalyticsAttributeKey.TYPE, "tod_order_origin_submitted");
                    aVar17.mo49939g(AnalyticsAttributeKey.QUERY_STRING, locationDescriptor.mo24313f());
                    AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.DEPART_NOW;
                    TodBookingOrderViewModel.OrderInformation value2 = p2.f40071c.getValue();
                    if (value2 != null) {
                        j = value2.f40084d;
                    } else {
                        j = -1;
                    }
                    if (j == -1) {
                        z = true;
                    }
                    aVar17.mo49941i(analyticsAttributeKey, z);
                    hVar3.mo46797j2(aVar17.mo49933a());
                    TodBookingOrderViewModel.OrderInformation value3 = p2.f40071c.getValue();
                    if (value3 != null) {
                        p2.f40071c.postValue(new TodBookingOrderViewModel.OrderInformation(value3.f40082b, value3.f40083c, value3.f40084d, locationDescriptor, (LocationDescriptor) null));
                        if (!C20975x0.m49118e(value3.f40085e, locationDescriptor)) {
                            String str8 = value3.f40082b;
                            Long valueOf = Long.valueOf(value3.f40084d);
                            p2.f40077i.setValue(null);
                            p2.f40079k.setValue(null);
                            p2.f40080l.setValue(Boolean.TRUE);
                            Tasks.call(MoovitExecutors.f37327IO, new C0113m(p2, 2)).onSuccessTask(MoovitExecutors.COMPUTATION, new C1825k(str8, locationDescriptor, valueOf)).addOnCompleteListener(new C20963s(p2.f40077i)).addOnCompleteListener(new C19519h(p2, 3));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 26:
                TodAutonomousRideHeadingDropOffView todAutonomousRideHeadingDropOffView = (TodAutonomousRideHeadingDropOffView) this.f14503c;
                int i19 = TodAutonomousRideHeadingDropOffView.f40135n;
                todAutonomousRideHeadingDropOffView.getClass();
                TodRideVehicleAction todRideVehicleAction = (TodRideVehicleAction) view.getTag();
                if (todRideVehicleAction != null) {
                    C13555b.m33964c(todAutonomousRideHeadingDropOffView, todRideVehicleAction);
                    return;
                }
                return;
            case 27:
                TodShuttleBookingConfirmationActivity todShuttleBookingConfirmationActivity = (TodShuttleBookingConfirmationActivity) this.f14503c;
                if (todShuttleBookingConfirmationActivity.f40389r0 == null && todShuttleBookingConfirmationActivity.f40382Z != null) {
                    List<Integer> a3 = C15536a.m39718a(todShuttleBookingConfirmationActivity.f40388q0);
                    if (a3 != null) {
                        z = !a3.isEmpty();
                    }
                    if (z) {
                        str = "tod_shuttle_recurring_details_clicked";
                    } else {
                        str = "tod_shuttle_recurring_set_clicked";
                    }
                    C17474b.C17475a aVar18 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar18.mo49939g(AnalyticsAttributeKey.TYPE, str);
                    todShuttleBookingConfirmationActivity.mo44545v2(aVar18.mo49933a());
                    TodShuttleBookingSubscriptionEnrollState todShuttleBookingSubscriptionEnrollState = new TodShuttleBookingSubscriptionEnrollState(todShuttleBookingConfirmationActivity.f40384m0, todShuttleBookingConfirmationActivity.f40382Z, todShuttleBookingConfirmationActivity.f40388q0);
                    TodShuttleBookingSubscriptionEnrollDialogFragment todShuttleBookingSubscriptionEnrollDialogFragment = new TodShuttleBookingSubscriptionEnrollDialogFragment();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("selectionState", todShuttleBookingSubscriptionEnrollState);
                    todShuttleBookingSubscriptionEnrollDialogFragment.setArguments(bundle);
                    todShuttleBookingSubscriptionEnrollDialogFragment.show(todShuttleBookingConfirmationActivity.getSupportFragmentManager(), "subscription_enroll");
                    return;
                }
                return;
            case 28:
                C18642a aVar19 = (C18642a) this.f14503c;
                int i21 = C18642a.f47505p;
                aVar19.getClass();
                C17474b.C17475a aVar20 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar20.mo49939g(AnalyticsAttributeKey.TYPE, "tod_book_ride_clicked");
                aVar19.mo46797j2(aVar20.mo49933a());
                Context requireContext = aVar19.requireContext();
                int i22 = TodShuttleBookingActivity.f40374l0;
                Intent intent = new Intent(requireContext, TodShuttleBookingActivity.class);
                intent.putExtra("providerId", "1653");
                aVar19.startActivity(intent);
                return;
            default:
                C15578a aVar21 = (C15578a) this.f14503c;
                int i23 = C15578a.f40521w;
                aVar21.getClass();
                aVar21.mo46797j2(new C17474b.C17475a(AnalyticsEventKey.EDIT_DEST_CLICKED).mo49933a());
                aVar21.startActivityForResult(aVar21.mo40559n2(aVar21.getContext()), 1122);
                return;
        }
    }
}
