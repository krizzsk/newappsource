package com.moovit.app.tod;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.activity.result.C0207b;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1043v;
import b00.C13556a;
import c70.C13751d;
import ce0.C21100e;
import com.google.android.play.core.assetpacks.C14333w2;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.search.AppSearchLocationCallback;
import com.moovit.app.tod.TodRidesProvider;
import com.moovit.app.tod.bottomsheet.TodRideBottomSheet;
import com.moovit.app.tod.model.TodRide;
import com.moovit.app.tod.model.TodRideStatus;
import com.moovit.app.tod.model.TodRideVehicle;
import com.moovit.app.tod.model.TodRideVehicleAC;
import com.moovit.app.tod.model.TodRideVehicleAction;
import com.moovit.app.tod.model.TodRideVehicleActionInfo;
import com.moovit.app.tod.model.TodRideVehicleAudio;
import com.moovit.app.tod.model.TodRideVehicleColorBar;
import com.moovit.commons.geo.BoxE6;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.design.dialog.AlertDialogFragment;
import com.moovit.location.C16202a;
import com.moovit.map.MapFragment;
import com.moovit.request.RequestOptions;
import com.moovit.search.SearchLocationActivity;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.CurrencyAmount;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p001a0.C0017h;
import p065e.C4413c;
import p241s0.C6302b;
import p304x.C7070l;
import p330z2.C7442r;
import p400bx.C13705a;
import p501fw.C17110h;
import p502fx.C17122g;
import p526gx.C17250c;
import p526gx.C17253f;
import p543hq.C17474b;
import p596jx.C17954c;
import p596jx.C17955d;
import p596jx.C17958g;
import p596jx.C17974v;
import p596jx.C17976x;
import p739px.C19039c;
import p858uz.C20061g;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p927xw.C20634c;
import p927xw.C20637f;
import p927xw.C20641i;
import p927xw.C20643j;
import p927xw.C20644k;
import p927xw.C20645l;
import p927xw.C20647n;
import p977zz.C20927a0;
import p977zz.C20964s0;
import z20.C20806a;

public class TodRideActivity extends MoovitAppActivity implements TodRidesProvider.C15458d, C13705a {

    /* renamed from: t0 */
    public static final /* synthetic */ int f39996t0 = 0;

    /* renamed from: U */
    public final C15448a f39997U = new C15448a();

    /* renamed from: X */
    public final C0207b<Intent> f39998X = registerForActivityResult(new C4413c(), new C7070l(this, 10));

    /* renamed from: Y */
    public final C15449b f39999Y = new C15449b();

    /* renamed from: Z */
    public final TodRidesProvider f40000Z = TodRidesProvider.m39561c();

    /* renamed from: l0 */
    public final C1043v<LocationDescriptor> f40001l0 = new C1043v<>();

    /* renamed from: m0 */
    public C20637f f40002m0;

    /* renamed from: n0 */
    public String f40003n0;

    /* renamed from: o0 */
    public TodRide f40004o0;

    /* renamed from: p0 */
    public TodRideBottomSheet f40005p0;

    /* renamed from: q0 */
    public MenuItem f40006q0;

    /* renamed from: r0 */
    public MenuItem f40007r0;

    /* renamed from: s0 */
    public MenuItem f40008s0;

    /* renamed from: com.moovit.app.tod.TodRideActivity$a */
    public class C15448a extends C20641i {
        public C15448a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
            r0 = r4.f40009i;
         */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo46189f(p502fx.C17122g r5) {
            /*
                r4 = this;
                com.moovit.app.tod.TodRideActivity r0 = com.moovit.app.tod.TodRideActivity.this
                java.lang.String r0 = r0.f40003n0
                if (r0 == 0) goto L_0x0059
                java.lang.String r1 = r5.f44313a
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0059
                com.moovit.app.tod.TodRideActivity r0 = com.moovit.app.tod.TodRideActivity.this
                com.moovit.app.tod.model.TodRide r1 = r0.f40004o0
                if (r1 == 0) goto L_0x0059
                java.lang.String r0 = r0.f40003n0
                java.lang.String r1 = r1.f40264b
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0059
                com.moovit.app.tod.TodRideActivity r0 = com.moovit.app.tod.TodRideActivity.this
                r0.getClass()
                com.moovit.app.tod.model.TodRideStatus r1 = r5.f44314b
                com.moovit.app.tod.model.TodRide r2 = r0.f40004o0
                if (r2 == 0) goto L_0x0036
                com.moovit.app.tod.model.TodRideStatus r2 = r2.f40266d
                boolean r2 = r2.equals(r1)
                if (r2 != 0) goto L_0x0036
                java.lang.String r2 = "com.moovit.tod_rides_provider.action.ride_status_change"
                com.moovit.app.tod.TodRidesProvider.m39562d(r0, r2)
            L_0x0036:
                com.moovit.app.tod.bottomsheet.TodRideBottomSheet r2 = r0.f40005p0
                com.moovit.app.tod.model.TodRide r3 = r0.f40004o0
                r2.mo46267a(r3, r5)
                com.moovit.app.tod.model.TodRide r2 = r0.f40004o0
                r0.mo46181H2(r2, r5)
                r0.mo46182I2(r5)
                r0.mo46183J2(r5)
                com.moovit.app.tod.model.TodRideStatus r2 = com.moovit.app.tod.model.TodRideStatus.ACTIVE
                boolean r1 = r2.equals(r1)
                if (r1 != 0) goto L_0x0054
                r0.mo46180G2()
                goto L_0x0059
            L_0x0054:
                com.moovit.app.tod.TodRideActivity$b r1 = r0.f39999Y
                r1.mo49801b(r0, r5)
            L_0x0059:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.tod.TodRideActivity.C15448a.mo46189f(fx.g):void");
        }

        /* renamed from: g */
        public final void mo46190g(String str) {
            Intent z2 = TodRideActivity.m39513z2(TodRideActivity.this, str);
            z2.addFlags(603979776);
            TodRideActivity.this.startActivity(z2);
        }
    }

    /* renamed from: com.moovit.app.tod.TodRideActivity$b */
    public class C15449b extends C17250c {
        public C15449b() {
        }
    }

    /* renamed from: com.moovit.app.tod.TodRideActivity$c */
    public class C15450c extends C20438i<C17954c, C17955d> {
        public C15450c() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C17954c cVar2 = (C17954c) cVar;
            TodRideActivity.this.mo44506I1();
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C17955d dVar = (C17955d) gVar;
            if (((C17954c) cVar).mo52624A()) {
                Toast.makeText(TodRideActivity.this, R.string.tod_passenger_cancel_ride_success, 1).show();
                TodRideActivity.this.finish();
            }
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C17954c cVar2 = (C17954c) cVar;
            TodRideActivity todRideActivity = TodRideActivity.this;
            int i = TodRideActivity.f39996t0;
            todRideActivity.mo46178E2("cancel_ride_request_alert_dialog_fragment", exc);
            return true;
        }
    }

    /* renamed from: com.moovit.app.tod.TodRideActivity$d */
    public static /* synthetic */ class C15451d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40012a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f40013b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f40014c;

        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|23|24|25|26|27|28|29|30|(2:31|32)|33|35|36|37|38|(3:39|40|42)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|23|24|25|26|27|28|29|30|(2:31|32)|33|35|36|37|38|39|40|42) */
        /* JADX WARNING: Can't wrap try/catch for region: R(35:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|23|24|25|26|27|28|29|30|31|32|33|35|36|37|38|39|40|42) */
        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|23|24|25|26|27|28|29|30|31|32|33|35|36|37|38|39|40|42) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0093 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x009d */
        static {
            /*
                com.moovit.app.tod.model.TodRideStatus[] r0 = com.moovit.app.tod.model.TodRideStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f40014c = r0
                r1 = 1
                com.moovit.app.tod.model.TodRideStatus r2 = com.moovit.app.tod.model.TodRideStatus.FUTURE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f40014c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.app.tod.model.TodRideStatus r3 = com.moovit.app.tod.model.TodRideStatus.ACTIVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f40014c     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.app.tod.model.TodRideStatus r4 = com.moovit.app.tod.model.TodRideStatus.CANCELLED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f40014c     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.app.tod.model.TodRideStatus r5 = com.moovit.app.tod.model.TodRideStatus.COMPLETED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f40014c     // Catch:{ NoSuchFieldError -> 0x003e }
                com.moovit.app.tod.model.TodRideStatus r6 = com.moovit.app.tod.model.TodRideStatus.PASSENGER_NOT_SHOWN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r5 = f40014c     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.moovit.app.tod.model.TodRideStatus r6 = com.moovit.app.tod.model.TodRideStatus.DECLINED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r7 = 6
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                com.moovit.app.tod.model.TodRideVehicleAction[] r5 = com.moovit.app.tod.model.TodRideVehicleAction.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f40013b = r5
                com.moovit.app.tod.model.TodRideVehicleAction r6 = com.moovit.app.tod.model.TodRideVehicleAction.COLOR_BAR     // Catch:{ NoSuchFieldError -> 0x005a }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                int[] r5 = f40013b     // Catch:{ NoSuchFieldError -> 0x0064 }
                com.moovit.app.tod.model.TodRideVehicleAction r6 = com.moovit.app.tod.model.TodRideVehicleAction.AC     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                int[] r5 = f40013b     // Catch:{ NoSuchFieldError -> 0x006e }
                com.moovit.app.tod.model.TodRideVehicleAction r6 = com.moovit.app.tod.model.TodRideVehicleAction.BEEP     // Catch:{ NoSuchFieldError -> 0x006e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r5[r6] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r5 = f40013b     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.moovit.app.tod.model.TodRideVehicleAction r6 = com.moovit.app.tod.model.TodRideVehicleAction.FLASH     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r5[r6] = r3     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r3 = f40013b     // Catch:{ NoSuchFieldError -> 0x0082 }
                com.moovit.app.tod.model.TodRideVehicleAction r5 = com.moovit.app.tod.model.TodRideVehicleAction.AUDIO     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r3[r5] = r4     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                com.moovit.app.tod.model.TodPassengerActionRequiredInfoType[] r3 = com.moovit.app.tod.model.TodPassengerActionRequiredInfoType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f40012a = r3
                com.moovit.app.tod.model.TodPassengerActionRequiredInfoType r4 = com.moovit.app.tod.model.TodPassengerActionRequiredInfoType.NONE     // Catch:{ NoSuchFieldError -> 0x0093 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0093 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0093 }
            L_0x0093:
                int[] r1 = f40012a     // Catch:{ NoSuchFieldError -> 0x009d }
                com.moovit.app.tod.model.TodPassengerActionRequiredInfoType r3 = com.moovit.app.tod.model.TodPassengerActionRequiredInfoType.QR_CODE     // Catch:{ NoSuchFieldError -> 0x009d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x009d }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x009d }
            L_0x009d:
                int[] r0 = f40012a     // Catch:{ NoSuchFieldError -> 0x00a7 }
                com.moovit.app.tod.model.TodPassengerActionRequiredInfoType r1 = com.moovit.app.tod.model.TodPassengerActionRequiredInfoType.PIN_CODE     // Catch:{ NoSuchFieldError -> 0x00a7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a7 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a7 }
            L_0x00a7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.tod.TodRideActivity.C15451d.<clinit>():void");
        }
    }

    /* renamed from: C2 */
    public static void m39511C2(String str, String str2) {
        C20806a.C20807a aVar = new C20806a.C20807a(str);
        aVar.mo52934b("tod", "feature");
        aVar.mo52934b(str2, "item_id");
        aVar.mo52935c();
    }

    /* renamed from: y2 */
    public static void m39512y2(TodRideActivity todRideActivity, String str, boolean z) {
        todRideActivity.getClass();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.RESPONSE);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "tod_ride_action_result");
        aVar.mo49939g(AnalyticsAttributeKey.ID, str);
        aVar.mo49941i(AnalyticsAttributeKey.SUCCESS, z);
        todRideActivity.mo44545v2(aVar.mo49933a());
    }

    /* renamed from: z2 */
    public static Intent m39513z2(Context context, String str) {
        Intent intent = new Intent(context, TodRideActivity.class);
        intent.putExtra("rideId", str);
        return intent;
    }

    /* renamed from: A2 */
    public final void mo46175A2(Intent intent, Bundle bundle) {
        TodRide todRide;
        String stringExtra = intent.getStringExtra("rideId");
        this.f40003n0 = stringExtra;
        if (stringExtra != null) {
            this.f40004o0 = null;
            if (!(bundle == null || (todRide = (TodRide) bundle.getParcelable("ride")) == null || !todRide.f40264b.equals(this.f40003n0))) {
                this.f40004o0 = todRide;
            }
            if (!this.f40000Z.mo46197f()) {
                mo46186a0();
                return;
            }
            return;
        }
        throw new IllegalStateException("Ride id is missing!");
    }

    /* renamed from: B2 */
    public final void mo46176B2(CurrencyAmount currencyAmount) {
        m39511C2("ride_cancel_tap", this.f40003n0);
        mo44540t2(R.string.tod_passenger_ride_canceling_message);
        C17954c cVar = new C17954c(mo44548x1(), this.f40003n0, currencyAmount);
        StringBuilder sb = new StringBuilder();
        C13715c.m34249o(C17954c.class, sb, "_");
        sb.append(cVar.f46024w);
        String sb2 = sb.toString();
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42909f = true;
        mo44527k2(sb2, cVar, requestOptions, new C15450c());
    }

    /* renamed from: D2 */
    public final void mo46177D2(C14333w2 w2Var, String str) {
        mo44540t2(R.string.tod_passenger_ride_action_reporting_message);
        C17974v vVar = new C17974v(mo44548x1(), this.f40003n0, str, w2Var, LatLonE6.m40177j(mo44542u1()));
        StringBuilder sb = new StringBuilder();
        C13715c.m34249o(C17974v.class, sb, "_");
        sb.append(vVar.f46057w);
        sb.append("_");
        sb.append(vVar.f46058x);
        String sb2 = sb.toString();
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42909f = true;
        mo44527k2(sb2, vVar, requestOptions, new C20644k(this, str));
    }

    /* renamed from: E2 */
    public final void mo46178E2(String str, Exception exc) {
        AlertDialogFragment.C15856a i = C13751d.m34342c(this, str, exc).mo47681j(R.string.retry_connect).mo47680i(R.string.cancel);
        i.mo47674c(false);
        i.mo47675d(false);
        mo44530n2(i.mo47673b());
    }

    /* renamed from: F2 */
    public final void mo46179F2() {
        boolean z;
        TodRide todRide;
        String str = this.f40003n0;
        if (str == null || (todRide = this.f40004o0) == null || todRide.f40266d != TodRideStatus.ACTIVE) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            mo46180G2();
        } else if (!str.equals(this.f39997U.f52205f)) {
            C15448a aVar = this.f39997U;
            String str2 = this.f40003n0;
            aVar.mo23803d();
            aVar.f52204e = this;
            aVar.f52205f = str2;
            aVar.f52206g = null;
            aVar.mo23804e();
        }
    }

    /* renamed from: G2 */
    public final void mo46180G2() {
        C15448a aVar = this.f39997U;
        aVar.f52204e = null;
        aVar.f52205f = null;
        aVar.f52206g = null;
        aVar.mo23803d();
        C15449b bVar = this.f39999Y;
        bVar.getClass();
        C21100e.m49369v(1);
        C13556a aVar2 = bVar.f44581b;
        if (aVar2 != null) {
            aVar2.cancel(true);
            bVar.f44581b = null;
        }
        bVar.f44580a = null;
        mo46184K2(this.f40004o0);
    }

    /* renamed from: H2 */
    public final void mo46181H2(TodRide todRide, C17122g gVar) {
        CharSequence charSequence;
        int i = C15451d.f40014c[todRide.f40266d.ordinal()];
        if (i == 1) {
            long j = todRide.f40265c;
            charSequence = C20964s0.m49097o(getString(R.string.string_list_delimiter_dot), getString(R.string.tod_passenger_ride_label_future), C7925b.m18022j(this, j));
        } else if (i == 2 && gVar != null) {
            long max = Math.max(0, todRide.f40267e.f40289g);
            String l = C7925b.m18024l(this, TimeUnit.MINUTES.toMillis(max) + gVar.f44318f);
            charSequence = C20964s0.m49097o(getString(R.string.string_list_delimiter_dot), getString(R.string.tod_passenger_ride_label_active), getString(R.string.tod_passenger_ride_eta, new Object[]{l}));
        } else {
            charSequence = "";
        }
        setTitle(charSequence);
    }

    /* renamed from: I2 */
    public final void mo46182I2(C17122g gVar) {
        TodRideStatus todRideStatus;
        MenuItem menuItem = this.f40006q0;
        if (menuItem != null) {
            TodRide todRide = this.f40004o0;
            boolean z = false;
            if (todRide != null) {
                if (gVar == null) {
                    todRideStatus = todRide.f40266d;
                } else {
                    todRideStatus = gVar.f44314b;
                }
                int i = C15451d.f40014c[todRideStatus.ordinal()];
                if (i == 1 || (i == 2 && gVar != null && this.f40004o0.f40264b.equals(gVar.f44313a) && !gVar.f44315c.isPickedUp())) {
                    z = true;
                }
            }
            menuItem.setVisible(z);
        }
    }

    /* renamed from: J0 */
    public final void mo40570J0() {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "rating_promotion_clicked");
        mo44545v2(aVar.mo49933a());
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        String str = TodRideRatingDialogFragment.f40018q;
        if (supportFragmentManager.mo3923A(str) == null) {
            String str2 = this.f40003n0;
            Bundle bundle = new Bundle();
            C21100e.m49373x(str2, "rideId");
            bundle.putString("rideId", str2);
            TodRideRatingDialogFragment todRideRatingDialogFragment = new TodRideRatingDialogFragment();
            todRideRatingDialogFragment.setArguments(bundle);
            todRideRatingDialogFragment.show(supportFragmentManager, str);
        }
    }

    /* renamed from: J2 */
    public final void mo46183J2(C17122g gVar) {
        boolean z;
        MenuItem menuItem = this.f40008s0;
        if (menuItem != null) {
            if (gVar == null || !gVar.f44322j) {
                z = false;
            } else {
                z = true;
            }
            menuItem.setVisible(z);
        }
    }

    /* renamed from: K2 */
    public final void mo46184K2(TodRide todRide) {
        BoxE6 boxE6;
        if (todRide == null) {
            C20637f fVar = this.f40002m0;
            if (!fVar.f52179c.mo48624U2()) {
                fVar.f52179c.mo48656t2(new C20634c(fVar, 0));
            } else {
                fVar.mo52818c();
            }
        } else {
            C20637f fVar2 = this.f40002m0;
            fVar2.getClass();
            fVar2.mo52817b(todRide.f40275m, todRide.f40267e, todRide.f40266d, (C17253f) null);
            C20637f fVar3 = this.f40002m0;
            if (todRide.f40266d != TodRideStatus.COMPLETED || (boxE6 = todRide.f40267e.f40292j) == null) {
                boxE6 = todRide.f40267e.f40290h;
            }
            fVar3.mo52816a(boxE6);
        }
    }

    /* renamed from: L2 */
    public final void mo46185L2() {
        if (this.f40007r0 != null) {
            TodRide todRide = this.f40004o0;
            if (todRide == null || C20964s0.m49090h(todRide.f40270h)) {
                this.f40007r0.setVisible(false);
                return;
            }
            Intent f = C20927a0.m49011f(this.f40004o0.f40270h);
            if (f.resolveActivity(getPackageManager()) == null) {
                this.f40007r0.setVisible(false);
                return;
            }
            this.f40007r0.setIntent(f);
            this.f40007r0.setVisible(true);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.moovit.app.tod.model.TodPassengerPinCodeActionInfo} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: M0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40571M0(p502fx.C17117b r8) {
        /*
            r7 = this;
            java.lang.String r3 = r8.f44298a
            com.moovit.app.tod.model.TodPassengerActionRequiredInfoType r0 = r8.f44300c
            hq.b$a r1 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r2 = com.moovit.analytics.AnalyticsEventKey.BUTTON_CLICK
            r1.<init>(r2)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r4 = "tod_ride_action_clicked"
            r1.mo49939g(r2, r4)
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.TOD_RIDE_ACTION
            java.lang.String r4 = r0.name()
            r1.mo49939g(r2, r4)
            hq.b r1 = r1.mo49933a()
            r7.mo44545v2(r1)
            hy.b r8 = r8.f44301d
            int[] r1 = com.moovit.app.tod.TodRideActivity.C15451d.f40012a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L_0x009f
            r1 = 2
            if (r0 == r1) goto L_0x006f
            r1 = 3
            if (r0 != r1) goto L_0x0063
            if (r8 == 0) goto L_0x003d
            java.lang.Object r8 = r8.f45096d
            r2 = r8
            com.moovit.app.tod.model.TodPassengerPinCodeActionInfo r2 = (com.moovit.app.tod.model.TodPassengerPinCodeActionInfo) r2
        L_0x003d:
            int r8 = com.moovit.app.tod.pincode.TodAutonomousRidePinCodeDialogFragment.f40368m
            java.lang.String r8 = "actionId"
            mf0.C24362h.m61211f(r3, r8)
            com.moovit.app.tod.pincode.TodAutonomousRidePinCodeDialogFragment r0 = new com.moovit.app.tod.pincode.TodAutonomousRidePinCodeDialogFragment
            r0.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r1.putString(r8, r3)
            java.lang.String r8 = "pinCodeActionInfo"
            r1.putParcelable(r8, r2)
            r0.setArguments(r1)
            androidx.fragment.app.FragmentManager r8 = r7.getSupportFragmentManager()
            java.lang.String r1 = "pin_code_dialog"
            r0.show((androidx.fragment.app.FragmentManager) r8, (java.lang.String) r1)
            goto L_0x00a2
        L_0x0063:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unhandled action: "
            java.lang.String r0 = p379.C25541a.m63881k(r0, r3)
            r8.<init>(r0)
            throw r8
        L_0x006f:
            if (r8 == 0) goto L_0x0076
            java.lang.Object r8 = r8.f45095c
            ii.a r8 = (p559ii.C17601a) r8
            goto L_0x0077
        L_0x0076:
            r8 = r2
        L_0x0077:
            if (r8 == 0) goto L_0x007f
            java.lang.Object r0 = r8.f45279d
            com.moovit.image.model.Image r0 = (com.moovit.image.model.Image) r0
            r4 = r0
            goto L_0x0080
        L_0x007f:
            r4 = r2
        L_0x0080:
            if (r8 == 0) goto L_0x0088
            java.lang.Object r0 = r8.f45277b
            java.lang.String r0 = (java.lang.String) r0
            r5 = r0
            goto L_0x0089
        L_0x0088:
            r5 = r2
        L_0x0089:
            if (r8 == 0) goto L_0x0090
            java.lang.Object r8 = r8.f45278c
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x0091
        L_0x0090:
            r8 = r2
        L_0x0091:
            androidx.activity.result.b<android.content.Intent> r6 = r7.f39998X
            r1 = 0
            r0 = r7
            r2 = r5
            r5 = r8
            android.content.Intent r8 = com.moovit.barcode.scan.BarcodeScannerActivity.m40033y2(r0, r1, r2, r3, r4, r5)
            r6.mo772a(r8)
            goto L_0x00a2
        L_0x009f:
            r7.mo46177D2(r2, r3)
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.tod.TodRideActivity.mo40571M0(fx.b):void");
    }

    /* renamed from: Q1 */
    public final boolean mo19421Q1(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_tod_ride, menu);
        this.f40006q0 = menu.findItem(R.id.action_cancel);
        mo46182I2(this.f39997U.f52206g);
        this.f40008s0 = menu.findItem(R.id.action_change_destination);
        mo46183J2(this.f39997U.f52206g);
        this.f40007r0 = menu.findItem(R.id.action_call_support_center);
        mo46185L2();
        return true;
    }

    /* renamed from: a0 */
    public final void mo46186a0() {
        boolean z;
        Object obj;
        String str;
        TodRidesProvider todRidesProvider = this.f40000Z;
        String str2 = this.f40003n0;
        TodRidesProvider.C15456b bVar = todRidesProvider.f40034c;
        C6302b bVar2 = bVar.f40040b;
        if (bVar.f40043e == -1 || SystemClock.elapsedRealtime() - bVar.f40043e >= TodRidesProvider.f40030g) {
            z = false;
        } else {
            z = true;
        }
        if (!z || bVar2 == null) {
            obj = null;
        } else {
            obj = bVar2.getOrDefault(str2, null);
        }
        TodRide todRide = (TodRide) obj;
        this.f40004o0 = todRide;
        if (todRide == null) {
            mo46188r((IOException) null);
            return;
        }
        mo46181H2(todRide, (C17122g) null);
        mo46184K2(todRide);
        this.f40005p0.mo46267a(todRide, (C17122g) null);
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "tod_ride_impression");
        aVar.mo49939g(AnalyticsAttributeKey.ID, todRide.f40264b);
        aVar.mo49939g(AnalyticsAttributeKey.STATUS, C0017h.m66W(todRide.f40266d));
        aVar.mo49936d(AnalyticsAttributeKey.TIME, todRide.f40265c);
        aVar.mo49941i(AnalyticsAttributeKey.RATABLE, todRide.f40277o);
        aVar.mo49939g(AnalyticsAttributeKey.TOD_PROVIDER_NAME, todRide.f40273k);
        AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.TOD_VEHICLE_LICENSE_PLATE;
        TodRideVehicle todRideVehicle = todRide.f40268f;
        if (todRideVehicle != null) {
            str = todRideVehicle.f40302b;
        } else {
            str = null;
        }
        aVar.mo49945m(analyticsAttributeKey, str);
        Integer num = todRide.f40276n;
        if (num != null) {
            aVar.mo49935c(AnalyticsAttributeKey.RATING, num.intValue());
        }
        mo44545v2(aVar.mo49933a());
        String str3 = todRide.f40264b;
        int i = C15451d.f40014c[todRide.f40266d.ordinal()];
        if (i == 3) {
            m39511C2("ride_cancelled_view", str3);
        } else if (i == 5) {
            m39511C2("missed_ride_view", str3);
        }
        mo46185L2();
        mo46182I2((C17122g) null);
        mo46183J2((C17122g) null);
        mo46179F2();
    }

    /* renamed from: b2 */
    public final void mo19424b2(Intent intent) {
        setIntent(intent);
        mo46175A2(intent, (Bundle) null);
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.tod_ride_activity2);
        this.f40001l0.observe(this, new C17110h(this, 2));
        MapFragment mapFragment = (MapFragment) mo44529n1(R.id.map_fragment);
        mapFragment.f42347G0 = false;
        if (mapFragment.mo48624U2()) {
            mapFragment.f42368n.mo48817y(false);
        }
        Rect rect = new Rect();
        rect.set(mapFragment.f42369n0);
        rect.bottom = getResources().getDimensionPixelSize(R.dimen.tod_ride_card_peek_size) + rect.bottom;
        mapFragment.mo48647o3(rect);
        int i = rect.bottom;
        mapFragment.f42391y0 = 1.0f;
        mapFragment.f42393z0 = 1.0f;
        mapFragment.f42335A0 = 0;
        mapFragment.f42337B0 = i;
        if (mapFragment.mo48624U2()) {
            mapFragment.f42368n.mo48790g(0, 1.0f, 1.0f, i);
        }
        this.f40002m0 = new C20637f(this, mapFragment);
        TodRideBottomSheet todRideBottomSheet = (TodRideBottomSheet) findViewById(R.id.tod_ride_bottom_sheet);
        this.f40005p0 = todRideBottomSheet;
        todRideBottomSheet.setMapFragment(this.f40002m0.f52179c);
        this.f40005p0.setListener(this);
        mo46175A2(getIntent(), bundle);
    }

    /* renamed from: g2 */
    public final void mo23894g2(Bundle bundle) {
        bundle.putParcelable("ride", this.f40004o0);
    }

    /* renamed from: h2 */
    public final void mo19426h2() {
        super.mo19426h2();
        this.f40000Z.mo46195b(this);
        mo46179F2();
    }

    /* renamed from: i2 */
    public final void mo19427i2() {
        super.mo19427i2();
        mo46180G2();
        this.f40000Z.mo46196e(this);
    }

    /* renamed from: j1 */
    public final C20061g mo19428j1() {
        return C16202a.get(this).getPermissionAwareHighAccuracyFrequentUpdates();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        LocationDescriptor locationDescriptor;
        if (i == 15563) {
            if (intent != null) {
                locationDescriptor = (LocationDescriptor) intent.getParcelableExtra("search_result");
            } else {
                locationDescriptor = null;
            }
            if (i2 == -1 && locationDescriptor != null) {
                this.f40001l0.postValue(locationDescriptor);
                return;
            }
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @SuppressLint({"NonConstantResourceId"})
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean z;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.action_cancel) {
            mo44543u2((CharSequence) null);
            C17958g gVar = new C17958g(mo44548x1(), this.f40003n0);
            StringBuilder sb = new StringBuilder();
            C13715c.m34249o(C17958g.class, sb, "_");
            sb.append(gVar.f46025w);
            String sb2 = sb.toString();
            RequestOptions requestOptions = new RequestOptions();
            requestOptions.f42909f = true;
            mo44527k2(sb2, gVar, requestOptions, new C20643j(this));
            return true;
        } else if (itemId != R.id.action_change_destination) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            AnalyticsEventKey analyticsEventKey = AnalyticsEventKey.BUTTON_CLICK;
            C17474b.C17475a aVar = new C17474b.C17475a(analyticsEventKey);
            AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.TYPE;
            aVar.mo49939g(analyticsAttributeKey, "tod_ride_change_destination_clicked");
            mo44545v2(aVar.mo49933a());
            C17122g gVar2 = this.f39997U.f52206g;
            if (gVar2 == null || !gVar2.f44322j) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C17474b.C17475a aVar2 = new C17474b.C17475a(analyticsEventKey);
                aVar2.mo49939g(analyticsAttributeKey, "location_search_clicked");
                mo44545v2(aVar2.mo49933a());
                startActivityForResult(SearchLocationActivity.m17347y2(this, new AppSearchLocationCallback(0, 0, false, false, true), "tod_ride", (String) null), 15563);
            }
            return true;
        }
    }

    /* renamed from: p0 */
    public final void mo40572p0(TodRideVehicleAction todRideVehicleAction) {
        TodRideVehicleColorBar todRideVehicleColorBar;
        TodRideVehicleAC todRideVehicleAC;
        TodRide todRide;
        TodRideVehicleAudio todRideVehicleAudio;
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "tod_vehicle_action_clicked");
        aVar.mo49939g(AnalyticsAttributeKey.TOD_VEHICLE_ACTION, todRideVehicleAction.name());
        mo44545v2(aVar.mo49933a());
        int i = C15451d.f40013b[todRideVehicleAction.ordinal()];
        C7442r rVar = null;
        if (i == 1) {
            C17122g gVar = this.f39997U.f52206g;
            if (gVar != null) {
                rVar = gVar.f44321i;
            }
            if (rVar != null && (todRideVehicleColorBar = (TodRideVehicleColorBar) rVar.f22859c) != null) {
                String str = C20647n.f52214k;
                Bundle bundle = new Bundle();
                bundle.putParcelable("colorBar", todRideVehicleColorBar);
                C20647n nVar = new C20647n();
                nVar.setArguments(bundle);
                nVar.show(getSupportFragmentManager(), C20647n.f52214k);
            }
        } else if (i == 2) {
            C17122g gVar2 = this.f39997U.f52206g;
            if (gVar2 != null) {
                rVar = gVar2.f44321i;
            }
            if (rVar != null && (todRideVehicleAC = (TodRideVehicleAC) rVar.f22860d) != null && (todRide = this.f40004o0) != null) {
                String[] strArr = C19039c.f48415s;
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("vehicleAC", todRideVehicleAC);
                bundle2.putParcelable("ride", todRide);
                C19039c cVar = new C19039c();
                cVar.setArguments(bundle2);
                cVar.show(getSupportFragmentManager(), "TodAcDialog");
            }
        } else if (i == 3) {
            mo40573z(TodRideVehicleAction.BEEP, (TodRideVehicleActionInfo) null);
        } else if (i == 4) {
            mo40573z(TodRideVehicleAction.FLASH, (TodRideVehicleActionInfo) null);
        } else if (i == 5) {
            C17122g gVar3 = this.f39997U.f52206g;
            if (gVar3 != null) {
                rVar = gVar3.f44321i;
            }
            if (rVar != null && (todRideVehicleAudio = (TodRideVehicleAudio) rVar.f22861e) != null) {
                mo40573z(TodRideVehicleAction.AUDIO, new TodRideVehicleAudio(!todRideVehicleAudio.f40313b));
            }
        } else {
            StringBuilder k = C13555b.m33972k("Unhandled action: ");
            k.append(todRideVehicleAction.name());
            throw new IllegalStateException(k.toString());
        }
    }

    /* renamed from: q1 */
    public final void mo46187q1(String str) {
        this.f40000Z.mo46197f();
    }

    /* renamed from: r */
    public final void mo46188r(IOException iOException) {
        this.f40004o0 = null;
        mo46180G2();
        mo46178E2("ride_request_alert_dialog_fragment", iOException);
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        HashSet hashSet = (HashSet) s1;
        hashSet.add("TOD_SUPPORT_VALIDATOR");
        hashSet.add("TOD_LOTTIE_PRE_FETCHER");
        return s1;
    }

    /* renamed from: t0 */
    public final boolean mo19430t0(String str, int i, Bundle bundle) {
        if ("ride_request_alert_dialog_fragment".equals(str)) {
            if (i == -1) {
                TodRidesProvider todRidesProvider = this.f40000Z;
                todRidesProvider.f40034c.f40043e = -1;
                todRidesProvider.mo46197f();
            } else {
                finish();
            }
            return true;
        }
        CurrencyAmount currencyAmount = (CurrencyAmount) bundle.getParcelable("cancelFee");
        if ("cancel_ride_confirmation_dialog_fragment".equals(str)) {
            if (i == -1) {
                mo46176B2(currencyAmount);
            }
            return true;
        } else if ("cancel_ride_request_alert_dialog_fragment".equals(str)) {
            if (i == -1) {
                mo46176B2(currencyAmount);
            } else {
                finish();
            }
            return true;
        } else {
            super.mo19430t0(str, i, bundle);
            return true;
        }
    }

    /* renamed from: z */
    public final void mo40573z(TodRideVehicleAction todRideVehicleAction, TodRideVehicleActionInfo todRideVehicleActionInfo) {
        C17976x xVar = new C17976x(mo44548x1(), this.f40003n0, todRideVehicleAction, todRideVehicleActionInfo);
        StringBuilder sb = new StringBuilder();
        C13715c.m34249o(C17976x.class, sb, "_");
        sb.append(xVar.f46060w);
        sb.append("_");
        sb.append(xVar.f46061x);
        String sb2 = sb.toString();
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42909f = true;
        mo44527k2(sb2, xVar, requestOptions, new C20645l(this));
    }
}
