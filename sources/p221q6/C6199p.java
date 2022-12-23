package p221q6;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p221q6.C6182c;
import p311x6.C7169f;
import p311x6.C7170g;
import p311x6.C7176l;

/* renamed from: q6.p */
public final class C6199p {

    /* renamed from: d */
    public static volatile C6199p f19599d;

    /* renamed from: a */
    public final C6202c f19600a;

    /* renamed from: b */
    public final HashSet f19601b = new HashSet();

    /* renamed from: c */
    public boolean f19602c;

    /* renamed from: q6.p$a */
    public class C6200a implements C7170g<ConnectivityManager> {

        /* renamed from: a */
        public final /* synthetic */ Context f19603a;

        public C6200a(Context context) {
            this.f19603a = context;
        }

        public final Object get() {
            return (ConnectivityManager) this.f19603a.getSystemService("connectivity");
        }
    }

    /* renamed from: q6.p$b */
    public class C6201b implements C6182c.C6183a {
        public C6201b() {
        }

        /* renamed from: a */
        public final void mo10889a(boolean z) {
            ArrayList arrayList;
            synchronized (C6199p.this) {
                arrayList = new ArrayList(C6199p.this.f19601b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C6182c.C6183a) it.next()).mo10889a(z);
            }
        }
    }

    /* renamed from: q6.p$c */
    public interface C6202c {
        /* renamed from: a */
        void mo22205a();

        /* renamed from: b */
        boolean mo22206b();
    }

    /* renamed from: q6.p$d */
    public static final class C6203d implements C6202c {

        /* renamed from: a */
        public boolean f19605a;

        /* renamed from: b */
        public final C6182c.C6183a f19606b;

        /* renamed from: c */
        public final C7170g<ConnectivityManager> f19607c;

        /* renamed from: d */
        public final C6204a f19608d = new C6204a();

        /* renamed from: q6.p$d$a */
        public class C6204a extends ConnectivityManager.NetworkCallback {
            public C6204a() {
            }

            public final void onAvailable(Network network) {
                C7176l.m16786f().post(new C6207q(this, true));
            }

            public final void onLost(Network network) {
                C7176l.m16786f().post(new C6207q(this, false));
            }
        }

        public C6203d(C7169f fVar, C6201b bVar) {
            this.f19607c = fVar;
            this.f19606b = bVar;
        }

        /* renamed from: a */
        public final void mo22205a() {
            this.f19607c.get().unregisterNetworkCallback(this.f19608d);
        }

        @SuppressLint({"MissingPermission"})
        /* renamed from: b */
        public final boolean mo22206b() {
            boolean z;
            if (this.f19607c.get().getActiveNetwork() != null) {
                z = true;
            } else {
                z = false;
            }
            this.f19605a = z;
            try {
                this.f19607c.get().registerDefaultNetworkCallback(this.f19608d);
                return true;
            } catch (RuntimeException unused) {
                return false;
            }
        }
    }

    /* renamed from: q6.p$e */
    public static final class C6205e implements C6202c {

        /* renamed from: a */
        public final Context f19610a;

        /* renamed from: b */
        public final C6182c.C6183a f19611b;

        /* renamed from: c */
        public final C7170g<ConnectivityManager> f19612c;

        /* renamed from: d */
        public boolean f19613d;

        /* renamed from: e */
        public final C6206a f19614e = new C6206a();

        /* renamed from: q6.p$e$a */
        public class C6206a extends BroadcastReceiver {
            public C6206a() {
            }

            public final void onReceive(Context context, Intent intent) {
                C6205e eVar = C6205e.this;
                boolean z = eVar.f19613d;
                boolean z2 = true;
                try {
                    NetworkInfo activeNetworkInfo = eVar.f19612c.get().getActiveNetworkInfo();
                    if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                        z2 = false;
                    }
                } catch (RuntimeException unused) {
                }
                eVar.f19613d = z2;
                if (z != C6205e.this.f19613d) {
                    if (Log.isLoggable("ConnectivityMonitor", 3)) {
                        boolean z3 = C6205e.this.f19613d;
                    }
                    C6205e eVar2 = C6205e.this;
                    eVar2.f19611b.mo10889a(eVar2.f19613d);
                }
            }
        }

        public C6205e(Context context, C7169f fVar, C6201b bVar) {
            this.f19610a = context.getApplicationContext();
            this.f19612c = fVar;
            this.f19611b = bVar;
        }

        /* renamed from: a */
        public final void mo22205a() {
            this.f19610a.unregisterReceiver(this.f19614e);
        }

        /* renamed from: b */
        public final boolean mo22206b() {
            boolean z;
            try {
                NetworkInfo activeNetworkInfo = this.f19612c.get().getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    z = false;
                    this.f19613d = z;
                    this.f19610a.registerReceiver(this.f19614e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    return true;
                }
            } catch (RuntimeException unused) {
            }
            z = true;
            this.f19613d = z;
            try {
                this.f19610a.registerReceiver(this.f19614e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                return true;
            } catch (SecurityException unused2) {
                return false;
            }
        }
    }

    public C6199p(Context context) {
        C6202c cVar;
        C7169f fVar = new C7169f(new C6200a(context));
        C6201b bVar = new C6201b();
        if (Build.VERSION.SDK_INT >= 24) {
            cVar = new C6203d(fVar, bVar);
        } else {
            cVar = new C6205e(context, fVar, bVar);
        }
        this.f19600a = cVar;
    }

    /* renamed from: a */
    public static C6199p m14774a(Context context) {
        if (f19599d == null) {
            synchronized (C6199p.class) {
                if (f19599d == null) {
                    f19599d = new C6199p(context.getApplicationContext());
                }
            }
        }
        return f19599d;
    }
}
