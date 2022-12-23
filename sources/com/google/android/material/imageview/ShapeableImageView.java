package com.google.android.material.imageview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p090g1.C4732a;
import p355ac.C13410k;
import p811tc.C19648g;
import p811tc.C19654k;
import p811tc.C19656l;
import p811tc.C19666o;

public class ShapeableImageView extends AppCompatImageView implements C19666o {

    /* renamed from: t */
    public static final int f34904t = C13410k.Widget_MaterialComponents_ShapeableImageView;

    /* renamed from: b */
    public final C19656l f34905b;

    /* renamed from: c */
    public final RectF f34906c;

    /* renamed from: d */
    public final RectF f34907d;

    /* renamed from: e */
    public final Paint f34908e;

    /* renamed from: f */
    public final Paint f34909f;

    /* renamed from: g */
    public final Path f34910g;

    /* renamed from: h */
    public ColorStateList f34911h;

    /* renamed from: i */
    public C19648g f34912i;

    /* renamed from: j */
    public C19654k f34913j;

    /* renamed from: k */
    public float f34914k;

    /* renamed from: l */
    public Path f34915l;

    /* renamed from: m */
    public int f34916m;

    /* renamed from: n */
    public int f34917n;

    /* renamed from: o */
    public int f34918o;

    /* renamed from: p */
    public int f34919p;

    /* renamed from: q */
    public int f34920q;

    /* renamed from: r */
    public int f34921r;

    /* renamed from: s */
    public boolean f34922s;

    @TargetApi(21)
    /* renamed from: com.google.android.material.imageview.ShapeableImageView$a */
    public class C14036a extends ViewOutlineProvider {

        /* renamed from: a */
        public final Rect f34923a = new Rect();

        public C14036a() {
        }

        public final void getOutline(View view, Outline outline) {
            ShapeableImageView shapeableImageView = ShapeableImageView.this;
            if (shapeableImageView.f34913j != null) {
                if (shapeableImageView.f34912i == null) {
                    shapeableImageView.f34912i = new C19648g(ShapeableImageView.this.f34913j);
                }
                ShapeableImageView.this.f34906c.round(this.f34923a);
                ShapeableImageView.this.f34912i.setBounds(this.f34923a);
                ShapeableImageView.this.f34912i.getOutline(outline);
            }
        }
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: c */
    public final boolean mo41755c() {
        return getLayoutDirection() == 1;
    }

    /* renamed from: d */
    public final void mo41756d(int i, int i2) {
        this.f34906c.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) (i - getPaddingRight()), (float) (i2 - getPaddingBottom()));
        this.f34905b.mo52028a(this.f34913j, 1.0f, this.f34906c, (C19648g.C19649a) null, this.f34910g);
        this.f34915l.rewind();
        this.f34915l.addPath(this.f34910g);
        this.f34907d.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) i, (float) i2);
        this.f34915l.addRect(this.f34907d, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.f34919p;
    }

    public final int getContentPaddingEnd() {
        int i = this.f34921r;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        if (mo41755c()) {
            return this.f34916m;
        }
        return this.f34918o;
    }

    public int getContentPaddingLeft() {
        boolean z;
        int i;
        int i2;
        if (this.f34920q == Integer.MIN_VALUE && this.f34921r == Integer.MIN_VALUE) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (mo41755c() && (i2 = this.f34921r) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!mo41755c() && (i = this.f34920q) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.f34916m;
    }

    public int getContentPaddingRight() {
        boolean z;
        int i;
        int i2;
        if (this.f34920q == Integer.MIN_VALUE && this.f34921r == Integer.MIN_VALUE) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (mo41755c() && (i2 = this.f34920q) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!mo41755c() && (i = this.f34921r) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.f34918o;
    }

    public final int getContentPaddingStart() {
        int i = this.f34920q;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        if (mo41755c()) {
            return this.f34918o;
        }
        return this.f34916m;
    }

    public int getContentPaddingTop() {
        return this.f34917n;
    }

    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public C19654k getShapeAppearanceModel() {
        return this.f34913j;
    }

    public ColorStateList getStrokeColor() {
        return this.f34911h;
    }

    public float getStrokeWidth() {
        return this.f34914k;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setLayerType(2, (Paint) null);
    }

    public final void onDetachedFromWindow() {
        setLayerType(0, (Paint) null);
        super.onDetachedFromWindow();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f34915l, this.f34909f);
        if (this.f34911h != null) {
            this.f34908e.setStrokeWidth(this.f34914k);
            int colorForState = this.f34911h.getColorForState(getDrawableState(), this.f34911h.getDefaultColor());
            if (this.f34914k > BitmapDescriptorFactory.HUE_RED && colorForState != 0) {
                this.f34908e.setColor(colorForState);
                canvas.drawPath(this.f34910g, this.f34908e);
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.f34922s && isLayoutDirectionResolved()) {
            boolean z = true;
            this.f34922s = true;
            if (!isPaddingRelative()) {
                if (this.f34920q == Integer.MIN_VALUE && this.f34921r == Integer.MIN_VALUE) {
                    z = false;
                }
                if (!z) {
                    setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
                    return;
                }
            }
            setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mo41756d(i, i2);
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(getContentPaddingLeft() + i, getContentPaddingTop() + i2, getContentPaddingRight() + i3, getContentPaddingBottom() + i4);
    }

    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(getContentPaddingStart() + i, getContentPaddingTop() + i2, getContentPaddingEnd() + i3, getContentPaddingBottom() + i4);
    }

    public void setShapeAppearanceModel(C19654k kVar) {
        this.f34913j = kVar;
        C19648g gVar = this.f34912i;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        mo41756d(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f34911h = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i) {
        setStrokeColor(C4732a.getColorStateList(getContext(), i));
    }

    public void setStrokeWidth(float f) {
        if (this.f34914k != f) {
            this.f34914k = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i) {
        setStrokeWidth((float) getResources().getDimensionPixelSize(i));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ShapeableImageView(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r0 = f34904t
            android.content.Context r7 = p883wc.C20289a.m47861a(r7, r8, r9, r0)
            r6.<init>(r7, r8, r9)
            tc.l r7 = p811tc.C19656l.C19657a.f49923a
            r6.f34905b = r7
            android.graphics.Path r7 = new android.graphics.Path
            r7.<init>()
            r6.f34910g = r7
            r7 = 0
            r6.f34922s = r7
            android.content.Context r1 = r6.getContext()
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r6.f34909f = r2
            r3 = 1
            r2.setAntiAlias(r3)
            r4 = -1
            r2.setColor(r4)
            android.graphics.PorterDuffXfermode r4 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.DST_OUT
            r4.<init>(r5)
            r2.setXfermode(r4)
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.f34906c = r2
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.f34907d = r2
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r6.f34915l = r2
            int[] r2 = p355ac.C13411l.ShapeableImageView
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r8, r2, r9, r0)
            int r4 = p355ac.C13411l.ShapeableImageView_strokeColor
            android.content.res.ColorStateList r4 = p742qc.C19099c.m46247a(r1, r2, r4)
            r6.f34911h = r4
            int r4 = p355ac.C13411l.ShapeableImageView_strokeWidth
            int r4 = r2.getDimensionPixelSize(r4, r7)
            float r4 = (float) r4
            r6.f34914k = r4
            int r4 = p355ac.C13411l.ShapeableImageView_contentPadding
            int r7 = r2.getDimensionPixelSize(r4, r7)
            r6.f34916m = r7
            r6.f34917n = r7
            r6.f34918o = r7
            r6.f34919p = r7
            int r4 = p355ac.C13411l.ShapeableImageView_contentPaddingLeft
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f34916m = r4
            int r4 = p355ac.C13411l.ShapeableImageView_contentPaddingTop
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f34917n = r4
            int r4 = p355ac.C13411l.ShapeableImageView_contentPaddingRight
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f34918o = r4
            int r4 = p355ac.C13411l.ShapeableImageView_contentPaddingBottom
            int r7 = r2.getDimensionPixelSize(r4, r7)
            r6.f34919p = r7
            int r7 = p355ac.C13411l.ShapeableImageView_contentPaddingStart
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = r2.getDimensionPixelSize(r7, r4)
            r6.f34920q = r7
            int r7 = p355ac.C13411l.ShapeableImageView_contentPaddingEnd
            int r7 = r2.getDimensionPixelSize(r7, r4)
            r6.f34921r = r7
            r2.recycle()
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>()
            r6.f34908e = r7
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r7.setStyle(r2)
            r7.setAntiAlias(r3)
            tc.k$a r7 = p811tc.C19654k.m47124c(r1, r8, r9, r0)
            tc.k r7 = r7.mo52022a()
            r6.f34913j = r7
            com.google.android.material.imageview.ShapeableImageView$a r7 = new com.google.android.material.imageview.ShapeableImageView$a
            r7.<init>()
            r6.setOutlineProvider(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.imageview.ShapeableImageView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
