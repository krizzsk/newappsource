package com.moovit.app.navigation.itinerary;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.widget.RemoteViews;
import ce0.C21100e;
import com.moovit.MoovitNotificationChannel;
import com.moovit.app.navigation.MultiLegNavActivity;
import com.moovit.commons.geo.Geofence;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.navigation.AbstractNavigable;
import com.moovit.navigation.ArrivalState;
import com.moovit.navigation.C4231d;
import com.moovit.navigation.NavigationLeg;
import com.moovit.navigation.NavigationService;
import com.moovit.navigation.RequestedNavigationMode;
import com.moovit.navigation.event.NavigationProgressEvent;
import com.moovit.transit.LocationDescriptor;
import com.moovit.transit.TransitStop;
import com.moovit.util.ServerIdMap;
import com.tranzmate.R;
import d40.C4351g;
import e20.C16769e;
import g40.C4792a;
import h40.C5051b;
import i40.C5278a;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p067e1.C4503l0;
import p067e1.C4522y;
import p175n.C5768c;
import p567iq.C17635b;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;
import p824tp.C19740r;
import p877vu.C20233c;
import p948yu.C20768a;
import p972zu.C20903j;
import p977zz.C20927a0;
import p977zz.C20934d0;

public class ItineraryNavigable extends AbstractNavigable {
    public static final Parcelable.Creator<ItineraryNavigable> CREATOR = new C15189b();

    /* renamed from: t */
    public static final Uri f39144t = Uri.parse("moovit://");

    /* renamed from: u */
    public static final C15190c f39145u = new C15190c();

    /* renamed from: v */
    public static final C15191d f39146v = new C15191d(ItineraryNavigable.class);

    /* renamed from: h */
    public C15188a f39147h = new C15188a();

    /* renamed from: i */
    public C20768a f39148i = null;

    /* renamed from: j */
    public final Itinerary f39149j;

    /* renamed from: k */
    public final String f39150k;

    /* renamed from: l */
    public final long f39151l;

    /* renamed from: m */
    public final List<NavigationLeg> f39152m;

    /* renamed from: n */
    public final ServerIdMap<TransitStop> f39153n;

    /* renamed from: o */
    public final List<Geofence> f39154o;

    /* renamed from: p */
    public final long f39155p;

    /* renamed from: q */
    public final RequestedNavigationMode f39156q;

    /* renamed from: r */
    public int f39157r = -1;

    /* renamed from: s */
    public SparseBooleanArray f39158s = new SparseBooleanArray();

    /* renamed from: com.moovit.app.navigation.itinerary.ItineraryNavigable$a */
    public class C15188a extends BroadcastReceiver {
        public C15188a() {
        }

        public final void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            action.getClass();
            if (action.equals("com.moovit.navigation.itinerary_broadcast_receiver.action.show_leg_in_notification")) {
                int i = intent.getExtras().getInt("com.moovit.navigation.itinerary_broadcast_receiver.leg_index_extra");
                ItineraryNavigable itineraryNavigable = ItineraryNavigable.this;
                itineraryNavigable.f39157r = i;
                itineraryNavigable.f15015b.mo19860j();
            }
        }
    }

    /* renamed from: com.moovit.app.navigation.itinerary.ItineraryNavigable$b */
    public class C15189b implements Parcelable.Creator<ItineraryNavigable> {
        public final Object createFromParcel(Parcel parcel) {
            return (ItineraryNavigable) C19612n.m46981v(parcel, ItineraryNavigable.f39146v);
        }

        public final Object[] newArray(int i) {
            return new ItineraryNavigable[i];
        }
    }

    /* renamed from: com.moovit.app.navigation.itinerary.ItineraryNavigable$c */
    public class C15190c extends C19621u<ItineraryNavigable> {
        public C15190c() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            ItineraryNavigable itineraryNavigable = (ItineraryNavigable) obj;
            Itinerary itinerary = itineraryNavigable.f39149j;
            Itinerary.C16086b bVar = Itinerary.f41892f;
            qVar.getClass();
            qVar.mo51939l(0);
            bVar.mo19622a(itinerary, qVar);
            qVar.mo51954p(itineraryNavigable.f39150k);
            qVar.mo51940m(itineraryNavigable.f39151l);
            qVar.mo51965h(itineraryNavigable.f39152m, NavigationLeg.f15052g);
            qVar.mo51965h(itineraryNavigable.f39153n.values(), TransitStop.f23728r);
            qVar.mo51965h(itineraryNavigable.f39154o, Geofence.f40972d);
            qVar.mo51940m(itineraryNavigable.f39155p);
            RequestedNavigationMode.CODER.write(itineraryNavigable.f39156q, qVar);
        }
    }

    /* renamed from: com.moovit.app.navigation.itinerary.ItineraryNavigable$d */
    public class C15191d extends C19620t<ItineraryNavigable> {
        public C15191d(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            Itinerary.C16087c cVar = Itinerary.f41893g;
            pVar.getClass();
            return new ItineraryNavigable((Itinerary) cVar.read(pVar), pVar.mo51947p(), pVar.mo51925m(), pVar.mo51959g(NavigationLeg.f15053h), pVar.mo51959g(TransitStop.f23729s), pVar.mo51959g(Geofence.f40973e), pVar.mo51925m(), RequestedNavigationMode.CODER.read(pVar));
        }
    }

    public ItineraryNavigable(Itinerary itinerary, String str, long j, ArrayList arrayList, AbstractCollection abstractCollection, ArrayList arrayList2, long j2, RequestedNavigationMode requestedNavigationMode) {
        C21100e.m49373x(itinerary, "itinerary");
        this.f39149j = itinerary;
        C21100e.m49373x(str, "id");
        this.f39150k = str;
        this.f39151l = j;
        C21100e.m49373x(arrayList, "legs");
        this.f39152m = arrayList;
        C21100e.m49373x(abstractCollection, "stops");
        this.f39153n = ServerIdMap.m17949a(abstractCollection);
        C21100e.m49373x(arrayList2, "criticalAreas");
        this.f39154o = arrayList2;
        this.f39155p = j2;
        C21100e.m49373x(requestedNavigationMode, "requestedNavigationMode");
        this.f39156q = requestedNavigationMode;
    }

    /* renamed from: g */
    public static Intent m38800g(int i) {
        Intent intent = new Intent();
        intent.setData(f39144t.buildUpon().appendPath(Integer.toString(i)).build());
        intent.setAction("com.moovit.navigation.itinerary_broadcast_receiver.action.show_leg_in_notification");
        intent.putExtra("com.moovit.navigation.itinerary_broadcast_receiver.leg_index_extra", i);
        return intent;
    }

    /* renamed from: H0 */
    public final RequestedNavigationMode mo19636H0() {
        return this.f39156q;
    }

    /* renamed from: P1 */
    public final ServerIdMap<TransitStop> mo19637P1() {
        return this.f39153n;
    }

    /* renamed from: X */
    public final List<Geofence> mo19638X() {
        return this.f39154o;
    }

    /* renamed from: b */
    public final void mo19605b(NavigationProgressEvent navigationProgressEvent, boolean z) {
        boolean z2;
        if (z) {
            this.f39157r = -1;
        }
        Leg leg = this.f39149j.mo48295u0().get(navigationProgressEvent.f15112c);
        boolean z3 = true;
        if (!C20233c.m47801b(this.f15015b) || !z || (!(leg.getType() == 2 || leg.getType() == 9) || navigationProgressEvent.f15115f.compareTo(ArrivalState.TRAVELLING) <= 0 || navigationProgressEvent.f15115f.compareTo(ArrivalState.DISEMBARK) > 0)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            C4351g gVar = this.f15015b;
            mo19607d(gVar, new C5278a(gVar, navigationProgressEvent), mo45654f(gVar, navigationProgressEvent, navigationProgressEvent.f15112c), false);
        }
        if (this.f39148i != null && z) {
            Leg leg2 = this.f39149j.mo48295u0().get(navigationProgressEvent.f15112c);
            int type = leg2.getType();
            if (type == 1) {
                z3 = LocationDescriptor.LocationType.BICYCLE_STOP.equals(leg2.mo48334e2().f23647b);
            } else if (!(type == 3 || type == 10 || type == 12)) {
                z3 = false;
            }
            if (z3) {
                this.f39148i.mo23804e();
            } else {
                this.f39148i.mo23803d();
            }
        }
    }

    /* renamed from: c */
    public final void mo19606c(C4351g gVar) {
        IntentFilter intentFilter = new IntentFilter("com.moovit.navigation.itinerary_broadcast_receiver.action.show_leg_in_notification");
        intentFilter.addDataScheme(f39144t.getScheme());
        gVar.registerReceiver(this.f39147h, intentFilter);
        C20768a aVar = new C20768a(this, gVar, new Handler(gVar.f15324a.f41041b), TimeUnit.MINUTES.toMillis(1));
        this.f39148i = aVar;
        aVar.mo49466h(this.f39149j);
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e0 */
    public final String mo19639e0() {
        return this.f39150k;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ItineraryNavigable)) {
            return false;
        }
        return this.f39150k.equals(((ItineraryNavigable) obj).f39150k);
    }

    /* renamed from: f */
    public final PendingIntent mo45654f(C4351g gVar, NavigationProgressEvent navigationProgressEvent, int i) {
        Itinerary a = C20233c.m47800a(this, navigationProgressEvent);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Intent.makeMainActivity(C17635b.m43779f(gVar).f50171a.f50151b));
        arrayList.add(MultiLegNavActivity.m38728T2(gVar, a, i, this.f39150k));
        int e = C20927a0.m49010e(134217728);
        if (!arrayList.isEmpty()) {
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            return C4503l0.C4504a.m11737a(gVar, 1, intentArr, e, (Bundle) null);
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
    }

    public final long getExpirationTime() {
        return this.f39155p;
    }

    public final int hashCode() {
        return this.f39150k.hashCode();
    }

    /* renamed from: j0 */
    public final long mo19641j0() {
        return this.f39151l;
    }

    /* renamed from: k0 */
    public final long mo19642k0(NavigationProgressEvent navigationProgressEvent) {
        int i;
        int i2 = 0;
        if (navigationProgressEvent == null) {
            i = 0;
        } else {
            i = navigationProgressEvent.f15112c + 1;
        }
        long j = 0;
        while (i < this.f39152m.size()) {
            j += (long) this.f39152m.get(i).f15055c.get(0).f15070j;
            i++;
        }
        long currentTimeMillis = System.currentTimeMillis();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (navigationProgressEvent != null) {
            i2 = navigationProgressEvent.f15120k;
        }
        return timeUnit.toMillis(((long) i2) + j) + currentTimeMillis;
    }

    /* renamed from: r1 */
    public final Notification mo19643r1() {
        int i;
        boolean z;
        PendingIntent pendingIntent;
        boolean z2;
        PendingIntent pendingIntent2;
        boolean z3;
        C20903j jVar;
        C16769e.C16772c cVar;
        NavigationProgressEvent navigationProgressEvent = this.f15016c;
        int i2 = this.f39157r;
        if (i2 < 0 && navigationProgressEvent != null) {
            i2 = navigationProgressEvent.f15112c;
        }
        boolean z4 = true;
        if (C20934d0.m49032c(this.f15015b)) {
            C4351g gVar = this.f15015b;
            C4231d<?> dVar = this.f15017d;
            if (i2 < 0) {
                i = 0;
            } else {
                i = i2;
            }
            if (navigationProgressEvent == null || i2 != navigationProgressEvent.f15112c) {
                z = false;
            } else {
                z = true;
            }
            C4792a aVar = new C4792a(gVar);
            C4522y yVar = aVar.f16175b;
            yVar.f15644y.icon = R.drawable.ic_notification_ride;
            yVar.mo20034f(2, true);
            aVar.f16175b.mo20034f(8, true);
            C4522y yVar2 = aVar.f16175b;
            yVar2.f15629j = 0;
            yVar2.f15634o = "progress";
            aVar.f16175b.f15626g = mo45654f(gVar, navigationProgressEvent, i);
            if (i == 0) {
                pendingIntent = null;
            } else {
                pendingIntent = PendingIntent.getBroadcast(gVar, 0, m38800g(i - 1), C20927a0.m49010e(268435456));
            }
            if (pendingIntent != null) {
                int i3 = C19740r.notification_action_prev;
                for (RemoteViews onClickPendingIntent : aVar.f16178e) {
                    onClickPendingIntent.setOnClickPendingIntent(i3, pendingIntent);
                }
            }
            if (pendingIntent != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            aVar.f16180g = z2;
            if (i == this.f39152m.size() - 1) {
                pendingIntent2 = null;
            } else {
                pendingIntent2 = PendingIntent.getBroadcast(gVar, 0, m38800g(i + 1), C20927a0.m49010e(268435456));
            }
            if (pendingIntent2 != null) {
                int i4 = C19740r.notification_action_next;
                for (RemoteViews onClickPendingIntent2 : aVar.f16178e) {
                    onClickPendingIntent2.setOnClickPendingIntent(i4, pendingIntent2);
                }
            }
            if (pendingIntent2 != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            aVar.f16181h = z3;
            PendingIntent service = PendingIntent.getService(gVar, 0, NavigationService.m11309z(gVar, this.f39150k, "user_terminated"), C20927a0.m49010e(134217728));
            aVar.f16176c.setOnClickPendingIntent(C19740r.notification_action_stop, service);
            if (service == null) {
                z4 = false;
            }
            aVar.f16182i = z4;
            C5768c cVar2 = new C5768c((Context) gVar, (int) R.style.MoovitTheme);
            if (!z) {
                jVar = new C20903j(cVar2, this, (NavigationProgressEvent) null, (C4231d<?>) null, (C16769e.C16772c) null);
            } else {
                C20768a aVar2 = this.f39148i;
                if (aVar2 != null) {
                    cVar = aVar2.f43661l;
                } else {
                    cVar = null;
                }
                jVar = new C20903j(cVar2, this, navigationProgressEvent, dVar, cVar);
            }
            aVar.mo20312c((C5051b) this.f39149j.mo48295u0().get(i).mo48338i0(jVar));
            return aVar.mo20310a();
        }
        C4351g gVar2 = this.f15015b;
        if (i2 < 0) {
            i2 = 0;
        }
        C4522y build = MoovitNotificationChannel.NAVIGATION.build(gVar2);
        build.f15644y.icon = R.drawable.ic_notification_ride;
        build.mo20032d(gVar2.getString(R.string.location_rational_live_navigation_title));
        build.mo20031c(gVar2.getString(R.string.location_rational_live_navigation_message));
        build.f15626g = mo45654f(gVar2, navigationProgressEvent, i2);
        build.mo20034f(2, true);
        build.mo20034f(8, true);
        build.f15629j = 2;
        return build.mo20030a();
    }

    /* renamed from: u0 */
    public final List<NavigationLeg> mo19644u0() {
        return this.f39152m;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f39145u);
    }

    /* renamed from: y0 */
    public final void mo19610y0() {
        super.mo19610y0();
        C4351g gVar = this.f15015b;
        ((NotificationManager) gVar.getSystemService("notification")).cancel(mo19639e0(), C19740r.nav_alert_notification);
        gVar.unregisterReceiver(this.f39147h);
        C20768a aVar = this.f39148i;
        if (aVar != null) {
            aVar.mo23803d();
            this.f39148i = null;
        }
    }
}
