package p858uz;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Looper;
import ce0.C21100e;
import com.appboy.models.outgoing.FacebookUser;
import com.appsflyer.ServerParameters;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;
import p241s0.C6302b;
import p241s0.C6307g;

/* renamed from: uz.e */
public abstract class C20054e extends C20048a {

    /* renamed from: g */
    public final C20055a f50891g = new C20055a();

    /* renamed from: h */
    public final Looper f50892h;

    /* renamed from: i */
    public final LocationManager f50893i;

    /* renamed from: j */
    public final HashSet f50894j;

    /* renamed from: k */
    public final C6302b f50895k = new C6302b();

    /* renamed from: l */
    public volatile Location f50896l = null;

    /* renamed from: uz.e$a */
    public class C20055a implements LocationListener {
        public C20055a() {
        }

        public final void onLocationChanged(Location location) {
            C20054e eVar = C20054e.this;
            if (location == null) {
                eVar.getClass();
                return;
            }
            if (eVar.f50896l != null) {
                location = C20049b.m47540k(eVar.f50896l, location);
            }
            if (location != eVar.f50896l) {
                eVar.f50896l = location;
                eVar.mo51338f(location);
            }
        }

        public final void onProviderDisabled(String str) {
        }

        public final void onProviderEnabled(String str) {
        }

        public final void onStatusChanged(String str, int i, Bundle bundle) {
        }
    }

    /* renamed from: uz.e$b */
    public static class C20056b implements Callable<Location> {

        /* renamed from: b */
        public final LocationManager f50898b;

        /* renamed from: c */
        public Location f50899c;

        public C20056b(LocationManager locationManager, Location location) {
            C21100e.m49373x(locationManager, "locationManager");
            this.f50898b = locationManager;
            this.f50899c = location;
        }

        public final Object call() throws Exception {
            for (String lastKnownLocation : Arrays.asList(new String[]{"gps", ServerParameters.NETWORK, "passive"})) {
                Location lastKnownLocation2 = this.f50898b.getLastKnownLocation(lastKnownLocation);
                if (lastKnownLocation2 != null) {
                    Location location = this.f50899c;
                    if (location == null) {
                        this.f50899c = lastKnownLocation2;
                    } else {
                        this.f50899c = C20049b.m47540k(location, lastKnownLocation2);
                    }
                }
            }
            return this.f50899c;
        }
    }

    /* renamed from: uz.e$c */
    public static class C20057c {

        /* renamed from: a */
        public final String f50900a;

        /* renamed from: b */
        public final long f50901b;

        /* renamed from: c */
        public final float f50902c;

        public C20057c(String str, long j, float f) {
            this.f50900a = str;
            C21100e.m49361r(j, "minTime");
            this.f50901b = j;
            C21100e.m49357p(f, "minDistance");
            this.f50902c = f;
        }
    }

    /* renamed from: uz.e$d */
    public class C20058d implements LocationListener {

        /* renamed from: a */
        public final C20059f f50903a;

        /* renamed from: b */
        public final HashSet f50904b;

        /* renamed from: c */
        public Location f50905c = null;

        public C20058d(C20059f fVar) {
            this.f50903a = fVar;
            this.f50904b = new HashSet(C20054e.this.f50895k.keySet());
        }

        public final void onLocationChanged(Location location) {
            C20054e eVar = C20054e.this;
            Location location2 = this.f50905c;
            ((C20049b) eVar).getClass();
            this.f50905c = C20049b.m47540k(location2, location);
            this.f50904b.remove(location.getProvider());
            if (this.f50904b.isEmpty()) {
                this.f50903a.onLocationChanged(this.f50905c);
            }
        }

        public final void onProviderDisabled(String str) {
        }

        public final void onProviderEnabled(String str) {
        }

        public final void onStatusChanged(String str, int i, Bundle bundle) {
        }
    }

    public C20054e(Context context, Looper looper) {
        LocationManager locationManager = (LocationManager) context.getSystemService(FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        this.f50893i = locationManager;
        this.f50894j = new HashSet(locationManager.getProviders(false));
        this.f50892h = looper;
    }

    /* renamed from: d */
    public final void mo50011d() {
        mo52314j();
    }

    /* renamed from: e */
    public final void mo50012e() {
        this.f50893i.removeUpdates(this.f50891g);
    }

    /* renamed from: h */
    public final Location mo50014i() {
        if (!this.f48034d) {
            mo52308p();
        }
        return super.mo50014i();
    }

    /* renamed from: j */
    public final void mo52314j() {
        Iterator it = ((C6307g.C6312e) this.f50895k.values()).iterator();
        while (it.hasNext()) {
            C20057c cVar = (C20057c) it.next();
            String str = cVar.f50900a;
            if (this.f50894j.contains(str)) {
                this.f50893i.requestLocationUpdates(str, cVar.f50901b, cVar.f50902c, this.f50891g, this.f50892h);
            }
        }
    }

    /* renamed from: m */
    public final void mo50015m(C20059f fVar) {
        C20058d dVar = new C20058d(fVar);
        Iterator it = ((C6307g.C6310c) this.f50895k.keySet()).iterator();
        while (true) {
            C6307g.C6308a aVar = (C6307g.C6308a) it;
            if (aVar.hasNext()) {
                String str = (String) aVar.next();
                if (C20054e.this.f50894j.contains(str)) {
                    C20054e eVar = C20054e.this;
                    eVar.f50893i.requestSingleUpdate(str, dVar, eVar.f50892h);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: n */
    public final Task<Location> mo50016n() {
        return Tasks.call(AsyncTask.THREAD_POOL_EXECUTOR, new C20056b(this.f50893i, mo50014i()));
    }

    /* renamed from: p */
    public final void mo52308p() {
        LocationManager locationManager = this.f50893i;
        D h = super.mo50014i();
        C21100e.m49373x(locationManager, "locationManager");
        for (String lastKnownLocation : Arrays.asList(new String[]{"gps", ServerParameters.NETWORK, "passive"})) {
            D lastKnownLocation2 = locationManager.getLastKnownLocation(lastKnownLocation);
            if (lastKnownLocation2 != null) {
                if (h == null) {
                    h = lastKnownLocation2;
                } else {
                    h = C20049b.m47540k(h, lastKnownLocation2);
                }
            }
        }
        if (h != null) {
            this.f48035e = h;
            C20048a.f50880f = h;
        }
    }
}
