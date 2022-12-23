package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import p988j$.util.Spliterator;

@SuppressLint({"InlinedApi"})
public final class zzqy {
    public static final /* synthetic */ int zza = 0;
    private static final Pattern zzb = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap zzc = new HashMap();
    private static int zzd = -1;

    public static int zza() throws zzqs {
        int i;
        int i2;
        int i3 = zzd;
        if (i3 == -1) {
            zzqg zzc2 = zzc("video/avc", false, false);
            if (zzc2 != null) {
                int i4 = 0;
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzc2.zzg()) {
                    int i5 = codecProfileLevel.level;
                    if (i5 != 1 && i5 != 2) {
                        switch (i5) {
                            case 8:
                            case 16:
                            case 32:
                                i2 = 101376;
                                break;
                            case 64:
                                i2 = 202752;
                                break;
                            case RecyclerView.C1119a0.FLAG_IGNORE:
                            case 256:
                                i2 = 414720;
                                break;
                            case 512:
                                i2 = 921600;
                                break;
                            case 1024:
                                i2 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i2 = 2097152;
                                break;
                            case 8192:
                                i2 = 2228224;
                                break;
                            case Spliterator.SUBSIZED /*16384*/:
                                i2 = 5652480;
                                break;
                            case 32768:
                            case SQLiteDatabase.OPEN_FULLMUTEX:
                                i2 = 9437184;
                                break;
                            case SQLiteDatabase.OPEN_SHAREDCACHE:
                            case SQLiteDatabase.OPEN_PRIVATECACHE:
                            case 524288:
                                i2 = 35651584;
                                break;
                            default:
                                i2 = -1;
                                break;
                        }
                    } else {
                        i2 = 25344;
                    }
                    i4 = Math.max(i2, i4);
                }
                if (zzeg.zza >= 21) {
                    i = 345600;
                } else {
                    i = 172800;
                }
                i3 = Math.max(i4, i);
            } else {
                i3 = 0;
            }
            zzd = i3;
        }
        return i3;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0377, code lost:
        r1 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0378, code lost:
        if (r5 != r1) goto L_0x037b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x042a, code lost:
        if (r1.equals("L150") != false) goto L_0x050e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:?, code lost:
        return new android.util.Pair(java.lang.Integer.valueOf(r0), java.lang.Integer.valueOf(r5));
     */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x02bb A[Catch:{ NumberFormatException -> 0x02cb }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair zzb(com.google.android.gms.internal.ads.zzad r17) {
        /*
            r0 = r17
            java.lang.String r1 = r0.zzj
            r2 = 0
            if (r1 != 0) goto L_0x0008
            return r2
        L_0x0008:
            java.lang.String r3 = "\\."
            java.lang.String[] r1 = r1.split(r3)
            java.lang.String r3 = r0.zzm
            java.lang.String r4 = "video/dolby-vision"
            boolean r3 = r4.equals(r3)
            r7 = 2048(0x800, float:2.87E-42)
            r8 = 512(0x200, float:7.175E-43)
            r9 = 256(0x100, float:3.59E-43)
            r10 = 128(0x80, float:1.794E-43)
            r12 = 64
            r13 = 32
            r15 = 4096(0x1000, float:5.74E-42)
            r6 = 16
            r2 = 8
            r11 = 3
            r4 = 4
            r14 = 2
            r5 = 1
            if (r3 == 0) goto L_0x01f3
            java.lang.String r0 = r0.zzj
            int r3 = r1.length
            if (r3 >= r11) goto L_0x003f
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed Dolby Vision codec string: "
            r1.concat(r0)
        L_0x003c:
            r2 = 0
            goto L_0x01f2
        L_0x003f:
            java.util.regex.Pattern r3 = zzb
            r11 = r1[r5]
            java.util.regex.Matcher r3 = r3.matcher(r11)
            boolean r11 = r3.matches()
            if (r11 != 0) goto L_0x0057
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed Dolby Vision codec string: "
            r1.concat(r0)
            goto L_0x003c
        L_0x0057:
            java.lang.String r0 = r3.group(r5)
            if (r0 != 0) goto L_0x0060
        L_0x005d:
            r3 = 0
            goto L_0x0112
        L_0x0060:
            int r3 = r0.hashCode()
            switch(r3) {
                case 1536: goto L_0x00cf;
                case 1537: goto L_0x00c4;
                case 1538: goto L_0x00b9;
                case 1539: goto L_0x00ae;
                case 1540: goto L_0x00a3;
                case 1541: goto L_0x0098;
                case 1542: goto L_0x008d;
                case 1543: goto L_0x0082;
                case 1544: goto L_0x0077;
                case 1545: goto L_0x0069;
                default: goto L_0x0067;
            }
        L_0x0067:
            goto L_0x00da
        L_0x0069:
            java.lang.String r3 = "09"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x00da
            r3 = 9
            r16 = 9
            goto L_0x00dc
        L_0x0077:
            java.lang.String r3 = "08"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x00da
            r16 = 8
            goto L_0x00dc
        L_0x0082:
            java.lang.String r3 = "07"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x00da
            r16 = 7
            goto L_0x00dc
        L_0x008d:
            java.lang.String r3 = "06"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x00da
            r16 = 6
            goto L_0x00dc
        L_0x0098:
            java.lang.String r3 = "05"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x00da
            r16 = 5
            goto L_0x00dc
        L_0x00a3:
            java.lang.String r3 = "04"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x00da
            r16 = 4
            goto L_0x00dc
        L_0x00ae:
            java.lang.String r3 = "03"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x00da
            r16 = 3
            goto L_0x00dc
        L_0x00b9:
            java.lang.String r3 = "02"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x00da
            r16 = 2
            goto L_0x00dc
        L_0x00c4:
            java.lang.String r3 = "01"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x00da
            r16 = 1
            goto L_0x00dc
        L_0x00cf:
            java.lang.String r3 = "00"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x00da
            r16 = 0
            goto L_0x00dc
        L_0x00da:
            r16 = -1
        L_0x00dc:
            switch(r16) {
                case 0: goto L_0x010e;
                case 1: goto L_0x0109;
                case 2: goto L_0x0104;
                case 3: goto L_0x00ff;
                case 4: goto L_0x00fa;
                case 5: goto L_0x00f5;
                case 6: goto L_0x00f0;
                case 7: goto L_0x00eb;
                case 8: goto L_0x00e6;
                case 9: goto L_0x00e1;
                default: goto L_0x00df;
            }
        L_0x00df:
            goto L_0x005d
        L_0x00e1:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            goto L_0x0112
        L_0x00e6:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            goto L_0x0112
        L_0x00eb:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            goto L_0x0112
        L_0x00f0:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            goto L_0x0112
        L_0x00f5:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            goto L_0x0112
        L_0x00fa:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            goto L_0x0112
        L_0x00ff:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            goto L_0x0112
        L_0x0104:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            goto L_0x0112
        L_0x0109:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r14)
            goto L_0x0112
        L_0x010e:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
        L_0x0112:
            if (r3 != 0) goto L_0x011f
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Unknown Dolby Vision profile string: "
            r1.concat(r0)
            goto L_0x003c
        L_0x011f:
            r0 = r1[r14]
            if (r0 != 0) goto L_0x0126
        L_0x0123:
            r1 = 0
            goto L_0x01e0
        L_0x0126:
            int r1 = r0.hashCode()
            switch(r1) {
                case 1537: goto L_0x01d4;
                case 1538: goto L_0x01c7;
                case 1539: goto L_0x01ba;
                case 1540: goto L_0x01ad;
                case 1541: goto L_0x01a0;
                case 1542: goto L_0x0193;
                case 1543: goto L_0x0186;
                case 1544: goto L_0x0179;
                case 1545: goto L_0x016b;
                default: goto L_0x012d;
            }
        L_0x012d:
            switch(r1) {
                case 1567: goto L_0x015d;
                case 1568: goto L_0x014d;
                case 1569: goto L_0x013f;
                case 1570: goto L_0x0131;
                default: goto L_0x0130;
            }
        L_0x0130:
            goto L_0x0123
        L_0x0131:
            java.lang.String r1 = "13"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0123
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            goto L_0x01e0
        L_0x013f:
            java.lang.String r1 = "12"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0123
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            goto L_0x01e0
        L_0x014d:
            java.lang.String r1 = "11"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0123
            r1 = 1024(0x400, float:1.435E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x01e0
        L_0x015d:
            java.lang.String r1 = "10"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0123
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            goto L_0x01e0
        L_0x016b:
            java.lang.String r1 = "09"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0123
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            goto L_0x01e0
        L_0x0179:
            java.lang.String r1 = "08"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0123
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            goto L_0x01e0
        L_0x0186:
            java.lang.String r1 = "07"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0123
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            goto L_0x01e0
        L_0x0193:
            java.lang.String r1 = "06"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0123
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            goto L_0x01e0
        L_0x01a0:
            java.lang.String r1 = "05"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0123
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            goto L_0x01e0
        L_0x01ad:
            java.lang.String r1 = "04"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0123
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            goto L_0x01e0
        L_0x01ba:
            java.lang.String r1 = "03"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0123
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            goto L_0x01e0
        L_0x01c7:
            java.lang.String r1 = "02"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0123
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            goto L_0x01e0
        L_0x01d4:
            java.lang.String r1 = "01"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0123
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
        L_0x01e0:
            if (r1 != 0) goto L_0x01ed
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Unknown Dolby Vision level string: "
            r1.concat(r0)
            goto L_0x003c
        L_0x01ed:
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r3, r1)
        L_0x01f2:
            return r2
        L_0x01f3:
            r3 = 0
            r11 = r1[r3]
            int r3 = r11.hashCode()
            switch(r3) {
                case 3004662: goto L_0x023a;
                case 3006243: goto L_0x0230;
                case 3006244: goto L_0x0226;
                case 3199032: goto L_0x021c;
                case 3214780: goto L_0x0212;
                case 3356560: goto L_0x0208;
                case 3624515: goto L_0x01fe;
                default: goto L_0x01fd;
            }
        L_0x01fd:
            goto L_0x0244
        L_0x01fe:
            java.lang.String r3 = "vp09"
            boolean r3 = r11.equals(r3)
            if (r3 == 0) goto L_0x0244
            r3 = 2
            goto L_0x0245
        L_0x0208:
            java.lang.String r3 = "mp4a"
            boolean r3 = r11.equals(r3)
            if (r3 == 0) goto L_0x0244
            r3 = 6
            goto L_0x0245
        L_0x0212:
            java.lang.String r3 = "hvc1"
            boolean r3 = r11.equals(r3)
            if (r3 == 0) goto L_0x0244
            r3 = 4
            goto L_0x0245
        L_0x021c:
            java.lang.String r3 = "hev1"
            boolean r3 = r11.equals(r3)
            if (r3 == 0) goto L_0x0244
            r3 = 3
            goto L_0x0245
        L_0x0226:
            java.lang.String r3 = "avc2"
            boolean r3 = r11.equals(r3)
            if (r3 == 0) goto L_0x0244
            r3 = 1
            goto L_0x0245
        L_0x0230:
            java.lang.String r3 = "avc1"
            boolean r3 = r11.equals(r3)
            if (r3 == 0) goto L_0x0244
            r3 = 0
            goto L_0x0245
        L_0x023a:
            java.lang.String r3 = "av01"
            boolean r3 = r11.equals(r3)
            if (r3 == 0) goto L_0x0244
            r3 = 5
            goto L_0x0245
        L_0x0244:
            r3 = -1
        L_0x0245:
            r11 = 8192(0x2000, float:1.14794E-41)
            r12 = 20
            switch(r3) {
                case 0: goto L_0x0693;
                case 1: goto L_0x0693;
                case 2: goto L_0x05e3;
                case 3: goto L_0x0395;
                case 4: goto L_0x0395;
                case 5: goto L_0x02d6;
                case 6: goto L_0x024e;
                default: goto L_0x024c;
            }
        L_0x024c:
            r0 = 0
            return r0
        L_0x024e:
            java.lang.String r0 = r0.zzj
            int r2 = r1.length
            r3 = 3
            if (r2 == r3) goto L_0x0260
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed MP4A codec string: "
            r1.concat(r0)
        L_0x025d:
            r2 = 0
            goto L_0x02d5
        L_0x0260:
            java.lang.String r2 = "audio/mp4a-latm"
            r3 = r1[r5]     // Catch:{ NumberFormatException -> 0x02cb }
            int r3 = java.lang.Integer.parseInt(r3, r6)     // Catch:{ NumberFormatException -> 0x02cb }
            java.lang.String r3 = com.google.android.gms.internal.ads.zzbo.zzd(r3)     // Catch:{ NumberFormatException -> 0x02cb }
            boolean r2 = r2.equals(r3)     // Catch:{ NumberFormatException -> 0x02cb }
            if (r2 == 0) goto L_0x025d
            r1 = r1[r14]     // Catch:{ NumberFormatException -> 0x02cb }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x02cb }
            r2 = 17
            if (r1 == r2) goto L_0x02b6
            if (r1 == r12) goto L_0x02b2
            r2 = 23
            if (r1 == r2) goto L_0x02af
            r2 = 29
            if (r1 == r2) goto L_0x02ac
            r2 = 39
            if (r1 == r2) goto L_0x02a9
            r2 = 42
            if (r1 == r2) goto L_0x02a6
            switch(r1) {
                case 1: goto L_0x02a3;
                case 2: goto L_0x02a0;
                case 3: goto L_0x029d;
                case 4: goto L_0x029a;
                case 5: goto L_0x0297;
                case 6: goto L_0x0294;
                default: goto L_0x0291;
            }     // Catch:{ NumberFormatException -> 0x02cb }
        L_0x0291:
            r1 = -1
            r6 = -1
            goto L_0x02b9
        L_0x0294:
            r1 = -1
            r6 = 6
            goto L_0x02b9
        L_0x0297:
            r1 = -1
            r6 = 5
            goto L_0x02b9
        L_0x029a:
            r1 = -1
            r6 = 4
            goto L_0x02b9
        L_0x029d:
            r1 = -1
            r6 = 3
            goto L_0x02b9
        L_0x02a0:
            r1 = -1
            r6 = 2
            goto L_0x02b9
        L_0x02a3:
            r1 = -1
            r6 = 1
            goto L_0x02b9
        L_0x02a6:
            r6 = 42
            goto L_0x02b8
        L_0x02a9:
            r6 = 39
            goto L_0x02b8
        L_0x02ac:
            r6 = 29
            goto L_0x02b8
        L_0x02af:
            r6 = 23
            goto L_0x02b8
        L_0x02b2:
            r1 = -1
            r6 = 20
            goto L_0x02b9
        L_0x02b6:
            r6 = 17
        L_0x02b8:
            r1 = -1
        L_0x02b9:
            if (r6 == r1) goto L_0x025d
            android.util.Pair r1 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x02cb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch:{ NumberFormatException -> 0x02cb }
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x02cb }
            r1.<init>(r2, r3)     // Catch:{ NumberFormatException -> 0x02cb }
            r2 = r1
            goto L_0x02d5
        L_0x02cb:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed MP4A codec string: "
            r1.concat(r0)
            goto L_0x025d
        L_0x02d5:
            return r2
        L_0x02d6:
            java.lang.String r3 = r0.zzj
            com.google.android.gms.internal.ads.zzo r0 = r0.zzy
            int r12 = r1.length
            if (r12 >= r4) goto L_0x02e9
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.lang.String r1 = "Ignoring malformed AV1 codec string: "
            r1.concat(r0)
        L_0x02e6:
            r2 = 0
            goto L_0x0394
        L_0x02e9:
            r12 = r1[r5]     // Catch:{ NumberFormatException -> 0x0389 }
            int r12 = java.lang.Integer.parseInt(r12)     // Catch:{ NumberFormatException -> 0x0389 }
            r6 = r1[r14]     // Catch:{ NumberFormatException -> 0x0389 }
            r9 = 0
            java.lang.String r6 = r6.substring(r9, r14)     // Catch:{ NumberFormatException -> 0x0389 }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x0389 }
            r9 = 3
            r1 = r1[r9]     // Catch:{ NumberFormatException -> 0x0389 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0389 }
            if (r12 == 0) goto L_0x0304
        L_0x0303:
            goto L_0x02e6
        L_0x0304:
            if (r1 == r2) goto L_0x031e
            r3 = 10
            if (r1 == r3) goto L_0x030b
            goto L_0x0303
        L_0x030b:
            if (r0 == 0) goto L_0x031c
            byte[] r1 = r0.zze
            if (r1 != 0) goto L_0x0319
            int r0 = r0.zzd
            r3 = 7
            if (r0 == r3) goto L_0x0319
            r1 = 6
            if (r0 != r1) goto L_0x031c
        L_0x0319:
            r0 = 4096(0x1000, float:5.74E-42)
            goto L_0x031f
        L_0x031c:
            r0 = 2
            goto L_0x031f
        L_0x031e:
            r0 = 1
        L_0x031f:
            switch(r6) {
                case 0: goto L_0x0377;
                case 1: goto L_0x0374;
                case 2: goto L_0x0371;
                case 3: goto L_0x036d;
                case 4: goto L_0x0369;
                case 5: goto L_0x0365;
                case 6: goto L_0x0361;
                case 7: goto L_0x035d;
                case 8: goto L_0x0359;
                case 9: goto L_0x0355;
                case 10: goto L_0x0351;
                case 11: goto L_0x034d;
                case 12: goto L_0x0349;
                case 13: goto L_0x0345;
                case 14: goto L_0x0342;
                case 15: goto L_0x033e;
                case 16: goto L_0x033b;
                case 17: goto L_0x0338;
                case 18: goto L_0x0335;
                case 19: goto L_0x0332;
                case 20: goto L_0x032f;
                case 21: goto L_0x032c;
                case 22: goto L_0x0329;
                case 23: goto L_0x0326;
                default: goto L_0x0322;
            }
        L_0x0322:
            r1 = -1
            r5 = -1
            goto L_0x0378
        L_0x0326:
            r5 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0377
        L_0x0329:
            r5 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x0377
        L_0x032c:
            r5 = 2097152(0x200000, float:2.938736E-39)
            goto L_0x0377
        L_0x032f:
            r5 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0377
        L_0x0332:
            r5 = 524288(0x80000, float:7.34684E-40)
            goto L_0x0377
        L_0x0335:
            r5 = 262144(0x40000, float:3.67342E-40)
            goto L_0x0377
        L_0x0338:
            r5 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0377
        L_0x033b:
            r5 = 65536(0x10000, float:9.18355E-41)
            goto L_0x0377
        L_0x033e:
            r5 = 32768(0x8000, float:4.5918E-41)
            goto L_0x0377
        L_0x0342:
            r5 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0377
        L_0x0345:
            r1 = -1
            r5 = 8192(0x2000, float:1.14794E-41)
            goto L_0x0378
        L_0x0349:
            r1 = -1
            r5 = 4096(0x1000, float:5.74E-42)
            goto L_0x0378
        L_0x034d:
            r1 = -1
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x0378
        L_0x0351:
            r1 = -1
            r5 = 1024(0x400, float:1.435E-42)
            goto L_0x0378
        L_0x0355:
            r1 = -1
            r5 = 512(0x200, float:7.175E-43)
            goto L_0x0378
        L_0x0359:
            r1 = -1
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0378
        L_0x035d:
            r1 = -1
            r5 = 128(0x80, float:1.794E-43)
            goto L_0x0378
        L_0x0361:
            r1 = -1
            r5 = 64
            goto L_0x0378
        L_0x0365:
            r1 = -1
            r5 = 32
            goto L_0x0378
        L_0x0369:
            r1 = -1
            r5 = 16
            goto L_0x0378
        L_0x036d:
            r1 = -1
            r5 = 8
            goto L_0x0378
        L_0x0371:
            r1 = -1
            r5 = 4
            goto L_0x0378
        L_0x0374:
            r1 = -1
            r5 = 2
            goto L_0x0378
        L_0x0377:
            r1 = -1
        L_0x0378:
            if (r5 != r1) goto L_0x037b
            goto L_0x0303
        L_0x037b:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r2.<init>(r0, r1)
            goto L_0x0394
        L_0x0389:
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.lang.String r1 = "Ignoring malformed AV1 codec string: "
            r1.concat(r0)
            goto L_0x02e6
        L_0x0394:
            return r2
        L_0x0395:
            r3 = 7
            java.lang.String r0 = r0.zzj
            int r6 = r1.length
            if (r6 >= r4) goto L_0x03a7
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed HEVC codec string: "
            r1.concat(r0)
        L_0x03a4:
            r2 = 0
            goto L_0x05e2
        L_0x03a7:
            java.util.regex.Pattern r6 = zzb
            r9 = r1[r5]
            java.util.regex.Matcher r6 = r6.matcher(r9)
            boolean r9 = r6.matches()
            if (r9 != 0) goto L_0x03bf
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed HEVC codec string: "
            r1.concat(r0)
            goto L_0x03a4
        L_0x03bf:
            java.lang.String r0 = r6.group(r5)
            java.lang.String r6 = "1"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x03ce
            r0 = 1
        L_0x03cc:
            r6 = 3
            goto L_0x03d8
        L_0x03ce:
            java.lang.String r6 = "2"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x05d7
            r0 = 2
            goto L_0x03cc
        L_0x03d8:
            r1 = r1[r6]
            if (r1 != 0) goto L_0x03df
        L_0x03dc:
            r2 = 0
            goto L_0x05bf
        L_0x03df:
            int r6 = r1.hashCode()
            switch(r6) {
                case 70821: goto L_0x0502;
                case 70914: goto L_0x04f7;
                case 70917: goto L_0x04ec;
                case 71007: goto L_0x04e1;
                case 71010: goto L_0x04d6;
                case 74665: goto L_0x04cc;
                case 74758: goto L_0x04c2;
                case 74761: goto L_0x04b8;
                case 74851: goto L_0x04ae;
                case 74854: goto L_0x04a4;
                case 2193639: goto L_0x0498;
                case 2193642: goto L_0x048c;
                case 2193732: goto L_0x0480;
                case 2193735: goto L_0x0474;
                case 2193738: goto L_0x0468;
                case 2193825: goto L_0x045c;
                case 2193828: goto L_0x0450;
                case 2193831: goto L_0x0444;
                case 2312803: goto L_0x0439;
                case 2312806: goto L_0x042e;
                case 2312896: goto L_0x0424;
                case 2312899: goto L_0x0418;
                case 2312902: goto L_0x040c;
                case 2312989: goto L_0x0400;
                case 2312992: goto L_0x03f4;
                case 2312995: goto L_0x03e8;
                default: goto L_0x03e6;
            }
        L_0x03e6:
            goto L_0x050d
        L_0x03e8:
            java.lang.String r3 = "L186"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x050d
            r3 = 12
            goto L_0x050e
        L_0x03f4:
            java.lang.String r3 = "L183"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x050d
            r3 = 11
            goto L_0x050e
        L_0x0400:
            java.lang.String r3 = "L180"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x050d
            r3 = 10
            goto L_0x050e
        L_0x040c:
            java.lang.String r3 = "L156"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x050d
            r3 = 9
            goto L_0x050e
        L_0x0418:
            java.lang.String r3 = "L153"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x050d
            r3 = 8
            goto L_0x050e
        L_0x0424:
            java.lang.String r6 = "L150"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x050d
            goto L_0x050e
        L_0x042e:
            java.lang.String r3 = "L123"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x050d
            r3 = 6
            goto L_0x050e
        L_0x0439:
            java.lang.String r3 = "L120"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x050d
            r3 = 5
            goto L_0x050e
        L_0x0444:
            java.lang.String r3 = "H186"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x050d
            r3 = 25
            goto L_0x050e
        L_0x0450:
            java.lang.String r3 = "H183"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x050d
            r3 = 24
            goto L_0x050e
        L_0x045c:
            java.lang.String r3 = "H180"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x050d
            r3 = 23
            goto L_0x050e
        L_0x0468:
            java.lang.String r3 = "H156"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x050d
            r3 = 22
            goto L_0x050e
        L_0x0474:
            java.lang.String r3 = "H153"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x050d
            r3 = 21
            goto L_0x050e
        L_0x0480:
            java.lang.String r3 = "H150"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x050d
            r3 = 20
            goto L_0x050e
        L_0x048c:
            java.lang.String r3 = "H123"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x050d
            r3 = 19
            goto L_0x050e
        L_0x0498:
            java.lang.String r3 = "H120"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x050d
            r3 = 18
            goto L_0x050e
        L_0x04a4:
            java.lang.String r3 = "L93"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x050d
            r3 = 4
            goto L_0x050e
        L_0x04ae:
            java.lang.String r3 = "L90"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x050d
            r3 = 3
            goto L_0x050e
        L_0x04b8:
            java.lang.String r3 = "L63"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x050d
            r3 = 2
            goto L_0x050e
        L_0x04c2:
            java.lang.String r3 = "L60"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x050d
            r3 = 1
            goto L_0x050e
        L_0x04cc:
            java.lang.String r3 = "L30"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x050d
            r3 = 0
            goto L_0x050e
        L_0x04d6:
            java.lang.String r3 = "H93"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x050d
            r3 = 17
            goto L_0x050e
        L_0x04e1:
            java.lang.String r3 = "H90"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x050d
            r3 = 16
            goto L_0x050e
        L_0x04ec:
            java.lang.String r3 = "H63"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x050d
            r3 = 15
            goto L_0x050e
        L_0x04f7:
            java.lang.String r3 = "H60"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x050d
            r3 = 14
            goto L_0x050e
        L_0x0502:
            java.lang.String r3 = "H30"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x050d
            r3 = 13
            goto L_0x050e
        L_0x050d:
            r3 = -1
        L_0x050e:
            switch(r3) {
                case 0: goto L_0x05bb;
                case 1: goto L_0x05b6;
                case 2: goto L_0x05af;
                case 3: goto L_0x05a8;
                case 4: goto L_0x05a1;
                case 5: goto L_0x059a;
                case 6: goto L_0x0595;
                case 7: goto L_0x058e;
                case 8: goto L_0x0587;
                case 9: goto L_0x0580;
                case 10: goto L_0x0579;
                case 11: goto L_0x0572;
                case 12: goto L_0x056b;
                case 13: goto L_0x0566;
                case 14: goto L_0x0561;
                case 15: goto L_0x055c;
                case 16: goto L_0x0556;
                case 17: goto L_0x0550;
                case 18: goto L_0x054a;
                case 19: goto L_0x0544;
                case 20: goto L_0x053b;
                case 21: goto L_0x0533;
                case 22: goto L_0x052b;
                case 23: goto L_0x0523;
                case 24: goto L_0x051b;
                case 25: goto L_0x0513;
                default: goto L_0x0511;
            }
        L_0x0511:
            goto L_0x03dc
        L_0x0513:
            r2 = 33554432(0x2000000, float:9.403955E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x05bf
        L_0x051b:
            r2 = 8388608(0x800000, float:1.17549435E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x05bf
        L_0x0523:
            r2 = 2097152(0x200000, float:2.938736E-39)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x05bf
        L_0x052b:
            r2 = 524288(0x80000, float:7.34684E-40)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x05bf
        L_0x0533:
            r2 = 131072(0x20000, float:1.83671E-40)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x05bf
        L_0x053b:
            r2 = 32768(0x8000, float:4.5918E-41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x05bf
        L_0x0544:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            goto L_0x05bf
        L_0x054a:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            goto L_0x05bf
        L_0x0550:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            goto L_0x05bf
        L_0x0556:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            goto L_0x05bf
        L_0x055c:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            goto L_0x05bf
        L_0x0561:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x05bf
        L_0x0566:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            goto L_0x05bf
        L_0x056b:
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x05bf
        L_0x0572:
            r2 = 4194304(0x400000, float:5.877472E-39)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x05bf
        L_0x0579:
            r2 = 1048576(0x100000, float:1.469368E-39)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x05bf
        L_0x0580:
            r2 = 262144(0x40000, float:3.67342E-40)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x05bf
        L_0x0587:
            r2 = 65536(0x10000, float:9.18355E-41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x05bf
        L_0x058e:
            r2 = 16384(0x4000, float:2.2959E-41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x05bf
        L_0x0595:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            goto L_0x05bf
        L_0x059a:
            r3 = 1024(0x400, float:1.435E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            goto L_0x05bf
        L_0x05a1:
            r6 = 256(0x100, float:3.59E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            goto L_0x05bf
        L_0x05a8:
            r9 = 64
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            goto L_0x05bf
        L_0x05af:
            r2 = 16
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x05bf
        L_0x05b6:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            goto L_0x05bf
        L_0x05bb:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
        L_0x05bf:
            if (r2 != 0) goto L_0x05cc
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "Unknown HEVC level string: "
            r1.concat(r0)
            goto L_0x03a4
        L_0x05cc:
            android.util.Pair r1 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.<init>(r0, r2)
            r2 = r1
            goto L_0x05e2
        L_0x05d7:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Unknown HEVC profile string: "
            r1.concat(r0)
            goto L_0x03a4
        L_0x05e2:
            return r2
        L_0x05e3:
            r6 = 256(0x100, float:3.59E-43)
            r9 = 64
            java.lang.String r0 = r0.zzj
            int r3 = r1.length
            r2 = 3
            if (r3 >= r2) goto L_0x05f9
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed VP9 codec string: "
            r1.concat(r0)
        L_0x05f6:
            r2 = 0
            goto L_0x0692
        L_0x05f9:
            r2 = r1[r5]     // Catch:{ NumberFormatException -> 0x0687 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x0687 }
            r1 = r1[r14]     // Catch:{ NumberFormatException -> 0x0687 }
            int r0 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0687 }
            if (r2 == 0) goto L_0x0617
            if (r2 == r5) goto L_0x0615
            if (r2 == r14) goto L_0x0613
            r1 = 3
            if (r2 == r1) goto L_0x0610
            r1 = -1
            goto L_0x0618
        L_0x0610:
            r1 = 8
            goto L_0x0618
        L_0x0613:
            r1 = 4
            goto L_0x0618
        L_0x0615:
            r1 = 2
            goto L_0x0618
        L_0x0617:
            r1 = 1
        L_0x0618:
            r2 = -1
            if (r1 != r2) goto L_0x061c
        L_0x061b:
            goto L_0x05f6
        L_0x061c:
            r2 = 10
            if (r0 == r2) goto L_0x0674
            r2 = 11
            if (r0 == r2) goto L_0x0671
            if (r0 == r12) goto L_0x066e
            r2 = 21
            if (r0 == r2) goto L_0x066a
            r2 = 30
            if (r0 == r2) goto L_0x0666
            r2 = 31
            if (r0 == r2) goto L_0x0662
            r2 = 40
            if (r0 == r2) goto L_0x065e
            r2 = 41
            if (r0 == r2) goto L_0x065a
            r2 = 50
            if (r0 == r2) goto L_0x0656
            r2 = 51
            if (r0 == r2) goto L_0x0652
            switch(r0) {
                case 60: goto L_0x0650;
                case 61: goto L_0x064c;
                case 62: goto L_0x0648;
                default: goto L_0x0645;
            }
        L_0x0645:
            r0 = -1
            r7 = -1
            goto L_0x0676
        L_0x0648:
            r0 = -1
            r7 = 8192(0x2000, float:1.14794E-41)
            goto L_0x0676
        L_0x064c:
            r0 = -1
            r7 = 4096(0x1000, float:5.74E-42)
            goto L_0x0676
        L_0x0650:
            r0 = -1
            goto L_0x0676
        L_0x0652:
            r0 = -1
            r7 = 512(0x200, float:7.175E-43)
            goto L_0x0676
        L_0x0656:
            r0 = -1
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0676
        L_0x065a:
            r0 = -1
            r7 = 128(0x80, float:1.794E-43)
            goto L_0x0676
        L_0x065e:
            r0 = -1
            r7 = 64
            goto L_0x0676
        L_0x0662:
            r0 = -1
            r7 = 32
            goto L_0x0676
        L_0x0666:
            r0 = -1
            r7 = 16
            goto L_0x0676
        L_0x066a:
            r0 = -1
            r7 = 8
            goto L_0x0676
        L_0x066e:
            r0 = -1
            r7 = 4
            goto L_0x0676
        L_0x0671:
            r0 = -1
            r7 = 2
            goto L_0x0676
        L_0x0674:
            r0 = -1
            r7 = 1
        L_0x0676:
            if (r7 != r0) goto L_0x0679
            goto L_0x061b
        L_0x0679:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r2.<init>(r0, r1)
            goto L_0x0692
        L_0x0687:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed VP9 codec string: "
            r1.concat(r0)
            goto L_0x05f6
        L_0x0692:
            return r2
        L_0x0693:
            r3 = 1024(0x400, float:1.435E-42)
            r6 = 256(0x100, float:3.59E-43)
            r9 = 64
            java.lang.String r0 = r0.zzj
            int r2 = r1.length
            if (r2 >= r14) goto L_0x06aa
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed AVC codec string: "
            r1.concat(r0)
        L_0x06a7:
            r2 = 0
            goto L_0x077d
        L_0x06aa:
            r12 = r1[r5]     // Catch:{ NumberFormatException -> 0x0772 }
            int r12 = r12.length()     // Catch:{ NumberFormatException -> 0x0772 }
            r3 = 6
            if (r12 != r3) goto L_0x06cb
            r2 = r1[r5]     // Catch:{ NumberFormatException -> 0x0772 }
            r3 = 0
            java.lang.String r2 = r2.substring(r3, r14)     // Catch:{ NumberFormatException -> 0x0772 }
            r3 = 16
            int r2 = java.lang.Integer.parseInt(r2, r3)     // Catch:{ NumberFormatException -> 0x0772 }
            r1 = r1[r5]     // Catch:{ NumberFormatException -> 0x0772 }
            java.lang.String r1 = r1.substring(r4)     // Catch:{ NumberFormatException -> 0x0772 }
            int r0 = java.lang.Integer.parseInt(r1, r3)     // Catch:{ NumberFormatException -> 0x0772 }
            goto L_0x06dc
        L_0x06cb:
            r3 = 16
            r12 = 3
            if (r2 < r12) goto L_0x06a7
            r2 = r1[r5]     // Catch:{ NumberFormatException -> 0x0772 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x0772 }
            r1 = r1[r14]     // Catch:{ NumberFormatException -> 0x0772 }
            int r0 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0772 }
        L_0x06dc:
            r1 = 66
            if (r2 == r1) goto L_0x0710
            r1 = 77
            if (r2 == r1) goto L_0x070e
            r1 = 88
            if (r2 == r1) goto L_0x070b
            r1 = 100
            if (r2 == r1) goto L_0x0707
            r1 = 110(0x6e, float:1.54E-43)
            if (r2 == r1) goto L_0x0703
            r1 = 122(0x7a, float:1.71E-43)
            if (r2 == r1) goto L_0x06ff
            r1 = 244(0xf4, float:3.42E-43)
            if (r2 == r1) goto L_0x06fb
            r1 = -1
            r14 = -1
            goto L_0x0712
        L_0x06fb:
            r1 = -1
            r14 = 64
            goto L_0x0712
        L_0x06ff:
            r1 = -1
            r14 = 32
            goto L_0x0712
        L_0x0703:
            r1 = -1
            r14 = 16
            goto L_0x0712
        L_0x0707:
            r1 = -1
            r14 = 8
            goto L_0x0712
        L_0x070b:
            r1 = -1
            r14 = 4
            goto L_0x0712
        L_0x070e:
            r1 = -1
            goto L_0x0712
        L_0x0710:
            r1 = -1
            r14 = 1
        L_0x0712:
            if (r14 != r1) goto L_0x0715
        L_0x0714:
            goto L_0x06a7
        L_0x0715:
            switch(r0) {
                case 10: goto L_0x0760;
                case 11: goto L_0x075d;
                case 12: goto L_0x0759;
                case 13: goto L_0x0755;
                default: goto L_0x0718;
            }
        L_0x0718:
            switch(r0) {
                case 20: goto L_0x0751;
                case 21: goto L_0x074d;
                case 22: goto L_0x0749;
                default: goto L_0x071b;
            }
        L_0x071b:
            switch(r0) {
                case 30: goto L_0x0745;
                case 31: goto L_0x0741;
                case 32: goto L_0x073d;
                default: goto L_0x071e;
            }
        L_0x071e:
            switch(r0) {
                case 40: goto L_0x0739;
                case 41: goto L_0x0735;
                case 42: goto L_0x0731;
                default: goto L_0x0721;
            }
        L_0x0721:
            switch(r0) {
                case 50: goto L_0x072e;
                case 51: goto L_0x072a;
                case 52: goto L_0x0727;
                default: goto L_0x0724;
            }
        L_0x0724:
            r0 = -1
            r5 = -1
            goto L_0x0761
        L_0x0727:
            r5 = 65536(0x10000, float:9.18355E-41)
            goto L_0x0760
        L_0x072a:
            r5 = 32768(0x8000, float:4.5918E-41)
            goto L_0x0760
        L_0x072e:
            r5 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0760
        L_0x0731:
            r0 = -1
            r5 = 8192(0x2000, float:1.14794E-41)
            goto L_0x0761
        L_0x0735:
            r0 = -1
            r5 = 4096(0x1000, float:5.74E-42)
            goto L_0x0761
        L_0x0739:
            r0 = -1
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x0761
        L_0x073d:
            r0 = -1
            r5 = 1024(0x400, float:1.435E-42)
            goto L_0x0761
        L_0x0741:
            r0 = -1
            r5 = 512(0x200, float:7.175E-43)
            goto L_0x0761
        L_0x0745:
            r0 = -1
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0761
        L_0x0749:
            r0 = -1
            r5 = 128(0x80, float:1.794E-43)
            goto L_0x0761
        L_0x074d:
            r0 = -1
            r5 = 64
            goto L_0x0761
        L_0x0751:
            r0 = -1
            r5 = 32
            goto L_0x0761
        L_0x0755:
            r0 = -1
            r5 = 16
            goto L_0x0761
        L_0x0759:
            r0 = -1
            r5 = 8
            goto L_0x0761
        L_0x075d:
            r0 = -1
            r5 = 4
            goto L_0x0761
        L_0x0760:
            r0 = -1
        L_0x0761:
            if (r5 != r0) goto L_0x0764
            goto L_0x0714
        L_0x0764:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r2.<init>(r0, r1)
            goto L_0x077d
        L_0x0772:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed AVC codec string: "
            r1.concat(r0)
            goto L_0x06a7
        L_0x077d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqy.zzb(com.google.android.gms.internal.ads.zzad):android.util.Pair");
    }

    public static zzqg zzc(String str, boolean z, boolean z2) throws zzqs {
        List zzf = zzf(str, false, false);
        if (zzf.isEmpty()) {
            return null;
        }
        return (zzqg) zzf.get(0);
    }

    public static zzqg zzd() throws zzqs {
        return zzc("audio/raw", false, false);
    }

    public static String zze(zzad zzad) {
        Pair zzb2;
        if ("audio/eac3-joc".equals(zzad.zzm)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(zzad.zzm) || (zzb2 = zzb(zzad)) == null) {
            return null;
        }
        int intValue = ((Integer) zzb2.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static synchronized List zzf(String str, boolean z, boolean z2) throws zzqs {
        zzqt zzqt;
        String str2 = str;
        boolean z3 = z;
        boolean z4 = z2;
        synchronized (zzqy.class) {
            zzqq zzqq = new zzqq(str2, z3, z4);
            HashMap hashMap = zzc;
            List list = (List) hashMap.get(zzqq);
            if (list != null) {
                return list;
            }
            int i = zzeg.zza;
            if (i >= 21) {
                zzqt = new zzqw(z3, z4);
            } else {
                zzqt = new zzqv((zzqu) null);
            }
            ArrayList zzh = zzh(zzqq, zzqt);
            if (z3 && zzh.isEmpty() && i >= 21 && i <= 23) {
                zzh = zzh(zzqq, new zzqv((zzqu) null));
                if (!zzh.isEmpty()) {
                    String str3 = ((zzqg) zzh.get(0)).zza;
                }
            }
            if ("audio/raw".equals(str2)) {
                if (i < 26 && zzeg.zzb.equals("R9") && zzh.size() == 1 && ((zzqg) zzh.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    zzh.add(zzqg.zzc("OMX.google.raw.decoder", "audio/raw", "audio/raw", (MediaCodecInfo.CodecCapabilities) null, false, true, false, false, false));
                }
                zzi(zzh, zzqo.zza);
            }
            if (i < 21 && zzh.size() > 1) {
                String str4 = ((zzqg) zzh.get(0)).zza;
                if ("OMX.SEC.mp3.dec".equals(str4) || "OMX.SEC.MP3.Decoder".equals(str4) || "OMX.brcm.audio.mp3.decoder".equals(str4)) {
                    zzi(zzh, zzqp.zza);
                }
            }
            if (i < 32 && zzh.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzqg) zzh.get(0)).zza)) {
                zzh.add((zzqg) zzh.remove(0));
            }
            zzfrh zzm = zzfrh.zzm(zzh);
            hashMap.put(zzqq, zzm);
            return zzm;
        }
    }

    public static List zzg(List list, zzad zzad) {
        ArrayList arrayList = new ArrayList(list);
        zzi(arrayList, new zzqm(zzad));
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        if (r9.endsWith(".secure") == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00da, code lost:
        if ("SCV31".equals(r11) == false) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0118, code lost:
        if (r8.startsWith("t0") == false) goto L_0x011a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0294 A[Catch:{ Exception -> 0x029f }] */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0295 A[Catch:{ Exception -> 0x029f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.ArrayList zzh(com.google.android.gms.internal.ads.zzqq r25, com.google.android.gms.internal.ads.zzqt r26) throws com.google.android.gms.internal.ads.zzqs {
        /*
            r1 = r25
            r2 = r26
            java.lang.String r3 = "secure-playback"
            java.lang.String r4 = "tunneled-playback"
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x029f }
            r6.<init>()     // Catch:{ Exception -> 0x029f }
            java.lang.String r15 = r1.zza     // Catch:{ Exception -> 0x029f }
            int r14 = r26.zza()     // Catch:{ Exception -> 0x029f }
            boolean r16 = r26.zze()     // Catch:{ Exception -> 0x029f }
            r17 = 0
            r13 = 0
        L_0x001a:
            if (r13 >= r14) goto L_0x029e
            android.media.MediaCodecInfo r0 = r2.zzb(r13)     // Catch:{ Exception -> 0x029f }
            int r7 = com.google.android.gms.internal.ads.zzeg.zza     // Catch:{ Exception -> 0x029f }
            r8 = 29
            if (r7 < r8) goto L_0x0034
            boolean r9 = r0.isAlias()     // Catch:{ Exception -> 0x029f }
            if (r9 == 0) goto L_0x0034
        L_0x002c:
            r20 = r13
            r23 = r14
            r24 = r15
            goto L_0x0296
        L_0x0034:
            java.lang.String r9 = r0.getName()     // Catch:{ Exception -> 0x029f }
            boolean r10 = r0.isEncoder()     // Catch:{ Exception -> 0x029f }
            if (r10 != 0) goto L_0x002c
            java.lang.String r10 = ".secure"
            if (r16 != 0) goto L_0x0048
            boolean r11 = r9.endsWith(r10)     // Catch:{ Exception -> 0x029f }
            if (r11 != 0) goto L_0x002c
        L_0x0048:
            r11 = 21
            if (r7 >= r11) goto L_0x007c
            java.lang.String r11 = "CIPAACDecoder"
            boolean r11 = r11.equals(r9)     // Catch:{ Exception -> 0x029f }
            if (r11 != 0) goto L_0x002c
            java.lang.String r11 = "CIPMP3Decoder"
            boolean r11 = r11.equals(r9)     // Catch:{ Exception -> 0x029f }
            if (r11 != 0) goto L_0x002c
            java.lang.String r11 = "CIPVorbisDecoder"
            boolean r11 = r11.equals(r9)     // Catch:{ Exception -> 0x029f }
            if (r11 != 0) goto L_0x002c
            java.lang.String r11 = "CIPAMRNBDecoder"
            boolean r11 = r11.equals(r9)     // Catch:{ Exception -> 0x029f }
            if (r11 != 0) goto L_0x002c
            java.lang.String r11 = "AACDecoder"
            boolean r11 = r11.equals(r9)     // Catch:{ Exception -> 0x029f }
            if (r11 != 0) goto L_0x002c
            java.lang.String r11 = "MP3Decoder"
            boolean r11 = r11.equals(r9)     // Catch:{ Exception -> 0x029f }
            if (r11 != 0) goto L_0x002c
        L_0x007c:
            r11 = 24
            java.lang.String r12 = "samsung"
            if (r7 >= r11) goto L_0x00dc
            java.lang.String r11 = "OMX.SEC.aac.dec"
            boolean r11 = r11.equals(r9)     // Catch:{ Exception -> 0x029f }
            if (r11 != 0) goto L_0x0092
            java.lang.String r11 = "OMX.Exynos.AAC.Decoder"
            boolean r11 = r11.equals(r9)     // Catch:{ Exception -> 0x029f }
            if (r11 == 0) goto L_0x00dc
        L_0x0092:
            java.lang.String r11 = com.google.android.gms.internal.ads.zzeg.zzc     // Catch:{ Exception -> 0x029f }
            boolean r11 = r12.equals(r11)     // Catch:{ Exception -> 0x029f }
            if (r11 == 0) goto L_0x00dc
            java.lang.String r11 = com.google.android.gms.internal.ads.zzeg.zzb     // Catch:{ Exception -> 0x029f }
            java.lang.String r5 = "zeroflte"
            boolean r5 = r11.startsWith(r5)     // Catch:{ Exception -> 0x029f }
            if (r5 != 0) goto L_0x002c
            java.lang.String r5 = "zerolte"
            boolean r5 = r11.startsWith(r5)     // Catch:{ Exception -> 0x029f }
            if (r5 != 0) goto L_0x002c
            java.lang.String r5 = "zenlte"
            boolean r5 = r11.startsWith(r5)     // Catch:{ Exception -> 0x029f }
            if (r5 != 0) goto L_0x002c
            java.lang.String r5 = "SC-05G"
            boolean r5 = r5.equals(r11)     // Catch:{ Exception -> 0x029f }
            if (r5 != 0) goto L_0x002c
            java.lang.String r5 = "marinelteatt"
            boolean r5 = r5.equals(r11)     // Catch:{ Exception -> 0x029f }
            if (r5 != 0) goto L_0x002c
            java.lang.String r5 = "404SC"
            boolean r5 = r5.equals(r11)     // Catch:{ Exception -> 0x029f }
            if (r5 != 0) goto L_0x002c
            java.lang.String r5 = "SC-04G"
            boolean r5 = r5.equals(r11)     // Catch:{ Exception -> 0x029f }
            if (r5 != 0) goto L_0x002c
            java.lang.String r5 = "SCV31"
            boolean r5 = r5.equals(r11)     // Catch:{ Exception -> 0x029f }
            if (r5 != 0) goto L_0x002c
        L_0x00dc:
            java.lang.String r5 = "jflte"
            r11 = 19
            if (r7 > r11) goto L_0x011a
            java.lang.String r8 = "OMX.SEC.vp8.dec"
            boolean r8 = r8.equals(r9)     // Catch:{ Exception -> 0x029f }
            if (r8 == 0) goto L_0x011a
            java.lang.String r8 = com.google.android.gms.internal.ads.zzeg.zzc     // Catch:{ Exception -> 0x029f }
            boolean r8 = r12.equals(r8)     // Catch:{ Exception -> 0x029f }
            if (r8 == 0) goto L_0x011a
            java.lang.String r8 = com.google.android.gms.internal.ads.zzeg.zzb     // Catch:{ Exception -> 0x029f }
            java.lang.String r12 = "d2"
            boolean r12 = r8.startsWith(r12)     // Catch:{ Exception -> 0x029f }
            if (r12 != 0) goto L_0x002c
            java.lang.String r12 = "serrano"
            boolean r12 = r8.startsWith(r12)     // Catch:{ Exception -> 0x029f }
            if (r12 != 0) goto L_0x002c
            boolean r12 = r8.startsWith(r5)     // Catch:{ Exception -> 0x029f }
            if (r12 != 0) goto L_0x002c
            java.lang.String r12 = "santos"
            boolean r12 = r8.startsWith(r12)     // Catch:{ Exception -> 0x029f }
            if (r12 != 0) goto L_0x002c
            java.lang.String r12 = "t0"
            boolean r8 = r8.startsWith(r12)     // Catch:{ Exception -> 0x029f }
            if (r8 != 0) goto L_0x002c
        L_0x011a:
            if (r7 > r11) goto L_0x012c
            java.lang.String r8 = com.google.android.gms.internal.ads.zzeg.zzb     // Catch:{ Exception -> 0x029f }
            boolean r5 = r8.startsWith(r5)     // Catch:{ Exception -> 0x029f }
            if (r5 == 0) goto L_0x012c
            java.lang.String r5 = "OMX.qcom.video.decoder.vp8"
            boolean r5 = r5.equals(r9)     // Catch:{ Exception -> 0x029f }
            if (r5 != 0) goto L_0x002c
        L_0x012c:
            r5 = 23
            if (r7 > r5) goto L_0x0140
            java.lang.String r7 = "audio/eac3-joc"
            boolean r7 = r7.equals(r15)     // Catch:{ Exception -> 0x029f }
            if (r7 == 0) goto L_0x0140
            java.lang.String r7 = "OMX.MTK.AUDIO.DECODER.DSPAC3"
            boolean r7 = r7.equals(r9)     // Catch:{ Exception -> 0x029f }
            if (r7 != 0) goto L_0x002c
        L_0x0140:
            java.lang.String[] r7 = r0.getSupportedTypes()     // Catch:{ Exception -> 0x029f }
            int r8 = r7.length     // Catch:{ Exception -> 0x029f }
            r11 = 0
        L_0x0146:
            if (r11 >= r8) goto L_0x0154
            r12 = r7[r11]     // Catch:{ Exception -> 0x029f }
            boolean r19 = r12.equalsIgnoreCase(r15)     // Catch:{ Exception -> 0x029f }
            if (r19 == 0) goto L_0x0151
            goto L_0x01b5
        L_0x0151:
            int r11 = r11 + 1
            goto L_0x0146
        L_0x0154:
            java.lang.String r7 = "video/dolby-vision"
            boolean r7 = r15.equals(r7)     // Catch:{ Exception -> 0x029f }
            if (r7 == 0) goto L_0x017b
            java.lang.String r7 = "OMX.MS.HEVCDV.Decoder"
            boolean r7 = r7.equals(r9)     // Catch:{ Exception -> 0x029f }
            if (r7 == 0) goto L_0x0168
            java.lang.String r7 = "video/hevcdv"
        L_0x0166:
            r12 = r7
            goto L_0x01b5
        L_0x0168:
            java.lang.String r7 = "OMX.RTK.video.decoder"
            boolean r7 = r7.equals(r9)     // Catch:{ Exception -> 0x029f }
            if (r7 != 0) goto L_0x0178
            java.lang.String r7 = "OMX.realtek.video.decoder.tunneled"
            boolean r7 = r7.equals(r9)     // Catch:{ Exception -> 0x029f }
            if (r7 == 0) goto L_0x01b4
        L_0x0178:
            java.lang.String r7 = "video/dv_hevc"
            goto L_0x0166
        L_0x017b:
            java.lang.String r7 = "audio/alac"
            boolean r7 = r15.equals(r7)     // Catch:{ Exception -> 0x029f }
            if (r7 == 0) goto L_0x018e
            java.lang.String r7 = "OMX.lge.alac.decoder"
            boolean r7 = r7.equals(r9)     // Catch:{ Exception -> 0x029f }
            if (r7 == 0) goto L_0x018e
            java.lang.String r7 = "audio/x-lg-alac"
            goto L_0x0166
        L_0x018e:
            java.lang.String r7 = "audio/flac"
            boolean r7 = r15.equals(r7)     // Catch:{ Exception -> 0x029f }
            if (r7 == 0) goto L_0x01a1
            java.lang.String r7 = "OMX.lge.flac.decoder"
            boolean r7 = r7.equals(r9)     // Catch:{ Exception -> 0x029f }
            if (r7 == 0) goto L_0x01a1
            java.lang.String r7 = "audio/x-lg-flac"
            goto L_0x0166
        L_0x01a1:
            java.lang.String r7 = "audio/ac3"
            boolean r7 = r15.equals(r7)     // Catch:{ Exception -> 0x029f }
            if (r7 == 0) goto L_0x01b4
            java.lang.String r7 = "OMX.lge.ac3.decoder"
            boolean r7 = r7.equals(r9)     // Catch:{ Exception -> 0x029f }
            if (r7 == 0) goto L_0x01b4
            java.lang.String r7 = "audio/lg-ac3"
            goto L_0x0166
        L_0x01b4:
            r12 = 0
        L_0x01b5:
            if (r12 == 0) goto L_0x002c
            android.media.MediaCodecInfo$CodecCapabilities r11 = r0.getCapabilitiesForType(r12)     // Catch:{ Exception -> 0x0281 }
            boolean r7 = r2.zzd(r4, r12, r11)     // Catch:{ Exception -> 0x0281 }
            boolean r8 = r2.zzc(r4, r12, r11)     // Catch:{ Exception -> 0x0281 }
            boolean r5 = r1.zzc     // Catch:{ Exception -> 0x0281 }
            if (r5 != 0) goto L_0x01ca
            if (r8 != 0) goto L_0x002c
            goto L_0x01ce
        L_0x01ca:
            if (r7 != 0) goto L_0x01ce
            goto L_0x002c
        L_0x01ce:
            boolean r5 = r2.zzd(r3, r12, r11)     // Catch:{ Exception -> 0x0281 }
            boolean r7 = r2.zzc(r3, r12, r11)     // Catch:{ Exception -> 0x0281 }
            boolean r8 = r1.zzb     // Catch:{ Exception -> 0x0281 }
            r20 = 1
            if (r8 != 0) goto L_0x01df
            if (r7 != 0) goto L_0x002c
            goto L_0x01e2
        L_0x01df:
            if (r5 == 0) goto L_0x002c
            r5 = 1
        L_0x01e2:
            int r7 = com.google.android.gms.internal.ads.zzeg.zza     // Catch:{ Exception -> 0x0281 }
            r8 = 29
            if (r7 < r8) goto L_0x01ef
            boolean r8 = r0.isHardwareAccelerated()     // Catch:{ Exception -> 0x0281 }
            r21 = r8
            goto L_0x01fa
        L_0x01ef:
            boolean r8 = zzj(r0, r15)     // Catch:{ Exception -> 0x0281 }
            if (r8 != 0) goto L_0x01f8
            r21 = 1
            goto L_0x01fa
        L_0x01f8:
            r21 = 0
        L_0x01fa:
            boolean r22 = zzj(r0, r15)     // Catch:{ Exception -> 0x0281 }
            r8 = 29
            if (r7 < r8) goto L_0x0207
            boolean r0 = r0.isVendor()     // Catch:{ Exception -> 0x0281 }
            goto L_0x022a
        L_0x0207:
            java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x0281 }
            java.lang.String r0 = com.google.android.gms.internal.ads.zzfoa.zza(r0)     // Catch:{ Exception -> 0x0281 }
            java.lang.String r7 = "omx.google."
            boolean r7 = r0.startsWith(r7)     // Catch:{ Exception -> 0x0281 }
            if (r7 != 0) goto L_0x0229
            java.lang.String r7 = "c2.android."
            boolean r7 = r0.startsWith(r7)     // Catch:{ Exception -> 0x0281 }
            if (r7 != 0) goto L_0x0229
            java.lang.String r7 = "c2.google."
            boolean r0 = r0.startsWith(r7)     // Catch:{ Exception -> 0x0281 }
            if (r0 != 0) goto L_0x0229
            r0 = 1
            goto L_0x022a
        L_0x0229:
            r0 = 0
        L_0x022a:
            if (r16 == 0) goto L_0x0230
            boolean r7 = r1.zzb     // Catch:{ Exception -> 0x0281 }
            if (r7 == r5) goto L_0x0236
        L_0x0230:
            if (r16 != 0) goto L_0x0255
            boolean r7 = r1.zzb     // Catch:{ Exception -> 0x0281 }
            if (r7 != 0) goto L_0x0255
        L_0x0236:
            r5 = 0
            r18 = 0
            r7 = r9
            r8 = r15
            r9 = r12
            r10 = r11
            r11 = r21
            r12 = r22
            r20 = r13
            r13 = r0
            r23 = r14
            r14 = r5
            r24 = r15
            r15 = r18
            com.google.android.gms.internal.ads.zzqg r0 = com.google.android.gms.internal.ads.zzqg.zzc(r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x0253 }
            r6.add(r0)     // Catch:{ Exception -> 0x0253 }
            goto L_0x0296
        L_0x0253:
            r0 = move-exception
            goto L_0x0288
        L_0x0255:
            r20 = r13
            r23 = r14
            r24 = r15
            if (r16 != 0) goto L_0x0296
            if (r5 == 0) goto L_0x0296
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0253 }
            r5.<init>()     // Catch:{ Exception -> 0x0253 }
            r5.append(r9)     // Catch:{ Exception -> 0x0253 }
            r5.append(r10)     // Catch:{ Exception -> 0x0253 }
            java.lang.String r7 = r5.toString()     // Catch:{ Exception -> 0x0253 }
            r14 = 0
            r15 = 1
            r8 = r24
            r9 = r12
            r10 = r11
            r11 = r21
            r12 = r22
            r13 = r0
            com.google.android.gms.internal.ads.zzqg r0 = com.google.android.gms.internal.ads.zzqg.zzc(r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x0253 }
            r6.add(r0)     // Catch:{ Exception -> 0x0253 }
            return r6
        L_0x0281:
            r0 = move-exception
            r20 = r13
            r23 = r14
            r24 = r15
        L_0x0288:
            int r5 = com.google.android.gms.internal.ads.zzeg.zza     // Catch:{ Exception -> 0x029f }
            r7 = 23
            if (r5 > r7) goto L_0x0295
            boolean r5 = r6.isEmpty()     // Catch:{ Exception -> 0x029f }
            if (r5 != 0) goto L_0x0295
            goto L_0x0296
        L_0x0295:
            throw r0     // Catch:{ Exception -> 0x029f }
        L_0x0296:
            int r13 = r20 + 1
            r14 = r23
            r15 = r24
            goto L_0x001a
        L_0x029e:
            return r6
        L_0x029f:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzqs r1 = new com.google.android.gms.internal.ads.zzqs
            r2 = 0
            r1.<init>(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqy.zzh(com.google.android.gms.internal.ads.zzqq, com.google.android.gms.internal.ads.zzqt):java.util.ArrayList");
    }

    private static void zzi(List list, zzqx zzqx) {
        Collections.sort(list, new zzqn(zzqx));
    }

    private static boolean zzj(MediaCodecInfo mediaCodecInfo, String str) {
        if (zzeg.zza >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (zzbo.zzg(str)) {
            return true;
        }
        String zza2 = zzfoa.zza(mediaCodecInfo.getName());
        if (zza2.startsWith("arc.")) {
            return false;
        }
        if (zza2.startsWith("omx.google.") || zza2.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((zza2.startsWith("omx.sec.") && zza2.contains(".sw.")) || zza2.equals("omx.qcom.video.decoder.hevcswvdec") || zza2.startsWith("c2.android.") || zza2.startsWith("c2.google.")) {
            return true;
        }
        if (zza2.startsWith("omx.") || zza2.startsWith("c2.")) {
            return false;
        }
        return true;
    }
}
