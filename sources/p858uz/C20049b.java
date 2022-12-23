package p858uz;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import com.appsflyer.ServerParameters;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.concurrent.TimeUnit;
import p858uz.C20054e;
import p977zz.C20975x0;

/* renamed from: uz.b */
public final class C20049b extends C20054e {

    /* renamed from: m */
    public static final long f50881m = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: n */
    public static final long f50882n = TimeUnit.SECONDS.toMillis(30);

    public C20049b(Context context, Looper looper) {
        super(context, looper);
    }

    /* renamed from: k */
    public static Location m47540k(Location location, Location location2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (location == null) {
            return location2;
        }
        boolean equals = "gps".equals(location.getProvider());
        boolean equals2 = "gps".equals(location2.getProvider());
        long time = location2.getTime() - location.getTime();
        long j = f50881m;
        boolean z6 = true;
        if (time > j) {
            z = true;
        } else {
            z = false;
        }
        if (time < (-j)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (time > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (equals && !equals2 && time < f50882n) {
            return location;
        }
        if (z) {
            return location2;
        }
        if (z2) {
            return location;
        }
        if (location2.distanceTo(location) > 500.0f) {
            return location2;
        }
        float accuracy = location2.getAccuracy() - location.getAccuracy();
        if (accuracy > BitmapDescriptorFactory.HUE_RED) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (accuracy < BitmapDescriptorFactory.HUE_RED) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (accuracy <= 200.0f) {
            z6 = false;
        }
        boolean e = C20975x0.m49118e(location2.getProvider(), location.getProvider());
        if (z5) {
            return location2;
        }
        if (z3 && !z4) {
            return location2;
        }
        if (!z3 || z6 || !e) {
            return location;
        }
        return location2;
    }

    /* renamed from: l */
    public final void mo52309l(LocationRequest locationRequest) {
        this.f50895k.clear();
        if (locationRequest != null) {
            long interval = locationRequest.getInterval();
            long fastestInterval = locationRequest.getFastestInterval();
            float smallestDisplacement = locationRequest.getSmallestDisplacement();
            int priority = locationRequest.getPriority();
            if (priority == 100) {
                this.f50895k.put("gps", new C20054e.C20057c("gps", interval, smallestDisplacement));
                this.f50895k.put(ServerParameters.NETWORK, new C20054e.C20057c(ServerParameters.NETWORK, interval, smallestDisplacement));
            } else if (priority == 102 || priority == 104) {
                this.f50895k.put(ServerParameters.NETWORK, new C20054e.C20057c(ServerParameters.NETWORK, interval, smallestDisplacement));
            } else if (priority == 105) {
                if (0 < fastestInterval && fastestInterval < interval) {
                    interval = fastestInterval;
                }
                this.f50895k.put("passive", new C20054e.C20057c("passive", interval, smallestDisplacement));
            }
        }
        if (this.f48034d) {
            this.f50893i.removeUpdates(this.f50891g);
            mo52314j();
        }
    }
}
