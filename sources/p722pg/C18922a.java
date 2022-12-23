package p722pg;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import p745qg.C19119a;

/* renamed from: pg.a */
public final class C18922a {

    /* renamed from: a */
    public final C19119a f48163a;

    @KeepForSdk
    public C18922a(C19119a aVar, Matrix matrix) {
        this.f48163a = (C19119a) Preconditions.checkNotNull(aVar);
        Rect a = aVar.mo51553a();
        if (!(a == null || matrix == null)) {
            RectF rectF = new RectF(a);
            matrix.mapRect(rectF);
            a.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        }
        Point[] d = aVar.mo51556d();
        if (d != null && matrix != null) {
            int length = d.length;
            float[] fArr = new float[(length + length)];
            for (int i = 0; i < d.length; i++) {
                int i2 = i + i;
                Point point = d[i];
                fArr[i2] = (float) point.x;
                fArr[i2 + 1] = (float) point.y;
            }
            matrix.mapPoints(fArr);
            for (int i3 = 0; i3 < d.length; i3++) {
                int i4 = i3 + i3;
                d[i3].set((int) fArr[i4], (int) fArr[i4 + 1]);
            }
        }
    }
}
