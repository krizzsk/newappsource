package p474et;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.collections.EmptyList;
import mf0.C24362h;

/* renamed from: et.f */
public final class C16874f {

    /* renamed from: a */
    public final String f43885a;

    /* renamed from: b */
    public final boolean f43886b;

    /* renamed from: c */
    public final float f43887c;

    /* renamed from: d */
    public final List<C16872d> f43888d;

    /* renamed from: e */
    public final boolean f43889e;

    /* renamed from: f */
    public final String f43890f;

    public C16874f(String str, boolean z, float f, List<? extends C16872d> list) {
        C24362h.m61211f(str, "source");
        C24362h.m61211f(list, "cards");
        this.f43885a = str;
        this.f43886b = z;
        this.f43887c = f;
        this.f43888d = list;
        boolean z2 = true;
        this.f43889e = !list.isEmpty();
        this.f43890f = !C24362h.m61206a(str, "suggestion_favorite_station") ? C24362h.m61206a(str, "suggestion_nearby_station") : z2 ? "suggestions_data_type_station" : "suggestions_data_type_route";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16874f)) {
            return false;
        }
        C16874f fVar = (C16874f) obj;
        return C24362h.m61206a(this.f43885a, fVar.f43885a) && this.f43886b == fVar.f43886b && Float.compare(this.f43887c, fVar.f43887c) == 0 && C24362h.m61206a(this.f43888d, fVar.f43888d);
    }

    public final int hashCode() {
        int hashCode = this.f43885a.hashCode() * 31;
        boolean z = this.f43886b;
        if (z) {
            z = true;
        }
        int floatToIntBits = Float.floatToIntBits(this.f43887c);
        return this.f43888d.hashCode() + ((floatToIntBits + ((hashCode + (z ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("SuggestionCardsProviderResult(source=");
        k.append(this.f43885a);
        k.append(", isEmpty=");
        k.append(this.f43886b);
        k.append(", distance=");
        k.append(this.f43887c);
        k.append(", cards=");
        return C13555b.m33970i(k, this.f43888d, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C16874f(String str, boolean z, float f, int i) {
        this(str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? BitmapDescriptorFactory.HUE_RED : f, (List<? extends C16872d>) (i & 8) != 0 ? EmptyList.f60173b : null);
    }
}
