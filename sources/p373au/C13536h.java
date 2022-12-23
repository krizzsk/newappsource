package p373au;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.view.View;
import c00.C13717b;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.itinerary.ItineraryStepsBaseActivity;
import com.moovit.app.itinerary.view.SingleLegCard;
import com.moovit.app.linedetail.p416ui.C15101a;
import com.moovit.app.mot.model.MotActivation;
import com.moovit.app.mot.purchase.MotStationExitActivationActivity;
import com.moovit.app.stopdetail.StopDetailActivity;
import com.moovit.app.taxi.TaxiOrder;
import com.moovit.app.taxi.providers.TaxiAppInfo;
import com.moovit.app.taxi.providers.TaxiProvider;
import com.moovit.app.taxi.providers.TaxiProvidersManager;
import com.moovit.commons.utils.UiUtils;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.TaxiLeg;
import com.moovit.micromobility.ride.MicroMobilityVehicleCondition;
import com.moovit.ticketing.activation.C7632a;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.transit.TransitStop;
import com.moovit.view.dialogs.DropDownListPopup;
import ja0.C12797f;
import java.util.List;
import p451du.C16707d;
import p453dw.C16730f;
import p453dw.C16744r;
import p523gu.C17231c;
import p543hq.C17474b;
import p853uu.C19998h;
import v30.C6855a;

/* renamed from: au.h */
public final /* synthetic */ class C13536h implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f33460b;

    /* renamed from: c */
    public final /* synthetic */ Object f33461c;

    /* renamed from: d */
    public final /* synthetic */ Object f33462d;

    public /* synthetic */ C13536h(int i, Object obj, Object obj2) {
        this.f33460b = i;
        this.f33461c = obj;
        this.f33462d = obj2;
    }

    public final void onClick(View view) {
        String str;
        C17231c p2;
        switch (this.f33460b) {
            case 0:
                Leg leg = (Leg) this.f33462d;
                SingleLegCard.C15073a aVar = ((SingleLegCard) this.f33461c).f38680P;
                if (aVar != null) {
                    TaxiLeg taxiLeg = (TaxiLeg) leg;
                    ItineraryStepsBaseActivity itineraryStepsBaseActivity = (ItineraryStepsBaseActivity) aVar;
                    Parcelable.Creator<TaxiProvidersManager> creator = TaxiProvidersManager.CREATOR;
                    TaxiProvider c = ((TaxiProvidersManager) itineraryStepsBaseActivity.getSystemService("taxi_providers_manager")).mo46163c(taxiLeg.f42097b);
                    if (c != null) {
                        TaxiAppInfo taxiAppInfo = c.f39976k;
                        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.TAXI_CLICKED);
                        aVar2.mo49939g(AnalyticsAttributeKey.PROVIDER, c.f39968c);
                        aVar2.mo49941i(AnalyticsAttributeKey.TAXI_APP_INSTALLED, taxiAppInfo.mo46103c(itineraryStepsBaseActivity));
                        itineraryStepsBaseActivity.mo44545v2(aVar2.mo49933a());
                        TaxiOrder taxiOrder = new TaxiOrder(TaxiOrder.Source.TRIP_PLAN, taxiLeg.f42100e, taxiLeg.f42101f, taxiLeg.f42105j);
                        Itinerary itinerary = itineraryStepsBaseActivity.f38499X;
                        if (itinerary != null) {
                            str = itinerary.f41894b;
                        } else {
                            str = null;
                        }
                        c.f39976k.mo46102b().mo52438b(itineraryStepsBaseActivity, c, taxiOrder, str);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                C12797f fVar = (C12797f) this.f33462d;
                C17231c.C17232a aVar3 = ((C17231c) this.f33461c).f44550t;
                if (aVar3 != null) {
                    C15101a aVar4 = (C15101a) aVar3;
                    int adapterPosition = fVar.getAdapterPosition();
                    if (adapterPosition != -1 && (p2 = aVar4.mo45462p2()) != null) {
                        TransitStop transitStop = p2.f44551u;
                        int i = p2.f44552v;
                        TransitStop transitStop2 = p2.f44545o.get(adapterPosition);
                        aVar4.f38813C = transitStop2.f23730b;
                        p2.f44551u = transitStop2;
                        p2.f44552v = adapterPosition;
                        p2.f44546p.f31630k = adapterPosition;
                        p2.mo49794m();
                        p2.notifyDataSetChanged();
                        aVar4.mo46786U1(C15101a.C15108g.class, new C16707d(aVar4, p2, p2.f44551u, adapterPosition, p2.f44545o, transitStop, i));
                        aVar4.mo45469w2();
                        aVar4.mo45457L2(p2);
                        aVar4.mo45449D2();
                        C17474b.C17475a aVar5 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                        aVar5.mo49939g(AnalyticsAttributeKey.TYPE, "stop_clicked");
                        aVar5.mo49937e(AnalyticsAttributeKey.STOP_ID, transitStop2.f23730b);
                        aVar5.mo49935c(AnalyticsAttributeKey.STOP_INDEX, adapterPosition);
                        aVar4.mo46797j2(aVar5.mo49933a());
                        return;
                    }
                    return;
                }
                return;
            case 2:
                C19998h hVar = (C19998h) this.f33461c;
                List list = (List) this.f33462d;
                int i2 = C19998h.f50842n;
                hVar.getClass();
                C17474b.C17475a aVar6 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar6.mo49939g(AnalyticsAttributeKey.TYPE, "mot_train_ride_end_ride_clicked");
                aVar6.mo49943k(AnalyticsAttributeKey.ID, ((MotActivation) C13717b.m34256c(list)).f38985b);
                hVar.mo46797j2(aVar6.mo49933a());
                hVar.startActivity(MotStationExitActivationActivity.m38689y2(hVar.requireContext(), list));
                return;
            case 3:
                StopDetailActivity stopDetailActivity = (StopDetailActivity) this.f33461c;
                List list2 = (List) this.f33462d;
                int i3 = StopDetailActivity.f39653z0;
                stopDetailActivity.getClass();
                DropDownListPopup dropDownListPopup = new DropDownListPopup(stopDetailActivity);
                dropDownListPopup.setAdapter(new C16744r(stopDetailActivity, list2));
                dropDownListPopup.setModal(true);
                dropDownListPopup.setAnchorView(stopDetailActivity.f39666t0);
                dropDownListPopup.setVerticalOffset(UiUtils.m40249h(stopDetailActivity.getResources(), 11.0f));
                dropDownListPopup.setOnItemClickListener(new C16730f(stopDetailActivity, dropDownListPopup, list2));
                dropDownListPopup.show();
                return;
            case 4:
                C6855a aVar7 = (C6855a) this.f33461c;
                int i4 = C6855a.f21206q;
                aVar7.getClass();
                C17474b.C17475a aVar8 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar8.mo49939g(AnalyticsAttributeKey.TYPE, "secondary_action_clicked");
                aVar8.mo49939g(AnalyticsAttributeKey.SELECTED_TYPE, aVar7.f21207n.f14921c);
                aVar7.mo46797j2(aVar8.mo49933a());
                Uri parse = Uri.parse(((MicroMobilityVehicleCondition) this.f33462d).f15004f);
                if (parse != null) {
                    aVar7.startActivity(new Intent("android.intent.action.VIEW", parse));
                    return;
                }
                return;
            default:
                int i5 = C7632a.f23237h;
                ((C7632a) this.f33461c).mo23975S1((Ticket) this.f33462d);
                return;
        }
    }
}
