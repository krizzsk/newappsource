package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;

final class zzarq implements Handler.Callback, zzawx, zzayc, zzawz {
    private zzaro zzA;
    private long zzB;
    private zzarm zzC;
    private zzarm zzD;
    private zzarm zzE;
    private zzasd zzF;
    private boolean zzG;
    private boolean zzH;
    private int zzI;
    private volatile int zzJ;
    private volatile int zzK;
    private final zzcio zzL;
    private final zzarx[] zza;
    private final zzary[] zzb;
    private final zzayd zzc;
    private final zzazj zzd;
    private final Handler zze;
    private final HandlerThread zzf;
    private final Handler zzg;
    private final zzari zzh;
    private final zzasc zzi;
    private final zzasb zzj;
    private zzarn zzk;
    private zzarw zzl;
    private zzarx zzm;
    private zzazc zzn;
    private zzaxa zzo;
    private zzarx[] zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt;
    private int zzu;
    private int zzv = 0;
    private int zzw;
    private int zzx;
    private long zzy;
    private int zzz;

    public zzarq(zzarx[] zzarxArr, zzayd zzayd, zzcio zzcio, boolean z, int i, Handler handler, zzarn zzarn, zzari zzari, byte[] bArr) {
        this.zza = zzarxArr;
        this.zzc = zzayd;
        this.zzL = zzcio;
        this.zzr = z;
        this.zzg = handler;
        this.zzu = 1;
        this.zzk = zzarn;
        this.zzh = zzari;
        this.zzb = new zzary[2];
        for (int i2 = 0; i2 < 2; i2++) {
            zzarxArr[i2].zzw(i2);
            this.zzb[i2] = zzarxArr[i2].zzf();
        }
        this.zzd = new zzazj();
        this.zzp = new zzarx[0];
        this.zzi = new zzasc();
        this.zzj = new zzasb();
        zzayd.zzf(this);
        this.zzl = zzarw.zza;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.zzf = handlerThread;
        handlerThread.start();
        this.zze = new Handler(handlerThread.getLooper(), this);
    }

    private final void zzA(Object obj, int i) {
        this.zzk = new zzarn(0, 0);
        zzD(obj, i);
        this.zzk = new zzarn(0, -9223372036854775807L);
        zzJ(4);
        zzE(false);
    }

    private final void zzB() {
        long j;
        zzarm zzarm = this.zzC;
        if (!zzarm.zzj) {
            j = 0;
        } else {
            j = zzarm.zza.zza();
        }
        if (j == Long.MIN_VALUE) {
            zzH(false);
            return;
        }
        zzarm zzarm2 = this.zzC;
        long j2 = this.zzB - (zzarm2.zzf - zzarm2.zzh);
        boolean zzj2 = this.zzL.zzj(j - j2);
        zzH(zzj2);
        if (zzj2) {
            this.zzC.zza.zzbj(j2);
        }
    }

    private final void zzC() throws IOException {
        zzarm zzarm = this.zzC;
        if (zzarm != null && !zzarm.zzj) {
            zzarm zzarm2 = this.zzD;
            if (zzarm2 == null || zzarm2.zzl == zzarm) {
                zzarx[] zzarxArr = this.zzp;
                int length = zzarxArr.length;
                int i = 0;
                while (i < length) {
                    if (zzarxArr[i].zzA()) {
                        i++;
                    } else {
                        return;
                    }
                }
                this.zzC.zza.zzs();
            }
        }
    }

    private final void zzD(Object obj, int i) {
        this.zzg.obtainMessage(6, new zzarp(this.zzF, obj, this.zzk, i)).sendToTarget();
    }

    private final void zzE(boolean z) {
        this.zze.removeMessages(2);
        this.zzs = false;
        this.zzd.zzc();
        this.zzn = null;
        this.zzm = null;
        this.zzB = 60000000;
        for (zzarx zzarx : this.zzp) {
            try {
                zzQ(zzarx);
                zzarx.zzj();
            } catch (zzare | RuntimeException unused) {
            }
        }
        this.zzp = new zzarx[0];
        zzarm zzarm = this.zzE;
        if (zzarm == null) {
            zzarm = this.zzC;
        }
        zzR(zzarm);
        this.zzC = null;
        this.zzD = null;
        this.zzE = null;
        zzH(false);
        if (z) {
            zzaxa zzaxa = this.zzo;
            if (zzaxa != null) {
                zzaxa.zzd();
                this.zzo = null;
            }
            this.zzF = null;
        }
    }

    private final void zzF(long j) throws zzare {
        long j2;
        zzarm zzarm = this.zzE;
        if (zzarm == null) {
            j2 = j + 60000000;
        } else {
            j2 = j + (zzarm.zzf - zzarm.zzh);
        }
        this.zzB = j2;
        this.zzd.zza(j2);
        for (zzarx zzu2 : this.zzp) {
            zzu2.zzu(this.zzB);
        }
    }

    private final void zzG(long j, long j2) {
        this.zze.removeMessages(2);
        long elapsedRealtime = (j + j2) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.zze.sendEmptyMessage(2);
        } else {
            this.zze.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    private final void zzH(boolean z) {
        if (this.zzt != z) {
            this.zzt = z;
            this.zzg.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
        }
    }

    private final void zzI(zzarm zzarm) throws zzare {
        boolean z;
        if (this.zzE != zzarm) {
            boolean[] zArr = new boolean[2];
            int i = 0;
            for (int i2 = 0; i2 < 2; i2++) {
                zzarx zzarx = this.zza[i2];
                if (zzarx.zzb() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                zArr[i2] = z;
                zzaxt zza2 = zzarm.zzm.zzb.zza(i2);
                if (zza2 != null) {
                    i++;
                }
                if (zArr[i2] && (zza2 == null || (zzarx.zzB() && zzarx.zzh() == this.zzE.zzd[i2]))) {
                    if (zzarx == this.zzm) {
                        this.zzd.zzd(this.zzn);
                        this.zzn = null;
                        this.zzm = null;
                    }
                    zzQ(zzarx);
                    zzarx.zzj();
                }
            }
            this.zzE = zzarm;
            this.zzg.obtainMessage(3, zzarm.zzm).sendToTarget();
            zzz(zArr, i);
        }
    }

    private final void zzJ(int i) {
        if (this.zzu != i) {
            this.zzu = i;
            this.zzg.obtainMessage(1, i, 0).sendToTarget();
        }
    }

    private final void zzK() throws zzare {
        this.zzs = false;
        this.zzd.zzb();
        for (zzarx zzy2 : this.zzp) {
            zzy2.zzy();
        }
    }

    private final void zzL() {
        zzE(true);
        this.zzL.zzc();
        zzJ(1);
    }

    private final void zzM() throws zzare {
        this.zzd.zzc();
        for (zzarx zzQ : this.zzp) {
            zzQ(zzQ);
        }
    }

    private final void zzN() throws zzare {
        long j;
        zzarm zzarm = this.zzE;
        if (zzarm != null) {
            long zzh2 = zzarm.zza.zzh();
            if (zzh2 != -9223372036854775807L) {
                zzF(zzh2);
            } else {
                zzarx zzarx = this.zzm;
                if (zzarx == null || zzarx.zzE()) {
                    this.zzB = this.zzd.zzI();
                } else {
                    long zzI2 = this.zzn.zzI();
                    this.zzB = zzI2;
                    this.zzd.zza(zzI2);
                }
                zzarm zzarm2 = this.zzE;
                zzh2 = this.zzB - (zzarm2.zzf - zzarm2.zzh);
            }
            this.zzk.zzc = zzh2;
            this.zzy = SystemClock.elapsedRealtime() * 1000;
            if (this.zzp.length == 0) {
                j = Long.MIN_VALUE;
            } else {
                j = this.zzE.zza.zzg();
            }
            zzarn zzarn = this.zzk;
            if (j == Long.MIN_VALUE) {
                j = this.zzF.zzd(this.zzE.zzg, this.zzj, false).zzc;
            }
            zzarn.zzd = j;
        }
    }

    private final boolean zzO(int i) {
        this.zzF.zzd(i, this.zzj, false);
        this.zzF.zzg(0, this.zzi, false);
        if (this.zzF.zzf(i, this.zzj, this.zzi, this.zzv) == -1) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r6 = r5.zzE.zzl;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzP(long r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x001f
            com.google.android.gms.internal.ads.zzarn r2 = r5.zzk
            long r2 = r2.zzc
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x001f
            com.google.android.gms.internal.ads.zzarm r6 = r5.zzE
            com.google.android.gms.internal.ads.zzarm r6 = r6.zzl
            if (r6 == 0) goto L_0x0020
            boolean r6 = r6.zzj
            if (r6 == 0) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            return r0
        L_0x001f:
            r0 = 1
        L_0x0020:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzarq.zzP(long):boolean");
    }

    private static final void zzQ(zzarx zzarx) throws zzare {
        if (zzarx.zzb() == 2) {
            zzarx.zzz();
        }
    }

    private static final void zzR(zzarm zzarm) {
        while (zzarm != null) {
            zzarm.zzc();
            zzarm = zzarm.zzl;
        }
    }

    private final int zzt(int i, zzasd zzasd, zzasd zzasd2) {
        int zzb2 = zzasd.zzb();
        int i2 = -1;
        for (int i3 = 0; i3 < zzb2 && i2 == -1; i3++) {
            i = zzasd.zzf(i, this.zzj, this.zzi, this.zzv);
            i2 = zzasd2.zza(zzasd.zzd(i, this.zzj, true).zzb);
        }
        return i2;
    }

    private final long zzu(int i, long j) throws zzare {
        zzarm zzarm;
        zzM();
        this.zzs = false;
        zzJ(2);
        zzarm zzarm2 = this.zzE;
        if (zzarm2 == null) {
            zzarm zzarm3 = this.zzC;
            if (zzarm3 != null) {
                zzarm3.zzc();
            }
            zzarm = null;
        } else {
            zzarm = null;
            while (zzarm2 != null) {
                if (zzarm2.zzg != i || !zzarm2.zzj) {
                    zzarm2.zzc();
                } else {
                    zzarm = zzarm2;
                }
                zzarm2 = zzarm2.zzl;
            }
        }
        zzarm zzarm4 = this.zzE;
        if (!(zzarm4 == zzarm && zzarm4 == this.zzD)) {
            for (zzarx zzj2 : this.zzp) {
                zzj2.zzj();
            }
            this.zzp = new zzarx[0];
            this.zzn = null;
            this.zzm = null;
            this.zzE = null;
        }
        if (zzarm != null) {
            zzarm.zzl = null;
            this.zzC = zzarm;
            this.zzD = zzarm;
            zzI(zzarm);
            zzarm zzarm5 = this.zzE;
            if (zzarm5.zzk) {
                j = zzarm5.zza.zzi(j);
            }
            zzF(j);
            zzB();
        } else {
            this.zzC = null;
            this.zzD = null;
            this.zzE = null;
            zzF(j);
        }
        this.zze.sendEmptyMessage(2);
        return j;
    }

    private final Pair zzv(int i, long j) {
        return zzw(this.zzF, 0, -9223372036854775807L);
    }

    private final Pair zzw(zzasd zzasd, int i, long j) {
        return zzx(zzasd, 0, j, 0);
    }

    private final Pair zzx(zzasd zzasd, int i, long j, long j2) {
        zzayy.zza(0, 0, zzasd.zzc());
        zzasd.zze(0, this.zzi, false, j2);
        if (j == -9223372036854775807L) {
            j = 0;
        }
        long j3 = zzasd.zzd(0, this.zzj, false).zzc;
        if (j3 != -9223372036854775807L) {
            int i2 = (j > j3 ? 1 : (j == j3 ? 0 : -1));
        }
        return Pair.create(0, Long.valueOf(j));
    }

    private final Pair zzy(zzaro zzaro) {
        zzasd zzasd = zzaro.zza;
        if (zzasd.zzh()) {
            zzasd = this.zzF;
        }
        try {
            Pair zzw2 = zzw(zzasd, 0, zzaro.zzc);
            zzasd zzasd2 = this.zzF;
            if (zzasd2 == zzasd) {
                return zzw2;
            }
            if (zzasd2.zza(zzasd.zzd(((Integer) zzw2.first).intValue(), this.zzj, true).zzb) != -1) {
                return Pair.create(0, (Long) zzw2.second);
            }
            if (zzt(((Integer) zzw2.first).intValue(), zzasd, this.zzF) == -1) {
                return null;
            }
            this.zzF.zzd(0, this.zzj, false);
            return zzv(0, -9223372036854775807L);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzaru(this.zzF, 0, zzaro.zzc);
        }
    }

    private final void zzz(boolean[] zArr, int i) throws zzare {
        int i2;
        boolean z;
        boolean z2;
        this.zzp = new zzarx[i];
        int i3 = 0;
        int i4 = 0;
        while (i3 < 2) {
            zzarx zzarx = this.zza[i3];
            zzaxt zza2 = this.zzE.zzm.zzb.zza(i3);
            if (zza2 != null) {
                int i5 = i4 + 1;
                this.zzp[i4] = zzarx;
                if (zzarx.zzb() == 0) {
                    zzarz zzarz = this.zzE.zzm.zzd[i3];
                    if (!this.zzr || this.zzu != 3) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (zArr[i3] || !z) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    zza2.zzb();
                    zzars[] zzarsArr = new zzars[1];
                    for (int i6 = 0; i6 <= 0; i6++) {
                        zzarsArr[i6] = zza2.zzc(i6);
                    }
                    zzarm zzarm = this.zzE;
                    i2 = i3;
                    zzarx.zzk(zzarz, zzarsArr, zzarm.zzd[i3], this.zzB, z2, zzarm.zzf - zzarm.zzh);
                    zzazc zzi2 = zzarx.zzi();
                    if (zzi2 != null) {
                        if (this.zzn == null) {
                            this.zzn = zzi2;
                            this.zzm = zzarx;
                            zzi2.zzK(this.zzl);
                        } else {
                            throw zzare.zzc(new IllegalStateException("Multiple renderer media clocks enabled."));
                        }
                    }
                    if (z) {
                        zzarx.zzy();
                    }
                } else {
                    i2 = i3;
                }
                i4 = i5;
            } else {
                i2 = i3;
            }
            i3 = i2 + 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:432:0x0798, code lost:
        if (zzP(r1) != false) goto L_0x079a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x087e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x087f, code lost:
        r8.zzg.obtainMessage(8, com.google.android.gms.internal.ads.zzare.zzc(r0)).sendToTarget();
        zzL();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x0893, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x0894, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x0895, code lost:
        r1 = true;
        r3 = 8;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x08aa, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x08ab, code lost:
        r1 = true;
        r3 = 8;
        r2 = r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0268 A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x026c A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0271 A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x04ea A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x04f1 A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0508 A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x050b A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x0546 A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x0558 A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x0572 A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }, LOOP:8: B:317:0x0572->B:321:0x0582, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x06c7 A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:494:0x087e A[ExcHandler: RuntimeException (r0v2 'e' java.lang.RuntimeException A[CUSTOM_DECLARE]), Splitter:B:1:0x0005] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r34) {
        /*
            r33 = this;
            r8 = r33
            r1 = r34
            r10 = 1
            int r2 = r1.what     // Catch:{ zzare -> 0x08aa, IOException -> 0x0894, RuntimeException -> 0x087e }
            r11 = 7
            r3 = 0
            r14 = 3
            r5 = -1
            r6 = 0
            r15 = 4
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 2
            r9 = 0
            switch(r2) {
                case 0: goto L_0x083d;
                case 1: goto L_0x080e;
                case 2: goto L_0x0429;
                case 3: goto L_0x038a;
                case 4: goto L_0x036c;
                case 5: goto L_0x0368;
                case 6: goto L_0x0351;
                case 7: goto L_0x01f6;
                case 8: goto L_0x01c6;
                case 9: goto L_0x01b6;
                case 10: goto L_0x00da;
                case 11: goto L_0x009c;
                case 12: goto L_0x001a;
                default: goto L_0x0018;
            }
        L_0x0018:
            r1 = 0
            return r1
        L_0x001a:
            int r1 = r1.arg1     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.zzv = r1     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarm r2 = r8.zzE     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x0024
            com.google.android.gms.internal.ads.zzarm r2 = r8.zzC     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0024:
            if (r2 != 0) goto L_0x0028
            goto L_0x009b
        L_0x0028:
            com.google.android.gms.internal.ads.zzarm r3 = r8.zzD     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != r3) goto L_0x002e
            r3 = 1
            goto L_0x002f
        L_0x002e:
            r3 = 0
        L_0x002f:
            com.google.android.gms.internal.ads.zzarm r4 = r8.zzC     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != r4) goto L_0x0035
            r4 = 1
            goto L_0x0036
        L_0x0035:
            r4 = 0
        L_0x0036:
            com.google.android.gms.internal.ads.zzasd r11 = r8.zzF     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r12 = r2.zzg     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasb r13 = r8.zzj     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasc r14 = r8.zzi     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r11 = r11.zzf(r12, r13, r14, r1)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0042:
            com.google.android.gms.internal.ads.zzarm r12 = r2.zzl     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r12 == 0) goto L_0x0068
            if (r11 == r5) goto L_0x0068
            int r13 = r12.zzg     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r13 != r11) goto L_0x0068
            com.google.android.gms.internal.ads.zzarm r2 = r8.zzD     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r12 != r2) goto L_0x0052
            r2 = 1
            goto L_0x0053
        L_0x0052:
            r2 = 0
        L_0x0053:
            r3 = r3 | r2
            com.google.android.gms.internal.ads.zzarm r2 = r8.zzC     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r12 != r2) goto L_0x005a
            r2 = 1
            goto L_0x005b
        L_0x005a:
            r2 = 0
        L_0x005b:
            r4 = r4 | r2
            com.google.android.gms.internal.ads.zzasd r2 = r8.zzF     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasb r11 = r8.zzj     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasc r14 = r8.zzi     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r11 = r2.zzf(r13, r11, r14, r1)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = r12
            goto L_0x0042
        L_0x0068:
            if (r12 == 0) goto L_0x006f
            zzR(r12)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.zzl = r6     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x006f:
            int r5 = r2.zzg     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r5 = r8.zzO(r5)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.zzi = r5     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r4 != 0) goto L_0x007b
            r8.zzC = r2     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x007b:
            if (r3 != 0) goto L_0x0092
            com.google.android.gms.internal.ads.zzarm r2 = r8.zzE     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x0092
            int r2 = r2.zzg     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarn r3 = r8.zzk     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r3 = r3.zzc     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r3 = r8.zzu(r2, r3)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarn r5 = new com.google.android.gms.internal.ads.zzarn     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r5.<init>(r2, r3)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.zzk = r5     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0092:
            int r2 = r8.zzu     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != r15) goto L_0x009b
            if (r1 == 0) goto L_0x009b
            r8.zzJ(r7)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x009b:
            return r10
        L_0x009c:
            java.lang.Object r1 = r1.obj     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarh[] r1 = (com.google.android.gms.internal.ads.zzarh[]) r1     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r1.length     // Catch:{ all -> 0x00c9 }
        L_0x00a1:
            if (r9 >= r2) goto L_0x00b1
            r3 = r1[r9]     // Catch:{ all -> 0x00c9 }
            com.google.android.gms.internal.ads.zzarg r4 = r3.zza     // Catch:{ all -> 0x00c9 }
            int r5 = r3.zzb     // Catch:{ all -> 0x00c9 }
            java.lang.Object r3 = r3.zzc     // Catch:{ all -> 0x00c9 }
            r4.zzl(r5, r3)     // Catch:{ all -> 0x00c9 }
            int r9 = r9 + 1
            goto L_0x00a1
        L_0x00b1:
            com.google.android.gms.internal.ads.zzaxa r1 = r8.zzo     // Catch:{ all -> 0x00c9 }
            if (r1 == 0) goto L_0x00ba
            android.os.Handler r1 = r8.zze     // Catch:{ all -> 0x00c9 }
            r1.sendEmptyMessage(r7)     // Catch:{ all -> 0x00c9 }
        L_0x00ba:
            monitor-enter(r33)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = r8.zzx     // Catch:{ all -> 0x00c5 }
            int r1 = r1 + r10
            r8.zzx = r1     // Catch:{ all -> 0x00c5 }
            r33.notifyAll()     // Catch:{ all -> 0x00c5 }
            monitor-exit(r33)     // Catch:{ all -> 0x00c5 }
            return r10
        L_0x00c5:
            r0 = move-exception
            r1 = r0
            monitor-exit(r33)     // Catch:{ all -> 0x00c5 }
            throw r1     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x00c9:
            r0 = move-exception
            r1 = r0
            monitor-enter(r33)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r8.zzx     // Catch:{ all -> 0x00d6 }
            int r2 = r2 + r10
            r8.zzx = r2     // Catch:{ all -> 0x00d6 }
            r33.notifyAll()     // Catch:{ all -> 0x00d6 }
            monitor-exit(r33)     // Catch:{ all -> 0x00d6 }
            throw r1     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x00d6:
            r0 = move-exception
            r1 = r0
            monitor-exit(r33)     // Catch:{ all -> 0x00d6 }
            throw r1     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x00da:
            com.google.android.gms.internal.ads.zzarm r1 = r8.zzE     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x01b5
            r2 = 1
        L_0x00df:
            if (r1 == 0) goto L_0x01b5
            boolean r3 = r1.zzj     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 != 0) goto L_0x00e7
            goto L_0x01b5
        L_0x00e7:
            boolean r3 = r1.zze()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == 0) goto L_0x01a9
            if (r2 == 0) goto L_0x0178
            com.google.android.gms.internal.ads.zzarm r2 = r8.zzD     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarm r3 = r8.zzE     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == r3) goto L_0x00f7
            r2 = 1
            goto L_0x00f8
        L_0x00f7:
            r2 = 0
        L_0x00f8:
            com.google.android.gms.internal.ads.zzarm r3 = r3.zzl     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            zzR(r3)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarm r3 = r8.zzE     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.zzl = r6     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.zzC = r3     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.zzD = r3     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean[] r4 = new boolean[r7]     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarn r5 = r8.zzk     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r11 = r5.zzc     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r2 = r3.zzb(r11, r2, r4)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarn r5 = r8.zzk     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r11 = r5.zzc     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r5 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r5 == 0) goto L_0x011e
            com.google.android.gms.internal.ads.zzarn r5 = r8.zzk     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r5.zzc = r2     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.zzF(r2)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x011e:
            boolean[] r2 = new boolean[r7]     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3 = 0
            r5 = 0
        L_0x0122:
            if (r3 >= r7) goto L_0x0169
            com.google.android.gms.internal.ads.zzarx[] r11 = r8.zza     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r11 = r11[r3]     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r12 = r11.zzb()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r12 == 0) goto L_0x0130
            r12 = 1
            goto L_0x0131
        L_0x0130:
            r12 = 0
        L_0x0131:
            r2[r3] = r12     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarm r13 = r8.zzE     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzaxk[] r13 = r13.zzd     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r13 = r13[r3]     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r13 == 0) goto L_0x013d
            int r5 = r5 + 1
        L_0x013d:
            if (r12 == 0) goto L_0x0166
            com.google.android.gms.internal.ads.zzaxk r12 = r11.zzh()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r13 == r12) goto L_0x015d
            com.google.android.gms.internal.ads.zzarx r12 = r8.zzm     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r11 != r12) goto L_0x0156
            if (r13 != 0) goto L_0x0152
            com.google.android.gms.internal.ads.zzazj r12 = r8.zzd     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzazc r13 = r8.zzn     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r12.zzd(r13)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0152:
            r8.zzn = r6     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.zzm = r6     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0156:
            zzQ(r11)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r11.zzj()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0166
        L_0x015d:
            boolean r12 = r4[r3]     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r12 == 0) goto L_0x0166
            long r12 = r8.zzB     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r11.zzu(r12)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0166:
            int r3 = r3 + 1
            goto L_0x0122
        L_0x0169:
            android.os.Handler r3 = r8.zzg     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzaye r1 = r1.zzm     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Message r1 = r3.obtainMessage(r14, r1)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.sendToTarget()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.zzz(r2, r5)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x019d
        L_0x0178:
            r8.zzC = r1     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarm r1 = r1.zzl     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x017c:
            if (r1 == 0) goto L_0x0184
            r1.zzc()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarm r1 = r1.zzl     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x017c
        L_0x0184:
            com.google.android.gms.internal.ads.zzarm r1 = r8.zzC     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.zzl = r6     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r2 = r1.zzj     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x019d
            long r2 = r1.zzh     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r4 = r8.zzB     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r11 = r1.zzf     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r11 = r11 - r2
            long r4 = r4 - r11
            long r1 = java.lang.Math.max(r2, r4)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarm r3 = r8.zzC     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.zza(r1, r9)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x019d:
            r33.zzB()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r33.zzN()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r1 = r8.zze     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.sendEmptyMessage(r7)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x01b5
        L_0x01a9:
            com.google.android.gms.internal.ads.zzarm r3 = r8.zzD     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 != r3) goto L_0x01af
            r3 = 0
            goto L_0x01b0
        L_0x01af:
            r3 = 1
        L_0x01b0:
            r2 = r2 & r3
            com.google.android.gms.internal.ads.zzarm r1 = r1.zzl     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x00df
        L_0x01b5:
            return r10
        L_0x01b6:
            java.lang.Object r1 = r1.obj     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzawy r1 = (com.google.android.gms.internal.ads.zzawy) r1     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarm r2 = r8.zzC     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x01c5
            com.google.android.gms.internal.ads.zzawy r2 = r2.zza     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != r1) goto L_0x01c5
            r33.zzB()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x01c5:
            return r10
        L_0x01c6:
            java.lang.Object r1 = r1.obj     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzawy r1 = (com.google.android.gms.internal.ads.zzawy) r1     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarm r2 = r8.zzC     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x01f5
            com.google.android.gms.internal.ads.zzawy r3 = r2.zza     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == r1) goto L_0x01d3
            goto L_0x01f5
        L_0x01d3:
            r2.zzj = r10     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.zze()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r3 = r2.zzh     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r3 = r2.zza(r3, r9)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.zzh = r3     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarm r1 = r8.zzE     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 != 0) goto L_0x01f2
            com.google.android.gms.internal.ads.zzarm r1 = r8.zzC     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.zzD = r1     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r1 = r1.zzh     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.zzF(r1)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarm r1 = r8.zzD     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.zzI(r1)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x01f2:
            r33.zzB()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x01f5:
            return r10
        L_0x01f6:
            java.lang.Object r1 = r1.obj     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.util.Pair r1 = (android.util.Pair) r1     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasd r2 = r8.zzF     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r3 = r1.first     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasd r3 = (com.google.android.gms.internal.ads.zzasd) r3     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.zzF = r3     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r1 = r1.second     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x0263
            int r4 = r8.zzz     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r4 <= 0) goto L_0x0235
            com.google.android.gms.internal.ads.zzaro r3 = r8.zzA     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.util.Pair r3 = r8.zzy(r3)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r4 = r8.zzz     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.zzz = r9     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.zzA = r6     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 != 0) goto L_0x021d
            r8.zzA(r1, r4)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0350
        L_0x021d:
            com.google.android.gms.internal.ads.zzarn r7 = new com.google.android.gms.internal.ads.zzarn     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r11 = r3.first     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r11 = r11.intValue()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r3 = r3.second     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r14 = r3.longValue()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r7.<init>(r11, r14)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.zzk = r7     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0264
        L_0x0235:
            com.google.android.gms.internal.ads.zzarn r4 = r8.zzk     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r14 = r4.zzb     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r4 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r4 != 0) goto L_0x0263
            boolean r3 = r3.zzh()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == 0) goto L_0x0248
            r8.zzA(r1, r9)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0350
        L_0x0248:
            android.util.Pair r3 = r8.zzv(r9, r12)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarn r4 = new com.google.android.gms.internal.ads.zzarn     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r7 = r3.first     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r7 = r7.intValue()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r3 = r3.second     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r14 = r3.longValue()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r4.<init>(r7, r14)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.zzk = r4     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0263:
            r4 = 0
        L_0x0264:
            com.google.android.gms.internal.ads.zzarm r3 = r8.zzE     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 != 0) goto L_0x026a
            com.google.android.gms.internal.ads.zzarm r3 = r8.zzC     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x026a:
            if (r3 != 0) goto L_0x0271
            r8.zzD(r1, r4)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0350
        L_0x0271:
            com.google.android.gms.internal.ads.zzasd r7 = r8.zzF     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r11 = r3.zzb     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r7 = r7.zza(r11)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r7 != r5) goto L_0x02d4
            int r6 = r3.zzg     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasd r7 = r8.zzF     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r8.zzt(r6, r2, r7)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != r5) goto L_0x028a
            r8.zzA(r1, r4)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0350
        L_0x028a:
            com.google.android.gms.internal.ads.zzasd r2 = r8.zzF     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasb r6 = r8.zzj     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.zzd(r9, r6, r9)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.util.Pair r2 = r8.zzv(r9, r12)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r6 = r2.first     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r6 = r6.intValue()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r2 = r2.second     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r11 = r2.longValue()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasd r2 = r8.zzF     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasb r7 = r8.zzj     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.zzd(r6, r7, r10)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasb r2 = r8.zzj     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r2 = r2.zzb     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.zzg = r5     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x02b2:
            com.google.android.gms.internal.ads.zzarm r3 = r3.zzl     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == 0) goto L_0x02c4
            java.lang.Object r7 = r3.zzb     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r7 = r7.equals(r2)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r10 == r7) goto L_0x02c0
            r7 = -1
            goto L_0x02c1
        L_0x02c0:
            r7 = r6
        L_0x02c1:
            r3.zzg = r7     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x02b2
        L_0x02c4:
            long r2 = r8.zzu(r6, r11)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarn r5 = new com.google.android.gms.internal.ads.zzarn     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r5.<init>(r6, r2)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.zzk = r5     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.zzD(r1, r4)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0350
        L_0x02d4:
            boolean r2 = r8.zzO(r9)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.zzg = r9     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.zzi = r2     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarm r2 = r8.zzD     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 != r2) goto L_0x02e2
            r2 = 1
            goto L_0x02e3
        L_0x02e2:
            r2 = 0
        L_0x02e3:
            com.google.android.gms.internal.ads.zzarn r11 = r8.zzk     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r12 = r11.zza     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r12 == 0) goto L_0x02fa
            com.google.android.gms.internal.ads.zzarn r12 = new com.google.android.gms.internal.ads.zzarn     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r13 = r11.zzb     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r12.<init>(r9, r13)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r13 = r11.zzc     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r12.zzc = r13     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r13 = r11.zzd     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r12.zzd = r13     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.zzk = r12     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x02fa:
            com.google.android.gms.internal.ads.zzarm r11 = r3.zzl     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r11 == 0) goto L_0x034d
            com.google.android.gms.internal.ads.zzasd r12 = r8.zzF     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasb r13 = r8.zzj     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasc r14 = r8.zzi     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r15 = r8.zzv     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r7 = r12.zzf(r7, r13, r14, r15)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r7 == r5) goto L_0x0330
            java.lang.Object r12 = r11.zzb     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasd r13 = r8.zzF     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasb r14 = r8.zzj     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasb r13 = r13.zzd(r7, r14, r10)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r13 = r13.zzb     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r12 = r12.equals(r13)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r12 == 0) goto L_0x0330
            boolean r3 = r8.zzO(r7)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r11.zzg = r7     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r11.zzi = r3     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarm r3 = r8.zzD     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r11 != r3) goto L_0x032c
            r3 = 1
            goto L_0x032d
        L_0x032c:
            r3 = 0
        L_0x032d:
            r2 = r2 | r3
            r3 = r11
            goto L_0x02fa
        L_0x0330:
            if (r2 != 0) goto L_0x0346
            com.google.android.gms.internal.ads.zzarm r2 = r8.zzE     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r2.zzg     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarn r3 = r8.zzk     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r5 = r3.zzc     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r5 = r8.zzu(r2, r5)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarn r3 = new com.google.android.gms.internal.ads.zzarn     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.<init>(r2, r5)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.zzk = r3     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x034d
        L_0x0346:
            r8.zzC = r3     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.zzl = r6     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            zzR(r11)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x034d:
            r8.zzD(r1, r4)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0350:
            return r10
        L_0x0351:
            r8.zzE(r10)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzcio r1 = r8.zzL     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.zzb()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.zzJ(r10)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            monitor-enter(r33)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.zzq = r10     // Catch:{ all -> 0x0364 }
            r33.notifyAll()     // Catch:{ all -> 0x0364 }
            monitor-exit(r33)     // Catch:{ all -> 0x0364 }
            return r10
        L_0x0364:
            r0 = move-exception
            r1 = r0
            monitor-exit(r33)     // Catch:{ all -> 0x0364 }
            throw r1     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0368:
            r33.zzL()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            return r10
        L_0x036c:
            java.lang.Object r1 = r1.obj     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarw r1 = (com.google.android.gms.internal.ads.zzarw) r1     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzazc r2 = r8.zzn     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x0379
            com.google.android.gms.internal.ads.zzarw r1 = r2.zzK(r1)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x037e
        L_0x0379:
            com.google.android.gms.internal.ads.zzazj r2 = r8.zzd     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.zzK(r1)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x037e:
            r8.zzl = r1     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r2 = r8.zzg     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Message r1 = r2.obtainMessage(r11, r1)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.sendToTarget()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            return r10
        L_0x038a:
            java.lang.Object r1 = r1.obj     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzaro r1 = (com.google.android.gms.internal.ads.zzaro) r1     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasd r2 = r8.zzF     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x039b
            int r2 = r8.zzz     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r2 + r10
            r8.zzz = r2     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.zzA = r1     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0415
        L_0x039b:
            android.util.Pair r2 = r8.zzy(r1)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x03bf
            com.google.android.gms.internal.ads.zzarn r1 = new com.google.android.gms.internal.ads.zzarn     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.<init>(r9, r3)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.zzk = r1     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r2 = r8.zzg     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Message r1 = r2.obtainMessage(r15, r10, r9, r1)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.sendToTarget()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarn r1 = new com.google.android.gms.internal.ads.zzarn     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.<init>(r9, r12)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.zzk = r1     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.zzJ(r15)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.zzE(r9)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0415
        L_0x03bf:
            long r3 = r1.zzc     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r1 != 0) goto L_0x03c7
            r1 = 1
            goto L_0x03c8
        L_0x03c7:
            r1 = 0
        L_0x03c8:
            java.lang.Object r3 = r2.first     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r3 = r3.intValue()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r2 = r2.second     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r4 = r2.longValue()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarn r2 = r8.zzk     // Catch:{ all -> 0x0416 }
            int r6 = r2.zza     // Catch:{ all -> 0x0416 }
            if (r3 != r6) goto L_0x03fb
            r16 = 1000(0x3e8, double:4.94E-321)
            long r6 = r4 / r16
            long r11 = r2.zzc     // Catch:{ all -> 0x0416 }
            long r11 = r11 / r16
            int r2 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x03fb
            com.google.android.gms.internal.ads.zzarn r2 = new com.google.android.gms.internal.ads.zzarn     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.<init>(r3, r4)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.zzk = r2     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r3 = r8.zzg     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Message r1 = r3.obtainMessage(r15, r1, r9, r2)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x03f7:
            r1.sendToTarget()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0415
        L_0x03fb:
            long r6 = r8.zzu(r3, r4)     // Catch:{ all -> 0x0416 }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0405
            r2 = 1
            goto L_0x0406
        L_0x0405:
            r2 = 0
        L_0x0406:
            r1 = r1 | r2
            com.google.android.gms.internal.ads.zzarn r2 = new com.google.android.gms.internal.ads.zzarn     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.<init>(r3, r6)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.zzk = r2     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r3 = r8.zzg     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Message r1 = r3.obtainMessage(r15, r1, r9, r2)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x03f7
        L_0x0415:
            return r10
        L_0x0416:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.internal.ads.zzarn r6 = new com.google.android.gms.internal.ads.zzarn     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r6.<init>(r3, r4)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.zzk = r6     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r3 = r8.zzg     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Message r1 = r3.obtainMessage(r15, r1, r9, r6)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.sendToTarget()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            throw r2     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0429:
            r16 = 1000(0x3e8, double:4.94E-321)
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasd r1 = r8.zzF     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 != 0) goto L_0x043b
            com.google.android.gms.internal.ads.zzaxa r1 = r8.zzo     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.zza()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r11 = r5
            goto L_0x0677
        L_0x043b:
            com.google.android.gms.internal.ads.zzarm r1 = r8.zzC     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 != 0) goto L_0x0444
            com.google.android.gms.internal.ads.zzarn r1 = r8.zzk     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = r1.zza     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0479
        L_0x0444:
            int r2 = r1.zzg     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r7 = r1.zzi     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r7 != 0) goto L_0x0553
            boolean r1 = r1.zzd()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x0553
            com.google.android.gms.internal.ads.zzasd r1 = r8.zzF     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasb r7 = r8.zzj     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasb r1 = r1.zzd(r2, r7, r9)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r14 = r1.zzc     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x0553
            com.google.android.gms.internal.ads.zzarm r1 = r8.zzE     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x046d
            com.google.android.gms.internal.ads.zzarm r7 = r8.zzC     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r7 = r7.zzc     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = r1.zzc     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r7 = r7 - r1
            r1 = 100
            if (r7 == r1) goto L_0x0553
        L_0x046d:
            com.google.android.gms.internal.ads.zzasd r1 = r8.zzF     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasb r7 = r8.zzj     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasc r14 = r8.zzi     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r15 = r8.zzv     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = r1.zzf(r2, r7, r14, r15)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0479:
            com.google.android.gms.internal.ads.zzasd r2 = r8.zzF     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r2.zzb()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 < r2) goto L_0x0488
            com.google.android.gms.internal.ads.zzaxa r1 = r8.zzo     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.zza()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0553
        L_0x0488:
            com.google.android.gms.internal.ads.zzarm r2 = r8.zzC     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x0493
            com.google.android.gms.internal.ads.zzarn r2 = r8.zzk     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r3 = r2.zzc     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0490:
            r11 = r5
            r15 = 2
            goto L_0x04e6
        L_0x0493:
            com.google.android.gms.internal.ads.zzasd r2 = r8.zzF     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasb r7 = r8.zzj     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.zzd(r1, r7, r9)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasd r2 = r8.zzF     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasc r7 = r8.zzi     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.zzg(r9, r7, r9)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x04a4
            goto L_0x0490
        L_0x04a4:
            com.google.android.gms.internal.ads.zzarm r1 = r8.zzC     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r14 = r1.zzf     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r11 = r1.zzh     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r14 = r14 - r11
            com.google.android.gms.internal.ads.zzasd r2 = r8.zzF     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = r1.zzg     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasb r7 = r8.zzj     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasb r1 = r2.zzd(r1, r7, r9)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r1 = r1.zzc     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r14 = r14 + r1
            long r1 = r8.zzB     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r14 = r14 - r1
            com.google.android.gms.internal.ads.zzasd r2 = r8.zzF     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r7 = 0
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r13 = java.lang.Math.max(r3, r14)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1 = r33
            r3 = r7
            r6 = r5
            r4 = r11
            r11 = r6
            r15 = 2
            r6 = r13
            android.util.Pair r1 = r1.zzx(r2, r3, r4, r6)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x0554
            java.lang.Object r2 = r1.first     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r2.intValue()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r1 = r1.second     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r3 = r1.longValue()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1 = r2
        L_0x04e6:
            com.google.android.gms.internal.ads.zzarm r2 = r8.zzC     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x04f1
            r5 = 60000000(0x3938700, double:2.96439388E-316)
            long r5 = r5 + r3
        L_0x04ee:
            r21 = r5
            goto L_0x0504
        L_0x04f1:
            long r5 = r2.zzf     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r13 = r2.zzh     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r5 = r5 - r13
            com.google.android.gms.internal.ads.zzasd r7 = r8.zzF     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r2.zzg     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasb r13 = r8.zzj     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasb r2 = r7.zzd(r2, r13, r9)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r13 = r2.zzc     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r5 = r5 + r13
            goto L_0x04ee
        L_0x0504:
            com.google.android.gms.internal.ads.zzarm r2 = r8.zzC     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x050b
            r27 = 0
            goto L_0x0510
        L_0x050b:
            int r2 = r2.zzc     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r2 + r10
            r27 = r2
        L_0x0510:
            boolean r29 = r8.zzO(r1)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasd r2 = r8.zzF     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasb r5 = r8.zzj     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.zzd(r1, r5, r10)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarm r2 = new com.google.android.gms.internal.ads.zzarm     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarx[] r5 = r8.zza     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzary[] r6 = r8.zzb     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzayd r7 = r8.zzc     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzcio r13 = r8.zzL     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzaxa r14 = r8.zzo     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasb r15 = r8.zzj     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r15 = r15.zzb     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r32 = 0
            r18 = r2
            r19 = r5
            r20 = r6
            r23 = r7
            r24 = r13
            r25 = r14
            r26 = r15
            r28 = r1
            r30 = r3
            r18.<init>(r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r32)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarm r1 = r8.zzC     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x0548
            r1.zzl = r2     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0548:
            r8.zzC = r2     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzawy r1 = r2.zza     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.zzw(r8, r3)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.zzH(r10)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0554
        L_0x0553:
            r11 = r5
        L_0x0554:
            com.google.android.gms.internal.ads.zzarm r1 = r8.zzC     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x056b
            boolean r1 = r1.zzd()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x055f
            goto L_0x056b
        L_0x055f:
            com.google.android.gms.internal.ads.zzarm r1 = r8.zzC     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x056e
            boolean r1 = r8.zzt     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 != 0) goto L_0x056e
            r33.zzB()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x056e
        L_0x056b:
            r8.zzH(r9)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x056e:
            com.google.android.gms.internal.ads.zzarm r1 = r8.zzE     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x0677
        L_0x0572:
            com.google.android.gms.internal.ads.zzarm r1 = r8.zzE     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarm r2 = r8.zzD     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == r2) goto L_0x05a9
            long r3 = r8.zzB     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarm r5 = r1.zzl     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r5 = r5.zzf     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x05a9
            r1.zzc()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarm r1 = r8.zzE     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarm r1 = r1.zzl     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.zzI(r1)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarn r1 = new com.google.android.gms.internal.ads.zzarn     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarm r2 = r8.zzE     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r3 = r2.zzg     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r4 = r2.zzh     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.<init>(r3, r4)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.zzk = r1     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r33.zzN()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r1 = r8.zzg     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 5
            com.google.android.gms.internal.ads.zzarn r3 = r8.zzk     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Message r1 = r1.obtainMessage(r2, r3)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.sendToTarget()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0572
        L_0x05a9:
            boolean r1 = r2.zzi     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x05cf
            r1 = 0
        L_0x05ae:
            r2 = 2
            if (r1 >= r2) goto L_0x0677
            com.google.android.gms.internal.ads.zzarx[] r2 = r8.zza     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = r2[r1]     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarm r3 = r8.zzD     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzaxk[] r3 = r3.zzd     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3 = r3[r1]     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == 0) goto L_0x05cc
            com.google.android.gms.internal.ads.zzaxk r4 = r2.zzh()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r4 != r3) goto L_0x05cc
            boolean r3 = r2.zzA()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == 0) goto L_0x05cc
            r2.zzv()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x05cc:
            int r1 = r1 + 1
            goto L_0x05ae
        L_0x05cf:
            r1 = 0
        L_0x05d0:
            r2 = 2
            if (r1 >= r2) goto L_0x05ee
            com.google.android.gms.internal.ads.zzarx[] r2 = r8.zza     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = r2[r1]     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarm r3 = r8.zzD     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzaxk[] r3 = r3.zzd     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3 = r3[r1]     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzaxk r4 = r2.zzh()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r4 != r3) goto L_0x0677
            if (r3 == 0) goto L_0x05eb
            boolean r2 = r2.zzA()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x0677
        L_0x05eb:
            int r1 = r1 + 1
            goto L_0x05d0
        L_0x05ee:
            com.google.android.gms.internal.ads.zzarm r1 = r8.zzD     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarm r2 = r1.zzl     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x0677
            boolean r3 = r2.zzj     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == 0) goto L_0x0677
            com.google.android.gms.internal.ads.zzaye r1 = r1.zzm     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.zzD = r2     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzaye r3 = r2.zzm     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzawy r2 = r2.zza     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r4 = r2.zzh()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 0
            r6 = 2
        L_0x0606:
            if (r2 >= r6) goto L_0x0677
            com.google.android.gms.internal.ads.zzarx[] r6 = r8.zza     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r6 = r6[r2]     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzayb r7 = r1.zzb     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzaxt r7 = r7.zza(r2)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r7 != 0) goto L_0x0619
        L_0x0614:
            r19 = r3
            r20 = r4
            goto L_0x066d
        L_0x0619:
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x0626
            r6.zzv()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0614
        L_0x0626:
            boolean r7 = r6.zzB()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r7 != 0) goto L_0x0614
            com.google.android.gms.internal.ads.zzayb r7 = r3.zzb     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzaxt r7 = r7.zza(r2)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarz[] r13 = r1.zzd     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r13 = r13[r2]     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarz[] r14 = r3.zzd     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r14 = r14[r2]     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r7 == 0) goto L_0x0666
            boolean r13 = r14.equals(r13)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r13 == 0) goto L_0x0666
            r7.zzb()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzars[] r13 = new com.google.android.gms.internal.ads.zzars[r10]     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r14 = 0
        L_0x0648:
            if (r14 > 0) goto L_0x0653
            com.google.android.gms.internal.ads.zzars r15 = r7.zzc(r14)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r13[r14] = r15     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r14 = r14 + 1
            goto L_0x0648
        L_0x0653:
            com.google.android.gms.internal.ads.zzarm r7 = r8.zzD     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzaxk[] r14 = r7.zzd     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r14 = r14[r2]     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r9 = r7.zzf     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r19 = r3
            r20 = r4
            long r3 = r7.zzh     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r9 = r9 - r3
            r6.zzt(r13, r14, r9)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x066d
        L_0x0666:
            r19 = r3
            r20 = r4
            r6.zzv()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x066d:
            int r2 = r2 + 1
            r3 = r19
            r4 = r20
            r6 = 2
            r9 = 0
            r10 = 1
            goto L_0x0606
        L_0x0677:
            com.google.android.gms.internal.ads.zzarm r1 = r8.zzE     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 10
            if (r1 != 0) goto L_0x0686
            r33.zzC()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.zzG(r11, r2)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0683:
            r1 = 1
            goto L_0x080d
        L_0x0686:
            java.lang.String r1 = "doSomeWork"
            com.google.android.gms.internal.ads.zzazl.zza(r1)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r33.zzN()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarm r1 = r8.zzE     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzawy r1 = r1.zza     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarn r4 = r8.zzk     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r4 = r4.zzc     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.zzq(r4)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarx[] r1 = r8.zzp     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r4 = r1.length     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r5 = 1
            r6 = 1
            r7 = 0
        L_0x069f:
            if (r7 >= r4) goto L_0x06d6
            r9 = r1[r7]     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r13 = r8.zzB     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r2 = r8.zzy     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r9.zzD(r13, r2)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r6 == 0) goto L_0x06b4
            boolean r2 = r9.zzE()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x06b4
            r6 = 1
            goto L_0x06b5
        L_0x06b4:
            r6 = 0
        L_0x06b5:
            boolean r2 = r9.zzF()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x06c4
            boolean r2 = r9.zzE()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x06c2
            goto L_0x06c4
        L_0x06c2:
            r2 = 0
            goto L_0x06c5
        L_0x06c4:
            r2 = 1
        L_0x06c5:
            if (r2 != 0) goto L_0x06ca
            r9.zzm()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x06ca:
            if (r5 == 0) goto L_0x06d0
            if (r2 == 0) goto L_0x06d0
            r5 = 1
            goto L_0x06d1
        L_0x06d0:
            r5 = 0
        L_0x06d1:
            int r7 = r7 + 1
            r2 = 10
            goto L_0x069f
        L_0x06d6:
            if (r5 != 0) goto L_0x06db
            r33.zzC()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x06db:
            com.google.android.gms.internal.ads.zzazc r1 = r8.zzn     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x06fe
            com.google.android.gms.internal.ads.zzarw r1 = r1.zzJ()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarw r2 = r8.zzl     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r2 = r1.equals(r2)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x06fe
            r8.zzl = r1     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzazj r2 = r8.zzd     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzazc r3 = r8.zzn     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.zzd(r3)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r2 = r8.zzg     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3 = 7
            android.os.Message r1 = r2.obtainMessage(r3, r1)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.sendToTarget()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x06fe:
            com.google.android.gms.internal.ads.zzasd r1 = r8.zzF     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarm r2 = r8.zzE     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r2.zzg     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasb r3 = r8.zzj     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r4 = 0
            com.google.android.gms.internal.ads.zzasb r1 = r1.zzd(r2, r3, r4)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r1 = r1.zzc     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r6 == 0) goto L_0x072f
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x0720
            com.google.android.gms.internal.ads.zzarn r3 = r8.zzk     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r3 = r3.zzc     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 > 0) goto L_0x072f
        L_0x0720:
            com.google.android.gms.internal.ads.zzarm r3 = r8.zzE     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r3 = r3.zzi     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == 0) goto L_0x072f
            r3 = 4
            r8.zzJ(r3)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r33.zzM()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x07c0
        L_0x072f:
            int r3 = r8.zzu     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r4 = 2
            if (r3 != r4) goto L_0x07a6
            com.google.android.gms.internal.ads.zzarx[] r3 = r8.zzp     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r3 = r3.length     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 <= 0) goto L_0x0794
            if (r5 == 0) goto L_0x07c0
            boolean r1 = r8.zzs     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarm r2 = r8.zzC     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r3 = r2.zzj     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 != 0) goto L_0x0746
            long r2 = r2.zzh     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x074c
        L_0x0746:
            com.google.android.gms.internal.ads.zzawy r2 = r2.zza     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r2 = r2.zzg()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x074c:
            r4 = -9223372036854775808
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0766
            com.google.android.gms.internal.ads.zzarm r2 = r8.zzC     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r3 = r2.zzi     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == 0) goto L_0x0759
            goto L_0x079a
        L_0x0759:
            com.google.android.gms.internal.ads.zzasd r3 = r8.zzF     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r2.zzg     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzasb r4 = r8.zzj     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r5 = 0
            com.google.android.gms.internal.ads.zzasb r2 = r3.zzd(r2, r4, r5)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r2 = r2.zzc     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0766:
            boolean r4 = r8.zzG     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r4 == 0) goto L_0x0780
            com.google.android.gms.internal.ads.zzcio r2 = r8.zzL     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarn r3 = r8.zzk     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r3 = r3.zzd     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarm r5 = r8.zzC     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r6 = r8.zzB     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r9 = r5.zzf     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r13 = r5.zzh     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r9 = r9 - r13
            long r6 = r6 - r9
            long r3 = r3 - r6
            boolean r1 = r2.zzk(r3, r1)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0791
        L_0x0780:
            com.google.android.gms.internal.ads.zzcio r4 = r8.zzL     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzarm r5 = r8.zzC     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r6 = r8.zzB     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r9 = r5.zzf     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r13 = r5.zzh     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r9 = r9 - r13
            long r6 = r6 - r9
            long r2 = r2 - r6
            boolean r1 = r4.zzk(r2, r1)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0791:
            if (r1 == 0) goto L_0x07c0
            goto L_0x079a
        L_0x0794:
            boolean r1 = r8.zzP(r1)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x07c0
        L_0x079a:
            r1 = 3
            r8.zzJ(r1)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r1 = r8.zzr     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x07c0
            r33.zzK()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x07c0
        L_0x07a6:
            r4 = 3
            if (r3 != r4) goto L_0x07c0
            com.google.android.gms.internal.ads.zzarx[] r3 = r8.zzp     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r3 = r3.length     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 <= 0) goto L_0x07af
            goto L_0x07b3
        L_0x07af:
            boolean r5 = r8.zzP(r1)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x07b3:
            if (r5 != 0) goto L_0x07c0
            boolean r1 = r8.zzr     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.zzs = r1     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1 = 2
            r8.zzJ(r1)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r33.zzM()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x07c0:
            int r1 = r8.zzu     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 2
            if (r1 != r2) goto L_0x07d3
            com.google.android.gms.internal.ads.zzarx[] r1 = r8.zzp     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r1.length     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r9 = 0
        L_0x07c9:
            if (r9 >= r2) goto L_0x07d3
            r3 = r1[r9]     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.zzm()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r9 = r9 + 1
            goto L_0x07c9
        L_0x07d3:
            boolean r1 = r8.zzr     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x07dc
            int r1 = r8.zzu     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 3
            if (r1 == r2) goto L_0x07e1
        L_0x07dc:
            int r1 = r8.zzu     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 2
            if (r1 != r2) goto L_0x07ef
        L_0x07e1:
            int r1 = r8.zzJ     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 <= 0) goto L_0x07e9
            int r1 = r8.zzJ     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r2 = (long) r1     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x07eb
        L_0x07e9:
            r2 = 10
        L_0x07eb:
            r8.zzG(r11, r2)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0808
        L_0x07ef:
            com.google.android.gms.internal.ads.zzarx[] r1 = r8.zzp     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = r1.length     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x0802
            int r1 = r8.zzK     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 <= 0) goto L_0x07fc
            int r1 = r8.zzK     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r1 = (long) r1     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x07fe
        L_0x07fc:
            r1 = r16
        L_0x07fe:
            r8.zzG(r11, r1)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0808
        L_0x0802:
            android.os.Handler r1 = r8.zze     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 2
            r1.removeMessages(r2)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0808:
            com.google.android.gms.internal.ads.zzazl.zzb()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0683
        L_0x080d:
            return r1
        L_0x080e:
            int r1 = r1.arg1     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x0814
            r1 = 1
            goto L_0x0815
        L_0x0814:
            r1 = 0
        L_0x0815:
            r2 = 0
            r8.zzs = r2     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.zzr = r1     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 != 0) goto L_0x0824
            r33.zzM()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r33.zzN()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0822:
            r1 = 1
            goto L_0x083c
        L_0x0824:
            int r1 = r8.zzu     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 3
            if (r1 != r2) goto L_0x0833
            r33.zzK()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r1 = r8.zze     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 2
            r1.sendEmptyMessage(r2)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0822
        L_0x0833:
            r2 = 2
            if (r1 != r2) goto L_0x0822
            android.os.Handler r1 = r8.zze     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.sendEmptyMessage(r2)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0822
        L_0x083c:
            return r1
        L_0x083d:
            java.lang.Object r2 = r1.obj     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzaxa r2 = (com.google.android.gms.internal.ads.zzaxa) r2     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = r1.arg1     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r3 = r8.zzg     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r4 = 0
            r3.sendEmptyMessage(r4)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3 = 1
            r8.zzE(r3)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzcio r3 = r8.zzL     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.zza()     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x0860
            com.google.android.gms.internal.ads.zzarn r1 = new com.google.android.gms.internal.ads.zzarn     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.<init>(r4, r5)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.zzk = r1     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0860:
            r8.zzo = r2     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzari r1 = r8.zzh     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3 = 1
            r2.zzb(r1, r3, r8)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1 = 2
            r8.zzJ(r1)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r2 = r8.zze     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.sendEmptyMessage(r1)     // Catch:{ zzare -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            return r3
        L_0x0872:
            r0 = move-exception
            r2 = r0
            r1 = 1
            r3 = 8
            goto L_0x0899
        L_0x0878:
            r0 = move-exception
            r2 = r0
            r1 = 1
            r3 = 8
            goto L_0x08af
        L_0x087e:
            r0 = move-exception
            r1 = r0
            android.os.Handler r2 = r8.zzg
            com.google.android.gms.internal.ads.zzare r1 = com.google.android.gms.internal.ads.zzare.zzc(r1)
            r3 = 8
            android.os.Message r1 = r2.obtainMessage(r3, r1)
            r1.sendToTarget()
            r33.zzL()
            r1 = 1
            return r1
        L_0x0894:
            r0 = move-exception
            r1 = 1
            r3 = 8
            r2 = r0
        L_0x0899:
            android.os.Handler r4 = r8.zzg
            com.google.android.gms.internal.ads.zzare r2 = com.google.android.gms.internal.ads.zzare.zzb(r2)
            android.os.Message r2 = r4.obtainMessage(r3, r2)
            r2.sendToTarget()
            r33.zzL()
            return r1
        L_0x08aa:
            r0 = move-exception
            r1 = 1
            r3 = 8
            r2 = r0
        L_0x08af:
            android.os.Handler r4 = r8.zzg
            android.os.Message r2 = r4.obtainMessage(r3, r2)
            r2.sendToTarget()
            r33.zzL()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzarq.handleMessage(android.os.Message):boolean");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:10|11|12|13|22|19|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0018, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0020 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zza(com.google.android.gms.internal.ads.zzarh... r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.zzq     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)
            return
        L_0x0007:
            int r0 = r3.zzw     // Catch:{ all -> 0x002a }
            int r1 = r0 + 1
            r3.zzw = r1     // Catch:{ all -> 0x002a }
            android.os.Handler r1 = r3.zze     // Catch:{ all -> 0x002a }
            r2 = 11
            android.os.Message r4 = r1.obtainMessage(r2, r4)     // Catch:{ all -> 0x002a }
            r4.sendToTarget()     // Catch:{ all -> 0x002a }
        L_0x0018:
            int r4 = r3.zzx     // Catch:{ all -> 0x002a }
            if (r4 > r0) goto L_0x0028
            r3.wait()     // Catch:{ InterruptedException -> 0x0020 }
            goto L_0x0018
        L_0x0020:
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x002a }
            r4.interrupt()     // Catch:{ all -> 0x002a }
            goto L_0x0018
        L_0x0028:
            monitor-exit(r3)
            return
        L_0x002a:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzarq.zza(com.google.android.gms.internal.ads.zzarh[]):void");
    }

    public final void zzb() {
        this.zzG = true;
    }

    public final void zzc(int i) {
        this.zzI = i;
    }

    public final void zzd() {
        this.zzH = true;
    }

    public final /* bridge */ /* synthetic */ void zze(zzaxm zzaxm) {
        this.zze.obtainMessage(9, (zzawy) zzaxm).sendToTarget();
    }

    public final void zzf(zzawy zzawy) {
        this.zze.obtainMessage(8, zzawy).sendToTarget();
    }

    public final void zzg(zzasd zzasd, Object obj) {
        this.zze.obtainMessage(7, Pair.create(zzasd, (Object) null)).sendToTarget();
    }

    public final void zzh() {
        this.zze.sendEmptyMessage(10);
    }

    public final void zzi(zzaxa zzaxa, boolean z) {
        this.zze.obtainMessage(0, 1, 0, zzaxa).sendToTarget();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:10|11|12|13|23|20|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x000d, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0015 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzj() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.zzq     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            android.os.Handler r0 = r2.zze     // Catch:{ all -> 0x0024 }
            r1 = 6
            r0.sendEmptyMessage(r1)     // Catch:{ all -> 0x0024 }
        L_0x000d:
            boolean r0 = r2.zzq     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x001d
            r2.wait()     // Catch:{ InterruptedException -> 0x0015 }
            goto L_0x000d
        L_0x0015:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0024 }
            r0.interrupt()     // Catch:{ all -> 0x0024 }
            goto L_0x000d
        L_0x001d:
            android.os.HandlerThread r0 = r2.zzf     // Catch:{ all -> 0x0024 }
            r0.quit()     // Catch:{ all -> 0x0024 }
            monitor-exit(r2)
            return
        L_0x0024:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzarq.zzj():void");
    }

    public final void zzk(zzasd zzasd, int i, long j) {
        this.zze.obtainMessage(3, new zzaro(zzasd, 0, j)).sendToTarget();
    }

    public final void zzl(zzarh... zzarhArr) {
        if (!this.zzq) {
            this.zzw++;
            this.zze.obtainMessage(11, zzarhArr).sendToTarget();
        }
    }

    public final void zzm(int i) {
        this.zzK = i;
    }

    public final void zzn(int i) {
        this.zzJ = i;
    }

    public final void zzo(boolean z) {
        this.zze.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
    }

    public final void zzp() {
        this.zze.sendEmptyMessage(5);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:13|14|15|16|17|18) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002f */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003f A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean zzq(com.google.android.gms.internal.ads.zzarh... r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            boolean r0 = r9.zzq     // Catch:{ all -> 0x0044 }
            r1 = 1
            if (r0 == 0) goto L_0x0008
            monitor-exit(r9)
            return r1
        L_0x0008:
            int r0 = r9.zzw     // Catch:{ all -> 0x0044 }
            int r2 = r0 + 1
            r9.zzw = r2     // Catch:{ all -> 0x0044 }
            android.os.Handler r2 = r9.zze     // Catch:{ all -> 0x0044 }
            r3 = 11
            android.os.Message r10 = r2.obtainMessage(r3, r10)     // Catch:{ all -> 0x0044 }
            r10.sendToTarget()     // Catch:{ all -> 0x0044 }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0044 }
            int r10 = r9.zzI     // Catch:{ all -> 0x0044 }
            long r4 = (long) r10     // Catch:{ all -> 0x0044 }
            long r2 = r2 + r4
        L_0x0021:
            int r10 = r9.zzx     // Catch:{ all -> 0x0044 }
            if (r10 > r0) goto L_0x003d
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x003d
            r9.wait(r4)     // Catch:{ InterruptedException -> 0x002f }
            goto L_0x0036
        L_0x002f:
            java.lang.Thread r10 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0044 }
            r10.interrupt()     // Catch:{ all -> 0x0044 }
        L_0x0036:
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0044 }
            long r4 = r2 - r4
            goto L_0x0021
        L_0x003d:
            if (r0 >= r10) goto L_0x0041
            monitor-exit(r9)
            return r1
        L_0x0041:
            r10 = 0
            monitor-exit(r9)
            return r10
        L_0x0044:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzarq.zzq(com.google.android.gms.internal.ads.zzarh[]):boolean");
    }

    public final boolean zzr() {
        return this.zzH && this.zzI > 0;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:13|14|15|16|27|17) */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x002b, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0024 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean zzs() {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.zzq     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0008
            r0 = 1
            monitor-exit(r7)
            return r0
        L_0x0008:
            android.os.Handler r0 = r7.zze     // Catch:{ all -> 0x003b }
            r1 = 6
            r0.sendEmptyMessage(r1)     // Catch:{ all -> 0x003b }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x003b }
            int r2 = r7.zzI     // Catch:{ all -> 0x003b }
            long r2 = (long) r2     // Catch:{ all -> 0x003b }
            long r0 = r0 + r2
        L_0x0016:
            boolean r4 = r7.zzq     // Catch:{ all -> 0x003b }
            if (r4 != 0) goto L_0x0032
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0037
            r7.wait(r2)     // Catch:{ InterruptedException -> 0x0024 }
            goto L_0x002b
        L_0x0024:
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x003b }
            r2.interrupt()     // Catch:{ all -> 0x003b }
        L_0x002b:
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x003b }
            long r2 = r0 - r2
            goto L_0x0016
        L_0x0032:
            android.os.HandlerThread r0 = r7.zzf     // Catch:{ all -> 0x003b }
            r0.quit()     // Catch:{ all -> 0x003b }
        L_0x0037:
            boolean r0 = r7.zzq     // Catch:{ all -> 0x003b }
            monitor-exit(r7)
            return r0
        L_0x003b:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzarq.zzs():boolean");
    }
}
