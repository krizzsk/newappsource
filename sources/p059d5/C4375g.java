package p059d5;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import p024b5.C1479a;

/* renamed from: d5.g */
public final class C4375g {

    /* renamed from: a */
    public final ArrayList f15392a;

    /* renamed from: b */
    public PointF f15393b;

    /* renamed from: c */
    public boolean f15394c;

    public C4375g(PointF pointF, boolean z, List<C1479a> list) {
        this.f15393b = pointF;
        this.f15394c = z;
        this.f15392a = new ArrayList(list);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("ShapeData{numCurves=");
        k.append(this.f15392a.size());
        k.append("closed=");
        return C13715c.m34247m(k, this.f15394c, '}');
    }

    public C4375g() {
        this.f15392a = new ArrayList();
    }
}
