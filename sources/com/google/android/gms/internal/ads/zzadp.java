package com.google.android.gms.internal.ads;

import com.moovit.database.sqlite.SQLiteDatabase;
import java.io.EOFException;
import java.io.IOException;

public final class zzadp implements zzys {
    public static final zzyz zza = zzadn.zza;
    private static final zzabz zzb = zzado.zza;
    private final zzdy zzc;
    private final zzzl zzd;
    private final zzzh zze;
    private final zzzj zzf;
    private final zzzz zzg;
    private zzyv zzh;
    private zzzz zzi;
    private zzzz zzj;
    private int zzk;
    private zzbl zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private zzadr zzq;
    private boolean zzr;

    public zzadp() {
        this(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0087 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0163  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzf(com.google.android.gms.internal.ads.zzyt r17) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r0.zzk
            r3 = -1
            r4 = 0
            if (r2 != 0) goto L_0x000f
            r0.zzk(r1, r4)     // Catch:{ EOFException -> 0x000e }
            goto L_0x000f
        L_0x000e:
            return r3
        L_0x000f:
            com.google.android.gms.internal.ads.zzadr r2 = r0.zzq
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = 1
            if (r2 != 0) goto L_0x01bd
            com.google.android.gms.internal.ads.zzdy r14 = new com.google.android.gms.internal.ads.zzdy
            com.google.android.gms.internal.ads.zzzl r2 = r0.zzd
            int r2 = r2.zzc
            r14.<init>((int) r2)
            byte[] r2 = r14.zzH()
            com.google.android.gms.internal.ads.zzzl r9 = r0.zzd
            int r9 = r9.zzc
            r10 = r1
            com.google.android.gms.internal.ads.zzym r10 = (com.google.android.gms.internal.ads.zzym) r10
            r10.zzm(r2, r4, r9, r4)
            com.google.android.gms.internal.ads.zzzl r2 = r0.zzd
            int r9 = r2.zza
            r9 = r9 & r8
            r10 = 36
            r11 = 21
            if (r9 == 0) goto L_0x0042
            int r2 = r2.zze
            if (r2 == r8) goto L_0x0046
            r2 = 36
            goto L_0x004d
        L_0x0042:
            int r2 = r2.zze
            if (r2 == r8) goto L_0x0049
        L_0x0046:
            r2 = 21
            goto L_0x004d
        L_0x0049:
            r11 = 13
            r2 = 13
        L_0x004d:
            int r9 = r14.zzd()
            int r11 = r2 + 4
            r12 = 1483304551(0x58696e67, float:1.02664153E15)
            r13 = 1447187017(0x56425249, float:5.3414667E13)
            r15 = 1231971951(0x496e666f, float:976486.94)
            if (r9 < r11) goto L_0x006f
            r14.zzF(r2)
            int r9 = r14.zze()
            if (r9 == r12) goto L_0x006d
            if (r9 != r15) goto L_0x006f
            r11 = 1231971951(0x496e666f, float:976486.94)
            goto L_0x0085
        L_0x006d:
            r11 = r9
            goto L_0x0085
        L_0x006f:
            int r9 = r14.zzd()
            r11 = 40
            if (r9 < r11) goto L_0x0084
            r14.zzF(r10)
            int r9 = r14.zze()
            if (r9 != r13) goto L_0x0084
            r11 = 1447187017(0x56425249, float:5.3414667E13)
            goto L_0x0085
        L_0x0084:
            r11 = 0
        L_0x0085:
            if (r11 == r12) goto L_0x00aa
            if (r11 != r15) goto L_0x008a
            goto L_0x00aa
        L_0x008a:
            if (r11 != r13) goto L_0x00a5
            long r9 = r17.zzd()
            long r11 = r17.zzf()
            com.google.android.gms.internal.ads.zzzl r13 = r0.zzd
            com.google.android.gms.internal.ads.zzads r2 = com.google.android.gms.internal.ads.zzads.zza(r9, r11, r13, r14)
            com.google.android.gms.internal.ads.zzzl r9 = r0.zzd
            int r9 = r9.zzc
            r10 = r1
            com.google.android.gms.internal.ads.zzym r10 = (com.google.android.gms.internal.ads.zzym) r10
            r10.zzo(r9, r4)
            goto L_0x010d
        L_0x00a5:
            r17.zzj()
            r2 = 0
            goto L_0x010d
        L_0x00aa:
            long r9 = r17.zzd()
            long r12 = r17.zzf()
            com.google.android.gms.internal.ads.zzzl r8 = r0.zzd
            r7 = r11
            r11 = r12
            r13 = r8
            com.google.android.gms.internal.ads.zzadt r8 = com.google.android.gms.internal.ads.zzadt.zza(r9, r11, r13, r14)
            if (r8 == 0) goto L_0x00f3
            com.google.android.gms.internal.ads.zzzh r9 = r0.zze
            boolean r9 = r9.zza()
            if (r9 != 0) goto L_0x00f3
            r17.zzj()
            r9 = r1
            com.google.android.gms.internal.ads.zzym r9 = (com.google.android.gms.internal.ads.zzym) r9
            int r2 = r2 + 141
            r9.zzl(r2, r4)
            com.google.android.gms.internal.ads.zzdy r2 = r0.zzc
            byte[] r2 = r2.zzH()
            r10 = 3
            r9.zzm(r2, r4, r10, r4)
            com.google.android.gms.internal.ads.zzdy r2 = r0.zzc
            r2.zzF(r4)
            com.google.android.gms.internal.ads.zzzh r2 = r0.zze
            com.google.android.gms.internal.ads.zzdy r9 = r0.zzc
            int r9 = r9.zzm()
            int r10 = r9 >> 12
            r9 = r9 & 4095(0xfff, float:5.738E-42)
            if (r10 > 0) goto L_0x00ef
            if (r9 <= 0) goto L_0x00f3
        L_0x00ef:
            r2.zza = r10
            r2.zzb = r9
        L_0x00f3:
            com.google.android.gms.internal.ads.zzzl r2 = r0.zzd
            int r2 = r2.zzc
            r9 = r1
            com.google.android.gms.internal.ads.zzym r9 = (com.google.android.gms.internal.ads.zzym) r9
            r9.zzo(r2, r4)
            if (r8 == 0) goto L_0x010c
            boolean r2 = r8.zzh()
            if (r2 != 0) goto L_0x010c
            if (r7 != r15) goto L_0x010c
            com.google.android.gms.internal.ads.zzadr r2 = r0.zzh(r1, r4)
            goto L_0x010d
        L_0x010c:
            r2 = r8
        L_0x010d:
            com.google.android.gms.internal.ads.zzbl r7 = r0.zzl
            long r8 = r17.zzf()
            if (r7 == 0) goto L_0x0158
            int r10 = r7.zza()
            r11 = 0
        L_0x011a:
            if (r11 >= r10) goto L_0x0158
            com.google.android.gms.internal.ads.zzbk r12 = r7.zzb(r11)
            boolean r13 = r12 instanceof com.google.android.gms.internal.ads.zzacg
            if (r13 == 0) goto L_0x0155
            com.google.android.gms.internal.ads.zzacg r12 = (com.google.android.gms.internal.ads.zzacg) r12
            int r10 = r7.zza()
            r11 = 0
        L_0x012b:
            if (r11 >= r10) goto L_0x014f
            com.google.android.gms.internal.ads.zzbk r13 = r7.zzb(r11)
            boolean r14 = r13 instanceof com.google.android.gms.internal.ads.zzack
            if (r14 == 0) goto L_0x014c
            com.google.android.gms.internal.ads.zzack r13 = (com.google.android.gms.internal.ads.zzack) r13
            java.lang.String r14 = r13.zzf
            java.lang.String r15 = "TLEN"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x014c
            java.lang.String r7 = r13.zzb
            long r10 = java.lang.Long.parseLong(r7)
            long r10 = com.google.android.gms.internal.ads.zzeg.zzv(r10)
            goto L_0x0150
        L_0x014c:
            int r11 = r11 + 1
            goto L_0x012b
        L_0x014f:
            r10 = r5
        L_0x0150:
            com.google.android.gms.internal.ads.zzadm r7 = com.google.android.gms.internal.ads.zzadm.zza(r8, r12, r10)
            goto L_0x0159
        L_0x0155:
            int r11 = r11 + 1
            goto L_0x011a
        L_0x0158:
            r7 = 0
        L_0x0159:
            boolean r8 = r0.zzr
            if (r8 == 0) goto L_0x0163
            com.google.android.gms.internal.ads.zzadq r2 = new com.google.android.gms.internal.ads.zzadq
            r2.<init>()
            goto L_0x0174
        L_0x0163:
            if (r7 == 0) goto L_0x0167
            r2 = r7
            goto L_0x016a
        L_0x0167:
            if (r2 != 0) goto L_0x016a
            r2 = 0
        L_0x016a:
            if (r2 == 0) goto L_0x0170
            r2.zzh()
            goto L_0x0174
        L_0x0170:
            com.google.android.gms.internal.ads.zzadr r2 = r0.zzh(r1, r4)
        L_0x0174:
            r0.zzq = r2
            com.google.android.gms.internal.ads.zzyv r7 = r0.zzh
            r7.zzL(r2)
            com.google.android.gms.internal.ads.zzzz r2 = r0.zzj
            com.google.android.gms.internal.ads.zzab r7 = new com.google.android.gms.internal.ads.zzab
            r7.<init>()
            com.google.android.gms.internal.ads.zzzl r8 = r0.zzd
            java.lang.String r8 = r8.zzb
            r7.zzS(r8)
            r8 = 4096(0x1000, float:5.74E-42)
            r7.zzL(r8)
            com.google.android.gms.internal.ads.zzzl r8 = r0.zzd
            int r8 = r8.zze
            r7.zzw(r8)
            com.google.android.gms.internal.ads.zzzl r8 = r0.zzd
            int r8 = r8.zzd
            r7.zzT(r8)
            com.google.android.gms.internal.ads.zzzh r8 = r0.zze
            int r8 = r8.zza
            r7.zzC(r8)
            com.google.android.gms.internal.ads.zzzh r8 = r0.zze
            int r8 = r8.zzb
            r7.zzD(r8)
            com.google.android.gms.internal.ads.zzbl r8 = r0.zzl
            r7.zzM(r8)
            com.google.android.gms.internal.ads.zzad r7 = r7.zzY()
            r2.zzk(r7)
            long r7 = r17.zzf()
            r0.zzo = r7
            goto L_0x01d5
        L_0x01bd:
            long r7 = r0.zzo
            r9 = 0
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 == 0) goto L_0x01d5
            long r9 = r17.zzf()
            int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x01d5
            r2 = r1
            com.google.android.gms.internal.ads.zzym r2 = (com.google.android.gms.internal.ads.zzym) r2
            long r7 = r7 - r9
            int r8 = (int) r7
            r2.zzo(r8, r4)
        L_0x01d5:
            int r2 = r0.zzp
            if (r2 != 0) goto L_0x0239
            r17.zzj()
            boolean r2 = r16.zzj(r17)
            if (r2 == 0) goto L_0x01e3
            goto L_0x024b
        L_0x01e3:
            com.google.android.gms.internal.ads.zzdy r2 = r0.zzc
            r2.zzF(r4)
            com.google.android.gms.internal.ads.zzdy r2 = r0.zzc
            int r2 = r2.zze()
            int r7 = r0.zzk
            long r7 = (long) r7
            boolean r7 = zzi(r2, r7)
            if (r7 == 0) goto L_0x0230
            int r7 = com.google.android.gms.internal.ads.zzzm.zzb(r2)
            if (r7 != r3) goto L_0x01fe
            goto L_0x0230
        L_0x01fe:
            com.google.android.gms.internal.ads.zzzl r7 = r0.zzd
            r7.zza(r2)
            long r7 = r0.zzm
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0215
            com.google.android.gms.internal.ads.zzadr r2 = r0.zzq
            long r5 = r17.zzf()
            long r5 = r2.zzc(r5)
            r0.zzm = r5
        L_0x0215:
            com.google.android.gms.internal.ads.zzzl r2 = r0.zzd
            int r5 = r2.zzc
            r0.zzp = r5
            com.google.android.gms.internal.ads.zzadr r6 = r0.zzq
            boolean r7 = r6 instanceof com.google.android.gms.internal.ads.zzadl
            if (r7 != 0) goto L_0x0223
            r2 = r5
            goto L_0x0239
        L_0x0223:
            com.google.android.gms.internal.ads.zzadl r6 = (com.google.android.gms.internal.ads.zzadl) r6
            long r3 = r0.zzn
            int r1 = r2.zzg
            long r1 = (long) r1
            long r3 = r3 + r1
            r0.zzg(r3)
            r1 = 0
            throw r1
        L_0x0230:
            com.google.android.gms.internal.ads.zzym r1 = (com.google.android.gms.internal.ads.zzym) r1
            r5 = 1
            r1.zzo(r5, r4)
            r0.zzk = r4
            goto L_0x024a
        L_0x0239:
            r5 = 1
            com.google.android.gms.internal.ads.zzzz r6 = r0.zzj
            int r1 = r6.zze(r1, r2, r5)
            if (r1 != r3) goto L_0x0243
            goto L_0x024b
        L_0x0243:
            int r2 = r0.zzp
            int r2 = r2 - r1
            r0.zzp = r2
            if (r2 <= 0) goto L_0x024c
        L_0x024a:
            r3 = 0
        L_0x024b:
            return r3
        L_0x024c:
            com.google.android.gms.internal.ads.zzzz r5 = r0.zzj
            long r1 = r0.zzn
            long r6 = r0.zzg(r1)
            r8 = 1
            com.google.android.gms.internal.ads.zzzl r1 = r0.zzd
            int r9 = r1.zzc
            r10 = 0
            r11 = 0
            r5.zzs(r6, r8, r9, r10, r11)
            long r1 = r0.zzn
            com.google.android.gms.internal.ads.zzzl r3 = r0.zzd
            int r3 = r3.zzg
            long r5 = (long) r3
            long r1 = r1 + r5
            r0.zzn = r1
            r0.zzp = r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadp.zzf(com.google.android.gms.internal.ads.zzyt):int");
    }

    private final long zzg(long j) {
        return ((j * 1000000) / ((long) this.zzd.zzd)) + this.zzm;
    }

    private final zzadr zzh(zzyt zzyt, boolean z) throws IOException {
        ((zzym) zzyt).zzm(this.zzc.zzH(), 0, 4, false);
        this.zzc.zzF(0);
        this.zzd.zza(this.zzc.zze());
        return new zzadk(zzyt.zzd(), zzyt.zzf(), this.zzd, false);
    }

    private static boolean zzi(int i, long j) {
        return ((long) (i & -128000)) == (j & -128000);
    }

    private final boolean zzj(zzyt zzyt) throws IOException {
        zzadr zzadr = this.zzq;
        if (zzadr != null) {
            long zzb2 = zzadr.zzb();
            if (zzb2 != -1 && zzyt.zze() > zzb2 - 4) {
                return true;
            }
        }
        try {
            return !zzyt.zzm(this.zzc.zzH(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean zzk(zzyt zzyt, boolean z) throws IOException {
        int i;
        int i2;
        int i3;
        int zzb2;
        if (true != z) {
            i = SQLiteDatabase.OPEN_SHAREDCACHE;
        } else {
            i = 32768;
        }
        zzyt.zzj();
        if (zzyt.zzf() == 0) {
            zzbl zza2 = this.zzf.zza(zzyt, (zzabz) null);
            this.zzl = zza2;
            if (zza2 != null) {
                this.zze.zzb(zza2);
            }
            i2 = (int) zzyt.zze();
            if (!z) {
                ((zzym) zzyt).zzo(i2, false);
            }
            i3 = 0;
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (!zzj(zzyt)) {
                this.zzc.zzF(0);
                int zze2 = this.zzc.zze();
                if ((i3 == 0 || zzi(zze2, (long) i3)) && (zzb2 = zzzm.zzb(zze2)) != -1) {
                    i4++;
                    if (i4 != 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        this.zzd.zza(zze2);
                        i3 = zze2;
                    }
                    ((zzym) zzyt).zzl(zzb2 - 4, false);
                } else {
                    int i6 = i5 + 1;
                    if (i5 != i) {
                        if (z) {
                            zzyt.zzj();
                            ((zzym) zzyt).zzl(i2 + i6, false);
                        } else {
                            ((zzym) zzyt).zzo(1, false);
                        }
                        i5 = i6;
                        i3 = 0;
                        i4 = 0;
                    } else if (z) {
                        return false;
                    } else {
                        throw zzbp.zza("Searched too many bytes.", (Throwable) null);
                    }
                }
            } else if (i4 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            ((zzym) zzyt).zzo(i2 + i5, false);
        } else {
            zzyt.zzj();
        }
        this.zzk = i3;
        return true;
    }

    public final int zza(zzyt zzyt, zzzs zzzs) throws IOException {
        zzcw.zzb(this.zzi);
        int i = zzeg.zza;
        int zzf2 = zzf(zzyt);
        if (zzf2 == -1 && (this.zzq instanceof zzadl)) {
            if (this.zzq.zze() != zzg(this.zzn)) {
                zzadl zzadl = (zzadl) this.zzq;
                throw null;
            }
        }
        return zzf2;
    }

    public final void zzb(zzyv zzyv) {
        this.zzh = zzyv;
        zzzz zzv = zzyv.zzv(0, 1);
        this.zzi = zzv;
        this.zzj = zzv;
        this.zzh.zzB();
    }

    public final void zzc(long j, long j2) {
        this.zzk = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = 0;
        this.zzp = 0;
        zzadr zzadr = this.zzq;
        if (zzadr instanceof zzadl) {
            zzadl zzadl = (zzadl) zzadr;
            throw null;
        }
    }

    public final boolean zzd(zzyt zzyt) throws IOException {
        return zzk(zzyt, true);
    }

    public final void zze() {
        this.zzr = true;
    }

    public zzadp(int i) {
        this.zzc = new zzdy(10);
        this.zzd = new zzzl();
        this.zze = new zzzh();
        this.zzm = -9223372036854775807L;
        this.zzf = new zzzj();
        zzyr zzyr = new zzyr();
        this.zzg = zzyr;
        this.zzj = zzyr;
    }
}
