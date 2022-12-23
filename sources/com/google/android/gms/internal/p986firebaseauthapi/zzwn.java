package com.google.android.gms.internal.p986firebaseauthapi;

import java.lang.reflect.Type;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwn */
public final class zzwn {
    private static final String zza = "com.google.android.gms.internal.firebase-auth-api.zzwn";

    private zzwn() {
    }

    public static Object zza(String str, Type type) throws zzui {
        if (type == String.class) {
            try {
                zzyd zzyd = new zzyd();
                zzyd.zzb(str);
                if (zzyd.zzd()) {
                    return zzyd.zzc();
                }
                throw new zzui("No error message: " + str);
            } catch (Exception e) {
                throw new zzui("Json conversion failed! ".concat(String.valueOf(e.getMessage())), e);
            }
        } else if (type == Void.class) {
            return null;
        } else {
            try {
                zzwp zzwp = (zzwp) ((Class) type).getConstructor(new Class[0]).newInstance(new Object[0]);
                try {
                    zzwp.zza(str);
                    return zzwp;
                } catch (Exception e2) {
                    throw new zzui("Json conversion failed! ".concat(String.valueOf(e2.getMessage())), e2);
                }
            } catch (Exception e3) {
                throw new zzui("Instantiation of JsonResponse failed! ".concat(type.toString()), e3);
            }
        }
    }
}
