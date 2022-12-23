package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.appboy.support.ValidationUtils;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

public final class zzadh implements zzys {
    public static final zzyz zza = zzadd.zza;
    private static final byte[] zzb = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    /* access modifiers changed from: private */
    public static final byte[] zzc = zzeg.zzZ("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] zzd = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final byte[] zze = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    /* access modifiers changed from: private */
    public static final UUID zzf = new UUID(72057594037932032L, -9223371306706625679L);
    /* access modifiers changed from: private */
    public static final Map zzg;
    private long zzA;
    private zzadg zzB;
    private boolean zzC;
    private int zzD;
    private long zzE;
    private boolean zzF;
    private long zzG;
    private long zzH;
    private long zzI;
    private zzdo zzJ;
    private zzdo zzK;
    private boolean zzL;
    private boolean zzM;
    private int zzN;
    private long zzO;
    private long zzP;
    private int zzQ;
    private int zzR;
    private int[] zzS;
    private int zzT;
    private int zzU;
    private int zzV;
    private int zzW;
    private boolean zzX;
    private long zzY;
    private int zzZ;
    private int zzaa;
    private int zzab;
    private boolean zzac;
    private boolean zzad;
    private boolean zzae;
    private int zzaf;
    private byte zzag;
    private boolean zzah;
    private zzyv zzai;
    private final zzadc zzh;
    private final zzadj zzi;
    private final SparseArray zzj;
    private final boolean zzk;
    private final zzdy zzl;
    private final zzdy zzm;
    private final zzdy zzn;
    private final zzdy zzo;
    private final zzdy zzp;
    private final zzdy zzq;
    private final zzdy zzr;
    private final zzdy zzs;
    private final zzdy zzt;
    private final zzdy zzu;
    private ByteBuffer zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        HashMap hashMap = new HashMap();
        C13715c.m34248n(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090", 180, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        zzg = Collections.unmodifiableMap(hashMap);
    }

    public zzadh() {
        this(0);
    }

    public static final int zzn(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    public static final boolean zzo(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    private final int zzp(zzyt zzyt, zzadg zzadg, int i, boolean z) throws IOException {
        int i2;
        if ("S_TEXT/UTF8".equals(zzadg.zzb)) {
            zzx(zzyt, zzb, i);
            int i3 = this.zzaa;
            zzw();
            return i3;
        } else if ("S_TEXT/ASS".equals(zzadg.zzb)) {
            zzx(zzyt, zzd, i);
            int i4 = this.zzaa;
            zzw();
            return i4;
        } else if ("S_TEXT/WEBVTT".equals(zzadg.zzb)) {
            zzx(zzyt, zze, i);
            int i5 = this.zzaa;
            zzw();
            return i5;
        } else {
            zzzz zzzz = zzadg.zzV;
            boolean z2 = true;
            if (!this.zzac) {
                if (zzadg.zzg) {
                    this.zzV &= -1073741825;
                    boolean z3 = this.zzad;
                    int i6 = RecyclerView.C1119a0.FLAG_IGNORE;
                    if (!z3) {
                        ((zzym) zzyt).zzn(this.zzn.zzH(), 0, 1, false);
                        this.zzZ++;
                        if ((this.zzn.zzH()[0] & 128) != 128) {
                            this.zzag = this.zzn.zzH()[0];
                            this.zzad = true;
                        } else {
                            throw zzbp.zza("Extension bit is set in signal byte", (Throwable) null);
                        }
                    }
                    byte b = this.zzag;
                    if ((b & 1) == 1) {
                        byte b2 = b & 2;
                        this.zzV |= 1073741824;
                        if (!this.zzah) {
                            ((zzym) zzyt).zzn(this.zzs.zzH(), 0, 8, false);
                            this.zzZ += 8;
                            this.zzah = true;
                            byte[] zzH2 = this.zzn.zzH();
                            if (b2 != 2) {
                                i6 = 0;
                            }
                            zzH2[0] = (byte) (i6 | 8);
                            this.zzn.zzF(0);
                            zzzz.zzr(this.zzn, 1, 1);
                            this.zzaa++;
                            this.zzs.zzF(0);
                            zzzz.zzr(this.zzs, 8, 1);
                            this.zzaa += 8;
                        }
                        if (b2 == 2) {
                            if (!this.zzae) {
                                ((zzym) zzyt).zzn(this.zzn.zzH(), 0, 1, false);
                                this.zzZ++;
                                this.zzn.zzF(0);
                                this.zzaf = this.zzn.zzk();
                                this.zzae = true;
                            }
                            int i7 = this.zzaf * 4;
                            this.zzn.zzC(i7);
                            ((zzym) zzyt).zzn(this.zzn.zzH(), 0, i7, false);
                            this.zzZ += i7;
                            int i8 = (this.zzaf >> 1) + 1;
                            int i9 = (i8 * 6) + 2;
                            ByteBuffer byteBuffer = this.zzv;
                            if (byteBuffer == null || byteBuffer.capacity() < i9) {
                                this.zzv = ByteBuffer.allocate(i9);
                            }
                            this.zzv.position(0);
                            this.zzv.putShort((short) i8);
                            int i11 = 0;
                            int i12 = 0;
                            while (true) {
                                i2 = this.zzaf;
                                if (i11 >= i2) {
                                    break;
                                }
                                int zzn2 = this.zzn.zzn();
                                if (i11 % 2 == 0) {
                                    this.zzv.putShort((short) (zzn2 - i12));
                                } else {
                                    this.zzv.putInt(zzn2 - i12);
                                }
                                i11++;
                                i12 = zzn2;
                            }
                            int i13 = (i - this.zzZ) - i12;
                            if ((i2 & 1) == 1) {
                                this.zzv.putInt(i13);
                            } else {
                                this.zzv.putShort((short) i13);
                                this.zzv.putInt(0);
                            }
                            this.zzt.zzD(this.zzv.array(), i9);
                            zzzz.zzr(this.zzt, i9, 1);
                            this.zzaa += i9;
                        }
                    }
                } else {
                    byte[] bArr = zzadg.zzh;
                    if (bArr != null) {
                        this.zzq.zzD(bArr, bArr.length);
                    }
                }
                if (!"A_OPUS".equals(zzadg.zzb) ? zzadg.zzf > 0 : z) {
                    this.zzV |= 268435456;
                    this.zzu.zzC(0);
                    int zzd2 = (this.zzq.zzd() + i) - this.zzZ;
                    this.zzn.zzC(4);
                    this.zzn.zzH()[0] = (byte) ((zzd2 >> 24) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                    this.zzn.zzH()[1] = (byte) ((zzd2 >> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                    this.zzn.zzH()[2] = (byte) ((zzd2 >> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                    this.zzn.zzH()[3] = (byte) (zzd2 & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                    zzzz.zzr(this.zzn, 4, 2);
                    this.zzaa += 4;
                }
                this.zzac = true;
            }
            int zzd3 = this.zzq.zzd() + i;
            if (!"V_MPEG4/ISO/AVC".equals(zzadg.zzb) && !"V_MPEGH/ISO/HEVC".equals(zzadg.zzb)) {
                if (zzadg.zzS != null) {
                    if (this.zzq.zzd() != 0) {
                        z2 = false;
                    }
                    zzcw.zzf(z2);
                    zzadg.zzS.zzd(zzyt);
                }
                while (true) {
                    int i14 = this.zzZ;
                    if (i14 >= zzd3) {
                        break;
                    }
                    int zzq2 = zzq(zzyt, zzzz, zzd3 - i14);
                    this.zzZ += zzq2;
                    this.zzaa += zzq2;
                }
            } else {
                byte[] zzH3 = this.zzm.zzH();
                zzH3[0] = 0;
                zzH3[1] = 0;
                zzH3[2] = 0;
                int i15 = zzadg.zzW;
                int i16 = 4 - i15;
                while (this.zzZ < zzd3) {
                    int i17 = this.zzab;
                    if (i17 == 0) {
                        int min = Math.min(i15, this.zzq.zza());
                        ((zzym) zzyt).zzn(zzH3, i16 + min, i15 - min, false);
                        if (min > 0) {
                            this.zzq.zzB(zzH3, i16, min);
                        }
                        this.zzZ += i15;
                        this.zzm.zzF(0);
                        this.zzab = this.zzm.zzn();
                        this.zzl.zzF(0);
                        zzzx.zzb(zzzz, this.zzl, 4);
                        this.zzaa += 4;
                    } else {
                        int zzq3 = zzq(zzyt, zzzz, i17);
                        this.zzZ += zzq3;
                        this.zzaa += zzq3;
                        this.zzab -= zzq3;
                    }
                }
            }
            if ("A_VORBIS".equals(zzadg.zzb)) {
                this.zzo.zzF(0);
                zzzx.zzb(zzzz, this.zzo, 4);
                this.zzaa += 4;
            }
            int i18 = this.zzaa;
            zzw();
            return i18;
        }
    }

    private final int zzq(zzyt zzyt, zzzz zzzz, int i) throws IOException {
        int zza2 = this.zzq.zza();
        if (zza2 <= 0) {
            return zzzx.zza(zzzz, zzyt, i, false);
        }
        int min = Math.min(i, zza2);
        zzzx.zzb(zzzz, this.zzq, min);
        return min;
    }

    private final long zzr(long j) throws zzbp {
        long j2 = this.zzy;
        if (j2 != -9223372036854775807L) {
            return zzeg.zzw(j, j2, 1000);
        }
        throw zzbp.zza("Can't scale timecode prior to timecodeScale being set.", (Throwable) null);
    }

    private final void zzs(int i) throws zzbp {
        if (this.zzJ == null || this.zzK == null) {
            throw zzbp.zza("Element " + i + " must be in a Cues", (Throwable) null);
        }
    }

    private final void zzt(int i) throws zzbp {
        if (this.zzB == null) {
            throw zzbp.zza("Element " + i + " must be in a TrackEntry", (Throwable) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d4 A[EDGE_INSN: B:57:0x00d4->B:46:0x00d4 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzu(com.google.android.gms.internal.ads.zzadg r18, long r19, int r21, int r22, int r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            com.google.android.gms.internal.ads.zzaaa r2 = r1.zzS
            r9 = 1
            if (r2 == 0) goto L_0x001c
            com.google.android.gms.internal.ads.zzzz r3 = r1.zzV
            com.google.android.gms.internal.ads.zzzy r8 = r1.zzi
            r1 = r2
            r2 = r3
            r3 = r19
            r5 = r21
            r6 = r22
            r7 = r23
            r1.zzc(r2, r3, r5, r6, r7, r8)
            goto L_0x0115
        L_0x001c:
            java.lang.String r2 = r1.zzb
            java.lang.String r3 = "S_TEXT/UTF8"
            boolean r2 = r3.equals(r2)
            java.lang.String r4 = "S_TEXT/WEBVTT"
            java.lang.String r5 = "S_TEXT/ASS"
            r6 = 0
            r7 = 2
            if (r2 != 0) goto L_0x003c
            java.lang.String r2 = r1.zzb
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x003c
            java.lang.String r2 = r1.zzb
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x004c
        L_0x003c:
            int r2 = r0.zzR
            if (r2 <= r9) goto L_0x0041
            goto L_0x004c
        L_0x0041:
            long r10 = r0.zzP
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x0050
        L_0x004c:
            r2 = r22
            goto L_0x00e7
        L_0x0050:
            java.lang.String r2 = r1.zzb
            com.google.android.gms.internal.ads.zzdy r8 = r0.zzr
            byte[] r8 = r8.zzH()
            int r12 = r2.hashCode()
            r13 = 738597099(0x2c0618eb, float:1.9056378E-12)
            if (r12 == r13) goto L_0x007c
            r5 = 1045209816(0x3e4ca2d8, float:0.19983995)
            if (r12 == r5) goto L_0x0074
            r4 = 1422270023(0x54c61e47, float:6.807292E12)
            if (r12 == r4) goto L_0x006c
            goto L_0x0084
        L_0x006c:
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0084
            r2 = 0
            goto L_0x0085
        L_0x0074:
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0084
            r2 = 2
            goto L_0x0085
        L_0x007c:
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0084
            r2 = 1
            goto L_0x0085
        L_0x0084:
            r2 = -1
        L_0x0085:
            r3 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x00a7
            if (r2 == r9) goto L_0x009c
            if (r2 != r7) goto L_0x0096
            java.lang.String r2 = "%02d:%02d:%02d.%03d"
            byte[] r2 = zzy(r10, r2, r3)
            r3 = 25
            goto L_0x00af
        L_0x0096:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        L_0x009c:
            r2 = 10000(0x2710, double:4.9407E-320)
            java.lang.String r4 = "%01d:%02d:%02d:%02d"
            byte[] r2 = zzy(r10, r4, r2)
            r3 = 21
            goto L_0x00af
        L_0x00a7:
            java.lang.String r2 = "%02d:%02d:%02d,%03d"
            byte[] r2 = zzy(r10, r2, r3)
            r3 = 19
        L_0x00af:
            int r4 = r2.length
            java.lang.System.arraycopy(r2, r6, r8, r3, r4)
            com.google.android.gms.internal.ads.zzdy r2 = r0.zzr
            int r2 = r2.zzc()
        L_0x00b9:
            com.google.android.gms.internal.ads.zzdy r3 = r0.zzr
            int r3 = r3.zzd()
            if (r2 >= r3) goto L_0x00d4
            com.google.android.gms.internal.ads.zzdy r3 = r0.zzr
            byte[] r3 = r3.zzH()
            byte r3 = r3[r2]
            if (r3 != 0) goto L_0x00d1
            com.google.android.gms.internal.ads.zzdy r3 = r0.zzr
            r3.zzE(r2)
            goto L_0x00d4
        L_0x00d1:
            int r2 = r2 + 1
            goto L_0x00b9
        L_0x00d4:
            com.google.android.gms.internal.ads.zzzz r2 = r1.zzV
            com.google.android.gms.internal.ads.zzdy r3 = r0.zzr
            int r4 = r3.zzd()
            com.google.android.gms.internal.ads.zzzx.zzb(r2, r3, r4)
            com.google.android.gms.internal.ads.zzdy r2 = r0.zzr
            int r2 = r2.zzd()
            int r2 = r2 + r22
        L_0x00e7:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = r21 & r3
            if (r3 == 0) goto L_0x0105
            int r3 = r0.zzR
            if (r3 <= r9) goto L_0x00f7
            com.google.android.gms.internal.ads.zzdy r3 = r0.zzu
            r3.zzC(r6)
            goto L_0x0105
        L_0x00f7:
            com.google.android.gms.internal.ads.zzdy r3 = r0.zzu
            int r3 = r3.zzd()
            com.google.android.gms.internal.ads.zzzz r4 = r1.zzV
            com.google.android.gms.internal.ads.zzdy r5 = r0.zzu
            r4.zzr(r5, r3, r7)
            int r2 = r2 + r3
        L_0x0105:
            r14 = r2
            com.google.android.gms.internal.ads.zzzz r10 = r1.zzV
            com.google.android.gms.internal.ads.zzzy r1 = r1.zzi
            r11 = r19
            r13 = r21
            r15 = r23
            r16 = r1
            r10.zzs(r11, r13, r14, r15, r16)
        L_0x0115:
            r0.zzM = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadh.zzu(com.google.android.gms.internal.ads.zzadg, long, int, int, int):void");
    }

    private final void zzv(zzyt zzyt, int i) throws IOException {
        if (this.zzn.zzd() < i) {
            if (this.zzn.zzb() < i) {
                zzdy zzdy = this.zzn;
                int zzb2 = zzdy.zzb();
                zzdy.zzz(Math.max(zzb2 + zzb2, i));
            }
            ((zzym) zzyt).zzn(this.zzn.zzH(), this.zzn.zzd(), i - this.zzn.zzd(), false);
            this.zzn.zzE(i);
        }
    }

    private final void zzw() {
        this.zzZ = 0;
        this.zzaa = 0;
        this.zzab = 0;
        this.zzac = false;
        this.zzad = false;
        this.zzae = false;
        this.zzaf = 0;
        this.zzag = 0;
        this.zzah = false;
        this.zzq.zzC(0);
    }

    private final void zzx(zzyt zzyt, byte[] bArr, int i) throws IOException {
        int length = bArr.length;
        int i2 = length + i;
        if (this.zzr.zzb() < i2) {
            zzdy zzdy = this.zzr;
            byte[] copyOf = Arrays.copyOf(bArr, i2 + i);
            zzdy.zzD(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.zzr.zzH(), 0, length);
        }
        ((zzym) zzyt).zzn(this.zzr.zzH(), length, i, false);
        this.zzr.zzF(0);
        this.zzr.zzE(i2);
    }

    private static byte[] zzy(long j, String str, long j2) {
        boolean z;
        if (j != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zzd(z);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) (i * 3600)) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) (i2 * 60)) * 1000000);
        int i3 = (int) (j4 / 1000000);
        long j5 = (j4 - (((long) i3) * 1000000)) / j2;
        return zzeg.zzZ(String.format(Locale.US, str, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) j5)}));
    }

    private static int[] zzz(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    public final int zza(zzyt zzyt, zzzs zzzs) throws IOException {
        this.zzM = false;
        while (!this.zzM) {
            if (this.zzh.zzc(zzyt)) {
                long zzf2 = zzyt.zzf();
                if (this.zzF) {
                    this.zzH = zzf2;
                    zzzs.zza = this.zzG;
                    this.zzF = false;
                    return 1;
                } else if (this.zzC) {
                    long j = this.zzH;
                    if (j != -1) {
                        zzzs.zza = j;
                        this.zzH = -1;
                        return 1;
                    }
                }
            } else {
                for (int i = 0; i < this.zzj.size(); i++) {
                    zzadg zzadg = (zzadg) this.zzj.valueAt(i);
                    zzadg.zzV.getClass();
                    zzaaa zzaaa = zzadg.zzS;
                    if (zzaaa != null) {
                        zzaaa.zza(zzadg.zzV, zzadg.zzi);
                    }
                }
                return -1;
            }
        }
        return 0;
    }

    public final void zzb(zzyv zzyv) {
        this.zzai = zzyv;
    }

    public final void zzc(long j, long j2) {
        this.zzI = -9223372036854775807L;
        this.zzN = 0;
        this.zzh.zzb();
        this.zzi.zze();
        zzw();
        for (int i = 0; i < this.zzj.size(); i++) {
            zzaaa zzaaa = ((zzadg) this.zzj.valueAt(i)).zzS;
            if (zzaaa != null) {
                zzaaa.zzb();
            }
        }
    }

    public final boolean zzd(zzyt zzyt) throws IOException {
        return new zzadi().zza(zzyt);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:98:0x027f, code lost:
        throw com.google.android.gms.internal.ads.zzbp.zza("EBML lacing sample size out of range.", (java.lang.Throwable) null);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzg(int r19, int r20, com.google.android.gms.internal.ads.zzyt r21) throws java.io.IOException {
        /*
            r18 = this;
            r7 = r18
            r0 = r19
            r1 = r20
            r8 = r21
            r2 = 161(0xa1, float:2.26E-43)
            r3 = 0
            r4 = 4
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 2
            r9 = 1
            r10 = 0
            if (r0 == r2) goto L_0x0112
            if (r0 == r5) goto L_0x0112
            r2 = 165(0xa5, float:2.31E-43)
            if (r0 == r2) goto L_0x00dc
            r2 = 16877(0x41ed, float:2.365E-41)
            if (r0 == r2) goto L_0x00b2
            r2 = 16981(0x4255, float:2.3795E-41)
            if (r0 == r2) goto L_0x00a2
            r2 = 18402(0x47e2, float:2.5787E-41)
            if (r0 == r2) goto L_0x008d
            r2 = 21419(0x53ab, float:3.0014E-41)
            if (r0 == r2) goto L_0x0067
            r2 = 25506(0x63a2, float:3.5742E-41)
            if (r0 == r2) goto L_0x0057
            r2 = 30322(0x7672, float:4.249E-41)
            if (r0 != r2) goto L_0x0041
            r18.zzt(r19)
            com.google.android.gms.internal.ads.zzadg r0 = r7.zzB
            byte[] r2 = new byte[r1]
            r0.zzu = r2
            r0 = r8
            com.google.android.gms.internal.ads.zzym r0 = (com.google.android.gms.internal.ads.zzym) r0
            r0.zzn(r2, r10, r1, r10)
            return
        L_0x0041:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected id: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.google.android.gms.internal.ads.zzbp r0 = com.google.android.gms.internal.ads.zzbp.zza(r0, r3)
            throw r0
        L_0x0057:
            r18.zzt(r19)
            com.google.android.gms.internal.ads.zzadg r0 = r7.zzB
            byte[] r2 = new byte[r1]
            r0.zzj = r2
            r0 = r8
            com.google.android.gms.internal.ads.zzym r0 = (com.google.android.gms.internal.ads.zzym) r0
            r0.zzn(r2, r10, r1, r10)
            return
        L_0x0067:
            com.google.android.gms.internal.ads.zzdy r0 = r7.zzp
            byte[] r0 = r0.zzH()
            java.util.Arrays.fill(r0, r10)
            com.google.android.gms.internal.ads.zzdy r0 = r7.zzp
            byte[] r0 = r0.zzH()
            r2 = r8
            com.google.android.gms.internal.ads.zzym r2 = (com.google.android.gms.internal.ads.zzym) r2
            int r3 = 4 - r1
            r2.zzn(r0, r3, r1, r10)
            com.google.android.gms.internal.ads.zzdy r0 = r7.zzp
            r0.zzF(r10)
            com.google.android.gms.internal.ads.zzdy r0 = r7.zzp
            long r0 = r0.zzs()
            int r1 = (int) r0
            r7.zzD = r1
            return
        L_0x008d:
            byte[] r2 = new byte[r1]
            r3 = r8
            com.google.android.gms.internal.ads.zzym r3 = (com.google.android.gms.internal.ads.zzym) r3
            r3.zzn(r2, r10, r1, r10)
            r18.zzt(r19)
            com.google.android.gms.internal.ads.zzadg r0 = r7.zzB
            com.google.android.gms.internal.ads.zzzy r1 = new com.google.android.gms.internal.ads.zzzy
            r1.<init>(r9, r2, r10, r10)
            r0.zzi = r1
            return
        L_0x00a2:
            r18.zzt(r19)
            com.google.android.gms.internal.ads.zzadg r0 = r7.zzB
            byte[] r2 = new byte[r1]
            r0.zzh = r2
            r0 = r8
            com.google.android.gms.internal.ads.zzym r0 = (com.google.android.gms.internal.ads.zzym) r0
            r0.zzn(r2, r10, r1, r10)
            return
        L_0x00b2:
            r18.zzt(r19)
            com.google.android.gms.internal.ads.zzadg r0 = r7.zzB
            int r2 = r0.zzX
            r3 = 1685485123(0x64767643, float:1.8185683E22)
            if (r2 == r3) goto L_0x00d1
            int r2 = r0.zzX
            r3 = 1685480259(0x64766343, float:1.8180206E22)
            if (r2 != r3) goto L_0x00ca
            goto L_0x00d1
        L_0x00ca:
            r0 = r8
            com.google.android.gms.internal.ads.zzym r0 = (com.google.android.gms.internal.ads.zzym) r0
            r0.zzo(r1, r10)
            return
        L_0x00d1:
            byte[] r2 = new byte[r1]
            r0.zzM = r2
            r0 = r8
            com.google.android.gms.internal.ads.zzym r0 = (com.google.android.gms.internal.ads.zzym) r0
            r0.zzn(r2, r10, r1, r10)
            return
        L_0x00dc:
            int r0 = r7.zzN
            if (r0 == r6) goto L_0x00e1
            return
        L_0x00e1:
            android.util.SparseArray r0 = r7.zzj
            int r2 = r7.zzT
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.internal.ads.zzadg r0 = (com.google.android.gms.internal.ads.zzadg) r0
            int r2 = r7.zzW
            if (r2 != r4) goto L_0x010b
            java.lang.String r0 = r0.zzb
            java.lang.String r2 = "V_VP9"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x010b
            com.google.android.gms.internal.ads.zzdy r0 = r7.zzu
            r0.zzC(r1)
            com.google.android.gms.internal.ads.zzdy r0 = r7.zzu
            byte[] r0 = r0.zzH()
            r2 = r8
            com.google.android.gms.internal.ads.zzym r2 = (com.google.android.gms.internal.ads.zzym) r2
            r2.zzn(r0, r10, r1, r10)
            return
        L_0x010b:
            r0 = r8
            com.google.android.gms.internal.ads.zzym r0 = (com.google.android.gms.internal.ads.zzym) r0
            r0.zzo(r1, r10)
            return
        L_0x0112:
            int r2 = r7.zzN
            r11 = 8
            if (r2 != 0) goto L_0x0137
            com.google.android.gms.internal.ads.zzadj r2 = r7.zzi
            long r12 = r2.zzd(r8, r10, r9, r11)
            int r2 = (int) r12
            r7.zzT = r2
            com.google.android.gms.internal.ads.zzadj r2 = r7.zzi
            int r2 = r2.zza()
            r7.zzU = r2
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.zzP = r12
            r7.zzN = r9
            com.google.android.gms.internal.ads.zzdy r2 = r7.zzn
            r2.zzC(r10)
        L_0x0137:
            android.util.SparseArray r2 = r7.zzj
            int r12 = r7.zzT
            java.lang.Object r2 = r2.get(r12)
            r12 = r2
            com.google.android.gms.internal.ads.zzadg r12 = (com.google.android.gms.internal.ads.zzadg) r12
            if (r12 != 0) goto L_0x0151
            int r0 = r7.zzU
            r2 = r8
            com.google.android.gms.internal.ads.zzym r2 = (com.google.android.gms.internal.ads.zzym) r2
            int r0 = r1 - r0
            r2.zzo(r0, r10)
            r7.zzN = r10
            return
        L_0x0151:
            r12.zzV.getClass()
            int r2 = r7.zzN
            if (r2 != r9) goto L_0x02e0
            r2 = 3
            r7.zzv(r8, r2)
            com.google.android.gms.internal.ads.zzdy r13 = r7.zzn
            byte[] r13 = r13.zzH()
            byte r13 = r13[r6]
            r13 = r13 & 6
            int r13 = r13 >> r9
            r14 = 255(0xff, float:3.57E-43)
            if (r13 != 0) goto L_0x017e
            r7.zzR = r9
            int[] r2 = r7.zzS
            int[] r2 = zzz(r2, r9)
            r7.zzS = r2
            int r3 = r7.zzU
            int r1 = r1 - r3
            int r1 = r1 + -3
            r2[r10] = r1
            goto L_0x0290
        L_0x017e:
            r7.zzv(r8, r4)
            com.google.android.gms.internal.ads.zzdy r15 = r7.zzn
            byte[] r15 = r15.zzH()
            byte r15 = r15[r2]
            r15 = r15 & r14
            int r15 = r15 + r9
            r7.zzR = r15
            int[] r4 = r7.zzS
            int[] r4 = zzz(r4, r15)
            r7.zzS = r4
            if (r13 != r6) goto L_0x01a4
            int r2 = r7.zzU
            int r3 = r7.zzR
            int r1 = r1 - r2
            int r1 = r1 + -4
            int r1 = r1 / r3
            java.util.Arrays.fill(r4, r10, r3, r1)
            goto L_0x0290
        L_0x01a4:
            if (r13 != r9) goto L_0x01dc
            r2 = 0
            r3 = 0
            r4 = 4
        L_0x01a9:
            int r13 = r7.zzR
            int r13 = r13 + -1
            if (r2 >= r13) goto L_0x01d1
            int[] r13 = r7.zzS
            r13[r2] = r10
        L_0x01b3:
            int r4 = r4 + r9
            r7.zzv(r8, r4)
            com.google.android.gms.internal.ads.zzdy r13 = r7.zzn
            byte[] r13 = r13.zzH()
            int r15 = r4 + -1
            byte r13 = r13[r15]
            r13 = r13 & r14
            int[] r15 = r7.zzS
            r16 = r15[r2]
            int r16 = r16 + r13
            r15[r2] = r16
            if (r13 == r14) goto L_0x01b3
            int r3 = r3 + r16
            int r2 = r2 + 1
            goto L_0x01a9
        L_0x01d1:
            int[] r2 = r7.zzS
            int r15 = r7.zzU
            int r1 = r1 - r15
            int r1 = r1 - r4
            int r1 = r1 - r3
            r2[r13] = r1
            goto L_0x0290
        L_0x01dc:
            if (r13 != r2) goto L_0x02d9
            r2 = 0
            r4 = 4
            r13 = 0
        L_0x01e1:
            int r15 = r7.zzR
            int r15 = r15 + -1
            if (r2 >= r15) goto L_0x0287
            int[] r15 = r7.zzS
            r15[r2] = r10
            int r4 = r4 + 1
            r7.zzv(r8, r4)
            int r15 = r4 + -1
            com.google.android.gms.internal.ads.zzdy r5 = r7.zzn
            byte[] r5 = r5.zzH()
            byte r5 = r5[r15]
            if (r5 == 0) goto L_0x0280
            r5 = 0
        L_0x01fd:
            if (r5 >= r11) goto L_0x024f
            int r17 = 7 - r5
            int r6 = r9 << r17
            com.google.android.gms.internal.ads.zzdy r9 = r7.zzn
            byte[] r9 = r9.zzH()
            byte r9 = r9[r15]
            r9 = r9 & r6
            if (r9 == 0) goto L_0x0245
            int r4 = r4 + r5
            r7.zzv(r8, r4)
            int r9 = r15 + 1
            com.google.android.gms.internal.ads.zzdy r10 = r7.zzn
            byte[] r10 = r10.zzH()
            byte r10 = r10[r15]
            r10 = r10 & r14
            int r6 = ~r6
            r6 = r6 & r10
            long r14 = (long) r6
        L_0x0220:
            if (r9 >= r4) goto L_0x0236
            int r6 = r9 + 1
            long r14 = r14 << r11
            com.google.android.gms.internal.ads.zzdy r10 = r7.zzn
            byte[] r10 = r10.zzH()
            byte r9 = r10[r9]
            r10 = 255(0xff, float:3.57E-43)
            r9 = r9 & r10
            long r10 = (long) r9
            long r14 = r14 | r10
            r9 = r6
            r11 = 8
            goto L_0x0220
        L_0x0236:
            if (r2 <= 0) goto L_0x0251
            r9 = 1
            int r5 = r5 * 7
            int r5 = r5 + 6
            long r5 = r9 << r5
            r9 = -1
            long r5 = r5 + r9
            long r14 = r14 - r5
            goto L_0x0251
        L_0x0245:
            int r5 = r5 + 1
            r6 = 2
            r9 = 1
            r10 = 0
            r11 = 8
            r14 = 255(0xff, float:3.57E-43)
            goto L_0x01fd
        L_0x024f:
            r14 = 0
        L_0x0251:
            r5 = -2147483648(0xffffffff80000000, double:NaN)
            int r9 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r9 < 0) goto L_0x0279
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r9 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r9 > 0) goto L_0x0279
            int r5 = (int) r14
            int[] r6 = r7.zzS
            if (r2 == 0) goto L_0x0269
            int r9 = r2 + -1
            r9 = r6[r9]
            int r5 = r5 + r9
        L_0x0269:
            r6[r2] = r5
            int r13 = r13 + r5
            int r2 = r2 + 1
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 2
            r9 = 1
            r10 = 0
            r11 = 8
            r14 = 255(0xff, float:3.57E-43)
            goto L_0x01e1
        L_0x0279:
            java.lang.String r0 = "EBML lacing sample size out of range."
            com.google.android.gms.internal.ads.zzbp r0 = com.google.android.gms.internal.ads.zzbp.zza(r0, r3)
            throw r0
        L_0x0280:
            java.lang.String r0 = "No valid varint length mask found"
            com.google.android.gms.internal.ads.zzbp r0 = com.google.android.gms.internal.ads.zzbp.zza(r0, r3)
            throw r0
        L_0x0287:
            int[] r2 = r7.zzS
            int r3 = r7.zzU
            int r1 = r1 - r3
            int r1 = r1 - r4
            int r1 = r1 - r13
            r2[r15] = r1
        L_0x0290:
            com.google.android.gms.internal.ads.zzdy r1 = r7.zzn
            byte[] r1 = r1.zzH()
            r2 = 0
            byte r1 = r1[r2]
            com.google.android.gms.internal.ads.zzdy r2 = r7.zzn
            byte[] r2 = r2.zzH()
            r3 = 1
            byte r2 = r2[r3]
            long r3 = r7.zzI
            r5 = 8
            int r1 = r1 << r5
            r5 = 255(0xff, float:3.57E-43)
            r2 = r2 & r5
            r1 = r1 | r2
            long r1 = (long) r1
            long r1 = r7.zzr(r1)
            long r3 = r3 + r1
            r7.zzO = r3
            int r1 = r12.zzd
            r2 = 2
            if (r1 == r2) goto L_0x02d0
            r1 = 163(0xa3, float:2.28E-43)
            if (r0 != r1) goto L_0x02ce
            com.google.android.gms.internal.ads.zzdy r0 = r7.zzn
            byte[] r0 = r0.zzH()
            byte r0 = r0[r2]
            r1 = 128(0x80, float:1.794E-43)
            r0 = r0 & r1
            if (r0 != r1) goto L_0x02cc
            r0 = 163(0xa3, float:2.28E-43)
            goto L_0x02d0
        L_0x02cc:
            r0 = 163(0xa3, float:2.28E-43)
        L_0x02ce:
            r1 = 0
            goto L_0x02d1
        L_0x02d0:
            r1 = 1
        L_0x02d1:
            r7.zzV = r1
            r7.zzN = r2
            r1 = 0
            r7.zzQ = r1
            goto L_0x02e0
        L_0x02d9:
            java.lang.String r0 = "Unexpected lacing value: 2"
            com.google.android.gms.internal.ads.zzbp r0 = com.google.android.gms.internal.ads.zzbp.zza(r0, r3)
            throw r0
        L_0x02e0:
            r1 = 163(0xa3, float:2.28E-43)
            if (r0 != r1) goto L_0x0313
        L_0x02e4:
            int r0 = r7.zzQ
            int r1 = r7.zzR
            if (r0 >= r1) goto L_0x030f
            int[] r1 = r7.zzS
            r0 = r1[r0]
            r1 = 0
            int r5 = r7.zzp(r8, r12, r0, r1)
            long r0 = r7.zzO
            int r2 = r7.zzQ
            int r3 = r12.zze
            int r2 = r2 * r3
            int r2 = r2 / 1000
            long r2 = (long) r2
            long r2 = r2 + r0
            int r4 = r7.zzV
            r6 = 0
            r0 = r18
            r1 = r12
            r0.zzu(r1, r2, r4, r5, r6)
            int r0 = r7.zzQ
            r1 = 1
            int r0 = r0 + r1
            r7.zzQ = r0
            goto L_0x02e4
        L_0x030f:
            r0 = 0
            r7.zzN = r0
            return
        L_0x0313:
            r1 = 1
        L_0x0314:
            int r0 = r7.zzQ
            int r2 = r7.zzR
            if (r0 >= r2) goto L_0x032a
            int[] r2 = r7.zzS
            r3 = r2[r0]
            int r3 = r7.zzp(r8, r12, r3, r1)
            r2[r0] = r3
            int r0 = r7.zzQ
            int r0 = r0 + r1
            r7.zzQ = r0
            goto L_0x0314
        L_0x032a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadh.zzg(int, int, com.google.android.gms.internal.ads.zzyt):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01d1, code lost:
        if (r5.equals("V_MPEGH/ISO/HEVC") != false) goto L_0x02fe;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzh(int r22) throws com.google.android.gms.internal.ads.zzbp {
        /*
            r21 = this;
            r7 = r21
            r0 = r22
            com.google.android.gms.internal.ads.zzyv r1 = r7.zzai
            com.google.android.gms.internal.ads.zzcw.zzb(r1)
            r1 = 160(0xa0, float:2.24E-43)
            r2 = 8
            java.lang.String r3 = "A_OPUS"
            r4 = 2
            r5 = 0
            if (r0 == r1) goto L_0x031d
            r1 = 174(0xae, float:2.44E-43)
            r10 = -1
            if (r0 == r1) goto L_0x0173
            r1 = 19899(0x4dbb, float:2.7884E-41)
            r2 = -1
            r4 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r0 == r1) goto L_0x015b
            r1 = 25152(0x6240, float:3.5245E-41)
            if (r0 == r1) goto L_0x0128
            r1 = 28032(0x6d80, float:3.9281E-41)
            if (r0 == r1) goto L_0x0112
            r1 = 357149030(0x1549a966, float:4.072526E-26)
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == r1) goto L_0x00fa
            r1 = 374648427(0x1654ae6b, float:1.718026E-25)
            if (r0 == r1) goto L_0x00e4
            if (r0 == r4) goto L_0x003d
            goto L_0x016a
        L_0x003d:
            boolean r0 = r7.zzC
            if (r0 != 0) goto L_0x00de
            com.google.android.gms.internal.ads.zzyv r0 = r7.zzai
            com.google.android.gms.internal.ads.zzdo r1 = r7.zzJ
            com.google.android.gms.internal.ads.zzdo r4 = r7.zzK
            long r14 = r7.zzx
            int r16 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r16 == 0) goto L_0x00d1
            long r2 = r7.zzA
            int r14 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x00d1
            if (r1 == 0) goto L_0x00d1
            int r2 = r1.zza()
            if (r2 == 0) goto L_0x00d1
            if (r4 == 0) goto L_0x00d1
            int r2 = r4.zza()
            int r3 = r1.zza()
            if (r2 == r3) goto L_0x0068
            goto L_0x00d1
        L_0x0068:
            int r2 = r1.zza()
            int[] r3 = new int[r2]
            long[] r12 = new long[r2]
            long[] r13 = new long[r2]
            long[] r14 = new long[r2]
            r15 = 0
        L_0x0075:
            if (r15 >= r2) goto L_0x008a
            long r16 = r1.zzb(r15)
            r14[r15] = r16
            long r8 = r7.zzx
            long r18 = r4.zzb(r15)
            long r18 = r18 + r8
            r12[r15] = r18
            int r15 = r15 + 1
            goto L_0x0075
        L_0x008a:
            r9 = 0
        L_0x008b:
            int r1 = r2 + -1
            if (r9 >= r1) goto L_0x00a5
            int r1 = r9 + 1
            r17 = r12[r1]
            r19 = r12[r9]
            long r10 = r17 - r19
            int r4 = (int) r10
            r3[r9] = r4
            r10 = r14[r1]
            r17 = r14[r9]
            long r10 = r10 - r17
            r13[r9] = r10
            r9 = r1
            r10 = -1
            goto L_0x008b
        L_0x00a5:
            long r8 = r7.zzx
            long r10 = r7.zzw
            long r8 = r8 + r10
            r10 = r12[r1]
            long r8 = r8 - r10
            int r2 = (int) r8
            r3[r1] = r2
            long r8 = r7.zzA
            r10 = r14[r1]
            long r8 = r8 - r10
            r13[r1] = r8
            int r2 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x00cb
            int[] r3 = java.util.Arrays.copyOf(r3, r1)
            long[] r12 = java.util.Arrays.copyOf(r12, r1)
            long[] r13 = java.util.Arrays.copyOf(r13, r1)
            long[] r14 = java.util.Arrays.copyOf(r14, r1)
        L_0x00cb:
            com.google.android.gms.internal.ads.zzyk r1 = new com.google.android.gms.internal.ads.zzyk
            r1.<init>(r3, r12, r13, r14)
            goto L_0x00d8
        L_0x00d1:
            com.google.android.gms.internal.ads.zzzu r1 = new com.google.android.gms.internal.ads.zzzu
            long r2 = r7.zzA
            r1.<init>(r2, r5)
        L_0x00d8:
            r0.zzL(r1)
            r0 = 1
            r7.zzC = r0
        L_0x00de:
            r0 = 0
            r7.zzJ = r0
            r7.zzK = r0
            return
        L_0x00e4:
            r0 = 0
            android.util.SparseArray r1 = r7.zzj
            int r1 = r1.size()
            if (r1 == 0) goto L_0x00f3
            com.google.android.gms.internal.ads.zzyv r0 = r7.zzai
            r0.zzB()
            return
        L_0x00f3:
            java.lang.String r1 = "No valid tracks were found"
            com.google.android.gms.internal.ads.zzbp r0 = com.google.android.gms.internal.ads.zzbp.zza(r1, r0)
            throw r0
        L_0x00fa:
            long r0 = r7.zzy
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x0105
            r0 = 1000000(0xf4240, double:4.940656E-318)
            r7.zzy = r0
        L_0x0105:
            long r0 = r7.zzz
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 == 0) goto L_0x016a
            long r0 = r7.zzr(r0)
            r7.zzA = r0
            return
        L_0x0112:
            r21.zzt(r22)
            com.google.android.gms.internal.ads.zzadg r0 = r7.zzB
            boolean r1 = r0.zzg
            if (r1 == 0) goto L_0x016a
            byte[] r0 = r0.zzh
            if (r0 != 0) goto L_0x0120
            goto L_0x016a
        L_0x0120:
            java.lang.String r0 = "Combining encryption and compression is not supported"
            r1 = 0
            com.google.android.gms.internal.ads.zzbp r0 = com.google.android.gms.internal.ads.zzbp.zza(r0, r1)
            throw r0
        L_0x0128:
            r21.zzt(r22)
            com.google.android.gms.internal.ads.zzadg r0 = r7.zzB
            boolean r1 = r0.zzg
            if (r1 == 0) goto L_0x016a
            com.google.android.gms.internal.ads.zzzy r1 = r0.zzi
            if (r1 == 0) goto L_0x0153
            com.google.android.gms.internal.ads.zzv r1 = new com.google.android.gms.internal.ads.zzv
            r2 = 1
            com.google.android.gms.internal.ads.zzu[] r2 = new com.google.android.gms.internal.ads.zzu[r2]
            com.google.android.gms.internal.ads.zzu r3 = new com.google.android.gms.internal.ads.zzu
            java.util.UUID r4 = com.google.android.gms.internal.ads.zzm.zza
            com.google.android.gms.internal.ads.zzadg r5 = r7.zzB
            com.google.android.gms.internal.ads.zzzy r5 = r5.zzi
            byte[] r5 = r5.zzb
            java.lang.String r6 = "video/webm"
            r8 = 0
            r3.<init>(r4, r8, r6, r5)
            r4 = 0
            r2[r4] = r3
            r1.<init>(r8, r2)
            r0.zzk = r1
            return
        L_0x0153:
            r8 = 0
            java.lang.String r0 = "Encrypted Track found but ContentEncKeyID was not found"
            com.google.android.gms.internal.ads.zzbp r0 = com.google.android.gms.internal.ads.zzbp.zza(r0, r8)
            throw r0
        L_0x015b:
            int r0 = r7.zzD
            r1 = -1
            if (r0 == r1) goto L_0x016b
            long r5 = r7.zzE
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x016b
            if (r0 != r4) goto L_0x016a
            r7.zzG = r5
        L_0x016a:
            return
        L_0x016b:
            java.lang.String r0 = "Mandatory element SeekID or SeekPosition not found"
            r1 = 0
            com.google.android.gms.internal.ads.zzbp r0 = com.google.android.gms.internal.ads.zzbp.zza(r0, r1)
            throw r0
        L_0x0173:
            r1 = -1
            com.google.android.gms.internal.ads.zzadg r0 = r7.zzB
            com.google.android.gms.internal.ads.zzcw.zzb(r0)
            java.lang.String r5 = r0.zzb
            if (r5 == 0) goto L_0x0315
            int r6 = r5.hashCode()
            switch(r6) {
                case -2095576542: goto L_0x02f3;
                case -2095575984: goto L_0x02e9;
                case -1985379776: goto L_0x02de;
                case -1784763192: goto L_0x02d3;
                case -1730367663: goto L_0x02c8;
                case -1482641358: goto L_0x02bd;
                case -1482641357: goto L_0x02b2;
                case -1373388978: goto L_0x02a7;
                case -933872740: goto L_0x029c;
                case -538363189: goto L_0x0291;
                case -538363109: goto L_0x0286;
                case -425012669: goto L_0x027a;
                case -356037306: goto L_0x026e;
                case 62923557: goto L_0x0262;
                case 62923603: goto L_0x0256;
                case 62927045: goto L_0x024a;
                case 82318131: goto L_0x023f;
                case 82338133: goto L_0x0234;
                case 82338134: goto L_0x0229;
                case 99146302: goto L_0x021d;
                case 444813526: goto L_0x0211;
                case 542569478: goto L_0x0205;
                case 635596514: goto L_0x01f9;
                case 725948237: goto L_0x01ed;
                case 725957860: goto L_0x01e1;
                case 738597099: goto L_0x01d5;
                case 855502857: goto L_0x01cb;
                case 1045209816: goto L_0x01bf;
                case 1422270023: goto L_0x01b3;
                case 1809237540: goto L_0x01a8;
                case 1950749482: goto L_0x019c;
                case 1950789798: goto L_0x0190;
                case 1951062397: goto L_0x0186;
                default: goto L_0x0184;
            }
        L_0x0184:
            goto L_0x02fd
        L_0x0186:
            boolean r2 = r5.equals(r3)
            if (r2 == 0) goto L_0x02fd
            r2 = 11
            goto L_0x02fe
        L_0x0190:
            java.lang.String r2 = "A_FLAC"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x02fd
            r2 = 22
            goto L_0x02fe
        L_0x019c:
            java.lang.String r2 = "A_EAC3"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x02fd
            r2 = 17
            goto L_0x02fe
        L_0x01a8:
            java.lang.String r2 = "V_MPEG2"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x02fd
            r2 = 3
            goto L_0x02fe
        L_0x01b3:
            java.lang.String r2 = "S_TEXT/UTF8"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x02fd
            r2 = 27
            goto L_0x02fe
        L_0x01bf:
            java.lang.String r2 = "S_TEXT/WEBVTT"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x02fd
            r2 = 29
            goto L_0x02fe
        L_0x01cb:
            java.lang.String r3 = "V_MPEGH/ISO/HEVC"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x02fd
            goto L_0x02fe
        L_0x01d5:
            java.lang.String r2 = "S_TEXT/ASS"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x02fd
            r2 = 28
            goto L_0x02fe
        L_0x01e1:
            java.lang.String r2 = "A_PCM/INT/LIT"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x02fd
            r2 = 24
            goto L_0x02fe
        L_0x01ed:
            java.lang.String r2 = "A_PCM/INT/BIG"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x02fd
            r2 = 25
            goto L_0x02fe
        L_0x01f9:
            java.lang.String r2 = "A_PCM/FLOAT/IEEE"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x02fd
            r2 = 26
            goto L_0x02fe
        L_0x0205:
            java.lang.String r2 = "A_DTS/EXPRESS"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x02fd
            r2 = 20
            goto L_0x02fe
        L_0x0211:
            java.lang.String r2 = "V_THEORA"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x02fd
            r2 = 10
            goto L_0x02fe
        L_0x021d:
            java.lang.String r2 = "S_HDMV/PGS"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x02fd
            r2 = 31
            goto L_0x02fe
        L_0x0229:
            java.lang.String r2 = "V_VP9"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x02fd
            r2 = 1
            goto L_0x02fe
        L_0x0234:
            java.lang.String r2 = "V_VP8"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x02fd
            r2 = 0
            goto L_0x02fe
        L_0x023f:
            java.lang.String r2 = "V_AV1"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x02fd
            r2 = 2
            goto L_0x02fe
        L_0x024a:
            java.lang.String r2 = "A_DTS"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x02fd
            r2 = 19
            goto L_0x02fe
        L_0x0256:
            java.lang.String r2 = "A_AC3"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x02fd
            r2 = 16
            goto L_0x02fe
        L_0x0262:
            java.lang.String r2 = "A_AAC"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x02fd
            r2 = 13
            goto L_0x02fe
        L_0x026e:
            java.lang.String r2 = "A_DTS/LOSSLESS"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x02fd
            r2 = 21
            goto L_0x02fe
        L_0x027a:
            java.lang.String r2 = "S_VOBSUB"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x02fd
            r2 = 30
            goto L_0x02fe
        L_0x0286:
            java.lang.String r2 = "V_MPEG4/ISO/AVC"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x02fd
            r2 = 7
            goto L_0x02fe
        L_0x0291:
            java.lang.String r2 = "V_MPEG4/ISO/ASP"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x02fd
            r2 = 5
            goto L_0x02fe
        L_0x029c:
            java.lang.String r2 = "S_DVBSUB"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x02fd
            r2 = 32
            goto L_0x02fe
        L_0x02a7:
            java.lang.String r2 = "V_MS/VFW/FOURCC"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x02fd
            r2 = 9
            goto L_0x02fe
        L_0x02b2:
            java.lang.String r2 = "A_MPEG/L3"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x02fd
            r2 = 15
            goto L_0x02fe
        L_0x02bd:
            java.lang.String r2 = "A_MPEG/L2"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x02fd
            r2 = 14
            goto L_0x02fe
        L_0x02c8:
            java.lang.String r2 = "A_VORBIS"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x02fd
            r2 = 12
            goto L_0x02fe
        L_0x02d3:
            java.lang.String r2 = "A_TRUEHD"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x02fd
            r2 = 18
            goto L_0x02fe
        L_0x02de:
            java.lang.String r2 = "A_MS/ACM"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x02fd
            r2 = 23
            goto L_0x02fe
        L_0x02e9:
            java.lang.String r2 = "V_MPEG4/ISO/SP"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x02fd
            r2 = 4
            goto L_0x02fe
        L_0x02f3:
            java.lang.String r2 = "V_MPEG4/ISO/AP"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x02fd
            r2 = 6
            goto L_0x02fe
        L_0x02fd:
            r2 = -1
        L_0x02fe:
            switch(r2) {
                case 0: goto L_0x0303;
                case 1: goto L_0x0303;
                case 2: goto L_0x0303;
                case 3: goto L_0x0303;
                case 4: goto L_0x0303;
                case 5: goto L_0x0303;
                case 6: goto L_0x0303;
                case 7: goto L_0x0303;
                case 8: goto L_0x0303;
                case 9: goto L_0x0303;
                case 10: goto L_0x0303;
                case 11: goto L_0x0303;
                case 12: goto L_0x0303;
                case 13: goto L_0x0303;
                case 14: goto L_0x0303;
                case 15: goto L_0x0303;
                case 16: goto L_0x0303;
                case 17: goto L_0x0303;
                case 18: goto L_0x0303;
                case 19: goto L_0x0303;
                case 20: goto L_0x0303;
                case 21: goto L_0x0303;
                case 22: goto L_0x0303;
                case 23: goto L_0x0303;
                case 24: goto L_0x0303;
                case 25: goto L_0x0303;
                case 26: goto L_0x0303;
                case 27: goto L_0x0303;
                case 28: goto L_0x0303;
                case 29: goto L_0x0303;
                case 30: goto L_0x0303;
                case 31: goto L_0x0303;
                case 32: goto L_0x0303;
                default: goto L_0x0301;
            }
        L_0x0301:
            r0 = 0
            goto L_0x0312
        L_0x0303:
            com.google.android.gms.internal.ads.zzyv r1 = r7.zzai
            int r2 = r0.zzc
            r0.zze(r1, r2)
            android.util.SparseArray r1 = r7.zzj
            int r2 = r0.zzc
            r1.put(r2, r0)
            goto L_0x0301
        L_0x0312:
            r7.zzB = r0
            return
        L_0x0315:
            r0 = 0
            java.lang.String r1 = "CodecId is missing in TrackEntry element"
            com.google.android.gms.internal.ads.zzbp r0 = com.google.android.gms.internal.ads.zzbp.zza(r1, r0)
            throw r0
        L_0x031d:
            int r0 = r7.zzN
            if (r0 == r4) goto L_0x0322
            return
        L_0x0322:
            android.util.SparseArray r0 = r7.zzj
            int r1 = r7.zzT
            java.lang.Object r0 = r0.get(r1)
            r8 = r0
            com.google.android.gms.internal.ads.zzadg r8 = (com.google.android.gms.internal.ads.zzadg) r8
            r8.zzV.getClass()
            long r0 = r7.zzY
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x0358
            java.lang.String r0 = r8.zzb
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0358
            com.google.android.gms.internal.ads.zzdy r0 = r7.zzu
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r2)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r1 = r1.order(r2)
            long r2 = r7.zzY
            java.nio.ByteBuffer r1 = r1.putLong(r2)
            byte[] r1 = r1.array()
            int r2 = r1.length
            r0.zzD(r1, r2)
        L_0x0358:
            r0 = 0
            r4 = 0
        L_0x035a:
            int r1 = r7.zzR
            if (r4 >= r1) goto L_0x0366
            int[] r1 = r7.zzS
            r1 = r1[r4]
            int r0 = r0 + r1
            int r4 = r4 + 1
            goto L_0x035a
        L_0x0366:
            r4 = 0
        L_0x0367:
            int r1 = r7.zzR
            if (r4 >= r1) goto L_0x0397
            long r1 = r7.zzO
            int r3 = r8.zze
            int r3 = r3 * r4
            int r3 = r3 / 1000
            long r5 = (long) r3
            long r2 = r1 + r5
            int r1 = r7.zzV
            if (r4 != 0) goto L_0x0383
            boolean r4 = r7.zzX
            if (r4 != 0) goto L_0x0380
            r1 = r1 | 1
        L_0x0380:
            r4 = r1
            r9 = 0
            goto L_0x0385
        L_0x0383:
            r9 = r4
            r4 = r1
        L_0x0385:
            int[] r1 = r7.zzS
            r5 = r1[r9]
            int r10 = r0 - r5
            r0 = r21
            r1 = r8
            r6 = r10
            r0.zzu(r1, r2, r4, r5, r6)
            r0 = 1
            int r4 = r9 + 1
            r0 = r10
            goto L_0x0367
        L_0x0397:
            r1 = 0
            r7.zzN = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadh.zzh(int):void");
    }

    public final void zzi(int i, double d) throws zzbp {
        if (i == 181) {
            zzt(i);
            this.zzB.zzP = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    zzt(i);
                    this.zzB.zzC = (float) d;
                    return;
                case 21970:
                    zzt(i);
                    this.zzB.zzD = (float) d;
                    return;
                case 21971:
                    zzt(i);
                    this.zzB.zzE = (float) d;
                    return;
                case 21972:
                    zzt(i);
                    this.zzB.zzF = (float) d;
                    return;
                case 21973:
                    zzt(i);
                    this.zzB.zzG = (float) d;
                    return;
                case 21974:
                    zzt(i);
                    this.zzB.zzH = (float) d;
                    return;
                case 21975:
                    zzt(i);
                    this.zzB.zzI = (float) d;
                    return;
                case 21976:
                    zzt(i);
                    this.zzB.zzJ = (float) d;
                    return;
                case 21977:
                    zzt(i);
                    this.zzB.zzK = (float) d;
                    return;
                case 21978:
                    zzt(i);
                    this.zzB.zzL = (float) d;
                    return;
                default:
                    switch (i) {
                        case 30323:
                            zzt(i);
                            this.zzB.zzr = (float) d;
                            return;
                        case 30324:
                            zzt(i);
                            this.zzB.zzs = (float) d;
                            return;
                        case 30325:
                            zzt(i);
                            this.zzB.zzt = (float) d;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.zzz = (long) d;
        }
    }

    public final void zzj(int i, long j) throws zzbp {
        if (i != 20529) {
            if (i != 20530) {
                boolean z = false;
                switch (i) {
                    case 131:
                        zzt(i);
                        this.zzB.zzd = (int) j;
                        return;
                    case 136:
                        zzt(i);
                        zzadg zzadg = this.zzB;
                        if (j == 1) {
                            z = true;
                        }
                        zzadg.zzU = z;
                        return;
                    case 155:
                        this.zzP = zzr(j);
                        return;
                    case 159:
                        zzt(i);
                        this.zzB.zzN = (int) j;
                        return;
                    case 176:
                        zzt(i);
                        this.zzB.zzl = (int) j;
                        return;
                    case 179:
                        zzs(i);
                        this.zzJ.zzc(zzr(j));
                        return;
                    case 186:
                        zzt(i);
                        this.zzB.zzm = (int) j;
                        return;
                    case 215:
                        zzt(i);
                        this.zzB.zzc = (int) j;
                        return;
                    case 231:
                        this.zzI = zzr(j);
                        return;
                    case 238:
                        this.zzW = (int) j;
                        return;
                    case 241:
                        if (!this.zzL) {
                            zzs(i);
                            this.zzK.zzc(j);
                            this.zzL = true;
                            return;
                        }
                        return;
                    case 251:
                        this.zzX = true;
                        return;
                    case 16871:
                        zzt(i);
                        this.zzB.zzX = (int) j;
                        return;
                    case 16980:
                        if (j != 3) {
                            throw zzbp.zza("ContentCompAlgo " + j + " not supported", (Throwable) null);
                        }
                        return;
                    case 17029:
                        if (j < 1 || j > 2) {
                            throw zzbp.zza("DocTypeReadVersion " + j + " not supported", (Throwable) null);
                        }
                        return;
                    case 17143:
                        if (j != 1) {
                            throw zzbp.zza("EBMLReadVersion " + j + " not supported", (Throwable) null);
                        }
                        return;
                    case 18401:
                        if (j != 5) {
                            throw zzbp.zza("ContentEncAlgo " + j + " not supported", (Throwable) null);
                        }
                        return;
                    case 18408:
                        if (j != 1) {
                            throw zzbp.zza("AESSettingsCipherMode " + j + " not supported", (Throwable) null);
                        }
                        return;
                    case 21420:
                        this.zzE = j + this.zzx;
                        return;
                    case 21432:
                        zzt(i);
                        int i2 = (int) j;
                        if (i2 == 0) {
                            this.zzB.zzv = 0;
                            return;
                        } else if (i2 == 1) {
                            this.zzB.zzv = 2;
                            return;
                        } else if (i2 == 3) {
                            this.zzB.zzv = 1;
                            return;
                        } else if (i2 == 15) {
                            this.zzB.zzv = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        zzt(i);
                        this.zzB.zzn = (int) j;
                        return;
                    case 21682:
                        zzt(i);
                        this.zzB.zzp = (int) j;
                        return;
                    case 21690:
                        zzt(i);
                        this.zzB.zzo = (int) j;
                        return;
                    case 21930:
                        zzt(i);
                        zzadg zzadg2 = this.zzB;
                        if (j == 1) {
                            z = true;
                        }
                        zzadg2.zzT = z;
                        return;
                    case 21998:
                        zzt(i);
                        this.zzB.zzf = (int) j;
                        return;
                    case 22186:
                        zzt(i);
                        this.zzB.zzQ = j;
                        return;
                    case 22203:
                        zzt(i);
                        this.zzB.zzR = j;
                        return;
                    case 25188:
                        zzt(i);
                        this.zzB.zzO = (int) j;
                        return;
                    case 30114:
                        this.zzY = j;
                        return;
                    case 30321:
                        zzt(i);
                        int i3 = (int) j;
                        if (i3 == 0) {
                            this.zzB.zzq = 0;
                            return;
                        } else if (i3 == 1) {
                            this.zzB.zzq = 1;
                            return;
                        } else if (i3 == 2) {
                            this.zzB.zzq = 2;
                            return;
                        } else if (i3 == 3) {
                            this.zzB.zzq = 3;
                            return;
                        } else {
                            return;
                        }
                    case 2352003:
                        zzt(i);
                        this.zzB.zze = (int) j;
                        return;
                    case 2807729:
                        this.zzy = j;
                        return;
                    default:
                        switch (i) {
                            case 21945:
                                zzt(i);
                                int i4 = (int) j;
                                if (i4 == 1) {
                                    this.zzB.zzz = 2;
                                    return;
                                } else if (i4 == 2) {
                                    this.zzB.zzz = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                zzt(i);
                                int zzb2 = zzo.zzb((int) j);
                                if (zzb2 != -1) {
                                    this.zzB.zzy = zzb2;
                                    return;
                                }
                                return;
                            case 21947:
                                zzt(i);
                                zzadg zzadg3 = this.zzB;
                                zzadg3.zzw = true;
                                int zza2 = zzo.zza((int) j);
                                if (zza2 != -1) {
                                    zzadg3.zzx = zza2;
                                    return;
                                }
                                return;
                            case 21948:
                                zzt(i);
                                this.zzB.zzA = (int) j;
                                return;
                            case 21949:
                                zzt(i);
                                this.zzB.zzB = (int) j;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j != 1) {
                throw zzbp.zza("ContentEncodingScope " + j + " not supported", (Throwable) null);
            }
        } else if (j != 0) {
            throw zzbp.zza("ContentEncodingOrder " + j + " not supported", (Throwable) null);
        }
    }

    public final void zzk(int i, long j, long j2) throws zzbp {
        zzcw.zzb(this.zzai);
        if (i == 160) {
            this.zzX = false;
            this.zzY = 0;
        } else if (i == 174) {
            this.zzB = new zzadg();
        } else if (i == 187) {
            this.zzL = false;
        } else if (i == 19899) {
            this.zzD = -1;
            this.zzE = -1;
        } else if (i == 20533) {
            zzt(i);
            this.zzB.zzg = true;
        } else if (i == 21968) {
            zzt(i);
            this.zzB.zzw = true;
        } else if (i == 408125543) {
            long j3 = this.zzx;
            if (j3 == -1 || j3 == j) {
                this.zzx = j;
                this.zzw = j2;
                return;
            }
            throw zzbp.zza("Multiple Segment elements not supported", (Throwable) null);
        } else if (i == 475249515) {
            this.zzJ = new zzdo(32);
            this.zzK = new zzdo(32);
        } else if (i != 524531317 || this.zzC) {
        } else {
            if (!this.zzk || this.zzG == -1) {
                this.zzai.zzL(new zzzu(this.zzA, 0));
                this.zzC = true;
                return;
            }
            this.zzF = true;
        }
    }

    public final void zzl(int i, String str) throws zzbp {
        if (i == 134) {
            zzt(i);
            this.zzB.zzb = str;
        } else if (i != 17026) {
            if (i == 21358) {
                zzt(i);
                this.zzB.zza = str;
            } else if (i == 2274716) {
                zzt(i);
                this.zzB.zzY = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            throw zzbp.zza("DocType " + str + " not supported", (Throwable) null);
        }
    }

    public zzadh(int i) {
        zzada zzada = new zzada();
        this.zzx = -1;
        this.zzy = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzG = -1;
        this.zzH = -1;
        this.zzI = -9223372036854775807L;
        this.zzh = zzada;
        zzada.zza(new zzadf(this, (zzade) null));
        this.zzk = true;
        this.zzi = new zzadj();
        this.zzj = new SparseArray();
        this.zzn = new zzdy(4);
        this.zzo = new zzdy(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzp = new zzdy(4);
        this.zzl = new zzdy(zzzp.zza);
        this.zzm = new zzdy(4);
        this.zzq = new zzdy();
        this.zzr = new zzdy();
        this.zzs = new zzdy(8);
        this.zzt = new zzdy();
        this.zzu = new zzdy();
        this.zzS = new int[1];
    }
}
