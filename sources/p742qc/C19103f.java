package p742qc;

import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import ce0.C21100e;

/* renamed from: qc.f */
public final class C19103f {
    /* renamed from: a */
    public static Typeface m46263a(Configuration configuration, Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT < 31 || (i = configuration.fontWeightAdjustment) == Integer.MAX_VALUE || i == 0) {
            return null;
        }
        return Typeface.create(typeface, C21100e.m49377z(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }
}
