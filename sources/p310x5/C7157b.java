package p310x5;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import c00.C13717b;
import com.appboy.models.cards.CaptionedImageCard;
import com.appboy.p044ui.widget.CaptionedImageCardView;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.itinerary.ItineraryStepsBaseActivity;
import com.moovit.app.itinerary.view.SingleLegCard;
import com.moovit.app.mot.model.MotActivation;
import com.moovit.app.mot.model.MotActivationStationInfo;
import com.moovit.app.mot.purchase.MotStationExitActivationActivity;
import com.moovit.app.ridesharing.EventDetailActivity;
import com.moovit.app.ridesharing.RideSharingCenterActivity;
import com.moovit.app.suggestedroutes.C15374a;
import com.moovit.app.suggestedroutes.TripPlanWalkingPrefActivity;
import com.moovit.app.tracking.TrackingEvent;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.itinerary.model.leg.CarLeg;
import com.moovit.network.model.ServerId;
import com.moovit.payment.account.model.PaymentAccountProfile;
import com.moovit.payment.account.profile.PaymentAccountEditProfileActivity;
import com.moovit.ridesharing.model.EventInstance;
import com.moovit.ridesharing.model.EventRequest;
import com.moovit.ticketing.activation.C7632a;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.ticketing.ticket.TicketDetailsActivity;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.R;
import java.util.List;
import mf0.C24361g;
import p001a0.C0016g;
import p543hq.C17474b;
import p664mu.C18451j;
import p712ou.C18830b;
import p757qu.C19180c;
import p757qu.C19185h;
import p877vu.C20233c;
import v90.C13187a;

/* renamed from: x5.b */
public final /* synthetic */ class C7157b implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f22230b;

    /* renamed from: c */
    public final /* synthetic */ Object f22231c;

    /* renamed from: d */
    public final /* synthetic */ Object f22232d;

    public /* synthetic */ C7157b(int i, Object obj, Object obj2) {
        this.f22230b = i;
        this.f22231c = obj;
        this.f22232d = obj2;
    }

    public final void onClick(View view) {
        boolean z;
        switch (this.f22230b) {
            case 0:
                ((CaptionedImageCardView) this.f22231c).lambda$onSetCard$0((CaptionedImageCard) this.f22232d, view);
                return;
            case 1:
                CarLeg carLeg = (CarLeg) this.f22232d;
                SingleLegCard.C15073a aVar = ((SingleLegCard) this.f22231c).f38680P;
                if (aVar != null) {
                    ItineraryStepsBaseActivity itineraryStepsBaseActivity = (ItineraryStepsBaseActivity) aVar;
                    C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "navigate_clicked");
                    itineraryStepsBaseActivity.mo44545v2(aVar2.mo49933a());
                    C20233c.m47802c(itineraryStepsBaseActivity, carLeg.f41961e.mo24310d());
                    return;
                }
                return;
            case 2:
                C18451j jVar = (C18451j) this.f22231c;
                int i = C18451j.f47036q;
                jVar.startActivity(PaymentAccountEditProfileActivity.m64248y2(jVar.requireContext(), ((PaymentAccountProfile) this.f22232d).f64033b.f42828b));
                return;
            case 3:
                C19185h hVar = (C19185h) this.f22231c;
                C18830b bVar = (C18830b) this.f22232d;
                int i2 = C19185h.f48779u;
                List<MotActivation> z2 = ((MotStationExitActivationActivity) hVar.f40822c).mo45599z2();
                MotActivation motActivation = (MotActivation) C13717b.m34256c(z2);
                MotActivationStationInfo motActivationStationInfo = ((MotActivation) C13717b.m34256c(((MotStationExitActivationActivity) hVar.f40822c).mo45599z2())).f38997n;
                if (motActivationStationInfo != null) {
                    ServerId c = motActivationStationInfo.mo45575c();
                    CurrencyAmount b = bVar.f47943b.mo45548b(((MotStationExitActivationActivity) hVar.f40822c).mo45599z2().size());
                    C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar3.mo49939g(AnalyticsAttributeKey.TYPE, "validate_clicked");
                    aVar3.mo49937e(AnalyticsAttributeKey.ID, motActivation.f38985b);
                    aVar3.mo49935c(AnalyticsAttributeKey.COUNT, z2.size());
                    aVar3.mo49937e(AnalyticsAttributeKey.FROM_STOP, c);
                    aVar3.mo49937e(AnalyticsAttributeKey.TO_STOP, bVar.f47944c.f39023b.f23730b);
                    aVar3.mo49936d(AnalyticsAttributeKey.BALANCE, C0016g.m19b(b));
                    aVar3.mo49939g(AnalyticsAttributeKey.CURRENCY_CODE, b.f23844b);
                    hVar.mo46797j2(aVar3.mo49933a());
                    if (hVar.f48784r == null) {
                        Context requireContext = hVar.requireContext();
                        FragmentManager childFragmentManager = hVar.getChildFragmentManager();
                        LatLonE6 latLonE6 = bVar.f47942a;
                        TrackingEvent trackingEvent = TrackingEvent.MOT_STATION_EXIT_VERIFICATION_DIALOG_DISPLAYED;
                        boolean z3 = false;
                        if (requireContext.getSharedPreferences("events_tracker_store", 0).getInt(trackingEvent.getPrefsKey(), 0) >= trackingEvent.getMaxOccurrences()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("userLocation", latLonE6);
                            C19180c cVar = new C19180c();
                            cVar.setArguments(bundle);
                            cVar.show(childFragmentManager, "exit_station_verification_tag");
                            z3 = true;
                        }
                        if (z3) {
                            return;
                        }
                    }
                    hVar.mo51610o2(bVar.f47942a);
                    return;
                }
                throw new ApplicationBugException("Only station activations can be used!");
            case 4:
                RideSharingCenterActivity rideSharingCenterActivity = RideSharingCenterActivity.this;
                int i3 = RideSharingCenterActivity.f39304Z;
                rideSharingCenterActivity.getClass();
                EventInstance eventInstance = ((EventRequest) this.f22232d).f42953c;
                rideSharingCenterActivity.startActivity(EventDetailActivity.m38909y2(rideSharingCenterActivity, eventInstance.f42943b.f42911b, eventInstance.f42944c));
                return;
            case 5:
                TripPlanWalkingPrefActivity tripPlanWalkingPrefActivity = (TripPlanWalkingPrefActivity) this.f22231c;
                int i4 = TripPlanWalkingPrefActivity.f39818Z;
                tripPlanWalkingPrefActivity.getClass();
                C17474b.C17475a aVar4 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar4.mo49939g(AnalyticsAttributeKey.TYPE, "trip_plan_max_walking_time_clicked");
                tripPlanWalkingPrefActivity.mo44545v2(aVar4.mo49933a());
                int indexOf = tripPlanWalkingPrefActivity.f39819U.indexOf(Short.valueOf(((C13187a) this.f22232d).mo40060a().f23794c));
                Bundle b2 = C25541a.m63872b("tag", "max_walking_time_picker_dialog");
                b2.putCharSequence("title", tripPlanWalkingPrefActivity.getText(R.string.walk_options_max_time_picker));
                b2.putStringArray(LinksConfiguration.KEY_VALUES, C24361g.m61182q0(tripPlanWalkingPrefActivity.f39820X));
                b2.putString("selectedValue", (String) tripPlanWalkingPrefActivity.f39820X.get(indexOf));
                b2.putCharSequence("positiveButton", tripPlanWalkingPrefActivity.getText(R.string.action_done));
                b2.putCharSequence("negativeButton", tripPlanWalkingPrefActivity.getText(R.string.action_reset));
                C15374a aVar5 = new C15374a();
                aVar5.setArguments(b2);
                aVar5.show(tripPlanWalkingPrefActivity.getSupportFragmentManager(), "max_walking_time_picker_dialog");
                return;
            case 6:
                int i5 = C7632a.f23237h;
                ((C7632a) this.f22231c).mo23975S1((Ticket) this.f22232d);
                return;
            default:
                int i6 = TicketDetailsActivity.f23504m0;
                ((TicketDetailsActivity) this.f22231c).mo23967D2((Ticket) this.f22232d);
                return;
        }
    }
}
