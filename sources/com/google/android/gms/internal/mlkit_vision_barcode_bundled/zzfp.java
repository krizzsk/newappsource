package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

final class zzfp implements zzgb {
    private final zzfl zza;
    private final zzgp zzb;
    private final boolean zzc;
    private final zzdo zzd;

    private zzfp(zzgp zzgp, zzdo zzdo, zzfl zzfl) {
        this.zzb = zzgp;
        this.zzc = zzdo.zzf(zzfl);
        this.zzd = zzdo;
        this.zza = zzfl;
    }

    public static zzfp zzc(zzgp zzgp, zzdo zzdo, zzfl zzfl) {
        return new zzfp(zzgp, zzdo, zzfl);
    }

    public final int zza(Object obj) {
        zzgp zzgp = this.zzb;
        int zzb2 = zzgp.zzb(zzgp.zzc(obj));
        if (this.zzc) {
            return zzb2 + this.zzd.zzb(obj).zzb();
        }
        return zzb2;
    }

    public final int zzb(Object obj) {
        int hashCode = this.zzb.zzc(obj).hashCode();
        if (this.zzc) {
            return (hashCode * 53) + this.zzd.zzb(obj).zza.hashCode();
        }
        return hashCode;
    }

    public final Object zze() {
        return this.zza.zzU().zzm();
    }

    public final void zzf(Object obj) {
        this.zzb.zzg(obj);
        this.zzd.zze(obj);
    }

    public final void zzg(Object obj, Object obj2) {
        zzgd.zzF(this.zzb, obj, obj2);
        if (this.zzc) {
            zzgd.zzE(this.zzd, obj, obj2);
        }
    }

    public final void zzh(Object obj, byte[] bArr, int i, int i2, zzco zzco) throws IOException {
        zzec zzec = (zzec) obj;
        zzgq zzgq = zzec.zzc;
        if (zzgq == zzgq.zzc()) {
            zzgq = zzgq.zze();
            zzec.zzc = zzgq;
        }
        zzds zzc2 = ((zzdy) obj).zzc();
        Object obj2 = null;
        while (i < i2) {
            int zzj = zzcp.zzj(bArr, i, zzco);
            int i3 = zzco.zza;
            if (i3 == 11) {
                int i4 = 0;
                zzdb zzdb = null;
                while (zzj < i2) {
                    zzj = zzcp.zzj(bArr, zzj, zzco);
                    int i5 = zzco.zza;
                    int i6 = i5 & 7;
                    int i7 = i5 >>> 3;
                    if (i7 != 2) {
                        if (i7 == 3) {
                            if (obj2 != null) {
                                zzea zzea = (zzea) obj2;
                                zzj = zzcp.zzd(zzfu.zza().zzb(zzea.zzc.getClass()), bArr, zzj, i2, zzco);
                                zzc2.zzi(zzea.zzd, zzco.zzc);
                            } else if (i6 == 2) {
                                zzj = zzcp.zza(bArr, zzj, zzco);
                                zzdb = (zzdb) zzco.zzc;
                            }
                        }
                    } else if (i6 == 0) {
                        zzj = zzcp.zzj(bArr, zzj, zzco);
                        i4 = zzco.zza;
                        obj2 = this.zzd.zzd(zzco.zzd, this.zza, i4);
                    }
                    if (i5 == 12) {
                        break;
                    }
                    zzj = zzcp.zzn(i5, bArr, zzj, i2, zzco);
                }
                if (zzdb != null) {
                    zzgq.zzh((i4 << 3) | 2, zzdb);
                }
                i = zzj;
            } else if ((i3 & 7) == 2) {
                Object zzd2 = this.zzd.zzd(zzco.zzd, this.zza, i3 >>> 3);
                if (zzd2 != null) {
                    zzea zzea2 = (zzea) zzd2;
                    i = zzcp.zzd(zzfu.zza().zzb(zzea2.zzc.getClass()), bArr, zzj, i2, zzco);
                    zzc2.zzi(zzea2.zzd, zzco.zzc);
                } else {
                    i = zzcp.zzi(i3, bArr, zzj, i2, zzgq, zzco);
                }
                obj2 = zzd2;
            } else {
                i = zzcp.zzn(i3, bArr, zzj, i2, zzco);
            }
        }
        if (i != i2) {
            throw zzen.zze();
        }
    }

    public final boolean zzi(Object obj, Object obj2) {
        if (!this.zzb.zzc(obj).equals(this.zzb.zzc(obj2))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zzb(obj).equals(this.zzd.zzb(obj2));
        }
        return true;
    }

    public final boolean zzj(Object obj) {
        return this.zzd.zzb(obj).zzk();
    }

    public final void zzm(Object obj, zzdj zzdj) throws IOException {
        Iterator zzf = this.zzd.zzb(obj).zzf();
        while (zzf.hasNext()) {
            Map.Entry entry = (Map.Entry) zzf.next();
            zzdr zzdr = (zzdr) entry.getKey();
            if (zzdr.zze() == zzhg.MESSAGE) {
                zzdr.zzg();
                zzdr.zzf();
                if (entry instanceof zzeq) {
                    zzdj.zzw(zzdr.zza(), ((zzeq) entry).zza().zzb());
                } else {
                    zzdj.zzw(zzdr.zza(), entry.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        zzgp zzgp = this.zzb;
        zzgp.zzi(zzgp.zzc(obj), zzdj);
    }
}
