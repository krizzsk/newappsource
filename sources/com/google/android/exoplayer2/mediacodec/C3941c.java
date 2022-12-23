package com.google.android.exoplayer2.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import p001a0.C0016g;
import p137ja.C5414e;
import p277ub.C6774a0;
import p277ub.C6792n;
import p988j$.util.Spliterator;

/* renamed from: com.google.android.exoplayer2.mediacodec.c */
public final class C3941c {

    /* renamed from: a */
    public final String f13853a;

    /* renamed from: b */
    public final String f13854b;

    /* renamed from: c */
    public final String f13855c;

    /* renamed from: d */
    public final MediaCodecInfo.CodecCapabilities f13856d;

    /* renamed from: e */
    public final boolean f13857e;

    /* renamed from: f */
    public final boolean f13858f;

    /* renamed from: g */
    public final boolean f13859g;

    public C3941c(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        str.getClass();
        this.f13853a = str;
        this.f13854b = str2;
        this.f13855c = str3;
        this.f13856d = codecCapabilities;
        this.f13857e = z;
        this.f13858f = z2;
        this.f13859g = C6792n.m15997j(str2);
    }

    /* renamed from: a */
    public static boolean m10587a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i3 = C6774a0.f20959a;
        Point point = new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
        int i4 = point.x;
        int i5 = point.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i4, i5);
        }
        return videoCapabilities.areSizeAndRateSupported(i4, i5, Math.floor(d));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x006e, code lost:
        if (r14 != false) goto L_0x0073;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005d  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.exoplayer2.mediacodec.C3941c m10588g(java.lang.String r7, java.lang.String r8, java.lang.String r9, android.media.MediaCodecInfo.CodecCapabilities r10, boolean r11, boolean r12, boolean r13, boolean r14) {
        /*
            com.google.android.exoplayer2.mediacodec.c r11 = new com.google.android.exoplayer2.mediacodec.c
            r12 = 1
            r13 = 0
            if (r10 == 0) goto L_0x0046
            int r0 = p277ub.C6774a0.f20959a
            r1 = 19
            if (r0 < r1) goto L_0x0016
            java.lang.String r1 = "adaptive-playback"
            boolean r1 = r10.isFeatureSupported(r1)
            if (r1 == 0) goto L_0x0016
            r1 = 1
            goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            if (r1 == 0) goto L_0x0046
            r1 = 22
            if (r0 > r1) goto L_0x0041
            java.lang.String r0 = p277ub.C6774a0.f20962d
            java.lang.String r1 = "ODROID-XU3"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x002f
            java.lang.String r1 = "Nexus 10"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0041
        L_0x002f:
            java.lang.String r0 = "OMX.Exynos.AVC.Decoder"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x003f
            java.lang.String r0 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0041
        L_0x003f:
            r0 = 1
            goto L_0x0042
        L_0x0041:
            r0 = 0
        L_0x0042:
            if (r0 != 0) goto L_0x0046
            r5 = 1
            goto L_0x0047
        L_0x0046:
            r5 = 0
        L_0x0047:
            r0 = 21
            if (r10 == 0) goto L_0x005b
            int r1 = p277ub.C6774a0.f20959a
            if (r1 < r0) goto L_0x005a
            java.lang.String r1 = "tunneled-playback"
            boolean r1 = r10.isFeatureSupported(r1)
            if (r1 == 0) goto L_0x005a
            r1 = 1
            goto L_0x005b
        L_0x005a:
            r1 = 0
        L_0x005b:
            if (r14 != 0) goto L_0x0073
            if (r10 == 0) goto L_0x0071
            int r14 = p277ub.C6774a0.f20959a
            if (r14 < r0) goto L_0x006d
            java.lang.String r14 = "secure-playback"
            boolean r14 = r10.isFeatureSupported(r14)
            if (r14 == 0) goto L_0x006d
            r14 = 1
            goto L_0x006e
        L_0x006d:
            r14 = 0
        L_0x006e:
            if (r14 == 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r6 = 0
            goto L_0x0074
        L_0x0073:
            r6 = 1
        L_0x0074:
            r0 = r11
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.C3941c.m10588g(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):com.google.android.exoplayer2.mediacodec.c");
    }

    /* renamed from: b */
    public final C5414e mo16078b(Format format, Format format2) {
        int i;
        int i2;
        boolean z = false;
        if (!C6774a0.m15941a(format.f13418m, format2.f13418m)) {
            i = 8;
        } else {
            i = 0;
        }
        if (this.f13859g) {
            if (format.f13426u != format2.f13426u) {
                i |= 1024;
            }
            if (!this.f13857e && !(format.f13423r == format2.f13423r && format.f13424s == format2.f13424s)) {
                i |= 512;
            }
            if (!C6774a0.m15941a(format.f13430y, format2.f13430y)) {
                i |= 2048;
            }
            String str = this.f13853a;
            if (C6774a0.f20962d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str)) {
                z = true;
            }
            if (z && !format.mo15798c(format2)) {
                i |= 2;
            }
            if (i == 0) {
                String str2 = this.f13853a;
                if (format.mo15798c(format2)) {
                    i2 = 3;
                } else {
                    i2 = 2;
                }
                return new C5414e(str2, format, format2, i2, 0);
            }
        } else {
            if (format.f13431z != format2.f13431z) {
                i |= 4096;
            }
            if (format.f13400A != format2.f13400A) {
                i |= 8192;
            }
            if (format.f13401B != format2.f13401B) {
                i |= Spliterator.SUBSIZED;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.f13854b)) {
                Pair<Integer, Integer> c = MediaCodecUtil.m10533c(format);
                Pair<Integer, Integer> c2 = MediaCodecUtil.m10533c(format2);
                if (!(c == null || c2 == null)) {
                    int intValue = ((Integer) c.first).intValue();
                    int intValue2 = ((Integer) c2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new C5414e(this.f13853a, format, format2, 3, 0);
                    }
                }
            }
            if (!format.mo15798c(format2)) {
                i |= 32;
            }
            if ("audio/opus".equals(this.f13854b)) {
                i |= 2;
            }
            if (i == 0) {
                return new C5414e(this.f13853a, format, format2, 1, 0);
            }
        }
        return new C5414e(this.f13853a, format, format2, 0, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x013d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x013e  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo16079c(com.google.android.exoplayer2.Format r13) throws com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException {
        /*
            r12 = this;
            java.lang.String r0 = r13.f13415j
            r1 = 16
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x013a
            java.lang.String r4 = r12.f13854b
            if (r4 != 0) goto L_0x000e
            goto L_0x013a
        L_0x000e:
            java.lang.String r0 = p277ub.C6792n.m15990c(r0)
            if (r0 != 0) goto L_0x0016
            goto L_0x013a
        L_0x0016:
            java.lang.String r4 = r12.f13854b
            boolean r4 = r4.equals(r0)
            java.lang.String r5 = ", "
            if (r4 != 0) goto L_0x0049
            java.lang.String r4 = r13.f13415j
            r6 = 13
            int r6 = p001a0.C0016g.m25h(r4, r6)
            int r7 = r0.length()
            int r7 = r7 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r7)
            java.lang.String r7 = "codec.mime "
            r6.append(r7)
            r6.append(r4)
            r6.append(r5)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r12.mo16082f(r0)
            goto L_0x0138
        L_0x0049:
            android.util.Pair r4 = com.google.android.exoplayer2.mediacodec.MediaCodecUtil.m10533c(r13)
            if (r4 != 0) goto L_0x0051
            goto L_0x013a
        L_0x0051:
            java.lang.Object r6 = r4.first
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.Object r4 = r4.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            boolean r7 = r12.f13859g
            if (r7 != 0) goto L_0x006b
            r7 = 42
            if (r6 == r7) goto L_0x006b
            goto L_0x013a
        L_0x006b:
            android.media.MediaCodecInfo$CodecCapabilities r7 = r12.f13856d
            if (r7 == 0) goto L_0x0073
            android.media.MediaCodecInfo$CodecProfileLevel[] r7 = r7.profileLevels
            if (r7 != 0) goto L_0x0075
        L_0x0073:
            android.media.MediaCodecInfo$CodecProfileLevel[] r7 = new android.media.MediaCodecInfo.CodecProfileLevel[r2]
        L_0x0075:
            int r8 = p277ub.C6774a0.f20959a
            r9 = 23
            if (r8 > r9) goto L_0x00ff
            java.lang.String r8 = r12.f13854b
            java.lang.String r9 = "video/x-vnd.on2.vp9"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x00ff
            int r8 = r7.length
            if (r8 != 0) goto L_0x00ff
            android.media.MediaCodecInfo$CodecCapabilities r7 = r12.f13856d
            if (r7 == 0) goto L_0x00a2
            android.media.MediaCodecInfo$VideoCapabilities r7 = r7.getVideoCapabilities()
            if (r7 == 0) goto L_0x00a2
            android.util.Range r7 = r7.getBitrateRange()
            java.lang.Comparable r7 = r7.getUpper()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            goto L_0x00a3
        L_0x00a2:
            r7 = 0
        L_0x00a3:
            r8 = 180000000(0xaba9500, float:1.7967196E-32)
            if (r7 < r8) goto L_0x00ab
            r7 = 1024(0x400, float:1.435E-42)
            goto L_0x00f2
        L_0x00ab:
            r8 = 120000000(0x7270e00, float:1.2567798E-34)
            if (r7 < r8) goto L_0x00b3
            r7 = 512(0x200, float:7.175E-43)
            goto L_0x00f2
        L_0x00b3:
            r8 = 60000000(0x3938700, float:8.670878E-37)
            if (r7 < r8) goto L_0x00bb
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x00f2
        L_0x00bb:
            r8 = 30000000(0x1c9c380, float:7.411627E-38)
            if (r7 < r8) goto L_0x00c3
            r7 = 128(0x80, float:1.794E-43)
            goto L_0x00f2
        L_0x00c3:
            r8 = 18000000(0x112a880, float:2.6936858E-38)
            if (r7 < r8) goto L_0x00cb
            r7 = 64
            goto L_0x00f2
        L_0x00cb:
            r8 = 12000000(0xb71b00, float:1.6815582E-38)
            if (r7 < r8) goto L_0x00d3
            r7 = 32
            goto L_0x00f2
        L_0x00d3:
            r8 = 7200000(0x6ddd00, float:1.0089349E-38)
            if (r7 < r8) goto L_0x00db
            r7 = 16
            goto L_0x00f2
        L_0x00db:
            r8 = 3600000(0x36ee80, float:5.044674E-39)
            if (r7 < r8) goto L_0x00e3
            r7 = 8
            goto L_0x00f2
        L_0x00e3:
            r8 = 1800000(0x1b7740, float:2.522337E-39)
            if (r7 < r8) goto L_0x00ea
            r7 = 4
            goto L_0x00f2
        L_0x00ea:
            r8 = 800000(0xc3500, float:1.121039E-39)
            if (r7 < r8) goto L_0x00f1
            r7 = 2
            goto L_0x00f2
        L_0x00f1:
            r7 = 1
        L_0x00f2:
            android.media.MediaCodecInfo$CodecProfileLevel r8 = new android.media.MediaCodecInfo$CodecProfileLevel
            r8.<init>()
            r8.profile = r3
            r8.level = r7
            android.media.MediaCodecInfo$CodecProfileLevel[] r7 = new android.media.MediaCodecInfo.CodecProfileLevel[r3]
            r7[r2] = r8
        L_0x00ff:
            int r8 = r7.length
            r9 = 0
        L_0x0101:
            if (r9 >= r8) goto L_0x0111
            r10 = r7[r9]
            int r11 = r10.profile
            if (r11 != r6) goto L_0x010e
            int r10 = r10.level
            if (r10 < r4) goto L_0x010e
            goto L_0x013a
        L_0x010e:
            int r9 = r9 + 1
            goto L_0x0101
        L_0x0111:
            java.lang.String r4 = r13.f13415j
            r6 = 22
            int r6 = p001a0.C0016g.m25h(r4, r6)
            int r7 = r0.length()
            int r7 = r7 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r7)
            java.lang.String r7 = "codec.profileLevel, "
            r6.append(r7)
            r6.append(r4)
            r6.append(r5)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r12.mo16082f(r0)
        L_0x0138:
            r0 = 0
            goto L_0x013b
        L_0x013a:
            r0 = 1
        L_0x013b:
            if (r0 != 0) goto L_0x013e
            return r2
        L_0x013e:
            boolean r0 = r12.f13859g
            r4 = 21
            if (r0 == 0) goto L_0x0178
            int r0 = r13.f13423r
            if (r0 <= 0) goto L_0x0177
            int r1 = r13.f13424s
            if (r1 > 0) goto L_0x014d
            goto L_0x0177
        L_0x014d:
            int r3 = p277ub.C6774a0.f20959a
            if (r3 < r4) goto L_0x0159
            float r13 = r13.f13425t
            double r2 = (double) r13
            boolean r13 = r12.mo16081e(r0, r1, r2)
            return r13
        L_0x0159:
            int r0 = r0 * r1
            int r1 = com.google.android.exoplayer2.mediacodec.MediaCodecUtil.m10538h()
            if (r0 > r1) goto L_0x0162
            r2 = 1
        L_0x0162:
            if (r2 != 0) goto L_0x0176
            int r0 = r13.f13423r
            int r13 = r13.f13424s
            r1 = 40
            java.lang.String r3 = "legacyFrameSize, "
            java.lang.String r4 = "x"
            java.lang.String r13 = p379.C13715c.m34243i(r1, r3, r0, r4, r13)
            r12.mo16082f(r13)
        L_0x0176:
            return r2
        L_0x0177:
            return r3
        L_0x0178:
            int r0 = p277ub.C6774a0.f20959a
            if (r0 < r4) goto L_0x027d
            int r4 = r13.f13400A
            r5 = -1
            if (r4 == r5) goto L_0x01b8
            android.media.MediaCodecInfo$CodecCapabilities r6 = r12.f13856d
            if (r6 != 0) goto L_0x018b
            java.lang.String r4 = "sampleRate.caps"
            r12.mo16082f(r4)
            goto L_0x01b3
        L_0x018b:
            android.media.MediaCodecInfo$AudioCapabilities r6 = r6.getAudioCapabilities()
            if (r6 != 0) goto L_0x0197
            java.lang.String r4 = "sampleRate.aCaps"
            r12.mo16082f(r4)
            goto L_0x01b3
        L_0x0197:
            boolean r6 = r6.isSampleRateSupported(r4)
            if (r6 != 0) goto L_0x01b5
            r6 = 31
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            java.lang.String r6 = "sampleRate.support, "
            r7.append(r6)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r12.mo16082f(r4)
        L_0x01b3:
            r4 = 0
            goto L_0x01b6
        L_0x01b5:
            r4 = 1
        L_0x01b6:
            if (r4 == 0) goto L_0x027e
        L_0x01b8:
            int r13 = r13.f13431z
            if (r13 == r5) goto L_0x027d
            android.media.MediaCodecInfo$CodecCapabilities r4 = r12.f13856d
            if (r4 != 0) goto L_0x01c7
            java.lang.String r13 = "channelCount.caps"
            r12.mo16082f(r13)
            goto L_0x0278
        L_0x01c7:
            android.media.MediaCodecInfo$AudioCapabilities r4 = r4.getAudioCapabilities()
            if (r4 != 0) goto L_0x01d4
            java.lang.String r13 = "channelCount.aCaps"
            r12.mo16082f(r13)
            goto L_0x0278
        L_0x01d4:
            java.lang.String r5 = r12.f13853a
            java.lang.String r6 = r12.f13854b
            int r4 = r4.getMaxInputChannelCount()
            if (r4 > r3) goto L_0x0260
            r3 = 26
            if (r0 < r3) goto L_0x01e6
            if (r4 <= 0) goto L_0x01e6
            goto L_0x0260
        L_0x01e6:
            java.lang.String r0 = "audio/mpeg"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0260
            java.lang.String r0 = "audio/3gpp"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0260
            java.lang.String r0 = "audio/amr-wb"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0260
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0260
            java.lang.String r0 = "audio/vorbis"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0260
            java.lang.String r0 = "audio/opus"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0260
            java.lang.String r0 = "audio/raw"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0260
            java.lang.String r0 = "audio/flac"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0260
            java.lang.String r0 = "audio/g711-alaw"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0260
            java.lang.String r0 = "audio/g711-mlaw"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0260
            java.lang.String r0 = "audio/gsm"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x023f
            goto L_0x0260
        L_0x023f:
            java.lang.String r0 = "audio/ac3"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0249
            r1 = 6
            goto L_0x0254
        L_0x0249:
            java.lang.String r0 = "audio/eac3"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0252
            goto L_0x0254
        L_0x0252:
            r1 = 30
        L_0x0254:
            r0 = 59
            int r0 = p001a0.C0016g.m25h(r5, r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            r4 = r1
        L_0x0260:
            if (r4 >= r13) goto L_0x027a
            r0 = 33
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "channelCount.support, "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r12.mo16082f(r13)
        L_0x0278:
            r13 = 0
            goto L_0x027b
        L_0x027a:
            r13 = 1
        L_0x027b:
            if (r13 == 0) goto L_0x027e
        L_0x027d:
            r2 = 1
        L_0x027e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.C3941c.mo16079c(com.google.android.exoplayer2.Format):boolean");
    }

    /* renamed from: d */
    public final boolean mo16080d(Format format) {
        if (this.f13859g) {
            return this.f13857e;
        }
        Pair<Integer, Integer> c = MediaCodecUtil.m10533c(format);
        if (c == null || ((Integer) c.first).intValue() != 42) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo16081e(int i, int i2, double d) {
        boolean z;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f13856d;
        if (codecCapabilities == null) {
            mo16082f("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            mo16082f("sizeAndRate.vCaps");
            return false;
        }
        if (!m10587a(videoCapabilities, i, i2, d)) {
            if (i < i2) {
                if (!"OMX.MTK.VIDEO.DECODER.HEVC".equals(this.f13853a) || !"mcv5a".equals(C6774a0.f20960b)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && m10587a(videoCapabilities, i2, i, d)) {
                    StringBuilder sb = new StringBuilder(69);
                    sb.append("sizeAndRate.rotated, ");
                    sb.append(i);
                    sb.append("x");
                    sb.append(i2);
                    sb.append("x");
                    sb.append(d);
                    String sb2 = sb.toString();
                    String str = this.f13853a;
                    new StringBuilder(C0016g.m25h(C6774a0.f20963e, C0016g.m25h(this.f13854b, C0016g.m25h(str, C0016g.m25h(sb2, 25)))));
                }
            }
            StringBuilder sb3 = new StringBuilder(69);
            sb3.append("sizeAndRate.support, ");
            sb3.append(i);
            sb3.append("x");
            sb3.append(i2);
            sb3.append("x");
            sb3.append(d);
            mo16082f(sb3.toString());
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final void mo16082f(String str) {
        String str2 = this.f13853a;
        new StringBuilder(C0016g.m25h(C6774a0.f20963e, C0016g.m25h(this.f13854b, C0016g.m25h(str2, C0016g.m25h(str, 20)))));
    }

    public final String toString() {
        return this.f13853a;
    }
}
