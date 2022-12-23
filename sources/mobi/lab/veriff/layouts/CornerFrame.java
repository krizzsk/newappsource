package mobi.lab.veriff.layouts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.usebutton.sdk.internal.api.AppActionRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014B\u001b\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R*\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0016"}, mo59060d2 = {"Lmobi/lab/veriff/layouts/CornerFrame;", "Landroid/widget/RelativeLayout;", "Landroid/graphics/Canvas;", "canvas", "Lbf0/d;", "dispatchDraw", "", "value", "color", "I", "getColor", "()I", "setColor", "(I)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;I)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
public final class CornerFrame extends RelativeLayout {

    /* renamed from: a */
    private int f61830a;

    public CornerFrame(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CornerFrame(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public void dispatchDraw(Canvas canvas) {
        C24362h.m61211f(canvas, "canvas");
        canvas.drawColor(this.f61830a);
        Paint paint = new Paint();
        paint.setColor(16777215);
        paint.setAlpha(0);
        paint.setAntiAlias(true);
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.drawRoundRect(new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) canvas.getWidth(), (float) canvas.getHeight()), 32.0f, 32.0f, paint);
        super.dispatchDraw(canvas);
    }

    public final int getColor() {
        return this.f61830a;
    }

    public final void setColor(int i) {
        this.f61830a = i;
        invalidate();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CornerFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CornerFrame(Context context, int i) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        setColor(i);
        setLayerType(2, (Paint) null);
    }
}
