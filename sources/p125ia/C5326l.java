package p125ia;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: ia.l */
public final class C5326l {

    /* renamed from: a */
    public final int f17546a = 0;

    /* renamed from: b */
    public final float f17547b = BitmapDescriptorFactory.HUE_RED;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5326l.class != obj.getClass()) {
            return false;
        }
        C5326l lVar = (C5326l) obj;
        if (this.f17546a == lVar.f17546a && Float.compare(lVar.f17547b, this.f17547b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f17547b) + ((527 + this.f17546a) * 31);
    }
}
