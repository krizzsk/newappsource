package p146k6;

import android.graphics.Bitmap;
import com.bumptech.glide.C2116c;
import com.bumptech.glide.C2125f;
import p025b6.C1495h;
import p060d6.C4397l;
import p072e6.C4566d;
import p311x6.C7176l;

/* renamed from: k6.e */
public abstract class C5499e implements C1495h<Bitmap> {
    /* renamed from: b */
    public final C4397l mo5844b(C2125f fVar, C4397l lVar, int i, int i2) {
        if (C7176l.m16789i(i, i2)) {
            C4566d dVar = C2116c.m5520b(fVar).f6882c;
            Bitmap bitmap = (Bitmap) lVar.get();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap c = mo21381c(dVar, bitmap, i, i2);
            if (bitmap.equals(c)) {
                return lVar;
            }
            return C5498d.m13681c(c, dVar);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    /* renamed from: c */
    public abstract Bitmap mo21381c(C4566d dVar, Bitmap bitmap, int i, int i2);
}
