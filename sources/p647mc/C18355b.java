package p647mc;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p129j1.C5348a;
import p811tc.C19648g;
import p811tc.C19654k;
import p811tc.C19656l;

/* renamed from: mc.b */
public final class C18355b extends Drawable {

    /* renamed from: a */
    public final C19656l f46791a = C19656l.C19657a.f49923a;

    /* renamed from: b */
    public final Paint f46792b;

    /* renamed from: c */
    public final Path f46793c = new Path();

    /* renamed from: d */
    public final Rect f46794d = new Rect();

    /* renamed from: e */
    public final RectF f46795e = new RectF();

    /* renamed from: f */
    public final RectF f46796f = new RectF();

    /* renamed from: g */
    public final C18356a f46797g = new C18356a();

    /* renamed from: h */
    public float f46798h;

    /* renamed from: i */
    public int f46799i;

    /* renamed from: j */
    public int f46800j;

    /* renamed from: k */
    public int f46801k;

    /* renamed from: l */
    public int f46802l;

    /* renamed from: m */
    public int f46803m;

    /* renamed from: n */
    public boolean f46804n = true;

    /* renamed from: o */
    public C19654k f46805o;

    /* renamed from: p */
    public ColorStateList f46806p;

    /* renamed from: mc.b$a */
    public class C18356a extends Drawable.ConstantState {
        public C18356a() {
        }

        public final int getChangingConfigurations() {
            return 0;
        }

        public final Drawable newDrawable() {
            return C18355b.this;
        }
    }

    public C18355b(C19654k kVar) {
        this.f46805o = kVar;
        Paint paint = new Paint(1);
        this.f46792b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: a */
    public final RectF mo50807a() {
        this.f46796f.set(getBounds());
        return this.f46796f;
    }

    public final void draw(Canvas canvas) {
        if (this.f46804n) {
            Paint paint = this.f46792b;
            Rect rect = this.f46794d;
            copyBounds(rect);
            float height = this.f46798h / ((float) rect.height());
            paint.setShader(new LinearGradient(BitmapDescriptorFactory.HUE_RED, (float) rect.top, BitmapDescriptorFactory.HUE_RED, (float) rect.bottom, new int[]{C5348a.m13413i(this.f46799i, this.f46803m), C5348a.m13413i(this.f46800j, this.f46803m), C5348a.m13413i(C5348a.m13417m(this.f46800j, 0), this.f46803m), C5348a.m13413i(C5348a.m13417m(this.f46802l, 0), this.f46803m), C5348a.m13413i(this.f46802l, this.f46803m), C5348a.m13413i(this.f46801k, this.f46803m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.f46804n = false;
        }
        float strokeWidth = this.f46792b.getStrokeWidth() / 2.0f;
        copyBounds(this.f46794d);
        this.f46795e.set(this.f46794d);
        float min = Math.min(this.f46805o.f49891e.mo51983a(mo50807a()), this.f46795e.width() / 2.0f);
        if (this.f46805o.mo52020f(mo50807a())) {
            this.f46795e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f46795e, min, min, this.f46792b);
        }
    }

    public final Drawable.ConstantState getConstantState() {
        return this.f46797g;
    }

    public final int getOpacity() {
        return this.f46798h > BitmapDescriptorFactory.HUE_RED ? -3 : -2;
    }

    @TargetApi(21)
    public final void getOutline(Outline outline) {
        if (this.f46805o.mo52020f(mo50807a())) {
            outline.setRoundRect(getBounds(), this.f46805o.f49891e.mo51983a(mo50807a()));
            return;
        }
        copyBounds(this.f46794d);
        this.f46795e.set(this.f46794d);
        this.f46791a.mo52028a(this.f46805o, 1.0f, this.f46795e, (C19648g.C19649a) null, this.f46793c);
        if (this.f46793c.isConvex()) {
            outline.setConvexPath(this.f46793c);
        }
    }

    public final boolean getPadding(Rect rect) {
        if (!this.f46805o.mo52020f(mo50807a())) {
            return true;
        }
        int round = Math.round(this.f46798h);
        rect.set(round, round, round, round);
        return true;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList = this.f46806p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    public final void onBoundsChange(Rect rect) {
        this.f46804n = true;
    }

    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f46806p;
        if (!(colorStateList == null || (colorForState = colorStateList.getColorForState(iArr, this.f46803m)) == this.f46803m)) {
            this.f46804n = true;
            this.f46803m = colorForState;
        }
        if (this.f46804n) {
            invalidateSelf();
        }
        return this.f46804n;
    }

    public final void setAlpha(int i) {
        this.f46792b.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f46792b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
