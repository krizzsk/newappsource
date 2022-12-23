package p811tc;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: tc.i */
public final class C19652i implements C19644c {

    /* renamed from: a */
    public final float f49884a;

    public C19652i(float f) {
        this.f49884a = f;
    }

    /* renamed from: a */
    public final float mo51983a(RectF rectF) {
        return rectF.height() * this.f49884a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C19652i) && this.f49884a == ((C19652i) obj).f49884a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f49884a)});
    }
}
