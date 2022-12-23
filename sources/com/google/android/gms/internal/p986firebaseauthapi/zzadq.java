package com.google.android.gms.internal.p986firebaseauthapi;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadq */
final class zzadq implements zzady {
    private final zzadm zza;
    private final zzaep zzb;
    private final boolean zzc;
    private final zzabv zzd;

    private zzadq(zzaep zzaep, zzabv zzabv, zzadm zzadm) {
        this.zzb = zzaep;
        this.zzc = zzabv.zzh(zzadm);
        this.zzd = zzabv;
        this.zza = zzadm;
    }

    public static zzadq zzc(zzaep zzaep, zzabv zzabv, zzadm zzadm) {
        return new zzadq(zzaep, zzabv, zzadm);
    }

    public final int zza(Object obj) {
        zzaep zzaep = this.zzb;
        int zzb2 = zzaep.zzb(zzaep.zzd(obj));
        if (!this.zzc) {
            return zzb2;
        }
        this.zzd.zza(obj);
        throw null;
    }

    public final int zzb(Object obj) {
        int hashCode = this.zzb.zzd(obj).hashCode();
        if (!this.zzc) {
            return hashCode;
        }
        this.zzd.zza(obj);
        throw null;
    }

    public final Object zze() {
        return this.zza.zzA().zzm();
    }

    public final void zzf(Object obj) {
        this.zzb.zzm(obj);
        this.zzd.zze(obj);
    }

    public final void zzg(Object obj, Object obj2) {
        zzaea.zzF(this.zzb, obj, obj2);
        if (this.zzc) {
            zzaea.zzE(this.zzd, obj, obj2);
        }
    }

    public final void zzh(Object obj, zzadx zzadx, zzabu zzabu) throws IOException {
        boolean z;
        zzaep zzaep = this.zzb;
        zzabv zzabv = this.zzd;
        Object zzc2 = zzaep.zzc(obj);
        zzabz zzb2 = zzabv.zzb(obj);
        while (zzadx.zzc() != Integer.MAX_VALUE) {
            int zzd2 = zzadx.zzd();
            if (zzd2 != 11) {
                if ((zzd2 & 7) == 2) {
                    Object zzc3 = zzabv.zzc(zzabu, this.zza, zzd2 >>> 3);
                    if (zzc3 != null) {
                        zzabv.zzf(zzadx, zzc3, zzabu, zzb2);
                    } else {
                        z = zzaep.zzp(zzc2, zzadx);
                    }
                } else {
                    z = zzadx.zzO();
                }
                if (!z) {
                    zzaep.zzn(obj, zzc2);
                    return;
                }
            } else {
                int i = 0;
                Object obj2 = null;
                zzabe zzabe = null;
                while (true) {
                    try {
                        if (zzadx.zzc() == Integer.MAX_VALUE) {
                            break;
                        }
                        int zzd3 = zzadx.zzd();
                        if (zzd3 == 16) {
                            i = zzadx.zzj();
                            obj2 = zzabv.zzc(zzabu, this.zza, i);
                        } else if (zzd3 == 26) {
                            if (obj2 != null) {
                                zzabv.zzf(zzadx, obj2, zzabu, zzb2);
                            } else {
                                zzabe = zzadx.zzp();
                            }
                        } else if (!zzadx.zzO()) {
                            break;
                        }
                    } catch (Throwable th) {
                        zzaep.zzn(obj, zzc2);
                        throw th;
                    }
                }
                if (zzadx.zzd() != 12) {
                    throw zzacp.zzb();
                } else if (zzabe != null) {
                    if (obj2 != null) {
                        zzabv.zzg(zzabe, obj2, zzabu, zzb2);
                    } else {
                        zzaep.zzk(zzc2, i, zzabe);
                    }
                }
            }
        }
        zzaep.zzn(obj, zzc2);
    }

    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzaar zzaar) throws IOException {
        zzach zzach = (zzach) obj;
        if (zzach.zzc == zzaeq.zzc()) {
            zzach.zzc = zzaeq.zze();
        }
        zzace zzace = (zzace) obj;
        throw null;
    }

    public final boolean zzj(Object obj, Object obj2) {
        if (!this.zzb.zzd(obj).equals(this.zzb.zzd(obj2))) {
            return false;
        }
        if (!this.zzc) {
            return true;
        }
        this.zzd.zza(obj);
        this.zzd.zza(obj2);
        throw null;
    }

    public final boolean zzk(Object obj) {
        this.zzd.zza(obj);
        throw null;
    }

    public final void zzn(Object obj, zzabq zzabq) throws IOException {
        this.zzd.zza(obj);
        throw null;
    }
}
