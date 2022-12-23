package com.google.android.gms.internal.p986firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import p988j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbp */
public final class zzbp {
    private final Class zza;
    private ConcurrentMap zzb = new ConcurrentHashMap();
    private zzbq zzc;
    private zzie zzd;

    public /* synthetic */ zzbp(Class cls, zzbo zzbo) {
        this.zza = cls;
        this.zzd = zzie.zza;
    }

    private final zzbp zze(Object obj, zzng zzng, boolean z) throws GeneralSecurityException {
        byte[] bArr;
        if (this.zzb == null) {
            throw new IllegalStateException("addPrimitive cannot be called after build");
        } else if (zzng.zzk() == 3) {
            ConcurrentMap concurrentMap = this.zzb;
            Integer valueOf = Integer.valueOf(zzng.zza());
            if (zzng.zze() == zzoa.RAW) {
                valueOf = null;
            }
            zzaw zza2 = zzgm.zzb().zza(zzgv.zza(zzng.zzb().zzf(), zzng.zzb().zze(), zzng.zzb().zzb(), zzng.zze(), valueOf), zzca.zza());
            int ordinal = zzng.zze().ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        bArr = zzas.zza;
                    } else if (ordinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                }
                bArr = ByteBuffer.allocate(5).put((byte) 0).putInt(zzng.zza()).array();
            } else {
                bArr = ByteBuffer.allocate(5).put((byte) 1).putInt(zzng.zza()).array();
            }
            zzbq zzbq = new zzbq(obj, bArr, zzng.zzk(), zzng.zze(), zzng.zza(), zza2);
            ArrayList arrayList = new ArrayList();
            arrayList.add(zzbq);
            zzbs zzbs = new zzbs(zzbq.zzf(), (zzbr) null);
            List list = (List) concurrentMap.put(zzbs, Collections.unmodifiableList(arrayList));
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(list);
                arrayList2.add(zzbq);
                concurrentMap.put(zzbs, Collections.unmodifiableList(arrayList2));
            }
            if (z) {
                if (this.zzc == null) {
                    this.zzc = zzbq;
                } else {
                    throw new IllegalStateException("you cannot set two primary primitives");
                }
            }
            return this;
        } else {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
    }

    public final zzbp zza(Object obj, zzng zzng) throws GeneralSecurityException {
        zze(obj, zzng, true);
        return this;
    }

    public final zzbp zzb(Object obj, zzng zzng) throws GeneralSecurityException {
        zze(obj, zzng, false);
        return this;
    }

    public final zzbp zzc(zzie zzie) {
        if (this.zzb != null) {
            this.zzd = zzie;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build");
    }

    public final zzbu zzd() throws GeneralSecurityException {
        ConcurrentMap concurrentMap = this.zzb;
        if (concurrentMap != null) {
            zzbu zzbu = new zzbu(concurrentMap, this.zzc, this.zzd, this.zza, (zzbt) null);
            this.zzb = null;
            return zzbu;
        }
        throw new IllegalStateException("build cannot be called twice");
    }
}
