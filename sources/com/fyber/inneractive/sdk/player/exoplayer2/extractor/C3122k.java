package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.safetynet.SafetyNetStatusCodes;
import com.google.android.gms.wallet.WalletConstants;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.k */
public final class C3122k {

    /* renamed from: h */
    public static final String[] f10808h = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: i */
    public static final int[] f10809i = {44100, 48000, 32000};

    /* renamed from: j */
    public static final int[] f10810j = {32, 64, 96, RecyclerView.C1119a0.FLAG_IGNORE, 160, 192, 224, 256, 288, 320, 352, 384, WalletConstants.ERROR_CODE_USER_CANCELLED, 448};

    /* renamed from: k */
    public static final int[] f10811k = {32, 48, 56, 64, 80, 96, 112, RecyclerView.C1119a0.FLAG_IGNORE, 144, 160, 176, 192, 224, 256};

    /* renamed from: l */
    public static final int[] f10812l = {32, 48, 56, 64, 80, 96, 112, RecyclerView.C1119a0.FLAG_IGNORE, 160, 192, 224, 256, 320, 384};

    /* renamed from: m */
    public static final int[] f10813m = {32, 40, 48, 56, 64, 80, 96, 112, RecyclerView.C1119a0.FLAG_IGNORE, 160, 192, 224, 256, 320};

    /* renamed from: n */
    public static final int[] f10814n = {8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, RecyclerView.C1119a0.FLAG_IGNORE, 144, 160};

    /* renamed from: a */
    public int f10815a;

    /* renamed from: b */
    public String f10816b;

    /* renamed from: c */
    public int f10817c;

    /* renamed from: d */
    public int f10818d;

    /* renamed from: e */
    public int f10819e;

    /* renamed from: f */
    public int f10820f;

    /* renamed from: g */
    public int f10821g;

    /* renamed from: a */
    public static int m7846a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if ((i & -2097152) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = f10809i[i5];
        if (i2 == 2) {
            i7 /= 2;
        } else if (i2 == 0) {
            i7 /= 4;
        }
        int i8 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? f10810j[i4 - 1] : f10811k[i4 - 1]) * SafetyNetStatusCodes.SAFE_BROWSING_UNSUPPORTED_THREAT_TYPES) / i7) + i8) * 4;
        }
        if (i2 == 3) {
            i6 = i3 == 2 ? f10812l[i4 - 1] : f10813m[i4 - 1];
        } else {
            i6 = f10814n[i4 - 1];
        }
        int i9 = 144000;
        if (i2 == 3) {
            return C13715c.m34237b(i6, 144000, i7, i8);
        }
        if (i3 == 1) {
            i9 = 72000;
        }
        return C13715c.m34237b(i9, i6, i7, i8);
    }

    /* renamed from: a */
    public static boolean m7847a(int i, C3122k kVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i11;
        if ((i & -2097152) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        int i12 = f10809i[i5];
        int i13 = 2;
        if (i2 == 2) {
            i12 /= 2;
        } else if (i2 == 0) {
            i12 /= 4;
        }
        int i14 = (i >>> 9) & 1;
        int i15 = 1152;
        if (i3 == 3) {
            i8 = i2 == 3 ? f10810j[i4 - 1] : f10811k[i4 - 1];
            i6 = (((i8 * SafetyNetStatusCodes.SAFE_BROWSING_UNSUPPORTED_THREAT_TYPES) / i12) + i14) * 4;
            i7 = 384;
        } else {
            int i16 = 144000;
            if (i2 == 3) {
                i11 = i3 == 2 ? f10812l[i4 - 1] : f10813m[i4 - 1];
                i9 = (144000 * i11) / i12;
            } else {
                i11 = f10814n[i4 - 1];
                if (i3 == 1) {
                    i15 = 576;
                }
                if (i3 == 1) {
                    i16 = 72000;
                }
                i9 = (i16 * i11) / i12;
            }
            int i17 = i15;
            i6 = i14 + i9;
            i7 = i17;
        }
        String str = f10808h[3 - i3];
        if (((i >> 6) & 3) == 3) {
            i13 = 1;
        }
        kVar.f10815a = i2;
        kVar.f10816b = str;
        kVar.f10817c = i6;
        kVar.f10818d = i12;
        kVar.f10819e = i13;
        kVar.f10820f = i8 * 1000;
        kVar.f10821g = i7;
        return true;
    }
}
