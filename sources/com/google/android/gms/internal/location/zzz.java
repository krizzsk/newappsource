package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;

@VisibleForTesting
public final class zzz implements FusedLocationProviderApi {
    public final PendingResult<Status> flushLocations(GoogleApiClient googleApiClient) {
        return googleApiClient.execute(new zzp(this, googleApiClient));
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0046 */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0054 A[SYNTHETIC, Splitter:B:23:0x0054] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.location.Location getLastLocation(com.google.android.gms.common.api.GoogleApiClient r9) {
        /*
            r8 = this;
            com.google.android.gms.internal.location.zzbe r9 = com.google.android.gms.location.LocationServices.zza(r9)
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ Exception -> 0x005c }
            r0.<init>()     // Catch:{ Exception -> 0x005c }
            java.util.concurrent.CountDownLatch r1 = new java.util.concurrent.CountDownLatch     // Catch:{ Exception -> 0x005c }
            r2 = 1
            r1.<init>(r2)     // Catch:{ Exception -> 0x005c }
            com.google.android.gms.location.LastLocationRequest$Builder r3 = new com.google.android.gms.location.LastLocationRequest$Builder     // Catch:{ Exception -> 0x005c }
            r3.<init>()     // Catch:{ Exception -> 0x005c }
            com.google.android.gms.location.LastLocationRequest r3 = r3.build()     // Catch:{ Exception -> 0x005c }
            com.google.android.gms.internal.location.zzq r4 = new com.google.android.gms.internal.location.zzq     // Catch:{ Exception -> 0x005c }
            r4.<init>(r8, r0, r1)     // Catch:{ Exception -> 0x005c }
            r9.zzu(r3, r4)     // Catch:{ Exception -> 0x005c }
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ Exception -> 0x005c }
            r3 = 30
            r5 = 0
            long r3 = r9.toNanos(r3)     // Catch:{ all -> 0x0050 }
            long r6 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0050 }
            long r6 = r6 + r3
        L_0x002e:
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ InterruptedException -> 0x0046, all -> 0x0043 }
            r1.await(r3, r9)     // Catch:{ InterruptedException -> 0x0046, all -> 0x0043 }
            if (r5 == 0) goto L_0x003c
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ Exception -> 0x005c }
            r9.interrupt()     // Catch:{ Exception -> 0x005c }
        L_0x003c:
            java.lang.Object r9 = r0.get()     // Catch:{ Exception -> 0x005c }
            android.location.Location r9 = (android.location.Location) r9     // Catch:{ Exception -> 0x005c }
            return r9
        L_0x0043:
            r9 = move-exception
            r2 = r5
            goto L_0x0052
        L_0x0046:
            long r3 = java.lang.System.nanoTime()     // Catch:{ all -> 0x004e }
            long r3 = r6 - r3
            r5 = 1
            goto L_0x002e
        L_0x004e:
            r9 = move-exception
            goto L_0x0052
        L_0x0050:
            r9 = move-exception
            r2 = 0
        L_0x0052:
            if (r2 == 0) goto L_0x005b
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ Exception -> 0x005c }
            r0.interrupt()     // Catch:{ Exception -> 0x005c }
        L_0x005b:
            throw r9     // Catch:{ Exception -> 0x005c }
        L_0x005c:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzz.getLastLocation(com.google.android.gms.common.api.GoogleApiClient):android.location.Location");
    }

    public final LocationAvailability getLocationAvailability(GoogleApiClient googleApiClient) {
        try {
            return LocationServices.zza(googleApiClient).zzp();
        } catch (Exception unused) {
            return null;
        }
    }

    public final PendingResult<Status> removeLocationUpdates(GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        return googleApiClient.execute(new zzl(this, googleApiClient, pendingIntent));
    }

    public final PendingResult<Status> requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, PendingIntent pendingIntent) {
        return googleApiClient.execute(new zzu(this, googleApiClient, locationRequest, pendingIntent));
    }

    public final PendingResult<Status> setMockLocation(GoogleApiClient googleApiClient, Location location) {
        return googleApiClient.execute(new zzo(this, googleApiClient, location));
    }

    public final PendingResult<Status> setMockMode(GoogleApiClient googleApiClient, boolean z) {
        return googleApiClient.execute(new zzn(this, googleApiClient, z));
    }

    public final PendingResult<Status> removeLocationUpdates(GoogleApiClient googleApiClient, LocationCallback locationCallback) {
        return googleApiClient.execute(new zzm(this, googleApiClient, locationCallback));
    }

    public final PendingResult<Status> requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationCallback locationCallback, Looper looper) {
        return googleApiClient.execute(new zzt(this, googleApiClient, locationRequest, locationCallback, looper));
    }

    public final PendingResult<Status> removeLocationUpdates(GoogleApiClient googleApiClient, LocationListener locationListener) {
        return googleApiClient.execute(new zzv(this, googleApiClient, locationListener));
    }

    public final PendingResult<Status> requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener) {
        Preconditions.checkNotNull(Looper.myLooper(), "Calling thread must be a prepared Looper thread.");
        return googleApiClient.execute(new zzr(this, googleApiClient, locationRequest, locationListener));
    }

    public final PendingResult<Status> requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener, Looper looper) {
        return googleApiClient.execute(new zzs(this, googleApiClient, locationRequest, locationListener, looper));
    }
}
