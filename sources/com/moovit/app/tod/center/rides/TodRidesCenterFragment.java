package com.moovit.app.tod.center.rides;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import ce0.C21100e;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.tod.TodRideActivity;
import com.moovit.app.tod.center.C15489a;
import com.moovit.app.tod.center.TodAbstractCenterFragment;
import com.moovit.app.tod.model.TodRide;
import com.tranzmate.R;
import kotlin.Metadata;
import mf0.C24361g;
import mf0.C24362h;
import p001a0.C0017h;
import p376ax.C13545g;
import p454dx.C16746a;
import p543hq.C17474b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo59060d2 = {"Lcom/moovit/app/tod/center/rides/TodRidesCenterFragment;", "Lcom/moovit/app/tod/center/TodAbstractCenterFragment;", "Ldx/a$a;", "<init>", "()V", "App_moovitWorldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class TodRidesCenterFragment extends TodAbstractCenterFragment implements C16746a.C16747a {

    /* renamed from: r */
    public static final /* synthetic */ int f40217r = 0;

    /* renamed from: q */
    public final C16746a f40218q = new C16746a(this);

    /* renamed from: com.moovit.app.tod.center.rides.TodRidesCenterFragment$a */
    public /* synthetic */ class C15491a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40219a;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.moovit.app.tod.model.TodRideStatus[] r0 = com.moovit.app.tod.model.TodRideStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.moovit.app.tod.model.TodRideStatus r1 = com.moovit.app.tod.model.TodRideStatus.ACTIVE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.moovit.app.tod.model.TodRideStatus r1 = com.moovit.app.tod.model.TodRideStatus.FUTURE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.moovit.app.tod.model.TodRideStatus r1 = com.moovit.app.tod.model.TodRideStatus.CANCELLED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.moovit.app.tod.model.TodRideStatus r1 = com.moovit.app.tod.model.TodRideStatus.COMPLETED     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.moovit.app.tod.model.TodRideStatus r1 = com.moovit.app.tod.model.TodRideStatus.PASSENGER_NOT_SHOWN     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                com.moovit.app.tod.model.TodRideStatus r1 = com.moovit.app.tod.model.TodRideStatus.DECLINED     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                f40219a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.tod.center.rides.TodRidesCenterFragment.C15491a.<clinit>():void");
        }
    }

    /* renamed from: C0 */
    public final void mo46292C0(TodRide todRide) {
        C24362h.m61211f(todRide, "ride");
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "tod_rides_center_ride_clicked");
        aVar.mo49939g(AnalyticsAttributeKey.ID, todRide.f40264b);
        aVar.mo49939g(AnalyticsAttributeKey.STATUS, C0017h.m66W(todRide.f40266d));
        aVar.mo49936d(AnalyticsAttributeKey.TIME, todRide.f40265c);
        mo46797j2(aVar.mo49933a());
        Context context = mo46282o2().getContext();
        switch (C15491a.f40219a[todRide.f40266d.ordinal()]) {
            case 1:
            case 2:
                startActivity(TodRideActivity.m39513z2(context, todRide.f40264b));
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                String str = todRide.f40264b;
                int i = TodRideDetailsActivity.f40215X;
                Intent intent = new Intent(context, TodRideDetailsActivity.class);
                C21100e.m49373x(str, "rideId");
                intent.putExtra("ride_id", str);
                startActivity(intent);
                return;
            default:
                return;
        }
    }

    /* renamed from: n2 */
    public final int mo46281n2() {
        return R.string.tod_passenger_rides_center_empty_message;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C24362h.m61211f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        C24361g.m61135E(((C15489a) this.f40195o.getValue()).f40212g).observe(getViewLifecycleOwner(), new C13545g(new TodRidesCenterFragment$onViewCreated$1(this), 1));
    }
}
