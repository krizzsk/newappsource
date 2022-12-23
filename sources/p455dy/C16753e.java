package p455dy;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import c00.C13717b;
import c70.C13752e;
import ce0.C21100e;
import com.appboy.models.outgoing.FacebookUser;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.app.tracking.TrackingEvent;
import com.moovit.app.useraccount.manager.UserAccountDataProvider;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.app.useraccount.manager.favorites.LineFavorite;
import com.moovit.app.useraccount.manager.favorites.LocationFavorite;
import com.moovit.app.useraccount.manager.favorites.LocationsGroup;
import com.moovit.app.useraccount.manager.favorites.StopFavorite;
import com.moovit.commons.request.ServerException;
import com.moovit.metroentities.MetroEntityType;
import com.moovit.network.model.ServerId;
import com.moovit.transit.LocationDescriptor;
import com.moovit.transit.TransitLineGroup;
import com.moovit.transit.TransitStop;
import com.usebutton.sdk.internal.api.AppActionRequest;
import g30.C4776h;
import i30.C5268d;
import i30.C5269e;
import i30.C5274h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p401bz.C13709c;
import p479ey.C16895g;
import p479ey.C16896h;
import p567iq.C17635b;
import p613kq.C18114a;
import p824tp.C19728f;
import p922xr.C20559a;

/* renamed from: dy.e */
public final class C16753e implements UserAccountDataProvider<List<C16749b>> {

    /* renamed from: a */
    public final LocationsGroup f43617a = new LocationsGroup();

    /* renamed from: b */
    public final ArrayList f43618b = new ArrayList();

    /* renamed from: c */
    public final ArrayList f43619c = new ArrayList();

    /* renamed from: d */
    public LocationFavorite f43620d;

    /* renamed from: e */
    public LocationFavorite f43621e;

    /* renamed from: f */
    public final Context f43622f;

    /* renamed from: g */
    public final C13752e f43623g;

    /* renamed from: h */
    public final ServerId f43624h;

    /* renamed from: i */
    public final ArrayList f43625i = new ArrayList();

    /* renamed from: j */
    public final ArrayList f43626j = new ArrayList();

    /* renamed from: k */
    public final ArrayList f43627k = new ArrayList();

    /* renamed from: dy.e$a */
    public static /* synthetic */ class C16754a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f43628a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.moovit.transit.LocationDescriptor$LocationType[] r0 = com.moovit.transit.LocationDescriptor.LocationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f43628a = r0
                com.moovit.transit.LocationDescriptor$LocationType r1 = com.moovit.transit.LocationDescriptor.LocationType.STOP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f43628a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.transit.LocationDescriptor$LocationType r1 = com.moovit.transit.LocationDescriptor.LocationType.BICYCLE_STOP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p455dy.C16753e.C16754a.<clinit>():void");
        }
    }

    /* renamed from: dy.e$b */
    public interface C16755b {
        /* renamed from: q */
        void mo44782q();

        /* renamed from: v0 */
        void mo44783v0();
    }

    /* renamed from: dy.e$c */
    public interface C16756c {
        /* renamed from: h */
        void mo44786h(C16753e eVar, LocationFavorite locationFavorite);

        /* renamed from: k */
        void mo44787k(C16753e eVar, LocationFavorite locationFavorite);

        /* renamed from: s */
        void mo44788s(C16753e eVar, LocationFavorite locationFavorite);

        /* renamed from: t1 */
        void mo44789t1(C16753e eVar, LocationFavorite locationFavorite);

        /* renamed from: y0 */
        void mo44790y0(C16753e eVar, LocationFavorite locationFavorite);
    }

    /* renamed from: dy.e$d */
    public interface C16757d {
        /* renamed from: C */
        void mo44784C();

        /* renamed from: f */
        void mo44785f();
    }

    public C16753e(Context context, UserAccountManager userAccountManager, C13752e eVar, ServerId serverId) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f43622f = context.getApplicationContext();
        this.f43623g = eVar;
        C21100e.m49373x(serverId, "metroId");
        this.f43624h = serverId;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: n */
    public static C16753e m42310n(Context context) {
        return (C16753e) context.getSystemService("user_favorites_manager_service");
    }

    /* renamed from: x */
    public static void m42311x(LocationFavorite locationFavorite, C5269e eVar) {
        LocationDescriptor locationDescriptor = (LocationDescriptor) locationFavorite.f52687b;
        ServerId serverId = locationDescriptor.f23649d;
        if (serverId != null) {
            int i = C16754a.f43628a[locationDescriptor.f23647b.ordinal()];
            if (i == 1) {
                eVar.mo21066a(MetroEntityType.TRANSIT_STOP, serverId);
            } else if (i == 2) {
                eVar.mo21066a(MetroEntityType.BICYCLE_STOP, serverId);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.moovit.app.useraccount.manager.favorites.LocationFavorite m42312y(com.moovit.app.useraccount.manager.favorites.LocationFavorite r6, i30.C5268d r7) {
        /*
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            T r1 = r6.f52687b
            com.moovit.transit.LocationDescriptor r1 = (com.moovit.transit.LocationDescriptor) r1
            com.moovit.network.model.ServerId r2 = r1.f23649d
            com.moovit.transit.LocationDescriptor$LocationType r1 = r1.f23647b
            r3 = 0
            int[] r4 = p455dy.C16753e.C16754a.f43628a
            int r1 = r1.ordinal()
            r1 = r4[r1]
            r4 = 1
            if (r1 == r4) goto L_0x002b
            r5 = 2
            if (r1 == r5) goto L_0x001c
            goto L_0x0037
        L_0x001c:
            com.moovit.util.ServerIdMap<com.moovit.transit.BicycleStop> r7 = r7.f17408e
            java.lang.Object r7 = r7.get(r2)
            com.moovit.transit.BicycleStop r7 = (com.moovit.transit.BicycleStop) r7
            if (r7 == 0) goto L_0x0036
            com.moovit.transit.LocationDescriptor r0 = com.moovit.transit.LocationDescriptor.m17768b(r7)
            goto L_0x0037
        L_0x002b:
            com.moovit.transit.TransitStop r7 = r7.mo21064c(r2)
            if (r7 == 0) goto L_0x0036
            com.moovit.transit.LocationDescriptor r0 = com.moovit.transit.LocationDescriptor.m17769c(r7)
            goto L_0x0037
        L_0x0036:
            r3 = 1
        L_0x0037:
            if (r3 == 0) goto L_0x004d
            T r7 = r6.f52687b
            com.moovit.transit.LocationDescriptor r7 = (com.moovit.transit.LocationDescriptor) r7
            com.moovit.commons.geo.LatLonE6 r0 = r7.mo24310d()
            com.moovit.transit.LocationDescriptor r0 = com.moovit.transit.LocationDescriptor.m17770k(r0)
            java.lang.String r1 = r7.f23651f
            r0.f23651f = r1
            java.util.List<x00.a> r7 = r7.f23652g
            r0.f23652g = r7
        L_0x004d:
            if (r0 == 0) goto L_0x0057
            com.moovit.app.useraccount.manager.favorites.LocationFavorite r7 = new com.moovit.app.useraccount.manager.favorites.LocationFavorite
            java.lang.String r6 = r6.f40599c
            r7.<init>(r0, r6)
            r6 = r7
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p455dy.C16753e.m42312y(com.moovit.app.useraccount.manager.favorites.LocationFavorite, i30.d):com.moovit.app.useraccount.manager.favorites.LocationFavorite");
    }

    /* renamed from: A */
    public final void mo49430A(LocationFavorite locationFavorite) {
        this.f43621e = locationFavorite;
        C17635b.m43779f(this.f43622f).f50175e.mo52611d().mo52773q(this.f43622f, this.f43624h, this.f43621e);
        Iterator it = this.f43625i.iterator();
        while (it.hasNext()) {
            ((C16756c) it.next()).mo44787k(this, this.f43621e);
        }
    }

    /* renamed from: a */
    public final void mo46564a() {
        Context context = this.f43622f;
        if (C13709c.m34226b(context) != null) {
            HashSet k = C17635b.m43779f(context).f50175e.mo52611d().mo52767k(context);
            ArrayList arrayList = new ArrayList(k.size());
            Iterator it = k.iterator();
            while (it.hasNext()) {
                arrayList.add(new C16750c(context, (ServerId) it.next()));
            }
            C17635b.m43779f(context).f50172b.mo42914c(arrayList, true);
        }
    }

    /* renamed from: b */
    public final void mo46565b(Object obj) throws IOException, ServerException {
        List<C16749b> list = (List) obj;
        C20559a d = C17635b.m43779f(this.f43622f).f50175e.mo52611d();
        synchronized (d) {
            d.f52007g = true;
        }
        HashSet k = d.mo52767k(this.f43622f);
        C13717b.m34269p(k);
        Context context = this.f43622f;
        synchronized (d) {
            Iterator it = k.iterator();
            while (it.hasNext()) {
                d.mo52761d(context, (ServerId) it.next());
            }
        }
        list.size();
        for (C16749b l : list) {
            list.toString();
            d.mo52768l(this.f43622f, l);
        }
        synchronized (d) {
            d.f52007g = false;
        }
        load();
    }

    /* renamed from: c */
    public final Object mo46566c(ServerId serverId) throws IOException, ServerException {
        C16896h hVar = (C16896h) new C16895g(serverId, this.f43623g).mo52626J();
        if (hVar.mo52635a()) {
            return (List) hVar.f33924g;
        }
        return null;
    }

    /* renamed from: d */
    public final void mo46567d() {
    }

    /* renamed from: e */
    public final void mo49431e(ServerId serverId) {
        LineFavorite lineFavorite = new LineFavorite(serverId);
        if (!this.f43618b.contains(lineFavorite)) {
            this.f43618b.add(lineFavorite);
        }
        C20559a d = C17635b.m43779f(this.f43622f).f50175e.mo52611d();
        Context context = this.f43622f;
        ServerId serverId2 = this.f43624h;
        ArrayList arrayList = this.f43618b;
        synchronized (d) {
            d.mo52770n(context, serverId2, ServerId.m11393d(arrayList));
        }
        Context context2 = this.f43622f;
        TrackingEvent trackingEvent = TrackingEvent.NEW_FAVORITE_LINE_ADDED;
        SharedPreferences sharedPreferences = context2.getSharedPreferences("events_tracker_store", 0);
        sharedPreferences.edit().putInt(trackingEvent.getPrefsKey(), sharedPreferences.getInt(trackingEvent.getPrefsKey(), 0) + 1).apply();
        Iterator it = this.f43626j.iterator();
        while (it.hasNext()) {
            ((C16755b) it.next()).mo44782q();
        }
    }

    /* renamed from: f */
    public final synchronized void mo49432f(C16755b bVar) {
        ArrayList arrayList = this.f43626j;
        C21100e.m49371w(bVar);
        arrayList.add(bVar);
    }

    /* renamed from: g */
    public final LocationFavorite mo49433g(LocationDescriptor locationDescriptor, String str) {
        C21100e.m49373x(locationDescriptor, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        LocationFavorite m = mo49439m(locationDescriptor);
        if (m == null) {
            m = new LocationFavorite(locationDescriptor, str);
            this.f43617a.f40592c.add(m);
            C17635b.m43779f(this.f43622f).f50175e.mo52611d().mo52771o(this.f43622f, this.f43624h, this.f43617a.mo46585b());
            Iterator it = this.f43625i.iterator();
            while (it.hasNext()) {
                ((C16756c) it.next()).mo44790y0(this, m);
            }
        }
        if (LocationDescriptor.LocationType.STOP.equals(locationDescriptor.f23647b) && !mo49442q(locationDescriptor.f23649d)) {
            mo49435i(locationDescriptor.f23649d);
        }
        return m;
    }

    public final UserAccountDataProvider.ProviderType getType() {
        return UserAccountDataProvider.ProviderType.FAVORITES;
    }

    /* renamed from: h */
    public final synchronized void mo49434h(C16756c cVar) {
        ArrayList arrayList = this.f43625i;
        C21100e.m49371w(cVar);
        arrayList.add(cVar);
    }

    /* renamed from: i */
    public final void mo49435i(ServerId serverId) {
        if (this.f43619c.add(new StopFavorite(serverId))) {
            C20559a d = C17635b.m43779f(this.f43622f).f50175e.mo52611d();
            Context context = this.f43622f;
            ServerId serverId2 = this.f43624h;
            ArrayList arrayList = this.f43619c;
            synchronized (d) {
                d.mo52772p(context, serverId2, ServerId.m11393d(arrayList));
            }
            Iterator it = this.f43627k.iterator();
            while (it.hasNext()) {
                ((C16757d) it.next()).mo44784C();
            }
        }
        Tasks.call(MoovitExecutors.SINGLE, new C16752d(this, serverId)).addOnSuccessListener(MoovitExecutors.MAIN_THREAD, new C18114a(this, 8));
    }

    /* renamed from: j */
    public final synchronized void mo49436j(C16757d dVar) {
        ArrayList arrayList = this.f43627k;
        C21100e.m49371w(dVar);
        arrayList.add(dVar);
    }

    /* renamed from: k */
    public final List<LocationFavorite> mo49437k() {
        return Collections.unmodifiableList(this.f43617a.mo46585b());
    }

    /* renamed from: l */
    public final List<StopFavorite> mo49438l() {
        return Collections.unmodifiableList(this.f43619c);
    }

    public final void load() throws IOException, ServerException {
        C5268d dVar;
        this.f43617a.f40592c.clear();
        this.f43618b.clear();
        this.f43619c.clear();
        Context context = this.f43622f;
        ServerId serverId = this.f43624h;
        C5269e eVar = new C5269e();
        C20559a d = C17635b.m43779f(context).f50175e.mo52611d();
        LocationFavorite e = d.mo52762e(context, serverId);
        if (e != null) {
            m42311x(e, eVar);
        }
        LocationFavorite i = d.mo52766i(context, serverId);
        if (i != null) {
            m42311x(i, eVar);
        }
        for (LocationFavorite x : d.mo52764g(context, serverId)) {
            m42311x(x, eVar);
        }
        eVar.f17412b.mo47002b(MetroEntityType.TRANSIT_LINE_GROUP, d.mo52763f(context, serverId));
        eVar.f17412b.mo47002b(MetroEntityType.TRANSIT_STOP, d.mo52765h(context, serverId));
        C13752e eVar2 = this.f43623g;
        if (eVar.isEmpty()) {
            dVar = C5268d.f17403i;
        } else {
            C4776h hVar = C19728f.m47195a(eVar2.f33852a).f50165a;
            C21100e.m49373x(hVar, "metroInfo");
            dVar = new C5274h(eVar2, "UFM.load", hVar, eVar).mo21062P();
        }
        Context context2 = this.f43622f;
        this.f43620d = m42312y(C17635b.m43779f(context2).f50175e.mo52611d().mo52762e(context2, this.f43624h), dVar);
        Context context3 = this.f43622f;
        this.f43621e = m42312y(C17635b.m43779f(context3).f50175e.mo52611d().mo52766i(context3, this.f43624h), dVar);
        LocationsGroup locationsGroup = this.f43617a;
        Context context4 = this.f43622f;
        List<LocationFavorite> g = C17635b.m43779f(context4).f50175e.mo52611d().mo52764g(context4, this.f43624h);
        ArrayList arrayList = new ArrayList(g.size());
        for (LocationFavorite y : g) {
            LocationFavorite y2 = m42312y(y, dVar);
            if (y2 != null) {
                arrayList.add(y2);
            }
        }
        locationsGroup.f40592c.addAll(arrayList);
        ArrayList arrayList2 = this.f43618b;
        Context context5 = this.f43622f;
        List<ServerId> f = C17635b.m43779f(context5).f50175e.mo52611d().mo52763f(context5, this.f43624h);
        ArrayList arrayList3 = new ArrayList();
        for (ServerId serverId2 : f) {
            TransitLineGroup transitLineGroup = (TransitLineGroup) dVar.f17405b.get(serverId2);
            if (transitLineGroup != null) {
                arrayList3.add(new LineFavorite(transitLineGroup.f23694b));
            }
        }
        arrayList2.addAll(arrayList3);
        ArrayList arrayList4 = this.f43619c;
        Context context6 = this.f43622f;
        List<ServerId> h = C17635b.m43779f(context6).f50175e.mo52611d().mo52765h(context6, this.f43624h);
        ArrayList arrayList5 = new ArrayList();
        for (ServerId c : h) {
            TransitStop c2 = dVar.mo21064c(c);
            if (c2 != null) {
                arrayList5.add(new StopFavorite(c2.f23730b));
            }
        }
        arrayList4.addAll(arrayList5);
        if (!eVar.isEmpty()) {
            C17635b.m43779f(this.f43622f).f50175e.mo52611d().mo52768l(this.f43622f, new C16749b(this.f43624h, ServerId.m11393d(this.f43618b), ServerId.m11393d(this.f43619c), this.f43617a.mo46585b(), this.f43620d, this.f43621e));
        }
    }

    /* renamed from: m */
    public final LocationFavorite mo49439m(LocationDescriptor locationDescriptor) {
        LocationFavorite locationFavorite = this.f43620d;
        if (locationFavorite != null && locationDescriptor.equals((LocationDescriptor) locationFavorite.f52687b)) {
            return this.f43620d;
        }
        LocationFavorite locationFavorite2 = this.f43621e;
        if (locationFavorite2 != null && locationDescriptor.equals((LocationDescriptor) locationFavorite2.f52687b)) {
            return this.f43621e;
        }
        for (LocationFavorite locationFavorite3 : this.f43617a.mo46585b()) {
            if (locationDescriptor.equals((LocationDescriptor) locationFavorite3.f52687b)) {
                return locationFavorite3;
            }
        }
        return null;
    }

    /* renamed from: o */
    public final LineFavorite mo49440o(ServerId serverId) {
        C21100e.m49373x(serverId, "line");
        Iterator it = this.f43618b.iterator();
        while (it.hasNext()) {
            LineFavorite lineFavorite = (LineFavorite) it.next();
            if (((ServerId) lineFavorite.f52687b).equals(serverId)) {
                return lineFavorite;
            }
        }
        return null;
    }

    /* renamed from: p */
    public final boolean mo49441p(ServerId serverId) {
        return mo49440o(serverId) != null;
    }

    /* renamed from: q */
    public final boolean mo49442q(ServerId serverId) {
        StopFavorite stopFavorite;
        C21100e.m49373x(serverId, "stop");
        Iterator it = this.f43619c.iterator();
        while (true) {
            if (!it.hasNext()) {
                stopFavorite = null;
                break;
            }
            stopFavorite = (StopFavorite) it.next();
            if (((ServerId) stopFavorite.f52687b).equals(serverId)) {
                break;
            }
        }
        if (stopFavorite != null) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public final void mo49443r(ServerId serverId) {
        if (this.f43618b.remove(new LineFavorite(serverId))) {
            C20559a d = C17635b.m43779f(this.f43622f).f50175e.mo52611d();
            Context context = this.f43622f;
            ServerId serverId2 = this.f43624h;
            ArrayList arrayList = this.f43618b;
            synchronized (d) {
                d.mo52770n(context, serverId2, ServerId.m11393d(arrayList));
            }
            Iterator it = this.f43626j.iterator();
            while (it.hasNext()) {
                ((C16755b) it.next()).mo44783v0();
            }
        }
    }

    /* renamed from: s */
    public final synchronized void mo49444s(C16755b bVar) {
        this.f43626j.remove(bVar);
    }

    /* renamed from: t */
    public final void mo49445t(LocationFavorite locationFavorite) {
        if (this.f43617a.f40592c.remove(locationFavorite)) {
            C17635b.m43779f(this.f43622f).f50175e.mo52611d().mo52771o(this.f43622f, this.f43624h, this.f43617a.mo46585b());
            Iterator it = this.f43625i.iterator();
            while (it.hasNext()) {
                ((C16756c) it.next()).mo44786h(this, locationFavorite);
            }
        }
        LocationDescriptor locationDescriptor = (LocationDescriptor) locationFavorite.f52687b;
        if (LocationDescriptor.LocationType.STOP.equals(locationDescriptor.f23647b) && mo49442q(locationDescriptor.f23649d)) {
            mo49447v(locationDescriptor.f23649d);
        }
    }

    /* renamed from: u */
    public final synchronized void mo49446u(C16756c cVar) {
        this.f43625i.remove(cVar);
    }

    /* renamed from: v */
    public final void mo49447v(ServerId serverId) {
        serverId.getClass();
        StopFavorite stopFavorite = new StopFavorite(serverId);
        if (this.f43619c.remove(stopFavorite)) {
            C20559a d = C17635b.m43779f(this.f43622f).f50175e.mo52611d();
            Context context = this.f43622f;
            ServerId serverId2 = this.f43624h;
            ArrayList arrayList = this.f43619c;
            synchronized (d) {
                d.mo52772p(context, serverId2, ServerId.m11393d(arrayList));
            }
            Iterator it = this.f43627k.iterator();
            while (it.hasNext()) {
                ((C16757d) it.next()).mo44785f();
            }
        }
        ServerId serverId3 = (ServerId) stopFavorite.f52687b;
        Iterator it2 = new ArrayList(mo49437k()).iterator();
        while (it2.hasNext()) {
            LocationFavorite locationFavorite = (LocationFavorite) it2.next();
            if (LocationDescriptor.LocationType.STOP.equals(((LocationDescriptor) locationFavorite.f52687b).f23647b) && serverId3.equals(((LocationDescriptor) locationFavorite.f52687b).f23649d)) {
                mo49445t(locationFavorite);
            }
        }
    }

    /* renamed from: w */
    public final synchronized void mo49448w(C16757d dVar) {
        this.f43627k.remove(dVar);
    }

    /* renamed from: z */
    public final void mo49449z(LocationFavorite locationFavorite) {
        this.f43620d = locationFavorite;
        C17635b.m43779f(this.f43622f).f50175e.mo52611d().mo52769m(this.f43622f, this.f43624h, this.f43620d);
        Iterator it = this.f43625i.iterator();
        while (it.hasNext()) {
            ((C16756c) it.next()).mo44789t1(this, this.f43620d);
        }
    }
}
