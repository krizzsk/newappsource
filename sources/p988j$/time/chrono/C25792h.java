package p988j$.time.chrono;

import java.io.Serializable;

/* renamed from: j$.time.chrono.h */
public final class C25792h extends C25785a implements Serializable {

    /* renamed from: a */
    public static final C25792h f64330a = new C25792h();

    private C25792h() {
    }

    /* renamed from: a */
    public static boolean m64418a(long j) {
        return (3 & j) == 0 && (j % 100 != 0 || j % 400 == 0);
    }
}
