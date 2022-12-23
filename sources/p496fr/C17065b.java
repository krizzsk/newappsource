package p496fr;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.carpool.center.C14797a;
import com.moovit.app.carpool.center.CarpoolCenterActivity;
import com.moovit.app.carpool.fastbooking.CarpoolRideRequestDetailsActivity;
import com.moovit.app.home.dashboard.suggestions.itinerary.ItinerarySuggestionFragment;
import com.moovit.app.itinerary.C15055k;
import com.moovit.app.itinerary.ItineraryActivity;
import com.moovit.app.itinerary.ItineraryStepsBaseActivity;
import com.moovit.app.itinerary.view.SingleLegCard;
import com.moovit.app.reports.service.ReportEntityType;
import com.moovit.app.ridesharing.view.EventRequestView;
import com.moovit.app.servicealerts.ServiceAlertFragment;
import com.moovit.app.useraccount.campaigns.onboarding.OnBoardingCampaignActivity;
import com.moovit.app.useraccount.campaigns.onboarding.OnBoardingCampaignScreenInfo;
import com.moovit.app.wondo.tickets.offers.WondoOffersActivity;
import com.moovit.carpool.CarpoolRideRequest;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.utils.AppDeepLink;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.micromobility.purchase.step.qrcode.MicroMobilityQrCodeStep;
import com.moovit.micromobility.purchase.step.qrcode.MicroMobilityQrCodeStepResult;
import com.moovit.ridesharing.model.EventRequest;
import com.moovit.ticketing.purchase.fare.PurchaseTicketConfirmedActivity;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.ticketing.ticket.TicketDetailsActivity;
import com.moovit.transit.TransitLine;
import com.moovit.web.WebViewActivity;
import l80.C12849a;
import mf0.C24362h;
import p543hq.C17474b;
import p552hz.C17520c;
import p618kv.C18145f;
import p874vr.C20199a;
import p977zz.C20935e;
import q00.C19047a;
import z30.C7455a;

/* renamed from: fr.b */
public final /* synthetic */ class C17065b implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f44235b;

    /* renamed from: c */
    public final /* synthetic */ Object f44236c;

    /* renamed from: d */
    public final /* synthetic */ Object f44237d;

    public /* synthetic */ C17065b(int i, Object obj, Object obj2) {
        this.f44235b = i;
        this.f44236c = obj;
        this.f44237d = obj2;
    }

    public final void onClick(View view) {
        String str;
        switch (this.f44235b) {
            case 0:
                C14797a.C14798a aVar = (C14797a.C14798a) this.f44237d;
                C14797a.C14799b bVar = ((C14797a) this.f44236c).f37694h;
                if (bVar != null) {
                    CarpoolRideRequest carpoolRideRequest = aVar.f37699d;
                    CarpoolCenterActivity carpoolCenterActivity = (CarpoolCenterActivity) bVar;
                    C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "carpool_ride_request_clicked");
                    aVar2.mo49937e(AnalyticsAttributeKey.REQUEST_ID, carpoolRideRequest.f40928b);
                    carpoolCenterActivity.mo44545v2(aVar2.mo49933a());
                    int i = CarpoolRideRequestDetailsActivity.f37749m0;
                    Intent intent = new Intent(carpoolCenterActivity, CarpoolRideRequestDetailsActivity.class);
                    intent.putExtra("ride_request", carpoolRideRequest);
                    carpoolCenterActivity.startActivity(intent);
                    return;
                }
                return;
            case 1:
                ItinerarySuggestionFragment itinerarySuggestionFragment = (ItinerarySuggestionFragment) this.f44236c;
                Itinerary itinerary = (Itinerary) this.f44237d;
                int i2 = ItinerarySuggestionFragment.f38318r;
                C24362h.m61211f(itinerarySuggestionFragment, "this$0");
                C24362h.m61211f(itinerary, "$itinerary");
                itinerarySuggestionFragment.startActivity(ItineraryActivity.m37991y2(itinerarySuggestionFragment.requireContext(), itinerary));
                C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar3.mo49939g(AnalyticsAttributeKey.TYPE, "suggested_itinerary");
                aVar3.mo49939g(AnalyticsAttributeKey.PROVIDER, "suggestions_data_type_route");
                aVar3.mo49939g(AnalyticsAttributeKey.SOURCE, itinerarySuggestionFragment.mo45169m2().f38314f);
                aVar3.mo49939g(AnalyticsAttributeKey.ID, itinerary.f41894b);
                aVar3.mo49935c(AnalyticsAttributeKey.SELECTED_INDEX, itinerarySuggestionFragment.mo45169m2().f38315g);
                itinerarySuggestionFragment.mo46797j2(aVar3.mo49933a());
                return;
            case 2:
                C15055k kVar = (C15055k) this.f44236c;
                int i3 = C15055k.f38594h;
                kVar.getClass();
                C18145f.m44854S1(ReportEntityType.LINE, ((TransitLine) this.f44237d).f23687c, 0).show(kVar.f40792c.getSupportFragmentManager(), "ReportCategoryListDialog");
                kVar.dismissAllowingStateLoss();
                return;
            case 3:
                AppDeepLink appDeepLink = (AppDeepLink) this.f44237d;
                SingleLegCard.C15073a aVar4 = ((SingleLegCard) this.f44236c).f38680P;
                if (aVar4 != null) {
                    ItineraryStepsBaseActivity itineraryStepsBaseActivity = (ItineraryStepsBaseActivity) aVar4;
                    C19047a a = C19047a.m46164a(itineraryStepsBaseActivity.getApplicationContext());
                    if (a == null || !((Boolean) a.mo51505b(C20199a.f51307y0)).booleanValue()) {
                        C17474b.C17475a aVar5 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                        AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.TYPE;
                        if (appDeepLink.mo46945b(itineraryStepsBaseActivity)) {
                            str = "open_app";
                        } else {
                            str = "download_app";
                        }
                        aVar5.mo49939g(analyticsAttributeKey, str);
                        aVar5.mo49939g(AnalyticsAttributeKey.PROVIDER, appDeepLink.f40997b);
                        itineraryStepsBaseActivity.mo44545v2(aVar5.mo49933a());
                        appDeepLink.mo46946c(itineraryStepsBaseActivity);
                        return;
                    }
                    C17474b.C17475a aVar6 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar6.mo49939g(AnalyticsAttributeKey.TYPE, "wondo_offer_clicked");
                    aVar6.mo49939g(AnalyticsAttributeKey.PROVIDER, appDeepLink.f40997b);
                    itineraryStepsBaseActivity.mo44545v2(aVar6.mo49933a());
                    itineraryStepsBaseActivity.startActivity(WondoOffersActivity.m39988y2(itineraryStepsBaseActivity, appDeepLink.f40997b));
                    return;
                }
                return;
            case 4:
                int i4 = EventRequestView.f39409p;
                ((C20935e) this.f44236c).invoke((EventRequest) this.f44237d);
                return;
            case 5:
                ServiceAlertFragment.C15309e eVar = (ServiceAlertFragment.C15309e) this.f44236c;
                String str2 = (String) this.f44237d;
                ServiceAlertFragment serviceAlertFragment = ServiceAlertFragment.this;
                C17474b.C17475a aVar7 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar7.mo49939g(AnalyticsAttributeKey.TYPE, "agency_twitter_clicked");
                aVar7.mo49939g(AnalyticsAttributeKey.AGENCY_NAME, str2);
                serviceAlertFragment.mo46797j2(aVar7.mo49933a());
                ServiceAlertFragment.this.startActivity(C12849a.m32653a(view.getContext(), eVar.f39578g, str2));
                return;
            case 6:
                OnBoardingCampaignActivity onBoardingCampaignActivity = (OnBoardingCampaignActivity) this.f44236c;
                OnBoardingCampaignScreenInfo onBoardingCampaignScreenInfo = (OnBoardingCampaignScreenInfo) this.f44237d;
                int i5 = OnBoardingCampaignActivity.f40560U;
                onBoardingCampaignActivity.getClass();
                Uri uri = ((AppDeepLink) onBoardingCampaignScreenInfo.f40564e.f52693b).f40998c;
                C17474b.C17475a aVar8 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar8.mo49939g(AnalyticsAttributeKey.TYPE, "action_clicked");
                aVar8.mo49939g(AnalyticsAttributeKey.ACTION, (String) onBoardingCampaignScreenInfo.f40564e.f52692a);
                aVar8.mo49944l(AnalyticsAttributeKey.URI, uri);
                onBoardingCampaignActivity.mo44545v2(aVar8.mo49933a());
                if (uri != null) {
                    ((AppDeepLink) onBoardingCampaignScreenInfo.f40564e.f52693b).mo46946c(view.getContext());
                }
                onBoardingCampaignActivity.finish();
                return;
            case 7:
                int i6 = C17520c.f45103w;
                ((C17520c) this.f44236c).mo49970f2((LatLonE6) this.f44237d);
                return;
            case 8:
                C7455a aVar9 = (C7455a) this.f44236c;
                MicroMobilityQrCodeStep microMobilityQrCodeStep = (MicroMobilityQrCodeStep) this.f44237d;
                int i7 = C7455a.f22876p;
                aVar9.getClass();
                C17474b.C17475a aVar10 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar10.mo49939g(AnalyticsAttributeKey.TYPE, "alternative_action_clicked");
                aVar10.mo49939g(AnalyticsAttributeKey.SELECTED_TYPE, microMobilityQrCodeStep.f14921c);
                aVar9.mo46797j2(aVar10.mo49933a());
                aVar9.mo22864m2(new MicroMobilityQrCodeStepResult(microMobilityQrCodeStep.f14920b, (String) null));
                return;
            case 9:
                int i8 = PurchaseTicketConfirmedActivity.f23294l0;
                ((PurchaseTicketConfirmedActivity) this.f44236c).mo23968E2((Ticket) this.f44237d);
                return;
            default:
                TicketDetailsActivity ticketDetailsActivity = (TicketDetailsActivity) this.f44236c;
                int i9 = TicketDetailsActivity.f23504m0;
                ticketDetailsActivity.getClass();
                ticketDetailsActivity.startActivity(WebViewActivity.m18168y2(view.getContext(), (String) this.f44237d, (CharSequence) null));
                return;
        }
    }
}
