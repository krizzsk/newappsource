package p028ba;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0206a;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import c00.C13720d;
import c00.C13721e;
import c00.C13722f;
import c70.C13749c;
import com.android.billingclient.api.C1949f;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.C15682c;
import com.moovit.MoovitExecutors;
import com.moovit.app.actions.livelocation.LiveLocationTransitStopChooserFragment;
import com.moovit.app.home.dashboard.C14940f;
import com.moovit.app.home.dashboard.C14951n;
import com.moovit.app.itinerary.suggestion.TripPlanSuggestionView;
import com.moovit.app.mot.model.MotActivationRegionalFare;
import com.moovit.app.stopdetail.StopDetailActivity;
import com.moovit.app.subscription.MoovitSubscriptionsManager;
import com.moovit.app.tod.shuttle.booking.TodShuttleBookingActivity;
import com.moovit.commons.geo.Polygon;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.location.C16202a;
import com.moovit.location.LocationAlertFragment;
import com.moovit.location.mappicker.MapLocationPickerActivity;
import com.moovit.map.MapFragment;
import com.moovit.map.items.MapItem;
import com.moovit.network.model.ServerId;
import com.moovit.payment.clearance.tokenization.TokenizeStatusObserver;
import com.moovit.payment.confirmation.options.PaymentOptions;
import com.moovit.payment.confirmation.summary.PaymentSummaryInfo;
import com.moovit.transit.LocationDescriptor;
import com.moovit.transit.TransitStop;
import com.tranzmate.moovit.protocol.ptb.activations.MVPTBFare;
import com.veriff.sdk.camera.core.impl.DeferrableSurface;
import d80.C12606i;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import m50.C18327c;
import mf0.C24362h;
import n50.C18524c;
import p041ca.C1835u;
import p054d0.C4291k0;
import p063da.C4407a;
import p173ma.C5722a;
import p173ma.C5744o;
import p237r9.C6269b;
import p277ub.C6774a0;
import p435de.C16591a;
import p483fe.C16953a;
import p660mq.C18421e;
import p926xv.C20630k;
import p950yw.C20776c;
import p977zz.C20944i0;
import p977zz.C20949l;
import v20.C20082a;
import w50.C20283g;
import z70.C13321a;

/* renamed from: ba.g */
public final /* synthetic */ class C1513g implements C4407a.C4408a, C1835u.C1836a, C5722a.C5726d, C16953a, C20949l, SwipeRefreshLayout.C1274f, SuccessContinuation, C0206a, C16202a.C16205c, MapFragment.C16226h, CallbackToFutureAdapter.C0674b, C13721e {

    /* renamed from: b */
    public final /* synthetic */ int f5437b;

    /* renamed from: c */
    public final /* synthetic */ Object f5438c;

    public /* synthetic */ C1513g(Object obj, int i) {
        this.f5437b = i;
        this.f5438c = obj;
    }

    /* renamed from: C */
    public Object mo309C() {
        ((C1515i) this.f5438c).f5450i.mo6642e();
        return null;
    }

    /* renamed from: a */
    public long mo5857a(long j) {
        C5744o oVar = (C5744o) this.f5438c;
        return C6774a0.m15948h((j * ((long) oVar.f18606e)) / 1000000, 0, oVar.f18611j - 1);
    }

    public Object apply(Object obj) {
        C1835u uVar = (C1835u) this.f5438c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        C6269b bVar = C1835u.f6351g;
        uVar.getClass();
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + uVar.f6353c.mo20139V()).execute();
        return null;
    }

    public Object attachCompleter(CallbackToFutureAdapter.C0673a aVar) {
        return ((DeferrableSurface) this.f5438c).lambda$new$0(aVar);
    }

    /* renamed from: b */
    public void mo771b(Object obj) {
        TodShuttleBookingActivity todShuttleBookingActivity = (TodShuttleBookingActivity) this.f5438c;
        ActivityResult activityResult = (ActivityResult) obj;
        int i = TodShuttleBookingActivity.f40374l0;
        todShuttleBookingActivity.getClass();
        if (activityResult != null && activityResult.f528b == -1) {
            todShuttleBookingActivity.setResult(-1);
            todShuttleBookingActivity.finish();
        }
    }

    /* renamed from: c */
    public boolean mo5858c(MapItem mapItem) {
        int i = MapLocationPickerActivity.f42272q0;
        return !((Set) this.f5438c).contains(mapItem.f42550c);
    }

    public Object convert(Object obj) {
        switch (this.f5437b) {
            case 0:
                Itinerary itinerary = (Itinerary) obj;
                int i = C14940f.f38219G;
                Context requireContext = ((C14940f) this.f5438c).requireContext();
                int i2 = TripPlanSuggestionView.f38632x;
                TripPlanSuggestionView.C15068a aVar = new TripPlanSuggestionView.C15068a(requireContext, itinerary);
                for (Leg i0 : itinerary.mo48295u0()) {
                    TripPlanSuggestionView tripPlanSuggestionView = (TripPlanSuggestionView) i0.mo48338i0(aVar);
                    if (tripPlanSuggestionView != null) {
                        return tripPlanSuggestionView;
                    }
                }
                return null;
            case 1:
                MVPTBFare mVPTBFare = (MVPTBFare) obj;
                return new MotActivationRegionalFare(new ServerId(mVPTBFare.fareCode), mVPTBFare.radius, C13749c.m34327m(mVPTBFare.color), C13720d.m34273c(mVPTBFare.regionPrices, (C13722f) null, new C4291k0((SparseArray) this.f5438c, 0)));
            default:
                return C13720d.m34273c((Polygon) obj, (C13722f) null, ((C20082a) this.f5438c).f50946b);
        }
    }

    /* renamed from: h */
    public void mo5770h(int i, Object obj) {
        LocationAlertFragment locationAlertFragment = (LocationAlertFragment) this.f5438c;
        C15682c cVar = (C15682c) obj;
        int i2 = LocationAlertFragment.f42235x;
        if (locationAlertFragment.isResumed()) {
            locationAlertFragment.mo48518m2();
        }
    }

    public boolean invoke(Object obj) {
        switch (this.f5437b) {
            case 5:
                int i = LiveLocationTransitStopChooserFragment.f37422j;
                ServerId serverId = ((TransitStop) this.f5438c).f23730b;
                C24362h.m61210e(serverId, "stop.serverId");
                ((C18421e) obj).mo50875D2(serverId);
                return true;
            default:
                ((C20630k.C20631a) obj).mo45423q(((C20630k) this.f5438c).f52158j);
                return true;
        }
    }

    /* renamed from: n */
    public void mo5859n(Bundle bundle) {
        ((C16591a) this.f5438c).f43235a.mo5859n(bundle);
    }

    public void onRefresh() {
        StopDetailActivity stopDetailActivity = (StopDetailActivity) this.f5438c;
        stopDetailActivity.f39663q0.setRefreshing(true);
        stopDetailActivity.mo45903F2();
    }

    public Task then(Object obj) {
        LocationDescriptor locationDescriptor;
        MoovitSubscriptionsManager.C15359b bVar;
        switch (this.f5437b) {
            case 8:
                C1949f fVar = (C1949f) this.f5438c;
                MoovitSubscriptionsManager.C15361d dVar = (MoovitSubscriptionsManager.C15361d) obj;
                HashSet hashSet = MoovitSubscriptionsManager.f39757g;
                int i = fVar.f6770a;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 7) {
                            if (i != 8) {
                                StringBuilder r = C25541a.m63887r("Unable to subscribe, responseCode=", i, ", msg=");
                                r.append(fVar.f6771b);
                                throw new IOException(r.toString());
                            }
                        }
                    }
                    bVar = new MoovitSubscriptionsManager.C15359b(true, (MoovitSubscriptionsManager.C15361d) null);
                    return Tasks.forResult(bVar);
                }
                bVar = new MoovitSubscriptionsManager.C15359b(true, dVar);
                return Tasks.forResult(bVar);
            case 12:
                C18327c cVar = (C18327c) this.f5438c;
                C18524c cVar2 = (C18524c) obj;
                int i2 = C18327c.f46734x;
                cVar.getClass();
                cVar.f46735u = cVar2.f47144m;
                String str = cVar2.f47147p;
                cVar.f46736v = str;
                if (str != null) {
                    TokenizeStatusObserver.m41610a(cVar, cVar.mo46783R1(), cVar.f46736v, new C14951n(cVar, 2));
                }
                return Tasks.forResult(new C20944i0(cVar2.f47145n, cVar2.f47146o));
            case 13:
                BigDecimal bigDecimal = C20283g.f51427r;
                return Tasks.call(MoovitExecutors.COMPUTATION, new C20776c((PaymentOptions) this.f5438c, (PaymentSummaryInfo) obj, 2));
            default:
                C13321a aVar = (C13321a) this.f5438c;
                C12606i iVar = (C12606i) obj;
                if (iVar != null && (locationDescriptor = iVar.f31153f) != null) {
                    return Tasks.forResult(locationDescriptor);
                }
                StringBuilder k = C13555b.m33972k("Unable to find place id: ");
                k.append(aVar.f33070b);
                return Tasks.forException(new IllegalStateException(k.toString()));
        }
    }
}
