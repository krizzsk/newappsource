package p434dd;

import android.os.Build;
import mf0.C24368m;
import p221q6.C6181b;
import p258t4.C6587a;
import p370ar.C13506a;
import p389bl.C13637c;
import p584jl.C17886b;
import p626lf.C18201b;

/* renamed from: dd.r */
public final class C16575r {
    /* renamed from: a */
    public static C16571p m42079a() {
        switch (Build.VERSION.SDK_INT) {
            case 21:
                return new C24368m();
            case 22:
                return new C13506a(2);
            case 23:
                return new C13637c();
            case 24:
                return new C17886b();
            case 25:
                return new C6587a();
            case 26:
                return new C18201b();
            case 27:
                if (Build.VERSION.PREVIEW_SDK_INT == 0) {
                    return new C6181b();
                }
                break;
        }
        return new C13506a(3);
    }
}
