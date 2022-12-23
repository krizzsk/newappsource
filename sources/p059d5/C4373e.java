package p059d5;

import android.graphics.PointF;
import com.airbnb.lottie.C1876l;
import com.airbnb.lottie.model.layer.C1894a;
import p037c5.C1781b;
import p037c5.C1785f;
import p037c5.C1792m;
import p321y4.C7314b;
import p321y4.C7328n;

/* renamed from: d5.e */
public final class C4373e implements C4370b {

    /* renamed from: a */
    public final String f15382a;

    /* renamed from: b */
    public final C1792m<PointF, PointF> f15383b;

    /* renamed from: c */
    public final C1792m<PointF, PointF> f15384c;

    /* renamed from: d */
    public final C1781b f15385d;

    /* renamed from: e */
    public final boolean f15386e;

    public C4373e(String str, C1792m mVar, C1785f fVar, C1781b bVar, boolean z) {
        this.f15382a = str;
        this.f15383b = mVar;
        this.f15384c = fVar;
        this.f15385d = bVar;
        this.f15386e = z;
    }

    /* renamed from: a */
    public final C7314b mo6606a(C1876l lVar, C1894a aVar) {
        return new C7328n(lVar, aVar, this);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("RectangleShape{position=");
        k.append(this.f15383b);
        k.append(", size=");
        k.append(this.f15384c);
        k.append('}');
        return k.toString();
    }
}
