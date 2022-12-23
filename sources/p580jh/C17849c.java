package p580jh;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

/* renamed from: jh.c */
public final class C17849c {

    /* renamed from: c */
    public static final int[][] f45823c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};

    /* renamed from: a */
    public final ErrorCorrectionLevel f45824a;

    /* renamed from: b */
    public final byte f45825b;

    public C17849c(int i) {
        this.f45824a = ErrorCorrectionLevel.forBits((i >> 3) & 3);
        this.f45825b = (byte) (i & 7);
    }

    /* renamed from: a */
    public static C17849c m44232a(int i, int i2) {
        int bitCount;
        int[][] iArr = f45823c;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        for (int i5 = 0; i5 < 32; i5++) {
            int[] iArr2 = iArr[i5];
            int i6 = iArr2[0];
            if (i6 == i || i6 == i2) {
                return new C17849c(iArr2[1]);
            }
            int bitCount2 = Integer.bitCount(i ^ i6);
            if (bitCount2 < i3) {
                i4 = iArr2[1];
                i3 = bitCount2;
            }
            if (i != i2 && (bitCount = Integer.bitCount(i6 ^ i2)) < i3) {
                i4 = iArr2[1];
                i3 = bitCount;
            }
        }
        if (i3 <= 3) {
            return new C17849c(i4);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17849c)) {
            return false;
        }
        C17849c cVar = (C17849c) obj;
        if (this.f45824a == cVar.f45824a && this.f45825b == cVar.f45825b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f45824a.ordinal() << 3) | this.f45825b;
    }
}
