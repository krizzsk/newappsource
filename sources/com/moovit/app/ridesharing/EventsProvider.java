package com.moovit.app.ridesharing;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.SystemClock;
import c70.C13756i;
import ce0.C21100e;
import ci0.C21211f;
import com.moovit.app.MoovitAppApplication;
import com.moovit.gcm.GcmListenerService;
import com.moovit.gcm.payload.GcmPayload;
import com.moovit.network.model.ServerId;
import com.moovit.request.RequestOptions;
import com.moovit.ridesharing.model.EventRequest;
import com.moovit.util.ServerIdMap;
import com.usebutton.sdk.internal.api.AppActionRequest;
import j40.C5384a;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p130j2.C5367a;
import p241s0.C6313h;
import p737pv.C19029s;
import p737pv.C19030t;
import p824tp.C19725d;
import p906wz.C20431c;
import p906wz.C20436g;

public class EventsProvider extends BroadcastReceiver {

    /* renamed from: j */
    public static final long f39285j = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: k */
    public static final EventsProvider f39286k = new EventsProvider();

    /* renamed from: a */
    public C15235a f39287a = new C15235a();

    /* renamed from: b */
    public final C15236b<EventRequest> f39288b = new C15236b<>();

    /* renamed from: c */
    public final C15236b<EventRequest> f39289c = new C15236b<>();

    /* renamed from: d */
    public final C15236b<EventRequest> f39290d = new C15236b<>();

    /* renamed from: e */
    public final C15236b<EventRequest> f39291e = new C15236b<>();

    /* renamed from: f */
    public final C15236b<EventRequest> f39292f = new C15236b<>();

    /* renamed from: g */
    public final C6313h<C15238d, Integer> f39293g = new C6313h<>();

    /* renamed from: h */
    public final C6313h<C15238d, Integer> f39294h = new C6313h<>();

    /* renamed from: i */
    public int f39295i = 0;

    /* renamed from: com.moovit.app.ridesharing.EventsProvider$a */
    public class C15235a extends C21211f {
        public C15235a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            EventsProvider eventsProvider = EventsProvider.this;
            int i = (~((C19029s) cVar).f48395w) & eventsProvider.f39295i;
            eventsProvider.f39295i = i;
            EventsProvider.m38934b(i);
        }

        /* renamed from: d */
        public final boolean mo316d(C20431c cVar, IOException iOException) {
            EventsProvider.m38933a(EventsProvider.this, ((C19029s) cVar).f48395w, iOException);
            return true;
        }

        /* renamed from: i */
        public final boolean mo319i(C20431c cVar, IOException iOException) {
            EventsProvider.m38933a(EventsProvider.this, ((C19029s) cVar).f48395w, iOException);
            return true;
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C19029s sVar = (C19029s) cVar;
            C19030t tVar = (C19030t) gVar;
            List<EventRequest> list = tVar.f48400q;
            if (list != null) {
                EventsProvider.this.f39288b.mo45743c(list);
            }
            List<EventRequest> list2 = tVar.f48396m;
            if (list2 != null) {
                EventsProvider.this.f39289c.mo45743c(list2);
            }
            List<EventRequest> list3 = tVar.f48397n;
            if (list3 != null) {
                EventsProvider.this.f39290d.mo45743c(list3);
            }
            List<EventRequest> list4 = tVar.f48398o;
            if (list4 != null) {
                EventsProvider.this.f39291e.mo45743c(list4);
            }
            List<EventRequest> list5 = tVar.f48399p;
            if (list5 != null) {
                EventsProvider.this.f39292f.mo45743c(list5);
            }
            EventsProvider.m38933a(EventsProvider.this, sVar.f48395w, (IOException) null);
        }
    }

    /* renamed from: com.moovit.app.ridesharing.EventsProvider$b */
    public static class C15236b<T extends C5384a> {

        /* renamed from: a */
        public List<T> f39297a;

        /* renamed from: b */
        public ServerIdMap<T> f39298b;

        /* renamed from: c */
        public long f39299c = -1;

        /* renamed from: a */
        public final T mo45741a(ServerId serverId) {
            ServerIdMap<T> serverIdMap;
            if (!mo45742b() || (serverIdMap = this.f39298b) == null) {
                return null;
            }
            return (C5384a) serverIdMap.get(serverId);
        }

        /* renamed from: b */
        public final boolean mo45742b() {
            if (this.f39299c == -1 || SystemClock.elapsedRealtime() - this.f39299c >= EventsProvider.f39285j) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        public final void mo45743c(List<T> list) {
            this.f39297a = list;
            this.f39298b = ServerIdMap.m17949a(list);
            this.f39299c = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: com.moovit.app.ridesharing.EventsProvider$c */
    public interface C15237c {
        /* renamed from: D0 */
        void mo45729D0();

        /* renamed from: t */
        void mo45734t(EventRequest eventRequest);
    }

    /* renamed from: com.moovit.app.ridesharing.EventsProvider$d */
    public interface C15238d {
        /* renamed from: B */
        void mo45744B(int i);

        /* renamed from: b0 */
        void mo45745b0();

        /* renamed from: k1 */
        void mo45746k1(IOException iOException, int i);
    }

    /* renamed from: com.moovit.app.ridesharing.EventsProvider$e */
    public class C15239e implements C15238d, C19725d.C19726a {

        /* renamed from: b */
        public final Context f39300b;

        /* renamed from: c */
        public final ServerId f39301c;

        /* renamed from: d */
        public final C15237c f39302d;

        public C15239e(Context context, ServerId serverId, C15237c cVar) {
            C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
            this.f39300b = context;
            C21100e.m49373x(serverId, "eventInstanceId");
            this.f39301c = serverId;
            C21100e.m49373x(cVar, WidgetMessageParser.KEY_CALLBACK);
            this.f39302d = cVar;
        }

        /* renamed from: B */
        public final void mo45744B(int i) {
            boolean z;
            EventRequest c = EventsProvider.this.mo45737c(this.f39301c);
            if (c == null) {
                if ((EventsProvider.this.mo45738d() & 31) == 31) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    return;
                }
            }
            mo45747a();
            this.f39302d.mo45734t(c);
        }

        /* renamed from: a */
        public final void mo45747a() {
            C19725d.m47191a(this.f39300b).mo52074c(this);
            EventsProvider eventsProvider = EventsProvider.this;
            eventsProvider.getClass();
            eventsProvider.f39293g.remove(this);
        }

        /* renamed from: b */
        public final void mo44844b(Context context) {
            mo45747a();
        }

        /* renamed from: b0 */
        public final void mo45745b0() {
        }

        /* renamed from: k1 */
        public final void mo45746k1(IOException iOException, int i) {
            mo45747a();
            this.f39302d.mo45729D0();
        }
    }

    private EventsProvider() {
        MoovitAppApplication x = MoovitAppApplication.m37038x();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.moovit.events_provider.action.book");
        intentFilter.addAction("com.moovit.events_provider.action.cancel");
        intentFilter.addAction("com.moovit.events_provider.action.login");
        C5367a.m13473a(x).mo21146b(this, intentFilter);
        GcmListenerService.m40504g(this, x, "ride_sharing_event");
    }

    /* renamed from: a */
    public static void m38933a(EventsProvider eventsProvider, int i, IOException iOException) {
        eventsProvider.getClass();
        m38934b(i);
        eventsProvider.f39294h.clear();
        eventsProvider.f39294h.mo22418i(eventsProvider.f39293g);
        C6313h<C15238d, Integer> hVar = eventsProvider.f39294h;
        int i2 = hVar.f19969d;
        for (int i3 = 0; i3 < i2; i3++) {
            if ((hVar.mo22422l(i3).intValue() & i) != 0) {
                C15238d h = hVar.mo22416h(i3);
                if (iOException != null) {
                    h.mo45746k1(iOException, i);
                } else {
                    h.mo45744B(i);
                }
            }
        }
    }

    /* renamed from: b */
    public static void m38934b(int i) {
        String.format(Locale.ENGLISH, "%5s", new Object[]{Integer.toBinaryString(i)}).replace(' ', '0');
    }

    /* renamed from: c */
    public final EventRequest mo45737c(ServerId serverId) {
        EventRequest a = this.f39288b.mo45741a(serverId);
        if (a != null) {
            return a;
        }
        EventRequest a2 = this.f39289c.mo45741a(serverId);
        if (a2 != null) {
            return a2;
        }
        EventRequest a3 = this.f39290d.mo45741a(serverId);
        if (a3 != null) {
            return a3;
        }
        EventRequest a4 = this.f39291e.mo45741a(serverId);
        if (a4 != null) {
            return a4;
        }
        EventRequest a5 = this.f39292f.mo45741a(serverId);
        if (a5 != null) {
            return a5;
        }
        return null;
    }

    /* renamed from: d */
    public final int mo45738d() {
        char c;
        char c2;
        char c3;
        boolean b = this.f39288b.mo45742b();
        char c4 = 0;
        if (this.f39289c.mo45742b()) {
            c = 2;
        } else {
            c = 0;
        }
        boolean z = b | c;
        if (this.f39290d.mo45742b()) {
            c2 = 4;
        } else {
            c2 = 0;
        }
        boolean z2 = z | c2;
        if (this.f39291e.mo45742b()) {
            c3 = 8;
        } else {
            c3 = 0;
        }
        boolean z3 = z2 | c3;
        if (this.f39292f.mo45742b()) {
            c4 = 16;
        }
        return z3 | c4 ? 1 : 0;
    }

    /* renamed from: e */
    public final boolean mo45739e(int i) {
        boolean z;
        int i2 = i & 31;
        m38934b(i2);
        int i3 = i2 & (~mo45738d());
        boolean z2 = false;
        if (i3 != 0) {
            z = true;
        } else {
            z = false;
        }
        int i4 = i3 & (~this.f39295i);
        if (i4 != 0) {
            z2 = true;
        }
        if (z2) {
            MoovitAppApplication x = MoovitAppApplication.m37038x();
            C19029s sVar = new C19029s(x.mo44560l(), i4);
            C13756i iVar = x.f37322f;
            RequestOptions c = iVar.mo40680c();
            c.f42909f = true;
            StringBuilder sb = new StringBuilder();
            C13715c.m34249o(C19029s.class, sb, "_");
            sb.append(sVar.f48395w);
            iVar.mo40684g(sb.toString(), sVar, c, this.f39287a);
            this.f39295i |= i4;
            m38934b(i4);
        }
        return z;
    }

    public final void onReceive(Context context, Intent intent) {
        String str;
        m38934b(-1);
        this.f39288b.f39299c = -1;
        this.f39289c.f39299c = -1;
        this.f39290d.f39299c = -1;
        this.f39291e.f39299c = -1;
        this.f39292f.f39299c = -1;
        Uri uri = GcmListenerService.f41490b;
        GcmPayload gcmPayload = (GcmPayload) intent.getParcelableExtra("payload");
        if (gcmPayload != null) {
            str = gcmPayload.mo47977c();
        } else {
            str = intent.getAction();
        }
        if (str != null) {
            this.f39294h.clear();
            this.f39294h.mo22418i(this.f39293g);
            C6313h<C15238d, Integer> hVar = this.f39294h;
            int i = hVar.f19969d;
            for (int i2 = 0; i2 < i; i2++) {
                hVar.mo22416h(i2).mo45745b0();
            }
        }
    }
}
