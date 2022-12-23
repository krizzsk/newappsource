package p815tg;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* renamed from: tg.b */
public final class C19672b {
    @KeepForSdk
    /* renamed from: a */
    public static int m47158a(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 90) {
            return 1;
        }
        if (i == 180) {
            return 2;
        }
        if (i == 270) {
            return 3;
        }
        throw new IllegalArgumentException(C13715c.m34241g(29, "Invalid rotation: ", i));
    }
}
