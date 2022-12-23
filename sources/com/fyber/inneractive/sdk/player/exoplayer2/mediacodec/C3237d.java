package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.recyclerview.widget.RecyclerView;
import com.appboy.support.AppboyImageUtils;
import com.appsflyer.internal.referrer.Payload;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import p988j$.util.Spliterator;

@SuppressLint({"InlinedApi"})
@TargetApi(16)
/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d */
public final class C3237d {

    /* renamed from: a */
    public static final C3232a f11704a = new C3232a("OMX.google.raw.decoder", (String) null, (MediaCodecInfo.CodecCapabilities) null, false);

    /* renamed from: b */
    public static final Pattern f11705b = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: c */
    public static final HashMap<C3238a, List<C3232a>> f11706c = new HashMap<>();

    /* renamed from: d */
    public static final SparseIntArray f11707d;

    /* renamed from: e */
    public static final SparseIntArray f11708e;

    /* renamed from: f */
    public static final Map<String, Integer> f11709f;

    /* renamed from: g */
    public static int f11710g = -1;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d$a */
    public static final class C3238a {

        /* renamed from: a */
        public final String f11711a;

        /* renamed from: b */
        public final boolean f11712b;

        public C3238a(String str, boolean z) {
            this.f11711a = str;
            this.f11712b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != C3238a.class) {
                return false;
            }
            C3238a aVar = (C3238a) obj;
            if (!TextUtils.equals(this.f11711a, aVar.f11711a) || this.f11712b != aVar.f11712b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int i2;
            String str = this.f11711a;
            if (str == null) {
                i = 0;
            } else {
                i = str.hashCode();
            }
            int i3 = (i + 31) * 31;
            if (this.f11712b) {
                i2 = 1231;
            } else {
                i2 = 1237;
            }
            return i3 + i2;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d$b */
    public static class C3239b extends Exception {
        public C3239b(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d$c */
    public interface C3240c {
        /* renamed from: a */
        int mo14347a();

        /* renamed from: a */
        MediaCodecInfo mo14348a(int i);

        /* renamed from: a */
        boolean mo14349a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* renamed from: b */
        boolean mo14350b();
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d$d */
    public static final class C3241d implements C3240c {
        /* renamed from: a */
        public int mo14347a() {
            return MediaCodecList.getCodecCount();
        }

        /* renamed from: b */
        public boolean mo14350b() {
            return false;
        }

        /* renamed from: a */
        public MediaCodecInfo mo14348a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        /* renamed from: a */
        public boolean mo14349a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "video/avc".equals(str);
        }
    }

    @TargetApi(21)
    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d$e */
    public static final class C3242e implements C3240c {

        /* renamed from: a */
        public final int f11713a;

        /* renamed from: b */
        public MediaCodecInfo[] f11714b;

        public C3242e(boolean z) {
            this.f11713a = z ? 1 : 0;
        }

        /* renamed from: a */
        public boolean mo14349a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported("secure-playback");
        }

        /* renamed from: b */
        public boolean mo14350b() {
            return true;
        }

        /* renamed from: a */
        public int mo14347a() {
            if (this.f11714b == null) {
                this.f11714b = new MediaCodecList(this.f11713a).getCodecInfos();
            }
            return this.f11714b.length;
        }

        /* renamed from: a */
        public MediaCodecInfo mo14348a(int i) {
            if (this.f11714b == null) {
                this.f11714b = new MediaCodecList(this.f11713a).getCodecInfos();
            }
            return this.f11714b[i];
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11707d = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f11708e = sparseIntArray2;
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
        f11709f = hashMap;
        C13715c.m34248n(1, hashMap, "L30", 4, "L60", 16, "L63", 64, "L90");
        C13715c.m34248n(256, hashMap, "L93", 1024, "L120", 4096, "L123", Spliterator.SUBSIZED, "L150");
        C13715c.m34248n(SQLiteDatabase.OPEN_FULLMUTEX, hashMap, "L153", SQLiteDatabase.OPEN_PRIVATECACHE, "L156", 1048576, "L180", 4194304, "L183");
        C13715c.m34248n(16777216, hashMap, "L186", 2, "H30", 8, "H60", 32, "H63");
        C13715c.m34248n(RecyclerView.C1119a0.FLAG_IGNORE, hashMap, "H90", 512, "H93", 2048, "H120", 8192, "H123");
        C13715c.m34248n(32768, hashMap, "H150", SQLiteDatabase.OPEN_SHAREDCACHE, "H153", 524288, "H156", 2097152, "H180");
        hashMap.put("H183", 8388608);
        hashMap.put("H186", Integer.valueOf(AppboyImageUtils.MAX_IMAGE_CACHE_SIZE_BYTES));
    }

    /* renamed from: a */
    public static C3232a m8217a(String str, boolean z) throws C3239b {
        List<T> list;
        C3240c cVar;
        synchronized (C3237d.class) {
            C3238a aVar = new C3238a(str, z);
            list = f11706c.get(aVar);
            if (list == null) {
                int i = C3406u.f12148a;
                if (i >= 21) {
                    cVar = new C3242e(z);
                } else {
                    cVar = new C3241d();
                }
                List<C3232a> a = m8218a(aVar, cVar);
                if (z && ((ArrayList) a).isEmpty() && 21 <= i && i <= 23) {
                    a = m8218a(aVar, (C3240c) new C3241d());
                    ArrayList arrayList = (ArrayList) a;
                    if (!arrayList.isEmpty()) {
                        String str2 = ((C3232a) arrayList.get(0)).f11659a;
                    }
                }
                if (i < 26) {
                    int i2 = 1;
                    if (a.size() > 1 && "OMX.MTK.AUDIO.DECODER.RAW".equals(a.get(0).f11659a)) {
                        while (true) {
                            if (i2 >= a.size()) {
                                break;
                            }
                            C3232a aVar2 = a.get(i2);
                            if ("OMX.google.raw.decoder".equals(aVar2.f11659a)) {
                                a.remove(i2);
                                a.add(0, aVar2);
                                break;
                            }
                            i2++;
                        }
                    }
                }
                list = Collections.unmodifiableList(a);
                f11706c.put(aVar, list);
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        return (C3232a) list.get(0);
    }

    /* renamed from: a */
    public static int m8216a() throws C3239b {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i;
        if (f11710g == -1) {
            int i2 = 0;
            C3232a a = m8217a("video/avc", false);
            if (a != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = a.f11663e;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = codecProfileLevelArr[i2].level;
                    if (i4 != 1 && i4 != 2) {
                        switch (i4) {
                            case 8:
                            case 16:
                            case 32:
                                i = 101376;
                                break;
                            case 64:
                                i = 202752;
                                break;
                            case RecyclerView.C1119a0.FLAG_IGNORE:
                            case 256:
                                i = 414720;
                                break;
                            case 512:
                                i = 921600;
                                break;
                            case 1024:
                                i = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i = 2097152;
                                break;
                            case 8192:
                                i = 2228224;
                                break;
                            case Spliterator.SUBSIZED /*16384*/:
                                i = 5652480;
                                break;
                            case 32768:
                            case SQLiteDatabase.OPEN_FULLMUTEX /*65536*/:
                                i = 9437184;
                                break;
                            default:
                                i = -1;
                                break;
                        }
                    } else {
                        i = 25344;
                    }
                    i3 = Math.max(i, i3);
                    i2++;
                }
                i2 = Math.max(i3, C3406u.f12148a >= 21 ? 345600 : 172800);
            }
            f11710g = i2;
        }
        return f11710g;
    }

    /* renamed from: a */
    public static List<C3232a> m8218a(C3238a aVar, C3240c cVar) throws C3239b {
        ArrayList arrayList;
        boolean z;
        C3238a aVar2 = aVar;
        C3240c cVar2 = cVar;
        try {
            arrayList = new ArrayList();
            String str = aVar2.f11711a;
            int a = cVar.mo14347a();
            boolean b = cVar.mo14350b();
            for (int i = 0; i < a; i++) {
                MediaCodecInfo a2 = cVar2.mo14348a(i);
                String name = a2.getName();
                if (m8219a(a2, name, b)) {
                    for (String str2 : a2.getSupportedTypes()) {
                        if (str2.equalsIgnoreCase(str)) {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = a2.getCapabilitiesForType(str2);
                            boolean a3 = cVar2.mo14349a(str, capabilitiesForType);
                            if (C3406u.f12148a <= 22) {
                                String str3 = C3406u.f12151d;
                                if ((str3.equals("ODROID-XU3") || str3.equals("Nexus 10")) && ("OMX.Exynos.AVC.Decoder".equals(name) || "OMX.Exynos.AVC.Decoder.secure".equals(name))) {
                                    z = true;
                                    if ((b && aVar2.f11712b == a3) || (!b && !aVar2.f11712b)) {
                                        arrayList.add(new C3232a(name, str, capabilitiesForType, z));
                                    } else if (!b && a3) {
                                        arrayList.add(new C3232a(name + ".secure", str, capabilitiesForType, z));
                                        return arrayList;
                                    }
                                }
                            }
                            z = false;
                            if (b || aVar2.f11712b == a3) {
                                arrayList.add(new C3232a(name + ".secure", str, capabilitiesForType, z));
                                return arrayList;
                            }
                            arrayList.add(new C3232a(name, str, capabilitiesForType, z));
                        }
                    }
                    continue;
                }
            }
            return arrayList;
        } catch (Exception e) {
            if (C3406u.f12148a > 23 || arrayList.isEmpty()) {
                throw e;
            }
        } catch (Exception e2) {
            throw new C3239b(e2);
        }
    }

    /* renamed from: a */
    public static boolean m8219a(MediaCodecInfo mediaCodecInfo, String str, boolean z) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = C3406u.f12148a;
        if (i < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i < 18 && "OMX.SEC.MP3.Decoder".equals(str)) {
            return false;
        }
        if (i < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str) && "a70".equals(C3406u.f12149b)) {
            return false;
        }
        if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str2 = C3406u.f12149b;
            if ("dlxu".equals(str2) || "protou".equals(str2) || "ville".equals(str2) || "villeplus".equals(str2) || "villec2".equals(str2) || str2.startsWith("gee") || "C6602".equals(str2) || "C6603".equals(str2) || "C6606".equals(str2) || "C6616".equals(str2) || "L36h".equals(str2) || "SO-02E".equals(str2)) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str3 = C3406u.f12149b;
            if ("C1504".equals(str3) || "C1505".equals(str3) || "C1604".equals(str3) || "C1605".equals(str3)) {
                return false;
            }
        }
        if (i <= 19 && "OMX.SEC.vp8.dec".equals(str) && Payload.SOURCE_SAMSUNG.equals(C3406u.f12150c)) {
            String str4 = C3406u.f12149b;
            if (str4.startsWith("d2") || str4.startsWith("serrano") || str4.startsWith("jflte") || str4.startsWith("santos") || str4.startsWith("t0")) {
                return false;
            }
        }
        if (i > 19 || !C3406u.f12149b.startsWith("jflte") || !"OMX.qcom.video.decoder.vp8".equals(str)) {
            return true;
        }
        return false;
    }
}
