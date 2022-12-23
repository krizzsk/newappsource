package com.moovit.app.navigation.checkin;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.appsflyer.ServerParameters;
import com.moovit.MoovitNotificationChannel;
import com.moovit.app.navigation.MultiLegNavActivity;
import com.moovit.commons.geo.Geofence;
import com.moovit.navigation.AbstractNavigable;
import com.moovit.navigation.ArrivalState;
import com.moovit.navigation.C4231d;
import com.moovit.navigation.NavigationLeg;
import com.moovit.navigation.NavigationPath;
import com.moovit.navigation.NavigationService;
import com.moovit.navigation.RequestedNavigationMode;
import com.moovit.navigation.event.NavigationProgressEvent;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitStop;
import com.moovit.util.ServerIdMap;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.checkin.MVCheckOutRequest;
import com.tranzmate.moovit.protocol.kinesis.MVServerMessage;
import d40.C4351g;
import g40.C4792a;
import i40.C5278a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.thrift.TBase;
import p067e1.C4503l0;
import p067e1.C4522y;
import p401bz.C13712f;
import p567iq.C17635b;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;
import p824tp.C19740r;
import p877vu.C20233c;
import p925xu.C20619a;
import p977zz.C20927a0;
import p977zz.C20934d0;

public class Checkin extends AbstractNavigable {
    public static final Parcelable.Creator<Checkin> CREATOR = new C15184a();

    /* renamed from: s */
    public static final C15185b f39129s = new C15185b();

    /* renamed from: t */
    public static final C15186c f39130t = new C15186c(Checkin.class);

    /* renamed from: h */
    public final String f39131h;

    /* renamed from: i */
    public final TransitLine f39132i;

    /* renamed from: j */
    public final long f39133j;

    /* renamed from: k */
    public long f39134k;

    /* renamed from: l */
    public long f39135l;

    /* renamed from: m */
    public final ServerIdMap<TransitStop> f39136m;

    /* renamed from: n */
    public final NavigationLeg f39137n;

    /* renamed from: o */
    public final List<Geofence> f39138o;

    /* renamed from: p */
    public final boolean f39139p;

    /* renamed from: q */
    public final RequestedNavigationMode f39140q;

    /* renamed from: r */
    public final boolean f39141r;

    /* renamed from: com.moovit.app.navigation.checkin.Checkin$a */
    public class C15184a implements Parcelable.Creator<Checkin> {
        public final Object createFromParcel(Parcel parcel) {
            return (Checkin) C19612n.m46981v(parcel, Checkin.f39130t);
        }

        public final Object[] newArray(int i) {
            return new Checkin[i];
        }
    }

    /* renamed from: com.moovit.app.navigation.checkin.Checkin$b */
    public class C15185b extends C19621u<Checkin> {
        public C15185b() {
            super(1);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            Checkin checkin = (Checkin) obj;
            qVar.mo51954p(checkin.f39131h);
            TransitLine transitLine = checkin.f39132i;
            TransitLine.C7811b bVar = TransitLine.f23682h;
            qVar.mo51939l(0);
            bVar.mo19622a(transitLine, qVar);
            qVar.mo51940m(checkin.f39133j);
            qVar.mo51940m(checkin.f39134k);
            qVar.mo51940m(checkin.f39135l);
            NavigationLeg navigationLeg = checkin.f39137n;
            NavigationLeg.C4215b bVar2 = NavigationLeg.f15052g;
            qVar.mo51939l(0);
            bVar2.mo19622a(navigationLeg, qVar);
            qVar.mo51965h(checkin.f39138o, Geofence.f40972d);
            qVar.mo51965h(checkin.f39136m.values(), TransitStop.f23728r);
            qVar.mo51934b(checkin.f39139p);
            RequestedNavigationMode.CODER.write(checkin.f39140q, qVar);
            qVar.mo51934b(checkin.f39141r);
        }
    }

    /* renamed from: com.moovit.app.navigation.checkin.Checkin$c */
    public class C15186c extends C19620t<Checkin> {
        public C15186c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i <= 1;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            NavigationLeg navigationLeg;
            C19615p pVar2 = pVar;
            String p = pVar.mo51947p();
            TransitLine transitLine = (TransitLine) TransitLine.f23683i.read(pVar2);
            long m = pVar.mo51925m();
            long m2 = pVar.mo51925m();
            long m3 = pVar.mo51925m();
            if (i == 0) {
                navigationLeg = new NavigationLeg(NavigationLeg.Type.TRANSIT, pVar2.mo51959g(NavigationPath.f15061m), new ServerId(pVar.mo51924l()), transitLine);
            } else {
                navigationLeg = (NavigationLeg) NavigationLeg.f15053h.read(pVar2);
            }
            ArrayList g = pVar2.mo51959g(Geofence.f40973e);
            ArrayList g2 = pVar2.mo51959g(TransitStop.f23729s);
            if (i == 0) {
                pVar.mo51919b();
            }
            return new Checkin(p, transitLine, m, m2, m3, navigationLeg, g, g2, pVar.mo51919b(), RequestedNavigationMode.CODER.read(pVar2), pVar.mo51919b());
        }
    }

    /* renamed from: com.moovit.app.navigation.checkin.Checkin$d */
    public static class C15187d extends C13712f {

        /* renamed from: c */
        public final String f39142c;

        /* renamed from: d */
        public final long f39143d = System.currentTimeMillis();

        public C15187d(C4351g gVar, String str) {
            super(gVar);
            C21100e.m49373x(str, "navigableId");
            this.f39142c = str;
        }

        /* renamed from: a */
        public final TBase mo21426a() {
            String str = this.f39142c;
            long j = this.f39143d;
            MVCheckOutRequest mVCheckOutRequest = new MVCheckOutRequest();
            mVCheckOutRequest.guid = str;
            mVCheckOutRequest.timestamp = j;
            mVCheckOutRequest.mo25975h();
            MVServerMessage mVServerMessage = new MVServerMessage();
            mVServerMessage.setField_ = MVServerMessage._Fields.CHECKOUT;
            mVServerMessage.value_ = mVCheckOutRequest;
            return mVServerMessage;
        }
    }

    public Checkin(String str, TransitLine transitLine, long j, long j2, long j3, NavigationLeg navigationLeg, ArrayList arrayList, Collection collection, boolean z, RequestedNavigationMode requestedNavigationMode, boolean z2) {
        C21100e.m49373x(str, ServerParameters.AF_USER_ID);
        this.f39131h = str;
        C21100e.m49373x(transitLine, "transitLine");
        this.f39132i = transitLine;
        this.f39133j = j;
        this.f39134k = j2;
        this.f39135l = j3;
        C21100e.m49373x(navigationLeg, "leg");
        this.f39137n = navigationLeg;
        C21100e.m49373x(arrayList, "criticalAreas");
        this.f39138o = arrayList;
        C21100e.m49373x(collection, "stops");
        this.f39136m = ServerIdMap.m17949a(collection);
        this.f39139p = z;
        C21100e.m49373x(requestedNavigationMode, "requestedNavigationMode");
        this.f39140q = requestedNavigationMode;
        this.f39141r = z2;
    }

    /* renamed from: D1 */
    public final void mo19599D1() {
    }

    /* renamed from: H0 */
    public final RequestedNavigationMode mo19636H0() {
        return this.f39140q;
    }

    /* renamed from: P1 */
    public final ServerIdMap<TransitStop> mo19637P1() {
        return this.f39136m;
    }

    /* renamed from: T0 */
    public final long mo19602T0() {
        return this.f39134k;
    }

    /* renamed from: X */
    public final List<Geofence> mo19638X() {
        return this.f39138o;
    }

    /* renamed from: b */
    public final void mo19605b(NavigationProgressEvent navigationProgressEvent, boolean z) {
        boolean z2;
        if (!C20233c.m47801b(this.f15015b) || !z || navigationProgressEvent.f15115f.compareTo(ArrivalState.TRAVELLING) <= 0 || navigationProgressEvent.f15115f.compareTo(ArrivalState.DISEMBARK) > 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            C4351g gVar = this.f15015b;
            mo19607d(gVar, new C5278a(gVar, navigationProgressEvent), mo45647f(gVar), false);
        }
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e0 */
    public final String mo19639e0() {
        return this.f39131h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Checkin)) {
            return false;
        }
        return this.f39131h.equals(((Checkin) obj).f39131h);
    }

    /* renamed from: f */
    public final PendingIntent mo45647f(C4351g gVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Intent.makeMainActivity(C17635b.m43779f(gVar).f50171a.f50151b));
        String str = this.f39131h;
        int i = MultiLegNavActivity.f39101S0;
        Intent intent = new Intent(gVar, MultiLegNavActivity.class);
        intent.putExtra("navigable_id_key", str);
        arrayList.add(intent);
        int e = C20927a0.m49010e(134217728);
        if (!arrayList.isEmpty()) {
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            return C4503l0.C4504a.m11737a(gVar, 0, intentArr, e, (Bundle) null);
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
    }

    /* renamed from: g2 */
    public final void mo19608g2() {
        C17635b.m43779f(this.f15015b).f50172b.mo42913b(new C15187d(this.f15015b, this.f39131h), true);
    }

    public final long getExpirationTime() {
        return this.f39135l;
    }

    public final int hashCode() {
        return this.f39131h.hashCode();
    }

    /* renamed from: j0 */
    public final long mo19641j0() {
        return this.f39133j;
    }

    /* renamed from: k0 */
    public final long mo19642k0(NavigationProgressEvent navigationProgressEvent) {
        int i;
        long currentTimeMillis = System.currentTimeMillis();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (navigationProgressEvent != null) {
            i = navigationProgressEvent.f15120k;
        } else {
            i = this.f39137n.f15055c.get(0).f15070j;
        }
        return timeUnit.toMillis((long) i) + currentTimeMillis;
    }

    /* renamed from: r1 */
    public final Notification mo19643r1() {
        boolean z = true;
        if (C20934d0.m49032c(this.f15015b)) {
            C4351g gVar = this.f15015b;
            C4231d<?> dVar = this.f15017d;
            NavigationProgressEvent navigationProgressEvent = this.f15016c;
            C4792a aVar = new C4792a(gVar);
            C4522y yVar = aVar.f16175b;
            yVar.f15644y.icon = R.drawable.ic_notification_ride;
            yVar.f15629j = 0;
            yVar.f15634o = "progress";
            yVar.mo20034f(2, true);
            aVar.f16175b.mo20034f(8, true);
            aVar.f16175b.f15626g = mo45647f(gVar);
            PendingIntent service = PendingIntent.getService(gVar, 0, NavigationService.m11309z(gVar, this.f39131h, "user_terminated"), C20927a0.m49010e(134217728));
            aVar.f16176c.setOnClickPendingIntent(C19740r.notification_action_stop, service);
            if (service == null) {
                z = false;
            }
            aVar.f16182i = z;
            aVar.mo20312c(new C20619a(gVar, this.f39137n, this, navigationProgressEvent, dVar));
            return aVar.mo20310a();
        }
        C4351g gVar2 = this.f15015b;
        C4522y build = MoovitNotificationChannel.NAVIGATION.build(gVar2);
        build.f15644y.icon = R.drawable.ic_notification_ride;
        build.mo20032d(gVar2.getString(R.string.location_rational_live_navigation_title));
        build.mo20031c(gVar2.getString(R.string.location_rational_live_navigation_message));
        build.f15626g = mo45647f(gVar2);
        build.mo20034f(2, true);
        build.mo20034f(8, true);
        build.f15629j = 2;
        return build.mo20030a();
    }

    /* renamed from: u0 */
    public final List<NavigationLeg> mo19644u0() {
        return Collections.singletonList(this.f39137n);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f39129s);
    }

    /* renamed from: y0 */
    public final void mo19610y0() {
        super.mo19610y0();
        ((NotificationManager) this.f15015b.getSystemService("notification")).cancel(mo19639e0(), C19740r.nav_alert_notification);
    }

    /* renamed from: y1 */
    public final void mo19611y1() {
    }
}
