package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

public final class zzavi implements zzatv, zzauc {
    public static final zzatx zza = new zzavg();
    private static final int zzb = zzazn.zzg("qt  ");
    private final zzazg zzc = new zzazg(zzaze.zza);
    private final zzazg zzd = new zzazg(4);
    private final zzazg zze = new zzazg(16);
    private final Stack zzf = new Stack();
    private int zzg;
    private int zzh;
    private long zzi;
    private int zzj;
    private zzazg zzk;
    private int zzl;
    private int zzm;
    private zzatw zzn;
    private zzavh[] zzo;
    private long zzp;
    private boolean zzq;

    private final void zzh() {
        this.zzg = 0;
        this.zzj = 0;
    }

    private final void zzi(long j) throws zzarv {
        zzawd zzawd;
        zzawd zzawd2;
        zzatz zzatz;
        zzavk zza2;
        while (!this.zzf.isEmpty() && ((zzauq) this.zzf.peek()).zza == j) {
            zzauq zzauq = (zzauq) this.zzf.pop();
            if (zzauq.zzaR == zzaus.zzE) {
                ArrayList arrayList = new ArrayList();
                zzatz zzatz2 = new zzatz();
                zzaur zzb2 = zzauq.zzb(zzaus.zzaC);
                if (zzb2 != null) {
                    zzawd = zzauz.zzc(zzb2, this.zzq);
                    if (zzawd != null) {
                        zzatz2.zzb(zzawd);
                    }
                } else {
                    zzawd = null;
                }
                long j2 = -9223372036854775807L;
                long j3 = Long.MAX_VALUE;
                int i = 0;
                while (i < zzauq.zzc.size()) {
                    zzauq zzauq2 = (zzauq) zzauq.zzc.get(i);
                    if (zzauq2.zzaR == zzaus.zzG && (zza2 = zzauz.zza(zzauq2, zzauq.zzb(zzaus.zzF), -9223372036854775807L, (zzatr) null, this.zzq)) != null) {
                        zzavn zzb3 = zzauz.zzb(zza2, zzauq2.zza(zzaus.zzH).zza(zzaus.zzI).zza(zzaus.zzJ), zzatz2);
                        if (zzb3.zza != 0) {
                            zzavh zzavh = new zzavh(zza2, zzb3, this.zzn.zzbi(i, zza2.zzb));
                            zzars zze2 = zza2.zzf.zze(zzb3.zzd + 30);
                            if (zza2.zzb == 1) {
                                if (zzatz2.zza()) {
                                    zze2 = zze2.zzd(zzatz2.zzb, zzatz2.zzc);
                                }
                                if (zzawd != null) {
                                    zze2 = zze2.zzf(zzawd);
                                }
                            }
                            zzavh.zzc.zza(zze2);
                            zzatz = zzatz2;
                            zzawd2 = zzawd;
                            long max = Math.max(j2, zza2.zze);
                            arrayList.add(zzavh);
                            long j4 = zzb3.zzb[0];
                            if (j4 < j3) {
                                j2 = max;
                                j3 = j4;
                            } else {
                                j2 = max;
                            }
                            i++;
                            zzatz2 = zzatz;
                            zzawd = zzawd2;
                        }
                    }
                    zzatz = zzatz2;
                    zzawd2 = zzawd;
                    i++;
                    zzatz2 = zzatz;
                    zzawd = zzawd2;
                }
                this.zzp = j2;
                this.zzo = (zzavh[]) arrayList.toArray(new zzavh[arrayList.size()]);
                this.zzn.zzb();
                this.zzn.zzc(this);
                this.zzf.clear();
                this.zzg = 2;
            } else if (!this.zzf.isEmpty()) {
                ((zzauq) this.zzf.peek()).zzc(zzauq);
            }
        }
        if (this.zzg != 2) {
            zzh();
        }
    }

    public final long zza() {
        return this.zzp;
    }

    public final long zzb(long j) {
        long j2 = Long.MAX_VALUE;
        for (zzavh zzavh : this.zzo) {
            zzavn zzavn = zzavh.zzb;
            int zza2 = zzavn.zza(j);
            if (zza2 == -1) {
                zza2 = zzavn.zzb(j);
            }
            long j3 = zzavn.zzb[zza2];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    public final boolean zzc() {
        return true;
    }

    public final void zzd(zzatw zzatw) {
        this.zzn = zzatw;
    }

    public final void zze(long j, long j2) {
        this.zzf.clear();
        this.zzj = 0;
        this.zzl = 0;
        this.zzm = 0;
        if (j == 0) {
            zzh();
            return;
        }
        zzavh[] zzavhArr = this.zzo;
        if (zzavhArr != null) {
            for (zzavh zzavh : zzavhArr) {
                zzavn zzavn = zzavh.zzb;
                int zza2 = zzavn.zza(j2);
                if (zza2 == -1) {
                    zza2 = zzavn.zzb(j2);
                }
                zzavh.zzd = zza2;
            }
        }
    }

    public final int zzf(zzatu zzatu, zzaua zzaua) throws IOException, InterruptedException {
        boolean z;
        boolean z2;
        zzavh[] zzavhArr;
        boolean z3;
        boolean z4;
        zzatu zzatu2 = zzatu;
        zzaua zzaua2 = zzaua;
        while (true) {
            int i = this.zzg;
            if (i == 0) {
                if (this.zzj == 0) {
                    if (!zzatu2.zzh(this.zze.zza, 0, 8, true)) {
                        return -1;
                    }
                    this.zzj = 8;
                    this.zze.zzv(0);
                    this.zzi = this.zze.zzm();
                    this.zzh = this.zze.zze();
                }
                if (this.zzi == 1) {
                    zzatu2.zzh(this.zze.zza, 8, 8, false);
                    this.zzj += 8;
                    this.zzi = this.zze.zzn();
                }
                int i2 = this.zzh;
                if (i2 == zzaus.zzE || i2 == zzaus.zzG || i2 == zzaus.zzH || i2 == zzaus.zzI || i2 == zzaus.zzJ || i2 == zzaus.zzS) {
                    long zzd2 = (zzatu.zzd() + this.zzi) - ((long) this.zzj);
                    this.zzf.add(new zzauq(this.zzh, zzd2));
                    if (this.zzi == ((long) this.zzj)) {
                        zzi(zzd2);
                    } else {
                        zzh();
                    }
                } else {
                    if (i2 == zzaus.zzU || i2 == zzaus.zzF || i2 == zzaus.zzV || i2 == zzaus.zzW || i2 == zzaus.zzao || i2 == zzaus.zzap || i2 == zzaus.zzaq || i2 == zzaus.zzT || i2 == zzaus.zzar || i2 == zzaus.zzas || i2 == zzaus.zzat || i2 == zzaus.zzau || i2 == zzaus.zzav || i2 == zzaus.zzR || i2 == zzaus.zzd || i2 == zzaus.zzaC) {
                        if (this.zzj == 8) {
                            z = true;
                        } else {
                            z = false;
                        }
                        zzayy.zze(z);
                        if (this.zzi <= 2147483647L) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zzayy.zze(z2);
                        zzazg zzazg = new zzazg((int) this.zzi);
                        this.zzk = zzazg;
                        System.arraycopy(this.zze.zza, 0, zzazg.zza, 0, 8);
                    } else {
                        this.zzk = null;
                    }
                    this.zzg = 1;
                }
            } else if (i != 1) {
                long j = Long.MAX_VALUE;
                int i3 = 0;
                int i4 = -1;
                while (true) {
                    zzavhArr = this.zzo;
                    if (i3 >= zzavhArr.length) {
                        break;
                    }
                    zzavh zzavh = zzavhArr[i3];
                    int i5 = zzavh.zzd;
                    zzavn zzavn = zzavh.zzb;
                    if (i5 != zzavn.zza) {
                        long j2 = zzavn.zzb[i5];
                        if (j2 < j) {
                            i4 = i3;
                            j = j2;
                        }
                    }
                    i3++;
                }
                if (i4 == -1) {
                    return -1;
                }
                zzavh zzavh2 = zzavhArr[i4];
                zzaue zzaue = zzavh2.zzc;
                int i6 = zzavh2.zzd;
                zzavn zzavn2 = zzavh2.zzb;
                long j3 = zzavn2.zzb[i6];
                int i7 = zzavn2.zzc[i6];
                if (zzavh2.zza.zzg == 1) {
                    j3 += 8;
                    i7 -= 8;
                }
                long zzd3 = (j3 - zzatu.zzd()) + ((long) this.zzl);
                if (zzd3 < 0 || zzd3 >= 262144) {
                    zzaua2.zza = j3;
                    return 1;
                }
                int i8 = (int) zzd3;
                boolean z5 = false;
                zzatu2.zzi(i8, false);
                int i9 = zzavh2.zza.zzk;
                if (i9 == 0) {
                    while (true) {
                        int i11 = this.zzl;
                        if (i11 >= i7) {
                            break;
                        }
                        int zzd4 = zzaue.zzd(zzatu2, i7 - i11, false);
                        this.zzl += zzd4;
                        this.zzm -= zzd4;
                    }
                } else {
                    byte[] bArr = this.zzd.zza;
                    bArr[0] = 0;
                    bArr[1] = 0;
                    bArr[2] = 0;
                    int i12 = 4 - i9;
                    while (this.zzl < i7) {
                        int i13 = this.zzm;
                        if (i13 == 0) {
                            zzatu2.zzh(this.zzd.zza, i12, i9, z5);
                            this.zzd.zzv(z5 ? 1 : 0);
                            this.zzm = this.zzd.zzi();
                            this.zzc.zzv(z5);
                            zzaue.zzb(this.zzc, 4);
                            this.zzl += 4;
                            i7 += i12;
                        } else {
                            int zzd5 = zzaue.zzd(zzatu2, i13, z5);
                            this.zzl += zzd5;
                            this.zzm -= zzd5;
                            z5 = false;
                        }
                    }
                }
                int i14 = i7;
                zzavn zzavn3 = zzavh2.zzb;
                zzaue.zzc(zzavn3.zze[i6], zzavn3.zzf[i6], i14, 0, (zzaud) null);
                zzavh2.zzd++;
                this.zzl = 0;
                this.zzm = 0;
                return 0;
            } else {
                long j4 = this.zzi;
                int i15 = this.zzj;
                long j5 = j4 - ((long) i15);
                long zzd6 = zzatu.zzd() + j5;
                zzazg zzazg2 = this.zzk;
                if (zzazg2 != null) {
                    zzatu2.zzh(zzazg2.zza, i15, (int) j5, false);
                    if (this.zzh == zzaus.zzd) {
                        zzazg zzazg3 = this.zzk;
                        zzazg3.zzv(8);
                        if (zzazg3.zze() == zzb) {
                            z4 = true;
                        } else {
                            zzazg3.zzw(4);
                            while (true) {
                                if (zzazg3.zza() > 0) {
                                    if (zzazg3.zze() == zzb) {
                                        break;
                                    }
                                } else {
                                    z4 = false;
                                    break;
                                }
                            }
                            z4 = true;
                        }
                        this.zzq = z4;
                    } else if (!this.zzf.isEmpty()) {
                        ((zzauq) this.zzf.peek()).zzd(new zzaur(this.zzh, this.zzk));
                    }
                } else if (j5 < 262144) {
                    zzatu2.zzi((int) j5, false);
                } else {
                    zzaua2.zza = zzatu.zzd() + j5;
                    z3 = true;
                    zzi(zzd6);
                    if (z3 && this.zzg != 2) {
                        return 1;
                    }
                }
                z3 = false;
                zzi(zzd6);
                return 1;
            }
        }
    }

    public final boolean zzg(zzatu zzatu) throws IOException, InterruptedException {
        return zzavj.zzb(zzatu);
    }
}
