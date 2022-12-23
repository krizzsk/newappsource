package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.a */
public final class C3035a {

    /* renamed from: a */
    public static final int[] f10375a = {1, 2, 3, 6};

    /* renamed from: b */
    public static final int[] f10376b = {48000, 44100, 32000};

    /* renamed from: c */
    public static final int[] f10377c = {24000, 22050, 16000};

    /* renamed from: d */
    public static final int[] f10378d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e */
    public static final int[] f10379e = {32, 40, 48, 56, 64, 80, 96, 112, RecyclerView.C1119a0.FLAG_IGNORE, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f */
    public static final int[] f10380f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: a */
    public static int m7585a(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = f10376b;
        if (i >= iArr.length || i2 < 0) {
            return -1;
        }
        int[] iArr2 = f10380f;
        if (i3 >= iArr2.length) {
            return -1;
        }
        int i4 = iArr[i];
        if (i4 == 44100) {
            return ((i2 % 2) + iArr2[i3]) * 2;
        }
        int i5 = f10379e[i3];
        if (i4 == 32000) {
            return i5 * 6;
        }
        return i5 * 4;
    }
}
