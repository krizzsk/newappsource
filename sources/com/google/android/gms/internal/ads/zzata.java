package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;

public final class zzata {
    private Method zzA;
    private int zzB;
    private long zzC;
    private long zzD;
    private int zzE;
    private long zzF;
    private long zzG;
    private int zzH;
    private int zzI;
    private long zzJ;
    private long zzK;
    private long zzL;
    private float zzM;
    private zzash[] zzN;
    private ByteBuffer[] zzO;
    private ByteBuffer zzP;
    private ByteBuffer zzQ;
    private byte[] zzR;
    private int zzS;
    private int zzT;
    private boolean zzU;
    private boolean zzV;
    private int zzW;
    private boolean zzX;
    private long zzY;
    private final zzatb zza;
    private final zzath zzb;
    private final zzash[] zzc;
    private final zzasw zzd;
    /* access modifiers changed from: private */
    public final ConditionVariable zze = new ConditionVariable(true);
    private final long[] zzf;
    private final zzass zzg;
    private final LinkedList zzh;
    private AudioTrack zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private int zzo;
    private long zzp;
    private zzarw zzq;
    private zzarw zzr;
    private long zzs;
    private long zzt;
    private int zzu;
    private int zzv;
    private long zzw;
    private long zzx;
    private boolean zzy;
    private long zzz;

    public zzata(zzasf zzasf, zzash[] zzashArr, zzasw zzasw) {
        this.zzd = zzasw;
        if (zzazn.zza >= 18) {
            try {
                this.zzA = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (zzazn.zza >= 19) {
            this.zzg = new zzast();
        } else {
            this.zzg = new zzass((zzasr) null);
        }
        zzatb zzatb = new zzatb();
        this.zza = zzatb;
        zzath zzath = new zzath();
        this.zzb = zzath;
        zzash[] zzashArr2 = new zzash[3];
        this.zzc = zzashArr2;
        zzashArr2[0] = new zzatf();
        zzashArr2[1] = zzatb;
        System.arraycopy(zzashArr, 0, zzashArr2, 2, 0);
        zzashArr2[2] = zzath;
        this.zzf = new long[10];
        this.zzM = 1.0f;
        this.zzI = 0;
        this.zzW = 0;
        this.zzr = zzarw.zza;
        this.zzT = -1;
        this.zzN = new zzash[0];
        this.zzO = new ByteBuffer[0];
        this.zzh = new LinkedList();
    }

    private final long zzp(long j) {
        return (j * ((long) this.zzj)) / 1000000;
    }

    private final long zzq(long j) {
        return (j * 1000000) / ((long) this.zzj);
    }

    private final long zzr() {
        return this.zzn ? this.zzG : this.zzF / ((long) this.zzE);
    }

    private final void zzs(long j) throws zzasz {
        ByteBuffer byteBuffer;
        int length = this.zzN.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.zzO[i - 1];
            } else {
                byteBuffer = this.zzP;
                if (byteBuffer == null) {
                    byteBuffer = zzash.zza;
                }
            }
            if (i == length) {
                zzz(byteBuffer, j);
            } else {
                zzash zzash = this.zzN[i];
                zzash.zzf(byteBuffer);
                ByteBuffer zzc2 = zzash.zzc();
                this.zzO[i] = zzc2;
                if (zzc2.hasRemaining()) {
                    i++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
            } else {
                return;
            }
        }
    }

    private final void zzt() {
        ArrayList arrayList = new ArrayList();
        zzash[] zzashArr = this.zzc;
        for (int i = 0; i < 3; i++) {
            zzash zzash = zzashArr[i];
            if (zzash.zzi()) {
                arrayList.add(zzash);
            } else {
                zzash.zzd();
            }
        }
        int size = arrayList.size();
        this.zzN = (zzash[]) arrayList.toArray(new zzash[size]);
        this.zzO = new ByteBuffer[size];
        for (int i2 = 0; i2 < size; i2++) {
            zzash zzash2 = this.zzN[i2];
            zzash2.zzd();
            this.zzO[i2] = zzash2.zzc();
        }
    }

    private final void zzu() {
        this.zzw = 0;
        this.zzv = 0;
        this.zzu = 0;
        this.zzx = 0;
        this.zzy = false;
        this.zzz = 0;
    }

    private final void zzv() {
        if (zzx()) {
            if (zzazn.zza >= 21) {
                this.zzi.setVolume(this.zzM);
                return;
            }
            AudioTrack audioTrack = this.zzi;
            float f = this.zzM;
            audioTrack.setStereoVolume(f, f);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzw() throws com.google.android.gms.internal.ads.zzasz {
        /*
            r9 = this;
            int r0 = r9.zzT
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x0014
            boolean r0 = r9.zzn
            if (r0 == 0) goto L_0x000f
            com.google.android.gms.internal.ads.zzash[] r0 = r9.zzN
            int r0 = r0.length
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            r9.zzT = r0
        L_0x0012:
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            int r4 = r9.zzT
            com.google.android.gms.internal.ads.zzash[] r5 = r9.zzN
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x0038
            r4 = r5[r4]
            if (r0 == 0) goto L_0x0028
            r4.zze()
        L_0x0028:
            r9.zzs(r7)
            boolean r0 = r4.zzj()
            if (r0 != 0) goto L_0x0032
            return r3
        L_0x0032:
            int r0 = r9.zzT
            int r0 = r0 + r2
            r9.zzT = r0
            goto L_0x0012
        L_0x0038:
            java.nio.ByteBuffer r0 = r9.zzQ
            if (r0 == 0) goto L_0x0044
            r9.zzz(r0, r7)
            java.nio.ByteBuffer r0 = r9.zzQ
            if (r0 == 0) goto L_0x0044
            return r3
        L_0x0044:
            r9.zzT = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzata.zzw():boolean");
    }

    private final boolean zzx() {
        return this.zzi != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r4.zzm;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzy() {
        /*
            r4 = this;
            int r0 = com.google.android.gms.internal.ads.zzazn.zza
            r1 = 1
            r2 = 0
            r3 = 23
            if (r0 >= r3) goto L_0x0012
            int r0 = r4.zzm
            r3 = 5
            if (r0 == r3) goto L_0x0013
            r3 = 6
            if (r0 == r3) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            return r1
        L_0x0012:
            r1 = 0
        L_0x0013:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzata.zzy():boolean");
    }

    private final boolean zzz(ByteBuffer byteBuffer, long j) throws zzasz {
        int i;
        boolean z;
        if (!byteBuffer.hasRemaining()) {
            return true;
        }
        ByteBuffer byteBuffer2 = this.zzQ;
        if (byteBuffer2 != null) {
            if (byteBuffer2 == byteBuffer) {
                z = true;
            } else {
                z = false;
            }
            zzayy.zzc(z);
        } else {
            this.zzQ = byteBuffer;
            if (zzazn.zza < 21) {
                int remaining = byteBuffer.remaining();
                byte[] bArr = this.zzR;
                if (bArr == null || bArr.length < remaining) {
                    this.zzR = new byte[remaining];
                }
                int position = byteBuffer.position();
                byteBuffer.get(this.zzR, 0, remaining);
                byteBuffer.position(position);
                this.zzS = 0;
            }
        }
        int remaining2 = byteBuffer.remaining();
        if (zzazn.zza < 21) {
            int zza2 = this.zzo - ((int) (this.zzF - (this.zzg.zza() * ((long) this.zzE))));
            if (zza2 > 0) {
                i = this.zzi.write(this.zzR, this.zzS, Math.min(remaining2, zza2));
                if (i > 0) {
                    this.zzS += i;
                    byteBuffer.position(byteBuffer.position() + i);
                }
            } else {
                i = 0;
            }
        } else {
            i = this.zzi.write(byteBuffer, remaining2, 1);
        }
        this.zzY = SystemClock.elapsedRealtime();
        if (i >= 0) {
            boolean z2 = this.zzn;
            if (!z2) {
                this.zzF += (long) i;
            }
            if (i != remaining2) {
                return false;
            }
            if (z2) {
                this.zzG += (long) this.zzH;
            }
            this.zzQ = null;
            return true;
        }
        throw new zzasz(i);
    }

    public final long zza(boolean z) {
        long j;
        long j2;
        if (!zzx() || this.zzI == 0) {
            return Long.MIN_VALUE;
        }
        if (this.zzi.getPlayState() == 3) {
            long zzb2 = this.zzg.zzb();
            if (zzb2 != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.zzx >= 30000) {
                    long[] jArr = this.zzf;
                    int i = this.zzu;
                    jArr[i] = zzb2 - nanoTime;
                    this.zzu = (i + 1) % 10;
                    int i2 = this.zzv;
                    if (i2 < 10) {
                        this.zzv = i2 + 1;
                    }
                    this.zzx = nanoTime;
                    this.zzw = 0;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.zzv;
                        if (i3 >= i4) {
                            break;
                        }
                        this.zzw = (this.zzf[i3] / ((long) i4)) + this.zzw;
                        i3++;
                    }
                }
                if (!zzy() && nanoTime - this.zzz >= 500000) {
                    boolean zzh2 = this.zzg.zzh();
                    this.zzy = zzh2;
                    if (zzh2) {
                        long zzd2 = this.zzg.zzd() / 1000;
                        long zzc2 = this.zzg.zzc();
                        if (zzd2 < this.zzK) {
                            this.zzy = false;
                        } else if (Math.abs(zzd2 - nanoTime) > 5000000) {
                            this.zzy = false;
                        } else if (Math.abs(zzq(zzc2) - zzb2) > 5000000) {
                            this.zzy = false;
                        }
                    }
                    Method method = this.zzA;
                    if (method != null && !this.zzn) {
                        try {
                            long intValue = (((long) ((Integer) method.invoke(this.zzi, (Object[]) null)).intValue()) * 1000) - this.zzp;
                            this.zzL = intValue;
                            long max = Math.max(intValue, 0);
                            this.zzL = max;
                            if (max > 5000000) {
                                this.zzL = 0;
                            }
                        } catch (Exception unused) {
                            this.zzA = null;
                        }
                    }
                    this.zzz = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        if (this.zzy) {
            j = zzq(this.zzg.zzc() + zzp(nanoTime2 - (this.zzg.zzd() / 1000)));
        } else {
            if (this.zzv == 0) {
                j = this.zzg.zzb();
            } else {
                j = nanoTime2 + this.zzw;
            }
            if (!z) {
                j -= this.zzL;
            }
        }
        long j3 = this.zzJ;
        while (!this.zzh.isEmpty() && j >= ((zzasy) this.zzh.getFirst()).zzc) {
            zzasy zzasy = (zzasy) this.zzh.remove();
            this.zzr = zzasy.zza;
            this.zzt = zzasy.zzc;
            this.zzs = zzasy.zzb - this.zzJ;
        }
        if (this.zzr.zzb == 1.0f) {
            j2 = (j + this.zzs) - this.zzt;
        } else {
            if (this.zzh.isEmpty()) {
                zzath zzath = this.zzb;
                if (zzath.zzn() >= 1024) {
                    j2 = zzazn.zzj(j - this.zzt, zzath.zzm(), zzath.zzn()) + this.zzs;
                }
            }
            j2 = ((long) (((double) this.zzr.zzb) * ((double) (j - this.zzt)))) + this.zzs;
        }
        return j3 + j2;
    }

    public final zzarw zzc() {
        return this.zzr;
    }

    public final zzarw zzd(zzarw zzarw) {
        if (this.zzn) {
            zzarw zzarw2 = zzarw.zza;
            this.zzr = zzarw2;
            return zzarw2;
        }
        float zzl2 = this.zzb.zzl(zzarw.zzb);
        this.zzb.zzk(1.0f);
        zzarw zzarw3 = new zzarw(zzl2, 1.0f);
        zzarw zzarw4 = this.zzq;
        if (zzarw4 == null) {
            if (!this.zzh.isEmpty()) {
                zzarw4 = ((zzasy) this.zzh.getLast()).zza;
            } else {
                zzarw4 = this.zzr;
            }
        }
        if (!zzarw3.equals(zzarw4)) {
            if (zzx()) {
                this.zzq = zzarw3;
            } else {
                this.zzr = zzarw3;
            }
        }
        return this.zzr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00a6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zze(java.lang.String r7, int r8, int r9, int r10, int r11, int[] r12) throws com.google.android.gms.internal.ads.zzasu {
        /*
            r6 = this;
            int r7 = com.google.android.gms.internal.ads.zzazn.zzi(r10, r8)
            r6.zzB = r7
            com.google.android.gms.internal.ads.zzatb r7 = r6.zza
            r7.zzk(r12)
            com.google.android.gms.internal.ads.zzash[] r7 = r6.zzc
            r11 = 0
            r12 = 0
            r0 = 0
        L_0x0010:
            r1 = 3
            r2 = 2
            if (r12 >= r1) goto L_0x0033
            r1 = r7[r12]
            boolean r2 = r1.zzh(r9, r8, r10)     // Catch:{ zzasg -> 0x002c }
            r0 = r0 | r2
            boolean r2 = r1.zzi()
            if (r2 == 0) goto L_0x0029
            int r8 = r1.zza()
            r1.zzb()
            r10 = 2
        L_0x0029:
            int r12 = r12 + 1
            goto L_0x0010
        L_0x002c:
            r7 = move-exception
            com.google.android.gms.internal.ads.zzasu r8 = new com.google.android.gms.internal.ads.zzasu
            r8.<init>((java.lang.Throwable) r7)
            throw r8
        L_0x0033:
            if (r0 == 0) goto L_0x0038
            r6.zzt()
        L_0x0038:
            r7 = 252(0xfc, float:3.53E-43)
            switch(r8) {
                case 1: goto L_0x005e;
                case 2: goto L_0x005b;
                case 3: goto L_0x0058;
                case 4: goto L_0x0055;
                case 5: goto L_0x0052;
                case 6: goto L_0x004f;
                case 7: goto L_0x004c;
                case 8: goto L_0x0049;
                default: goto L_0x003d;
            }
        L_0x003d:
            com.google.android.gms.internal.ads.zzasu r7 = new com.google.android.gms.internal.ads.zzasu
            java.lang.String r9 = "Unsupported channel count: "
            java.lang.String r8 = p379.C16759e.m42349e(r9, r8)
            r7.<init>((java.lang.String) r8)
            throw r7
        L_0x0049:
            int r12 = com.google.android.gms.internal.ads.zzard.zza
            goto L_0x005f
        L_0x004c:
            r12 = 1276(0x4fc, float:1.788E-42)
            goto L_0x005f
        L_0x004f:
            r12 = 252(0xfc, float:3.53E-43)
            goto L_0x005f
        L_0x0052:
            r12 = 220(0xdc, float:3.08E-43)
            goto L_0x005f
        L_0x0055:
            r12 = 204(0xcc, float:2.86E-43)
            goto L_0x005f
        L_0x0058:
            r12 = 28
            goto L_0x005f
        L_0x005b:
            r12 = 12
            goto L_0x005f
        L_0x005e:
            r12 = 4
        L_0x005f:
            int r3 = com.google.android.gms.internal.ads.zzazn.zza
            r4 = 23
            if (r3 > r4) goto L_0x0085
            java.lang.String r4 = com.google.android.gms.internal.ads.zzazn.zzb
            java.lang.String r5 = "foster"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0085
            java.lang.String r4 = com.google.android.gms.internal.ads.zzazn.zzc
            java.lang.String r5 = "NVIDIA"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0085
            if (r8 == r1) goto L_0x0086
            r1 = 5
            if (r8 == r1) goto L_0x0086
            r7 = 7
            if (r8 == r7) goto L_0x0082
            goto L_0x0085
        L_0x0082:
            int r7 = com.google.android.gms.internal.ads.zzard.zza
            goto L_0x0086
        L_0x0085:
            r7 = r12
        L_0x0086:
            r12 = 25
            if (r3 > r12) goto L_0x0091
            java.lang.String r12 = com.google.android.gms.internal.ads.zzazn.zzb
            java.lang.String r1 = "fugu"
            r1.equals(r12)
        L_0x0091:
            if (r0 != 0) goto L_0x00a7
            boolean r12 = r6.zzx()
            if (r12 == 0) goto L_0x00a7
            int r12 = r6.zzl
            if (r12 != r10) goto L_0x00a7
            int r12 = r6.zzj
            if (r12 != r9) goto L_0x00a7
            int r12 = r6.zzk
            if (r12 == r7) goto L_0x00a6
            goto L_0x00a7
        L_0x00a6:
            return
        L_0x00a7:
            r6.zzk()
            r6.zzl = r10
            r6.zzn = r11
            r6.zzj = r9
            r6.zzk = r7
            r6.zzm = r2
            int r8 = com.google.android.gms.internal.ads.zzazn.zzi(r2, r8)
            r6.zzE = r8
            int r8 = r6.zzm
            int r7 = android.media.AudioTrack.getMinBufferSize(r9, r7, r8)
            r8 = -2
            if (r7 == r8) goto L_0x00c4
            r11 = 1
        L_0x00c4:
            com.google.android.gms.internal.ads.zzayy.zze(r11)
            int r8 = r7 * 4
            r9 = 250000(0x3d090, double:1.235164E-318)
            long r9 = r6.zzp(r9)
            int r11 = r6.zzE
            int r10 = (int) r9
            int r10 = r10 * r11
            long r0 = (long) r7
            r2 = 750000(0xb71b0, double:3.70549E-318)
            long r2 = r6.zzp(r2)
            long r11 = (long) r11
            long r2 = r2 * r11
            long r11 = java.lang.Math.max(r0, r2)
            int r7 = (int) r11
            if (r8 >= r10) goto L_0x00e9
            r8 = r10
            goto L_0x00ec
        L_0x00e9:
            if (r8 <= r7) goto L_0x00ec
            r8 = r7
        L_0x00ec:
            r6.zzo = r8
            int r7 = r6.zzE
            int r8 = r8 / r7
            long r7 = (long) r8
            long r7 = r6.zzq(r7)
            r6.zzp = r7
            com.google.android.gms.internal.ads.zzarw r7 = r6.zzr
            r6.zzd(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzata.zze(java.lang.String, int, int, int, int, int[]):void");
    }

    public final void zzf() {
        if (this.zzI == 1) {
            this.zzI = 2;
        }
    }

    public final void zzg() {
        this.zzV = false;
        if (zzx()) {
            zzu();
            this.zzg.zzf();
        }
    }

    public final void zzh() {
        this.zzV = true;
        if (zzx()) {
            this.zzK = System.nanoTime() / 1000;
            this.zzi.play();
        }
    }

    public final void zzi() throws zzasz {
        if (!this.zzU && zzx() && zzw()) {
            this.zzg.zze(zzr());
            this.zzU = true;
        }
    }

    public final void zzj() {
        zzk();
        zzash[] zzashArr = this.zzc;
        for (int i = 0; i < 3; i++) {
            zzashArr[i].zzg();
        }
        this.zzW = 0;
        this.zzV = false;
    }

    public final void zzk() {
        if (zzx()) {
            this.zzC = 0;
            this.zzD = 0;
            this.zzF = 0;
            this.zzG = 0;
            this.zzH = 0;
            zzarw zzarw = this.zzq;
            if (zzarw != null) {
                this.zzr = zzarw;
                this.zzq = null;
            } else if (!this.zzh.isEmpty()) {
                this.zzr = ((zzasy) this.zzh.getLast()).zza;
            }
            this.zzh.clear();
            this.zzs = 0;
            this.zzt = 0;
            this.zzP = null;
            this.zzQ = null;
            int i = 0;
            while (true) {
                zzash[] zzashArr = this.zzN;
                if (i >= zzashArr.length) {
                    break;
                }
                zzash zzash = zzashArr[i];
                zzash.zzd();
                this.zzO[i] = zzash.zzc();
                i++;
            }
            this.zzU = false;
            this.zzT = -1;
            this.zzI = 0;
            this.zzL = 0;
            zzu();
            if (this.zzi.getPlayState() == 3) {
                this.zzi.pause();
            }
            AudioTrack audioTrack = this.zzi;
            this.zzi = null;
            this.zzg.zzg((AudioTrack) null, false);
            this.zze.close();
            new zzasq(this, audioTrack).start();
        }
    }

    public final void zzl(float f) {
        if (this.zzM != f) {
            this.zzM = f;
            zzv();
        }
    }

    public final boolean zzm(ByteBuffer byteBuffer, long j) throws zzasv, zzasz {
        boolean z;
        long j2;
        int i;
        ByteBuffer byteBuffer2 = byteBuffer;
        long j3 = j;
        ByteBuffer byteBuffer3 = this.zzP;
        if (byteBuffer3 == null || byteBuffer2 == byteBuffer3) {
            z = true;
        } else {
            z = false;
        }
        zzayy.zzc(z);
        if (!zzx()) {
            this.zze.block();
            int i2 = this.zzW;
            if (i2 == 0) {
                this.zzi = new AudioTrack(3, this.zzj, this.zzk, this.zzm, this.zzo, 1);
            } else {
                this.zzi = new AudioTrack(3, this.zzj, this.zzk, this.zzm, this.zzo, 1, i2);
            }
            int state = this.zzi.getState();
            if (state == 1) {
                int audioSessionId = this.zzi.getAudioSessionId();
                if (this.zzW != audioSessionId) {
                    this.zzW = audioSessionId;
                    ((zzatd) this.zzd).zza.zzb.zzb(audioSessionId);
                }
                this.zzg.zzg(this.zzi, zzy());
                zzv();
                this.zzX = false;
                if (this.zzV) {
                    zzh();
                }
            } else {
                try {
                    this.zzi.release();
                } catch (Exception unused) {
                } finally {
                    this.zzi = null;
                }
                throw new zzasv(state, this.zzj, this.zzk, this.zzo);
            }
        }
        if (zzy()) {
            if (this.zzi.getPlayState() == 2) {
                this.zzX = false;
                return false;
            } else if (this.zzi.getPlayState() == 1 && this.zzg.zza() != 0) {
                return false;
            }
        }
        boolean z2 = this.zzX;
        boolean zzn2 = zzn();
        this.zzX = zzn2;
        if (z2 && !zzn2 && this.zzi.getPlayState() != 1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j4 = this.zzY;
            ((zzatd) this.zzd).zza.zzb.zzc(this.zzo, zzard.zzb(this.zzp), elapsedRealtime - j4);
        }
        if (this.zzP == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.zzn && this.zzH == 0) {
                int i3 = this.zzm;
                if (i3 == 7 || i3 == 8) {
                    int position = byteBuffer.position();
                    i = ((((byteBuffer2.get(position + 5) & 252) >> 2) | ((byteBuffer2.get(position + 4) & 1) << 6)) + 1) * 32;
                } else if (i3 == 5) {
                    i = 1536;
                } else if (i3 == 6) {
                    i = zzase.zza(byteBuffer);
                } else {
                    throw new IllegalStateException(C16759e.m42349e("Unexpected audio encoding: ", i3));
                }
                this.zzH = i;
            }
            if (this.zzq != null) {
                if (!zzw()) {
                    return false;
                }
                this.zzh.add(new zzasy(this.zzq, Math.max(0, j3), zzq(zzr()), (zzasx) null));
                this.zzq = null;
                zzt();
            }
            if (this.zzI == 0) {
                this.zzJ = Math.max(0, j3);
                this.zzI = 1;
            } else {
                long j5 = this.zzJ;
                if (this.zzn) {
                    j2 = this.zzD;
                } else {
                    j2 = this.zzC / ((long) this.zzB);
                }
                long zzq2 = j5 + zzq(j2);
                if (this.zzI == 1 && Math.abs(zzq2 - j3) > 200000) {
                    this.zzI = 2;
                }
                if (this.zzI == 2) {
                    this.zzJ = (j3 - zzq2) + this.zzJ;
                    this.zzI = 1;
                    ((zzatd) this.zzd).zza.zzh = true;
                }
            }
            if (this.zzn) {
                this.zzD += (long) this.zzH;
            } else {
                this.zzC += (long) byteBuffer.remaining();
            }
            this.zzP = byteBuffer2;
        }
        if (this.zzn) {
            zzz(this.zzP, j3);
        } else {
            zzs(j3);
        }
        if (this.zzP.hasRemaining()) {
            return false;
        }
        this.zzP = null;
        return true;
    }

    public final boolean zzn() {
        if (zzx()) {
            if (zzr() > this.zzg.zza()) {
                return true;
            }
            if (zzy() && this.zzi.getPlayState() == 2 && this.zzi.getPlaybackHeadPosition() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean zzo() {
        return !zzx() || (this.zzU && !zzn());
    }
}
