package p811tc;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: tc.a */
public final class C19642a implements C19644c {

    /* renamed from: a */
    public final float f49831a;

    public C19642a(float f) {
        this.f49831a = f;
    }

    /* renamed from: a */
    public final float mo51983a(RectF rectF) {
        return this.f49831a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C19642a) && this.f49831a == ((C19642a) obj).f49831a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f49831a)});
    }
}
