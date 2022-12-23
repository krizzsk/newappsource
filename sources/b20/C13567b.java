package b20;

import android.graphics.Bitmap;
import android.graphics.PointF;
import com.bumptech.glide.C2116c;
import com.bumptech.glide.C2125f;
import p025b6.C1495h;
import p060d6.C4397l;
import p072e6.C4566d;
import p146k6.C5498d;
import p977zz.C20975x0;
import v10.C20065a;
import v10.C20067c;

/* renamed from: b20.b */
public abstract class C13567b implements C1495h<C20065a> {
    /* renamed from: b */
    public final C4397l mo5844b(C2125f fVar, C4397l lVar, int i, int i2) {
        PointF pointF;
        C4566d dVar = C2116c.m5520b(fVar).f6882c;
        C20065a aVar = (C20065a) lVar.get();
        Bitmap bitmap = aVar.f50909a;
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap c = ((C13566a) this).f33515b.mo21381c(dVar, bitmap, i, i2);
        PointF pointF2 = aVar.f50910b;
        if (pointF2 != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int width2 = c.getWidth();
            int height2 = c.getHeight();
            float f = ((float) width) * pointF2.x;
            pointF = new PointF(f / ((float) width2), ((((float) height) * pointF2.y) + ((float) (height2 - height))) / ((float) height2));
        } else {
            pointF = null;
        }
        if (!bitmap.equals(c) || !C20975x0.m49118e(pointF2, pointF)) {
            return C20067c.m47570c(C5498d.m13681c(c, dVar), pointF);
        }
        return lVar;
    }
}
