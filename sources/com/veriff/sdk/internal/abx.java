package com.veriff.sdk.internal;

final class abx {

    /* renamed from: a */
    public static abw f53603a;

    /* renamed from: b */
    public static long f53604b;

    private abx() {
    }

    /* renamed from: a */
    public static abw m50589a() {
        synchronized (abx.class) {
            abw abw = f53603a;
            if (abw == null) {
                return new abw();
            }
            f53603a = abw.f53601f;
            abw.f53601f = null;
            f53604b -= 8192;
            return abw;
        }
    }

    /* renamed from: a */
    public static void m50590a(abw abw) {
        if (abw.f53601f != null || abw.f53602g != null) {
            throw new IllegalArgumentException();
        } else if (!abw.f53599d) {
            synchronized (abx.class) {
                long j = f53604b;
                if (j + 8192 <= 65536) {
                    f53604b = j + 8192;
                    abw.f53601f = f53603a;
                    abw.f53598c = 0;
                    abw.f53597b = 0;
                    f53603a = abw;
                }
            }
        }
    }
}
