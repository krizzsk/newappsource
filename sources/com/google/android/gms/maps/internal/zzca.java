package com.google.android.gms.maps.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.maps.MapsInitializer;

public final class zzca {
    private static final String zza = "zzca";
    @SuppressLint({"StaticFieldLeak"})
    private static Context zzb;
    private static zzf zzc;

    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.maps.internal.zzf zza(android.content.Context r3, com.google.android.gms.maps.MapsInitializer.Renderer r4) throws com.google.android.gms.common.GooglePlayServicesNotAvailableException {
        /*
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "preferredRenderer: "
            r1.concat(r0)
            com.google.android.gms.maps.internal.zzf r0 = zzc
            if (r0 != 0) goto L_0x0079
            r0 = 13400000(0xcc77c0, float:1.87774E-38)
            int r0 = com.google.android.gms.common.GooglePlayServicesUtil.isGooglePlayServicesAvailable(r3, r0)
            if (r0 != 0) goto L_0x0073
            android.content.Context r0 = zzc(r3, r4)
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.String r1 = "com.google.android.gms.maps.internal.CreatorImpl"
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch:{ ClassNotFoundException -> 0x006b }
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0     // Catch:{ ClassNotFoundException -> 0x006b }
            java.lang.Class r0 = r0.loadClass(r1)     // Catch:{ ClassNotFoundException -> 0x006b }
            java.lang.Object r0 = zzd(r0)     // Catch:{ ClassNotFoundException -> 0x006b }
            android.os.IBinder r0 = (android.os.IBinder) r0
            if (r0 != 0) goto L_0x0037
            r0 = 0
            goto L_0x004b
        L_0x0037:
            java.lang.String r1 = "com.google.android.gms.maps.internal.ICreator"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.maps.internal.zzf
            if (r2 == 0) goto L_0x0045
            r0 = r1
            com.google.android.gms.maps.internal.zzf r0 = (com.google.android.gms.maps.internal.zzf) r0
            goto L_0x004b
        L_0x0045:
            com.google.android.gms.maps.internal.zze r1 = new com.google.android.gms.maps.internal.zze
            r1.<init>(r0)
            r0 = r1
        L_0x004b:
            zzc = r0
            android.content.Context r3 = zzc(r3, r4)     // Catch:{ RemoteException -> 0x0064 }
            r3.getClass()     // Catch:{ RemoteException -> 0x0064 }
            android.content.res.Resources r3 = r3.getResources()     // Catch:{ RemoteException -> 0x0064 }
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r3)     // Catch:{ RemoteException -> 0x0064 }
            int r4 = com.google.android.gms.common.GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE     // Catch:{ RemoteException -> 0x0064 }
            r0.zzk(r3, r4)     // Catch:{ RemoteException -> 0x0064 }
            com.google.android.gms.maps.internal.zzf r3 = zzc
            return r3
        L_0x0064:
            r3 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r4 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r4.<init>(r3)
            throw r4
        L_0x006b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl"
            r3.<init>(r4)
            throw r3
        L_0x0073:
            com.google.android.gms.common.GooglePlayServicesNotAvailableException r3 = new com.google.android.gms.common.GooglePlayServicesNotAvailableException
            r3.<init>(r0)
            throw r3
        L_0x0079:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zzca.zza(android.content.Context, com.google.android.gms.maps.MapsInitializer$Renderer):com.google.android.gms.maps.internal.zzf");
    }

    private static Context zzb(Exception exc, Context context) {
        return GooglePlayServicesUtil.getRemoteContext(context);
    }

    private static Context zzc(Context context, MapsInitializer.Renderer renderer) {
        String str;
        Context context2;
        Context context3 = zzb;
        if (context3 != null) {
            return context3;
        }
        context.getApplicationContext();
        if (renderer != null) {
            int ordinal = renderer.ordinal();
            if (ordinal == 0) {
                str = "com.google.android.gms.maps_legacy_dynamite";
            } else if (ordinal == 1) {
                str = "com.google.android.gms.maps_core_dynamite";
            }
            context2 = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, str).getModuleContext();
            zzb = context2;
            return context2;
        }
        str = "com.google.android.gms.maps_dynamite";
        try {
            context2 = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, str).getModuleContext();
        } catch (Exception e) {
            if (!str.equals("com.google.android.gms.maps_dynamite")) {
                try {
                    context2 = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.maps_dynamite").getModuleContext();
                } catch (Exception e2) {
                    context2 = zzb(e2, context);
                }
            } else {
                context2 = zzb(e, context);
            }
        }
        zzb = context2;
        return context2;
    }

    private static <T> T zzd(Class cls) {
        String str;
        String str2;
        try {
            return cls.newInstance();
        } catch (InstantiationException unused) {
            String name = cls.getName();
            if (name.length() != 0) {
                str = "Unable to instantiate the dynamic class ".concat(name);
            } else {
                str = new String("Unable to instantiate the dynamic class ");
            }
            throw new IllegalStateException(str);
        } catch (IllegalAccessException unused2) {
            String name2 = cls.getName();
            if (name2.length() != 0) {
                str2 = "Unable to call the default constructor of ".concat(name2);
            } else {
                str2 = new String("Unable to call the default constructor of ");
            }
            throw new IllegalStateException(str2);
        }
    }
}
