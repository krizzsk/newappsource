package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import p988j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbd */
final class zzbd {
    private static final Logger zza = Logger.getLogger(zzbd.class.getName());
    private final ConcurrentMap zzb;

    public zzbd() {
        this.zzb = new ConcurrentHashMap();
    }

    private final zzax zzg(String str, Class cls) throws GeneralSecurityException {
        zzbc zzh = zzh(str);
        if (cls == null) {
            return zzh.zzb();
        }
        if (zzh.zze().contains(cls)) {
            return zzh.zza(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(zzh.zzc());
        Set<Class> zze = zzh.zze();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class cls2 : zze) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        String sb2 = sb.toString();
        StringBuilder h = C16759e.m42352h("Primitive type ", name, " not supported by key manager of type ", valueOf, ", supported primitives: ");
        h.append(sb2);
        throw new GeneralSecurityException(h.toString());
    }

    private final synchronized zzbc zzh(String str) throws GeneralSecurityException {
        if (this.zzb.containsKey(str)) {
        } else {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (zzbc) this.zzb.get(str);
    }

    private final synchronized void zzi(zzbc zzbc, boolean z) throws GeneralSecurityException {
        String zze = zzbc.zzb().zze();
        zzbc zzbc2 = (zzbc) this.zzb.get(zze);
        if (zzbc2 != null) {
            if (!zzbc2.zzc().equals(zzbc.zzc())) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type ".concat(zze));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{zze, zzbc2.zzc().getName(), zzbc.zzc().getName()}));
            }
        }
        if (!z) {
            this.zzb.putIfAbsent(zze, zzbc);
        } else {
            this.zzb.put(zze, zzbc);
        }
    }

    @Deprecated
    public final zzax zza(String str) throws GeneralSecurityException {
        return zzg(str, (Class) null);
    }

    public final zzax zzb(String str, Class cls) throws GeneralSecurityException {
        return zzg(str, cls);
    }

    public final zzax zzc(String str) throws GeneralSecurityException {
        return zzh(str).zzb();
    }

    public final synchronized void zzd(zzgu zzgu, zzgb zzgb) throws GeneralSecurityException {
        Class zzd;
        int zzf = zzgb.zzf();
        if (!zzdv.zza(1)) {
            String valueOf = String.valueOf(zzgu.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
        } else if (zzdv.zza(zzf)) {
            String zzd2 = zzgu.zzd();
            String zzd3 = zzgb.zzd();
            if (!(!this.zzb.containsKey(zzd2) || ((zzbc) this.zzb.get(zzd2)).zzd() == null || (zzd = ((zzbc) this.zzb.get(zzd2)).zzd()) == null)) {
                if (!zzd.getName().equals(zzgb.getClass().getName())) {
                    Logger logger = zza;
                    Level level = Level.WARNING;
                    logger.logp(level, "com.google.crypto.tink.KeyManagerRegistry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type " + zzd2 + " with inconsistent public key type " + zzd3);
                    throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", new Object[]{zzgu.getClass().getName(), zzd.getName(), zzgb.getClass().getName()}));
                }
            }
            zzi(new zzbb(zzgu, zzgb), true);
            zzi(new zzba(zzgb), false);
        } else {
            String valueOf2 = String.valueOf(zzgb.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf2 + " as it is not FIPS compatible.");
        }
    }

    public final synchronized void zze(zzgb zzgb) throws GeneralSecurityException {
        if (zzdv.zza(zzgb.zzf())) {
            zzi(new zzba(zzgb), false);
        } else {
            String valueOf = String.valueOf(zzgb.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
        }
    }

    public final boolean zzf(String str) {
        return this.zzb.containsKey(str);
    }

    public zzbd(zzbd zzbd) {
        this.zzb = new ConcurrentHashMap(zzbd.zzb);
    }
}
