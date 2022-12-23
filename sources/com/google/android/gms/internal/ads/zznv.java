package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

final class zznv {
    private long zzA;
    private long zzB;
    private long zzC;
    private boolean zzD;
    private long zzE;
    private long zzF;
    private final zznu zza;
    private final long[] zzb;
    private AudioTrack zzc;
    private int zzd;
    private int zze;
    private zznt zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private float zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private Method zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private int zzv;
    private int zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    public zznv(zznu zznu) {
        this.zza = zznu;
        int i = zzeg.zza;
        try {
            this.zzn = AudioTrack.class.getMethod("getLatency", (Class[]) null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzb = new long[10];
    }

    private final long zzm(long j) {
        return (j * 1000000) / ((long) this.zzg);
    }

    private final long zzn() {
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        if (this.zzx != -9223372036854775807L) {
            return Math.min(this.zzA, ((((SystemClock.elapsedRealtime() * 1000) - this.zzx) * ((long) this.zzg)) / 1000000) + this.zzz);
        }
        int playState = audioTrack.getPlayState();
        long j = 0;
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.zzh) {
            if (playState == 2) {
                if (playbackHeadPosition == 0) {
                    this.zzu = this.zzs;
                }
                playState = 2;
            }
            playbackHeadPosition += this.zzu;
        }
        if (zzeg.zza <= 29) {
            if (playbackHeadPosition != 0) {
                j = playbackHeadPosition;
            } else if (this.zzs > 0 && playState == 3) {
                if (this.zzy == -9223372036854775807L) {
                    this.zzy = SystemClock.elapsedRealtime();
                }
                return this.zzs;
            }
            this.zzy = -9223372036854775807L;
            playbackHeadPosition = j;
        }
        if (this.zzs > playbackHeadPosition) {
            this.zzt++;
        }
        this.zzs = playbackHeadPosition;
        return playbackHeadPosition + (this.zzt << 32);
    }

    private final void zzo() {
        this.zzl = 0;
        this.zzw = 0;
        this.zzv = 0;
        this.zzm = 0;
        this.zzC = 0;
        this.zzF = 0;
        this.zzk = false;
    }

    public final int zza(long j) {
        return this.zze - ((int) (j - (zzn() * ((long) this.zzd))));
    }

    public final long zzb(boolean z) {
        long j;
        long j2;
        Method method;
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            long zzm2 = zzm(zzn());
            if (zzm2 != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.zzm >= 30000) {
                    long[] jArr = this.zzb;
                    int i = this.zzv;
                    jArr[i] = zzm2 - nanoTime;
                    this.zzv = (i + 1) % 10;
                    int i2 = this.zzw;
                    if (i2 < 10) {
                        this.zzw = i2 + 1;
                    }
                    this.zzm = nanoTime;
                    this.zzl = 0;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.zzw;
                        if (i3 >= i4) {
                            break;
                        }
                        this.zzl = (this.zzb[i3] / ((long) i4)) + this.zzl;
                        i3++;
                    }
                }
                if (!this.zzh) {
                    zznt zznt = this.zzf;
                    zznt.getClass();
                    if (zznt.zzg(nanoTime)) {
                        long zzb2 = zznt.zzb();
                        long zza2 = zznt.zza();
                        if (Math.abs(zzb2 - nanoTime) > 5000000) {
                            zzoi zzoi = (zzoi) this.zza;
                            long unused = zzoi.zza.zzE();
                            long unused2 = zzoi.zza.zzF();
                            zznt.zzd();
                        } else if (Math.abs(zzm(zza2) - zzm2) > 5000000) {
                            zzoi zzoi2 = (zzoi) this.zza;
                            long unused3 = zzoi2.zza.zzE();
                            long unused4 = zzoi2.zza.zzF();
                            zznt.zzd();
                        } else {
                            zznt.zzc();
                        }
                    }
                    if (this.zzq && (method = this.zzn) != null && nanoTime - this.zzr >= 500000) {
                        try {
                            AudioTrack audioTrack2 = this.zzc;
                            audioTrack2.getClass();
                            int i5 = zzeg.zza;
                            long intValue = (((long) ((Integer) method.invoke(audioTrack2, new Object[0])).intValue()) * 1000) - this.zzi;
                            this.zzo = intValue;
                            long max = Math.max(intValue, 0);
                            this.zzo = max;
                            if (max > 5000000) {
                                this.zzo = 0;
                            }
                        } catch (Exception unused5) {
                            this.zzn = null;
                        }
                        this.zzr = nanoTime;
                    }
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        zznt zznt2 = this.zzf;
        zznt2.getClass();
        boolean zzf2 = zznt2.zzf();
        if (zzf2) {
            j = zzeg.zzs(nanoTime2 - zznt2.zzb(), this.zzj) + zzm(zznt2.zza());
        } else {
            if (this.zzw == 0) {
                j2 = zzm(zzn());
            } else {
                j2 = this.zzl + nanoTime2;
            }
            j = j2;
            if (!z) {
                j = Math.max(0, j - this.zzo);
            }
        }
        if (this.zzD != zzf2) {
            this.zzF = this.zzC;
            this.zzE = this.zzB;
        }
        long j3 = nanoTime2 - this.zzF;
        if (j3 < 1000000) {
            long j4 = (j3 * 1000) / 1000000;
            j = (((zzeg.zzs(j3, this.zzj) + this.zzE) * (1000 - j4)) + (j * j4)) / 1000;
        }
        if (!this.zzk) {
            long j5 = this.zzB;
            if (j > j5) {
                this.zzk = true;
                long currentTimeMillis = System.currentTimeMillis() - zzeg.zzz(zzeg.zzu(zzeg.zzz(j - j5), this.zzj));
                zzon zzon = ((zzoi) this.zza).zza;
                if (zzon.zzn != null) {
                    ((zzos) zzon.zzn).zza.zzc.zzr(currentTimeMillis);
                }
            }
        }
        this.zzC = nanoTime2;
        this.zzB = j;
        this.zzD = zzf2;
        return j;
    }

    public final long zzc(long j) {
        return zzeg.zzz(zzm(j - zzn()));
    }

    public final void zzd(long j) {
        this.zzz = zzn();
        this.zzx = SystemClock.elapsedRealtime() * 1000;
        this.zzA = j;
    }

    public final void zze() {
        zzo();
        this.zzc = null;
        this.zzf = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzf(android.media.AudioTrack r4, boolean r5, int r6, int r7, int r8) {
        /*
            r3 = this;
            r3.zzc = r4
            r3.zzd = r7
            r3.zze = r8
            com.google.android.gms.internal.ads.zznt r0 = new com.google.android.gms.internal.ads.zznt
            r0.<init>(r4)
            r3.zzf = r0
            int r4 = r4.getSampleRate()
            r3.zzg = r4
            r4 = 6
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L_0x0025
            int r5 = com.google.android.gms.internal.ads.zzeg.zza
            r2 = 23
            if (r5 >= r2) goto L_0x0025
            r5 = 5
            if (r6 == r5) goto L_0x0026
            if (r6 != r4) goto L_0x0025
            r6 = 6
            goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            r3.zzh = r0
            boolean r4 = com.google.android.gms.internal.ads.zzeg.zzU(r6)
            r3.zzq = r4
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L_0x003c
            int r8 = r8 / r7
            long r7 = (long) r8
            long r7 = r3.zzm(r7)
            goto L_0x003d
        L_0x003c:
            r7 = r5
        L_0x003d:
            r3.zzi = r7
            r7 = 0
            r3.zzs = r7
            r3.zzt = r7
            r3.zzu = r7
            r3.zzp = r1
            r3.zzx = r5
            r3.zzy = r5
            r3.zzr = r7
            r3.zzo = r7
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.zzj = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zznv.zzf(android.media.AudioTrack, boolean, int, int, int):void");
    }

    public final void zzg() {
        zznt zznt = this.zzf;
        zznt.getClass();
        zznt.zze();
    }

    public final boolean zzh(long j) {
        if (j > zzn()) {
            return true;
        }
        if (!this.zzh) {
            return false;
        }
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2 && zzn() == 0) {
            return true;
        }
        return false;
    }

    public final boolean zzi() {
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            return true;
        }
        return false;
    }

    public final boolean zzj(long j) {
        return this.zzy != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.zzy >= 200;
    }

    public final boolean zzk(long j) {
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        if (this.zzh) {
            if (playState == 2) {
                this.zzp = false;
                return false;
            } else if (playState == 1) {
                if (zzn() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z = this.zzp;
        boolean zzh2 = zzh(j);
        this.zzp = zzh2;
        if (z && !zzh2 && playState != 1) {
            zznu zznu = this.zza;
            int i = this.zze;
            long zzz2 = zzeg.zzz(this.zzi);
            zzoi zzoi = (zzoi) zznu;
            if (zzoi.zza.zzn != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                zzon zzon = zzoi.zza;
                ((zzos) zzon.zzn).zza.zzc.zzt(i, zzz2, elapsedRealtime - zzon.zzS);
            }
        }
        return true;
    }

    public final boolean zzl() {
        zzo();
        if (this.zzx != -9223372036854775807L) {
            return false;
        }
        zznt zznt = this.zzf;
        zznt.getClass();
        zznt.zze();
        return true;
    }
}
