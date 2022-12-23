package com.moovit.app.carpool;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.SystemClock;
import b00.C13556a;
import c70.C13752e;
import c70.C13756i;
import ce0.C21100e;
import ci0.C21211f;
import com.moovit.app.MoovitAppApplication;
import com.moovit.app.carpool.ridedetails.C14835a;
import com.moovit.app.useraccount.manager.favorites.LocationFavorite;
import com.moovit.carpool.ActiveCarpoolRide;
import com.moovit.carpool.CarpoolRideRequest;
import com.moovit.carpool.FutureCarpoolRide;
import com.moovit.carpool.HistoricalCarpoolRide;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.request.ServerException;
import com.moovit.gcm.GcmListenerService;
import com.moovit.gcm.payload.GcmPayload;
import com.moovit.location.C16202a;
import com.moovit.network.model.ServerId;
import com.moovit.request.RequestOptions;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.ServerIdMap;
import com.usebutton.sdk.internal.api.AppActionRequest;
import j40.C5384a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p241s0.C6313h;
import p455dy.C16753e;
import p638lr.C18256c;
import p638lr.C18257d;
import p638lr.C18258e;
import p638lr.C18259f;
import p824tp.C19725d;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20437h;

public class CarpoolRidesProvider extends BroadcastReceiver {

    /* renamed from: i */
    public static final long f37660i = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: j */
    public static final CarpoolRidesProvider f37661j = new CarpoolRidesProvider();

    /* renamed from: a */
    public C14790a f37662a = new C14790a();

    /* renamed from: b */
    public final C14791b<FutureCarpoolRide> f37663b = new C14791b<>();

    /* renamed from: c */
    public final C14791b<ActiveCarpoolRide> f37664c = new C14791b<>();

    /* renamed from: d */
    public final C14791b<HistoricalCarpoolRide> f37665d = new C14791b<>();

    /* renamed from: e */
    public final C14791b<HistoricalCarpoolRide> f37666e = new C14791b<>();

    /* renamed from: f */
    public final C14791b<CarpoolRideRequest> f37667f = new C14791b<>();

    /* renamed from: g */
    public final C6313h<C14793d, Integer> f37668g = new C6313h<>();

    /* renamed from: h */
    public int f37669h = 0;

    /* renamed from: com.moovit.app.carpool.CarpoolRidesProvider$a */
    public class C14790a extends C21211f {
        public C14790a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            CarpoolRidesProvider carpoolRidesProvider = CarpoolRidesProvider.this;
            int i = (~((C18258e) cVar).f46577w) & carpoolRidesProvider.f37669h;
            carpoolRidesProvider.f37669h = i;
            CarpoolRidesProvider.m37226b(i);
        }

        /* renamed from: d */
        public final boolean mo316d(C20431c cVar, IOException iOException) {
            CarpoolRidesProvider.m37225a(CarpoolRidesProvider.this, ((C18258e) cVar).f46577w, iOException);
            return true;
        }

        /* renamed from: i */
        public final boolean mo319i(C20431c cVar, IOException iOException) {
            CarpoolRidesProvider.m37225a(CarpoolRidesProvider.this, ((C18258e) cVar).f46577w, iOException);
            return true;
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C18258e eVar = (C18258e) cVar;
            C18259f fVar = (C18259f) gVar;
            List<FutureCarpoolRide> list = fVar.f46578m;
            if (list != null) {
                CarpoolRidesProvider.this.f37663b.mo44838c(list);
            }
            List<ActiveCarpoolRide> list2 = fVar.f46579n;
            if (list2 != null) {
                CarpoolRidesProvider.this.f37664c.mo44838c(list2);
            }
            List<HistoricalCarpoolRide> list3 = fVar.f46580o;
            if (list3 != null) {
                CarpoolRidesProvider.this.f37665d.mo44838c(list3);
            }
            List<HistoricalCarpoolRide> list4 = fVar.f46581p;
            if (list4 != null) {
                CarpoolRidesProvider.this.f37666e.mo44838c(list4);
            }
            List<CarpoolRideRequest> list5 = fVar.f46582q;
            if (list5 != null) {
                CarpoolRidesProvider.this.f37667f.mo44838c(list5);
            }
            CarpoolRidesProvider.m37225a(CarpoolRidesProvider.this, eVar.f46577w, (IOException) null);
        }
    }

    /* renamed from: com.moovit.app.carpool.CarpoolRidesProvider$b */
    public static class C14791b<T extends C5384a> {

        /* renamed from: a */
        public List<T> f37671a;

        /* renamed from: b */
        public ServerIdMap<T> f37672b;

        /* renamed from: c */
        public long f37673c = -1;

        /* renamed from: a */
        public final T mo44836a(ServerId serverId) {
            ServerIdMap<T> serverIdMap;
            if (!mo44837b() || (serverIdMap = this.f37672b) == null) {
                return null;
            }
            return (C5384a) serverIdMap.get(serverId);
        }

        /* renamed from: b */
        public final boolean mo44837b() {
            if (this.f37673c == -1 || SystemClock.elapsedRealtime() - this.f37673c >= CarpoolRidesProvider.f37660i) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        public final void mo44838c(List<T> list) {
            this.f37671a = list;
            this.f37672b = ServerIdMap.m17949a(list);
            this.f37673c = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: com.moovit.app.carpool.CarpoolRidesProvider$c */
    public interface C14792c {
        /* renamed from: a */
        void mo44839a(FutureCarpoolRide futureCarpoolRide, ActiveCarpoolRide activeCarpoolRide, HistoricalCarpoolRide historicalCarpoolRide);

        /* renamed from: b */
        void mo44840b();
    }

    /* renamed from: com.moovit.app.carpool.CarpoolRidesProvider$d */
    public interface C14793d {
        /* renamed from: F0 */
        void mo44841F0(int i);

        /* renamed from: d0 */
        void mo44842d0(GcmPayload gcmPayload);

        /* renamed from: g1 */
        void mo44843g1(int i);
    }

    /* renamed from: com.moovit.app.carpool.CarpoolRidesProvider$e */
    public class C14794e implements C20437h<C18256c, C18257d>, C19725d.C19726a {

        /* renamed from: b */
        public final Context f37674b;

        /* renamed from: c */
        public final C14792c f37675c;

        /* renamed from: d */
        public C13556a f37676d = null;

        public C14794e(Context context, C14835a aVar) {
            C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
            this.f37674b = context;
            this.f37675c = aVar;
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C18256c cVar2 = (C18256c) cVar;
            C19725d.m47191a(this.f37674b).mo52074c(this);
            this.f37676d = null;
        }

        /* renamed from: b */
        public final void mo44844b(Context context) {
            ((C19725d) context.getSystemService("destruction_notifier")).mo52074c(this);
            C13556a aVar = this.f37676d;
            if (aVar != null) {
                aVar.cancel(true);
                this.f37676d = null;
            }
        }

        /* renamed from: c */
        public final boolean mo315c(C20431c cVar, ServerException serverException) {
            C18256c cVar2 = (C18256c) cVar;
            this.f37675c.mo44840b();
            return true;
        }

        /* renamed from: d */
        public final boolean mo316d(C20431c cVar, IOException iOException) {
            C18256c cVar2 = (C18256c) cVar;
            this.f37675c.mo44840b();
            return true;
        }

        /* renamed from: i */
        public final boolean mo319i(C20431c cVar, IOException iOException) {
            C18256c cVar2 = (C18256c) cVar;
            this.f37675c.mo44840b();
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0068  */
        /* renamed from: k */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo21408k(p906wz.C20431c r8, p906wz.C20436g r9) {
            /*
                r7 = this;
                lr.c r8 = (p638lr.C18256c) r8
                lr.d r9 = (p638lr.C18257d) r9
                com.moovit.carpool.FutureCarpoolRide r8 = r9.f46574m
                com.moovit.carpool.ActiveCarpoolRide r0 = r9.f46575n
                com.moovit.carpool.HistoricalCarpoolRide r9 = r9.f46576o
                r1 = 0
                if (r8 == 0) goto L_0x0011
                com.moovit.carpool.CarpoolRide r2 = r8.f40937b
                r3 = 1
                goto L_0x0020
            L_0x0011:
                if (r0 == 0) goto L_0x0017
                com.moovit.carpool.CarpoolRide r2 = r0.f40854b
                r3 = 2
                goto L_0x0020
            L_0x0017:
                if (r9 == 0) goto L_0x001e
                com.moovit.carpool.CarpoolRide r2 = r9.f40942b
                r3 = 12
                goto L_0x0020
            L_0x001e:
                r3 = 0
                r2 = r1
            L_0x0020:
                if (r2 == 0) goto L_0x0075
                com.moovit.app.carpool.CarpoolRidesProvider r4 = com.moovit.app.carpool.CarpoolRidesProvider.this
                com.moovit.network.model.ServerId r5 = r2.f40910b
                com.moovit.app.carpool.CarpoolRidesProvider$b<com.moovit.carpool.FutureCarpoolRide> r6 = r4.f37663b
                com.moovit.util.ServerIdMap<T> r6 = r6.f37672b
                if (r6 != 0) goto L_0x002e
                r6 = r1
                goto L_0x0034
            L_0x002e:
                java.lang.Object r6 = r6.get(r5)
                j40.a r6 = (j40.C5384a) r6
            L_0x0034:
                com.moovit.carpool.FutureCarpoolRide r6 = (com.moovit.carpool.FutureCarpoolRide) r6
                if (r6 == 0) goto L_0x003a
            L_0x0038:
                r1 = r6
                goto L_0x0060
            L_0x003a:
                com.moovit.app.carpool.CarpoolRidesProvider$b<com.moovit.carpool.ActiveCarpoolRide> r6 = r4.f37664c
                com.moovit.util.ServerIdMap<T> r6 = r6.f37672b
                if (r6 != 0) goto L_0x0042
                r6 = r1
                goto L_0x0048
            L_0x0042:
                java.lang.Object r6 = r6.get(r5)
                j40.a r6 = (j40.C5384a) r6
            L_0x0048:
                com.moovit.carpool.ActiveCarpoolRide r6 = (com.moovit.carpool.ActiveCarpoolRide) r6
                if (r6 == 0) goto L_0x004d
                goto L_0x0038
            L_0x004d:
                com.moovit.app.carpool.CarpoolRidesProvider$b<com.moovit.carpool.HistoricalCarpoolRide> r4 = r4.f37666e
                com.moovit.util.ServerIdMap<T> r4 = r4.f37672b
                if (r4 != 0) goto L_0x0055
                r4 = r1
                goto L_0x005b
            L_0x0055:
                java.lang.Object r4 = r4.get(r5)
                j40.a r4 = (j40.C5384a) r4
            L_0x005b:
                com.moovit.carpool.HistoricalCarpoolRide r4 = (com.moovit.carpool.HistoricalCarpoolRide) r4
                if (r4 == 0) goto L_0x0060
                r1 = r4
            L_0x0060:
                boolean r4 = r1 instanceof com.moovit.carpool.FutureCarpoolRide
                if (r4 == 0) goto L_0x0068
                r3 = r3 | 1
                goto L_0x0075
            L_0x0068:
                boolean r4 = r1 instanceof com.moovit.carpool.ActiveCarpoolRide
                if (r4 == 0) goto L_0x006f
                r3 = r3 | 2
                goto L_0x0075
            L_0x006f:
                boolean r1 = r1 instanceof com.moovit.carpool.HistoricalCarpoolRide
                if (r1 == 0) goto L_0x0075
                r3 = r3 | 12
            L_0x0075:
                if (r3 == 0) goto L_0x0086
                com.moovit.network.model.ServerId r1 = r2.f40910b
                com.moovit.app.carpool.CarpoolRidesProvider.m37226b(r3)
                com.moovit.app.carpool.CarpoolRidesProvider r1 = com.moovit.app.carpool.CarpoolRidesProvider.this
                r1.mo44833c(r3)
                com.moovit.app.carpool.CarpoolRidesProvider r1 = com.moovit.app.carpool.CarpoolRidesProvider.this
                r1.mo44834d(r3)
            L_0x0086:
                com.moovit.app.carpool.CarpoolRidesProvider$c r1 = r7.f37675c
                r1.mo44839a(r8, r0, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.carpool.CarpoolRidesProvider.C14794e.mo21408k(wz.c, wz.g):void");
        }
    }

    private CarpoolRidesProvider() {
        GcmListenerService.m40504g(this, MoovitAppApplication.m37038x(), "carpool_tab");
        GcmListenerService.m40504g(this, MoovitAppApplication.m37038x(), "carpool_ride");
        GcmListenerService.m40504g(this, MoovitAppApplication.m37038x(), "trip_plan");
    }

    /* renamed from: a */
    public static void m37225a(CarpoolRidesProvider carpoolRidesProvider, int i, IOException iOException) {
        carpoolRidesProvider.getClass();
        m37226b(i);
        int i2 = carpoolRidesProvider.f37668g.f19969d;
        for (int i3 = 0; i3 < i2; i3++) {
            if ((carpoolRidesProvider.f37668g.mo22422l(i3).intValue() & i) != 0) {
                C14793d h = carpoolRidesProvider.f37668g.mo22416h(i3);
                if (iOException != null) {
                    h.mo44843g1(i);
                } else {
                    h.mo44841F0(i);
                }
            }
        }
    }

    /* renamed from: b */
    public static void m37226b(int i) {
        String.format(Locale.ENGLISH, "%5s", new Object[]{Integer.toBinaryString(i)}).replace(' ', '0');
    }

    /* renamed from: c */
    public final void mo44833c(int i) {
        m37226b(i);
        if ((i & 1) != 0) {
            this.f37663b.f37673c = -1;
        }
        if ((i & 2) != 0) {
            this.f37664c.f37673c = -1;
        }
        if ((i & 4) != 0) {
            this.f37665d.f37673c = -1;
        }
        if ((i & 8) != 0) {
            this.f37666e.f37673c = -1;
        }
        if ((i & 16) != 0) {
            this.f37667f.f37673c = -1;
        }
    }

    /* renamed from: d */
    public final boolean mo44834d(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        ArrayList arrayList;
        int i6 = i & 31;
        m37226b(i6);
        boolean b = this.f37663b.mo44837b();
        boolean z2 = false;
        if (this.f37664c.mo44837b()) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        boolean z3 = b | i2;
        if (this.f37665d.mo44837b()) {
            i3 = 4;
        } else {
            i3 = 0;
        }
        boolean z4 = z3 | i3;
        if (this.f37666e.mo44837b()) {
            i4 = 8;
        } else {
            i4 = 0;
        }
        boolean z5 = z4 | i4;
        if (this.f37667f.mo44837b()) {
            i5 = 16;
        } else {
            i5 = 0;
        }
        int i7 = i6 & (~(z5 | i5 ? 1 : 0));
        if (i7 != 0) {
            z = true;
        } else {
            z = false;
        }
        int i8 = i7 & (~this.f37669h);
        if (i8 != 0) {
            z2 = true;
        }
        if (z2) {
            MoovitAppApplication x = MoovitAppApplication.m37038x();
            Location i9 = C16202a.get(x).getPermissionAwareHighAccuracyFrequentUpdates().mo50014i();
            C13752e l = x.mo44560l();
            LatLonE6 j = LatLonE6.m40177j(i9);
            C16753e n = C16753e.m42310n(x.getApplicationContext());
            if (n == null) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                LocationFavorite locationFavorite = n.f43620d;
                if (locationFavorite != null) {
                    arrayList2.add((LocationDescriptor) locationFavorite.f52687b);
                }
                LocationFavorite locationFavorite2 = n.f43621e;
                if (locationFavorite2 != null) {
                    arrayList2.add((LocationDescriptor) locationFavorite2.f52687b);
                }
                for (LocationFavorite locationFavorite3 : n.mo49437k()) {
                    arrayList2.add((LocationDescriptor) locationFavorite3.f52687b);
                }
                arrayList = arrayList2;
            }
            C18258e eVar = new C18258e(l, i8, j, arrayList);
            C13756i iVar = x.f37322f;
            StringBuilder sb = new StringBuilder();
            C13715c.m34249o(C18258e.class, sb, "_");
            sb.append(eVar.f46577w);
            String sb2 = sb.toString();
            RequestOptions c = iVar.mo40680c();
            c.f42909f = true;
            iVar.mo40684g(sb2, eVar, c, this.f37662a);
            this.f37669h |= i8;
            m37226b(i8);
        }
        return z;
    }

    public final void onReceive(Context context, Intent intent) {
        mo44833c(-1);
        Uri uri = GcmListenerService.f41490b;
        GcmPayload gcmPayload = (GcmPayload) intent.getParcelableExtra("payload");
        int i = this.f37668g.f19969d;
        for (int i2 = 0; i2 < i; i2++) {
            this.f37668g.mo22416h(i2).mo44842d0(gcmPayload);
        }
    }
}
