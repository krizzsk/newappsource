package na0;

import com.appboy.support.ValidationUtils;

/* renamed from: na0.c */
public final class C12924c {

    /* renamed from: a */
    public final float f31998a;

    /* renamed from: b */
    public final float f31999b;

    /* renamed from: c */
    public final float f32000c;

    /* renamed from: d */
    public final float f32001d;

    /* renamed from: e */
    public final int f32002e;

    public C12924c(int i) {
        this.f32002e = i;
        this.f32001d = ((float) ((i >> 24) & ValidationUtils.APPBOY_STRING_MAX_LENGTH)) / 255.0f;
        this.f31998a = ((float) ((i >> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH)) / 255.0f;
        this.f31999b = ((float) ((i >> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH)) / 255.0f;
        this.f32000c = ((float) (i & ValidationUtils.APPBOY_STRING_MAX_LENGTH)) / 255.0f;
    }

    public final boolean equals(Object obj) {
        if (obj != null && C12924c.class == obj.getClass() && this.f32002e == ((C12924c) obj).f32002e) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Color [r=");
        k.append(this.f31998a);
        k.append(", g=");
        k.append(this.f31999b);
        k.append(", b=");
        k.append(this.f32000c);
        k.append(", a=");
        k.append(this.f32001d);
        k.append("]");
        return k.toString();
    }
}
