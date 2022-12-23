package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

final class zzwo<T> implements zzwx<T> {
    private final zzwk zza;
    private final zzxo<?, ?> zzb;
    private final boolean zzc;
    private final zzuk<?> zzd;

    private zzwo(zzxo<?, ?> zzxo, zzuk<?> zzuk, zzwk zzwk) {
        this.zzb = zzxo;
        this.zzc = zzuk.zzi(zzwk);
        this.zzd = zzuk;
        this.zza = zzwk;
    }

    public static <T> zzwo<T> zzc(zzxo<?, ?> zzxo, zzuk<?> zzuk, zzwk zzwk) {
        return new zzwo<>(zzxo, zzuk, zzwk);
    }

    public final int zza(T t) {
        zzxo<?, ?> zzxo = this.zzb;
        int zzb2 = zzxo.zzb(zzxo.zzd(t));
        if (this.zzc) {
            return zzb2 + this.zzd.zzb(t).zzb();
        }
        return zzb2;
    }

    public final int zzb(T t) {
        int hashCode = this.zzb.zzd(t).hashCode();
        if (this.zzc) {
            return (hashCode * 53) + this.zzd.zzb(t).zza.hashCode();
        }
        return hashCode;
    }

    public final T zze() {
        return this.zza.zzao().zzD();
    }

    public final void zzf(T t) {
        this.zzb.zzm(t);
        this.zzd.zzf(t);
    }

    public final void zzg(T t, T t2) {
        zzwz.zzF(this.zzb, t, t2);
        if (this.zzc) {
            zzwz.zzE(this.zzd, t, t2);
        }
    }

    public final void zzh(T t, zzww zzww, zzuj zzuj) throws IOException {
        boolean z;
        zzxo<?, ?> zzxo = this.zzb;
        zzuk<?> zzuk = this.zzd;
        Object zzc2 = zzxo.zzc(t);
        zzuo<?> zzc3 = zzuk.zzc(t);
        while (zzww.zzc() != Integer.MAX_VALUE) {
            int zzd2 = zzww.zzd();
            if (zzd2 != 11) {
                if ((zzd2 & 7) == 2) {
                    Object zzd3 = zzuk.zzd(zzuj, this.zza, zzd2 >>> 3);
                    if (zzd3 != null) {
                        zzuk.zzg(zzww, zzd3, zzuj, zzc3);
                    } else {
                        z = zzxo.zzp(zzc2, zzww);
                    }
                } else {
                    z = zzww.zzT();
                }
                if (!z) {
                    zzxo.zzn(t, zzc2);
                    return;
                }
            } else {
                int i = 0;
                Object obj = null;
                zztd zztd = null;
                while (true) {
                    try {
                        if (zzww.zzc() == Integer.MAX_VALUE) {
                            break;
                        }
                        int zzd4 = zzww.zzd();
                        if (zzd4 == 16) {
                            i = zzww.zzj();
                            obj = zzuk.zzd(zzuj, this.zza, i);
                        } else if (zzd4 == 26) {
                            if (obj != null) {
                                zzuk.zzg(zzww, obj, zzuj, zzc3);
                            } else {
                                zztd = zzww.zzq();
                            }
                        } else if (!zzww.zzT()) {
                            break;
                        }
                    } catch (Throwable th) {
                        zzxo.zzn(t, zzc2);
                        throw th;
                    }
                }
                if (zzww.zzd() != 12) {
                    throw zzvk.zzb();
                } else if (zztd != null) {
                    if (obj != null) {
                        zzuk.zzh(zztd, obj, zzuj, zzc3);
                    } else {
                        zzxo.zzk(zzc2, i, zztd);
                    }
                }
            }
        }
        zzxo.zzn(t, zzc2);
    }

    public final void zzi(T t, byte[] bArr, int i, int i2, zzsl zzsl) throws IOException {
        zzuz zzuz = (zzuz) t;
        zzxp zzxp = zzuz.zzc;
        if (zzxp == zzxp.zzc()) {
            zzxp = zzxp.zze();
            zzuz.zzc = zzxp;
        }
        zzuo<zzuw> zzU = ((zzuv) t).zzU();
        Object obj = null;
        while (i < i2) {
            int zzj = zzsm.zzj(bArr, i, zzsl);
            int i3 = zzsl.zza;
            if (i3 == 11) {
                int i4 = 0;
                zztd zztd = null;
                while (zzj < i2) {
                    zzj = zzsm.zzj(bArr, zzj, zzsl);
                    int i5 = zzsl.zza;
                    int i6 = i5 & 7;
                    int i7 = i5 >>> 3;
                    if (i7 != 2) {
                        if (i7 == 3) {
                            if (obj != null) {
                                zzux zzux = (zzux) obj;
                                zzj = zzsm.zzd(zzwt.zza().zzb(zzux.zzc.getClass()), bArr, zzj, i2, zzsl);
                                zzU.zzi(zzux.zzd, zzsl.zzc);
                            } else if (i6 == 2) {
                                zzj = zzsm.zza(bArr, zzj, zzsl);
                                zztd = (zztd) zzsl.zzc;
                            }
                        }
                    } else if (i6 == 0) {
                        zzj = zzsm.zzj(bArr, zzj, zzsl);
                        i4 = zzsl.zza;
                        obj = this.zzd.zzd(zzsl.zzd, this.zza, i4);
                    }
                    if (i5 == 12) {
                        break;
                    }
                    zzj = zzsm.zzn(i5, bArr, zzj, i2, zzsl);
                }
                if (zztd != null) {
                    zzxp.zzh((i4 << 3) | 2, zztd);
                }
                i = zzj;
            } else if ((i3 & 7) == 2) {
                Object zzd2 = this.zzd.zzd(zzsl.zzd, this.zza, i3 >>> 3);
                if (zzd2 != null) {
                    zzux zzux2 = (zzux) zzd2;
                    i = zzsm.zzd(zzwt.zza().zzb(zzux2.zzc.getClass()), bArr, zzj, i2, zzsl);
                    zzU.zzi(zzux2.zzd, zzsl.zzc);
                } else {
                    i = zzsm.zzi(i3, bArr, zzj, i2, zzxp, zzsl);
                }
                obj = zzd2;
            } else {
                i = zzsm.zzn(i3, bArr, zzj, i2, zzsl);
            }
        }
        if (i != i2) {
            throw zzvk.zzg();
        }
    }

    public final boolean zzj(T t, T t2) {
        if (!this.zzb.zzd(t).equals(this.zzb.zzd(t2))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zzb(t).equals(this.zzd.zzb(t2));
        }
        return true;
    }

    public final boolean zzk(T t) {
        return this.zzd.zzb(t).zzk();
    }

    public final void zzn(T t, zztp zztp) throws IOException {
        Iterator<Map.Entry<?, Object>> zzf = this.zzd.zzb(t).zzf();
        while (zzf.hasNext()) {
            Map.Entry next = zzf.next();
            zzun zzun = (zzun) next.getKey();
            if (zzun.zze() == zzyf.MESSAGE) {
                zzun.zzg();
                zzun.zzf();
                if (next instanceof zzvn) {
                    zztp.zzw(zzun.zza(), ((zzvn) next).zza().zzb());
                } else {
                    zztp.zzw(zzun.zza(), next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        zzxo<?, ?> zzxo = this.zzb;
        zzxo.zzr(zzxo.zzd(t), zztp);
    }
}
