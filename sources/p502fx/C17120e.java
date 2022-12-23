package p502fx;

import ce0.C21100e;
import com.moovit.image.model.Image;

/* renamed from: fx.e */
public final class C17120e {

    /* renamed from: a */
    public final String f44307a;

    /* renamed from: b */
    public final Image f44308b;

    /* renamed from: c */
    public final boolean f44309c;

    public C17120e(String str, Image image, boolean z) {
        C21100e.m49373x(str, "cta");
        this.f44307a = str;
        this.f44308b = image;
        this.f44309c = z;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TodPassengerButtonSpec{cta=");
        k.append(this.f44307a);
        k.append("icon=");
        k.append(this.f44308b);
        k.append("disabled=");
        return C25541a.m63885p(k, this.f44309c, "}");
    }
}
