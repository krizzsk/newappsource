package p811tc;

import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* renamed from: tc.b */
public final class C19643b implements C19644c {

    /* renamed from: a */
    public final C19644c f49832a;

    /* renamed from: b */
    public final float f49833b;

    public C19643b(float f, C19644c cVar) {
        while (cVar instanceof C19643b) {
            cVar = ((C19643b) cVar).f49832a;
            f += ((C19643b) cVar).f49833b;
        }
        this.f49832a = cVar;
        this.f49833b = f;
    }

    /* renamed from: a */
    public final float mo51983a(RectF rectF) {
        return Math.max(BitmapDescriptorFactory.HUE_RED, this.f49832a.mo51983a(rectF) + this.f49833b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19643b)) {
            return false;
        }
        C19643b bVar = (C19643b) obj;
        if (!this.f49832a.equals(bVar.f49832a) || this.f49833b != bVar.f49833b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49832a, Float.valueOf(this.f49833b)});
    }
}
