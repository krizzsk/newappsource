package p858uz;

import android.content.Context;
import android.location.Location;
import android.os.AsyncTask;
import android.os.Looper;
import ce0.C21100e;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.Task;
import java.util.IdentityHashMap;
import java.util.concurrent.TimeUnit;
import p735pt.C18982c;

/* renamed from: uz.d */
public final class C20051d extends C20048a {

    /* renamed from: g */
    public final C20052a f50883g = new C20052a();

    /* renamed from: h */
    public final FusedLocationProviderClient f50884h;

    /* renamed from: i */
    public final Looper f50885i;

    /* renamed from: j */
    public final IdentityHashMap f50886j = new IdentityHashMap();

    /* renamed from: k */
    public LocationRequest f50887k;

    /* renamed from: uz.d$a */
    public class C20052a extends LocationCallback {
        public C20052a() {
        }

        public final void onLocationAvailability(LocationAvailability locationAvailability) {
            locationAvailability.isLocationAvailable();
        }

        public final void onLocationResult(LocationResult locationResult) {
            C20051d.this.mo51338f(locationResult.getLastLocation());
        }
    }

    /* renamed from: uz.d$b */
    public class C20053b extends LocationCallback {

        /* renamed from: a */
        public final C20059f f50889a;

        public C20053b(C20059f fVar) {
            this.f50889a = fVar;
        }

        public final void onLocationResult(LocationResult locationResult) {
            if (C20051d.this.f50886j.remove(this.f50889a) != null) {
                this.f50889a.onLocationChanged(locationResult.getLastLocation());
                C20051d.this.f50884h.removeLocationUpdates((LocationCallback) this);
            }
        }
    }

    public C20051d(Context context, Looper looper) {
        this.f50884h = LocationServices.getFusedLocationProviderClient(context);
        C21100e.m49373x(looper, "listenerNotificationLooper");
        this.f50885i = looper;
    }

    /* renamed from: d */
    public final void mo50011d() {
        LocationRequest locationRequest = this.f50887k;
        if (locationRequest != null) {
            this.f50884h.requestLocationUpdates(locationRequest, (LocationCallback) this.f50883g, this.f50885i).addOnCompleteListener(AsyncTask.THREAD_POOL_EXECUTOR, new C18982c(1));
        }
    }

    /* renamed from: e */
    public final void mo50012e() {
        if (this.f50887k != null) {
            this.f50884h.removeLocationUpdates((LocationCallback) this.f50883g).addOnCompleteListener(AsyncTask.THREAD_POOL_EXECUTOR, new C20050c());
        }
    }

    /* renamed from: j */
    public final void mo50904b(C20059f fVar) {
        C20053b bVar = (C20053b) this.f50886j.remove(fVar);
        if (bVar != null) {
            this.f50884h.removeLocationUpdates((LocationCallback) bVar);
        } else {
            super.mo50904b(fVar);
        }
    }

    /* renamed from: k */
    public final void mo50015m(C20059f fVar) {
        if (this.f50887k != null) {
            C20053b bVar = new C20053b(fVar);
            this.f50886j.put(fVar, bVar);
            this.f50884h.requestLocationUpdates(LocationRequest.create().setPriority(this.f50887k.getPriority()).setInterval(this.f50887k.getInterval()).setFastestInterval(this.f50887k.getFastestInterval()).setSmallestDisplacement(this.f50887k.getSmallestDisplacement()).setExpirationDuration(TimeUnit.SECONDS.toMillis(30)).setNumUpdates(1), (LocationCallback) bVar, this.f50885i);
            return;
        }
        throw new IllegalArgumentException("No location request specified");
    }

    /* renamed from: n */
    public final Task<Location> mo50016n() {
        return this.f50884h.getLastLocation();
    }
}
