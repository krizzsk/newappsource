package p059d5;

import com.airbnb.lottie.C1876l;
import com.airbnb.lottie.model.layer.C1894a;
import p037c5.C1787h;
import p321y4.C7314b;
import p321y4.C7330p;

/* renamed from: d5.j */
public final class C4378j implements C4370b {

    /* renamed from: a */
    public final String f15404a;

    /* renamed from: b */
    public final int f15405b;

    /* renamed from: c */
    public final C1787h f15406c;

    /* renamed from: d */
    public final boolean f15407d;

    public C4378j(String str, int i, C1787h hVar, boolean z) {
        this.f15404a = str;
        this.f15405b = i;
        this.f15406c = hVar;
        this.f15407d = z;
    }

    /* renamed from: a */
    public final C7314b mo6606a(C1876l lVar, C1894a aVar) {
        return new C7330p(lVar, aVar, this);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("ShapePath{name=");
        k.append(this.f15404a);
        k.append(", index=");
        return C16530d.m42014g(k, this.f15405b, '}');
    }
}
