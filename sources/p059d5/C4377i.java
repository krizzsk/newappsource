package p059d5;

import com.airbnb.lottie.C1876l;
import com.airbnb.lottie.model.layer.C1894a;
import java.util.Arrays;
import java.util.List;
import p321y4.C7314b;
import p321y4.C7315c;

/* renamed from: d5.i */
public final class C4377i implements C4370b {

    /* renamed from: a */
    public final String f15401a;

    /* renamed from: b */
    public final List<C4370b> f15402b;

    /* renamed from: c */
    public final boolean f15403c;

    public C4377i(List list, String str, boolean z) {
        this.f15401a = str;
        this.f15402b = list;
        this.f15403c = z;
    }

    /* renamed from: a */
    public final C7314b mo6606a(C1876l lVar, C1894a aVar) {
        return new C7315c(lVar, aVar, this);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("ShapeGroup{name='");
        k.append(this.f15401a);
        k.append("' Shapes: ");
        k.append(Arrays.toString(this.f15402b.toArray()));
        k.append('}');
        return k.toString();
    }
}
