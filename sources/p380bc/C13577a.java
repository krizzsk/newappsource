package p380bc;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p068e2.C4524a;
import p068e2.C4525b;
import p068e2.C4526c;

/* renamed from: bc.a */
public final class C13577a {

    /* renamed from: a */
    public static final LinearInterpolator f33537a = new LinearInterpolator();

    /* renamed from: b */
    public static final C4525b f33538b = new C4525b();

    /* renamed from: c */
    public static final C4524a f33539c = new C4524a();

    /* renamed from: d */
    public static final C4526c f33540d = new C4526c();

    /* renamed from: e */
    public static final DecelerateInterpolator f33541e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m33993a(float f, float f2, float f3, float f4, float f5) {
        return f5 < f3 ? f : f5 > f4 ? f2 : C16759e.m42347c(f2, f, (f5 - f3) / (f4 - f3), f);
    }

    /* renamed from: b */
    public static int m33994b(float f, int i, int i2) {
        return Math.round(f * ((float) (i2 - i))) + i;
    }
}
