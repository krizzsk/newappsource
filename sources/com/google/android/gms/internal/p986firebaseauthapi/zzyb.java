package com.google.android.gms.internal.p986firebaseauthapi;

import com.usebutton.sdk.internal.util.UrlPrivacyValidator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p241s0.C6302b;
import p743qd.C19107d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyb */
public final class zzyb {
    private static final Map zza = new C6302b();
    private static final Map zzb = new C6302b();

    public static String zza(String str) {
        zzxz zzxz;
        Map map = zza;
        synchronized (map) {
            zzxz = (zzxz) map.get(str);
        }
        if (zzxz != null) {
            return zzh(zzxz.zzb(), zzxz.zza(), zzxz.zzb().contains(":")).concat("emulator/auth/handler");
        }
        throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
    }

    public static String zzb(String str) {
        zzxz zzxz;
        String str2;
        Map map = zza;
        synchronized (map) {
            zzxz = (zzxz) map.get(str);
        }
        if (zzxz != null) {
            str2 = "".concat(zzh(zzxz.zzb(), zzxz.zza(), zzxz.zzb().contains(":")));
        } else {
            str2 = UrlPrivacyValidator.HTTPS_SCHEME;
        }
        return str2.concat("www.googleapis.com/identitytoolkit/v3/relyingparty");
    }

    public static String zzc(String str) {
        zzxz zzxz;
        String str2;
        Map map = zza;
        synchronized (map) {
            zzxz = (zzxz) map.get(str);
        }
        if (zzxz != null) {
            str2 = "".concat(zzh(zzxz.zzb(), zzxz.zza(), zzxz.zzb().contains(":")));
        } else {
            str2 = UrlPrivacyValidator.HTTPS_SCHEME;
        }
        return str2.concat("identitytoolkit.googleapis.com/v2");
    }

    public static String zzd(String str) {
        zzxz zzxz;
        String str2;
        Map map = zza;
        synchronized (map) {
            zzxz = (zzxz) map.get(str);
        }
        if (zzxz != null) {
            str2 = "".concat(zzh(zzxz.zzb(), zzxz.zza(), zzxz.zzb().contains(":")));
        } else {
            str2 = UrlPrivacyValidator.HTTPS_SCHEME;
        }
        return str2.concat("securetoken.googleapis.com/v1");
    }

    public static void zze(String str, zzya zzya) {
        Map map = zzb;
        synchronized (map) {
            if (map.containsKey(str)) {
                ((List) map.get(str)).add(new WeakReference(zzya));
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new WeakReference(zzya));
                map.put(str, arrayList);
            }
        }
    }

    public static void zzf(C19107d dVar, String str, int i) {
        dVar.mo51535a();
        String str2 = dVar.f48570c.f48581a;
        Map map = zza;
        synchronized (map) {
            map.put(str2, new zzxz(str, i));
        }
        Map map2 = zzb;
        synchronized (map2) {
            if (map2.containsKey(str2)) {
                boolean z = false;
                for (WeakReference weakReference : (List) map2.get(str2)) {
                    zzya zzya = (zzya) weakReference.get();
                    if (zzya != null) {
                        zzya.zzi();
                        z = true;
                    }
                }
                if (!z) {
                    zza.remove(str2);
                }
            }
        }
    }

    public static boolean zzg(C19107d dVar) {
        Map map = zza;
        dVar.mo51535a();
        return map.containsKey(dVar.f48570c.f48581a);
    }

    private static String zzh(String str, int i, boolean z) {
        if (z) {
            return "http://[" + str + "]:" + i + "/";
        }
        return UrlPrivacyValidator.HTTP_SCHEME + str + ":" + i + "/";
    }
}
