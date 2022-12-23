package p019b0;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.webkit.PermissionRequest;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0206a;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import c00.C13720d;
import c00.C13721e;
import c00.C13723g;
import com.appboy.Appboy;
import com.appboy.IAppboyEndpointProvider;
import com.facebook.login.C2477i;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.MoovitApplication;
import com.moovit.MoovitExecutors;
import com.moovit.app.MoovitAppApplication;
import com.moovit.app.intro.UserCreationFailureActivity;
import com.moovit.app.subscription.C15364b;
import com.moovit.app.subscription.MoovitSubscriptionsManager;
import com.moovit.app.subscription.SubscriptionsActivity;
import com.moovit.app.subscription.model.SubscriptionDetails;
import com.moovit.app.suggestedroutes.C15374a;
import com.moovit.app.suggestedroutes.SuggestRoutesActivity;
import com.moovit.app.suggestedroutes.TripPlanOptions;
import com.moovit.app.tripplanner.C15581b;
import com.moovit.location.C16202a;
import com.moovit.location.LocationSettingsFixer;
import com.moovit.payment.registration.steps.profile.certificate.ProfileCertificateData;
import h90.C12740b;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import ka0.C12822a;
import lf0.C24236l;
import mf0.C24362h;
import p450dt.C16701b;
import p501fw.C17103b;
import p501fw.C17104c;
import p501fw.C17113k;
import p555ie.C17589h;
import p572iw.C17666h;
import p578jf.C17844v;
import p732pq.C18947h;
import p80.C12991b;
import p977zz.C20944i0;
import p977zz.C20949l;
import s60.C19433a;
import t60.C19634d;
import t60.C19636e;

/* renamed from: b0.m */
public final /* synthetic */ class C1436m implements CallbackToFutureAdapter.C0674b, IAppboyEndpointProvider, C0206a, C16202a.C16205c, C20949l, SuccessContinuation, C13721e {

    /* renamed from: b */
    public final /* synthetic */ int f5287b;

    /* renamed from: c */
    public final /* synthetic */ Object f5288c;

    public /* synthetic */ C1436m(Object obj, int i) {
        this.f5287b = i;
        this.f5288c = obj;
    }

    public Object attachCompleter(CallbackToFutureAdapter.C0673a aVar) {
        switch (this.f5287b) {
            case 0:
                C1438o oVar = (C1438o) this.f5288c;
                oVar.f5296d = aVar;
                return "WaitForRepeatingRequestStart[" + oVar + "]";
            default:
                DeferrableSurface deferrableSurface = (DeferrableSurface) this.f5288c;
                synchronized (deferrableSurface.f1924a) {
                    deferrableSurface.f1927d = aVar;
                }
                return "DeferrableSurface-termination(" + deferrableSurface + ")";
        }
    }

    /* renamed from: b */
    public void mo771b(Object obj) {
        switch (this.f5287b) {
            case 3:
                C24236l lVar = (C24236l) this.f5288c;
                int i = C2477i.f8862g;
                C24362h.m61211f(lVar, "$tmp0");
                lVar.invoke((ActivityResult) obj);
                return;
            default:
                Map map = (Map) obj;
                PermissionRequest andSet = ((C12822a) this.f5288c).f31699b.getAndSet((Object) null);
                if (andSet != null) {
                    ArrayList c = C13720d.m34273c(Arrays.asList(andSet.getResources()), new C18947h(map, 8), C13720d.f33796a);
                    andSet.grant((String[]) c.toArray(new String[c.size()]));
                    return;
                }
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: android.util.SparseArray} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: android.util.SparseArray} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: android.util.SparseArray} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: com.moovit.app.tod.model.TodRideVehicle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: android.util.SparseArray} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: android.util.SparseArray} */
    /* JADX WARNING: type inference failed for: r2v13, types: [com.moovit.app.tod.model.TodRideVehicle] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object convert(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            int r1 = r0.f5287b
            r2 = 0
            switch(r1) {
                case 0: goto L_0x00f3;
                case 1: goto L_0x00ce;
                case 2: goto L_0x0026;
                case 3: goto L_0x000a;
                default: goto L_0x0008;
            }
        L_0x0008:
            goto L_0x010d
        L_0x000a:
            java.lang.Object r1 = r0.f5288c
            ox.i r1 = (p715ox.C18859i) r1
            r3 = r23
            com.tranzmate.moovit.protocol.tod.shuttles.MVTodZoneDaySchedule r3 = (com.tranzmate.moovit.protocol.tod.shuttles.MVTodZoneDaySchedule) r3
            long r4 = r3.day
            java.util.List<com.tranzmate.moovit.protocol.tod.shuttles.MVTodShuttleTrip> r3 = r3.trips
            hw.e r6 = new hw.e
            r7 = 2
            r6.<init>(r1, r7)
            java.util.ArrayList r1 = c00.C13720d.m34273c(r3, r2, r6)
            com.moovit.app.tod.shuttle.model.TodZoneDaySchedule r2 = new com.moovit.app.tod.shuttle.model.TodZoneDaySchedule
            r2.<init>(r4, r1)
            return r2
        L_0x0026:
            java.lang.Object r1 = r0.f5288c
            android.content.Context r1 = (android.content.Context) r1
            r3 = r23
            com.tranzmate.moovit.protocol.tod.passenger.MVTodOrderAssignment r3 = (com.tranzmate.moovit.protocol.tod.passenger.MVTodOrderAssignment) r3
            int r4 = r3.taxiProviderId
            com.moovit.network.model.ServerId r6 = new com.moovit.network.model.ServerId
            r6.<init>(r4)
            android.content.Context r4 = r1.getApplicationContext()
            com.moovit.app.taxi.providers.TaxiProvidersManager r4 = com.moovit.app.taxi.providers.TaxiProvidersManager.m39496b(r4)
            r5 = 2131231613(0x7f08037d, float:1.8079312E38)
            r7 = 0
            if (r4 != 0) goto L_0x004b
            com.moovit.image.model.ResourceImage r4 = new com.moovit.image.model.ResourceImage
            java.lang.String[] r8 = new java.lang.String[r7]
            r4.<init>(r5, r8)
            goto L_0x005b
        L_0x004b:
            com.moovit.app.taxi.providers.TaxiProvider r4 = r4.mo46163c(r6)
            if (r4 != 0) goto L_0x0059
            com.moovit.image.model.ResourceImage r4 = new com.moovit.image.model.ResourceImage
            java.lang.String[] r8 = new java.lang.String[r7]
            r4.<init>(r5, r8)
            goto L_0x005b
        L_0x0059:
            com.moovit.image.model.Image r4 = r4.f39972g
        L_0x005b:
            boolean r5 = r3.mo33484v()
            if (r5 == 0) goto L_0x0069
            com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicle r5 = r3.vehicle
            boolean r5 = r5.isAutonomous
            if (r5 == 0) goto L_0x0069
            r5 = 1
            goto L_0x006a
        L_0x0069:
            r5 = 0
        L_0x006a:
            android.content.Context r8 = r1.getApplicationContext()
            com.moovit.app.taxi.providers.TaxiProvidersManager r8 = com.moovit.app.taxi.providers.TaxiProvidersManager.m39496b(r8)
            if (r8 == 0) goto L_0x0079
            com.moovit.app.taxi.providers.TaxiProvider r8 = r8.mo46163c(r6)
            goto L_0x007a
        L_0x0079:
            r8 = r2
        L_0x007a:
            if (r8 == 0) goto L_0x007f
            com.moovit.app.taxi.providers.TaxiTripPlanConfig r8 = r8.f39977l
            goto L_0x0080
        L_0x007f:
            r8 = r2
        L_0x0080:
            if (r8 == 0) goto L_0x0085
            com.moovit.image.model.Image r8 = r8.f39993g
            goto L_0x0086
        L_0x0085:
            r8 = r2
        L_0x0086:
            if (r8 == 0) goto L_0x0089
            goto L_0x0099
        L_0x0089:
            com.moovit.image.model.ResourceImage r8 = new com.moovit.image.model.ResourceImage
            if (r5 == 0) goto L_0x0091
            r5 = 2131231816(0x7f080448, float:1.8079724E38)
            goto L_0x0094
        L_0x0091:
            r5 = 2131231830(0x7f080456, float:1.8079752E38)
        L_0x0094:
            java.lang.String[] r7 = new java.lang.String[r7]
            r8.<init>(r5, r7)
        L_0x0099:
            java.lang.String r9 = r3.rideId
            long r10 = r3.pickupTime
            long r12 = r3.dropoffTime
            com.tranzmate.moovit.protocol.tod.passenger.MVTodRideJourneyInfo r5 = r3.journeyInfo
            com.moovit.app.tod.model.TodRideJourney r14 = p596jx.C17964m.m44595b(r5)
            boolean r5 = r3.mo33484v()
            if (r5 == 0) goto L_0x00b1
            com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicle r2 = r3.vehicle
            com.moovit.app.tod.model.TodRideVehicle r2 = p596jx.C17964m.m44599f(r1, r2, r6)
        L_0x00b1:
            r15 = r2
            com.tranzmate.moovit.protocol.common.MVCurrencyAmount r1 = r3.price
            com.moovit.util.CurrencyAmount r16 = c70.C13749c.m34318d(r1)
            boolean r1 = r3.isReservation
            r2 = r1
            long r0 = r3.reservationLockTime
            java.lang.String r3 = r3.faresExplanationURL
            com.moovit.app.tod.model.TodOrderAssignment r21 = new com.moovit.app.tod.model.TodOrderAssignment
            r5 = r21
            r7 = r4
            r17 = r2
            r18 = r0
            r20 = r3
            r5.<init>(r6, r7, r8, r9, r10, r12, r14, r15, r16, r17, r18, r20)
            return r21
        L_0x00ce:
            java.lang.Object r1 = r0.f5288c
            java.util.Map r1 = (java.util.Map) r1
            r2 = r23
            com.moovit.itinerary.model.leg.WaitToTransitLineLeg r2 = (com.moovit.itinerary.model.leg.WaitToTransitLineLeg) r2
            int r3 = com.moovit.app.itinerary.view.SingleLegCard.f38664n0
            com.moovit.database.DbEntityRef<com.moovit.transit.TransitLine> r3 = r2.f42135f
            com.moovit.network.model.ServerId r3 = r3.getServerId()
            java.lang.Object r1 = r1.get(r3)
            yy.c r1 = (p952yy.C20787c) r1
            if (r1 == 0) goto L_0x00e9
            com.moovit.transit.Schedule r1 = r1.f52458c
            goto L_0x00ed
        L_0x00e9:
            com.moovit.itinerary.model.leg.WaitToTransitLineLeg$DeparturesInfo r1 = r2.f42138i
            com.moovit.transit.Schedule r1 = r1.f42142b
        L_0x00ed:
            zz.i0 r3 = new zz.i0
            r3.<init>(r2, r1)
            return r3
        L_0x00f3:
            java.lang.Object r1 = r0.f5288c
            com.moovit.app.taxi.providers.TaxiProvidersManager r1 = (com.moovit.app.taxi.providers.TaxiProvidersManager) r1
            r2 = r23
            com.moovit.itinerary.model.leg.Leg r2 = (com.moovit.itinerary.model.leg.Leg) r2
            int r3 = p924xt.C20598h.f52097z
            com.moovit.itinerary.model.leg.TaxiLeg r2 = (com.moovit.itinerary.model.leg.TaxiLeg) r2
            com.moovit.network.model.ServerId r2 = r2.f42097b
            com.moovit.app.taxi.providers.TaxiProvider r1 = r1.mo46163c(r2)
            if (r1 == 0) goto L_0x010a
            java.lang.String r1 = r1.f39968c
            goto L_0x010c
        L_0x010a:
            java.lang.String r1 = "none"
        L_0x010c:
            return r1
        L_0x010d:
            java.lang.Object r1 = r0.f5288c
            p80.b r1 = (p80.C12991b) r1
            r3 = r23
            com.tranzmate.moovit.protocol.ticketingV2.MVSuggestedTicketFareRef r3 = (com.tranzmate.moovit.protocol.ticketingV2.MVSuggestedTicketFareRef) r3
            sz.r r4 = q80.C13036y.f32248a
            java.lang.String r8 = r3.fareId
            int r4 = r3.providerId
            com.moovit.network.model.ServerId r6 = new com.moovit.network.model.ServerId
            r6.<init>(r4)
            int r4 = r3.metroId
            com.moovit.network.model.ServerId r7 = new com.moovit.network.model.ServerId
            r7.<init>(r4)
            java.lang.String r9 = r3.name
            com.tranzmate.moovit.protocol.common.MVCurrencyAmount r4 = r3.price
            com.moovit.util.CurrencyAmount r11 = c70.C13749c.m34318d(r4)
            java.lang.String r4 = r3.agencyKey
            com.moovit.ticketing.ticket.TicketAgency r10 = q80.C13036y.m32958j(r1, r6, r4)
            boolean r1 = r3.mo32977j()
            if (r1 == 0) goto L_0x015c
            com.tranzmate.moovit.protocol.ticketingV2.MVProviderSpecificData r1 = r3.data
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            java.util.List<com.tranzmate.moovit.protocol.ticketingV2.MVProviderData> r1 = r1.data
            java.util.Iterator r1 = r1.iterator()
        L_0x0148:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x015c
            java.lang.Object r4 = r1.next()
            com.tranzmate.moovit.protocol.ticketingV2.MVProviderData r4 = (com.tranzmate.moovit.protocol.ticketingV2.MVProviderData) r4
            short r5 = r4.f28757id
            java.lang.String r4 = r4.data
            r2.append(r5, r4)
            goto L_0x0148
        L_0x015c:
            r13 = r2
            com.moovit.ticketing.purchase.fare.SuggestedTicketFare r1 = new com.moovit.ticketing.purchase.fare.SuggestedTicketFare
            java.util.List<com.tranzmate.moovit.protocol.ticketingV2.MVFilter> r2 = r3.appliedFilters
            com.moovit.ticketing.purchase.filter.PurchaseFilters r12 = q80.C13036y.m32950b(r2)
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p019b0.C1436m.convert(java.lang.Object):java.lang.Object");
    }

    public Uri getApiEndpoint(Uri uri) {
        return Appboy.m5378a((String) this.f5288c, uri);
    }

    /* renamed from: h */
    public void mo5770h(int i, Object obj) {
        switch (this.f5287b) {
            case 5:
                UserCreationFailureActivity userCreationFailureActivity = (UserCreationFailureActivity) this.f5288c;
                MoovitActivity moovitActivity = (MoovitActivity) obj;
                int i2 = UserCreationFailureActivity.f38450X;
                userCreationFailureActivity.getClass();
                if (i == 0) {
                    MoovitAppApplication x = MoovitAppApplication.m37038x();
                    Intent y2 = userCreationFailureActivity.mo45252y2();
                    x.f37321e.mo50689b("USER_CONTEXT");
                    x.mo44574v(userCreationFailureActivity, y2);
                    return;
                }
                return;
            default:
                LocationSettingsFixer locationSettingsFixer = (LocationSettingsFixer) this.f5288c;
                C15682c cVar = (C15682c) obj;
                locationSettingsFixer.getClass();
                locationSettingsFixer.mo48522c(cVar.f40822c, cVar, i, true);
                return;
        }
    }

    public boolean invoke(Object obj) {
        switch (this.f5287b) {
            case 6:
                SubscriptionsActivity subscriptionsActivity = (SubscriptionsActivity) obj;
                BigDecimal bigDecimal = C17113k.f44286p;
                SubscriptionDetails subscriptionDetails = (SubscriptionDetails) ((C20944i0) this.f5288c).f52692a;
                subscriptionsActivity.mo44543u2((CharSequence) null);
                C15364b bVar = subscriptionsActivity.f39778X;
                bVar.f39781c.mo4295e(subscriptionDetails, "active_subscription");
                MoovitSubscriptionsManager c = MoovitSubscriptionsManager.m39315c((MoovitApplication) bVar.f3907b);
                c.getClass();
                ExecutorService executorService = MoovitExecutors.COMPUTATION;
                Task call = Tasks.call(executorService, new C17103b(c, 0));
                Task call2 = Tasks.call(executorService, new C17589h(subscriptionDetails, 2));
                Tasks.whenAllComplete((Task<?>[]) new Task[]{call, call}).addOnSuccessListener((Activity) subscriptionsActivity, new C17104c(c, call, call2, subscriptionsActivity, 0)).addOnFailureListener((Activity) subscriptionsActivity, (OnFailureListener) new C17844v(c, 2));
                return true;
            case 7:
                C15374a aVar = (C15374a) this.f5288c;
                String str = aVar.f39823h;
                ((C15374a.C15375a) obj).mo45973X(aVar.f39824i[aVar.f39826k.getValue()]);
                return true;
            case 8:
                TripPlanOptions tripPlanOptions = (TripPlanOptions) this.f5288c;
                int i = C17666h.f45402O;
                C15581b E2 = ((SuggestRoutesActivity) obj).mo46520E2();
                if (E2 != null) {
                    E2.mo46541p2(tripPlanOptions, 0);
                }
                return false;
            case 10:
                String str2 = C19433a.f49434n;
                ((C19433a.C19434a) obj).mo51844Z();
                return true;
            default:
                int i2 = C19636e.f49821r;
                ((C19634d.C19635a) obj).mo51973P((ProfileCertificateData) this.f5288c);
                return true;
        }
    }

    public Task then(Object obj) {
        int i = C12740b.f31473s;
        return Tasks.forResult(C13723g.m34282c((List) obj, new C16701b((C12991b) this.f5288c, 4)));
    }
}
