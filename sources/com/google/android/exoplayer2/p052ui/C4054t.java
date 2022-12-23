package com.google.android.exoplayer2.p052ui;

import aa0.C7530f;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import b90.C7562a;
import com.google.android.exoplayer2.p052ui.StyledPlayerControlView;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.C4000c;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.carpool.history.C14812a;
import com.moovit.app.carpool.history.CarpoolHistoryActivity;
import com.moovit.app.carpool.ridedetails.CarpoolRideDetailsActivity;
import com.moovit.app.intro.UserCreationFailureActivity;
import com.moovit.app.itinerary.ItineraryStepsBaseActivity;
import com.moovit.app.itinerary.view.SingleLegCard;
import com.moovit.app.itinerary.view.leg.C15083h;
import com.moovit.app.linedetail.p416ui.C15101a;
import com.moovit.app.map.DocklessVehicleBottomSheetDialog;
import com.moovit.app.mot.purchase.MotQrCodeScanActivity;
import com.moovit.app.tod.shuttle.booking.TodShuttleBookingState;
import com.moovit.app.tod.shuttle.model.TodZone;
import com.moovit.app.useraccount.campaigns.onboarding.OnBoardingCampaignActivity;
import com.moovit.app.useraccount.campaigns.onboarding.OnBoardingCampaignScreenInfo;
import com.moovit.carpool.HistoricalCarpoolRide;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.utils.AppDeepLink;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.MultiTransitLinesLeg;
import com.moovit.location.C16202a;
import com.moovit.ticketing.purchase.extrainfo.split.PurchaseSplitActivity;
import com.moovit.ticketing.purchase.filter.PurchaseFilter;
import com.moovit.transit.LocationDescriptor;
import com.moovit.tripplanner.TripPlannerLocations;
import com.moovit.view.p340cc.C7959a;
import com.moovit.view.p340cc.CreditCardFormView;
import com.tranzmate.R;
import ja0.C12797f;
import java.util.HashMap;
import java.util.Map;
import p028ba.C1510d;
import p277ub.C6774a0;
import p373au.C13521a;
import p495fq.C17058c;
import p523gu.C17231c;
import p543hq.C17474b;
import p644lx.C18296j;
import p977zz.C20927a0;
import p977zz.C20935e;
import z80.C13341b;

/* renamed from: com.google.android.exoplayer2.ui.t */
public final /* synthetic */ class C4054t implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f14507b;

    /* renamed from: c */
    public final /* synthetic */ Object f14508c;

    /* renamed from: d */
    public final /* synthetic */ Object f14509d;

    public /* synthetic */ C4054t(int i, Object obj, Object obj2) {
        this.f14507b = i;
        this.f14508c = obj;
        this.f14509d = obj2;
    }

    public final void onClick(View view) {
        DefaultTrackSelector defaultTrackSelector;
        Uri f;
        switch (this.f14507b) {
            case 0:
                StyledPlayerControlView.C4019k kVar = (StyledPlayerControlView.C4019k) this.f14508c;
                StyledPlayerControlView.C4018j jVar = (StyledPlayerControlView.C4018j) this.f14509d;
                if (kVar.f14387i != null && (defaultTrackSelector = StyledPlayerControlView.this.f14297E0) != null) {
                    DefaultTrackSelector.Parameters d = defaultTrackSelector.mo16302d();
                    d.getClass();
                    DefaultTrackSelector.C3989c cVar = new DefaultTrackSelector.C3989c(d);
                    for (int i = 0; i < kVar.f14385g.size(); i++) {
                        int intValue = kVar.f14385g.get(i).intValue();
                        if (intValue == jVar.f14380a) {
                            C4000c.C4001a aVar = kVar.f14387i;
                            aVar.getClass();
                            TrackGroupArray trackGroupArray = aVar.f14148c[intValue];
                            DefaultTrackSelector.SelectionOverride selectionOverride = new DefaultTrackSelector.SelectionOverride(jVar.f14381b, jVar.f14382c);
                            Map map = cVar.f14090H.get(intValue);
                            if (map == null) {
                                map = new HashMap();
                                cVar.f14090H.put(intValue, map);
                            }
                            if (!map.containsKey(trackGroupArray) || !C6774a0.m15941a(map.get(trackGroupArray), selectionOverride)) {
                                map.put(trackGroupArray, selectionOverride);
                            }
                            cVar.mo16324e(intValue, false);
                        } else {
                            cVar.mo16321b(intValue);
                            cVar.mo16324e(intValue, true);
                        }
                    }
                    DefaultTrackSelector defaultTrackSelector2 = StyledPlayerControlView.this.f14297E0;
                    defaultTrackSelector2.getClass();
                    defaultTrackSelector2.mo16303i(cVar);
                    kVar.mo16567l(jVar.f14383d);
                    StyledPlayerControlView.this.f14291B0.dismiss();
                    return;
                }
                return;
            case 1:
                HistoricalCarpoolRide historicalCarpoolRide = (HistoricalCarpoolRide) this.f14509d;
                C14812a.C14813a aVar2 = ((C14812a) this.f14508c).f37785h;
                if (aVar2 != null) {
                    CarpoolHistoryActivity carpoolHistoryActivity = (CarpoolHistoryActivity) aVar2;
                    C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar3.mo49939g(AnalyticsAttributeKey.TYPE, "carpool_ride_clicked");
                    aVar3.mo49937e(AnalyticsAttributeKey.CARPOOL_RIDE_ID, historicalCarpoolRide.f40942b.f40910b);
                    carpoolHistoryActivity.mo44545v2(aVar3.mo49933a());
                    int i2 = CarpoolRideDetailsActivity.f37829A0;
                    carpoolHistoryActivity.startActivity(CarpoolRideDetailsActivity.m37357A2(carpoolHistoryActivity, historicalCarpoolRide.mo46811a0().f40910b, historicalCarpoolRide.mo46813q0(), (TripPlannerLocations) null, (Itinerary) null, false));
                    return;
                }
                return;
            case 2:
                UserCreationFailureActivity userCreationFailureActivity = (UserCreationFailureActivity) this.f14508c;
                int i3 = UserCreationFailureActivity.f38450X;
                userCreationFailureActivity.getClass();
                userCreationFailureActivity.mo44545v2(new C17474b(AnalyticsEventKey.LOCATION_SETTINGS_CLICKED));
                ((C16202a.C16203a) this.f14509d).mo48510d(userCreationFailureActivity, new C17058c(userCreationFailureActivity, 2));
                return;
            case 3:
                MultiTransitLinesLeg multiTransitLinesLeg = (MultiTransitLinesLeg) this.f14509d;
                SingleLegCard.C15073a aVar4 = ((SingleLegCard) this.f14508c).f38680P;
                if (aVar4 != null) {
                    ItineraryStepsBaseActivity itineraryStepsBaseActivity = (ItineraryStepsBaseActivity) aVar4;
                    C17474b.C17475a aVar5 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar5.mo49939g(AnalyticsAttributeKey.TYPE, "change_line_clicked");
                    aVar5.mo49935c(AnalyticsAttributeKey.NUM_OF_ALTERNATIVES, multiTransitLinesLeg.f42086b.size());
                    itineraryStepsBaseActivity.mo44545v2(aVar5.mo49933a());
                    int i4 = C13521a.f33438j;
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("multiTransitLinesLeg", multiTransitLinesLeg);
                    C13521a aVar6 = new C13521a();
                    aVar6.setArguments(bundle);
                    aVar6.show(itineraryStepsBaseActivity.getSupportFragmentManager(), "choose_primary_transit_leg_dialog_tag");
                    return;
                }
                return;
            case 4:
                int i5 = C15083h.f38714D;
                ((C15083h) this.f14508c).mo45371D(view, (MultiTransitLinesLeg) this.f14509d, (Leg) null);
                return;
            case 5:
                C12797f fVar = (C12797f) this.f14509d;
                C17231c.C17232a aVar7 = ((C17231c) this.f14508c).f44550t;
                if (aVar7 != null) {
                    ((C15101a) aVar7).mo45447B2(fVar, false);
                    return;
                }
                return;
            case 6:
                DocklessVehicleBottomSheetDialog docklessVehicleBottomSheetDialog = (DocklessVehicleBottomSheetDialog) this.f14508c;
                LatLonE6 latLonE6 = (LatLonE6) this.f14509d;
                int i6 = DocklessVehicleBottomSheetDialog.f38877w;
                docklessVehicleBottomSheetDialog.getClass();
                C17474b.C17475a aVar8 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar8.mo49939g(AnalyticsAttributeKey.TYPE, "location_clicked");
                docklessVehicleBottomSheetDialog.mo22564R1(aVar8.mo49933a());
                Context context = docklessVehicleBottomSheetDialog.getContext();
                if (context != null && (f = C7530f.m17273f(LocationDescriptor.m17770k(latLonE6))) != null) {
                    Intent intent = new Intent();
                    intent.setData(f);
                    intent.setPackage(context.getPackageName());
                    if (intent.resolveActivity(context.getPackageManager()) != null) {
                        docklessVehicleBottomSheetDialog.startActivity(intent);
                        docklessVehicleBottomSheetDialog.dismissAllowingStateLoss();
                        return;
                    }
                    intent.setPackage((String) null);
                    docklessVehicleBottomSheetDialog.startActivity(Intent.createChooser(intent, context.getString(R.string.open_file_chooser)));
                    docklessVehicleBottomSheetDialog.dismissAllowingStateLoss();
                    return;
                }
                return;
            case 7:
                MotQrCodeScanActivity motQrCodeScanActivity = (MotQrCodeScanActivity) this.f14508c;
                int i7 = MotQrCodeScanActivity.f39030U;
                motQrCodeScanActivity.getClass();
                C17474b.C17475a aVar9 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar9.mo49939g(AnalyticsAttributeKey.TYPE, "mot_qr_technical_support_clicked");
                motQrCodeScanActivity.mo44545v2(aVar9.mo49933a());
                C20927a0.m49017l(motQrCodeScanActivity, C20927a0.m49011f((String) this.f14509d));
                return;
            case 8:
                TodZone todZone = (TodZone) this.f14509d;
                C18296j jVar2 = C18296j.this;
                int i8 = C18296j.f46657s;
                jVar2.getClass();
                C17474b.C17475a aVar10 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar10.mo49939g(AnalyticsAttributeKey.TYPE, "continue_clicked");
                aVar10.mo49935c(AnalyticsAttributeKey.ZONE_ID, todZone.f40447b.f15142b);
                jVar2.mo46797j2(aVar10.mo49933a());
                TodShuttleBookingState n2 = jVar2.mo50675n2();
                n2.f40399b = todZone;
                n2.f40400c = -1;
                n2.f40401d = null;
                n2.f40402e = -1;
                n2.f40403f = -1;
                jVar2.mo50678q2();
                return;
            case 9:
                OnBoardingCampaignActivity onBoardingCampaignActivity = (OnBoardingCampaignActivity) this.f14508c;
                OnBoardingCampaignScreenInfo onBoardingCampaignScreenInfo = (OnBoardingCampaignScreenInfo) this.f14509d;
                int i9 = OnBoardingCampaignActivity.f40560U;
                onBoardingCampaignActivity.getClass();
                Uri uri = ((AppDeepLink) onBoardingCampaignScreenInfo.f40565f.f52693b).f40998c;
                C17474b.C17475a aVar11 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar11.mo49939g(AnalyticsAttributeKey.TYPE, "secondary_action_clicked");
                aVar11.mo49939g(AnalyticsAttributeKey.ACTION, (String) onBoardingCampaignScreenInfo.f40565f.f52692a);
                aVar11.mo49944l(AnalyticsAttributeKey.URI, uri);
                onBoardingCampaignActivity.mo44545v2(aVar11.mo49933a());
                if (uri != null) {
                    ((AppDeepLink) onBoardingCampaignScreenInfo.f40565f.f52693b).mo46946c(view.getContext());
                }
                onBoardingCampaignActivity.finish();
                return;
            case 10:
                C13341b bVar = (C13341b) this.f14508c;
                int i11 = C13341b.f33130n;
                bVar.getClass();
                C7959a b = ((CreditCardFormView) this.f14509d).mo24788b();
                if (b == null) {
                    bVar.mo40233m2(false);
                    return;
                }
                bVar.mo40233m2(true);
                bVar.mo46786U1(PurchaseSplitActivity.class, new C1510d(5, bVar, b));
                return;
            default:
                PurchaseFilter purchaseFilter = (PurchaseFilter) this.f14509d;
                C20935e<PurchaseFilter> eVar = ((C7562a) this.f14508c).f23050l;
                if (eVar != null) {
                    eVar.invoke(purchaseFilter);
                    return;
                }
                return;
        }
    }
}
