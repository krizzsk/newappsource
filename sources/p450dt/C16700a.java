package p450dt;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.moovit.commons.utils.UiUtils;
import com.tranzmate.R;
import p139k.C5442d;
import p977zz.C20941h;

/* renamed from: dt.a */
public final class C16700a extends C5442d {

    /* renamed from: n */
    public final float f43490n;

    /* renamed from: o */
    public final Paint f43491o;

    /* renamed from: p */
    public boolean f43492p;

    public C16700a(Context context, boolean z) {
        super(context);
        this.f43490n = UiUtils.m40247f(context.getResources(), 4.0f);
        Paint paint = new Paint(1);
        this.f43491o = paint;
        paint.setColor(C20941h.m49043f(R.attr.colorCritical, context));
        paint.setStyle(Paint.Style.FILL);
        this.f43492p = z;
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f43492p) {
            float f = this.f43490n;
            canvas.drawCircle(((float) this.f17956h) - f, f, f, this.f43491o);
        }
    }
}
