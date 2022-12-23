package com.google.android.gms.internal.contextmanager;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

final class zznr<T> implements zznz<T> {
    private final zznn zza;
    private final zzon<?, ?> zzb;
    private final boolean zzc;
    private final zzlq<?> zzd;

    private zznr(zzon<?, ?> zzon, zzlq<?> zzlq, zznn zznn) {
        this.zzb = zzon;
        this.zzc = zzlq.zzf(zznn);
        this.zzd = zzlq;
        this.zza = zznn;
    }

    public static <T> zznr<T> zzc(zzon<?, ?> zzon, zzlq<?> zzlq, zznn zznn) {
        return new zznr<>(zzon, zzlq, zznn);
    }

    public final int zza(T t) {
        zzon<?, ?> zzon = this.zzb;
        int zzb2 = zzon.zzb(zzon.zzc(t));
        if (this.zzc) {
            return zzb2 + this.zzd.zzb(t).zzb();
        }
        return zzb2;
    }

    public final int zzb(T t) {
        int hashCode = this.zzb.zzc(t).hashCode();
        if (this.zzc) {
            return (hashCode * 53) + this.zzd.zzb(t).zza.hashCode();
        }
        return hashCode;
    }

    public final T zze() {
        return this.zza.zzJ().zzt();
    }

    public final void zzf(T t) {
        this.zzb.zzg(t);
        this.zzd.zze(t);
    }

    public final void zzg(T t, T t2) {
        zzob.zzF(this.zzb, t, t2);
        if (this.zzc) {
            zzob.zzE(this.zzd, t, t2);
        }
    }

    public final void zzh(T t, byte[] bArr, int i, int i2, zzkq zzkq) throws IOException {
        zzmf zzmf = (zzmf) t;
        zzoo zzoo = zzmf.zzc;
        if (zzoo == zzoo.zzc()) {
            zzoo = zzoo.zze();
            zzmf.zzc = zzoo;
        }
        zzlu<zzmc> zzc2 = ((zzmb) t).zzc();
        Object obj = null;
        while (i < i2) {
            int zzj = zzkr.zzj(bArr, i, zzkq);
            int i3 = zzkq.zza;
            if (i3 == 11) {
                int i4 = 0;
                zzld zzld = null;
                while (zzj < i2) {
                    zzj = zzkr.zzj(bArr, zzj, zzkq);
                    int i5 = zzkq.zza;
                    int i6 = i5 & 7;
                    int i7 = i5 >>> 3;
                    if (i7 != 2) {
                        if (i7 == 3) {
                            if (obj != null) {
                                zzmd zzmd = (zzmd) obj;
                                zzj = zzkr.zzd(zznw.zza().zzb(zzmd.zzc.getClass()), bArr, zzj, i2, zzkq);
                                zzc2.zzi(zzmd.zzd, zzkq.zzc);
                            } else if (i6 == 2) {
                                zzj = zzkr.zza(bArr, zzj, zzkq);
                                zzld = (zzld) zzkq.zzc;
                            }
                        }
                    } else if (i6 == 0) {
                        zzj = zzkr.zzj(bArr, zzj, zzkq);
                        i4 = zzkq.zza;
                        obj = this.zzd.zzd(zzkq.zzd, this.zza, i4);
                    }
                    if (i5 == 12) {
                        break;
                    }
                    zzj = zzkr.zzn(i5, bArr, zzj, i2, zzkq);
                }
                if (zzld != null) {
                    zzoo.zzh((i4 << 3) | 2, zzld);
                }
                i = zzj;
            } else if ((i3 & 7) == 2) {
                Object zzd2 = this.zzd.zzd(zzkq.zzd, this.zza, i3 >>> 3);
                if (zzd2 != null) {
                    zzmd zzmd2 = (zzmd) zzd2;
                    i = zzkr.zzd(zznw.zza().zzb(zzmd2.zzc.getClass()), bArr, zzj, i2, zzkq);
                    zzc2.zzi(zzmd2.zzd, zzkq.zzc);
                } else {
                    i = zzkr.zzi(i3, bArr, zzj, i2, zzoo, zzkq);
                }
                obj = zzd2;
            } else {
                i = zzkr.zzn(i3, bArr, zzj, i2, zzkq);
            }
        }
        if (i != i2) {
            throw zzmp.zze();
        }
    }

    public final boolean zzi(T t, T t2) {
        if (!this.zzb.zzc(t).equals(this.zzb.zzc(t2))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zzb(t).equals(this.zzd.zzb(t2));
        }
        return true;
    }

    public final boolean zzj(T t) {
        return this.zzd.zzb(t).zzk();
    }

    public final void zzm(T t, zzll zzll) throws IOException {
        Iterator<Map.Entry<?, Object>> zzf = this.zzd.zzb(t).zzf();
        while (zzf.hasNext()) {
            Map.Entry next = zzf.next();
            zzlt zzlt = (zzlt) next.getKey();
            if (zzlt.zze() == zzpe.MESSAGE) {
                zzlt.zzg();
                zzlt.zzf();
                if (next instanceof zzms) {
                    zzlt.zza();
                    zzll.zzw(106879161, ((zzms) next).zza().zzb());
                } else {
                    zzlt.zza();
                    zzll.zzw(106879161, next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        zzon<?, ?> zzon = this.zzb;
        zzon.zzi(zzon.zzc(t), zzll);
    }
}
