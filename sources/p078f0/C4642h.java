package p078f0;

import android.os.Handler;
import android.os.Looper;
import p177n1.C5807g;

/* renamed from: f0.h */
public final class C4642h {

    /* renamed from: a */
    public static volatile Handler f15872a;

    /* renamed from: a */
    public static Handler m11958a() {
        if (f15872a != null) {
            return f15872a;
        }
        synchronized (C4642h.class) {
            if (f15872a == null) {
                f15872a = C5807g.m14238a(Looper.getMainLooper());
            }
        }
        return f15872a;
    }
}
