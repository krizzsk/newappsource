package com.veriff;

import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import java.io.IOException;

public final class VeriffBranding {

    /* renamed from: a */
    public final Integer f30927a;

    /* renamed from: b */
    public final Integer f30928b;

    /* renamed from: c */
    public final Integer f30929c;

    /* renamed from: d */
    public final Integer f30930d;

    /* renamed from: e */
    public final Integer f30931e;

    /* renamed from: f */
    public final Integer f30932f;

    /* renamed from: g */
    public final Float f30933g;

    public interface DrawableProvider extends Parcelable {
        /* renamed from: x0 */
        Drawable mo38185x0() throws IOException;
    }

    public VeriffBranding(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Float f, Integer num6) {
        this.f30927a = num;
        this.f30928b = num2;
        this.f30929c = num3;
        this.f30930d = num4;
        this.f30931e = num5;
        this.f30932f = num6;
        this.f30933g = f;
    }
}
