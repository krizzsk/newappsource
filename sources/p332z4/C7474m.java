package p332z4;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import p024b5.C1479a;
import p059d5.C4375g;
import p107h5.C5055c;
import p107h5.C5058f;
import p120i5.C5280a;

/* renamed from: z4.m */
public final class C7474m extends C7456a<C4375g, Path> {

    /* renamed from: i */
    public final C4375g f22911i = new C4375g();

    /* renamed from: j */
    public final Path f22912j = new Path();

    public C7474m(List<C5280a<C4375g>> list) {
        super(list);
    }

    /* renamed from: g */
    public final Object mo23718g(C5280a aVar, float f) {
        boolean z;
        C4375g gVar = (C4375g) aVar.f17432b;
        C4375g gVar2 = (C4375g) aVar.f17433c;
        C4375g gVar3 = this.f22911i;
        if (gVar3.f15393b == null) {
            gVar3.f15393b = new PointF();
        }
        if (gVar.f15394c || gVar2.f15394c) {
            z = true;
        } else {
            z = false;
        }
        gVar3.f15394c = z;
        if (gVar.f15392a.size() != gVar2.f15392a.size()) {
            StringBuilder k = C13555b.m33972k("Curves must have the same number of control points. Shape 1: ");
            k.append(gVar.f15392a.size());
            k.append("\tShape 2: ");
            k.append(gVar2.f15392a.size());
            C5055c.m12896b(k.toString());
        }
        int min = Math.min(gVar.f15392a.size(), gVar2.f15392a.size());
        if (gVar3.f15392a.size() < min) {
            for (int size = gVar3.f15392a.size(); size < min; size++) {
                gVar3.f15392a.add(new C1479a());
            }
        } else if (gVar3.f15392a.size() > min) {
            for (int size2 = gVar3.f15392a.size() - 1; size2 >= min; size2--) {
                ArrayList arrayList = gVar3.f15392a;
                arrayList.remove(arrayList.size() - 1);
            }
        }
        PointF pointF = gVar.f15393b;
        PointF pointF2 = gVar2.f15393b;
        float f2 = pointF.x;
        float f3 = pointF2.x;
        PointF pointF3 = C5058f.f17056a;
        float c = C16759e.m42347c(f3, f2, f, f2);
        float f4 = pointF.y;
        float c2 = C16759e.m42347c(pointF2.y, f4, f, f4);
        if (gVar3.f15393b == null) {
            gVar3.f15393b = new PointF();
        }
        gVar3.f15393b.set(c, c2);
        for (int size3 = gVar3.f15392a.size() - 1; size3 >= 0; size3--) {
            C1479a aVar2 = (C1479a) gVar.f15392a.get(size3);
            C1479a aVar3 = (C1479a) gVar2.f15392a.get(size3);
            PointF pointF4 = aVar2.f5371a;
            PointF pointF5 = aVar2.f5372b;
            PointF pointF6 = aVar2.f5373c;
            PointF pointF7 = aVar3.f5371a;
            PointF pointF8 = aVar3.f5372b;
            PointF pointF9 = aVar3.f5373c;
            float f5 = pointF4.x;
            float c3 = C16759e.m42347c(pointF7.x, f5, f, f5);
            float f6 = pointF4.y;
            ((C1479a) gVar3.f15392a.get(size3)).f5371a.set(c3, C16759e.m42347c(pointF7.y, f6, f, f6));
            float f7 = pointF5.x;
            float c4 = C16759e.m42347c(pointF8.x, f7, f, f7);
            float f8 = pointF5.y;
            ((C1479a) gVar3.f15392a.get(size3)).f5372b.set(c4, C16759e.m42347c(pointF8.y, f8, f, f8));
            float f9 = pointF6.x;
            float c5 = C16759e.m42347c(pointF9.x, f9, f, f9);
            float f11 = pointF6.y;
            ((C1479a) gVar3.f15392a.get(size3)).f5373c.set(c5, C16759e.m42347c(pointF9.y, f11, f, f11));
        }
        C4375g gVar4 = this.f22911i;
        Path path = this.f22912j;
        path.reset();
        PointF pointF10 = gVar4.f15393b;
        path.moveTo(pointF10.x, pointF10.y);
        C5058f.f17056a.set(pointF10.x, pointF10.y);
        for (int i = 0; i < gVar4.f15392a.size(); i++) {
            C1479a aVar4 = (C1479a) gVar4.f15392a.get(i);
            PointF pointF11 = aVar4.f5371a;
            PointF pointF12 = aVar4.f5372b;
            PointF pointF13 = aVar4.f5373c;
            PointF pointF14 = C5058f.f17056a;
            if (!pointF11.equals(pointF14) || !pointF12.equals(pointF13)) {
                path.cubicTo(pointF11.x, pointF11.y, pointF12.x, pointF12.y, pointF13.x, pointF13.y);
            } else {
                path.lineTo(pointF13.x, pointF13.y);
            }
            pointF14.set(pointF13.x, pointF13.y);
        }
        if (gVar4.f15394c) {
            path.close();
        }
        return this.f22912j;
    }
}
