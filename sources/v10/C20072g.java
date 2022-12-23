package v10;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.moovit.image.model.ViewImage;
import java.io.IOException;
import p025b6.C1492e;
import p025b6.C1493f;
import p060d6.C4397l;
import p072e6.C4566d;
import p146k6.C5498d;

/* renamed from: v10.g */
public final class C20072g implements C1493f<ViewImage, Bitmap> {

    /* renamed from: a */
    public final C4566d f50920a;

    public C20072g(C4566d dVar) {
        this.f50920a = dVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo5850a(Object obj, C1492e eVar) throws IOException {
        ViewImage viewImage = (ViewImage) obj;
        return true;
    }

    /* renamed from: b */
    public final C4397l mo5851b(Object obj, int i, int i2, C1492e eVar) throws IOException {
        int i3;
        int i4;
        View view = ((ViewImage) obj).f41824f;
        if (i == Integer.MIN_VALUE) {
            i3 = View.MeasureSpec.makeMeasureSpec(0, 0);
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
        }
        if (i2 == Integer.MIN_VALUE) {
            i4 = View.MeasureSpec.makeMeasureSpec(0, 0);
        } else {
            i4 = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
        view.measure(i3, i4);
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        view.layout(0, 0, measuredWidth, measuredHeight);
        Bitmap e = this.f50920a.mo20087e(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(e));
        return C5498d.m13681c(e, this.f50920a);
    }
}
