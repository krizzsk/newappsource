package com.google.android.exoplayer2.mediacodec;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.internal.referrer.Payload;
import com.google.android.play.core.appupdate.C14226d;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import p009a8.C0112l;
import p115i0.C5227c;
import p277ub.C6774a0;
import p314xa.C7191i;
import p988j$.util.Spliterator;

@SuppressLint({"InlinedApi"})
public final class MediaCodecUtil {

    /* renamed from: a */
    public static final Pattern f13830a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b */
    public static final HashMap<C3930a, List<C3941c>> f13831b = new HashMap<>();

    /* renamed from: c */
    public static int f13832c = -1;

    public static class DecoderQueryException extends Exception {
        public DecoderQueryException(Exception exc) {
            super("Failed to query underlying media codecs", exc);
        }
    }

    /* renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$a */
    public static final class C3930a {

        /* renamed from: a */
        public final String f13833a;

        /* renamed from: b */
        public final boolean f13834b;

        /* renamed from: c */
        public final boolean f13835c;

        public C3930a(String str, boolean z, boolean z2) {
            this.f13833a = str;
            this.f13834b = z;
            this.f13835c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != C3930a.class) {
                return false;
            }
            C3930a aVar = (C3930a) obj;
            if (TextUtils.equals(this.f13833a, aVar.f13833a) && this.f13834b == aVar.f13834b && this.f13835c == aVar.f13835c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i;
            int d = C13715c.m34238d(this.f13833a, 31, 31);
            int i2 = 1231;
            if (this.f13834b) {
                i = 1231;
            } else {
                i = 1237;
            }
            int i3 = (d + i) * 31;
            if (!this.f13835c) {
                i2 = 1237;
            }
            return i3 + i2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$b */
    public interface C3931b {
        /* renamed from: a */
        MediaCodecInfo mo16055a(int i);

        /* renamed from: b */
        boolean mo16056b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* renamed from: c */
        boolean mo16057c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* renamed from: d */
        int mo16058d();

        /* renamed from: e */
        boolean mo16059e();
    }

    /* renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$c */
    public static final class C3932c implements C3931b {
        /* renamed from: a */
        public final MediaCodecInfo mo16055a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        /* renamed from: b */
        public final boolean mo16056b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            if (!"secure-playback".equals(str) || !"video/avc".equals(str2)) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        public final boolean mo16057c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        /* renamed from: d */
        public final int mo16058d() {
            return MediaCodecList.getCodecCount();
        }

        /* renamed from: e */
        public final boolean mo16059e() {
            return false;
        }
    }

    /* renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$d */
    public static final class C3933d implements C3931b {

        /* renamed from: a */
        public final int f13836a;

        /* renamed from: b */
        public MediaCodecInfo[] f13837b;

        public C3933d(boolean z, boolean z2) {
            int i;
            if (z || z2) {
                i = 1;
            } else {
                i = 0;
            }
            this.f13836a = i;
        }

        /* renamed from: a */
        public final MediaCodecInfo mo16055a(int i) {
            if (this.f13837b == null) {
                this.f13837b = new MediaCodecList(this.f13836a).getCodecInfos();
            }
            return this.f13837b[i];
        }

        /* renamed from: b */
        public final boolean mo16056b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        /* renamed from: c */
        public final boolean mo16057c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        /* renamed from: d */
        public final int mo16058d() {
            if (this.f13837b == null) {
                this.f13837b = new MediaCodecList(this.f13836a).getCodecInfos();
            }
            return this.f13837b.length;
        }

        /* renamed from: e */
        public final boolean mo16059e() {
            return true;
        }
    }

    /* renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$e */
    public interface C3934e<T> {
        /* renamed from: h */
        int mo256h(T t);
    }

    /* renamed from: a */
    public static void m10531a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (C6774a0.f20959a < 26 && C6774a0.f20960b.equals("R9") && arrayList.size() == 1 && ((C3941c) arrayList.get(0)).f13853a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(C3941c.m10588g("OMX.google.raw.decoder", "audio/raw", "audio/raw", (MediaCodecInfo.CodecCapabilities) null, false, true, false, false));
            }
            Collections.sort(arrayList, new C7191i(new C5227c(8), 0));
        }
        int i = C6774a0.f20959a;
        if (i < 21 && arrayList.size() > 1) {
            String str2 = ((C3941c) arrayList.get(0)).f13853a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new C7191i(new C0112l(7), 0));
            }
        }
        if (i < 30 && arrayList.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((C3941c) arrayList.get(0)).f13853a)) {
            arrayList.add((C3941c) arrayList.remove(0));
        }
    }

    /* renamed from: b */
    public static String m10532b(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        } else if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        } else {
            if (!str2.equals("audio/flac") || !"OMX.lge.flac.decoder".equals(str)) {
                return null;
            }
            return "audio/x-lg-flac";
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x0841, code lost:
        r1 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:0x084b, code lost:
        if (r4 != r1) goto L_0x084f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:554:?, code lost:
        return new android.util.Pair<>(java.lang.Integer.valueOf(r0), java.lang.Integer.valueOf(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x011a, code lost:
        r14 = r18;
     */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x03d3 A[Catch:{ NumberFormatException -> 0x03e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:539:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> m10533c(com.google.android.exoplayer2.Format r19) {
        /*
            r0 = r19
            java.lang.String r1 = r0.f13415j
            r2 = 0
            if (r1 != 0) goto L_0x0008
            return r2
        L_0x0008:
            java.lang.String r3 = "\\."
            java.lang.String[] r1 = r1.split(r3)
            java.lang.String r3 = r0.f13418m
            java.lang.String r4 = "video/dolby-vision"
            boolean r3 = r4.equals(r3)
            r10 = 512(0x200, float:7.175E-43)
            r11 = 256(0x100, float:3.59E-43)
            r12 = 128(0x80, float:1.794E-43)
            r13 = 64
            r6 = 3
            r4 = 1
            if (r3 == 0) goto L_0x023c
            java.lang.String r0 = r0.f13415j
            int r3 = r1.length
            java.lang.String r7 = "Ignoring malformed Dolby Vision codec string: "
            if (r3 >= r6) goto L_0x003a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x0037
            r7.concat(r0)
        L_0x0037:
            r2 = 0
            goto L_0x023b
        L_0x003a:
            java.util.regex.Pattern r3 = f13830a
            r6 = r1[r4]
            java.util.regex.Matcher r3 = r3.matcher(r6)
            boolean r6 = r3.matches()
            if (r6 != 0) goto L_0x0056
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x0037
            r7.concat(r0)
            goto L_0x0037
        L_0x0056:
            java.lang.String r0 = r3.group(r4)
            java.lang.String r3 = "09"
            java.lang.String r6 = "08"
            java.lang.String r7 = "07"
            java.lang.String r9 = "06"
            java.lang.String r4 = "05"
            java.lang.String r8 = "04"
            java.lang.String r2 = "03"
            java.lang.String r5 = "02"
            java.lang.String r15 = "01"
            if (r0 != 0) goto L_0x0070
            goto L_0x011d
        L_0x0070:
            int r17 = r0.hashCode()
            switch(r17) {
                case 1536: goto L_0x00d0;
                case 1537: goto L_0x00c7;
                case 1538: goto L_0x00be;
                case 1539: goto L_0x00b5;
                case 1540: goto L_0x00ac;
                case 1541: goto L_0x00a3;
                case 1542: goto L_0x009a;
                case 1543: goto L_0x0091;
                case 1544: goto L_0x0087;
                case 1545: goto L_0x0079;
                default: goto L_0x0077;
            }
        L_0x0077:
            goto L_0x00db
        L_0x0079:
            boolean r17 = r0.equals(r3)
            if (r17 != 0) goto L_0x0081
            goto L_0x00db
        L_0x0081:
            r17 = 9
            r14 = 9
            goto L_0x00dc
        L_0x0087:
            boolean r17 = r0.equals(r6)
            if (r17 != 0) goto L_0x008e
            goto L_0x00db
        L_0x008e:
            r14 = 8
            goto L_0x00dc
        L_0x0091:
            boolean r17 = r0.equals(r7)
            if (r17 != 0) goto L_0x0098
            goto L_0x00db
        L_0x0098:
            r14 = 7
            goto L_0x00dc
        L_0x009a:
            boolean r17 = r0.equals(r9)
            if (r17 != 0) goto L_0x00a1
            goto L_0x00db
        L_0x00a1:
            r14 = 6
            goto L_0x00dc
        L_0x00a3:
            boolean r17 = r0.equals(r4)
            if (r17 != 0) goto L_0x00aa
            goto L_0x00db
        L_0x00aa:
            r14 = 5
            goto L_0x00dc
        L_0x00ac:
            boolean r17 = r0.equals(r8)
            if (r17 != 0) goto L_0x00b3
            goto L_0x00db
        L_0x00b3:
            r14 = 4
            goto L_0x00dc
        L_0x00b5:
            boolean r17 = r0.equals(r2)
            if (r17 != 0) goto L_0x00bc
            goto L_0x00db
        L_0x00bc:
            r14 = 3
            goto L_0x00dc
        L_0x00be:
            boolean r17 = r0.equals(r5)
            if (r17 != 0) goto L_0x00c5
            goto L_0x00db
        L_0x00c5:
            r14 = 2
            goto L_0x00dc
        L_0x00c7:
            boolean r17 = r0.equals(r15)
            if (r17 != 0) goto L_0x00ce
            goto L_0x00db
        L_0x00ce:
            r14 = 1
            goto L_0x00dc
        L_0x00d0:
            java.lang.String r14 = "00"
            boolean r14 = r0.equals(r14)
            if (r14 != 0) goto L_0x00d9
            goto L_0x00db
        L_0x00d9:
            r14 = 0
            goto L_0x00dc
        L_0x00db:
            r14 = -1
        L_0x00dc:
            switch(r14) {
                case 0: goto L_0x0115;
                case 1: goto L_0x010f;
                case 2: goto L_0x0109;
                case 3: goto L_0x0102;
                case 4: goto L_0x00fb;
                case 5: goto L_0x00f4;
                case 6: goto L_0x00ef;
                case 7: goto L_0x00ea;
                case 8: goto L_0x00e5;
                case 9: goto L_0x00e0;
                default: goto L_0x00df;
            }
        L_0x00df:
            goto L_0x011d
        L_0x00e0:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)
            goto L_0x011e
        L_0x00e5:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r11)
            goto L_0x011e
        L_0x00ea:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)
            goto L_0x011e
        L_0x00ef:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            goto L_0x011e
        L_0x00f4:
            r14 = 32
            java.lang.Integer r18 = java.lang.Integer.valueOf(r14)
            goto L_0x011a
        L_0x00fb:
            r14 = 16
            java.lang.Integer r18 = java.lang.Integer.valueOf(r14)
            goto L_0x011a
        L_0x0102:
            r14 = 8
            java.lang.Integer r18 = java.lang.Integer.valueOf(r14)
            goto L_0x011a
        L_0x0109:
            r14 = 4
            java.lang.Integer r18 = java.lang.Integer.valueOf(r14)
            goto L_0x011a
        L_0x010f:
            r14 = 2
            java.lang.Integer r18 = java.lang.Integer.valueOf(r14)
            goto L_0x011a
        L_0x0115:
            r14 = 1
            java.lang.Integer r18 = java.lang.Integer.valueOf(r14)
        L_0x011a:
            r14 = r18
            goto L_0x011e
        L_0x011d:
            r14 = 0
        L_0x011e:
            if (r14 != 0) goto L_0x0131
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x0037
            java.lang.String r1 = "Unknown Dolby Vision profile string: "
            r1.concat(r0)
            goto L_0x0037
        L_0x0131:
            r0 = 2
            r1 = r1[r0]
            if (r1 != 0) goto L_0x0138
            goto L_0x0222
        L_0x0138:
            int r0 = r1.hashCode()
            switch(r0) {
                case 1537: goto L_0x01c5;
                case 1538: goto L_0x01bc;
                case 1539: goto L_0x01b3;
                case 1540: goto L_0x01aa;
                case 1541: goto L_0x01a1;
                case 1542: goto L_0x0198;
                case 1543: goto L_0x018f;
                case 1544: goto L_0x0186;
                case 1545: goto L_0x017c;
                default: goto L_0x013f;
            }
        L_0x013f:
            switch(r0) {
                case 1567: goto L_0x016e;
                case 1568: goto L_0x0160;
                case 1569: goto L_0x0152;
                case 1570: goto L_0x0144;
                default: goto L_0x0142;
            }
        L_0x0142:
            goto L_0x01cb
        L_0x0144:
            java.lang.String r0 = "13"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x014e
            goto L_0x01cb
        L_0x014e:
            r5 = 12
            goto L_0x01ce
        L_0x0152:
            java.lang.String r0 = "12"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x015c
            goto L_0x01cb
        L_0x015c:
            r5 = 11
            goto L_0x01ce
        L_0x0160:
            java.lang.String r0 = "11"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x016a
            goto L_0x01cb
        L_0x016a:
            r5 = 10
            goto L_0x01ce
        L_0x016e:
            java.lang.String r0 = "10"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0178
            goto L_0x01cb
        L_0x0178:
            r5 = 9
            goto L_0x01ce
        L_0x017c:
            boolean r0 = r1.equals(r3)
            if (r0 != 0) goto L_0x0183
            goto L_0x01cb
        L_0x0183:
            r5 = 8
            goto L_0x01ce
        L_0x0186:
            boolean r0 = r1.equals(r6)
            if (r0 != 0) goto L_0x018d
            goto L_0x01cb
        L_0x018d:
            r5 = 7
            goto L_0x01ce
        L_0x018f:
            boolean r0 = r1.equals(r7)
            if (r0 != 0) goto L_0x0196
            goto L_0x01cb
        L_0x0196:
            r5 = 6
            goto L_0x01ce
        L_0x0198:
            boolean r0 = r1.equals(r9)
            if (r0 != 0) goto L_0x019f
            goto L_0x01cb
        L_0x019f:
            r5 = 5
            goto L_0x01ce
        L_0x01a1:
            boolean r0 = r1.equals(r4)
            if (r0 != 0) goto L_0x01a8
            goto L_0x01cb
        L_0x01a8:
            r5 = 4
            goto L_0x01ce
        L_0x01aa:
            boolean r0 = r1.equals(r8)
            if (r0 != 0) goto L_0x01b1
            goto L_0x01cb
        L_0x01b1:
            r5 = 3
            goto L_0x01ce
        L_0x01b3:
            boolean r0 = r1.equals(r2)
            if (r0 != 0) goto L_0x01ba
            goto L_0x01cb
        L_0x01ba:
            r5 = 2
            goto L_0x01ce
        L_0x01bc:
            boolean r0 = r1.equals(r5)
            if (r0 != 0) goto L_0x01c3
            goto L_0x01cb
        L_0x01c3:
            r5 = 1
            goto L_0x01ce
        L_0x01c5:
            boolean r0 = r1.equals(r15)
            if (r0 != 0) goto L_0x01cd
        L_0x01cb:
            r5 = -1
            goto L_0x01ce
        L_0x01cd:
            r5 = 0
        L_0x01ce:
            switch(r5) {
                case 0: goto L_0x021c;
                case 1: goto L_0x0216;
                case 2: goto L_0x0210;
                case 3: goto L_0x0209;
                case 4: goto L_0x0202;
                case 5: goto L_0x01fb;
                case 6: goto L_0x01f6;
                case 7: goto L_0x01f1;
                case 8: goto L_0x01ec;
                case 9: goto L_0x01e7;
                case 10: goto L_0x01e0;
                case 11: goto L_0x01d9;
                case 12: goto L_0x01d2;
                default: goto L_0x01d1;
            }
        L_0x01d1:
            goto L_0x0222
        L_0x01d2:
            r0 = 4096(0x1000, float:5.74E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0223
        L_0x01d9:
            r0 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0223
        L_0x01e0:
            r0 = 1024(0x400, float:1.435E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0223
        L_0x01e7:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            goto L_0x0223
        L_0x01ec:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            goto L_0x0223
        L_0x01f1:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            goto L_0x0223
        L_0x01f6:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            goto L_0x0223
        L_0x01fb:
            r0 = 32
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0223
        L_0x0202:
            r0 = 16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0223
        L_0x0209:
            r0 = 8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0223
        L_0x0210:
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0223
        L_0x0216:
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0223
        L_0x021c:
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0223
        L_0x0222:
            r0 = 0
        L_0x0223:
            if (r0 != 0) goto L_0x0236
            java.lang.String r0 = java.lang.String.valueOf(r1)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x0037
            java.lang.String r1 = "Unknown Dolby Vision level string: "
            r1.concat(r0)
            goto L_0x0037
        L_0x0236:
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r14, r0)
        L_0x023b:
            return r2
        L_0x023c:
            r2 = 0
            r3 = r1[r2]
            r3.getClass()
            int r2 = r3.hashCode()
            switch(r2) {
                case 3004662: goto L_0x028e;
                case 3006243: goto L_0x0283;
                case 3006244: goto L_0x0278;
                case 3199032: goto L_0x026d;
                case 3214780: goto L_0x0262;
                case 3356560: goto L_0x0257;
                case 3624515: goto L_0x024b;
                default: goto L_0x0249;
            }
        L_0x0249:
            r2 = -1
            goto L_0x0298
        L_0x024b:
            java.lang.String r2 = "vp09"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0255
            goto L_0x0249
        L_0x0255:
            r2 = 6
            goto L_0x0298
        L_0x0257:
            java.lang.String r2 = "mp4a"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0260
            goto L_0x0249
        L_0x0260:
            r2 = 5
            goto L_0x0298
        L_0x0262:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x026b
            goto L_0x0249
        L_0x026b:
            r2 = 4
            goto L_0x0298
        L_0x026d:
            java.lang.String r2 = "hev1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0276
            goto L_0x0249
        L_0x0276:
            r2 = 3
            goto L_0x0298
        L_0x0278:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0281
            goto L_0x0249
        L_0x0281:
            r2 = 2
            goto L_0x0298
        L_0x0283:
            java.lang.String r2 = "avc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x028c
            goto L_0x0249
        L_0x028c:
            r2 = 1
            goto L_0x0298
        L_0x028e:
            java.lang.String r2 = "av01"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0297
            goto L_0x0249
        L_0x0297:
            r2 = 0
        L_0x0298:
            r3 = 8192(0x2000, float:1.14794E-41)
            switch(r2) {
                case 0: goto L_0x0793;
                case 1: goto L_0x068c;
                case 2: goto L_0x068c;
                case 3: goto L_0x03f2;
                case 4: goto L_0x03f2;
                case 5: goto L_0x035b;
                case 6: goto L_0x029f;
                default: goto L_0x029d;
            }
        L_0x029d:
            r2 = 0
            return r2
        L_0x029f:
            r2 = 0
            java.lang.String r0 = r0.f13415j
            int r4 = r1.length
            java.lang.String r5 = "Ignoring malformed VP9 codec string: "
            r6 = 3
            if (r4 >= r6) goto L_0x02b7
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x035a
            r5.concat(r0)
            goto L_0x035a
        L_0x02b7:
            r4 = 1
            r6 = r1[r4]     // Catch:{ NumberFormatException -> 0x034c }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x034c }
            r7 = 2
            r1 = r1[r7]     // Catch:{ NumberFormatException -> 0x034c }
            int r0 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x034c }
            if (r6 == 0) goto L_0x02d7
            if (r6 == r4) goto L_0x02d5
            if (r6 == r7) goto L_0x02d3
            r1 = 3
            if (r6 == r1) goto L_0x02d0
            r1 = -1
            goto L_0x02d8
        L_0x02d0:
            r1 = 8
            goto L_0x02d8
        L_0x02d3:
            r1 = 4
            goto L_0x02d8
        L_0x02d5:
            r1 = 2
            goto L_0x02d8
        L_0x02d7:
            r1 = 1
        L_0x02d8:
            r4 = -1
            if (r1 != r4) goto L_0x02dd
            goto L_0x035a
        L_0x02dd:
            r4 = 10
            if (r0 == r4) goto L_0x0339
            r4 = 11
            if (r0 == r4) goto L_0x0336
            r4 = 20
            if (r0 == r4) goto L_0x0333
            r4 = 21
            if (r0 == r4) goto L_0x032f
            r4 = 30
            if (r0 == r4) goto L_0x032b
            r4 = 31
            if (r0 == r4) goto L_0x0327
            r4 = 40
            if (r0 == r4) goto L_0x0323
            r4 = 41
            if (r0 == r4) goto L_0x031f
            r4 = 50
            if (r0 == r4) goto L_0x031b
            r4 = 51
            if (r0 == r4) goto L_0x0317
            switch(r0) {
                case 60: goto L_0x0313;
                case 61: goto L_0x030f;
                case 62: goto L_0x030b;
                default: goto L_0x0308;
            }
        L_0x0308:
            r0 = -1
            r7 = -1
            goto L_0x033b
        L_0x030b:
            r0 = -1
            r7 = 8192(0x2000, float:1.14794E-41)
            goto L_0x033b
        L_0x030f:
            r0 = -1
            r7 = 4096(0x1000, float:5.74E-42)
            goto L_0x033b
        L_0x0313:
            r0 = -1
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x033b
        L_0x0317:
            r0 = -1
            r7 = 512(0x200, float:7.175E-43)
            goto L_0x033b
        L_0x031b:
            r0 = -1
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x033b
        L_0x031f:
            r0 = -1
            r7 = 128(0x80, float:1.794E-43)
            goto L_0x033b
        L_0x0323:
            r0 = -1
            r7 = 64
            goto L_0x033b
        L_0x0327:
            r0 = -1
            r7 = 32
            goto L_0x033b
        L_0x032b:
            r0 = -1
            r7 = 16
            goto L_0x033b
        L_0x032f:
            r0 = -1
            r7 = 8
            goto L_0x033b
        L_0x0333:
            r0 = -1
            r7 = 4
            goto L_0x033b
        L_0x0336:
            r0 = -1
            r7 = 2
            goto L_0x033b
        L_0x0339:
            r0 = -1
            r7 = 1
        L_0x033b:
            if (r7 != r0) goto L_0x033e
            goto L_0x035a
        L_0x033e:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r2.<init>(r0, r1)
            goto L_0x035a
        L_0x034c:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x035a
            r5.concat(r0)
        L_0x035a:
            return r2
        L_0x035b:
            r2 = 0
            java.lang.String r0 = r0.f13415j
            int r3 = r1.length
            java.lang.String r4 = "Ignoring malformed MP4A codec string: "
            r5 = 3
            if (r3 == r5) goto L_0x0373
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x03f1
            r4.concat(r0)
            goto L_0x03f1
        L_0x0373:
            r3 = 1
            r5 = r1[r3]     // Catch:{ NumberFormatException -> 0x03e3 }
            r3 = 16
            int r3 = java.lang.Integer.parseInt(r5, r3)     // Catch:{ NumberFormatException -> 0x03e3 }
            java.lang.String r3 = p277ub.C6792n.m15991d(r3)     // Catch:{ NumberFormatException -> 0x03e3 }
            java.lang.String r5 = "audio/mp4a-latm"
            boolean r3 = r5.equals(r3)     // Catch:{ NumberFormatException -> 0x03e3 }
            if (r3 == 0) goto L_0x03f1
            r3 = 2
            r1 = r1[r3]     // Catch:{ NumberFormatException -> 0x03e3 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x03e3 }
            r3 = 17
            if (r1 == r3) goto L_0x03ce
            r3 = 20
            if (r1 == r3) goto L_0x03cb
            r3 = 23
            if (r1 == r3) goto L_0x03c8
            r3 = 29
            if (r1 == r3) goto L_0x03c5
            r3 = 39
            if (r1 == r3) goto L_0x03c2
            r3 = 42
            if (r1 == r3) goto L_0x03bf
            switch(r1) {
                case 1: goto L_0x03bc;
                case 2: goto L_0x03b9;
                case 3: goto L_0x03b6;
                case 4: goto L_0x03b3;
                case 5: goto L_0x03b0;
                case 6: goto L_0x03ad;
                default: goto L_0x03aa;
            }     // Catch:{ NumberFormatException -> 0x03e3 }
        L_0x03aa:
            r1 = -1
            r8 = -1
            goto L_0x03d1
        L_0x03ad:
            r1 = -1
            r8 = 6
            goto L_0x03d1
        L_0x03b0:
            r1 = -1
            r8 = 5
            goto L_0x03d1
        L_0x03b3:
            r1 = -1
            r8 = 4
            goto L_0x03d1
        L_0x03b6:
            r1 = -1
            r8 = 3
            goto L_0x03d1
        L_0x03b9:
            r1 = -1
            r8 = 2
            goto L_0x03d1
        L_0x03bc:
            r1 = -1
            r8 = 1
            goto L_0x03d1
        L_0x03bf:
            r8 = 42
            goto L_0x03d0
        L_0x03c2:
            r8 = 39
            goto L_0x03d0
        L_0x03c5:
            r8 = 29
            goto L_0x03d0
        L_0x03c8:
            r8 = 23
            goto L_0x03d0
        L_0x03cb:
            r8 = 20
            goto L_0x03d0
        L_0x03ce:
            r8 = 17
        L_0x03d0:
            r1 = -1
        L_0x03d1:
            if (r8 == r1) goto L_0x03f1
            android.util.Pair r1 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x03e3 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)     // Catch:{ NumberFormatException -> 0x03e3 }
            r5 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ NumberFormatException -> 0x03e3 }
            r1.<init>(r3, r5)     // Catch:{ NumberFormatException -> 0x03e3 }
            r2 = r1
            goto L_0x03f1
        L_0x03e3:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x03f1
            r4.concat(r0)
        L_0x03f1:
            return r2
        L_0x03f2:
            r2 = 0
            java.lang.String r0 = r0.f13415j
            int r4 = r1.length
            java.lang.String r5 = "Ignoring malformed HEVC codec string: "
            r6 = 4
            if (r4 >= r6) goto L_0x040a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x068b
            r5.concat(r0)
            goto L_0x068b
        L_0x040a:
            java.util.regex.Pattern r4 = f13830a
            r6 = 1
            r7 = r1[r6]
            java.util.regex.Matcher r4 = r4.matcher(r7)
            boolean r7 = r4.matches()
            if (r7 != 0) goto L_0x0428
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x068b
            r5.concat(r0)
            goto L_0x068b
        L_0x0428:
            java.lang.String r0 = r4.group(r6)
            java.lang.String r4 = "1"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0437
            r0 = 1
        L_0x0435:
            r4 = 3
            goto L_0x0441
        L_0x0437:
            java.lang.String r4 = "2"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x067c
            r0 = 2
            goto L_0x0435
        L_0x0441:
            r1 = r1[r4]
            if (r1 != 0) goto L_0x0447
            goto L_0x065f
        L_0x0447:
            int r4 = r1.hashCode()
            switch(r4) {
                case 70821: goto L_0x0599;
                case 70914: goto L_0x058e;
                case 70917: goto L_0x0583;
                case 71007: goto L_0x0578;
                case 71010: goto L_0x056d;
                case 74665: goto L_0x0562;
                case 74758: goto L_0x0557;
                case 74761: goto L_0x054c;
                case 74851: goto L_0x053e;
                case 74854: goto L_0x0530;
                case 2193639: goto L_0x0522;
                case 2193642: goto L_0x0514;
                case 2193732: goto L_0x0506;
                case 2193735: goto L_0x04f8;
                case 2193738: goto L_0x04ea;
                case 2193825: goto L_0x04dc;
                case 2193828: goto L_0x04ce;
                case 2193831: goto L_0x04c0;
                case 2312803: goto L_0x04b2;
                case 2312806: goto L_0x04a4;
                case 2312896: goto L_0x0496;
                case 2312899: goto L_0x0488;
                case 2312902: goto L_0x047a;
                case 2312989: goto L_0x046c;
                case 2312992: goto L_0x045e;
                case 2312995: goto L_0x0450;
                default: goto L_0x044e;
            }
        L_0x044e:
            goto L_0x05a4
        L_0x0450:
            java.lang.String r4 = "L186"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x045a
            goto L_0x05a4
        L_0x045a:
            r5 = 25
            goto L_0x05a5
        L_0x045e:
            java.lang.String r4 = "L183"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0468
            goto L_0x05a4
        L_0x0468:
            r5 = 24
            goto L_0x05a5
        L_0x046c:
            java.lang.String r4 = "L180"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0476
            goto L_0x05a4
        L_0x0476:
            r5 = 23
            goto L_0x05a5
        L_0x047a:
            java.lang.String r4 = "L156"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0484
            goto L_0x05a4
        L_0x0484:
            r5 = 22
            goto L_0x05a5
        L_0x0488:
            java.lang.String r4 = "L153"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0492
            goto L_0x05a4
        L_0x0492:
            r5 = 21
            goto L_0x05a5
        L_0x0496:
            java.lang.String r4 = "L150"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x04a0
            goto L_0x05a4
        L_0x04a0:
            r5 = 20
            goto L_0x05a5
        L_0x04a4:
            java.lang.String r4 = "L123"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x04ae
            goto L_0x05a4
        L_0x04ae:
            r5 = 19
            goto L_0x05a5
        L_0x04b2:
            java.lang.String r4 = "L120"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x04bc
            goto L_0x05a4
        L_0x04bc:
            r5 = 18
            goto L_0x05a5
        L_0x04c0:
            java.lang.String r4 = "H186"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x04ca
            goto L_0x05a4
        L_0x04ca:
            r5 = 17
            goto L_0x05a5
        L_0x04ce:
            java.lang.String r4 = "H183"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x04d8
            goto L_0x05a4
        L_0x04d8:
            r5 = 16
            goto L_0x05a5
        L_0x04dc:
            java.lang.String r4 = "H180"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x04e6
            goto L_0x05a4
        L_0x04e6:
            r5 = 15
            goto L_0x05a5
        L_0x04ea:
            java.lang.String r4 = "H156"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x04f4
            goto L_0x05a4
        L_0x04f4:
            r5 = 14
            goto L_0x05a5
        L_0x04f8:
            java.lang.String r4 = "H153"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0502
            goto L_0x05a4
        L_0x0502:
            r5 = 13
            goto L_0x05a5
        L_0x0506:
            java.lang.String r4 = "H150"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0510
            goto L_0x05a4
        L_0x0510:
            r5 = 12
            goto L_0x05a5
        L_0x0514:
            java.lang.String r4 = "H123"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x051e
            goto L_0x05a4
        L_0x051e:
            r5 = 11
            goto L_0x05a5
        L_0x0522:
            java.lang.String r4 = "H120"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x052c
            goto L_0x05a4
        L_0x052c:
            r5 = 10
            goto L_0x05a5
        L_0x0530:
            java.lang.String r4 = "L93"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x053a
            goto L_0x05a4
        L_0x053a:
            r5 = 9
            goto L_0x05a5
        L_0x053e:
            java.lang.String r4 = "L90"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0548
            goto L_0x05a4
        L_0x0548:
            r5 = 8
            goto L_0x05a5
        L_0x054c:
            java.lang.String r4 = "L63"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0555
            goto L_0x05a4
        L_0x0555:
            r5 = 7
            goto L_0x05a5
        L_0x0557:
            java.lang.String r4 = "L60"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0560
            goto L_0x05a4
        L_0x0560:
            r5 = 6
            goto L_0x05a5
        L_0x0562:
            java.lang.String r4 = "L30"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x056b
            goto L_0x05a4
        L_0x056b:
            r5 = 5
            goto L_0x05a5
        L_0x056d:
            java.lang.String r4 = "H93"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0576
            goto L_0x05a4
        L_0x0576:
            r5 = 4
            goto L_0x05a5
        L_0x0578:
            java.lang.String r4 = "H90"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0581
            goto L_0x05a4
        L_0x0581:
            r5 = 3
            goto L_0x05a5
        L_0x0583:
            java.lang.String r4 = "H63"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x058c
            goto L_0x05a4
        L_0x058c:
            r5 = 2
            goto L_0x05a5
        L_0x058e:
            java.lang.String r4 = "H60"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0597
            goto L_0x05a4
        L_0x0597:
            r5 = 1
            goto L_0x05a5
        L_0x0599:
            java.lang.String r4 = "H30"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x05a2
            goto L_0x05a4
        L_0x05a2:
            r5 = 0
            goto L_0x05a5
        L_0x05a4:
            r5 = -1
        L_0x05a5:
            switch(r5) {
                case 0: goto L_0x0659;
                case 1: goto L_0x0652;
                case 2: goto L_0x064b;
                case 3: goto L_0x0646;
                case 4: goto L_0x0641;
                case 5: goto L_0x063b;
                case 6: goto L_0x0635;
                case 7: goto L_0x062e;
                case 8: goto L_0x0629;
                case 9: goto L_0x0624;
                case 10: goto L_0x061d;
                case 11: goto L_0x0618;
                case 12: goto L_0x0610;
                case 13: goto L_0x0609;
                case 14: goto L_0x0602;
                case 15: goto L_0x05fa;
                case 16: goto L_0x05f2;
                case 17: goto L_0x05ea;
                case 18: goto L_0x05e2;
                case 19: goto L_0x05da;
                case 20: goto L_0x05d2;
                case 21: goto L_0x05ca;
                case 22: goto L_0x05c2;
                case 23: goto L_0x05ba;
                case 24: goto L_0x05b2;
                case 25: goto L_0x05aa;
                default: goto L_0x05a8;
            }
        L_0x05a8:
            goto L_0x065f
        L_0x05aa:
            r3 = 16777216(0x1000000, float:2.3509887E-38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0660
        L_0x05b2:
            r3 = 4194304(0x400000, float:5.877472E-39)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0660
        L_0x05ba:
            r3 = 1048576(0x100000, float:1.469368E-39)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0660
        L_0x05c2:
            r3 = 262144(0x40000, float:3.67342E-40)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0660
        L_0x05ca:
            r3 = 65536(0x10000, float:9.18355E-41)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0660
        L_0x05d2:
            r3 = 16384(0x4000, float:2.2959E-41)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0660
        L_0x05da:
            r14 = 4096(0x1000, float:5.74E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r14)
            goto L_0x0660
        L_0x05e2:
            r4 = 1024(0x400, float:1.435E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            goto L_0x0660
        L_0x05ea:
            r3 = 33554432(0x2000000, float:9.403955E-38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0660
        L_0x05f2:
            r3 = 8388608(0x800000, float:1.17549435E-38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0660
        L_0x05fa:
            r3 = 2097152(0x200000, float:2.938736E-39)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0660
        L_0x0602:
            r3 = 524288(0x80000, float:7.34684E-40)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0660
        L_0x0609:
            r3 = 131072(0x20000, float:1.83671E-40)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0660
        L_0x0610:
            r3 = 32768(0x8000, float:4.5918E-41)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0660
        L_0x0618:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0660
        L_0x061d:
            r5 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            goto L_0x0660
        L_0x0624:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            goto L_0x0660
        L_0x0629:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            goto L_0x0660
        L_0x062e:
            r3 = 16
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0660
        L_0x0635:
            r3 = 4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0660
        L_0x063b:
            r3 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0660
        L_0x0641:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            goto L_0x0660
        L_0x0646:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            goto L_0x0660
        L_0x064b:
            r6 = 32
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            goto L_0x0660
        L_0x0652:
            r3 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0660
        L_0x0659:
            r3 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0660
        L_0x065f:
            r3 = r2
        L_0x0660:
            if (r3 != 0) goto L_0x0672
            java.lang.String r0 = java.lang.String.valueOf(r1)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x068b
            java.lang.String r1 = "Unknown HEVC level string: "
            r1.concat(r0)
            goto L_0x068b
        L_0x0672:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.<init>(r0, r3)
            goto L_0x068b
        L_0x067c:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x068b
            java.lang.String r1 = "Unknown HEVC profile string: "
            r1.concat(r0)
        L_0x068b:
            return r2
        L_0x068c:
            r2 = 0
            r4 = 1024(0x400, float:1.435E-42)
            r5 = 2048(0x800, float:2.87E-42)
            r6 = 32
            r14 = 4096(0x1000, float:5.74E-42)
            java.lang.String r0 = r0.f13415j
            int r7 = r1.length
            java.lang.String r8 = "Ignoring malformed AVC codec string: "
            r9 = 2
            if (r7 >= r9) goto L_0x06ac
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x0792
            r8.concat(r0)
            goto L_0x0792
        L_0x06ac:
            r7 = 1
            r9 = r1[r7]     // Catch:{ NumberFormatException -> 0x0783 }
            int r9 = r9.length()     // Catch:{ NumberFormatException -> 0x0783 }
            r15 = 6
            if (r9 != r15) goto L_0x06d0
            r9 = r1[r7]     // Catch:{ NumberFormatException -> 0x0783 }
            r2 = 2
            r15 = 0
            java.lang.String r9 = r9.substring(r15, r2)     // Catch:{ NumberFormatException -> 0x0783 }
            r2 = 16
            int r9 = java.lang.Integer.parseInt(r9, r2)     // Catch:{ NumberFormatException -> 0x0783 }
            r1 = r1[r7]     // Catch:{ NumberFormatException -> 0x0783 }
            r7 = 4
            java.lang.String r1 = r1.substring(r7)     // Catch:{ NumberFormatException -> 0x0783 }
            int r0 = java.lang.Integer.parseInt(r1, r2)     // Catch:{ NumberFormatException -> 0x0783 }
            goto L_0x06e4
        L_0x06d0:
            r2 = 16
            int r7 = r1.length     // Catch:{ NumberFormatException -> 0x0783 }
            r9 = 3
            if (r7 < r9) goto L_0x0775
            r7 = 1
            r9 = r1[r7]     // Catch:{ NumberFormatException -> 0x0783 }
            int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ NumberFormatException -> 0x0783 }
            r7 = 2
            r1 = r1[r7]     // Catch:{ NumberFormatException -> 0x0783 }
            int r0 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0783 }
        L_0x06e4:
            r1 = 66
            if (r9 == r1) goto L_0x0712
            r1 = 77
            if (r9 == r1) goto L_0x0710
            r1 = 88
            if (r9 == r1) goto L_0x070e
            r1 = 100
            if (r9 == r1) goto L_0x070b
            r1 = 110(0x6e, float:1.54E-43)
            if (r9 == r1) goto L_0x0708
            r1 = 122(0x7a, float:1.71E-43)
            if (r9 == r1) goto L_0x0705
            r1 = 244(0xf4, float:3.42E-43)
            if (r9 == r1) goto L_0x0702
            r1 = -1
            goto L_0x0713
        L_0x0702:
            r1 = 64
            goto L_0x0713
        L_0x0705:
            r1 = 32
            goto L_0x0713
        L_0x0708:
            r1 = 16
            goto L_0x0713
        L_0x070b:
            r1 = 8
            goto L_0x0713
        L_0x070e:
            r1 = 4
            goto L_0x0713
        L_0x0710:
            r1 = 2
            goto L_0x0713
        L_0x0712:
            r1 = 1
        L_0x0713:
            r7 = -1
            if (r1 != r7) goto L_0x0718
            goto L_0x0791
        L_0x0718:
            switch(r0) {
                case 10: goto L_0x0735;
                case 11: goto L_0x0732;
                case 12: goto L_0x072e;
                case 13: goto L_0x072a;
                default: goto L_0x071b;
            }
        L_0x071b:
            switch(r0) {
                case 20: goto L_0x0740;
                case 21: goto L_0x073c;
                case 22: goto L_0x0738;
                default: goto L_0x071e;
            }
        L_0x071e:
            switch(r0) {
                case 30: goto L_0x074a;
                case 31: goto L_0x0746;
                case 32: goto L_0x0744;
                default: goto L_0x0721;
            }
        L_0x0721:
            switch(r0) {
                case 40: goto L_0x0756;
                case 41: goto L_0x0752;
                case 42: goto L_0x074e;
                default: goto L_0x0724;
            }
        L_0x0724:
            switch(r0) {
                case 50: goto L_0x0761;
                case 51: goto L_0x075d;
                case 52: goto L_0x075a;
                default: goto L_0x0727;
            }
        L_0x0727:
            r0 = -1
            r4 = -1
            goto L_0x0764
        L_0x072a:
            r0 = -1
            r4 = 16
            goto L_0x0764
        L_0x072e:
            r0 = -1
            r4 = 8
            goto L_0x0764
        L_0x0732:
            r0 = -1
            r4 = 4
            goto L_0x0764
        L_0x0735:
            r0 = -1
            r4 = 1
            goto L_0x0764
        L_0x0738:
            r0 = -1
            r4 = 128(0x80, float:1.794E-43)
            goto L_0x0764
        L_0x073c:
            r0 = -1
            r4 = 64
            goto L_0x0764
        L_0x0740:
            r0 = -1
            r4 = 32
            goto L_0x0764
        L_0x0744:
            r0 = -1
            goto L_0x0764
        L_0x0746:
            r0 = -1
            r4 = 512(0x200, float:7.175E-43)
            goto L_0x0764
        L_0x074a:
            r0 = -1
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0764
        L_0x074e:
            r0 = -1
            r4 = 8192(0x2000, float:1.14794E-41)
            goto L_0x0764
        L_0x0752:
            r0 = -1
            r4 = 4096(0x1000, float:5.74E-42)
            goto L_0x0764
        L_0x0756:
            r0 = -1
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x0764
        L_0x075a:
            r4 = 65536(0x10000, float:9.18355E-41)
            goto L_0x0744
        L_0x075d:
            r4 = 32768(0x8000, float:4.5918E-41)
            goto L_0x0744
        L_0x0761:
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0744
        L_0x0764:
            if (r4 != r0) goto L_0x0767
            goto L_0x0791
        L_0x0767:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r2.<init>(r0, r1)
            goto L_0x0792
        L_0x0775:
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0783 }
            int r2 = r1.length()     // Catch:{ NumberFormatException -> 0x0783 }
            if (r2 == 0) goto L_0x0791
            r8.concat(r1)     // Catch:{ NumberFormatException -> 0x0783 }
            goto L_0x0791
        L_0x0783:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x0791
            r8.concat(r0)
        L_0x0791:
            r2 = 0
        L_0x0792:
            return r2
        L_0x0793:
            r2 = 16
            r4 = 1024(0x400, float:1.435E-42)
            r5 = 2048(0x800, float:2.87E-42)
            r6 = 32
            r14 = 4096(0x1000, float:5.74E-42)
            java.lang.String r7 = r0.f13415j
            com.google.android.exoplayer2.video.ColorInfo r0 = r0.f13430y
            int r8 = r1.length
            java.lang.String r9 = "Ignoring malformed AV1 codec string: "
            r15 = 4
            if (r8 >= r15) goto L_0x07b7
            java.lang.String r0 = java.lang.String.valueOf(r7)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x07b4
            r9.concat(r0)
        L_0x07b4:
            r2 = 0
            goto L_0x086d
        L_0x07b7:
            r8 = 1
            r16 = r1[r8]     // Catch:{ NumberFormatException -> 0x085d }
            int r16 = java.lang.Integer.parseInt(r16)     // Catch:{ NumberFormatException -> 0x085d }
            r2 = 2
            r3 = r1[r2]     // Catch:{ NumberFormatException -> 0x085d }
            r4 = 0
            java.lang.String r3 = r3.substring(r4, r2)     // Catch:{ NumberFormatException -> 0x085d }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x085d }
            r4 = 3
            r1 = r1[r4]     // Catch:{ NumberFormatException -> 0x085d }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x085d }
            if (r16 == 0) goto L_0x07d4
            goto L_0x07b4
        L_0x07d4:
            r4 = 8
            if (r1 == r4) goto L_0x07dd
            r7 = 10
            if (r1 == r7) goto L_0x07dd
            goto L_0x07b4
        L_0x07dd:
            if (r1 != r4) goto L_0x07e1
            r0 = 1
            goto L_0x07f3
        L_0x07e1:
            if (r0 == 0) goto L_0x07f2
            byte[] r1 = r0.f14618e
            if (r1 != 0) goto L_0x07ef
            int r0 = r0.f14617d
            r1 = 7
            if (r0 == r1) goto L_0x07ef
            r1 = 6
            if (r0 != r1) goto L_0x07f2
        L_0x07ef:
            r0 = 4096(0x1000, float:5.74E-42)
            goto L_0x07f3
        L_0x07f2:
            r0 = 2
        L_0x07f3:
            switch(r3) {
                case 0: goto L_0x0849;
                case 1: goto L_0x0846;
                case 2: goto L_0x0843;
                case 3: goto L_0x0841;
                case 4: goto L_0x083d;
                case 5: goto L_0x0839;
                case 6: goto L_0x0835;
                case 7: goto L_0x0831;
                case 8: goto L_0x082d;
                case 9: goto L_0x0829;
                case 10: goto L_0x0825;
                case 11: goto L_0x0821;
                case 12: goto L_0x081d;
                case 13: goto L_0x0819;
                case 14: goto L_0x0816;
                case 15: goto L_0x0812;
                case 16: goto L_0x080f;
                case 17: goto L_0x080c;
                case 18: goto L_0x0809;
                case 19: goto L_0x0806;
                case 20: goto L_0x0803;
                case 21: goto L_0x0800;
                case 22: goto L_0x07fd;
                case 23: goto L_0x07fa;
                default: goto L_0x07f6;
            }
        L_0x07f6:
            r1 = -1
            r4 = -1
            goto L_0x084b
        L_0x07fa:
            r4 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0841
        L_0x07fd:
            r4 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x0841
        L_0x0800:
            r4 = 2097152(0x200000, float:2.938736E-39)
            goto L_0x0841
        L_0x0803:
            r4 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0841
        L_0x0806:
            r4 = 524288(0x80000, float:7.34684E-40)
            goto L_0x0841
        L_0x0809:
            r4 = 262144(0x40000, float:3.67342E-40)
            goto L_0x0841
        L_0x080c:
            r4 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0841
        L_0x080f:
            r4 = 65536(0x10000, float:9.18355E-41)
            goto L_0x0841
        L_0x0812:
            r4 = 32768(0x8000, float:4.5918E-41)
            goto L_0x0841
        L_0x0816:
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0841
        L_0x0819:
            r1 = -1
            r4 = 8192(0x2000, float:1.14794E-41)
            goto L_0x084b
        L_0x081d:
            r1 = -1
            r4 = 4096(0x1000, float:5.74E-42)
            goto L_0x084b
        L_0x0821:
            r1 = -1
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x084b
        L_0x0825:
            r1 = -1
            r4 = 1024(0x400, float:1.435E-42)
            goto L_0x084b
        L_0x0829:
            r1 = -1
            r4 = 512(0x200, float:7.175E-43)
            goto L_0x084b
        L_0x082d:
            r1 = -1
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x084b
        L_0x0831:
            r1 = -1
            r4 = 128(0x80, float:1.794E-43)
            goto L_0x084b
        L_0x0835:
            r1 = -1
            r4 = 64
            goto L_0x084b
        L_0x0839:
            r1 = -1
            r4 = 32
            goto L_0x084b
        L_0x083d:
            r1 = -1
            r4 = 16
            goto L_0x084b
        L_0x0841:
            r1 = -1
            goto L_0x084b
        L_0x0843:
            r1 = -1
            r4 = 4
            goto L_0x084b
        L_0x0846:
            r1 = -1
            r4 = 2
            goto L_0x084b
        L_0x0849:
            r1 = -1
            r4 = 1
        L_0x084b:
            if (r4 != r1) goto L_0x084f
            goto L_0x07b4
        L_0x084f:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r2.<init>(r0, r1)
            goto L_0x086d
        L_0x085d:
            java.lang.String r0 = java.lang.String.valueOf(r7)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x07b4
            r9.concat(r0)
            goto L_0x07b4
        L_0x086d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.m10533c(com.google.android.exoplayer2.Format):android.util.Pair");
    }

    /* renamed from: d */
    public static synchronized List<C3941c> m10534d(String str, boolean z, boolean z2) throws DecoderQueryException {
        C3931b bVar;
        synchronized (MediaCodecUtil.class) {
            C3930a aVar = new C3930a(str, z, z2);
            HashMap<C3930a, List<C3941c>> hashMap = f13831b;
            List<C3941c> list = hashMap.get(aVar);
            if (list != null) {
                return list;
            }
            int i = C6774a0.f20959a;
            if (i >= 21) {
                bVar = new C3933d(z, z2);
            } else {
                bVar = new C3932c();
            }
            ArrayList<C3941c> e = m10535e(aVar, bVar);
            if (z && e.isEmpty() && 21 <= i && i <= 23) {
                e = m10535e(aVar, new C3932c());
                if (!e.isEmpty()) {
                    new StringBuilder(str.length() + 63 + String.valueOf(e.get(0).f13853a).length());
                }
            }
            m10531a(str, e);
            List<C3941c> unmodifiableList = Collections.unmodifiableList(e);
            hashMap.put(aVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x0123 A[Catch:{ Exception -> 0x014e }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0138 A[Catch:{ Exception -> 0x014e }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList<com.google.android.exoplayer2.mediacodec.C3941c> m10535e(com.google.android.exoplayer2.mediacodec.MediaCodecUtil.C3930a r24, com.google.android.exoplayer2.mediacodec.MediaCodecUtil.C3931b r25) throws com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException {
        /*
            r1 = r24
            r2 = r25
            java.lang.String r3 = "secure-playback"
            java.lang.String r4 = "tunneled-playback"
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x014e }
            r5.<init>()     // Catch:{ Exception -> 0x014e }
            java.lang.String r14 = r1.f13833a     // Catch:{ Exception -> 0x014e }
            int r15 = r25.mo16058d()     // Catch:{ Exception -> 0x014e }
            boolean r13 = r25.mo16059e()     // Catch:{ Exception -> 0x014e }
            r16 = 0
            r12 = 0
        L_0x001b:
            if (r12 >= r15) goto L_0x014d
            android.media.MediaCodecInfo r0 = r2.mo16055a(r12)     // Catch:{ Exception -> 0x014e }
            int r6 = p277ub.C6774a0.f20959a     // Catch:{ Exception -> 0x014e }
            r7 = 29
            if (r6 < r7) goto L_0x002f
            boolean r9 = r0.isAlias()     // Catch:{ Exception -> 0x014e }
            if (r9 == 0) goto L_0x002f
            r9 = 1
            goto L_0x0030
        L_0x002f:
            r9 = 0
        L_0x0030:
            if (r9 == 0) goto L_0x0033
            goto L_0x006e
        L_0x0033:
            java.lang.String r11 = r0.getName()     // Catch:{ Exception -> 0x014e }
            boolean r9 = m10536f(r0, r11, r13, r14)     // Catch:{ Exception -> 0x014e }
            if (r9 != 0) goto L_0x003e
            goto L_0x006e
        L_0x003e:
            java.lang.String r10 = m10532b(r0, r11, r14)     // Catch:{ Exception -> 0x014e }
            if (r10 != 0) goto L_0x0045
            goto L_0x006e
        L_0x0045:
            android.media.MediaCodecInfo$CodecCapabilities r9 = r0.getCapabilitiesForType(r10)     // Catch:{ Exception -> 0x010e }
            boolean r17 = r2.mo16056b(r4, r10, r9)     // Catch:{ Exception -> 0x010e }
            boolean r18 = r2.mo16057c(r4, r9)     // Catch:{ Exception -> 0x010e }
            boolean r8 = r1.f13835c     // Catch:{ Exception -> 0x010e }
            if (r8 != 0) goto L_0x0057
            if (r18 != 0) goto L_0x006e
        L_0x0057:
            if (r8 == 0) goto L_0x005c
            if (r17 != 0) goto L_0x005c
            goto L_0x006e
        L_0x005c:
            boolean r8 = r2.mo16056b(r3, r10, r9)     // Catch:{ Exception -> 0x010e }
            boolean r17 = r2.mo16057c(r3, r9)     // Catch:{ Exception -> 0x010e }
            boolean r7 = r1.f13834b     // Catch:{ Exception -> 0x010e }
            if (r7 != 0) goto L_0x006a
            if (r17 != 0) goto L_0x006e
        L_0x006a:
            if (r7 == 0) goto L_0x0074
            if (r8 != 0) goto L_0x0074
        L_0x006e:
            r22 = r12
            r23 = r13
            goto L_0x0132
        L_0x0074:
            r7 = 29
            if (r6 < r7) goto L_0x0081
            boolean r7 = r0.isHardwareAccelerated()     // Catch:{ Exception -> 0x010e }
            r19 = r7
            r17 = 1
            goto L_0x008b
        L_0x0081:
            boolean r7 = m10537g(r0)     // Catch:{ Exception -> 0x010e }
            r17 = 1
            r7 = r7 ^ 1
            r19 = r7
        L_0x008b:
            boolean r20 = m10537g(r0)     // Catch:{ Exception -> 0x010e }
            r7 = 29
            if (r6 < r7) goto L_0x0098
            boolean r0 = r0.isVendor()     // Catch:{ Exception -> 0x010e }
            goto L_0x00bd
        L_0x0098:
            java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x010e }
            java.lang.String r0 = com.google.android.play.core.appupdate.C14226d.m35341H0(r0)     // Catch:{ Exception -> 0x010e }
            java.lang.String r6 = "omx.google."
            boolean r6 = r0.startsWith(r6)     // Catch:{ Exception -> 0x010e }
            if (r6 != 0) goto L_0x00b9
            java.lang.String r6 = "c2.android."
            boolean r6 = r0.startsWith(r6)     // Catch:{ Exception -> 0x010e }
            if (r6 != 0) goto L_0x00b9
            java.lang.String r6 = "c2.google."
            boolean r0 = r0.startsWith(r6)     // Catch:{ Exception -> 0x010e }
            if (r0 != 0) goto L_0x00b9
            goto L_0x00bb
        L_0x00b9:
            r17 = 0
        L_0x00bb:
            r0 = r17
        L_0x00bd:
            if (r13 == 0) goto L_0x00c3
            boolean r6 = r1.f13834b     // Catch:{ Exception -> 0x010e }
            if (r6 == r8) goto L_0x00c9
        L_0x00c3:
            if (r13 != 0) goto L_0x00e5
            boolean r6 = r1.f13834b     // Catch:{ Exception -> 0x010e }
            if (r6 != 0) goto L_0x00e5
        L_0x00c9:
            r17 = 0
            r6 = r11
            r7 = r14
            r8 = r10
            r18 = r10
            r10 = r19
            r21 = r11
            r11 = r20
            r22 = r12
            r12 = r0
            r23 = r13
            r13 = r17
            com.google.android.exoplayer2.mediacodec.c r0 = com.google.android.exoplayer2.mediacodec.C3941c.m10588g(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x010c }
            r5.add(r0)     // Catch:{ Exception -> 0x010c }
            goto L_0x0132
        L_0x00e5:
            r18 = r10
            r21 = r11
            r22 = r12
            r23 = r13
            if (r23 != 0) goto L_0x0132
            if (r8 == 0) goto L_0x0132
            java.lang.String r6 = java.lang.String.valueOf(r21)     // Catch:{ Exception -> 0x010c }
            java.lang.String r7 = ".secure"
            java.lang.String r6 = r6.concat(r7)     // Catch:{ Exception -> 0x010c }
            r13 = 1
            r7 = r14
            r8 = r18
            r10 = r19
            r11 = r20
            r12 = r0
            com.google.android.exoplayer2.mediacodec.c r0 = com.google.android.exoplayer2.mediacodec.C3941c.m10588g(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x010c }
            r5.add(r0)     // Catch:{ Exception -> 0x010c }
            return r5
        L_0x010c:
            r0 = move-exception
            goto L_0x0117
        L_0x010e:
            r0 = move-exception
            r18 = r10
            r21 = r11
            r22 = r12
            r23 = r13
        L_0x0117:
            int r6 = p277ub.C6774a0.f20959a     // Catch:{ Exception -> 0x014e }
            r7 = 23
            if (r6 > r7) goto L_0x0138
            boolean r6 = r5.isEmpty()     // Catch:{ Exception -> 0x014e }
            if (r6 != 0) goto L_0x0138
            java.lang.String r0 = java.lang.String.valueOf(r21)     // Catch:{ Exception -> 0x014e }
            int r0 = r0.length()     // Catch:{ Exception -> 0x014e }
            int r0 = r0 + 46
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014e }
            r6.<init>(r0)     // Catch:{ Exception -> 0x014e }
        L_0x0132:
            int r12 = r22 + 1
            r13 = r23
            goto L_0x001b
        L_0x0138:
            java.lang.String r1 = java.lang.String.valueOf(r21)     // Catch:{ Exception -> 0x014e }
            int r1 = r1.length()     // Catch:{ Exception -> 0x014e }
            int r1 = r1 + 25
            int r2 = r18.length()     // Catch:{ Exception -> 0x014e }
            int r1 = r1 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014e }
            r2.<init>(r1)     // Catch:{ Exception -> 0x014e }
            throw r0     // Catch:{ Exception -> 0x014e }
        L_0x014d:
            return r5
        L_0x014e:
            r0 = move-exception
            com.google.android.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException r1 = new com.google.android.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.m10535e(com.google.android.exoplayer2.mediacodec.MediaCodecUtil$a, com.google.android.exoplayer2.mediacodec.MediaCodecUtil$b):java.util.ArrayList");
    }

    /* renamed from: f */
    public static boolean m10536f(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = C6774a0.f20959a;
        if (i < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = C6774a0.f20960b;
            if ("a70".equals(str3) || ("Xiaomi".equals(C6774a0.f20961c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = C6774a0.f20960b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = C6774a0.f20960b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && Payload.SOURCE_SAMSUNG.equals(C6774a0.f20961c))) {
            String str6 = C6774a0.f20960b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i <= 19 && "OMX.SEC.vp8.dec".equals(str) && Payload.SOURCE_SAMSUNG.equals(C6774a0.f20961c)) {
            String str7 = C6774a0.f20960b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i <= 19 && C6774a0.f20960b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        if (!"audio/eac3-joc".equals(str2) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m10537g(MediaCodecInfo mediaCodecInfo) {
        if (C6774a0.f20959a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        String H0 = C14226d.m35341H0(mediaCodecInfo.getName());
        if (H0.startsWith("arc.")) {
            return false;
        }
        if (H0.startsWith("omx.google.") || H0.startsWith("omx.ffmpeg.") || ((H0.startsWith("omx.sec.") && H0.contains(".sw.")) || H0.equals("omx.qcom.video.decoder.hevcswvdec") || H0.startsWith("c2.android.") || H0.startsWith("c2.google.") || (!H0.startsWith("omx.") && !H0.startsWith("c2.")))) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static int m10538h() throws DecoderQueryException {
        C3941c cVar;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i;
        int i2;
        if (f13832c == -1) {
            int i3 = 0;
            List<C3941c> d = m10534d("video/avc", false, false);
            if (d.isEmpty()) {
                cVar = null;
            } else {
                cVar = d.get(0);
            }
            if (cVar != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = cVar.f13856d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int i4 = 0;
                while (i3 < length) {
                    int i5 = codecProfileLevelArr[i3].level;
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
                            case SQLiteDatabase.OPEN_FULLMUTEX /*65536*/:
                                i2 = 9437184;
                                break;
                            case SQLiteDatabase.OPEN_SHAREDCACHE /*131072*/:
                            case SQLiteDatabase.OPEN_PRIVATECACHE /*262144*/:
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
                    i3++;
                }
                if (C6774a0.f20959a >= 21) {
                    i = 345600;
                } else {
                    i = 172800;
                }
                i3 = Math.max(i4, i);
            }
            f13832c = i3;
        }
        return f13832c;
    }
}
