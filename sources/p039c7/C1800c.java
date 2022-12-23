package p039c7;

import aa0.C7535g;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import c00.C13717b;
import com.cubic.umo.p045ad.ext.interfaces.UMOAdKitBannerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.accessibility.UserAccessibilityPrefActivity;
import com.moovit.app.carpool.center.CarpoolCenterActivity;
import com.moovit.app.carpool.fastbooking.C14810b;
import com.moovit.app.general.SpreadTheLoveActivity;
import com.moovit.app.help.feedback.FeedbackFormActivity;
import com.moovit.app.home.dashboard.C14935d;
import com.moovit.app.home.dashboard.suggestions.station.StopSuggestionFragment;
import com.moovit.app.intro.UserCreationFailureActivity;
import com.moovit.app.itinerary.ItineraryActivity;
import com.moovit.app.linedetail.p416ui.C15101a;
import com.moovit.app.linedetail.p416ui.LineTripPatternActivity;
import com.moovit.app.map.DocklessVehicleBottomSheetDialog;
import com.moovit.app.map.layers.MapLayersManager;
import com.moovit.app.metro.selection.SelectMetroActivity;
import com.moovit.app.mot.center.MotActivationCenterActivity;
import com.moovit.app.mot.model.MotActivation;
import com.moovit.app.mot.p417qr.C15174a;
import com.moovit.app.servicealerts.LineServiceAlertSelectionActivity;
import com.moovit.app.servicealerts.ServiceAlertDetailsActivity;
import com.moovit.app.servicealerts.ServiceAlertFragment;
import com.moovit.app.stopdetail.StopDetailActivity;
import com.moovit.app.suggestedroutes.C15374a;
import com.moovit.app.suggestedroutes.TripPlanOptionsActivity;
import com.moovit.app.tod.C15462b;
import com.moovit.app.tod.bottomsheet.stateviews.TodAutonomousRideHeadingToPickupView;
import com.moovit.app.tod.model.TodOrderAssignment;
import com.moovit.app.tod.model.TodRideJourney;
import com.moovit.app.tod.model.TodRideVehicleAction;
import com.moovit.app.tod.order.TodOrderActivity;
import com.moovit.app.tod.shuttle.booking.TodShuttleBookingActivity;
import com.moovit.app.tod.shuttle.booking.TodShuttleBookingConfirmationActivity;
import com.moovit.app.tod.shuttle.booking.passengersselection.TodAdditionalPassengersSelectionDialogFragment;
import com.moovit.app.tracking.TrackingEvent;
import com.moovit.commons.geo.BoxE6;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.design.dialog.AlertDialogFragment;
import com.moovit.network.model.ServerId;
import com.moovit.request.RequestOptions;
import com.moovit.transit.LocationDescriptor;
import com.moovit.transit.TransitStop;
import com.moovit.web.WebViewActivity;
import com.tranzmate.R;
import com.usebutton.sdk.internal.widget.FullScreenWidgetActivity;
import j80.C12774c;
import java.util.List;
import mf0.C24362h;
import p054d0.C4291k0;
import p054d0.C4314v;
import p304x.C7065j0;
import p543hq.C17474b;
import p664mu.C18451j;
import p664mu.C18457m;
import p687nt.C18589b;
import p691nx.C18644b;
import p738pw.C19036d;
import p757qu.C19180c;
import p757qu.C19185h;
import p804st.C19523a;
import p804st.C19537h;
import p923xs.C20571f;
import p927xw.C20637f;

/* renamed from: c7.c */
public final /* synthetic */ class C1800c implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f6285b;

    /* renamed from: c */
    public final /* synthetic */ Object f6286c;

    public /* synthetic */ C1800c(Object obj, int i) {
        this.f6285b = i;
        this.f6286c = obj;
    }

    public final void onClick(View view) {
        int i;
        BoxE6 boxE6;
        switch (this.f6285b) {
            case 0:
                UMOAdKitBannerView.m5803l((UMOAdKitBannerView) this.f6286c);
                return;
            case 1:
                CarpoolCenterActivity carpoolCenterActivity = (CarpoolCenterActivity) this.f6286c;
                int i2 = CarpoolCenterActivity.f37683p0;
                carpoolCenterActivity.getClass();
                carpoolCenterActivity.startActivity(new Intent("android.settings.SETTINGS"));
                return;
            case 2:
                C14810b bVar = (C14810b) this.f6286c;
                int i3 = C14810b.f37770o;
                Fragment targetFragment = bVar.getTargetFragment();
                if (targetFragment instanceof C14810b.C14811a) {
                    ((C14810b.C14811a) targetFragment).mo44859Q0(bVar.f37771h, bVar.f37772i);
                }
                Fragment parentFragment = bVar.getParentFragment();
                if (parentFragment instanceof C14810b.C14811a) {
                    ((C14810b.C14811a) parentFragment).mo44859Q0(bVar.f37771h, bVar.f37772i);
                }
                FragmentActivity activity = bVar.getActivity();
                if (activity instanceof C14810b.C14811a) {
                    ((C14810b.C14811a) activity).mo44859Q0(bVar.f37771h, bVar.f37772i);
                }
                bVar.dismiss();
                return;
            case 3:
                SpreadTheLoveActivity.m37518y2((SpreadTheLoveActivity) this.f6286c, view);
                return;
            case 4:
                C20571f.C20572a aVar = (C20571f.C20572a) this.f6286c;
                C20571f fVar = C20571f.this;
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "send_feedback_clicked");
                fVar.mo46797j2(aVar2.mo49933a());
                C20571f fVar2 = C20571f.this;
                fVar2.startActivity(FeedbackFormActivity.m37597y2(fVar2.requireContext(), "HC-emptysearch"));
                return;
            case 5:
                C14935d dVar = (C14935d) this.f6286c;
                int i4 = C14935d.f38201q;
                dVar.getClass();
                C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar3.mo49939g(AnalyticsAttributeKey.TYPE, "community_clicked");
                dVar.mo46797j2(aVar3.mo49933a());
                if (dVar.f40824e) {
                    dVar.startActivity(WebViewActivity.m18168y2(dVar.getContext(), dVar.getString(R.string.community_homescreen_promo_link), dVar.getString(R.string.community_homescreen_header)));
                    return;
                }
                return;
            case 6:
                StopSuggestionFragment stopSuggestionFragment = (StopSuggestionFragment) this.f6286c;
                int i5 = StopSuggestionFragment.f38338s;
                C24362h.m61211f(stopSuggestionFragment, "this$0");
                stopSuggestionFragment.startActivity(StopDetailActivity.m39207B2(stopSuggestionFragment.requireContext(), stopSuggestionFragment.mo45186m2().f23730b, (ServerId) null, (TransitStop) null, (List) null));
                Bundle requireArguments = stopSuggestionFragment.requireArguments();
                C24362h.m61210e(requireArguments, "requireArguments()");
                String string = requireArguments.getString("source");
                int i6 = requireArguments.getInt("index");
                C17474b.C17475a aVar4 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar4.mo49939g(AnalyticsAttributeKey.TYPE, "suggested_station");
                aVar4.mo49939g(AnalyticsAttributeKey.PROVIDER, "suggestions_data_type_station");
                aVar4.mo49939g(AnalyticsAttributeKey.SOURCE, string);
                aVar4.mo49937e(AnalyticsAttributeKey.ID, stopSuggestionFragment.mo45186m2().f23730b);
                aVar4.mo49935c(AnalyticsAttributeKey.SELECTED_INDEX, i6);
                stopSuggestionFragment.mo46797j2(aVar4.mo49933a());
                return;
            case 7:
                C18589b bVar2 = (C18589b) this.f6286c;
                int i7 = C18589b.f47322n;
                bVar2.getClass();
                bVar2.mo22564R1(new C17474b(AnalyticsEventKey.SET_AS_FAVORITE_CLICKED));
                bVar2.mo46753L1(C18589b.C18590a.class, new C4314v((LocationDescriptor) bVar2.f47324i.getTag(), 6));
                bVar2.dismissAllowingStateLoss();
                return;
            case 8:
                UserCreationFailureActivity userCreationFailureActivity = (UserCreationFailureActivity) this.f6286c;
                int i8 = UserCreationFailureActivity.f38450X;
                userCreationFailureActivity.getClass();
                C17474b.C17475a aVar5 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar5.mo49939g(AnalyticsAttributeKey.TYPE, "select_metro_clicked");
                aVar5.mo49939g(AnalyticsAttributeKey.USER_CREATION_FAILURE_REASON, "location_permission_missing");
                userCreationFailureActivity.mo44545v2(aVar5.mo49933a());
                int i9 = SelectMetroActivity.f38970p0;
                userCreationFailureActivity.startActivityForResult(new Intent(userCreationFailureActivity, SelectMetroActivity.class), 1042);
                userCreationFailureActivity.mo45251A2();
                return;
            case 9:
                C19523a aVar6 = (C19523a) this.f6286c;
                int i11 = C19523a.f49621t;
                if (aVar6.mo51888m2(true)) {
                    aVar6.f49626r.setVisibility(0);
                    aVar6.f49627s.setVisibility(4);
                    String obj = aVar6.f49624p.getText().toString();
                    String obj2 = aVar6.f49625q.getText().toString();
                    RequestOptions L1 = aVar6.mo46777L1();
                    L1.f42909f = true;
                    aVar6.mo46793f2("set_user_info", new C19537h(aVar6.mo46783R1(), obj, obj2), L1, aVar6.f49622n);
                    return;
                }
                return;
            case 10:
                ItineraryActivity itineraryActivity = (ItineraryActivity) this.f6286c;
                int i12 = ItineraryActivity.f38474B0;
                itineraryActivity.mo45272G2(1);
                C17474b.C17475a aVar7 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar7.mo49939g(AnalyticsAttributeKey.TYPE, "itinerary_later_button_type");
                itineraryActivity.mo44545v2(aVar7.mo49933a());
                return;
            case 11:
                int i13 = C15101a.f38810T;
                ((C15101a) this.f6286c).mo45446B0();
                return;
            case 12:
                LineTripPatternActivity.C15099e eVar = (LineTripPatternActivity.C15099e) this.f6286c;
                C7535g gVar = eVar.f38790g;
                RecyclerView recyclerView = LineTripPatternActivity.this.f38771l0;
                gVar.getClass();
                BottomSheetBehavior e = BottomSheetBehavior.m34710e(recyclerView);
                if (e.f34359J != 3) {
                    e.setState(3);
                    return;
                } else if (recyclerView.computeVerticalScrollOffset() > 0) {
                    recyclerView.mo4615h(gVar);
                    recyclerView.mo4616h0(0);
                    return;
                } else {
                    e.setState(4);
                    return;
                }
            case 13:
                DocklessVehicleBottomSheetDialog.m38541c2((DocklessVehicleBottomSheetDialog) this.f6286c);
                return;
            case 14:
                MapLayersManager.m38565a((MapLayersManager) this.f6286c);
                return;
            case 15:
                C18451j jVar = (C18451j) this.f6286c;
                int i14 = C18451j.f47036q;
                A a = jVar.f40822c;
                int i15 = MotActivationCenterActivity.f38976Y;
                jVar.startActivity(new Intent(a, MotActivationCenterActivity.class));
                return;
            case 16:
                C18457m mVar = (C18457m) this.f6286c;
                int i16 = C18457m.f47044i;
                mVar.getClass();
                C17474b.C17475a aVar8 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar8.mo49939g(AnalyticsAttributeKey.TYPE, FullScreenWidgetActivity.EXTRA_DISMISS);
                mVar.mo22564R1(aVar8.mo49933a());
                mVar.dismissAllowingStateLoss();
                return;
            case 17:
                C19180c cVar = (C19180c) this.f6286c;
                if (cVar.f48767h.isChecked()) {
                    A a2 = cVar.f40792c;
                    TrackingEvent trackingEvent = TrackingEvent.MOT_STATION_EXIT_VERIFICATION_DIALOG_DISPLAYED;
                    a2.getSharedPreferences("events_tracker_store", 0).edit().putInt(trackingEvent.getPrefsKey(), trackingEvent.getMaxOccurrences()).apply();
                }
                LatLonE6 latLonE6 = (LatLonE6) cVar.mo46752K1().getParcelable("userLocation");
                if (latLonE6 != null) {
                    cVar.mo46753L1(C19185h.class, new C7065j0(2, cVar, latLonE6));
                }
                cVar.dismissAllowingStateLoss();
                return;
            case 18:
                int i17 = C19185h.f48779u;
                ((C19185h) this.f6286c).mo51608m2();
                return;
            case 19:
                C15174a aVar9 = (C15174a) this.f6286c;
                C17474b.C17475a aVar10 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar10.mo49939g(AnalyticsAttributeKey.TYPE, "mot_cancel_purchase_clicked");
                aVar10.mo49943k(AnalyticsAttributeKey.ID, ((MotActivation) C13717b.m34256c(aVar9.f39089p)).f38985b);
                aVar9.mo46797j2(aVar10.mo49933a());
                AlertDialogFragment.C15856a k = new AlertDialogFragment.C15856a(aVar9.requireContext()).mo47682k("cancel_purchase_dialog_fragment_tag");
                k.mo47676e(R.drawable.img_cancel_ticket, false);
                AlertDialogFragment.C15856a i18 = k.mo47683l(R.string.payment_mot_cancel_popup_title).mo47678g(R.string.payment_mot_cancel_popup_message).mo47681j(R.string.payment_mot_cancel_popup_yes_action).mo47680i(R.string.payment_mot_cancel_popup_no_action);
                i18.mo47675d(true);
                i18.mo47673b().show(aVar9.getChildFragmentManager(), "cancel_purchase_dialog_fragment_tag");
                return;
            case 20:
                int i19 = LineServiceAlertSelectionActivity.f39551X;
                ((LineServiceAlertSelectionActivity) this.f6286c).mo45844z2();
                return;
            case 21:
                ServiceAlertFragment serviceAlertFragment = (ServiceAlertFragment) this.f6286c;
                int i21 = ServiceAlertFragment.f39556x;
                serviceAlertFragment.getClass();
                serviceAlertFragment.startActivity(ServiceAlertDetailsActivity.m39148z2(serviceAlertFragment.f40822c, (ServerId) null, ((C12774c) view.getTag()).f31573a));
                return;
            case 22:
                C15374a aVar11 = (C15374a) this.f6286c;
                int i22 = C15374a.f39822l;
                aVar11.getClass();
                aVar11.mo46753L1(C15374a.C15375a.class, new C4291k0(aVar11, 10));
                aVar11.dismissAllowingStateLoss();
                return;
            case 23:
                TripPlanOptionsActivity tripPlanOptionsActivity = (TripPlanOptionsActivity) this.f6286c;
                int i23 = TripPlanOptionsActivity.f39809o0;
                tripPlanOptionsActivity.getClass();
                C17474b.C17475a aVar12 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar12.mo49939g(AnalyticsAttributeKey.TYPE, "trip_plan_accessibility_clicked");
                tripPlanOptionsActivity.mo44545v2(aVar12.mo49933a());
                int i24 = UserAccessibilityPrefActivity.f37419X;
                tripPlanOptionsActivity.f39810U.mo772a(new Intent(tripPlanOptionsActivity, UserAccessibilityPrefActivity.class));
                return;
            case 24:
                String str = C19036d.f48405m;
                ((C19036d) this.f6286c).dismissAllowingStateLoss();
                return;
            case 25:
                C15462b.m39579m2((C15462b) this.f6286c, view);
                return;
            case 26:
                TodAutonomousRideHeadingToPickupView todAutonomousRideHeadingToPickupView = (TodAutonomousRideHeadingToPickupView) this.f6286c;
                int i25 = TodAutonomousRideHeadingToPickupView.f40148q;
                todAutonomousRideHeadingToPickupView.getClass();
                C13555b.m33964c(todAutonomousRideHeadingToPickupView, TodRideVehicleAction.COLOR_BAR);
                return;
            case 27:
                TodOrderActivity todOrderActivity = (TodOrderActivity) this.f6286c;
                boolean z = !Boolean.TRUE.equals(todOrderActivity.f40346t0.getTag());
                TodOrderAssignment todOrderAssignment = todOrderActivity.f40352z0;
                if (todOrderAssignment == null) {
                    todOrderActivity.f40346t0.setVisibility(4);
                    return;
                }
                todOrderActivity.f40346t0.setTag(Boolean.valueOf(z));
                ImageView imageView = todOrderActivity.f40346t0;
                if (z) {
                    i = R.drawable.ic_expand_24_on_surface_emphasis_high;
                } else {
                    i = R.drawable.ic_collapse_24_on_surface_emphasis_high;
                }
                imageView.setImageResource(i);
                todOrderActivity.f40346t0.setVisibility(0);
                TodRideJourney todRideJourney = todOrderAssignment.f40250h;
                C20637f fVar3 = todOrderActivity.f40345s0;
                if (!z || (boxE6 = todRideJourney.f40291i) == null) {
                    boxE6 = todRideJourney.f40290h;
                }
                fVar3.mo52816a(boxE6);
                return;
            case 28:
                TodShuttleBookingConfirmationActivity todShuttleBookingConfirmationActivity = (TodShuttleBookingConfirmationActivity) this.f6286c;
                TodAdditionalPassengersSelectionDialogFragment todAdditionalPassengersSelectionDialogFragment = new TodAdditionalPassengersSelectionDialogFragment();
                Bundle bundle = new Bundle();
                bundle.putInt("passengersCount", todShuttleBookingConfirmationActivity.f40387p0 - 1);
                todAdditionalPassengersSelectionDialogFragment.setArguments(bundle);
                todAdditionalPassengersSelectionDialogFragment.show(todShuttleBookingConfirmationActivity.getSupportFragmentManager(), "passenger_count_dialog");
                return;
            default:
                C18644b bVar3 = (C18644b) this.f6286c;
                int i26 = C18644b.f47509p;
                bVar3.getClass();
                C17474b.C17475a aVar13 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar13.mo49939g(AnalyticsAttributeKey.TYPE, "tod_book_ride_clicked");
                bVar3.mo46797j2(aVar13.mo49933a());
                Context requireContext = bVar3.requireContext();
                int i27 = TodShuttleBookingActivity.f40374l0;
                Intent intent = new Intent(requireContext, TodShuttleBookingActivity.class);
                intent.putExtra("providerId", "1993");
                bVar3.startActivity(intent);
                return;
        }
    }
}
