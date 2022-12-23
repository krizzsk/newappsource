package p615ks;

import android.content.Context;
import f00.C16919g;
import p874vr.C20199a;
import q00.C19047a;

/* renamed from: ks.a */
public final class C18126a {

    /* renamed from: a */
    public static final C16919g.C16928i f46340a = new C16919g.C16928i("dismissedVersionNameMajorMinor", "");

    /* renamed from: b */
    public static final String f46341b = "5.108.1.564".substring(0, "5.108.1.564".indexOf(46, 2));

    /* renamed from: a */
    public static boolean m44816a(Context context) {
        C19047a a = C19047a.m46164a(context.getApplicationContext());
        if (a == null || ((Integer) a.mo51505b(C20199a.f51272e0)).intValue() <= 564) {
            return false;
        }
        return true;
    }
}
