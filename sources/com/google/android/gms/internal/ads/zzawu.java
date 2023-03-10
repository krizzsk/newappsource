package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import java.io.IOException;

final class zzawu implements zzawy, zzatw, zzays, zzaxi {
    private long zzA;
    private long zzB;
    private long zzC;
    private int zzD;
    private boolean zzE;
    /* access modifiers changed from: private */
    public boolean zzF;
    private final zzayl zzG;
    private final Uri zza;
    private final zzayi zzb;
    private final int zzc;
    private final Handler zzd;
    /* access modifiers changed from: private */
    public final zzawv zze;
    private final zzawz zzf;
    /* access modifiers changed from: private */
    public final long zzg;
    private final zzayw zzh = new zzayw("Loader:ExtractorMediaPeriod");
    private final zzaws zzi;
    private final zzaza zzj;
    private final Runnable zzk;
    /* access modifiers changed from: private */
    public final Runnable zzl;
    /* access modifiers changed from: private */
    public final Handler zzm;
    /* access modifiers changed from: private */
    public final SparseArray zzn;
    /* access modifiers changed from: private */
    public zzawx zzo;
    private zzauc zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt;
    private int zzu;
    private zzaxp zzv;
    private long zzw;
    private boolean[] zzx;
    private boolean[] zzy;
    private boolean zzz;

    public zzawu(Uri uri, zzayi zzayi, zzatv[] zzatvArr, int i, Handler handler, zzawv zzawv, zzawz zzawz, zzayl zzayl, String str, int i2, byte[] bArr) {
        this.zza = uri;
        this.zzb = zzayi;
        this.zzc = i;
        this.zzd = handler;
        this.zze = zzawv;
        this.zzf = zzawz;
        this.zzG = zzayl;
        this.zzg = (long) i2;
        this.zzi = new zzaws(zzatvArr, this);
        this.zzj = new zzaza();
        this.zzk = new zzawn(this);
        this.zzl = new zzawo(this);
        this.zzm = new Handler();
        this.zzC = -9223372036854775807L;
        this.zzn = new SparseArray();
        this.zzA = -1;
    }

    private final int zzC() {
        int size = this.zzn.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((zzaxj) this.zzn.valueAt(i2)).zze();
        }
        return i;
    }

    private final long zzD() {
        int size = this.zzn.size();
        long j = Long.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, ((zzaxj) this.zzn.valueAt(i)).zzg());
        }
        return j;
    }

    private final void zzE(zzawr zzawr) {
        if (this.zzA == -1) {
            this.zzA = zzawr.zzj;
        }
    }

    private final void zzF() {
        zzauc zzauc;
        zzawr zzawr = new zzawr(this, this.zza, this.zzb, this.zzi, this.zzj);
        if (this.zzr) {
            zzayy.zze(zzG());
            long j = this.zzw;
            if (j == -9223372036854775807L || this.zzC < j) {
                zzawr.zzd(this.zzp.zzb(this.zzC), this.zzC);
                this.zzC = -9223372036854775807L;
            } else {
                this.zzE = true;
                this.zzC = -9223372036854775807L;
                return;
            }
        }
        this.zzD = zzC();
        int i = this.zzc;
        if (i == -1) {
            if (this.zzr && this.zzA == -1 && ((zzauc = this.zzp) == null || zzauc.zza() == -9223372036854775807L)) {
                i = 6;
            } else {
                i = 3;
            }
        }
        this.zzh.zza(zzawr, this, i);
    }

    private final boolean zzG() {
        return this.zzC != -9223372036854775807L;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, boolean], vars: [r4v0 ?, r4v3 ?, r4v5 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    public static /* bridge */ /* synthetic */ void zzp(com.google.android.gms.internal.ads.zzawu r8) {
        /*
            boolean r0 = r8.zzF
            if (r0 != 0) goto L_0x009c
            boolean r0 = r8.zzr
            if (r0 != 0) goto L_0x009c
            com.google.android.gms.internal.ads.zzauc r0 = r8.zzp
            if (r0 == 0) goto L_0x009c
            boolean r0 = r8.zzq
            if (r0 != 0) goto L_0x0012
            goto L_0x009c
        L_0x0012:
            android.util.SparseArray r0 = r8.zzn
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L_0x001a:
            if (r2 >= r0) goto L_0x002d
            android.util.SparseArray r3 = r8.zzn
            java.lang.Object r3 = r3.valueAt(r2)
            com.google.android.gms.internal.ads.zzaxj r3 = (com.google.android.gms.internal.ads.zzaxj) r3
            com.google.android.gms.internal.ads.zzars r3 = r3.zzh()
            if (r3 == 0) goto L_0x009c
            int r2 = r2 + 1
            goto L_0x001a
        L_0x002d:
            com.google.android.gms.internal.ads.zzaza r2 = r8.zzj
            r2.zzb()
            com.google.android.gms.internal.ads.zzaxo[] r2 = new com.google.android.gms.internal.ads.zzaxo[r0]
            boolean[] r3 = new boolean[r0]
            r8.zzy = r3
            boolean[] r3 = new boolean[r0]
            r8.zzx = r3
            com.google.android.gms.internal.ads.zzauc r3 = r8.zzp
            long r3 = r3.zza()
            r8.zzw = r3
            r3 = 0
        L_0x0045:
            r4 = 1
            if (r3 >= r0) goto L_0x007b
            android.util.SparseArray r5 = r8.zzn
            java.lang.Object r5 = r5.valueAt(r3)
            com.google.android.gms.internal.ads.zzaxj r5 = (com.google.android.gms.internal.ads.zzaxj) r5
            com.google.android.gms.internal.ads.zzars r5 = r5.zzh()
            com.google.android.gms.internal.ads.zzaxo r6 = new com.google.android.gms.internal.ads.zzaxo
            com.google.android.gms.internal.ads.zzars[] r7 = new com.google.android.gms.internal.ads.zzars[r4]
            r7[r1] = r5
            r6.<init>(r7)
            r2[r3] = r6
            java.lang.String r5 = r5.zzf
            boolean r6 = com.google.android.gms.internal.ads.zzazd.zzb(r5)
            if (r6 != 0) goto L_0x006f
            boolean r5 = com.google.android.gms.internal.ads.zzazd.zza(r5)
            if (r5 == 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r4 = 0
        L_0x006f:
            boolean[] r5 = r8.zzy
            r5[r3] = r4
            boolean r5 = r8.zzz
            r4 = r4 | r5
            r8.zzz = r4
            int r3 = r3 + 1
            goto L_0x0045
        L_0x007b:
            com.google.android.gms.internal.ads.zzaxp r0 = new com.google.android.gms.internal.ads.zzaxp
            r0.<init>(r2)
            r8.zzv = r0
            r8.zzr = r4
            com.google.android.gms.internal.ads.zzawz r0 = r8.zzf
            com.google.android.gms.internal.ads.zzaxn r1 = new com.google.android.gms.internal.ads.zzaxn
            long r2 = r8.zzw
            com.google.android.gms.internal.ads.zzauc r4 = r8.zzp
            boolean r4 = r4.zzc()
            r1.<init>(r2, r4)
            r2 = 0
            r0.zzg(r1, r2)
            com.google.android.gms.internal.ads.zzawx r0 = r8.zzo
            r0.zzf(r8)
        L_0x009c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzawu.zzp(com.google.android.gms.internal.ads.zzawu):void");
    }

    public final boolean zzA(int i) {
        return this.zzE || (!zzG() && ((zzaxj) this.zzn.valueAt(i)).zzm());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00bc, code lost:
        if (r1 != false) goto L_0x00c5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long zzB(com.google.android.gms.internal.ads.zzaxt[] r7, boolean[] r8, com.google.android.gms.internal.ads.zzaxk[] r9, boolean[] r10, long r11) {
        /*
            r6 = this;
            boolean r0 = r6.zzr
            com.google.android.gms.internal.ads.zzayy.zze(r0)
            r0 = 0
            r1 = 0
        L_0x0007:
            int r2 = r7.length
            if (r1 >= r2) goto L_0x003e
            r2 = r9[r1]
            if (r2 == 0) goto L_0x003b
            r3 = r7[r1]
            if (r3 == 0) goto L_0x0016
            boolean r3 = r8[r1]
            if (r3 != 0) goto L_0x003b
        L_0x0016:
            com.google.android.gms.internal.ads.zzawt r2 = (com.google.android.gms.internal.ads.zzawt) r2
            int r2 = r2.zzb
            boolean[] r3 = r6.zzx
            boolean r3 = r3[r2]
            com.google.android.gms.internal.ads.zzayy.zze(r3)
            int r3 = r6.zzu
            int r3 = r3 + -1
            r6.zzu = r3
            boolean[] r3 = r6.zzx
            r3[r2] = r0
            android.util.SparseArray r3 = r6.zzn
            java.lang.Object r2 = r3.valueAt(r2)
            com.google.android.gms.internal.ads.zzaxj r2 = (com.google.android.gms.internal.ads.zzaxj) r2
            r2.zzi()
            r2 = 0
            r9[r1] = r2
        L_0x003b:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x003e:
            r8 = 0
            r1 = 0
        L_0x0040:
            int r2 = r7.length
            r3 = 1
            if (r8 >= r2) goto L_0x0083
            r2 = r9[r8]
            if (r2 != 0) goto L_0x0080
            r2 = r7[r8]
            if (r2 == 0) goto L_0x0080
            r2.zzb()
            int r1 = r2.zza(r0)
            if (r1 != 0) goto L_0x0057
            r1 = 1
            goto L_0x0058
        L_0x0057:
            r1 = 0
        L_0x0058:
            com.google.android.gms.internal.ads.zzayy.zze(r1)
            com.google.android.gms.internal.ads.zzaxp r1 = r6.zzv
            com.google.android.gms.internal.ads.zzaxo r2 = r2.zzd()
            int r1 = r1.zza(r2)
            boolean[] r2 = r6.zzx
            boolean r2 = r2[r1]
            r2 = r2 ^ r3
            com.google.android.gms.internal.ads.zzayy.zze(r2)
            int r2 = r6.zzu
            int r2 = r2 + r3
            r6.zzu = r2
            boolean[] r2 = r6.zzx
            r2[r1] = r3
            com.google.android.gms.internal.ads.zzawt r2 = new com.google.android.gms.internal.ads.zzawt
            r2.<init>(r6, r1)
            r9[r8] = r2
            r10[r8] = r3
            r1 = 1
        L_0x0080:
            int r8 = r8 + 1
            goto L_0x0040
        L_0x0083:
            boolean r7 = r6.zzs
            if (r7 != 0) goto L_0x00a4
            android.util.SparseArray r7 = r6.zzn
            int r7 = r7.size()
            r8 = 0
        L_0x008e:
            if (r8 >= r7) goto L_0x00a4
            boolean[] r2 = r6.zzx
            boolean r2 = r2[r8]
            if (r2 != 0) goto L_0x00a1
            android.util.SparseArray r2 = r6.zzn
            java.lang.Object r2 = r2.valueAt(r8)
            com.google.android.gms.internal.ads.zzaxj r2 = (com.google.android.gms.internal.ads.zzaxj) r2
            r2.zzi()
        L_0x00a1:
            int r8 = r8 + 1
            goto L_0x008e
        L_0x00a4:
            int r7 = r6.zzu
            r4 = 0
            if (r7 != 0) goto L_0x00b8
            r6.zzt = r0
            com.google.android.gms.internal.ads.zzayw r7 = r6.zzh
            boolean r8 = r7.zzi()
            if (r8 == 0) goto L_0x00d5
            r7.zzf()
            goto L_0x00d5
        L_0x00b8:
            boolean r7 = r6.zzs
            if (r7 == 0) goto L_0x00bf
            if (r1 == 0) goto L_0x00d5
            goto L_0x00c5
        L_0x00bf:
            int r7 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x00c5
            r11 = r4
            goto L_0x00d5
        L_0x00c5:
            long r11 = r6.zzi(r11)
        L_0x00c9:
            int r7 = r9.length
            if (r0 >= r7) goto L_0x00d5
            r7 = r9[r0]
            if (r7 == 0) goto L_0x00d2
            r10[r0] = r3
        L_0x00d2:
            int r0 = r0 + 1
            goto L_0x00c9
        L_0x00d5:
            r6.zzs = r3
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzawu.zzB(com.google.android.gms.internal.ads.zzaxt[], boolean[], com.google.android.gms.internal.ads.zzaxk[], boolean[], long):long");
    }

    public final long zza() {
        if (this.zzu == 0) {
            return Long.MIN_VALUE;
        }
        return zzg();
    }

    public final void zzb() {
        this.zzq = true;
        this.zzm.post(this.zzk);
    }

    public final zzaue zzbi(int i, int i2) {
        zzaxj zzaxj = (zzaxj) this.zzn.get(i);
        if (zzaxj != null) {
            return zzaxj;
        }
        zzaxj zzaxj2 = new zzaxj(this.zzG, (byte[]) null);
        zzaxj2.zzk(this);
        this.zzn.put(i, zzaxj2);
        return zzaxj2;
    }

    public final boolean zzbj(long j) {
        if (this.zzE) {
            return false;
        }
        if (this.zzr && this.zzu == 0) {
            return false;
        }
        boolean zzc2 = this.zzj.zzc();
        if (this.zzh.zzi()) {
            return zzc2;
        }
        zzF();
        return true;
    }

    public final void zzc(zzauc zzauc) {
        this.zzp = zzauc;
        this.zzm.post(this.zzk);
    }

    public final /* bridge */ /* synthetic */ int zzd(zzayu zzayu, long j, long j2, IOException iOException) {
        zzauc zzauc;
        boolean z;
        zzawr zzawr = (zzawr) zzayu;
        zzE(zzawr);
        Handler handler = this.zzd;
        if (handler != null) {
            handler.post(new zzawq(this, iOException));
        }
        if (iOException instanceof zzaxq) {
            return 3;
        }
        int zzC2 = zzC();
        int i = this.zzD;
        if (this.zzA == -1 && ((zzauc = this.zzp) == null || zzauc.zza() == -9223372036854775807L)) {
            this.zzB = 0;
            this.zzt = this.zzr;
            int size = this.zzn.size();
            for (int i2 = 0; i2 < size; i2++) {
                zzaxj zzaxj = (zzaxj) this.zzn.valueAt(i2);
                if (!this.zzr || this.zzx[i2]) {
                    z = true;
                } else {
                    z = false;
                }
                zzaxj.zzj(z);
            }
            zzawr.zzd(0, 0);
        }
        this.zzD = zzC();
        if (zzC2 <= i) {
            return 0;
        }
        return 1;
    }

    public final int zze(int i, zzart zzart, zzatn zzatn, boolean z) {
        if (this.zzt || zzG()) {
            return -3;
        }
        return ((zzaxj) this.zzn.valueAt(i)).zzf(zzart, zzatn, z, this.zzE, this.zzB);
    }

    public final long zzg() {
        long j;
        if (this.zzE) {
            return Long.MIN_VALUE;
        }
        if (zzG()) {
            return this.zzC;
        }
        if (this.zzz) {
            int size = this.zzn.size();
            j = Long.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                if (this.zzy[i]) {
                    j = Math.min(j, ((zzaxj) this.zzn.valueAt(i)).zzg());
                }
            }
        } else {
            j = zzD();
        }
        if (j == Long.MIN_VALUE) {
            return this.zzB;
        }
        return j;
    }

    public final long zzh() {
        if (!this.zzt) {
            return -9223372036854775807L;
        }
        this.zzt = false;
        return this.zzB;
    }

    public final long zzi(long j) {
        if (true != this.zzp.zzc()) {
            j = 0;
        }
        this.zzB = j;
        int size = this.zzn.size();
        boolean zzG2 = true ^ zzG();
        int i = 0;
        while (true) {
            if (zzG2) {
                if (i >= size) {
                    break;
                }
                if (this.zzx[i]) {
                    zzG2 = ((zzaxj) this.zzn.valueAt(i)).zzn(j, false);
                }
                i++;
            } else {
                this.zzC = j;
                this.zzE = false;
                zzayw zzayw = this.zzh;
                if (zzayw.zzi()) {
                    zzayw.zzf();
                } else {
                    for (int i2 = 0; i2 < size; i2++) {
                        ((zzaxj) this.zzn.valueAt(i2)).zzj(this.zzx[i2]);
                    }
                }
            }
        }
        this.zzt = false;
        return j;
    }

    public final zzaxp zzn() {
        return this.zzv;
    }

    public final void zzq(long j) {
    }

    public final void zzr() throws IOException {
        this.zzh.zzg(Integer.MIN_VALUE);
    }

    public final void zzs() throws IOException {
        this.zzh.zzg(Integer.MIN_VALUE);
    }

    public final /* bridge */ /* synthetic */ void zzt(zzayu zzayu, long j, long j2, boolean z) {
        zzE((zzawr) zzayu);
        if (!z && this.zzu > 0) {
            int size = this.zzn.size();
            for (int i = 0; i < size; i++) {
                ((zzaxj) this.zzn.valueAt(i)).zzj(this.zzx[i]);
            }
            this.zzo.zze(this);
        }
    }

    public final /* bridge */ /* synthetic */ void zzu(zzayu zzayu, long j, long j2) {
        long j3;
        zzE((zzawr) zzayu);
        this.zzE = true;
        if (this.zzw == -9223372036854775807L) {
            long zzD2 = zzD();
            if (zzD2 == Long.MIN_VALUE) {
                j3 = 0;
            } else {
                j3 = zzD2 + 10000;
            }
            this.zzw = j3;
            this.zzf.zzg(new zzaxn(j3, this.zzp.zzc()), (Object) null);
        }
        this.zzo.zze(this);
    }

    public final void zzv(zzars zzars) {
        this.zzm.post(this.zzk);
    }

    public final void zzw(zzawx zzawx, long j) {
        this.zzo = zzawx;
        this.zzj.zzc();
        zzF();
    }

    public final void zzx() {
        this.zzh.zzh(new zzawp(this, this.zzi));
        this.zzm.removeCallbacksAndMessages((Object) null);
        this.zzF = true;
    }

    public final void zzy(int i, long j) {
        zzaxj zzaxj = (zzaxj) this.zzn.valueAt(i);
        if (!this.zzE || j <= zzaxj.zzg()) {
            zzaxj.zzn(j, true);
        } else {
            zzaxj.zzl();
        }
    }
}
