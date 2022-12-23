package p059d5;

import android.graphics.Path;
import com.airbnb.lottie.C1876l;
import com.airbnb.lottie.model.layer.C1894a;
import p037c5.C1780a;
import p037c5.C1783d;
import p321y4.C7314b;
import p321y4.C7318f;

/* renamed from: d5.h */
public final class C4376h implements C4370b {

    /* renamed from: a */
    public final boolean f15395a;

    /* renamed from: b */
    public final Path.FillType f15396b;

    /* renamed from: c */
    public final String f15397c;

    /* renamed from: d */
    public final C1780a f15398d;

    /* renamed from: e */
    public final C1783d f15399e;

    /* renamed from: f */
    public final boolean f15400f;

    public C4376h(String str, boolean z, Path.FillType fillType, C1780a aVar, C1783d dVar, boolean z2) {
        this.f15397c = str;
        this.f15395a = z;
        this.f15396b = fillType;
        this.f15398d = aVar;
        this.f15399e = dVar;
        this.f15400f = z2;
    }

    /* renamed from: a */
    public final C7314b mo6606a(C1876l lVar, C1894a aVar) {
        return new C7318f(lVar, aVar, this);
    }

    public final String toString() {
        return C13715c.m34247m(C13555b.m33972k("ShapeFill{color=, fillEnabled="), this.f15395a, '}');
    }
}
