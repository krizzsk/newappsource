package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.util.SparseIntArray;
import androidx.recyclerview.widget.RecyclerView;
import com.appboy.support.AppboyImageUtils;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import p988j$.util.Spliterator;

@SuppressLint({"InlinedApi"})
@TargetApi(16)
public final class zzawa {
    private static final zzavo zza = zzavo.zzb("OMX.google.raw.decoder");
    private static final Pattern zzb = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap zzc = new HashMap();
    private static final SparseIntArray zzd;
    private static final SparseIntArray zze;
    private static final Map zzf;
    private static int zzg = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        zzd = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        zze = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, RecyclerView.C1119a0.FLAG_IGNORE);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, Spliterator.SUBSIZED);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, SQLiteDatabase.OPEN_FULLMUTEX);
        HashMap hashMap = new HashMap();
        zzf = hashMap;
        hashMap.put("L30", 1);
        hashMap.put("L60", 4);
        hashMap.put("L63", 16);
        hashMap.put("L90", 64);
        hashMap.put("L93", 256);
        hashMap.put("L120", 1024);
        hashMap.put("L123", 4096);
        hashMap.put("L150", Integer.valueOf(Spliterator.SUBSIZED));
        hashMap.put("L153", Integer.valueOf(SQLiteDatabase.OPEN_FULLMUTEX));
        hashMap.put("L156", Integer.valueOf(SQLiteDatabase.OPEN_PRIVATECACHE));
        hashMap.put("L180", 1048576);
        hashMap.put("L183", 4194304);
        hashMap.put("L186", 16777216);
        hashMap.put("H30", 2);
        hashMap.put("H60", 8);
        hashMap.put("H63", 32);
        hashMap.put("H90", Integer.valueOf(RecyclerView.C1119a0.FLAG_IGNORE));
        hashMap.put("H93", 512);
        hashMap.put("H120", 2048);
        hashMap.put("H123", 8192);
        hashMap.put("H150", 32768);
        hashMap.put("H153", Integer.valueOf(SQLiteDatabase.OPEN_SHAREDCACHE));
        hashMap.put("H156", 524288);
        hashMap.put("H180", 2097152);
        hashMap.put("H183", 8388608);
        hashMap.put("H186", Integer.valueOf(AppboyImageUtils.MAX_IMAGE_CACHE_SIZE_BYTES));
    }

    public static int zza() throws zzavv {
        int i;
        int i2 = zzg;
        if (i2 == -1) {
            zzavo zzc2 = zzc("video/avc", false);
            if (zzc2 != null) {
                int i3 = 0;
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzc2.zzg()) {
                    int i4 = codecProfileLevel.level;
                    int i5 = 9437184;
                    if (i4 != 1 && i4 != 2) {
                        switch (i4) {
                            case 8:
                            case 16:
                            case 32:
                                i5 = 101376;
                                break;
                            case 64:
                                i5 = 202752;
                                break;
                            case RecyclerView.C1119a0.FLAG_IGNORE:
                            case 256:
                                i5 = 414720;
                                break;
                            case 512:
                                i5 = 921600;
                                break;
                            case 1024:
                                i5 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i5 = 2097152;
                                break;
                            case 8192:
                                i5 = 2228224;
                                break;
                            case Spliterator.SUBSIZED /*16384*/:
                                i5 = 5652480;
                                break;
                            case 32768:
                            case SQLiteDatabase.OPEN_FULLMUTEX:
                                break;
                            default:
                                i5 = -1;
                                break;
                        }
                    } else {
                        i5 = 25344;
                    }
                    i3 = Math.max(i5, i3);
                }
                if (zzazn.zza >= 21) {
                    i = 345600;
                } else {
                    i = 172800;
                }
                i2 = Math.max(i3, i);
            } else {
                i2 = 0;
            }
            zzg = i2;
        }
        return i2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair zzb(java.lang.String r11) {
        /*
            java.lang.String r0 = "\\."
            java.lang.String[] r0 = r11.split(r0)
            r1 = 0
            r2 = r0[r1]
            int r3 = r2.hashCode()
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r3) {
                case 3006243: goto L_0x0032;
                case 3006244: goto L_0x0028;
                case 3199032: goto L_0x001e;
                case 3214780: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x003c
        L_0x0014:
            java.lang.String r3 = "hvc1"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x003c
            r2 = 1
            goto L_0x003d
        L_0x001e:
            java.lang.String r3 = "hev1"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x003c
            r2 = 0
            goto L_0x003d
        L_0x0028:
            java.lang.String r3 = "avc2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x003c
            r2 = 3
            goto L_0x003d
        L_0x0032:
            java.lang.String r3 = "avc1"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x003c
            r2 = 2
            goto L_0x003d
        L_0x003c:
            r2 = -1
        L_0x003d:
            r3 = 4
            r7 = 0
            if (r2 == 0) goto L_0x00b5
            if (r2 == r6) goto L_0x00b5
            if (r2 == r5) goto L_0x0048
            if (r2 == r4) goto L_0x0048
            return r7
        L_0x0048:
            int r2 = r0.length
            java.lang.String r8 = "Ignoring malformed AVC codec string: "
            if (r2 >= r5) goto L_0x0051
            r8.concat(r11)
            goto L_0x00b4
        L_0x0051:
            r9 = r0[r6]     // Catch:{ NumberFormatException -> 0x00b1 }
            int r9 = r9.length()     // Catch:{ NumberFormatException -> 0x00b1 }
            r10 = 6
            if (r9 != r10) goto L_0x0079
            r2 = r0[r6]     // Catch:{ NumberFormatException -> 0x00b1 }
            java.lang.String r1 = r2.substring(r1, r5)     // Catch:{ NumberFormatException -> 0x00b1 }
            r2 = 16
            int r1 = java.lang.Integer.parseInt(r1, r2)     // Catch:{ NumberFormatException -> 0x00b1 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x00b1 }
            r0 = r0[r6]     // Catch:{ NumberFormatException -> 0x00b1 }
            java.lang.String r0 = r0.substring(r3)     // Catch:{ NumberFormatException -> 0x00b1 }
            int r0 = java.lang.Integer.parseInt(r0, r2)     // Catch:{ NumberFormatException -> 0x00b1 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00b1 }
            goto L_0x008f
        L_0x0079:
            if (r2 < r4) goto L_0x00b4
            r1 = r0[r6]     // Catch:{ NumberFormatException -> 0x00b1 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x00b1 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x00b1 }
            r0 = r0[r5]     // Catch:{ NumberFormatException -> 0x00b1 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x00b1 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00b1 }
        L_0x008f:
            android.util.SparseIntArray r0 = zzd
            int r1 = r1.intValue()
            int r0 = r0.get(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.SparseIntArray r1 = zze
            int r11 = r11.intValue()
            int r11 = r1.get(r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            android.util.Pair r7 = new android.util.Pair
            r7.<init>(r0, r11)
            goto L_0x00b4
        L_0x00b1:
            r8.concat(r11)
        L_0x00b4:
            return r7
        L_0x00b5:
            int r1 = r0.length
            java.lang.String r2 = "Ignoring malformed HEVC codec string: "
            if (r1 >= r3) goto L_0x00be
            r2.concat(r11)
            goto L_0x0113
        L_0x00be:
            java.util.regex.Pattern r1 = zzb
            r3 = r0[r6]
            java.util.regex.Matcher r1 = r1.matcher(r3)
            boolean r3 = r1.matches()
            if (r3 != 0) goto L_0x00d0
            r2.concat(r11)
            goto L_0x0113
        L_0x00d0:
            java.lang.String r11 = r1.group(r6)
            java.lang.String r2 = "1"
            boolean r2 = r2.equals(r11)
            if (r2 == 0) goto L_0x00de
            r5 = 1
            goto L_0x00e6
        L_0x00de:
            java.lang.String r2 = "2"
            boolean r2 = r2.equals(r11)
            if (r2 == 0) goto L_0x010a
        L_0x00e6:
            java.util.Map r11 = zzf
            r0 = r0[r4]
            java.lang.Object r11 = r11.get(r0)
            java.lang.Integer r11 = (java.lang.Integer) r11
            if (r11 != 0) goto L_0x0100
            java.lang.String r11 = r1.group(r6)
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r0 = "Unknown HEVC level string: "
            r0.concat(r11)
            goto L_0x0113
        L_0x0100:
            android.util.Pair r7 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r7.<init>(r0, r11)
            goto L_0x0113
        L_0x010a:
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r0 = "Unknown HEVC profile string: "
            r0.concat(r11)
        L_0x0113:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzawa.zzb(java.lang.String):android.util.Pair");
    }

    public static zzavo zzc(String str, boolean z) throws zzavv {
        List zzd2 = zzd(str, z);
        if (zzd2.isEmpty()) {
            return null;
        }
        return (zzavo) zzd2.get(0);
    }

    public static synchronized List zzd(String str, boolean z) throws zzavv {
        zzavw zzavw;
        synchronized (zzawa.class) {
            zzavt zzavt = new zzavt(str, z);
            HashMap hashMap = zzc;
            List list = (List) hashMap.get(zzavt);
            if (list != null) {
                return list;
            }
            int i = zzazn.zza;
            if (i >= 21) {
                zzavw = new zzavz(z);
            } else {
                zzavw = new zzavy((zzavx) null);
            }
            List zze2 = zze(zzavt, zzavw);
            if (z && zze2.isEmpty() && i >= 21 && i <= 23) {
                zze2 = zze(zzavt, new zzavy((zzavx) null));
                if (!zze2.isEmpty()) {
                    String str2 = ((zzavo) zze2.get(0)).zza;
                }
            }
            List unmodifiableList = Collections.unmodifiableList(zze2);
            hashMap.put(zzavt, unmodifiableList);
            return unmodifiableList;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:119:0x01bc A[Catch:{ Exception -> 0x01b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0200 A[Catch:{ Exception -> 0x0219 }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0201 A[Catch:{ Exception -> 0x0219 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List zze(com.google.android.gms.internal.ads.zzavt r17, com.google.android.gms.internal.ads.zzavw r18) throws com.google.android.gms.internal.ads.zzavv {
        /*
            r1 = r17
            r2 = r18
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x0219 }
            r3.<init>()     // Catch:{ Exception -> 0x0219 }
            java.lang.String r4 = r1.zza     // Catch:{ Exception -> 0x0219 }
            int r5 = r18.zza()     // Catch:{ Exception -> 0x0219 }
            boolean r6 = r18.zzd()     // Catch:{ Exception -> 0x0219 }
            r8 = 0
        L_0x0014:
            if (r8 >= r5) goto L_0x0218
            android.media.MediaCodecInfo r9 = r2.zzb(r8)     // Catch:{ Exception -> 0x0219 }
            java.lang.String r10 = r9.getName()     // Catch:{ Exception -> 0x0219 }
            boolean r0 = r9.isEncoder()     // Catch:{ Exception -> 0x0219 }
            if (r0 != 0) goto L_0x020d
            java.lang.String r11 = ".secure"
            if (r6 != 0) goto L_0x0030
            boolean r0 = r10.endsWith(r11)     // Catch:{ Exception -> 0x0219 }
            if (r0 == 0) goto L_0x0030
            goto L_0x020d
        L_0x0030:
            int r0 = com.google.android.gms.internal.ads.zzazn.zza     // Catch:{ Exception -> 0x0219 }
            r12 = 21
            if (r0 >= r12) goto L_0x0066
            java.lang.String r12 = "CIPAACDecoder"
            boolean r12 = r12.equals(r10)     // Catch:{ Exception -> 0x0219 }
            if (r12 != 0) goto L_0x020d
            java.lang.String r12 = "CIPMP3Decoder"
            boolean r12 = r12.equals(r10)     // Catch:{ Exception -> 0x0219 }
            if (r12 != 0) goto L_0x020d
            java.lang.String r12 = "CIPVorbisDecoder"
            boolean r12 = r12.equals(r10)     // Catch:{ Exception -> 0x0219 }
            if (r12 != 0) goto L_0x020d
            java.lang.String r12 = "CIPAMRNBDecoder"
            boolean r12 = r12.equals(r10)     // Catch:{ Exception -> 0x0219 }
            if (r12 != 0) goto L_0x020d
            java.lang.String r12 = "AACDecoder"
            boolean r12 = r12.equals(r10)     // Catch:{ Exception -> 0x0219 }
            if (r12 != 0) goto L_0x020d
            java.lang.String r12 = "MP3Decoder"
            boolean r12 = r12.equals(r10)     // Catch:{ Exception -> 0x0219 }
            if (r12 != 0) goto L_0x020d
        L_0x0066:
            r12 = 18
            if (r0 >= r12) goto L_0x0072
            java.lang.String r13 = "OMX.SEC.MP3.Decoder"
            boolean r13 = r13.equals(r10)     // Catch:{ Exception -> 0x0219 }
            if (r13 != 0) goto L_0x020d
        L_0x0072:
            if (r0 >= r12) goto L_0x0086
            java.lang.String r12 = "OMX.MTK.AUDIO.DECODER.AAC"
            boolean r12 = r12.equals(r10)     // Catch:{ Exception -> 0x0219 }
            if (r12 == 0) goto L_0x0086
            java.lang.String r12 = "a70"
            java.lang.String r13 = com.google.android.gms.internal.ads.zzazn.zzb     // Catch:{ Exception -> 0x0219 }
            boolean r12 = r12.equals(r13)     // Catch:{ Exception -> 0x0219 }
            if (r12 != 0) goto L_0x020d
        L_0x0086:
            r12 = 16
            if (r0 != r12) goto L_0x00f4
            java.lang.String r13 = "OMX.qcom.audio.decoder.mp3"
            boolean r13 = r13.equals(r10)     // Catch:{ Exception -> 0x0219 }
            if (r13 == 0) goto L_0x00f4
            java.lang.String r13 = "dlxu"
            java.lang.String r14 = com.google.android.gms.internal.ads.zzazn.zzb     // Catch:{ Exception -> 0x0219 }
            boolean r13 = r13.equals(r14)     // Catch:{ Exception -> 0x0219 }
            if (r13 != 0) goto L_0x020d
            java.lang.String r13 = "protou"
            boolean r13 = r13.equals(r14)     // Catch:{ Exception -> 0x0219 }
            if (r13 != 0) goto L_0x020d
            java.lang.String r13 = "ville"
            boolean r13 = r13.equals(r14)     // Catch:{ Exception -> 0x0219 }
            if (r13 != 0) goto L_0x020d
            java.lang.String r13 = "villeplus"
            boolean r13 = r13.equals(r14)     // Catch:{ Exception -> 0x0219 }
            if (r13 != 0) goto L_0x020d
            java.lang.String r13 = "villec2"
            boolean r13 = r13.equals(r14)     // Catch:{ Exception -> 0x0219 }
            if (r13 != 0) goto L_0x020d
            java.lang.String r13 = "gee"
            boolean r13 = r14.startsWith(r13)     // Catch:{ Exception -> 0x0219 }
            if (r13 != 0) goto L_0x020d
            java.lang.String r13 = "C6602"
            boolean r13 = r13.equals(r14)     // Catch:{ Exception -> 0x0219 }
            if (r13 != 0) goto L_0x020d
            java.lang.String r13 = "C6603"
            boolean r13 = r13.equals(r14)     // Catch:{ Exception -> 0x0219 }
            if (r13 != 0) goto L_0x020d
            java.lang.String r13 = "C6606"
            boolean r13 = r13.equals(r14)     // Catch:{ Exception -> 0x0219 }
            if (r13 != 0) goto L_0x020d
            java.lang.String r13 = "C6616"
            boolean r13 = r13.equals(r14)     // Catch:{ Exception -> 0x0219 }
            if (r13 != 0) goto L_0x020d
            java.lang.String r13 = "L36h"
            boolean r13 = r13.equals(r14)     // Catch:{ Exception -> 0x0219 }
            if (r13 != 0) goto L_0x020d
            java.lang.String r13 = "SO-02E"
            boolean r13 = r13.equals(r14)     // Catch:{ Exception -> 0x0219 }
            if (r13 != 0) goto L_0x020d
        L_0x00f4:
            if (r0 != r12) goto L_0x0120
            java.lang.String r12 = "OMX.qcom.audio.decoder.aac"
            boolean r12 = r12.equals(r10)     // Catch:{ Exception -> 0x0219 }
            if (r12 == 0) goto L_0x0120
            java.lang.String r12 = "C1504"
            java.lang.String r13 = com.google.android.gms.internal.ads.zzazn.zzb     // Catch:{ Exception -> 0x0219 }
            boolean r12 = r12.equals(r13)     // Catch:{ Exception -> 0x0219 }
            if (r12 != 0) goto L_0x020d
            java.lang.String r12 = "C1505"
            boolean r12 = r12.equals(r13)     // Catch:{ Exception -> 0x0219 }
            if (r12 != 0) goto L_0x020d
            java.lang.String r12 = "C1604"
            boolean r12 = r12.equals(r13)     // Catch:{ Exception -> 0x0219 }
            if (r12 != 0) goto L_0x020d
            java.lang.String r12 = "C1605"
            boolean r12 = r12.equals(r13)     // Catch:{ Exception -> 0x0219 }
            if (r12 != 0) goto L_0x020d
        L_0x0120:
            java.lang.String r12 = "jflte"
            r13 = 19
            if (r0 > r13) goto L_0x0160
            java.lang.String r14 = "OMX.SEC.vp8.dec"
            boolean r14 = r14.equals(r10)     // Catch:{ Exception -> 0x0219 }
            if (r14 == 0) goto L_0x0160
            java.lang.String r14 = "samsung"
            java.lang.String r15 = com.google.android.gms.internal.ads.zzazn.zzc     // Catch:{ Exception -> 0x0219 }
            boolean r14 = r14.equals(r15)     // Catch:{ Exception -> 0x0219 }
            if (r14 == 0) goto L_0x0160
            java.lang.String r14 = com.google.android.gms.internal.ads.zzazn.zzb     // Catch:{ Exception -> 0x0219 }
            java.lang.String r15 = "d2"
            boolean r15 = r14.startsWith(r15)     // Catch:{ Exception -> 0x0219 }
            if (r15 != 0) goto L_0x020d
            java.lang.String r15 = "serrano"
            boolean r15 = r14.startsWith(r15)     // Catch:{ Exception -> 0x0219 }
            if (r15 != 0) goto L_0x020d
            boolean r15 = r14.startsWith(r12)     // Catch:{ Exception -> 0x0219 }
            if (r15 != 0) goto L_0x020d
            java.lang.String r15 = "santos"
            boolean r15 = r14.startsWith(r15)     // Catch:{ Exception -> 0x0219 }
            if (r15 != 0) goto L_0x020d
            java.lang.String r15 = "t0"
            boolean r14 = r14.startsWith(r15)     // Catch:{ Exception -> 0x0219 }
            if (r14 != 0) goto L_0x020d
        L_0x0160:
            if (r0 > r13) goto L_0x0172
            java.lang.String r0 = com.google.android.gms.internal.ads.zzazn.zzb     // Catch:{ Exception -> 0x0219 }
            boolean r0 = r0.startsWith(r12)     // Catch:{ Exception -> 0x0219 }
            if (r0 == 0) goto L_0x0172
            java.lang.String r0 = "OMX.qcom.video.decoder.vp8"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0219 }
            if (r0 != 0) goto L_0x020d
        L_0x0172:
            java.lang.String[] r12 = r9.getSupportedTypes()     // Catch:{ Exception -> 0x0219 }
            int r13 = r12.length     // Catch:{ Exception -> 0x0219 }
            r14 = 0
        L_0x0178:
            if (r14 >= r13) goto L_0x020d
            r0 = r12[r14]     // Catch:{ Exception -> 0x0219 }
            boolean r15 = r0.equalsIgnoreCase(r4)     // Catch:{ Exception -> 0x0219 }
            if (r15 == 0) goto L_0x0202
            android.media.MediaCodecInfo$CodecCapabilities r0 = r9.getCapabilitiesForType(r0)     // Catch:{ Exception -> 0x01f0 }
            boolean r15 = r2.zzc(r4, r0)     // Catch:{ Exception -> 0x01f0 }
            int r7 = com.google.android.gms.internal.ads.zzazn.zza     // Catch:{ Exception -> 0x01f0 }
            r2 = 22
            r16 = r5
            r5 = 1
            if (r7 > r2) goto L_0x01b9
            java.lang.String r2 = com.google.android.gms.internal.ads.zzazn.zzd     // Catch:{ Exception -> 0x01b7 }
            java.lang.String r7 = "ODROID-XU3"
            boolean r7 = r2.equals(r7)     // Catch:{ Exception -> 0x01b7 }
            if (r7 != 0) goto L_0x01a5
            java.lang.String r7 = "Nexus 10"
            boolean r2 = r2.equals(r7)     // Catch:{ Exception -> 0x01b7 }
            if (r2 == 0) goto L_0x01b9
        L_0x01a5:
            java.lang.String r2 = "OMX.Exynos.AVC.Decoder"
            boolean r2 = r2.equals(r10)     // Catch:{ Exception -> 0x01b7 }
            if (r2 != 0) goto L_0x01b5
            java.lang.String r2 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r2 = r2.equals(r10)     // Catch:{ Exception -> 0x01b7 }
            if (r2 == 0) goto L_0x01b9
        L_0x01b5:
            r2 = 1
            goto L_0x01ba
        L_0x01b7:
            r0 = move-exception
            goto L_0x01f3
        L_0x01b9:
            r2 = 0
        L_0x01ba:
            if (r6 == 0) goto L_0x01c3
            boolean r7 = r1.zzb     // Catch:{ Exception -> 0x01b7 }
            if (r7 == r15) goto L_0x01c1
            goto L_0x01c3
        L_0x01c1:
            r7 = 0
            goto L_0x01ca
        L_0x01c3:
            if (r6 != 0) goto L_0x01d4
            boolean r7 = r1.zzb     // Catch:{ Exception -> 0x01b7 }
            if (r7 != 0) goto L_0x01d4
            goto L_0x01c1
        L_0x01ca:
            com.google.android.gms.internal.ads.zzavo r0 = com.google.android.gms.internal.ads.zzavo.zza(r10, r4, r0, r2, r7)     // Catch:{ Exception -> 0x01d2 }
            r3.add(r0)     // Catch:{ Exception -> 0x01d2 }
            goto L_0x0205
        L_0x01d2:
            r0 = move-exception
            goto L_0x01f4
        L_0x01d4:
            r7 = 0
            if (r6 != 0) goto L_0x0205
            if (r15 == 0) goto L_0x0205
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01d2 }
            r15.<init>()     // Catch:{ Exception -> 0x01d2 }
            r15.append(r10)     // Catch:{ Exception -> 0x01d2 }
            r15.append(r11)     // Catch:{ Exception -> 0x01d2 }
            java.lang.String r15 = r15.toString()     // Catch:{ Exception -> 0x01d2 }
            com.google.android.gms.internal.ads.zzavo r0 = com.google.android.gms.internal.ads.zzavo.zza(r15, r4, r0, r2, r5)     // Catch:{ Exception -> 0x01d2 }
            r3.add(r0)     // Catch:{ Exception -> 0x01d2 }
            return r3
        L_0x01f0:
            r0 = move-exception
            r16 = r5
        L_0x01f3:
            r7 = 0
        L_0x01f4:
            int r2 = com.google.android.gms.internal.ads.zzazn.zza     // Catch:{ Exception -> 0x0219 }
            r5 = 23
            if (r2 > r5) goto L_0x0201
            boolean r2 = r3.isEmpty()     // Catch:{ Exception -> 0x0219 }
            if (r2 != 0) goto L_0x0201
            goto L_0x0205
        L_0x0201:
            throw r0     // Catch:{ Exception -> 0x0219 }
        L_0x0202:
            r16 = r5
            r7 = 0
        L_0x0205:
            int r14 = r14 + 1
            r2 = r18
            r5 = r16
            goto L_0x0178
        L_0x020d:
            r16 = r5
            r7 = 0
            int r8 = r8 + 1
            r2 = r18
            r5 = r16
            goto L_0x0014
        L_0x0218:
            return r3
        L_0x0219:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzavv r1 = new com.google.android.gms.internal.ads.zzavv
            r2 = 0
            r1.<init>(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzawa.zze(com.google.android.gms.internal.ads.zzavt, com.google.android.gms.internal.ads.zzavw):java.util.List");
    }
}
