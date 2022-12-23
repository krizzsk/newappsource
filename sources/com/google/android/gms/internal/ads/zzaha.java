package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;

public final class zzaha implements zzahn {
    private final zzagz zza;
    private final zzdy zzb = new zzdy(32);
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzaha(zzagz zzagz) {
        this.zza = zzagz;
    }

    public final void zza(zzdy zzdy, int i) {
        int i2;
        boolean z;
        int i3 = i & 1;
        if (i3 != 0) {
            i2 = zzdy.zzc() + zzdy.zzk();
        } else {
            i2 = -1;
        }
        if (this.zzf) {
            if (i3 != 0) {
                this.zzf = false;
                zzdy.zzF(i2);
                this.zzd = 0;
            } else {
                return;
            }
        }
        while (zzdy.zza() > 0) {
            int i4 = this.zzd;
            if (i4 < 3) {
                if (i4 == 0) {
                    int zzk = zzdy.zzk();
                    zzdy.zzF(zzdy.zzc() - 1);
                    if (zzk == 255) {
                        this.zzf = true;
                        return;
                    }
                }
                int min = Math.min(zzdy.zza(), 3 - this.zzd);
                zzdy.zzB(this.zzb.zzH(), this.zzd, min);
                int i5 = this.zzd + min;
                this.zzd = i5;
                if (i5 == 3) {
                    this.zzb.zzF(0);
                    this.zzb.zzE(3);
                    this.zzb.zzG(1);
                    int zzk2 = this.zzb.zzk();
                    int zzk3 = this.zzb.zzk();
                    if ((zzk2 & RecyclerView.C1119a0.FLAG_IGNORE) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.zze = z;
                    this.zzc = (((zzk2 & 15) << 8) | zzk3) + 3;
                    int zzb2 = this.zzb.zzb();
                    int i6 = this.zzc;
                    if (zzb2 < i6) {
                        int zzb3 = this.zzb.zzb();
                        this.zzb.zzz(Math.min(4098, Math.max(i6, zzb3 + zzb3)));
                    }
                }
            } else {
                int min2 = Math.min(zzdy.zza(), this.zzc - i4);
                zzdy.zzB(this.zzb.zzH(), this.zzd, min2);
                int i7 = this.zzd + min2;
                this.zzd = i7;
                int i8 = this.zzc;
                if (i7 != i8) {
                    continue;
                } else {
                    if (!this.zze) {
                        this.zzb.zzE(i8);
                    } else if (zzeg.zzg(this.zzb.zzH(), 0, i8, -1) != 0) {
                        this.zzf = true;
                        return;
                    } else {
                        this.zzb.zzE(this.zzc - 4);
                    }
                    this.zzb.zzF(0);
                    this.zza.zza(this.zzb);
                    this.zzd = 0;
                }
            }
        }
    }

    public final void zzb(zzee zzee, zzyv zzyv, zzahm zzahm) {
        this.zza.zzb(zzee, zzyv, zzahm);
        this.zzf = true;
    }

    public final void zzc() {
        this.zzf = true;
    }
}
