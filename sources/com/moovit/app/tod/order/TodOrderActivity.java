package com.moovit.app.tod.order;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.C0436m1;
import androidx.lifecycle.C1026n0;
import b00.C13556a;
import c00.C13717b;
import c70.C13752e;
import ce0.C21100e;
import com.appboy.Constants;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.play.core.appupdate.C14226d;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.taxi.providers.TaxiOrderConfig;
import com.moovit.app.taxi.providers.TaxiOrderProfile;
import com.moovit.app.taxi.providers.TaxiProvider;
import com.moovit.app.taxi.providers.TaxiProvidersManager;
import com.moovit.app.tod.TodRideActivity;
import com.moovit.app.tod.model.TodOrder;
import com.moovit.app.tod.model.TodOrderAssignment;
import com.moovit.app.tod.model.TodOrderConfig;
import com.moovit.app.tod.model.TodRideJourney;
import com.moovit.app.tod.model.TodRideStatus;
import com.moovit.app.tod.order.C15529a;
import com.moovit.app.tod.view.TodOrderAssignmentListItemView;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.commons.utils.C15780a;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.view.FormatTextView;
import com.moovit.design.view.list.ListItemView;
import com.moovit.itinerary.C16080a;
import com.moovit.location.C16202a;
import com.moovit.map.MapFragment;
import com.moovit.map.MapOverlaysLayout;
import com.moovit.network.model.ServerId;
import com.moovit.payment.confirmation.summary.PaymentSummaryFragment;
import com.moovit.payment.gateway.AbstractPaymentGatewayActivity;
import com.moovit.payment.gateway.PaymentGatewayFragment;
import com.moovit.payment.gateway.PaymentGatewayInfo;
import com.moovit.payment.gateway.PaymentGatewayToken;
import com.moovit.payment.gateway.paymentmethod.PurchaseVerificationType;
import com.moovit.payment.registration.PaymentRegistrationActivity;
import com.moovit.payment.registration.PaymentRegistrationInstructions;
import com.moovit.payment.registration.PaymentRegistrationType;
import com.moovit.request.RequestOptions;
import com.moovit.request.UserRequestError;
import com.moovit.transit.LocationDescriptor;
import com.moovit.tripplanner.TripPlannerTime;
import com.moovit.util.CurrencyAmount;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.tripplanner.MVTimeType;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import j00.C17691i;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import k00.C17988b;
import p001a0.C0016g;
import p039c7.C1800c;
import p054d0.C4278e0;
import p073e7.C4585c;
import p090g1.C4732a;
import p241s0.C6302b;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p297w5.C6994a;
import p451du.C16704a;
import p453dw.C16740o;
import p526gx.C17253f;
import p543hq.C17474b;
import p550hx.C17511a;
import p550hx.C17514d;
import p583jk.C17884p;
import p596jx.C17951a;
import p596jx.C17953b;
import p596jx.C17962k;
import p596jx.C17963l;
import p858uz.C20061g;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p927xw.C20632a;
import p927xw.C20637f;
import p977zz.C20944i0;
import p977zz.C20964s0;
import w50.C20283g;
import y50.C20703a;
import z20.C20806a;

public class TodOrderActivity extends AbstractPaymentGatewayActivity implements PaymentGatewayFragment.C16322a, C15529a.C15530a {

    /* renamed from: D0 */
    public static final /* synthetic */ int f40331D0 = 0;

    /* renamed from: A0 */
    public C20283g f40332A0;

    /* renamed from: B0 */
    public TodOrderConfig f40333B0;

    /* renamed from: C0 */
    public boolean f40334C0;

    /* renamed from: X */
    public final C15525a f40335X = new C15525a();

    /* renamed from: Y */
    public final C15526b f40336Y = new C15526b();

    /* renamed from: Z */
    public final C15527c f40337Z = new C15527c();

    /* renamed from: l0 */
    public View f40338l0;

    /* renamed from: m0 */
    public ListItemView f40339m0;

    /* renamed from: n0 */
    public View f40340n0;

    /* renamed from: o0 */
    public ViewGroup f40341o0;

    /* renamed from: p0 */
    public FormatTextView f40342p0;

    /* renamed from: q0 */
    public ProgressBar f40343q0;

    /* renamed from: r0 */
    public MapFragment f40344r0;

    /* renamed from: s0 */
    public C20637f f40345s0;

    /* renamed from: t0 */
    public ImageView f40346t0;

    /* renamed from: u0 */
    public TodOrderInfo f40347u0;

    /* renamed from: v0 */
    public C13556a f40348v0 = null;

    /* renamed from: w0 */
    public C13556a f40349w0 = null;

    /* renamed from: x0 */
    public C20944i0<TodOrder, Animator> f40350x0 = null;

    /* renamed from: y0 */
    public TodPaymentInfo f40351y0;

    /* renamed from: z0 */
    public TodOrderAssignment f40352z0;

    /* renamed from: com.moovit.app.tod.order.TodOrderActivity$a */
    public class C15525a extends BottomSheetBehavior.C13920c {
        public C15525a() {
        }

        public final void onSlide(View view, float f) {
            TodOrderActivity todOrderActivity = TodOrderActivity.this;
            int i = TodOrderActivity.f40331D0;
            todOrderActivity.mo46400J2();
        }

        public final void onStateChanged(View view, int i) {
            TodOrderActivity todOrderActivity = TodOrderActivity.this;
            int i2 = TodOrderActivity.f40331D0;
            todOrderActivity.mo46400J2();
        }
    }

    /* renamed from: com.moovit.app.tod.order.TodOrderActivity$b */
    public class C15526b extends C20438i<C17962k, C17963l> {
        public C15526b() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C17962k kVar = (C17962k) cVar;
            TodOrderActivity.this.f40332A0.mo52456h(true);
            TodOrderActivity.this.f40348v0 = null;
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C17962k kVar = (C17962k) cVar;
            TodOrder todOrder = ((C17963l) gVar).f46040m;
            if (todOrder != null) {
                TodOrderActivity todOrderActivity = TodOrderActivity.this;
                String str = kVar.f46039z;
                int i = TodOrderActivity.f40331D0;
                todOrderActivity.getClass();
                C7925b.m18013a(todOrder.f40240c);
                List<TodOrderAssignment> list = todOrder.f40241d;
                int size = list.size();
                int childCount = todOrderActivity.f40341o0.getChildCount();
                if (childCount != size) {
                    if (childCount > size) {
                        todOrderActivity.f40341o0.removeViews(size, childCount - size);
                    } else {
                        Context context = todOrderActivity.f40341o0.getContext();
                        while (childCount < size) {
                            TodOrderAssignmentListItemView todOrderAssignmentListItemView = new TodOrderAssignmentListItemView(context, (AttributeSet) null);
                            todOrderAssignmentListItemView.setOnClickListener(new C4585c(todOrderActivity, 29));
                            todOrderActivity.f40341o0.addView(todOrderAssignmentListItemView);
                            childCount++;
                        }
                    }
                }
                for (int i2 = 0; i2 < size; i2++) {
                    TodOrderAssignment todOrderAssignment = list.get(i2);
                    TodOrderAssignmentListItemView todOrderAssignmentListItemView2 = (TodOrderAssignmentListItemView) todOrderActivity.f40341o0.getChildAt(i2);
                    todOrderAssignmentListItemView2.setActivated(false);
                    todOrderAssignmentListItemView2.setTodOrderAssignment(todOrderAssignment);
                    C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
                    aVar.mo49939g(AnalyticsAttributeKey.TYPE, "tod_order_impression");
                    aVar.mo49939g(AnalyticsAttributeKey.ID, todOrderAssignment.f40247e);
                    aVar.mo49941i(AnalyticsAttributeKey.IS_RESERVATION, todOrderAssignment.f40253k);
                    aVar.mo49939g(AnalyticsAttributeKey.ORIGIN, todOrderAssignment.f40250h.f40284b.mo24313f());
                    aVar.mo49939g(AnalyticsAttributeKey.DESTINATION, todOrderAssignment.f40250h.f40287e.mo24313f());
                    aVar.mo49945m(AnalyticsAttributeKey.PROVIDER, str);
                    TodRideJourney todRideJourney = todOrderAssignment.f40250h;
                    long j = todRideJourney.f40288f;
                    if (j > 0) {
                        aVar.mo49936d(AnalyticsAttributeKey.WALK_TO_PICKUP_TIME, j);
                    }
                    LocationDescriptor locationDescriptor = todRideJourney.f40285c;
                    if (locationDescriptor != null) {
                        aVar.mo49939g(AnalyticsAttributeKey.PICK_UP, locationDescriptor.mo24313f());
                    }
                    LocationDescriptor locationDescriptor2 = todRideJourney.f40286d;
                    if (locationDescriptor2 != null) {
                        aVar.mo49939g(AnalyticsAttributeKey.DROP_OFF, locationDescriptor2.mo24313f());
                    }
                    long j2 = todRideJourney.f40289g;
                    if (j2 > 0) {
                        aVar.mo49936d(AnalyticsAttributeKey.WALK_TO_DESTINATION_TIME, j2);
                    }
                    if (!todOrderAssignment.f40253k) {
                        aVar.mo49936d(AnalyticsAttributeKey.DURATION, TimeUnit.MILLISECONDS.toMinutes(todOrderAssignment.f40249g - todOrderAssignment.f40248f));
                    }
                    if (!todOrderAssignment.f40253k && todOrderAssignment.f40250h.f40285c != null) {
                        aVar.mo49936d(AnalyticsAttributeKey.TIME_TO_PICKUP, C7925b.m18026n(System.currentTimeMillis(), todOrderAssignment.f40248f));
                    }
                    CurrencyAmount currencyAmount = todOrderAssignment.f40252j;
                    if (currencyAmount != null) {
                        aVar.mo49936d(AnalyticsAttributeKey.BALANCE, C0016g.m19b(currencyAmount));
                    }
                    todOrderActivity.mo44545v2(aVar.mo49933a());
                }
                todOrderActivity.f40341o0.setVisibility(0);
                todOrderActivity.f40351y0 = todOrder.f40242e;
                PaymentSummaryFragment paymentSummaryFragment = (PaymentSummaryFragment) todOrderActivity.getSupportFragmentManager().mo3983z(R.id.payment_summary);
                if (paymentSummaryFragment != null) {
                    paymentSummaryFragment.f42622n.f51435i.postValue(todOrderActivity.f40351y0.f40365d);
                }
                todOrderActivity.mo46396F2((TodOrderAssignmentListItemView) todOrderActivity.f40341o0.getChildAt(0));
                todOrderActivity.mo46401z2();
                todOrderActivity.f40343q0.setVisibility(0);
                int round = Math.round((float) (todOrder.f40240c - System.currentTimeMillis()));
                todOrderActivity.f40343q0.setMax(round);
                ObjectAnimator ofInt = ObjectAnimator.ofInt(todOrderActivity.f40343q0, C17691i.f45445c, new int[]{0, round});
                ofInt.setDuration((long) round);
                ofInt.addListener(new C17511a(todOrderActivity));
                ofInt.start();
                todOrderActivity.f40350x0 = new C20944i0<>(todOrder, ofInt);
            }
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C17962k kVar = (C17962k) cVar;
            TodOrderActivity.m39676y2(TodOrderActivity.this, exc);
            return true;
        }
    }

    /* renamed from: com.moovit.app.tod.order.TodOrderActivity$c */
    public class C15527c extends C20438i<C17951a, C17953b> {
        public C15527c() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C17951a aVar = (C17951a) cVar;
            TodOrderActivity.this.mo44506I1();
            TodOrderActivity.this.f40349w0 = null;
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            CurrencyAmount currencyAmount;
            C17951a aVar = (C17951a) cVar;
            C17953b bVar = (C17953b) gVar;
            TodOrderActivity todOrderActivity = TodOrderActivity.this;
            boolean z = aVar.f46019x;
            int i = TodOrderActivity.f40331D0;
            todOrderActivity.getClass();
            PaymentRegistrationInstructions paymentRegistrationInstructions = bVar.f46023n;
            if (paymentRegistrationInstructions != null) {
                todOrderActivity.startActivity(PaymentRegistrationActivity.m41719z2(todOrderActivity, PaymentRegistrationType.PURCHASE, paymentRegistrationInstructions));
                return;
            }
            int i2 = todOrderActivity.mo46394C2().f40257c;
            CurrencyAmount currencyAmount2 = aVar.f46018w;
            C20806a.C20807a aVar2 = new C20806a.C20807a(ProductAction.ACTION_PURCHASE);
            aVar2.mo52934b("tod", "feature");
            aVar2.mo52934b(Integer.valueOf(i2), "number_of_items");
            aVar2.mo52938f(currencyAmount2);
            aVar2.mo52937e(InAppPurchaseMetaData.KEY_PRICE, currencyAmount2);
            if (currencyAmount2 != null) {
                currencyAmount = CurrencyAmount.m17929f(i2, currencyAmount2);
            } else {
                currencyAmount = null;
            }
            aVar2.mo52937e("revenue", currencyAmount);
            aVar2.mo52934b(Boolean.valueOf(z), "is_reservation");
            aVar2.mo52935c();
            if (z) {
                String str = bVar.f46022m;
                int i3 = C17514d.f45085i;
                Bundle b = C25541a.m63872b("rideId", str);
                C17514d dVar = new C17514d();
                dVar.setArguments(b);
                dVar.show(todOrderActivity.getSupportFragmentManager(), "TodOrderRideReservedDialog");
                return;
            }
            todOrderActivity.mo46398H2(bVar.f46022m);
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C17951a aVar = (C17951a) cVar;
            TodOrderActivity.m39676y2(TodOrderActivity.this, exc);
            return true;
        }
    }

    /* renamed from: D2 */
    public static boolean m39675D2(LocationDescriptor locationDescriptor) {
        if (!LocationDescriptor.LocationType.CURRENT.equals(locationDescriptor.f23647b) || !LocationDescriptor.SourceType.USER_LOCATION.equals(locationDescriptor.f23648c)) {
            return false;
        }
        return true;
    }

    /* renamed from: y2 */
    public static void m39676y2(TodOrderActivity todOrderActivity, Exception exc) {
        todOrderActivity.mo46401z2();
        if (exc instanceof UserRequestError) {
            UserRequestError userRequestError = (UserRequestError) exc;
            C20632a.m48506S1(userRequestError.mo49162d(), userRequestError.mo49160b(), userRequestError.mo49161c(), todOrderActivity.f40334C0).show(todOrderActivity.getSupportFragmentManager(), "TodErrorMessageDialogFragment");
        } else {
            new C20632a().show(todOrderActivity.getSupportFragmentManager(), "TodErrorMessageDialogFragment");
        }
        todOrderActivity.f40343q0.setVisibility(4);
    }

    /* renamed from: A1 */
    public final /* synthetic */ boolean mo23103A1() {
        return false;
    }

    /* renamed from: A2 */
    public final void mo46391A2() {
        C13556a aVar = this.f40348v0;
        if (aVar != null) {
            aVar.cancel(true);
            this.f40332A0.mo52456h(true);
            this.f40348v0 = null;
        }
    }

    /* renamed from: B2 */
    public final TaxiOrderConfig mo46392B2() {
        ServerId serverId;
        TaxiProvider taxiProvider;
        String str;
        TodOrderInfo todOrderInfo = this.f40347u0;
        if (todOrderInfo == null || (str = todOrderInfo.f40357f) == null) {
            serverId = null;
        } else {
            serverId = ServerId.m11392b(str);
        }
        if (serverId == null) {
            return null;
        }
        TaxiProvidersManager b = TaxiProvidersManager.m39496b(getApplicationContext());
        if (b != null) {
            taxiProvider = b.mo46163c(serverId);
        } else {
            taxiProvider = null;
        }
        if (taxiProvider != null) {
            return taxiProvider.f39982q;
        }
        return null;
    }

    /* renamed from: C0 */
    public final void mo46393C0(TodOrderConfig todOrderConfig) {
        int i;
        Drawable drawable;
        this.f40333B0 = todOrderConfig;
        this.f40342p0.setArguments(Integer.valueOf(todOrderConfig.f40257c));
        FormatTextView formatTextView = this.f40342p0;
        if (todOrderConfig.f40258d > 0) {
            i = R.drawable.ic_wheelchair_24_on_surface_emphasis_high;
        } else {
            i = R.drawable.ic_wheelchair_24_on_surface_emphasis_low;
        }
        if (i == 0) {
            drawable = null;
        } else {
            drawable = C17988b.m44611b(i, formatTextView.getContext());
        }
        C15780a.m40271d(formatTextView, UiUtils.Edge.RIGHT, drawable);
        mo46397G2();
    }

    /* renamed from: C2 */
    public final TodOrderConfig mo46394C2() {
        TodOrderConfig todOrderConfig;
        if (this.f40333B0 == null) {
            TaxiOrderConfig B2 = mo46392B2();
            if (B2 == null || C13717b.m34258e(B2.f39948b)) {
                todOrderConfig = new TodOrderConfig(Collections.emptyMap(), 1, 0);
            } else {
                List<TaxiOrderProfile> list = B2.f39948b;
                C6302b bVar = new C6302b(list.size());
                for (TaxiOrderProfile taxiOrderProfile : list) {
                    bVar.put(taxiOrderProfile.f39951b, 0);
                }
                todOrderConfig = new TodOrderConfig(bVar, 1, 0);
            }
            this.f40333B0 = todOrderConfig;
        }
        return this.f40333B0;
    }

    /* renamed from: E */
    public final /* synthetic */ void mo23104E() {
    }

    /* renamed from: E2 */
    public final void mo46395E2(Intent intent, Bundle bundle) {
        boolean z;
        TodOrderInfo todOrderInfo;
        TripPlannerTime tripPlannerTime;
        TripPlannerTime tripPlannerTime2;
        if (bundle != null) {
            z = bundle.getBoolean("fromTodBookingOrderFlow");
        } else {
            z = intent.getBooleanExtra("fromTodBookingOrderFlow", false);
        }
        this.f40334C0 = z;
        if (bundle != null) {
            todOrderInfo = (TodOrderInfo) bundle.getParcelable("orderInfo");
        } else {
            TodOrderInfo todOrderInfo2 = (TodOrderInfo) intent.getParcelableExtra("orderInfo");
            if (todOrderInfo2 == null) {
                Uri data = intent.getData();
                todOrderInfo2 = null;
                if (data != null) {
                    LocationDescriptor b = TodOrderInfo.m39703b(data, "olat", "olon", "oname");
                    if (b == null) {
                        b = LocationDescriptor.m17772m(this);
                    }
                    LocationDescriptor locationDescriptor = b;
                    LocationDescriptor b2 = TodOrderInfo.m39703b(data, "dlat", "dlon", "dname");
                    String queryParameter = data.getQueryParameter(Constants.APPBOY_PUSH_TITLE_KEY);
                    String queryParameter2 = data.getQueryParameter("tt");
                    if (!C20964s0.m49089g(queryParameter)) {
                        tripPlannerTime = TripPlannerTime.m17899f();
                    } else {
                        long parseLong = Long.parseLong(queryParameter);
                        if (!C20964s0.m49089g(queryParameter2)) {
                            tripPlannerTime2 = new TripPlannerTime(TripPlannerTime.Type.DEPART, parseLong);
                        } else {
                            MVTimeType findByValue = MVTimeType.findByValue(Integer.parseInt(queryParameter2));
                            if (findByValue != null) {
                                tripPlannerTime2 = new TripPlannerTime(C16080a.m40953i(findByValue), parseLong);
                            } else {
                                throw new ApplicationBugException(C25541a.m63881k("Unknown trip plan time type: ", queryParameter2));
                            }
                        }
                        tripPlannerTime = tripPlannerTime2;
                    }
                    String queryParameter3 = data.getQueryParameter("pi");
                    String queryParameter4 = data.getQueryParameter("ti");
                    String queryParameter5 = data.getQueryParameter("eti");
                    String queryParameter6 = data.getQueryParameter("ig");
                    if (b2 != null) {
                        todOrderInfo = new TodOrderInfo(locationDescriptor, b2, tripPlannerTime, queryParameter3, queryParameter4, queryParameter5, queryParameter6);
                    }
                }
            }
            todOrderInfo = todOrderInfo2;
        }
        if (todOrderInfo == null) {
            finish();
            return;
        }
        this.f40347u0 = todOrderInfo;
        mo46397G2();
    }

    /* renamed from: F2 */
    public final void mo46396F2(TodOrderAssignmentListItemView todOrderAssignmentListItemView) {
        int i;
        TodOrderAssignment todOrderAssignment = todOrderAssignmentListItemView.getTodOrderAssignment();
        if (todOrderAssignment != null) {
            if (todOrderAssignment.f40253k) {
                i = R.string.tod_passenger_order_activity_reservation_title;
            } else {
                i = R.string.tod_passenger_order_activity_title;
            }
            setTitle(i);
            int childCount = this.f40341o0.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                TodOrderAssignmentListItemView todOrderAssignmentListItemView2 = (TodOrderAssignmentListItemView) this.f40341o0.getChildAt(i2);
                if (todOrderAssignmentListItemView2 != todOrderAssignmentListItemView && todOrderAssignmentListItemView2.isActivated()) {
                    todOrderAssignmentListItemView2.setActivated(false);
                }
            }
            boolean z = true;
            if (childCount <= 1) {
                z = false;
            }
            todOrderAssignmentListItemView.setActivated(z);
            this.f40352z0 = todOrderAssignment;
            CurrencyAmount currencyAmount = todOrderAssignment.f40252j;
            PaymentSummaryFragment paymentSummaryFragment = (PaymentSummaryFragment) getSupportFragmentManager().mo3983z(R.id.payment_summary);
            if (paymentSummaryFragment != null) {
                if (currencyAmount == null) {
                    currencyAmount = new CurrencyAmount("M:Empty", new BigDecimal(0));
                }
                paymentSummaryFragment.f42622n.f51436j.postValue(currencyAmount);
            }
            PaymentGatewayFragment paymentGatewayFragment = (PaymentGatewayFragment) getSupportFragmentManager().mo3983z(R.id.payment_method_view);
            if (paymentGatewayFragment != null) {
                paymentGatewayFragment.mo48928p2();
            }
            C20637f fVar = this.f40345s0;
            fVar.getClass();
            fVar.mo52817b(todOrderAssignment.f40246d, todOrderAssignment.f40250h, (TodRideStatus) null, (C17253f) null);
            this.f40345s0.mo52816a(todOrderAssignment.f40250h.f40290h);
        }
    }

    /* renamed from: G2 */
    public final void mo46397G2() {
        TodOrderInfo todOrderInfo;
        boolean z;
        if (this.f37313z && (todOrderInfo = this.f40347u0) != null) {
            mo46401z2();
            mo46391A2();
            C13556a aVar = this.f40349w0;
            String str = null;
            if (aVar != null) {
                aVar.cancel(true);
                this.f40349w0 = null;
            }
            this.f40343q0.setVisibility(4);
            Location u1 = mo44542u1();
            LocationDescriptor locationDescriptor = todOrderInfo.f40353b;
            LocationDescriptor locationDescriptor2 = todOrderInfo.f40354c;
            TripPlannerTime tripPlannerTime = todOrderInfo.f40355d;
            if (tripPlannerTime == null || (!tripPlannerTime.mo24488c() && !tripPlannerTime.mo24489d() && tripPlannerTime.mo24487b() < System.currentTimeMillis())) {
                tripPlannerTime = TripPlannerTime.m17899f();
            }
            TripPlannerTime tripPlannerTime2 = tripPlannerTime;
            if (m39675D2(locationDescriptor)) {
                locationDescriptor.mo24317n(LatLonE6.m40177j(u1));
            }
            if (m39675D2(locationDescriptor2)) {
                locationDescriptor2.mo24317n(LatLonE6.m40177j(u1));
            }
            if (!m39675D2(todOrderInfo.f40353b) || u1 == null || u1.getAccuracy() < 100.0f) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C6382p0 a = C6333d0.m15013a(this.f40339m0);
                a.mo22499i(BitmapDescriptorFactory.HUE_RED);
                a.mo22501k(new C4278e0(this, 11));
            } else {
                C6382p0 a2 = C6333d0.m15013a(this.f40339m0);
                a2.mo22499i((float) (-this.f40339m0.getMeasuredHeight()));
                a2.mo22500j(new C0436m1(this, 14));
            }
            TodOrderConfig C2 = mo46394C2();
            Map<ServerId, Integer> map = C2.f40256b;
            int i = C2.f40257c;
            int i2 = C2.f40258d;
            C20703a e = this.f40332A0.mo52454e();
            C13752e x1 = mo44548x1();
            String str2 = todOrderInfo.f40356e;
            if (e != null) {
                str = e.f52279c;
            }
            String str3 = str;
            C17962k kVar = r6;
            C17962k kVar2 = new C17962k(x1, locationDescriptor, locationDescriptor2, tripPlannerTime2, i, i2, str2, u1, map, str3, todOrderInfo.f40358g);
            this.f40332A0.mo52456h(false);
            StringBuilder sb = new StringBuilder();
            C13715c.m34249o(C17962k.class, sb, "_");
            sb.append(kVar.f46036w.mo24310d());
            sb.append("_");
            sb.append(kVar.f46037x.mo24310d());
            sb.append("_");
            sb.append(kVar.f46038y.mo24487b());
            sb.append("_");
            sb.append(kVar.f46038y.f23799b);
            sb.append("_");
            sb.append(kVar.f46039z);
            sb.append("_");
            sb.append(kVar.f46035A);
            String sb2 = sb.toString();
            RequestOptions requestOptions = new RequestOptions();
            requestOptions.f42909f = true;
            this.f40348v0 = mo44527k2(sb2, kVar, requestOptions, this.f40336Y);
        }
    }

    /* renamed from: H2 */
    public final void mo46398H2(String str) {
        ArrayList arrayList = new ArrayList();
        Intent A0 = C14226d.m35335A0(this);
        C14226d.m35339F0(A0);
        arrayList.add(A0);
        arrayList.add(TodRideActivity.m39513z2(this, str));
        if (!arrayList.isEmpty()) {
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!C4732a.startActivities(this, intentArr, (Bundle) null)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    /* renamed from: I */
    public final PaymentGatewayInfo mo23105I() {
        TodOrder todOrder = null;
        if (this.f40351y0 == null) {
            return null;
        }
        C6302b bVar = new C6302b(2);
        C20944i0<TodOrder, Animator> i0Var = this.f40350x0;
        if (i0Var != null) {
            todOrder = (TodOrder) i0Var.f52692a;
        }
        if (todOrder != null) {
            bVar.put("tod_order_id", todOrder.f40239b.mo19751c());
        }
        TodOrderAssignment todOrderAssignment = this.f40352z0;
        if (todOrderAssignment != null) {
            bVar.put("tod_assignment_id", todOrderAssignment.f40247e);
        }
        TodPaymentInfo todPaymentInfo = this.f40351y0;
        return new PaymentGatewayInfo(todPaymentInfo.f40363b, PurchaseVerificationType.NONE, todPaymentInfo.f40364c, bVar);
    }

    /* renamed from: I2 */
    public final void mo46399I2() {
        this.f40343q0.setVisibility(4);
        C20944i0<TodOrder, Animator> i0Var = this.f40350x0;
        if (i0Var != null) {
            ((Animator) i0Var.f52693b).cancel();
            this.f40350x0 = null;
        }
    }

    /* renamed from: J2 */
    public final void mo46400J2() {
        this.f40344r0.mo48645n3(0, 0, 0, this.f40338l0.getHeight() - this.f40340n0.getTop());
    }

    /* renamed from: L */
    public final CharSequence mo23106L() {
        int i;
        TodOrderAssignment todOrderAssignment = this.f40352z0;
        if (todOrderAssignment == null) {
            return "";
        }
        if (todOrderAssignment.f40253k) {
            i = R.string.tod_passenger_order_reserve_button;
        } else {
            i = R.string.tod_passenger_order_purchase_button;
        }
        return getString(i);
    }

    /* renamed from: M */
    public final /* synthetic */ void mo23107M() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        if (r6 != false) goto L_0x0033;
     */
    /* renamed from: Y1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44516Y1(android.location.Location r6) {
        /*
            r5 = this;
            com.moovit.app.tod.order.TodOrderActivity$TodOrderInfo r0 = r5.f40347u0
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            com.moovit.transit.LocationDescriptor r0 = r0.f40353b
            boolean r0 = m39675D2(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0032
            com.moovit.design.view.list.ListItemView r0 = r5.f40339m0
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0019
            r0 = 1
            goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            float r6 = r6.getAccuracy()
            r3 = 1120403456(0x42c80000, float:100.0)
            int r4 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r4 < 0) goto L_0x0026
            if (r0 == 0) goto L_0x002c
        L_0x0026:
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 >= 0) goto L_0x002e
            if (r0 == 0) goto L_0x002e
        L_0x002c:
            r6 = 1
            goto L_0x002f
        L_0x002e:
            r6 = 0
        L_0x002f:
            if (r6 == 0) goto L_0x0032
            goto L_0x0033
        L_0x0032:
            r1 = 0
        L_0x0033:
            if (r1 == 0) goto L_0x0038
            r5.mo46397G2()
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.tod.order.TodOrderActivity.mo44516Y1(android.location.Location):void");
    }

    /* renamed from: b2 */
    public final void mo19424b2(Intent intent) {
        setIntent(intent);
        mo46395E2(intent, (Bundle) null);
    }

    /* renamed from: c0 */
    public final void mo23108c0(PaymentGatewayToken paymentGatewayToken) {
        TodOrderAssignment todOrderAssignment;
        C20944i0<TodOrder, Animator> i0Var;
        TodOrder todOrder;
        int i;
        C20703a e = this.f40332A0.mo52454e();
        if (e != null && (todOrderAssignment = this.f40352z0) != null && (i0Var = this.f40350x0) != null) {
            String str = null;
            if (i0Var == null) {
                todOrder = null;
            } else {
                todOrder = (TodOrder) i0Var.f52692a;
            }
            if (todOrderAssignment.f40253k) {
                i = R.string.tod_passenger_order_reservation_message;
            } else {
                i = R.string.tod_passenger_order_booking_message;
            }
            mo44540t2(i);
            C13556a aVar = this.f40349w0;
            if (aVar != null) {
                aVar.cancel(true);
                this.f40349w0 = null;
            }
            mo46391A2();
            mo46399I2();
            ServerId serverId = todOrder.f40239b;
            CurrencyAmount currencyAmount = e.f52282f;
            TodOrderAssignment todOrderAssignment2 = this.f40352z0;
            String str2 = todOrderAssignment2.f40247e;
            boolean z = todOrderAssignment2.f40253k;
            String str3 = e.f52279c;
            TodOrderInfo todOrderInfo = this.f40347u0;
            if (todOrderInfo != null) {
                str = todOrderInfo.f40359h;
            }
            C17951a aVar2 = new C17951a(mo44548x1(), serverId, str2, currencyAmount, z, paymentGatewayToken, str3, str);
            StringBuilder sb = new StringBuilder();
            C13715c.m34249o(C17951a.class, sb, "_");
            sb.append(C17884p.m44335F(aVar2.f33922v));
            String sb2 = sb.toString();
            RequestOptions requestOptions = new RequestOptions();
            requestOptions.f42909f = true;
            this.f40349w0 = mo44527k2(sb2, aVar2, requestOptions, this.f40337Z);
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        TodOrderConfig todOrderConfig;
        int i;
        super.mo19425e2(bundle);
        setContentView((int) R.layout.tod_order_activity);
        this.f40332A0 = (C20283g) new C1026n0(this).mo4313a(C20283g.class);
        ListItemView listItemView = (ListItemView) findViewById(R.id.location_accuracy);
        this.f40339m0 = listItemView;
        listItemView.getAccessoryView().setOnClickListener(new C16740o(this, 3));
        this.f40344r0 = (MapFragment) mo44529n1(R.id.map_fragment);
        View findViewById = findViewById(R.id.coordinator);
        this.f40338l0 = findViewById;
        findViewById.addOnLayoutChangeListener(new C16704a(this, 1));
        View findViewById2 = findViewById(R.id.bottom_sheet_view);
        this.f40340n0 = findViewById2;
        BottomSheetBehavior.m34710e(findViewById2).mo41052a(this.f40335X);
        this.f40341o0 = (ViewGroup) findViewById(R.id.assignments);
        if (bundle != null) {
            todOrderConfig = (TodOrderConfig) bundle.getParcelable("currentTodOrderConfig");
        } else {
            todOrderConfig = null;
        }
        this.f40333B0 = todOrderConfig;
        FormatTextView formatTextView = (FormatTextView) findViewById(R.id.passenger_count);
        this.f40342p0 = formatTextView;
        Object[] objArr = new Object[1];
        TodOrderConfig todOrderConfig2 = this.f40333B0;
        if (todOrderConfig2 != null) {
            i = todOrderConfig2.f40257c;
        } else {
            i = 1;
        }
        objArr[0] = Integer.valueOf(i);
        formatTextView.setArguments(objArr);
        this.f40343q0 = (ProgressBar) findViewById(R.id.progress_bar);
        this.f40345s0 = new C20637f(this, this.f40344r0);
        MapOverlaysLayout mapOverlaysLayout = this.f40344r0.f42386w;
        LayoutInflater.from(this).inflate(R.layout.tod_order_map_overlay, mapOverlaysLayout, true);
        ImageView imageView = (ImageView) mapOverlaysLayout.findViewById(R.id.map_zoom_journey_button);
        this.f40346t0 = imageView;
        imageView.setOnClickListener(new C1800c(this, 27));
        ((Button) findViewById(R.id.change_button)).setOnClickListener(new C6994a(this, 28));
        mo46395E2(getIntent(), bundle);
    }

    /* renamed from: g2 */
    public final void mo23894g2(Bundle bundle) {
        bundle.putParcelable("orderInfo", this.f40347u0);
        bundle.putParcelable("currentTodOrderConfig", this.f40333B0);
        bundle.putBoolean("fromTodBookingOrderFlow", this.f40334C0);
    }

    /* renamed from: h2 */
    public final void mo19426h2() {
        super.mo19426h2();
        mo46397G2();
    }

    /* renamed from: i2 */
    public final void mo19427i2() {
        super.mo19427i2();
        mo46401z2();
        mo46391A2();
        C13556a aVar = this.f40349w0;
        if (aVar != null) {
            aVar.cancel(true);
            this.f40349w0 = null;
        }
    }

    /* renamed from: j1 */
    public final C20061g mo19428j1() {
        return C16202a.get(this).getPermissionAwareHighAccuracyFrequentUpdates();
    }

    /* renamed from: n0 */
    public final C17474b.C17475a mo23109n0() {
        CurrencyAmount currencyAmount;
        String str;
        C20703a e = this.f40332A0.mo52454e();
        Long l = null;
        if (e != null) {
            currencyAmount = e.f52282f;
        } else {
            currencyAmount = null;
        }
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "purchase_button_clicked");
        AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.ID;
        TodOrderAssignment todOrderAssignment = this.f40352z0;
        if (todOrderAssignment != null) {
            str = todOrderAssignment.f40247e;
        } else {
            str = null;
        }
        aVar.mo49945m(analyticsAttributeKey, str);
        AnalyticsAttributeKey analyticsAttributeKey2 = AnalyticsAttributeKey.BALANCE;
        if (currencyAmount != null) {
            l = Long.valueOf(C0016g.m19b(currencyAmount));
        }
        aVar.mo49944l(analyticsAttributeKey2, l);
        return aVar;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 4333) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1 && intent != null) {
            LocationDescriptor locationDescriptor = (LocationDescriptor) intent.getParcelableExtra("search_result");
            TodOrderInfo todOrderInfo = this.f40347u0;
            if (todOrderInfo != null && locationDescriptor != null) {
                this.f40347u0 = new TodOrderInfo(locationDescriptor, todOrderInfo.f40354c, todOrderInfo.f40355d, todOrderInfo.f40356e, todOrderInfo.f40357f, todOrderInfo.f40358g, todOrderInfo.f40359h);
                mo46397G2();
            }
        }
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        HashSet hashSet = (HashSet) s1;
        hashSet.add("TOD_SUPPORT_VALIDATOR");
        hashSet.add("TOD_LOTTIE_PRE_FETCHER");
        hashSet.add("USER_ACCOUNT");
        return s1;
    }

    /* renamed from: z2 */
    public final void mo46401z2() {
        C20944i0<TodOrder, Animator> i0Var = this.f40350x0;
        if (i0Var != null) {
            ((TodOrder) i0Var.f52692a).getClass();
            System.currentTimeMillis();
            mo46399I2();
        }
    }

    public static class TodOrderInfo implements Parcelable {
        public static final Parcelable.Creator<TodOrderInfo> CREATOR = new C15524a();

        /* renamed from: b */
        public final LocationDescriptor f40353b;

        /* renamed from: c */
        public final LocationDescriptor f40354c;

        /* renamed from: d */
        public final TripPlannerTime f40355d;

        /* renamed from: e */
        public final String f40356e;

        /* renamed from: f */
        public final String f40357f;

        /* renamed from: g */
        public final String f40358g;

        /* renamed from: h */
        public final String f40359h;

        /* renamed from: com.moovit.app.tod.order.TodOrderActivity$TodOrderInfo$a */
        public class C15524a implements Parcelable.Creator<TodOrderInfo> {
            public final Object createFromParcel(Parcel parcel) {
                return new TodOrderInfo(parcel);
            }

            public final Object[] newArray(int i) {
                return new TodOrderInfo[i];
            }
        }

        public TodOrderInfo(LocationDescriptor locationDescriptor, LocationDescriptor locationDescriptor2, TripPlannerTime tripPlannerTime, String str, String str2, String str3, String str4) {
            C21100e.m49373x(locationDescriptor, AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
            this.f40353b = locationDescriptor;
            C21100e.m49373x(locationDescriptor2, "destination");
            this.f40354c = locationDescriptor2;
            this.f40355d = tripPlannerTime;
            this.f40356e = str;
            this.f40357f = str2;
            this.f40358g = str3;
            this.f40359h = str4;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0020 A[RETURN] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.moovit.transit.LocationDescriptor m39703b(android.net.Uri r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) {
            /*
                java.lang.String r13 = r12.getQueryParameter(r13)
                java.lang.String r14 = r12.getQueryParameter(r14)
                r0 = 0
                if (r13 == 0) goto L_0x001d
                if (r14 != 0) goto L_0x000e
                goto L_0x001d
            L_0x000e:
                double r1 = java.lang.Double.parseDouble(r13)     // Catch:{ Exception -> 0x001c }
                double r13 = java.lang.Double.parseDouble(r14)     // Catch:{ Exception -> 0x001c }
                com.moovit.commons.geo.LatLonE6 r13 = com.moovit.commons.geo.LatLonE6.m40176g(r1, r13)     // Catch:{ Exception -> 0x001c }
                r8 = r13
                goto L_0x001e
            L_0x001c:
            L_0x001d:
                r8 = r0
            L_0x001e:
                if (r8 != 0) goto L_0x0021
                return r0
            L_0x0021:
                java.lang.String r6 = r12.getQueryParameter(r15)
                com.moovit.transit.LocationDescriptor r12 = new com.moovit.transit.LocationDescriptor
                com.moovit.transit.LocationDescriptor$LocationType r2 = com.moovit.transit.LocationDescriptor.LocationType.COORDINATE
                com.moovit.transit.LocationDescriptor$SourceType r3 = com.moovit.transit.LocationDescriptor.SourceType.EXTERNAL
                r4 = 0
                r5 = 0
                r7 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r1 = r12
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.tod.order.TodOrderActivity.TodOrderInfo.m39703b(android.net.Uri, java.lang.String, java.lang.String, java.lang.String):com.moovit.transit.LocationDescriptor");
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f40353b, i);
            parcel.writeParcelable(this.f40354c, i);
            parcel.writeParcelable(this.f40355d, i);
            parcel.writeString(this.f40356e);
            parcel.writeString(this.f40357f);
            parcel.writeString(this.f40358g);
            parcel.writeString(this.f40359h);
        }

        public TodOrderInfo(Parcel parcel) {
            LocationDescriptor locationDescriptor = (LocationDescriptor) parcel.readParcelable(LocationDescriptor.class.getClassLoader());
            C21100e.m49373x(locationDescriptor, AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
            this.f40353b = locationDescriptor;
            LocationDescriptor locationDescriptor2 = (LocationDescriptor) parcel.readParcelable(LocationDescriptor.class.getClassLoader());
            C21100e.m49373x(locationDescriptor2, "destination");
            this.f40354c = locationDescriptor2;
            this.f40355d = (TripPlannerTime) parcel.readParcelable(TripPlannerTime.class.getClassLoader());
            this.f40356e = parcel.readString();
            this.f40357f = parcel.readString();
            this.f40358g = parcel.readString();
            this.f40359h = parcel.readString();
        }
    }
}
