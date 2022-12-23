package p107h5;

import android.graphics.PointF;
import java.util.ArrayList;
import p024b5.C1482d;
import p321y4.C7322j;

/* renamed from: h5.f */
public final class C5058f {

    /* renamed from: a */
    public static final PointF f17056a = new PointF();

    /* renamed from: a */
    public static PointF m12904a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* renamed from: b */
    public static float m12905b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    /* renamed from: c */
    public static int m12906c(float f, float f2) {
        boolean z;
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        if ((i ^ i2) >= 0) {
            z = true;
        } else {
            z = false;
        }
        int i4 = i % i2;
        if (!z && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    /* renamed from: d */
    public static void m12907d(C1482d dVar, int i, ArrayList arrayList, C1482d dVar2, C7322j jVar) {
        if (dVar.mo5834a(i, jVar.getName())) {
            String name = jVar.getName();
            dVar2.getClass();
            C1482d dVar3 = new C1482d(dVar2);
            dVar3.f5382a.add(name);
            C1482d dVar4 = new C1482d(dVar3);
            dVar4.f5383b = jVar;
            arrayList.add(dVar4);
        }
    }
}
