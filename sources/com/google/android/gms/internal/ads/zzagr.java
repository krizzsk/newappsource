package com.google.android.gms.internal.ads;

public final class zzagr implements zzahn {
    private final zzaga zza;
    private final zzdx zzb = new zzdx(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzee zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzagr(zzaga zzaga) {
        this.zza = zzaga;
    }

    private final void zzd(int i) {
        this.zzc = i;
        this.zzd = 0;
    }

    private final boolean zze(zzdy zzdy, byte[] bArr, int i) {
        int min = Math.min(zzdy.zza(), i - this.zzd);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            zzdy.zzG(min);
        } else {
            zzdy.zzB(bArr, this.zzd, min);
        }
        int i2 = this.zzd + min;
        this.zzd = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    public final void zza(zzdy zzdy, int i) throws zzbp {
        long j;
        int i2;
        zzdy zzdy2 = zzdy;
        zzcw.zzb(this.zze);
        if ((i & 1) != 0) {
            int i3 = this.zzc;
            if (!(i3 == 0 || i3 == 1 || i3 == 2)) {
                this.zza.zzc();
            }
            zzd(1);
        }
        int i4 = i;
        while (zzdy.zza() > 0) {
            int i5 = this.zzc;
            if (i5 != 0) {
                int i6 = 0;
                if (i5 != 1) {
                    if (i5 != 2) {
                        int zza2 = zzdy.zza();
                        int i7 = this.zzj;
                        if (i7 != -1) {
                            i6 = zza2 - i7;
                        }
                        if (i6 > 0) {
                            zza2 -= i6;
                            zzdy2.zzE(zzdy.zzc() + zza2);
                        }
                        this.zza.zza(zzdy2);
                        int i8 = this.zzj;
                        if (i8 != -1) {
                            int i9 = i8 - zza2;
                            this.zzj = i9;
                            if (i9 == 0) {
                                this.zza.zzc();
                                zzd(1);
                            }
                        }
                    } else {
                        if (zze(zzdy2, this.zzb.zza, Math.min(10, this.zzi)) && zze(zzdy2, (byte[]) null, this.zzi)) {
                            this.zzb.zzh(0);
                            if (this.zzf) {
                                this.zzb.zzj(4);
                                int zzc2 = this.zzb.zzc(3);
                                this.zzb.zzj(1);
                                int zzc3 = this.zzb.zzc(15);
                                this.zzb.zzj(1);
                                long zzc4 = (((long) zzc2) << 30) | ((long) (zzc3 << 15)) | ((long) this.zzb.zzc(15));
                                this.zzb.zzj(1);
                                if (!this.zzh && this.zzg) {
                                    this.zzb.zzj(4);
                                    int zzc5 = this.zzb.zzc(3);
                                    this.zzb.zzj(1);
                                    int zzc6 = this.zzb.zzc(15);
                                    this.zzb.zzj(1);
                                    int zzc7 = this.zzb.zzc(15);
                                    this.zzb.zzj(1);
                                    this.zze.zzb((((long) zzc5) << 30) | ((long) (zzc6 << 15)) | ((long) zzc7));
                                    this.zzh = true;
                                }
                                j = this.zze.zzb(zzc4);
                            } else {
                                j = -9223372036854775807L;
                            }
                            if (true != this.zzk) {
                                i2 = 0;
                            } else {
                                i2 = 4;
                            }
                            i4 |= i2;
                            this.zza.zzd(j, i4);
                            zzd(3);
                        }
                    }
                } else if (zze(zzdy2, this.zzb.zza, 9)) {
                    int i11 = 0;
                    this.zzb.zzh(0);
                    if (this.zzb.zzc(24) != 1) {
                        this.zzj = -1;
                    } else {
                        this.zzb.zzj(8);
                        int zzc8 = this.zzb.zzc(16);
                        this.zzb.zzj(5);
                        this.zzk = this.zzb.zzl();
                        this.zzb.zzj(2);
                        this.zzf = this.zzb.zzl();
                        this.zzg = this.zzb.zzl();
                        this.zzb.zzj(6);
                        int zzc9 = this.zzb.zzc(8);
                        this.zzi = zzc9;
                        if (zzc8 == 0) {
                            this.zzj = -1;
                        } else {
                            int i12 = (zzc8 - 3) - zzc9;
                            this.zzj = i12;
                            if (i12 < 0) {
                                this.zzj = -1;
                            }
                        }
                        i11 = 2;
                    }
                    zzd(i11);
                }
            } else {
                zzdy2.zzG(zzdy.zza());
            }
        }
    }

    public final void zzb(zzee zzee, zzyv zzyv, zzahm zzahm) {
        this.zze = zzee;
        this.zza.zzb(zzyv, zzahm);
    }

    public final void zzc() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zze();
    }
}
