package p177n1;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import mf0.C24362h;

/* renamed from: n1.c */
public final class C5801c {
    /* renamed from: a */
    public static final void m14231a(Bundle bundle, String str, Size size) {
        C24362h.m61211f(bundle, "bundle");
        C24362h.m61211f(str, LinksConfiguration.KEY_KEY);
        bundle.putSize(str, size);
    }

    /* renamed from: b */
    public static final void m14232b(Bundle bundle, String str, SizeF sizeF) {
        C24362h.m61211f(bundle, "bundle");
        C24362h.m61211f(str, LinksConfiguration.KEY_KEY);
        bundle.putSizeF(str, sizeF);
    }
}
