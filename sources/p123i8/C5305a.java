package p123i8;

import com.facebook.appevents.p047ml.ModelManager;
import mf0.C24362h;
import p262t8.C6606a;

/* renamed from: i8.a */
public final class C5305a {

    /* renamed from: a */
    public static final C5305a f17485a = new C5305a();

    /* renamed from: b */
    public static boolean f17486b;

    /* renamed from: c */
    public static boolean f17487c;

    /* renamed from: a */
    public final boolean mo21090a(String str) {
        String str2;
        if (C6606a.m15601b(this)) {
            return false;
        }
        try {
            str2 = null;
            if (!C6606a.m15601b(this)) {
                float[] fArr = new float[30];
                for (int i = 0; i < 30; i++) {
                    fArr[i] = 0.0f;
                }
                ModelManager modelManager = ModelManager.f8546a;
                String[] f = ModelManager.m6227f(ModelManager.Task.MTML_INTEGRITY_DETECT, new float[][]{fArr}, new String[]{str});
                if (f != null) {
                    String str3 = f[0];
                    if (str3 != null) {
                        str2 = str3;
                    }
                }
                str2 = "none";
            }
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return false;
        }
        return !C24362h.m61206a("none", str2);
    }
}
