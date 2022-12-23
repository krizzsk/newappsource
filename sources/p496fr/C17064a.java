package p496fr;

import aa0.C7530f;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.carpool.center.C14797a;
import com.moovit.app.carpool.center.CarpoolCenterActivity;
import com.moovit.app.carpool.ridedetails.CarpoolRideDetailsActivity;
import com.moovit.app.general.more.DrawerFragment;
import com.moovit.app.home.dashboard.C14985u;
import com.moovit.app.home.dashboard.suggestions.station.StopSuggestionFragment;
import com.moovit.app.itinerary.C15055k;
import com.moovit.app.linedetail.p416ui.LineDetailActivity;
import com.moovit.app.mot.purchase.MotQrCodeActivationActivity;
import com.moovit.app.mot.purchase.model.MotQrCodeStationFare;
import com.moovit.app.promotion.model.Promotion;
import com.moovit.app.reports.service.ReportEntityType;
import com.moovit.app.servicealerts.ServiceAlertDetailsActivity;
import com.moovit.app.tod.C15462b;
import com.moovit.app.tod.model.TodRide;
import com.moovit.carpool.ActiveCarpoolRide;
import com.moovit.carpool.FutureCarpoolRide;
import com.moovit.carpool.HasCarpoolRide;
import com.moovit.carpool.HistoricalCarpoolRide;
import com.moovit.carpool.PassengerRideStops;
import com.moovit.commons.utils.AppDeepLink;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.map.collections.category.types.BicycleStationMetadata;
import com.moovit.network.model.ServerId;
import com.moovit.payment.account.model.PaymentAccountProfile;
import com.moovit.payment.account.profile.PaymentAccountEditProfileActivity;
import com.moovit.servicealerts.ServiceAlert;
import com.moovit.ticketing.purchase.fare.PurchaseTicketConfirmedActivity;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitStop;
import com.moovit.tripplanner.TripPlannerLocations;
import com.moovit.util.time.Time;
import com.tranzmate.R;
import mf0.C24362h;
import p454dx.C16746a;
import p504fz.C17132d;
import p543hq.C17474b;
import p618kv.C18145f;
import p664mu.C18435a;
import p664mu.C18437c;
import p781ru.C19329b;
import p781ru.C19330c;
import p805su.C19554k;
import p824tp.C19746x;
import p977zz.C20927a0;

/* renamed from: fr.a */
public final /* synthetic */ class C17064a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f44232b;

    /* renamed from: c */
    public final /* synthetic */ Object f44233c;

    /* renamed from: d */
    public final /* synthetic */ Object f44234d;

    public /* synthetic */ C17064a(int i, Object obj, Object obj2) {
        this.f44232b = i;
        this.f44233c = obj;
        this.f44234d = obj2;
    }

    public final void onClick(View view) {
        Uri f;
        PassengerRideStops passengerRideStops = null;
        switch (this.f44232b) {
            case 0:
                C14797a.C14798a aVar = (C14797a.C14798a) this.f44234d;
                C14797a.C14799b bVar = ((C14797a) this.f44233c).f37694h;
                if (bVar != null) {
                    HasCarpoolRide hasCarpoolRide = aVar.f37698c;
                    CarpoolCenterActivity carpoolCenterActivity = (CarpoolCenterActivity) bVar;
                    C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "carpool_ride_clicked");
                    aVar2.mo49937e(AnalyticsAttributeKey.CARPOOL_RIDE_ID, hasCarpoolRide.mo46811a0().f40910b);
                    carpoolCenterActivity.mo44545v2(aVar2.mo49933a());
                    ServerId serverId = hasCarpoolRide.mo46811a0().f40910b;
                    if (hasCarpoolRide instanceof FutureCarpoolRide) {
                        passengerRideStops = ((FutureCarpoolRide) hasCarpoolRide).f40940e;
                    } else if (hasCarpoolRide instanceof ActiveCarpoolRide) {
                        passengerRideStops = ((ActiveCarpoolRide) hasCarpoolRide).f40857e;
                    } else if (hasCarpoolRide instanceof HistoricalCarpoolRide) {
                        passengerRideStops = ((HistoricalCarpoolRide) hasCarpoolRide).f40946f;
                    }
                    carpoolCenterActivity.startActivity(CarpoolRideDetailsActivity.m37357A2(carpoolCenterActivity, serverId, passengerRideStops, (TripPlannerLocations) null, (Itinerary) null, false));
                    return;
                }
                return;
            case 1:
                int i = DrawerFragment.f38045t;
                ((DrawerFragment) this.f44233c).startActivity((Intent) this.f44234d);
                return;
            case 2:
                C14985u uVar = (C14985u) this.f44233c;
                Promotion promotion = (Promotion) this.f44234d;
                int i2 = C14985u.f38351r;
                uVar.getClass();
                String str = promotion.f39169c;
                AppDeepLink appDeepLink = promotion.f39172f;
                C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar3.mo49939g(AnalyticsAttributeKey.TYPE, "promotion_icon_clicked");
                aVar3.mo49939g(AnalyticsAttributeKey.SELECTED_CAPTION, str);
                aVar3.mo49938f(AnalyticsAttributeKey.URI, appDeepLink.f40998c);
                uVar.mo46797j2(aVar3.mo49933a());
                appDeepLink.mo46946c(uVar.f40822c);
                return;
            case 3:
                StopSuggestionFragment.C14980a aVar4 = (StopSuggestionFragment.C14980a) this.f44233c;
                TransitLine transitLine = (TransitLine) this.f44234d;
                C24362h.m61211f(aVar4, "this$0");
                C24362h.m61210e(transitLine, "transitLine");
                StopSuggestionFragment stopSuggestionFragment = StopSuggestionFragment.this;
                Context requireContext = stopSuggestionFragment.requireContext();
                ServerId serverId2 = transitLine.mo24369b().f23694b;
                ServerId serverId3 = transitLine.f23687c;
                StopSuggestionFragment stopSuggestionFragment2 = StopSuggestionFragment.this;
                int i3 = StopSuggestionFragment.f38338s;
                stopSuggestionFragment.startActivity(LineDetailActivity.m38386y2(requireContext, serverId2, serverId3, stopSuggestionFragment2.mo45186m2().f23730b, (Time) null));
                Bundle requireArguments = StopSuggestionFragment.this.requireArguments();
                C24362h.m61210e(requireArguments, "requireArguments()");
                String string = requireArguments.getString("source");
                int i4 = requireArguments.getInt("index");
                StopSuggestionFragment stopSuggestionFragment3 = StopSuggestionFragment.this;
                C17474b.C17475a aVar5 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar5.mo49939g(AnalyticsAttributeKey.TYPE, "suggested_line");
                aVar5.mo49939g(AnalyticsAttributeKey.PROVIDER, "suggestions_data_type_station");
                aVar5.mo49939g(AnalyticsAttributeKey.SOURCE, string);
                aVar5.mo49937e(AnalyticsAttributeKey.ID, transitLine.f23687c);
                aVar5.mo49935c(AnalyticsAttributeKey.SELECTED_INDEX, i4);
                stopSuggestionFragment3.mo46797j2(aVar5.mo49933a());
                return;
            case 4:
                C15055k kVar = (C15055k) this.f44233c;
                int i5 = C15055k.f38594h;
                kVar.getClass();
                C18145f.m44854S1(ReportEntityType.STOP, ((TransitStop) this.f44234d).f23730b, 0).show(kVar.f40792c.getSupportFragmentManager(), "ReportCategoryListDialog");
                kVar.dismissAllowingStateLoss();
                return;
            case 5:
                C19330c cVar = (C19330c) this.f44234d;
                C19554k kVar2 = C19554k.this;
                int i6 = C19554k.f49700n;
                MotQrCodeActivationActivity motQrCodeActivationActivity = (MotQrCodeActivationActivity) kVar2.f40822c;
                if (motQrCodeActivationActivity != null) {
                    MotQrCodeStationFare motQrCodeStationFare = cVar.f49186b;
                    C19329b bVar2 = cVar.f49187c;
                    if (motQrCodeStationFare != null) {
                        C17474b.C17475a aVar6 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                        aVar6.mo49939g(AnalyticsAttributeKey.TYPE, "mot_suggestion_clicked");
                        aVar6.mo49937e(AnalyticsAttributeKey.ID, motQrCodeStationFare.f39071e.f39055b.f39016b);
                        aVar6.mo49937e(AnalyticsAttributeKey.ITEM_ID, motQrCodeStationFare.f39071e.f39056c.f39013b.f39009b);
                        aVar6.mo49937e(AnalyticsAttributeKey.LINE_GROUP_ID, motQrCodeStationFare.f39068b.mo24369b().f23694b);
                        aVar6.mo49937e(AnalyticsAttributeKey.LINE_ID, motQrCodeStationFare.f39068b.f23687c);
                        aVar6.mo49937e(AnalyticsAttributeKey.TO_STOP, motQrCodeStationFare.f39069c.f23730b);
                        aVar6.mo49934b(AnalyticsAttributeKey.DISTANCE, motQrCodeStationFare.f39070d);
                        aVar6.mo49937e(AnalyticsAttributeKey.PREDICTED_LINE_ID, kVar2.mo51896n2().mo45611c());
                        kVar2.mo46797j2(aVar6.mo49933a());
                        C18437c cVar2 = C18437c.f47002b;
                        ServerId serverId4 = motQrCodeStationFare.f39068b.f23687c;
                        ServerId serverId5 = motQrCodeStationFare.f39069c.f23730b;
                        cVar2.getClass();
                        Tasks.call(MoovitExecutors.SINGLE, new C18435a(cVar2, motQrCodeActivationActivity, serverId4, serverId5));
                        motQrCodeActivationActivity.mo45584y2(motQrCodeStationFare.f39071e, motQrCodeStationFare.f39068b.f23687c, motQrCodeStationFare.f39069c.f23730b, false);
                        return;
                    } else if (bVar2 != null) {
                        C17474b.C17475a aVar7 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                        aVar7.mo49939g(AnalyticsAttributeKey.TYPE, "mot_suggestion_clicked");
                        aVar7.mo49937e(AnalyticsAttributeKey.ID, bVar2.f49184b.f39055b.f39016b);
                        aVar7.mo49937e(AnalyticsAttributeKey.ITEM_ID, bVar2.f49184b.f39056c.f39013b.f39009b);
                        aVar7.mo49937e(AnalyticsAttributeKey.LINE_GROUP_ID, bVar2.f49183a.mo24369b().f23694b);
                        aVar7.mo49937e(AnalyticsAttributeKey.LINE_ID, bVar2.f49183a.f23687c);
                        aVar7.mo49937e(AnalyticsAttributeKey.PREDICTED_LINE_ID, kVar2.mo51896n2().mo45611c());
                        kVar2.mo46797j2(aVar7.mo49933a());
                        C18437c cVar3 = C18437c.f47002b;
                        ServerId serverId6 = bVar2.f49183a.f23687c;
                        cVar3.getClass();
                        Tasks.call(MoovitExecutors.SINGLE, new C18435a(cVar3, motQrCodeActivationActivity, serverId6, (ServerId) null));
                        motQrCodeActivationActivity.mo45584y2(bVar2.f49184b, bVar2.f49183a.f23687c, (ServerId) null, false);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 6:
                ServiceAlertDetailsActivity serviceAlertDetailsActivity = (ServiceAlertDetailsActivity) this.f44233c;
                int i7 = ServiceAlertDetailsActivity.f39553Y;
                serviceAlertDetailsActivity.getClass();
                C17474b.C17475a aVar8 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar8.mo49939g(AnalyticsAttributeKey.TYPE, "share_clicked");
                serviceAlertDetailsActivity.mo44545v2(aVar8.mo49933a());
                serviceAlertDetailsActivity.startActivity(Intent.createChooser(C20927a0.m49012g(((ServiceAlert) this.f44234d).f23201m, (String) null), serviceAlertDetailsActivity.getText(R.string.share_with)));
                return;
            case 7:
                C15462b bVar3 = (C15462b) this.f44233c;
                int i8 = C15462b.f40053x;
                bVar3.startActivity(PaymentAccountEditProfileActivity.m64248y2(bVar3.requireContext(), ((PaymentAccountProfile) this.f44234d).f64033b.f42828b));
                return;
            case 8:
                TodRide todRide = (TodRide) this.f44234d;
                C16746a.C16747a aVar9 = ((C16746a) this.f44233c).f43606j;
                if (aVar9 != null) {
                    aVar9.mo46292C0(todRide);
                    return;
                }
                return;
            case 9:
                C17132d dVar = (C17132d) this.f44233c;
                BicycleStationMetadata bicycleStationMetadata = (BicycleStationMetadata) this.f44234d;
                int i9 = C17132d.f44361h;
                dVar.getClass();
                C17474b.C17475a aVar10 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar10.mo49939g(AnalyticsAttributeKey.TYPE, "get_directions_bikes_clicked");
                dVar.mo22564R1(aVar10.mo49933a());
                Context context = dVar.getContext();
                if (context != null && (f = C7530f.m17273f(bicycleStationMetadata.f42475d)) != null) {
                    Intent intent = new Intent();
                    intent.setData(f);
                    intent.setPackage(context.getPackageName());
                    if (intent.resolveActivity(context.getPackageManager()) != null) {
                        dVar.startActivity(intent);
                        dVar.dismissAllowingStateLoss();
                        return;
                    }
                    intent.setPackage((String) null);
                    dVar.startActivity(Intent.createChooser(intent, context.getString(C19746x.open_file_chooser)));
                    dVar.dismissAllowingStateLoss();
                    return;
                }
                return;
            default:
                int i11 = PurchaseTicketConfirmedActivity.f23294l0;
                ((PurchaseTicketConfirmedActivity) this.f44233c).mo23969F2((Ticket) this.f44234d);
                return;
        }
    }
}
