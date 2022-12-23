package p277ub;

import android.text.TextUtils;
import com.appboy.models.MessageButton;
import com.google.android.play.core.appupdate.C14226d;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p125ia.C5311a;

/* renamed from: ub.n */
public final class C6792n {

    /* renamed from: a */
    public static final ArrayList<C6793a> f21003a = new ArrayList<>();

    /* renamed from: b */
    public static final Pattern f21004b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* renamed from: ub.n$a */
    public static final class C6793a {
    }

    /* renamed from: ub.n$b */
    public static final class C6794b {

        /* renamed from: a */
        public final int f21005a;

        /* renamed from: b */
        public final int f21006b;

        public C6794b(int i, int i2) {
            this.f21005a = i;
            this.f21006b = i2;
        }
    }

    /* renamed from: a */
    public static boolean m15988a(String str, String str2) {
        C6794b e;
        int a;
        if (str == null) {
            return false;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = 0;
                    break;
                }
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c = 1;
                    break;
                }
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 4;
                    break;
                }
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c = 5;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 6;
                    break;
                }
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c = 8;
                    break;
                }
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c = 9;
                    break;
                }
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c = 10;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return true;
            case 3:
                if (str2 == null || (e = m15992e(str2)) == null || (a = C5311a.m13350a(e.f21006b)) == 0 || a == 16) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    /* renamed from: b */
    public static int m15989b(String str, String str2) {
        C6794b e;
        char c = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = 0;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c = 1;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 2;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 3;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c = 4;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 5;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c = 6;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c = 7;
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c = 8;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 18;
            case 1:
                return 7;
            case 2:
                if (str2 == null || (e = m15992e(str2)) == null) {
                    return 0;
                }
                return C5311a.m13350a(e.f21006b);
            case 3:
                return 5;
            case 4:
                return 17;
            case 5:
                return 6;
            case 6:
                return 9;
            case 7:
                return 8;
            case 8:
                return 14;
            default:
                return 0;
        }
    }

    /* renamed from: c */
    public static String m15990c(String str) {
        C6794b e;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String H0 = C14226d.m35341H0(str.trim());
        if (H0.startsWith("avc1") || H0.startsWith("avc3")) {
            return "video/avc";
        }
        if (H0.startsWith("hev1") || H0.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (H0.startsWith("dvav") || H0.startsWith("dva1") || H0.startsWith("dvhe") || H0.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (H0.startsWith("av01")) {
            return "video/av01";
        }
        if (H0.startsWith("vp9") || H0.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (H0.startsWith("vp8") || H0.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (H0.startsWith("mp4a")) {
            if (H0.startsWith("mp4a.") && (e = m15992e(H0)) != null) {
                str2 = m15991d(e.f21005a);
            }
            if (str2 == null) {
                return "audio/mp4a-latm";
            }
            return str2;
        } else if (H0.startsWith("mha1")) {
            return "audio/mha1";
        } else {
            if (H0.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (H0.startsWith("ac-3") || H0.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (H0.startsWith("ec-3") || H0.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (H0.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (H0.startsWith("ac-4") || H0.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (H0.startsWith("dtsc") || H0.startsWith("dtse")) {
                return "audio/vnd.dts";
            }
            if (H0.startsWith("dtsh") || H0.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (H0.startsWith("opus")) {
                return "audio/opus";
            }
            if (H0.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (H0.startsWith("flac")) {
                return "audio/flac";
            }
            if (H0.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (H0.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (H0.contains("cea708")) {
                return "application/cea-708";
            }
            if (H0.contains("eia608") || H0.contains("cea608")) {
                return "application/cea-608";
            }
            int size = f21003a.size();
            for (int i = 0; i < size; i++) {
                f21003a.get(i).getClass();
                if (H0.startsWith((String) null)) {
                    break;
                }
            }
            return null;
        }
    }

    /* renamed from: d */
    public static String m15991d(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* renamed from: e */
    public static C6794b m15992e(String str) {
        Matcher matcher = f21004b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        int i = 0;
        try {
            int parseInt = Integer.parseInt(group, 16);
            if (group2 != null) {
                i = Integer.parseInt(group2);
            }
            return new C6794b(parseInt, i);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static String m15993f(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    /* renamed from: g */
    public static int m15994g(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m15995h(str)) {
            return 1;
        }
        if (m15997j(str)) {
            return 2;
        }
        if (m15996i(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        int size = f21003a.size();
        for (int i = 0; i < size; i++) {
            f21003a.get(i).getClass();
            if (str.equals((Object) null)) {
                return 0;
            }
        }
        return -1;
    }

    /* renamed from: h */
    public static boolean m15995h(String str) {
        return "audio".equals(m15993f(str));
    }

    /* renamed from: i */
    public static boolean m15996i(String str) {
        if (MessageButton.TEXT.equals(m15993f(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m15997j(String str) {
        return "video".equals(m15993f(str));
    }
}
