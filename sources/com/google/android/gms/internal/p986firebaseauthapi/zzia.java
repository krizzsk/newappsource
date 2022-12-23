package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import p001a0.C0016g;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzia */
final class zzia implements zzbv {
    /* access modifiers changed from: private */
    public static final Logger zza = Logger.getLogger(zzia.class.getName());
    /* access modifiers changed from: private */
    public static final byte[] zzb = {0};

    public final Class zza() {
        return zzbm.class;
    }

    public final Class zzb() {
        return zzbm.class;
    }

    public final /* bridge */ /* synthetic */ Object zzc(zzbu zzbu) throws GeneralSecurityException {
        for (List it : zzbu.zzd()) {
            Iterator it2 = it.iterator();
            while (true) {
                if (it2.hasNext()) {
                    zzbq zzbq = (zzbq) it2.next();
                    if (zzbq.zzb() instanceof zzhw) {
                        zzhw zzhw = (zzhw) zzbq.zzb();
                        zzpx zzb2 = zzpx.zzb(zzbq.zzf());
                        if (!zzb2.equals(zzhw.zzd())) {
                            String obj = zzhw.zzc().toString();
                            String zzpx = zzhw.zzd().toString();
                            throw new GeneralSecurityException(C0016g.m31o(C16759e.m42352h("Mac Key with parameters ", obj, " has wrong output prefix (", zzpx, ") instead of ("), zzb2.toString(), ")"));
                        }
                    }
                }
            }
        }
        return new zzhz(zzbu, (zzhy) null);
    }
}
