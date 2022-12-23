package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public abstract class zzqj extends zzgl {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private float zzA;
    private ArrayDeque zzB;
    private zzqi zzC;
    private zzqg zzD;
    private int zzE;
    private boolean zzF;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private boolean zzJ;
    private boolean zzK;
    private boolean zzL;
    private boolean zzM;
    private boolean zzN;
    private zzpz zzO;
    private long zzP;
    private int zzQ;
    private int zzR;
    private ByteBuffer zzS;
    private boolean zzT;
    private boolean zzU;
    private boolean zzV;
    private boolean zzW;
    private boolean zzX;
    private boolean zzY;
    private int zzZ;
    public zzgm zza;
    private int zzaa;
    private int zzab;
    private boolean zzac;
    private boolean zzad;
    private boolean zzae;
    private long zzaf;
    private long zzag;
    private boolean zzah;
    private boolean zzai;
    private boolean zzaj;
    private long zzak;
    private long zzal;
    private int zzam;
    private zzpk zzan;
    private zzpk zzao;
    private final zzqd zzc;
    private final zzql zzd;
    private final float zze;
    private final zzgc zzf = new zzgc(0, 0);
    private final zzgc zzg = new zzgc(0, 0);
    private final zzgc zzh = new zzgc(2, 0);
    private final zzpy zzi;
    private final zzed zzj;
    private final ArrayList zzk;
    private final MediaCodec.BufferInfo zzl;
    private final long[] zzm;
    private final long[] zzn;
    private final long[] zzo;
    private zzad zzp;
    private zzad zzq;
    private MediaCrypto zzr;
    private boolean zzs;
    private long zzt;
    private float zzu;
    private float zzv;
    private zzqe zzw;
    private zzad zzx;
    private MediaFormat zzy;
    private boolean zzz;

    public zzqj(int i, zzqd zzqd, zzql zzql, boolean z, float f) {
        super(i);
        this.zzc = zzqd;
        zzql.getClass();
        this.zzd = zzql;
        this.zze = f;
        zzpy zzpy = new zzpy();
        this.zzi = zzpy;
        this.zzj = new zzed(10);
        this.zzk = new ArrayList();
        this.zzl = new MediaCodec.BufferInfo();
        this.zzu = 1.0f;
        this.zzv = 1.0f;
        this.zzt = -9223372036854775807L;
        this.zzm = new long[10];
        this.zzn = new long[10];
        this.zzo = new long[10];
        this.zzak = -9223372036854775807L;
        this.zzal = -9223372036854775807L;
        zzpy.zzi(0);
        zzpy.zzb.order(ByteOrder.nativeOrder());
        this.zzA = -1.0f;
        this.zzE = 0;
        this.zzZ = 0;
        this.zzQ = -1;
        this.zzR = -1;
        this.zzP = -9223372036854775807L;
        this.zzaf = -9223372036854775807L;
        this.zzag = -9223372036854775807L;
        this.zzaa = 0;
        this.zzab = 0;
    }

    private final void zzT() {
        this.zzX = false;
        this.zzi.zzb();
        this.zzh.zzb();
        this.zzW = false;
        this.zzV = false;
    }

    private final void zzU() throws zzgu {
        if (this.zzac) {
            this.zzaa = 1;
            this.zzab = 3;
            return;
        }
        zzap();
        zzan();
    }

    private final void zzaA() throws zzgu {
        try {
            throw null;
        } catch (MediaCryptoException e) {
            throw zzbg(e, this.zzp, false, 6006);
        }
    }

    @TargetApi(23)
    private final boolean zzaB() throws zzgu {
        if (this.zzac) {
            this.zzaa = 1;
            if (this.zzG || this.zzI) {
                this.zzab = 3;
                return false;
            }
            this.zzab = 2;
        } else {
            zzaA();
        }
        return true;
    }

    private final boolean zzaC() throws zzgu {
        zzqe zzqe = this.zzw;
        if (zzqe == null || this.zzaa == 2 || this.zzah) {
            return false;
        }
        if (this.zzQ < 0) {
            int zza2 = zzqe.zza();
            this.zzQ = zza2;
            if (zza2 < 0) {
                return false;
            }
            this.zzg.zzb = this.zzw.zzf(zza2);
            this.zzg.zzb();
        }
        if (this.zzaa == 1) {
            if (!this.zzN) {
                this.zzad = true;
                this.zzw.zzj(this.zzQ, 0, 0, 0, 4);
                zzay();
            }
            this.zzaa = 2;
            return false;
        } else if (this.zzL) {
            this.zzL = false;
            this.zzg.zzb.put(zzb);
            this.zzw.zzj(this.zzQ, 0, 38, 0, 0);
            zzay();
            this.zzac = true;
            return true;
        } else {
            if (this.zzZ == 1) {
                for (int i = 0; i < this.zzx.zzo.size(); i++) {
                    this.zzg.zzb.put((byte[]) this.zzx.zzo.get(i));
                }
                this.zzZ = 2;
            }
            int position = this.zzg.zzb.position();
            zzja zzh2 = zzh();
            try {
                int zzbf = zzbf(zzh2, this.zzg, 0);
                if (zzG()) {
                    this.zzag = this.zzaf;
                }
                if (zzbf == -3) {
                    return false;
                }
                if (zzbf == -5) {
                    if (this.zzZ == 2) {
                        this.zzg.zzb();
                        this.zzZ = 1;
                    }
                    zzS(zzh2);
                    return true;
                }
                zzgc zzgc = this.zzg;
                if (zzgc.zzg()) {
                    if (this.zzZ == 2) {
                        zzgc.zzb();
                        this.zzZ = 1;
                    }
                    this.zzah = true;
                    if (!this.zzac) {
                        zzax();
                        return false;
                    }
                    try {
                        if (!this.zzN) {
                            this.zzad = true;
                            this.zzw.zzj(this.zzQ, 0, 0, 0, 4);
                            zzay();
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e) {
                        throw zzbg(e, this.zzp, false, zzeg.zzl(e.getErrorCode()));
                    }
                } else if (this.zzac || zzgc.zzh()) {
                    boolean zzk2 = zzgc.zzk();
                    if (zzk2) {
                        zzgc.zza.zzb(position);
                    }
                    if (this.zzF && !zzk2) {
                        ByteBuffer byteBuffer = this.zzg.zzb;
                        byte[] bArr = zzzp.zza;
                        int position2 = byteBuffer.position();
                        int i2 = 0;
                        int i3 = 0;
                        while (true) {
                            int i4 = i2 + 1;
                            if (i4 >= position2) {
                                byteBuffer.clear();
                                break;
                            }
                            byte b = byteBuffer.get(i2) & 255;
                            if (i3 == 3) {
                                if (b == 1) {
                                    if ((byteBuffer.get(i4) & 31) == 7) {
                                        ByteBuffer duplicate = byteBuffer.duplicate();
                                        duplicate.position(i2 - 3);
                                        duplicate.limit(position2);
                                        byteBuffer.position(0);
                                        byteBuffer.put(duplicate);
                                        break;
                                    }
                                    b = 1;
                                }
                            } else if (b == 0) {
                                i3++;
                            }
                            if (b != 0) {
                                i3 = 0;
                            }
                            i2 = i4;
                        }
                        if (this.zzg.zzb.position() == 0) {
                            return true;
                        }
                        this.zzF = false;
                    }
                    zzgc zzgc2 = this.zzg;
                    long j = zzgc2.zzd;
                    zzpz zzpz = this.zzO;
                    if (zzpz != null) {
                        j = zzpz.zzb(this.zzp, zzgc2);
                        this.zzaf = Math.max(this.zzaf, this.zzO.zza(this.zzp));
                    }
                    long j2 = j;
                    if (this.zzg.zzf()) {
                        this.zzk.add(Long.valueOf(j2));
                    }
                    if (this.zzaj) {
                        this.zzj.zzd(j2, this.zzp);
                        this.zzaj = false;
                    }
                    this.zzaf = Math.max(this.zzaf, j2);
                    this.zzg.zzj();
                    zzgc zzgc3 = this.zzg;
                    if (zzgc3.zze()) {
                        zzam(zzgc3);
                    }
                    zzad(this.zzg);
                    if (zzk2) {
                        try {
                            this.zzw.zzk(this.zzQ, 0, this.zzg.zza, j2, 0);
                        } catch (MediaCodec.CryptoException e2) {
                            throw zzbg(e2, this.zzp, false, zzeg.zzl(e2.getErrorCode()));
                        }
                    } else {
                        this.zzw.zzj(this.zzQ, 0, this.zzg.zzb.limit(), j2, 0);
                    }
                    zzay();
                    this.zzac = true;
                    this.zzZ = 0;
                    this.zza.zzc++;
                    return true;
                } else {
                    zzgc.zzb();
                    if (this.zzZ == 2) {
                        this.zzZ = 1;
                    }
                    return true;
                }
            } catch (zzgb e3) {
                zzX(e3);
                zzaE(0);
                zzab();
                return true;
            }
        }
    }

    private final boolean zzaD() {
        return this.zzR >= 0;
    }

    private final boolean zzaE(int i) throws zzgu {
        zzja zzh2 = zzh();
        this.zzf.zzb();
        int zzbf = zzbf(zzh2, this.zzf, i | 4);
        if (zzbf == -5) {
            zzS(zzh2);
            return true;
        } else if (zzbf != -4 || !this.zzf.zzg()) {
            return false;
        } else {
            this.zzah = true;
            zzax();
            return false;
        }
    }

    private final boolean zzaF(long j) {
        return this.zzt == -9223372036854775807L || SystemClock.elapsedRealtime() - j < this.zzt;
    }

    private final boolean zzaG(zzad zzad2) throws zzgu {
        if (!(zzeg.zza < 23 || this.zzw == null || this.zzab == 3 || zzbe() == 0)) {
            float zzP2 = zzP(this.zzv, zzad2, zzJ());
            float f = this.zzA;
            if (f == zzP2) {
                return true;
            }
            if (zzP2 == -1.0f) {
                zzU();
                return false;
            } else if (f == -1.0f && zzP2 <= this.zze) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", zzP2);
                this.zzw.zzp(bundle);
                this.zzA = zzP2;
            }
        }
        return true;
    }

    private final void zzab() {
        try {
            this.zzw.zzi();
        } finally {
            zzaq();
        }
    }

    public static boolean zzav(zzad zzad2) {
        return zzad2.zzF == 0;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0190, code lost:
        if ("stvm8".equals(r5) == false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01a0, code lost:
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r2) == false) goto L_0x01a3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x027f A[SYNTHETIC, Splitter:B:149:0x027f] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzaw(com.google.android.gms.internal.ads.zzqg r17, android.media.MediaCrypto r18) throws java.lang.Exception {
        /*
            r16 = this;
            r8 = r16
            r0 = r17
            java.lang.String r1 = "createCodec:"
            java.lang.String r2 = r0.zza
            int r3 = com.google.android.gms.internal.ads.zzeg.zza
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 23
            if (r3 >= r5) goto L_0x0013
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x001f
        L_0x0013:
            float r6 = r8.zzv
            com.google.android.gms.internal.ads.zzad r7 = r8.zzp
            com.google.android.gms.internal.ads.zzad[] r9 = r16.zzJ()
            float r6 = r8.zzP(r6, r7, r9)
        L_0x001f:
            float r7 = r8.zze
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 > 0) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r4 = r6
        L_0x0027:
            long r6 = android.os.SystemClock.elapsedRealtime()
            com.google.android.gms.internal.ads.zzad r9 = r8.zzp
            r10 = 0
            com.google.android.gms.internal.ads.zzqc r9 = r8.zzV(r0, r9, r10, r4)
            r11 = 31
            if (r3 < r11) goto L_0x003d
            com.google.android.gms.internal.ads.zzmv r12 = r16.zzl()
            com.google.android.gms.internal.ads.zzqh.zza(r9, r12)
        L_0x003d:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0283 }
            r12.<init>()     // Catch:{ all -> 0x0283 }
            r12.append(r1)     // Catch:{ all -> 0x0283 }
            r12.append(r2)     // Catch:{ all -> 0x0283 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0283 }
            android.os.Trace.beginSection(r12)     // Catch:{ all -> 0x0283 }
            r12 = 0
            if (r3 < r5) goto L_0x006f
            if (r3 < r11) goto L_0x006f
            com.google.android.gms.internal.ads.zzad r1 = r9.zzc     // Catch:{ all -> 0x0283 }
            java.lang.String r1 = r1.zzm     // Catch:{ all -> 0x0283 }
            int r1 = com.google.android.gms.internal.ads.zzbo.zzb(r1)     // Catch:{ all -> 0x0283 }
            java.lang.String r10 = com.google.android.gms.internal.ads.zzeg.zzN(r1)     // Catch:{ all -> 0x0283 }
            java.lang.String r11 = "Creating an asynchronous MediaCodec adapter for track type "
            r11.concat(r10)     // Catch:{ all -> 0x0283 }
            com.google.android.gms.internal.ads.zzpp r10 = new com.google.android.gms.internal.ads.zzpp     // Catch:{ all -> 0x0283 }
            r10.<init>(r1, r12)     // Catch:{ all -> 0x0283 }
            com.google.android.gms.internal.ads.zzpr r1 = r10.zzc(r9)     // Catch:{ all -> 0x0283 }
            goto L_0x00a8
        L_0x006f:
            com.google.android.gms.internal.ads.zzqg r11 = r9.zza     // Catch:{ IOException -> 0x027c, RuntimeException -> 0x027a }
            r11.getClass()
            java.lang.String r11 = r11.zza     // Catch:{ IOException -> 0x027c, RuntimeException -> 0x027a }
            java.lang.String r13 = java.lang.String.valueOf(r11)     // Catch:{ IOException -> 0x027c, RuntimeException -> 0x027a }
            java.lang.String r1 = r1.concat(r13)     // Catch:{ IOException -> 0x027c, RuntimeException -> 0x027a }
            android.os.Trace.beginSection(r1)     // Catch:{ IOException -> 0x027c, RuntimeException -> 0x027a }
            android.media.MediaCodec r1 = android.media.MediaCodec.createByCodecName(r11)     // Catch:{ IOException -> 0x027c, RuntimeException -> 0x027a }
            android.os.Trace.endSection()     // Catch:{ IOException -> 0x027c, RuntimeException -> 0x027a }
            java.lang.String r11 = "configureCodec"
            android.os.Trace.beginSection(r11)     // Catch:{ IOException -> 0x0277, RuntimeException -> 0x0275 }
            android.media.MediaFormat r11 = r9.zzb     // Catch:{ IOException -> 0x0277, RuntimeException -> 0x0275 }
            android.view.Surface r13 = r9.zzd     // Catch:{ IOException -> 0x0277, RuntimeException -> 0x0275 }
            r1.configure(r11, r13, r10, r12)     // Catch:{ IOException -> 0x0277, RuntimeException -> 0x0275 }
            android.os.Trace.endSection()     // Catch:{ IOException -> 0x0277, RuntimeException -> 0x0275 }
            java.lang.String r11 = "startCodec"
            android.os.Trace.beginSection(r11)     // Catch:{ IOException -> 0x0277, RuntimeException -> 0x0275 }
            r1.start()     // Catch:{ IOException -> 0x0277, RuntimeException -> 0x0275 }
            android.os.Trace.endSection()     // Catch:{ IOException -> 0x0277, RuntimeException -> 0x0275 }
            com.google.android.gms.internal.ads.zzra r11 = new com.google.android.gms.internal.ads.zzra     // Catch:{ IOException -> 0x0277, RuntimeException -> 0x0275 }
            r11.<init>(r1, r10)     // Catch:{ IOException -> 0x0277, RuntimeException -> 0x0275 }
            r1 = r11
        L_0x00a8:
            r8.zzw = r1     // Catch:{ all -> 0x0283 }
            android.os.Trace.endSection()
            long r10 = android.os.SystemClock.elapsedRealtime()
            r8.zzD = r0
            r8.zzA = r4
            com.google.android.gms.internal.ads.zzad r1 = r8.zzp
            r8.zzx = r1
            java.lang.String r1 = "OMX.Exynos.avc.dec.secure"
            r4 = 25
            if (r3 > r4) goto L_0x00e9
            boolean r15 = r1.equals(r2)
            if (r15 == 0) goto L_0x00e9
            java.lang.String r15 = com.google.android.gms.internal.ads.zzeg.zzd
            java.lang.String r12 = "SM-T585"
            boolean r12 = r15.startsWith(r12)
            if (r12 != 0) goto L_0x00e7
            java.lang.String r12 = "SM-A510"
            boolean r12 = r15.startsWith(r12)
            if (r12 != 0) goto L_0x00e7
            java.lang.String r12 = "SM-A520"
            boolean r12 = r15.startsWith(r12)
            if (r12 != 0) goto L_0x00e7
            java.lang.String r12 = "SM-J700"
            boolean r12 = r15.startsWith(r12)
            if (r12 == 0) goto L_0x00e9
        L_0x00e7:
            r12 = 2
            goto L_0x0122
        L_0x00e9:
            r12 = 24
            if (r3 >= r12) goto L_0x0121
            java.lang.String r12 = "OMX.Nvidia.h264.decode"
            boolean r12 = r12.equals(r2)
            if (r12 != 0) goto L_0x00fd
            java.lang.String r12 = "OMX.Nvidia.h264.decode.secure"
            boolean r12 = r12.equals(r2)
            if (r12 == 0) goto L_0x0121
        L_0x00fd:
            java.lang.String r12 = com.google.android.gms.internal.ads.zzeg.zzb
            java.lang.String r15 = "flounder"
            boolean r15 = r15.equals(r12)
            if (r15 != 0) goto L_0x011f
            java.lang.String r15 = "flounder_lte"
            boolean r15 = r15.equals(r12)
            if (r15 != 0) goto L_0x011f
            java.lang.String r15 = "grouper"
            boolean r15 = r15.equals(r12)
            if (r15 != 0) goto L_0x011f
            java.lang.String r15 = "tilapia"
            boolean r12 = r15.equals(r12)
            if (r12 == 0) goto L_0x0121
        L_0x011f:
            r12 = 1
            goto L_0x0122
        L_0x0121:
            r12 = 0
        L_0x0122:
            r8.zzE = r12
            com.google.android.gms.internal.ads.zzad r12 = r8.zzx
            r15 = 21
            if (r3 >= r15) goto L_0x013c
            java.util.List r12 = r12.zzo
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x013c
            java.lang.String r12 = "OMX.MTK.VIDEO.DECODER.AVC"
            boolean r12 = r12.equals(r2)
            if (r12 == 0) goto L_0x013c
            r12 = 1
            goto L_0x013d
        L_0x013c:
            r12 = 0
        L_0x013d:
            r8.zzF = r12
            r12 = 19
            if (r3 != r12) goto L_0x015d
            java.lang.String r14 = com.google.android.gms.internal.ads.zzeg.zzd
            java.lang.String r13 = "SM-G800"
            boolean r13 = r14.startsWith(r13)
            if (r13 == 0) goto L_0x015d
            java.lang.String r13 = "OMX.Exynos.avc.dec"
            boolean r13 = r13.equals(r2)
            if (r13 != 0) goto L_0x015b
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x015d
        L_0x015b:
            r1 = 1
            goto L_0x015e
        L_0x015d:
            r1 = 0
        L_0x015e:
            r8.zzG = r1
            r1 = 29
            if (r3 != r1) goto L_0x016e
            java.lang.String r13 = "c2.android.aac.decoder"
            boolean r13 = r13.equals(r2)
            if (r13 == 0) goto L_0x016e
            r13 = 1
            goto L_0x016f
        L_0x016e:
            r13 = 0
        L_0x016f:
            r8.zzH = r13
            if (r3 > r5) goto L_0x017e
            java.lang.String r5 = "OMX.google.vorbis.decoder"
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L_0x017c
            goto L_0x017e
        L_0x017c:
            r5 = 1
            goto L_0x01a4
        L_0x017e:
            if (r3 > r12) goto L_0x01a3
            java.lang.String r5 = com.google.android.gms.internal.ads.zzeg.zzb
            java.lang.String r12 = "hb2000"
            boolean r12 = r12.equals(r5)
            if (r12 != 0) goto L_0x0192
            java.lang.String r12 = "stvm8"
            boolean r5 = r12.equals(r5)
            if (r5 == 0) goto L_0x01a3
        L_0x0192:
            java.lang.String r5 = "OMX.amlogic.avc.decoder.awesome"
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L_0x017c
            java.lang.String r5 = "OMX.amlogic.avc.decoder.awesome.secure"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x01a3
            goto L_0x017c
        L_0x01a3:
            r5 = 0
        L_0x01a4:
            r8.zzI = r5
            if (r3 != r15) goto L_0x01b2
            java.lang.String r5 = "OMX.google.aac.decoder"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x01b2
            r5 = 1
            goto L_0x01b3
        L_0x01b2:
            r5 = 0
        L_0x01b3:
            r8.zzJ = r5
            if (r3 >= r15) goto L_0x01fd
            java.lang.String r5 = "OMX.SEC.mp3.dec"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x01fd
            java.lang.String r5 = com.google.android.gms.internal.ads.zzeg.zzc
            java.lang.String r12 = "samsung"
            boolean r5 = r12.equals(r5)
            if (r5 == 0) goto L_0x01fd
            java.lang.String r5 = com.google.android.gms.internal.ads.zzeg.zzb
            java.lang.String r12 = "baffin"
            boolean r12 = r5.startsWith(r12)
            if (r12 != 0) goto L_0x01fb
            java.lang.String r12 = "grand"
            boolean r12 = r5.startsWith(r12)
            if (r12 != 0) goto L_0x01fb
            java.lang.String r12 = "fortuna"
            boolean r12 = r5.startsWith(r12)
            if (r12 != 0) goto L_0x01fb
            java.lang.String r12 = "gprimelte"
            boolean r12 = r5.startsWith(r12)
            if (r12 != 0) goto L_0x01fb
            java.lang.String r12 = "j2y18lte"
            boolean r12 = r5.startsWith(r12)
            if (r12 != 0) goto L_0x01fb
            java.lang.String r12 = "ms01"
            boolean r5 = r5.startsWith(r12)
            if (r5 == 0) goto L_0x01fd
        L_0x01fb:
            r5 = 1
            goto L_0x01fe
        L_0x01fd:
            r5 = 0
        L_0x01fe:
            r8.zzK = r5
            java.lang.String r5 = r0.zza
            if (r3 > r4) goto L_0x020f
            java.lang.String r4 = "OMX.rk.video_decoder.avc"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x020d
            goto L_0x020f
        L_0x020d:
            r12 = 1
            goto L_0x023b
        L_0x020f:
            if (r3 > r1) goto L_0x0221
            java.lang.String r1 = "OMX.broadcom.video_decoder.tunnel"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x020d
            java.lang.String r1 = "OMX.broadcom.video_decoder.tunnel.secure"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x020d
        L_0x0221:
            java.lang.String r1 = com.google.android.gms.internal.ads.zzeg.zzc
            java.lang.String r3 = "Amazon"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x023a
            java.lang.String r1 = com.google.android.gms.internal.ads.zzeg.zzd
            java.lang.String r3 = "AFTS"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x023a
            boolean r1 = r0.zzf
            if (r1 == 0) goto L_0x023a
            goto L_0x020d
        L_0x023a:
            r12 = 0
        L_0x023b:
            r8.zzN = r12
            com.google.android.gms.internal.ads.zzqe r1 = r8.zzw
            r1.zzr()
            java.lang.String r0 = r0.zza
            java.lang.String r1 = "c2.android.mp3.decoder"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0253
            com.google.android.gms.internal.ads.zzpz r0 = new com.google.android.gms.internal.ads.zzpz
            r0.<init>()
            r8.zzO = r0
        L_0x0253:
            int r0 = r16.zzbe()
            r1 = 2
            if (r0 != r1) goto L_0x0263
            long r0 = android.os.SystemClock.elapsedRealtime()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 + r3
            r8.zzP = r0
        L_0x0263:
            com.google.android.gms.internal.ads.zzgm r0 = r8.zza
            int r1 = r0.zza
            r3 = 1
            int r1 = r1 + r3
            r0.zza = r1
            long r6 = r10 - r6
            r1 = r16
            r3 = r9
            r4 = r10
            r1.zzY(r2, r3, r4, r6)
            return
        L_0x0275:
            r0 = move-exception
            goto L_0x0278
        L_0x0277:
            r0 = move-exception
        L_0x0278:
            r10 = r1
            goto L_0x027d
        L_0x027a:
            r0 = move-exception
            goto L_0x027d
        L_0x027c:
            r0 = move-exception
        L_0x027d:
            if (r10 == 0) goto L_0x0282
            r10.release()     // Catch:{ all -> 0x0283 }
        L_0x0282:
            throw r0     // Catch:{ all -> 0x0283 }
        L_0x0283:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqj.zzaw(com.google.android.gms.internal.ads.zzqg, android.media.MediaCrypto):void");
    }

    @TargetApi(23)
    private final void zzax() throws zzgu {
        int i = this.zzab;
        if (i == 1) {
            zzab();
        } else if (i == 2) {
            zzab();
            zzaA();
        } else if (i != 3) {
            this.zzai = true;
            zzae();
        } else {
            zzap();
            zzan();
        }
    }

    private final void zzay() {
        this.zzQ = -1;
        this.zzg.zzb = null;
    }

    private final void zzaz() {
        this.zzR = -1;
        this.zzS = null;
    }

    public void zzD(float f, float f2) throws zzgu {
        this.zzu = f;
        this.zzv = f2;
        zzaG(this.zzx);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: com.google.android.gms.internal.ads.zzqj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.android.gms.internal.ads.zzqj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.google.android.gms.internal.ads.zzqj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: com.google.android.gms.internal.ads.zzqj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: com.google.android.gms.internal.ads.zzqe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: com.google.android.gms.internal.ads.zzqj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: android.media.MediaFormat} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v34, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v17, resolved type: com.google.android.gms.internal.ads.zzqj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v70, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v26, resolved type: com.google.android.gms.internal.ads.zzqj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v27, resolved type: com.google.android.gms.internal.ads.zzqj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v71, resolved type: com.google.android.gms.internal.ads.zzqj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v74, resolved type: com.google.android.gms.internal.ads.zzqj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v75, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v82, resolved type: com.google.android.gms.internal.ads.zzqj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v31, resolved type: com.google.android.gms.internal.ads.zzad} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v83, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v84, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v86, resolved type: com.google.android.gms.internal.ads.zzqj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v87, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v88, resolved type: com.google.android.gms.internal.ads.zzqj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v90, resolved type: com.google.android.gms.internal.ads.zzqj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v91, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v92, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v93, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v94, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v95, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v38, resolved type: com.google.android.gms.internal.ads.zzad} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v39, resolved type: com.google.android.gms.internal.ads.zzqj} */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:84|85|(1:87)(0)|88|260|(1:195)|199|210|211) */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0260, code lost:
        if (r15.zzq != null) goto L_0x0262;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02ac, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:?, code lost:
        zzax();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x02af, code lost:
        r15 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02b1, code lost:
        r1 = r1;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x02b3, code lost:
        if (r15.zzai != false) goto L_0x02b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02b5, code lost:
        zzap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x02b8, code lost:
        r1 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x02bc, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x032d, code lost:
        r0 = e;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0150, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        zzax();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0155, code lost:
        if (r15.zzai != false) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0157, code lost:
        zzap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x015a, code lost:
        r2 = r9;
        r1 = r15;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:165:0x02ac */
    /* JADX WARNING: Missing exception handler attribute for start block: B:84:0x0150 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01a3 A[Catch:{ IllegalStateException -> 0x0352 }] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x030e A[Catch:{ IllegalStateException -> 0x034f }, LOOP:2: B:75:0x0139->B:193:0x030e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0318 A[Catch:{ IllegalStateException -> 0x034f }, LOOP:4: B:195:0x0318->B:198:0x0322, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x030d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0315 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x016a A[Catch:{ IllegalStateException -> 0x0352 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzL(long r24, long r26) throws com.google.android.gms.internal.ads.zzgu {
        /*
            r23 = this;
            r15 = r23
            r14 = 1
            r13 = 0
            boolean r0 = r15.zzai     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x000c
            r23.zzae()     // Catch:{ IllegalStateException -> 0x0352 }
            return
        L_0x000c:
            com.google.android.gms.internal.ads.zzad r0 = r15.zzp     // Catch:{ IllegalStateException -> 0x0352 }
            r11 = 2
            if (r0 != 0) goto L_0x0019
            boolean r0 = r15.zzaE(r11)     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            return
        L_0x0019:
            r23.zzan()     // Catch:{ IllegalStateException -> 0x0352 }
            boolean r0 = r15.zzV     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x012a
            java.lang.String r0 = "bypassRender"
            int r1 = com.google.android.gms.internal.ads.zzeg.zza     // Catch:{ IllegalStateException -> 0x0352 }
            android.os.Trace.beginSection(r0)     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x0027:
            boolean r0 = r15.zzai     // Catch:{ IllegalStateException -> 0x0352 }
            r0 = r0 ^ r14
            com.google.android.gms.internal.ads.zzcw.zzf(r0)     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzpy r0 = r15.zzi     // Catch:{ IllegalStateException -> 0x0352 }
            boolean r1 = r0.zzp()     // Catch:{ IllegalStateException -> 0x0352 }
            if (r1 == 0) goto L_0x007b
            java.nio.ByteBuffer r7 = r0.zzb     // Catch:{ IllegalStateException -> 0x0352 }
            int r8 = r15.zzR     // Catch:{ IllegalStateException -> 0x0352 }
            int r10 = r0.zzl()     // Catch:{ IllegalStateException -> 0x0352 }
            long r11 = r0.zzd     // Catch:{ IllegalStateException -> 0x0352 }
            boolean r16 = r0.zzf()     // Catch:{ IllegalStateException -> 0x0352 }
            r6 = 0
            r9 = 0
            boolean r0 = r0.zzg()     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzad r4 = r15.zzq     // Catch:{ IllegalStateException -> 0x0352 }
            r1 = r23
            r2 = r24
            r17 = r4
            r4 = r26
            r13 = r16
            r14 = r0
            r15 = r17
            boolean r0 = r1.zzaf(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch:{ IllegalStateException -> 0x0075 }
            if (r0 == 0) goto L_0x006f
            r15 = r23
            com.google.android.gms.internal.ads.zzpy r0 = r15.zzi     // Catch:{ IllegalStateException -> 0x0352 }
            long r0 = r0.zzm()     // Catch:{ IllegalStateException -> 0x0352 }
            r15.zzao(r0)     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzpy r0 = r15.zzi     // Catch:{ IllegalStateException -> 0x0352 }
            r0.zzb()     // Catch:{ IllegalStateException -> 0x0352 }
            goto L_0x007b
        L_0x006f:
            r15 = r23
            r13 = 0
            r14 = 1
            goto L_0x0121
        L_0x0075:
            r0 = move-exception
            r2 = 1
            r19 = 0
            goto L_0x02be
        L_0x007b:
            boolean r0 = r15.zzah     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x0085
            r14 = 1
            r15.zzai = r14     // Catch:{ IllegalStateException -> 0x0352 }
            r13 = 0
            goto L_0x0121
        L_0x0085:
            r14 = 1
            boolean r0 = r15.zzW     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x0099
            com.google.android.gms.internal.ads.zzpy r0 = r15.zzi     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzgc r1 = r15.zzh     // Catch:{ IllegalStateException -> 0x0352 }
            boolean r0 = r0.zzo(r1)     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzcw.zzf(r0)     // Catch:{ IllegalStateException -> 0x0352 }
            r13 = 0
            r15.zzW = r13     // Catch:{ IllegalStateException -> 0x0352 }
            goto L_0x009a
        L_0x0099:
            r13 = 0
        L_0x009a:
            boolean r0 = r15.zzX     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x00b2
            com.google.android.gms.internal.ads.zzpy r0 = r15.zzi     // Catch:{ IllegalStateException -> 0x0352 }
            boolean r0 = r0.zzp()     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 != 0) goto L_0x0027
            r23.zzT()     // Catch:{ IllegalStateException -> 0x0352 }
            r15.zzX = r13     // Catch:{ IllegalStateException -> 0x0352 }
            r23.zzan()     // Catch:{ IllegalStateException -> 0x0352 }
            boolean r0 = r15.zzV     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x0121
        L_0x00b2:
            boolean r0 = r15.zzah     // Catch:{ IllegalStateException -> 0x0352 }
            r0 = r0 ^ r14
            com.google.android.gms.internal.ads.zzcw.zzf(r0)     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzja r0 = r23.zzh()     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzgc r1 = r15.zzh     // Catch:{ IllegalStateException -> 0x0352 }
            r1.zzb()     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x00c1:
            com.google.android.gms.internal.ads.zzgc r1 = r15.zzh     // Catch:{ IllegalStateException -> 0x0352 }
            r1.zzb()     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzgc r1 = r15.zzh     // Catch:{ IllegalStateException -> 0x0352 }
            int r1 = r15.zzbf(r0, r1, r13)     // Catch:{ IllegalStateException -> 0x0352 }
            r2 = -5
            if (r1 == r2) goto L_0x0101
            r2 = -4
            if (r1 == r2) goto L_0x00d3
            goto L_0x0104
        L_0x00d3:
            com.google.android.gms.internal.ads.zzgc r1 = r15.zzh     // Catch:{ IllegalStateException -> 0x0352 }
            boolean r1 = r1.zzg()     // Catch:{ IllegalStateException -> 0x0352 }
            if (r1 == 0) goto L_0x00de
            r15.zzah = r14     // Catch:{ IllegalStateException -> 0x0352 }
            goto L_0x0104
        L_0x00de:
            boolean r1 = r15.zzaj     // Catch:{ IllegalStateException -> 0x0352 }
            if (r1 == 0) goto L_0x00ef
            com.google.android.gms.internal.ads.zzad r1 = r15.zzp     // Catch:{ IllegalStateException -> 0x0352 }
            r1.getClass()
            r15.zzq = r1     // Catch:{ IllegalStateException -> 0x0352 }
            r2 = 0
            r15.zzaa(r1, r2)     // Catch:{ IllegalStateException -> 0x0352 }
            r15.zzaj = r13     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x00ef:
            com.google.android.gms.internal.ads.zzgc r1 = r15.zzh     // Catch:{ IllegalStateException -> 0x0352 }
            r1.zzj()     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzpy r1 = r15.zzi     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzgc r2 = r15.zzh     // Catch:{ IllegalStateException -> 0x0352 }
            boolean r1 = r1.zzo(r2)     // Catch:{ IllegalStateException -> 0x0352 }
            if (r1 != 0) goto L_0x00c1
            r15.zzW = r14     // Catch:{ IllegalStateException -> 0x0352 }
            goto L_0x0104
        L_0x0101:
            r15.zzS(r0)     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x0104:
            com.google.android.gms.internal.ads.zzpy r0 = r15.zzi     // Catch:{ IllegalStateException -> 0x0352 }
            boolean r1 = r0.zzp()     // Catch:{ IllegalStateException -> 0x0352 }
            if (r1 == 0) goto L_0x010f
            r0.zzj()     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x010f:
            com.google.android.gms.internal.ads.zzpy r0 = r15.zzi     // Catch:{ IllegalStateException -> 0x0352 }
            boolean r0 = r0.zzp()     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 != 0) goto L_0x0027
            boolean r0 = r15.zzah     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 != 0) goto L_0x0027
            boolean r0 = r15.zzX     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x0121
            goto L_0x0027
        L_0x0121:
            android.os.Trace.endSection()     // Catch:{ IllegalStateException -> 0x0352 }
            r1 = r15
            r2 = 1
            r19 = 0
            goto L_0x0347
        L_0x012a:
            com.google.android.gms.internal.ads.zzqe r0 = r15.zzw     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x0335
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x0330 }
            java.lang.String r0 = "drainAndFeed"
            int r1 = com.google.android.gms.internal.ads.zzeg.zza     // Catch:{ IllegalStateException -> 0x0330 }
            android.os.Trace.beginSection(r0)     // Catch:{ IllegalStateException -> 0x0330 }
        L_0x0139:
            boolean r0 = r23.zzaD()     // Catch:{ IllegalStateException -> 0x0330 }
            if (r0 != 0) goto L_0x026b
            boolean r0 = r15.zzJ     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x0160
            boolean r0 = r15.zzad     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x0160
            com.google.android.gms.internal.ads.zzqe r0 = r15.zzw     // Catch:{ IllegalStateException -> 0x0150 }
            android.media.MediaCodec$BufferInfo r1 = r15.zzl     // Catch:{ IllegalStateException -> 0x0150 }
            int r0 = r0.zzb(r1)     // Catch:{ IllegalStateException -> 0x0150 }
            goto L_0x0168
        L_0x0150:
            r23.zzax()     // Catch:{ IllegalStateException -> 0x0352 }
            boolean r0 = r15.zzai     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x015a
            r23.zzap()     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x015a:
            r2 = r9
            r1 = r15
            r19 = 0
            goto L_0x0318
        L_0x0160:
            com.google.android.gms.internal.ads.zzqe r0 = r15.zzw     // Catch:{ IllegalStateException -> 0x0352 }
            android.media.MediaCodec$BufferInfo r1 = r15.zzl     // Catch:{ IllegalStateException -> 0x0352 }
            int r0 = r0.zzb(r1)     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x0168:
            if (r0 >= 0) goto L_0x01a3
            r1 = -2
            if (r0 != r1) goto L_0x0193
            r15.zzae = r14     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzqe r0 = r15.zzw     // Catch:{ IllegalStateException -> 0x0352 }
            android.media.MediaFormat r0 = r0.zzc()     // Catch:{ IllegalStateException -> 0x0352 }
            int r1 = r15.zzE     // Catch:{ IllegalStateException -> 0x0352 }
            if (r1 == 0) goto L_0x018e
            java.lang.String r1 = "width"
            int r1 = r0.getInteger(r1)     // Catch:{ IllegalStateException -> 0x0352 }
            r2 = 32
            if (r1 != r2) goto L_0x018e
            java.lang.String r1 = "height"
            int r1 = r0.getInteger(r1)     // Catch:{ IllegalStateException -> 0x0352 }
            if (r1 != r2) goto L_0x018e
            r15.zzM = r14     // Catch:{ IllegalStateException -> 0x0352 }
            goto L_0x01ae
        L_0x018e:
            r15.zzy = r0     // Catch:{ IllegalStateException -> 0x0352 }
            r15.zzz = r14     // Catch:{ IllegalStateException -> 0x0352 }
            goto L_0x01ae
        L_0x0193:
            boolean r0 = r15.zzN     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x015a
            boolean r0 = r15.zzah     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 != 0) goto L_0x019f
            int r0 = r15.zzaa     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 != r11) goto L_0x015a
        L_0x019f:
            r23.zzax()     // Catch:{ IllegalStateException -> 0x0352 }
            goto L_0x015a
        L_0x01a3:
            boolean r1 = r15.zzM     // Catch:{ IllegalStateException -> 0x0352 }
            if (r1 == 0) goto L_0x01b6
            r15.zzM = r13     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzqe r1 = r15.zzw     // Catch:{ IllegalStateException -> 0x0352 }
            r1.zzn(r0, r13)     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x01ae:
            r2 = r9
            r1 = r15
            r16 = 2
            r19 = 0
            goto L_0x0307
        L_0x01b6:
            android.media.MediaCodec$BufferInfo r1 = r15.zzl     // Catch:{ IllegalStateException -> 0x0352 }
            int r2 = r1.size     // Catch:{ IllegalStateException -> 0x0352 }
            if (r2 != 0) goto L_0x01c6
            int r1 = r1.flags     // Catch:{ IllegalStateException -> 0x0352 }
            r1 = r1 & 4
            if (r1 == 0) goto L_0x01c6
            r23.zzax()     // Catch:{ IllegalStateException -> 0x0352 }
            goto L_0x015a
        L_0x01c6:
            r15.zzR = r0     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzqe r1 = r15.zzw     // Catch:{ IllegalStateException -> 0x0352 }
            java.nio.ByteBuffer r0 = r1.zzg(r0)     // Catch:{ IllegalStateException -> 0x0352 }
            r15.zzS = r0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x01e5
            android.media.MediaCodec$BufferInfo r1 = r15.zzl     // Catch:{ IllegalStateException -> 0x0352 }
            int r1 = r1.offset     // Catch:{ IllegalStateException -> 0x0352 }
            r0.position(r1)     // Catch:{ IllegalStateException -> 0x0352 }
            java.nio.ByteBuffer r0 = r15.zzS     // Catch:{ IllegalStateException -> 0x0352 }
            android.media.MediaCodec$BufferInfo r1 = r15.zzl     // Catch:{ IllegalStateException -> 0x0352 }
            int r2 = r1.offset     // Catch:{ IllegalStateException -> 0x0352 }
            int r1 = r1.size     // Catch:{ IllegalStateException -> 0x0352 }
            int r2 = r2 + r1
            r0.limit(r2)     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x01e5:
            boolean r0 = r15.zzK     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x0206
            android.media.MediaCodec$BufferInfo r0 = r15.zzl     // Catch:{ IllegalStateException -> 0x0352 }
            long r1 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0352 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0206
            int r1 = r0.flags     // Catch:{ IllegalStateException -> 0x0352 }
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0206
            long r1 = r15.zzaf     // Catch:{ IllegalStateException -> 0x0352 }
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0206
            r0.presentationTimeUs = r1     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x0206:
            android.media.MediaCodec$BufferInfo r0 = r15.zzl     // Catch:{ IllegalStateException -> 0x0352 }
            long r0 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0352 }
            java.util.ArrayList r2 = r15.zzk     // Catch:{ IllegalStateException -> 0x0352 }
            int r2 = r2.size()     // Catch:{ IllegalStateException -> 0x0352 }
            r3 = 0
        L_0x0211:
            if (r3 >= r2) goto L_0x022d
            java.util.ArrayList r4 = r15.zzk     // Catch:{ IllegalStateException -> 0x0352 }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ IllegalStateException -> 0x0352 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ IllegalStateException -> 0x0352 }
            long r4 = r4.longValue()     // Catch:{ IllegalStateException -> 0x0352 }
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x022a
            java.util.ArrayList r0 = r15.zzk     // Catch:{ IllegalStateException -> 0x0352 }
            r0.remove(r3)     // Catch:{ IllegalStateException -> 0x0352 }
            r0 = 1
            goto L_0x022e
        L_0x022a:
            int r3 = r3 + 1
            goto L_0x0211
        L_0x022d:
            r0 = 0
        L_0x022e:
            r15.zzT = r0     // Catch:{ IllegalStateException -> 0x0352 }
            long r0 = r15.zzag     // Catch:{ IllegalStateException -> 0x0352 }
            android.media.MediaCodec$BufferInfo r2 = r15.zzl     // Catch:{ IllegalStateException -> 0x0352 }
            long r2 = r2.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0352 }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x023c
            r0 = 1
            goto L_0x023d
        L_0x023c:
            r0 = 0
        L_0x023d:
            r15.zzU = r0     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzed r0 = r15.zzj     // Catch:{ IllegalStateException -> 0x0352 }
            java.lang.Object r0 = r0.zzc(r2)     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzad r0 = (com.google.android.gms.internal.ads.zzad) r0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 != 0) goto L_0x0255
            boolean r1 = r15.zzz     // Catch:{ IllegalStateException -> 0x0352 }
            if (r1 == 0) goto L_0x0255
            com.google.android.gms.internal.ads.zzed r0 = r15.zzj     // Catch:{ IllegalStateException -> 0x0352 }
            java.lang.Object r0 = r0.zzb()     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzad r0 = (com.google.android.gms.internal.ads.zzad) r0     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x0255:
            if (r0 == 0) goto L_0x025a
            r15.zzq = r0     // Catch:{ IllegalStateException -> 0x0352 }
            goto L_0x0262
        L_0x025a:
            boolean r0 = r15.zzz     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x026b
            com.google.android.gms.internal.ads.zzad r0 = r15.zzq     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x026b
        L_0x0262:
            com.google.android.gms.internal.ads.zzad r0 = r15.zzq     // Catch:{ IllegalStateException -> 0x0352 }
            android.media.MediaFormat r1 = r15.zzy     // Catch:{ IllegalStateException -> 0x0352 }
            r15.zzaa(r0, r1)     // Catch:{ IllegalStateException -> 0x0352 }
            r15.zzz = r13     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x026b:
            boolean r0 = r15.zzJ     // Catch:{ IllegalStateException -> 0x0330 }
            if (r0 == 0) goto L_0x02c7
            boolean r0 = r15.zzad     // Catch:{ IllegalStateException -> 0x02c2 }
            if (r0 == 0) goto L_0x02c7
            com.google.android.gms.internal.ads.zzqe r6 = r15.zzw     // Catch:{ IllegalStateException -> 0x02a8 }
            java.nio.ByteBuffer r7 = r15.zzS     // Catch:{ IllegalStateException -> 0x02a8 }
            int r8 = r15.zzR     // Catch:{ IllegalStateException -> 0x02a8 }
            android.media.MediaCodec$BufferInfo r0 = r15.zzl     // Catch:{ IllegalStateException -> 0x02a8 }
            int r12 = r0.flags     // Catch:{ IllegalStateException -> 0x02a8 }
            r16 = 1
            long r4 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x02a8 }
            boolean r0 = r15.zzT     // Catch:{ IllegalStateException -> 0x02a8 }
            boolean r2 = r15.zzU     // Catch:{ IllegalStateException -> 0x02a8 }
            com.google.android.gms.internal.ads.zzad r3 = r15.zzq     // Catch:{ IllegalStateException -> 0x02a8 }
            r1 = r23
            r17 = r2
            r18 = r3
            r2 = r24
            r19 = r4
            r4 = r26
            r21 = r9
            r9 = r12
            r10 = r16
            r16 = 2
            r11 = r19
            r19 = 0
            r13 = r0
            r14 = r17
            r15 = r18
            boolean r0 = r1.zzaf(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch:{ IllegalStateException -> 0x02ac }
            goto L_0x02eb
        L_0x02a8:
            r21 = r9
            r19 = 0
        L_0x02ac:
            r23.zzax()     // Catch:{ IllegalStateException -> 0x02bc }
            r15 = r23
            boolean r0 = r15.zzai     // Catch:{ IllegalStateException -> 0x032d }
            if (r0 == 0) goto L_0x02b8
            r23.zzap()     // Catch:{ IllegalStateException -> 0x032d }
        L_0x02b8:
            r1 = r15
        L_0x02b9:
            r2 = r21
            goto L_0x0318
        L_0x02bc:
            r0 = move-exception
            r2 = 1
        L_0x02be:
            r1 = r23
            goto L_0x0357
        L_0x02c2:
            r0 = move-exception
            r19 = 0
            goto L_0x032e
        L_0x02c7:
            r21 = r9
            r16 = 2
            r19 = 0
            com.google.android.gms.internal.ads.zzqe r6 = r15.zzw     // Catch:{ IllegalStateException -> 0x032d }
            java.nio.ByteBuffer r7 = r15.zzS     // Catch:{ IllegalStateException -> 0x032d }
            int r8 = r15.zzR     // Catch:{ IllegalStateException -> 0x032d }
            android.media.MediaCodec$BufferInfo r0 = r15.zzl     // Catch:{ IllegalStateException -> 0x032d }
            int r9 = r0.flags     // Catch:{ IllegalStateException -> 0x032d }
            r10 = 1
            long r11 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x032d }
            boolean r13 = r15.zzT     // Catch:{ IllegalStateException -> 0x032d }
            boolean r14 = r15.zzU     // Catch:{ IllegalStateException -> 0x032d }
            com.google.android.gms.internal.ads.zzad r0 = r15.zzq     // Catch:{ IllegalStateException -> 0x032d }
            r1 = r23
            r2 = r24
            r4 = r26
            r15 = r0
            boolean r0 = r1.zzaf(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch:{ IllegalStateException -> 0x0329 }
        L_0x02eb:
            if (r0 == 0) goto L_0x0315
            r1 = r23
            android.media.MediaCodec$BufferInfo r0 = r1.zzl     // Catch:{ IllegalStateException -> 0x034f }
            long r2 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x034f }
            r1.zzao(r2)     // Catch:{ IllegalStateException -> 0x034f }
            android.media.MediaCodec$BufferInfo r0 = r1.zzl     // Catch:{ IllegalStateException -> 0x034f }
            int r0 = r0.flags     // Catch:{ IllegalStateException -> 0x034f }
            r23.zzaz()     // Catch:{ IllegalStateException -> 0x034f }
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0305
            r23.zzax()     // Catch:{ IllegalStateException -> 0x034f }
            goto L_0x02b9
        L_0x0305:
            r2 = r21
        L_0x0307:
            boolean r0 = r1.zzaF(r2)     // Catch:{ IllegalStateException -> 0x034f }
            if (r0 != 0) goto L_0x030e
            goto L_0x0318
        L_0x030e:
            r15 = r1
            r9 = r2
            r11 = 2
            r13 = 0
            r14 = 1
            goto L_0x0139
        L_0x0315:
            r1 = r23
            goto L_0x02b9
        L_0x0318:
            boolean r0 = r23.zzaC()     // Catch:{ IllegalStateException -> 0x034f }
            if (r0 == 0) goto L_0x0324
            boolean r0 = r1.zzaF(r2)     // Catch:{ IllegalStateException -> 0x034f }
            if (r0 != 0) goto L_0x0318
        L_0x0324:
            android.os.Trace.endSection()     // Catch:{ IllegalStateException -> 0x034f }
            r2 = 1
            goto L_0x0347
        L_0x0329:
            r0 = move-exception
            r1 = r23
            goto L_0x0350
        L_0x032d:
            r0 = move-exception
        L_0x032e:
            r1 = r15
            goto L_0x0350
        L_0x0330:
            r0 = move-exception
            r1 = r15
            r19 = 0
            goto L_0x0350
        L_0x0335:
            r1 = r15
            r19 = 0
            com.google.android.gms.internal.ads.zzgm r0 = r1.zza     // Catch:{ IllegalStateException -> 0x034f }
            int r2 = r0.zzd     // Catch:{ IllegalStateException -> 0x034f }
            int r3 = r23.zzd(r24)     // Catch:{ IllegalStateException -> 0x034f }
            int r2 = r2 + r3
            r0.zzd = r2     // Catch:{ IllegalStateException -> 0x034f }
            r2 = 1
            r1.zzaE(r2)     // Catch:{ IllegalStateException -> 0x034d }
        L_0x0347:
            com.google.android.gms.internal.ads.zzgm r0 = r1.zza     // Catch:{ IllegalStateException -> 0x034d }
            r0.zza()     // Catch:{ IllegalStateException -> 0x034d }
            return
        L_0x034d:
            r0 = move-exception
            goto L_0x0357
        L_0x034f:
            r0 = move-exception
        L_0x0350:
            r2 = 1
            goto L_0x0357
        L_0x0352:
            r0 = move-exception
            r1 = r15
            r2 = 1
            r19 = 0
        L_0x0357:
            int r3 = com.google.android.gms.internal.ads.zzeg.zza
            r4 = 21
            if (r3 < r4) goto L_0x0362
            boolean r5 = r0 instanceof android.media.MediaCodec.CodecException
            if (r5 == 0) goto L_0x0362
            goto L_0x0377
        L_0x0362:
            java.lang.StackTraceElement[] r5 = r0.getStackTrace()
            int r6 = r5.length
            if (r6 <= 0) goto L_0x03a0
            r5 = r5[r19]
            java.lang.String r5 = r5.getClassName()
            java.lang.String r6 = "android.media.MediaCodec"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x03a0
        L_0x0377:
            r1.zzX(r0)
            if (r3 < r4) goto L_0x038b
            boolean r3 = r0 instanceof android.media.MediaCodec.CodecException
            if (r3 == 0) goto L_0x038b
            r3 = r0
            android.media.MediaCodec$CodecException r3 = (android.media.MediaCodec.CodecException) r3
            boolean r3 = r3.isRecoverable()
            if (r3 == 0) goto L_0x038b
            r14 = 1
            goto L_0x038c
        L_0x038b:
            r14 = 0
        L_0x038c:
            if (r14 == 0) goto L_0x0391
            r23.zzap()
        L_0x0391:
            com.google.android.gms.internal.ads.zzqg r2 = r1.zzD
            com.google.android.gms.internal.ads.zzqf r0 = r1.zzak(r0, r2)
            com.google.android.gms.internal.ads.zzad r2 = r1.zzp
            r3 = 4003(0xfa3, float:5.61E-42)
            com.google.android.gms.internal.ads.zzgu r0 = r1.zzbg(r0, r2, r14, r3)
            throw r0
        L_0x03a0:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqj.zzL(long, long):void");
    }

    public boolean zzM() {
        return this.zzai;
    }

    public boolean zzN() {
        if (this.zzp != null) {
            if (zzI() || zzaD()) {
                return true;
            }
            if (this.zzP == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.zzP) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int zzO(zzad zzad2) throws zzgu {
        try {
            return zzQ(this.zzd, zzad2);
        } catch (zzqs e) {
            throw zzbg(e, zzad2, false, 4002);
        }
    }

    public float zzP(float f, zzad zzad2, zzad[] zzadArr) {
        throw null;
    }

    public abstract int zzQ(zzql zzql, zzad zzad2) throws zzqs;

    public zzgn zzR(zzqg zzqg, zzad zzad2, zzad zzad3) {
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005b, code lost:
        if (zzaB() == false) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0087, code lost:
        if (zzaB() == false) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009b, code lost:
        if (zzaB() == false) goto L_0x009d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d0 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.ads.zzgn zzS(com.google.android.gms.internal.ads.zzja r13) throws com.google.android.gms.internal.ads.zzgu {
        /*
            r12 = this;
            r0 = 1
            r12.zzaj = r0
            com.google.android.gms.internal.ads.zzad r4 = r13.zza
            r4.getClass()
            java.lang.String r1 = r4.zzm
            r2 = 0
            if (r1 == 0) goto L_0x00f8
            com.google.android.gms.internal.ads.zzpk r13 = r13.zzb
            r12.zzao = r13
            r12.zzp = r4
            boolean r1 = r12.zzV
            r3 = 0
            if (r1 == 0) goto L_0x001b
            r12.zzX = r0
            return r3
        L_0x001b:
            com.google.android.gms.internal.ads.zzqe r1 = r12.zzw
            if (r1 != 0) goto L_0x0025
            r12.zzB = r3
            r12.zzan()
            return r3
        L_0x0025:
            com.google.android.gms.internal.ads.zzqg r3 = r12.zzD
            com.google.android.gms.internal.ads.zzad r5 = r12.zzx
            com.google.android.gms.internal.ads.zzpk r6 = r12.zzan
            r7 = 23
            if (r6 != r13) goto L_0x00d1
            if (r13 == r6) goto L_0x0038
            int r8 = com.google.android.gms.internal.ads.zzeg.zza
            if (r8 < r7) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r7 = 0
            goto L_0x0039
        L_0x0038:
            r7 = 1
        L_0x0039:
            com.google.android.gms.internal.ads.zzcw.zzf(r7)
            com.google.android.gms.internal.ads.zzgn r7 = r12.zzR(r3, r5, r4)
            int r8 = r7.zzd
            r9 = 3
            r10 = 16
            r11 = 2
            if (r8 == 0) goto L_0x00b4
            if (r8 == r0) goto L_0x008a
            if (r8 == r11) goto L_0x005e
            boolean r0 = r12.zzaG(r4)
            if (r0 != 0) goto L_0x0053
            goto L_0x0090
        L_0x0053:
            r12.zzx = r4
            if (r13 == r6) goto L_0x00b7
            boolean r13 = r12.zzaB()
            if (r13 != 0) goto L_0x00b7
            goto L_0x009d
        L_0x005e:
            boolean r8 = r12.zzaG(r4)
            if (r8 != 0) goto L_0x0065
            goto L_0x0090
        L_0x0065:
            r12.zzY = r0
            r12.zzZ = r0
            int r8 = r12.zzE
            if (r8 == r11) goto L_0x007d
            if (r8 != r0) goto L_0x007c
            int r8 = r4.zzr
            int r10 = r5.zzr
            if (r8 != r10) goto L_0x007c
            int r8 = r4.zzs
            int r10 = r5.zzs
            if (r8 != r10) goto L_0x007c
            goto L_0x007d
        L_0x007c:
            r0 = 0
        L_0x007d:
            r12.zzL = r0
            r12.zzx = r4
            if (r13 == r6) goto L_0x00b7
            boolean r13 = r12.zzaB()
            if (r13 != 0) goto L_0x00b7
            goto L_0x009d
        L_0x008a:
            boolean r8 = r12.zzaG(r4)
            if (r8 != 0) goto L_0x0093
        L_0x0090:
            r6 = 16
            goto L_0x00b8
        L_0x0093:
            r12.zzx = r4
            if (r13 == r6) goto L_0x009f
            boolean r13 = r12.zzaB()
            if (r13 != 0) goto L_0x00b7
        L_0x009d:
            r6 = 2
            goto L_0x00b8
        L_0x009f:
            boolean r13 = r12.zzac
            if (r13 == 0) goto L_0x00b7
            r12.zzaa = r0
            boolean r13 = r12.zzG
            if (r13 != 0) goto L_0x00b1
            boolean r13 = r12.zzI
            if (r13 == 0) goto L_0x00ae
            goto L_0x00b1
        L_0x00ae:
            r12.zzab = r0
            goto L_0x00b7
        L_0x00b1:
            r12.zzab = r9
            goto L_0x009d
        L_0x00b4:
            r12.zzU()
        L_0x00b7:
            r6 = 0
        L_0x00b8:
            int r13 = r7.zzd
            if (r13 == 0) goto L_0x00d0
            com.google.android.gms.internal.ads.zzqe r13 = r12.zzw
            if (r13 != r1) goto L_0x00c4
            int r13 = r12.zzab
            if (r13 != r9) goto L_0x00d0
        L_0x00c4:
            com.google.android.gms.internal.ads.zzgn r13 = new com.google.android.gms.internal.ads.zzgn
            java.lang.String r2 = r3.zza
            r0 = 0
            r1 = r13
            r3 = r5
            r5 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r13
        L_0x00d0:
            return r7
        L_0x00d1:
            if (r13 == 0) goto L_0x00e7
            if (r6 != 0) goto L_0x00d6
            goto L_0x00e7
        L_0x00d6:
            int r13 = com.google.android.gms.internal.ads.zzeg.zza
            if (r13 < r7) goto L_0x00e7
            java.util.UUID r13 = com.google.android.gms.internal.ads.zzm.zze
            java.util.UUID r0 = com.google.android.gms.internal.ads.zzm.zza
            boolean r1 = r13.equals(r0)
            if (r1 != 0) goto L_0x00e7
            r13.equals(r0)
        L_0x00e7:
            r12.zzU()
            com.google.android.gms.internal.ads.zzgn r13 = new com.google.android.gms.internal.ads.zzgn
            java.lang.String r2 = r3.zza
            r0 = 0
            r6 = 128(0x80, float:1.794E-43)
            r1 = r13
            r3 = r5
            r5 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r13
        L_0x00f8:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>()
            r0 = 4005(0xfa5, float:5.612E-42)
            com.google.android.gms.internal.ads.zzgu r13 = r12.zzbg(r13, r4, r2, r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqj.zzS(com.google.android.gms.internal.ads.zzja):com.google.android.gms.internal.ads.zzgn");
    }

    public abstract zzqc zzV(zzqg zzqg, zzad zzad2, MediaCrypto mediaCrypto, float f);

    public abstract List zzW(zzql zzql, zzad zzad2, boolean z) throws zzqs;

    public void zzX(Exception exc) {
        throw null;
    }

    public void zzY(String str, zzqc zzqc, long j, long j2) {
        throw null;
    }

    public void zzZ(String str) {
        throw null;
    }

    public void zzaa(zzad zzad2, MediaFormat mediaFormat) throws zzgu {
        throw null;
    }

    public void zzac() {
    }

    public void zzad(zzgc zzgc) throws zzgu {
        throw null;
    }

    public void zzae() throws zzgu {
    }

    public abstract boolean zzaf(long j, long j2, zzqe zzqe, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzad zzad2) throws zzgu;

    public boolean zzag(zzad zzad2) {
        return false;
    }

    public final float zzah() {
        return this.zzu;
    }

    public final long zzai() {
        return this.zzal;
    }

    public final zzqe zzaj() {
        return this.zzw;
    }

    public zzqf zzak(Throwable th, zzqg zzqg) {
        return new zzqf(th, zzqg);
    }

    public final zzqg zzal() {
        return this.zzD;
    }

    public void zzam(zzgc zzgc) throws zzgu {
    }

    public final void zzan() throws zzgu {
        zzad zzad2;
        if (this.zzw == null && !this.zzV && (zzad2 = this.zzp) != null) {
            if (this.zzao != null || !zzag(zzad2)) {
                zzpk zzpk = this.zzao;
                this.zzan = zzpk;
                zzad zzad3 = this.zzp;
                String str = zzad3.zzm;
                if (zzpk == null || !zzpl.zza) {
                    try {
                        if (this.zzB == null) {
                            List zzW2 = zzW(this.zzd, zzad3, false);
                            zzW2.isEmpty();
                            this.zzB = new ArrayDeque();
                            if (!zzW2.isEmpty()) {
                                this.zzB.add((zzqg) zzW2.get(0));
                            }
                            this.zzC = null;
                        }
                        if (!this.zzB.isEmpty()) {
                            zzqg zzqg = (zzqg) this.zzB.peekFirst();
                            while (this.zzw == null) {
                                zzqg zzqg2 = (zzqg) this.zzB.peekFirst();
                                if (zzau(zzqg2)) {
                                    try {
                                        zzaw(zzqg2, (MediaCrypto) null);
                                    } catch (Exception e) {
                                        if (zzqg2 == zzqg) {
                                            Thread.sleep(50);
                                            zzaw(zzqg2, (MediaCrypto) null);
                                        } else {
                                            throw e;
                                        }
                                    } catch (Exception e2) {
                                        zzdn.zzb("MediaCodecRenderer", "Failed to initialize decoder: ".concat(String.valueOf(zzqg2)), e2);
                                        this.zzB.removeFirst();
                                        zzqi zzqi = new zzqi(this.zzp, (Throwable) e2, false, zzqg2);
                                        zzX(zzqi);
                                        zzqi zzqi2 = this.zzC;
                                        if (zzqi2 == null) {
                                            this.zzC = zzqi;
                                        } else {
                                            this.zzC = zzqi.zza(zzqi2, zzqi);
                                        }
                                        if (this.zzB.isEmpty()) {
                                            throw this.zzC;
                                        }
                                    }
                                } else {
                                    return;
                                }
                            }
                            this.zzB = null;
                            return;
                        }
                        throw new zzqi(this.zzp, (Throwable) null, false, -49999);
                    } catch (zzqs e3) {
                        throw new zzqi(this.zzp, (Throwable) e3, false, -49998);
                    } catch (zzqi e4) {
                        throw zzbg(e4, this.zzp, false, 4001);
                    }
                } else {
                    zzpb zza2 = zzpk.zza();
                    throw zzbg(zza2, this.zzp, false, zza2.zza);
                }
            } else {
                zzad zzad4 = this.zzp;
                zzT();
                String str2 = zzad4.zzm;
                if ("audio/mp4a-latm".equals(str2) || "audio/mpeg".equals(str2) || "audio/opus".equals(str2)) {
                    this.zzi.zzn(32);
                } else {
                    this.zzi.zzn(1);
                }
                this.zzV = true;
            }
        }
    }

    public void zzao(long j) {
        while (true) {
            int i = this.zzam;
            if (i != 0 && j >= this.zzo[0]) {
                long[] jArr = this.zzm;
                this.zzak = jArr[0];
                this.zzal = this.zzn[0];
                int i2 = i - 1;
                this.zzam = i2;
                System.arraycopy(jArr, 1, jArr, 0, i2);
                long[] jArr2 = this.zzn;
                System.arraycopy(jArr2, 1, jArr2, 0, this.zzam);
                long[] jArr3 = this.zzo;
                System.arraycopy(jArr3, 1, jArr3, 0, this.zzam);
                zzac();
            } else {
                return;
            }
        }
    }

    public final void zzap() {
        try {
            zzqe zzqe = this.zzw;
            if (zzqe != null) {
                zzqe.zzl();
                this.zza.zzb++;
                zzZ(this.zzD.zza);
            }
        } finally {
            this.zzw = null;
            this.zzr = null;
            this.zzan = null;
            zzar();
        }
    }

    public void zzaq() {
        zzay();
        zzaz();
        this.zzP = -9223372036854775807L;
        this.zzad = false;
        this.zzac = false;
        this.zzL = false;
        this.zzM = false;
        this.zzT = false;
        this.zzU = false;
        this.zzk.clear();
        this.zzaf = -9223372036854775807L;
        this.zzag = -9223372036854775807L;
        zzpz zzpz = this.zzO;
        if (zzpz != null) {
            zzpz.zzc();
        }
        this.zzaa = 0;
        this.zzab = 0;
        this.zzZ = this.zzY ? 1 : 0;
    }

    public final void zzar() {
        zzaq();
        this.zzO = null;
        this.zzB = null;
        this.zzD = null;
        this.zzx = null;
        this.zzy = null;
        this.zzz = false;
        this.zzae = false;
        this.zzA = -1.0f;
        this.zzE = 0;
        this.zzF = false;
        this.zzG = false;
        this.zzH = false;
        this.zzI = false;
        this.zzJ = false;
        this.zzK = false;
        this.zzN = false;
        this.zzY = false;
        this.zzZ = 0;
        this.zzs = false;
    }

    public final boolean zzas() throws zzgu {
        boolean zzat = zzat();
        if (zzat) {
            zzan();
        }
        return zzat;
    }

    public final boolean zzat() {
        if (this.zzw == null) {
            return false;
        }
        if (this.zzab == 3 || this.zzG || ((this.zzH && !this.zzae) || (this.zzI && this.zzad))) {
            zzap();
            return true;
        }
        zzab();
        return false;
    }

    public boolean zzau(zzqg zzqg) {
        return true;
    }

    public final int zze() {
        return 8;
    }

    public void zzs() {
        this.zzp = null;
        this.zzak = -9223372036854775807L;
        this.zzal = -9223372036854775807L;
        this.zzam = 0;
        zzat();
    }

    public void zzt(boolean z, boolean z2) throws zzgu {
        this.zza = new zzgm();
    }

    public void zzu(long j, boolean z) throws zzgu {
        this.zzah = false;
        this.zzai = false;
        if (this.zzV) {
            this.zzi.zzb();
            this.zzh.zzb();
            this.zzW = false;
        } else {
            zzas();
        }
        zzed zzed = this.zzj;
        if (zzed.zza() > 0) {
            this.zzaj = true;
        }
        zzed.zze();
        int i = this.zzam;
        if (i != 0) {
            int i2 = i - 1;
            this.zzal = this.zzn[i2];
            this.zzak = this.zzm[i2];
            this.zzam = 0;
        }
    }

    public void zzv() {
        try {
            zzT();
            zzap();
        } finally {
            this.zzao = null;
        }
    }

    public final void zzy(zzad[] zzadArr, long j, long j2) throws zzgu {
        boolean z = true;
        if (this.zzal == -9223372036854775807L) {
            if (this.zzak != -9223372036854775807L) {
                z = false;
            }
            zzcw.zzf(z);
            this.zzak = j;
            this.zzal = j2;
            return;
        }
        int i = this.zzam;
        if (i == 10) {
            long j3 = this.zzn[9];
        } else {
            this.zzam = i + 1;
        }
        long[] jArr = this.zzm;
        int i2 = this.zzam - 1;
        jArr[i2] = j;
        this.zzn[i2] = j2;
        this.zzo[i2] = this.zzaf;
    }
}
