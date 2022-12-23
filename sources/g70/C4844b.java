package g70;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.AsyncTask;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import p664mu.C18461p;
import p801sq.C19519h;
import p977zz.C20934d0;

/* renamed from: g70.b */
public final class C4844b {
    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    public static Task<Location> m12164a(Context context) {
        if (!C20934d0.m49032c(context)) {
            return Tasks.forException(new SecurityException("Missing location permissions."));
        }
        Task<Location> lastLocation = LocationServices.getFusedLocationProviderClient(context).getLastLocation();
        lastLocation.addOnCompleteListener(AsyncTask.SERIAL_EXECUTOR, (OnCompleteListener<Location>) new C19519h(context, 6));
        return lastLocation;
    }

    /* renamed from: b */
    public static void m12165b(Context context, PendingIntent pendingIntent) {
        if (C20934d0.m49032c(context)) {
            LocationServices.getFusedLocationProviderClient(context).removeLocationUpdates(pendingIntent).addOnCompleteListener(AsyncTask.SERIAL_EXECUTOR, new C18461p(context, 3));
        } else {
            Tasks.forException(new SecurityException("Missing location permissions."));
        }
    }
}
