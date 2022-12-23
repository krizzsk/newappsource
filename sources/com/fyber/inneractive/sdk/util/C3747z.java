package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import com.appboy.models.outgoing.FacebookUser;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.C3699i;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.fyber.inneractive.sdk.util.z */
public class C3747z {

    /* renamed from: a */
    public Context f12948a;

    /* renamed from: b */
    public Location f12949b = null;

    /* renamed from: c */
    public C3699i.C3700a f12950c;

    /* renamed from: d */
    public Runnable f12951d;

    /* renamed from: e */
    public LocationListener f12952e;

    /* renamed from: f */
    public LocationListener f12953f;

    /* renamed from: g */
    public long f12954g;

    /* renamed from: com.fyber.inneractive.sdk.util.z$a */
    public static class C3748a {

        /* renamed from: a */
        public static C3747z f12955a = new C3747z();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x008c A[Catch:{ all -> 0x00be }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b5 A[Catch:{ all -> 0x00be }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0164  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.location.Location mo15399a() {
        /*
            r19 = this;
            r0 = r19
            java.lang.String r1 = "network"
            android.content.Context r2 = r0.f12948a
            r3 = 0
            java.lang.String r4 = "Location Manager: "
            r5 = 0
            r6 = 1
            if (r2 != 0) goto L_0x0017
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r5] = r4
            java.lang.String r2 = "%sgetBestLastKnownLocation called, but context is null!"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r2, r1)
            return r3
        L_0x0017:
            java.lang.String r2 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r7 = com.fyber.inneractive.sdk.util.C3707l.m9966b((java.lang.String) r2)
            java.lang.String r8 = "android.permission.ACCESS_COARSE_LOCATION"
            if (r7 == 0) goto L_0x002c
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r7[r5] = r4
            java.lang.String r9 = "%sgetBestLastKnownLocation: Found fine location permission"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r9, r7)
            r7 = 1
            goto L_0x003c
        L_0x002c:
            boolean r7 = com.fyber.inneractive.sdk.util.C3707l.m9966b((java.lang.String) r8)
            if (r7 == 0) goto L_0x0188
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r7[r5] = r4
            java.lang.String r9 = "%sgetBestLastKnownLocation: Found coarse location permission"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r9, r7)
            r7 = 0
        L_0x003c:
            android.content.Context r9 = r0.f12948a
            java.lang.String r10 = "location"
            java.lang.Object r9 = r9.getSystemService(r10)
            android.location.LocationManager r9 = (android.location.LocationManager) r9
            java.lang.String r11 = "%slast known network location time delta = %d"
            java.lang.String r12 = "gps"
            r13 = 2
            if (r7 == 0) goto L_0x0085
            boolean r7 = r9.isProviderEnabled(r12)     // Catch:{ all -> 0x0085 }
            if (r7 == 0) goto L_0x007c
            android.location.Location r7 = r9.getLastKnownLocation(r12)     // Catch:{ all -> 0x0085 }
            java.lang.String r14 = "%slast known GPS location: %s"
            java.lang.Object[] r15 = new java.lang.Object[r13]     // Catch:{ all -> 0x0085 }
            r15[r5] = r4     // Catch:{ all -> 0x0085 }
            r15[r6] = r7     // Catch:{ all -> 0x0085 }
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r14, r15)     // Catch:{ all -> 0x0085 }
            if (r7 == 0) goto L_0x0086
            java.lang.Object[] r14 = new java.lang.Object[r13]     // Catch:{ all -> 0x0085 }
            r14[r5] = r4     // Catch:{ all -> 0x0085 }
            long r15 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0085 }
            long r17 = r7.getTime()     // Catch:{ all -> 0x0085 }
            long r15 = r15 - r17
            java.lang.Long r15 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x0085 }
            r14[r6] = r15     // Catch:{ all -> 0x0085 }
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r11, r14)     // Catch:{ all -> 0x0085 }
            goto L_0x0086
        L_0x007c:
            java.lang.String r7 = "%sgetBestLastKnownLocation: Gps location permission available, but GPS provider is disabled!"
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x0085 }
            r14[r5] = r4     // Catch:{ all -> 0x0085 }
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r7, r14)     // Catch:{ all -> 0x0085 }
        L_0x0085:
            r7 = r3
        L_0x0086:
            boolean r14 = r9.isProviderEnabled(r1)     // Catch:{ all -> 0x00be }
            if (r14 == 0) goto L_0x00b5
            android.location.Location r9 = r9.getLastKnownLocation(r1)     // Catch:{ all -> 0x00be }
            java.lang.String r14 = "%slast known network location: %s"
            java.lang.Object[] r15 = new java.lang.Object[r13]     // Catch:{ all -> 0x00be }
            r15[r5] = r4     // Catch:{ all -> 0x00be }
            r15[r6] = r9     // Catch:{ all -> 0x00be }
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r14, r15)     // Catch:{ all -> 0x00be }
            if (r9 == 0) goto L_0x00bf
            java.lang.Object[] r14 = new java.lang.Object[r13]     // Catch:{ all -> 0x00be }
            r14[r5] = r4     // Catch:{ all -> 0x00be }
            long r15 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00be }
            long r17 = r9.getTime()     // Catch:{ all -> 0x00be }
            long r15 = r15 - r17
            java.lang.Long r15 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x00be }
            r14[r6] = r15     // Catch:{ all -> 0x00be }
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r11, r14)     // Catch:{ all -> 0x00be }
            goto L_0x00bf
        L_0x00b5:
            java.lang.String r9 = "%sgetBestLastKnownLocation: Network location permission available, but Network provider is disabled!"
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x00be }
            r11[r5] = r4     // Catch:{ all -> 0x00be }
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r9, r11)     // Catch:{ all -> 0x00be }
        L_0x00be:
            r9 = r3
        L_0x00bf:
            android.location.Location r7 = r0.mo15400a((android.location.Location) r7, (android.location.Location) r9)     // Catch:{ all -> 0x00d6 }
            android.location.Location r9 = r0.f12949b     // Catch:{ all -> 0x00d6 }
            android.location.Location r7 = r0.mo15400a((android.location.Location) r7, (android.location.Location) r9)     // Catch:{ all -> 0x00d6 }
            java.lang.String r9 = "%sgetBestLastKnownLocation: returning - %s"
            java.lang.Object[] r11 = new java.lang.Object[r13]     // Catch:{ all -> 0x00d6 }
            r11[r5] = r4     // Catch:{ all -> 0x00d6 }
            r11[r6] = r7     // Catch:{ all -> 0x00d6 }
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r9, r11)     // Catch:{ all -> 0x00d6 }
            r3 = r7
            goto L_0x00d7
        L_0x00d6:
        L_0x00d7:
            android.content.Context r7 = r0.f12948a
            if (r7 == 0) goto L_0x00e2
            com.fyber.inneractive.sdk.util.i$a r9 = r0.f12950c
            if (r9 == 0) goto L_0x00e2
            com.fyber.inneractive.sdk.util.C3699i.m9941a(r7, r9)
        L_0x00e2:
            if (r3 == 0) goto L_0x00ea
            boolean r7 = r0.mo15403a((android.location.Location) r3)
            if (r7 != 0) goto L_0x0187
        L_0x00ea:
            android.content.Context r7 = r0.f12948a
            if (r7 != 0) goto L_0x00f9
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r5] = r4
            java.lang.String r2 = "%sregisterForLocationUpdates called, but context is null!"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r2, r1)
            goto L_0x0187
        L_0x00f9:
            java.lang.Object r7 = r7.getSystemService(r10)
            android.location.LocationManager r7 = (android.location.LocationManager) r7
            android.location.LocationListener r9 = r0.f12952e
            if (r9 != 0) goto L_0x012a
            boolean r8 = com.fyber.inneractive.sdk.util.C3707l.m9966b((java.lang.String) r8)
            if (r8 != 0) goto L_0x010f
            boolean r8 = com.fyber.inneractive.sdk.util.C3707l.m9966b((java.lang.String) r2)
            if (r8 == 0) goto L_0x0133
        L_0x010f:
            boolean r8 = r7.isProviderEnabled(r1)
            if (r8 == 0) goto L_0x0133
            java.lang.Object[] r8 = new java.lang.Object[r6]
            r8[r5] = r4
            java.lang.String r9 = "%sregisterting for network location updates"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r9, r8)
            com.fyber.inneractive.sdk.util.w r8 = new com.fyber.inneractive.sdk.util.w
            r8.<init>(r0)
            r0.f12952e = r8
            r0.mo15402a((java.lang.String) r1, (android.location.LocationListener) r8)
            r1 = 1
            goto L_0x0134
        L_0x012a:
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r5] = r4
            java.lang.String r8 = "%snetwork location listener already registered"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r8, r1)
        L_0x0133:
            r1 = 0
        L_0x0134:
            android.location.LocationListener r8 = r0.f12953f
            if (r8 != 0) goto L_0x0158
            boolean r2 = com.fyber.inneractive.sdk.util.C3707l.m9966b((java.lang.String) r2)
            if (r2 == 0) goto L_0x0161
            boolean r2 = r7.isProviderEnabled(r12)
            if (r2 == 0) goto L_0x0161
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r5] = r4
            java.lang.String r2 = "%sregisterting for gps location updates"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r2, r1)
            com.fyber.inneractive.sdk.util.x r1 = new com.fyber.inneractive.sdk.util.x
            r1.<init>(r0)
            r0.f12953f = r1
            r0.mo15402a((java.lang.String) r12, (android.location.LocationListener) r1)
            goto L_0x0162
        L_0x0158:
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r5] = r4
            java.lang.String r4 = "%sgps location listener already registered"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r4, r2)
        L_0x0161:
            r6 = r1
        L_0x0162:
            if (r6 == 0) goto L_0x0187
            long r1 = java.lang.System.currentTimeMillis()
            r0.f12954g = r1
            java.lang.Runnable r1 = r0.f12951d
            if (r1 != 0) goto L_0x0175
            com.fyber.inneractive.sdk.util.y r1 = new com.fyber.inneractive.sdk.util.y
            r1.<init>(r0)
            r0.f12951d = r1
        L_0x0175:
            java.lang.Runnable r1 = r0.f12951d
            if (r1 == 0) goto L_0x0187
            android.os.Handler r2 = com.fyber.inneractive.sdk.util.C3714n.f12902b
            com.fyber.inneractive.sdk.config.IAConfigManager r4 = com.fyber.inneractive.sdk.config.IAConfigManager.f9202J
            com.fyber.inneractive.sdk.config.q r4 = r4.f9221i
            int r4 = r4.f9366i
            int r4 = r4 * 1000
            long r4 = (long) r4
            r2.postDelayed(r1, r4)
        L_0x0187:
            return r3
        L_0x0188:
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r5] = r4
            java.lang.String r2 = "%sgetBestLastKnownLocation: did not find any location permissions"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r2, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.C3747z.mo15399a():android.location.Location");
    }

    /* renamed from: a */
    public final boolean mo15403a(Location location) {
        int i = IAConfigManager.f9202J.f9221i.f9365h;
        IAlog.m9902a("%sisLastKnownLocationGoodEnough: maxTimeAccInMin = %d", "Location Manager: ", Integer.valueOf(i));
        long j = (long) (i * 60 * 1000);
        IAlog.m9902a("%sisLastKnownLocationGoodEnough: max time accuracy in msec = %d", "Location Manager: ", Long.valueOf(j));
        long abs = Math.abs(System.currentTimeMillis() - location.getTime());
        IAlog.m9902a("%sisLastKnownLocationGoodEnough: location: = %s tss = %d tssM = %d", "Location Manager: ", location, Long.valueOf(abs), Long.valueOf(abs / 60000));
        boolean z = abs <= j;
        IAlog.m9902a("%sisLastKnownLocationGoodEnough: returns - %s", "Location Manager: ", Boolean.valueOf(z));
        return z;
    }

    /* renamed from: a */
    public final void mo15401a(LocationListener locationListener) {
        if (locationListener != null) {
            IAlog.m9902a("%sunregistering location listener: %s", "Location Manager: ", locationListener);
            Context context = this.f12948a;
            if (context == null) {
                IAlog.m9902a("%sunregisterFromLocationUpdates called, but context is null!", "Location Manager: ");
                return;
            }
            try {
                ((LocationManager) context.getSystemService(FacebookUser.LOCATION_OUTER_OBJECT_KEY)).removeUpdates(locationListener);
            } catch (Exception unused) {
                IAlog.m9902a("%sError retrieved when trying to stop location updates - updates were already paused.", "Location Manager: ");
            }
        }
    }

    /* renamed from: a */
    public final void mo15402a(String str, LocationListener locationListener) {
        Context context = this.f12948a;
        if (context == null) {
            IAlog.m9902a("%sregisterForASingleLocationUpdate called, but context is null!", "Location Manager: ");
            return;
        }
        try {
            ((LocationManager) context.getSystemService(FacebookUser.LOCATION_OUTER_OBJECT_KEY)).requestLocationUpdates(str, 0, BitmapDescriptorFactory.HUE_RED, locationListener, this.f12948a.getMainLooper());
            IAlog.m9902a("%sSuccessfully registered for %s location update", "Location Manager: ", str);
        } catch (SecurityException unused) {
            IAlog.m9902a("%sError retrieved when trying to get the network location - access appears to be disabled.", "Location Manager: ");
        } catch (IllegalArgumentException unused2) {
            IAlog.m9902a("%sError retrieved when trying to get the network location - device has no network provider.", "Location Manager: ");
        } catch (NullPointerException unused3) {
            IAlog.m9902a("%sError retrieved when trying to get the network location - NPE.", "Location Manager: ");
        }
    }

    /* renamed from: a */
    public final Location mo15400a(Location location, Location location2) {
        if (location == null && location2 == null) {
            return null;
        }
        return (location == null || location2 == null) ? location != null ? location : location2 : location.getTime() > location2.getTime() ? location : location2;
    }
}
