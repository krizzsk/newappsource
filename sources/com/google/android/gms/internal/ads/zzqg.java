package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import p001a0.C0016g;
import p988j$.util.Spliterator;

public final class zzqg {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    private final boolean zzh;

    public zzqg(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z;
        this.zze = z4;
        this.zzf = z6;
        this.zzh = zzbo.zzh(str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r12) == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        if ("Nexus 10".equals(r3) == false) goto L_0x003b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzqg zzc(java.lang.String r12, java.lang.String r13, java.lang.String r14, android.media.MediaCodecInfo.CodecCapabilities r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            r1 = r12
            r4 = r15
            com.google.android.gms.internal.ads.zzqg r11 = new com.google.android.gms.internal.ads.zzqg
            r0 = 1
            r2 = 0
            if (r4 == 0) goto L_0x003d
            int r3 = com.google.android.gms.internal.ads.zzeg.zza
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L_0x003d
            int r3 = com.google.android.gms.internal.ads.zzeg.zza
            r5 = 22
            if (r3 > r5) goto L_0x003b
            java.lang.String r3 = com.google.android.gms.internal.ads.zzeg.zzd
            java.lang.String r5 = "ODROID-XU3"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L_0x002a
            java.lang.String r5 = "Nexus 10"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x003b
        L_0x002a:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r12)
            if (r3 != 0) goto L_0x003d
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r8 = 1
            goto L_0x003e
        L_0x003d:
            r8 = 0
        L_0x003e:
            r3 = 21
            if (r4 == 0) goto L_0x0050
            int r5 = com.google.android.gms.internal.ads.zzeg.zza
            if (r5 < r3) goto L_0x0050
            java.lang.String r5 = "tunneled-playback"
            boolean r5 = r15.isFeatureSupported(r5)
            if (r5 == 0) goto L_0x0050
            r9 = 1
            goto L_0x0051
        L_0x0050:
            r9 = 0
        L_0x0051:
            if (r20 != 0) goto L_0x0064
            if (r4 == 0) goto L_0x0062
            int r5 = com.google.android.gms.internal.ads.zzeg.zza
            if (r5 < r3) goto L_0x0062
            java.lang.String r3 = "secure-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L_0x0062
            goto L_0x0064
        L_0x0062:
            r10 = 0
            goto L_0x0065
        L_0x0064:
            r10 = 1
        L_0x0065:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqg.zzc(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.internal.ads.zzqg");
    }

    private static Point zzh(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(zzeg.zze(i, widthAlignment) * widthAlignment, zzeg.zze(i2, heightAlignment) * heightAlignment);
    }

    private final void zzi(String str) {
        int i = zzeg.zza;
    }

    private static boolean zzj(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point zzh2 = zzh(videoCapabilities, i, i2);
        int i3 = zzh2.x;
        int i4 = zzh2.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    public final String toString() {
        return this.zza;
    }

    public final Point zza(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzh(videoCapabilities, i, i2);
    }

    public final zzgn zzb(zzad zzad, zzad zzad2) {
        int i;
        int i2;
        if (true != zzeg.zzS(zzad.zzm, zzad2.zzm)) {
            i = 8;
        } else {
            i = 0;
        }
        if (this.zzh) {
            if (zzad.zzu != zzad2.zzu) {
                i |= 1024;
            }
            if (!this.zze && !(zzad.zzr == zzad2.zzr && zzad.zzs == zzad2.zzs)) {
                i |= 512;
            }
            if (!zzeg.zzS(zzad.zzy, zzad2.zzy)) {
                i |= 2048;
            }
            String str = this.zza;
            if (zzeg.zzd.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !zzad.zzd(zzad2)) {
                i |= 2;
            }
            if (i == 0) {
                String str2 = this.zza;
                if (true != zzad.zzd(zzad2)) {
                    i2 = 2;
                } else {
                    i2 = 3;
                }
                return new zzgn(str2, zzad, zzad2, i2, 0);
            }
        } else {
            if (zzad.zzz != zzad2.zzz) {
                i |= 4096;
            }
            if (zzad.zzA != zzad2.zzA) {
                i |= 8192;
            }
            if (zzad.zzB != zzad2.zzB) {
                i |= Spliterator.SUBSIZED;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.zzb)) {
                Pair zzb2 = zzqy.zzb(zzad);
                Pair zzb3 = zzqy.zzb(zzad2);
                if (!(zzb2 == null || zzb3 == null)) {
                    int intValue = ((Integer) zzb2.first).intValue();
                    int intValue2 = ((Integer) zzb3.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new zzgn(this.zza, zzad, zzad2, 3, 0);
                    }
                }
            }
            if (!zzad.zzd(zzad2)) {
                i |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i |= 2;
            }
            if (i == 0) {
                return new zzgn(this.zza, zzad, zzad2, 1, 0);
            }
        }
        return new zzgn(this.zza, zzad, zzad2, 0, i);
    }

    public final boolean zzd(zzad zzad) throws zzqs {
        int i;
        Pair zzb2;
        int i2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        boolean z = false;
        if (!this.zzb.equals(zzad.zzm) && !this.zzb.equals(zzqy.zze(zzad))) {
            return false;
        }
        int i3 = 16;
        if (!(zzad.zzj == null || (zzb2 = zzqy.zzb(zzad)) == null)) {
            int intValue = ((Integer) zzb2.first).intValue();
            int intValue2 = ((Integer) zzb2.second).intValue();
            int i4 = 2;
            if ("video/dolby-vision".equals(zzad.zzm)) {
                if ("video/avc".equals(this.zzb)) {
                    intValue2 = 0;
                    intValue = 8;
                } else if ("video/hevc".equals(this.zzb)) {
                    intValue2 = 0;
                    intValue = 2;
                }
            }
            if (!this.zzh) {
                if (intValue == 42) {
                    intValue = 42;
                }
            }
            MediaCodecInfo.CodecProfileLevel[] zzg2 = zzg();
            if (zzeg.zza <= 23 && "video/x-vnd.on2.vp9".equals(this.zzb) && zzg2.length == 0) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
                if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                    i2 = 0;
                } else {
                    i2 = videoCapabilities.getBitrateRange().getUpper().intValue();
                }
                if (i2 >= 180000000) {
                    i4 = 1024;
                } else if (i2 >= 120000000) {
                    i4 = 512;
                } else if (i2 >= 60000000) {
                    i4 = 256;
                } else if (i2 >= 30000000) {
                    i4 = RecyclerView.C1119a0.FLAG_IGNORE;
                } else if (i2 >= 18000000) {
                    i4 = 64;
                } else if (i2 >= 12000000) {
                    i4 = 32;
                } else if (i2 >= 7200000) {
                    i4 = 16;
                } else if (i2 >= 3600000) {
                    i4 = 8;
                } else if (i2 >= 1800000) {
                    i4 = 4;
                } else if (i2 < 800000) {
                    i4 = 1;
                }
                MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                codecProfileLevel.profile = 1;
                codecProfileLevel.level = i4;
                zzg2 = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
            }
            int length = zzg2.length;
            int i5 = 0;
            while (i5 < length) {
                MediaCodecInfo.CodecProfileLevel codecProfileLevel2 = zzg2[i5];
                if (codecProfileLevel2.profile != intValue || codecProfileLevel2.level < intValue2) {
                    i5++;
                }
            }
            zzi(C25541a.m63882l("codec.profileLevel, ", zzad.zzj, ", ", this.zzc));
            return false;
        }
        if (this.zzh) {
            int i6 = zzad.zzr;
            if (i6 <= 0 || (i = zzad.zzs) <= 0) {
                return true;
            }
            if (zzeg.zza >= 21) {
                return zzf(i6, i, (double) zzad.zzt);
            }
            if (i6 * i <= zzqy.zza()) {
                z = true;
            }
            if (!z) {
                zzi(C13715c.m34244j("legacyFrameSize, ", zzad.zzr, "x", zzad.zzs));
            }
            return z;
        }
        int i7 = zzeg.zza;
        if (i7 >= 21) {
            int i8 = zzad.zzA;
            if (i8 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
                if (codecCapabilities2 == null) {
                    zzi("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities2.getAudioCapabilities();
                if (audioCapabilities == null) {
                    zzi("sampleRate.aCaps");
                    return false;
                } else if (!audioCapabilities.isSampleRateSupported(i8)) {
                    zzi(C16759e.m42349e("sampleRate.support, ", i8));
                    return false;
                }
            }
            int i9 = zzad.zzz;
            if (i9 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities3 = this.zzd;
                if (codecCapabilities3 == null) {
                    zzi("channelCount.caps");
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities3.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        zzi("channelCount.aCaps");
                    } else {
                        String str = this.zzb;
                        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1 && ((i7 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str) && !"audio/3gpp".equals(str) && !"audio/amr-wb".equals(str) && !"audio/mp4a-latm".equals(str) && !"audio/vorbis".equals(str) && !"audio/opus".equals(str) && !"audio/raw".equals(str) && !"audio/flac".equals(str) && !"audio/g711-alaw".equals(str) && !"audio/g711-mlaw".equals(str) && !"audio/gsm".equals(str))) {
                            if ("audio/ac3".equals(str)) {
                                i3 = 6;
                            } else if (!"audio/eac3".equals(str)) {
                                i3 = 30;
                            }
                            maxInputChannelCount = i3;
                        }
                        if (maxInputChannelCount < i9) {
                            zzi(C16759e.m42349e("channelCount.support, ", i9));
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean zze(zzad zzad) {
        if (this.zzh) {
            return this.zze;
        }
        Pair zzb2 = zzqy.zzb(zzad);
        if (zzb2 == null || ((Integer) zzb2.first).intValue() != 42) {
            return false;
        }
        return true;
    }

    public final boolean zzf(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null) {
            zzi("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzi("sizeAndRate.vCaps");
            return false;
        } else if (zzj(videoCapabilities, i, i2, d)) {
            return true;
        } else {
            if (i >= i2 || (("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.zza) && "mcv5a".equals(zzeg.zzb)) || !zzj(videoCapabilities, i2, i, d))) {
                StringBuilder s = C0016g.m35s("sizeAndRate.support, ", i, "x", i2, "x");
                s.append(d);
                zzi(s.toString());
                return false;
            }
            int i3 = zzeg.zza;
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.profileLevels;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.media.MediaCodecInfo.CodecProfileLevel[] zzg() {
        /*
            r1 = this;
            android.media.MediaCodecInfo$CodecCapabilities r0 = r1.zzd
            if (r0 == 0) goto L_0x0008
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r0.profileLevels
            if (r0 != 0) goto L_0x000b
        L_0x0008:
            r0 = 0
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = new android.media.MediaCodecInfo.CodecProfileLevel[r0]
        L_0x000b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqg.zzg():android.media.MediaCodecInfo$CodecProfileLevel[]");
    }
}
