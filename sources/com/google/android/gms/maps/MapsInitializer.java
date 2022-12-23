package com.google.android.gms.maps;

import android.content.Context;

public final class MapsInitializer {
    private static final String zza = "MapsInitializer";
    private static boolean zzb = false;
    private static Renderer zzc = Renderer.LEGACY;

    public enum Renderer {
        LEGACY,
        LATEST
    }

    private MapsInitializer() {
    }

    public static synchronized int initialize(Context context) {
        int initialize;
        synchronized (MapsInitializer.class) {
            initialize = initialize(context, (Renderer) null, (OnMapsSdkInitializedCallback) null);
        }
        return initialize;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(16:10|11|12|13|14|15|16|(9:18|(1:(1:21))|23|24|(1:26)|27|28|29|(1:31))|22|23|24|(0)|27|28|29|(0)) */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0067, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        return 0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0054 */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0049 A[Catch:{ RemoteException -> 0x0054 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0061 A[Catch:{ RemoteException -> 0x0068 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized int initialize(android.content.Context r5, com.google.android.gms.maps.MapsInitializer.Renderer r6, com.google.android.gms.maps.OnMapsSdkInitializedCallback r7) {
        /*
            java.lang.Class<com.google.android.gms.maps.MapsInitializer> r0 = com.google.android.gms.maps.MapsInitializer.class
            monitor-enter(r0)
            java.lang.String r1 = "Context is null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5, r1)     // Catch:{ all -> 0x0074 }
            java.lang.String r1 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0074 }
            java.lang.String r2 = "preferredRenderer: "
            r2.concat(r1)     // Catch:{ all -> 0x0074 }
            boolean r1 = zzb     // Catch:{ all -> 0x0074 }
            r2 = 0
            if (r1 == 0) goto L_0x001f
            if (r7 == 0) goto L_0x001d
            com.google.android.gms.maps.MapsInitializer$Renderer r5 = zzc     // Catch:{ all -> 0x0074 }
            r7.onMapsSdkInitialized(r5)     // Catch:{ all -> 0x0074 }
        L_0x001d:
            monitor-exit(r0)
            return r2
        L_0x001f:
            com.google.android.gms.maps.internal.zzf r1 = com.google.android.gms.maps.internal.zzca.zza(r5, r6)     // Catch:{ GooglePlayServicesNotAvailableException -> 0x006f }
            com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate r3 = r1.zze()     // Catch:{ RemoteException -> 0x0068 }
            com.google.android.gms.maps.CameraUpdateFactory.zza(r3)     // Catch:{ RemoteException -> 0x0068 }
            com.google.android.gms.internal.maps.zzi r3 = r1.zzj()     // Catch:{ RemoteException -> 0x0068 }
            com.google.android.gms.maps.model.BitmapDescriptorFactory.zza(r3)     // Catch:{ RemoteException -> 0x0068 }
            r3 = 1
            zzb = r3     // Catch:{ all -> 0x0074 }
            r4 = 2
            if (r6 == 0) goto L_0x0042
            int r6 = r6.ordinal()     // Catch:{ all -> 0x0074 }
            if (r6 == 0) goto L_0x0043
            if (r6 == r3) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r3 = 2
            goto L_0x0043
        L_0x0042:
            r3 = 0
        L_0x0043:
            int r6 = r1.zzd()     // Catch:{ RemoteException -> 0x0054 }
            if (r6 != r4) goto L_0x004d
            com.google.android.gms.maps.MapsInitializer$Renderer r6 = com.google.android.gms.maps.MapsInitializer.Renderer.LATEST     // Catch:{ RemoteException -> 0x0054 }
            zzc = r6     // Catch:{ RemoteException -> 0x0054 }
        L_0x004d:
            com.google.android.gms.dynamic.IObjectWrapper r5 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r5)     // Catch:{ RemoteException -> 0x0054 }
            r1.zzl(r5, r3)     // Catch:{ RemoteException -> 0x0054 }
        L_0x0054:
            com.google.android.gms.maps.MapsInitializer$Renderer r5 = zzc     // Catch:{ all -> 0x0074 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0074 }
            java.lang.String r6 = "loadedRenderer: "
            r6.concat(r5)     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x0066
            com.google.android.gms.maps.MapsInitializer$Renderer r5 = zzc     // Catch:{ all -> 0x0074 }
            r7.onMapsSdkInitialized(r5)     // Catch:{ all -> 0x0074 }
        L_0x0066:
            monitor-exit(r0)
            return r2
        L_0x0068:
            r5 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r6 = new com.google.android.gms.maps.model.RuntimeRemoteException     // Catch:{ all -> 0x0074 }
            r6.<init>(r5)     // Catch:{ all -> 0x0074 }
            throw r6     // Catch:{ all -> 0x0074 }
        L_0x006f:
            r5 = move-exception
            int r5 = r5.errorCode     // Catch:{ all -> 0x0074 }
            monitor-exit(r0)
            return r5
        L_0x0074:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.MapsInitializer.initialize(android.content.Context, com.google.android.gms.maps.MapsInitializer$Renderer, com.google.android.gms.maps.OnMapsSdkInitializedCallback):int");
    }
}
