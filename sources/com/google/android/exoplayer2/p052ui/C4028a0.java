package com.google.android.exoplayer2.p052ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.google.android.exoplayer2.ui.a0 */
public final class C4028a0 {

    /* renamed from: A */
    public int f14451A;

    /* renamed from: B */
    public int f14452B;

    /* renamed from: C */
    public int f14453C;

    /* renamed from: D */
    public int f14454D;

    /* renamed from: E */
    public StaticLayout f14455E;

    /* renamed from: F */
    public StaticLayout f14456F;

    /* renamed from: G */
    public int f14457G;

    /* renamed from: H */
    public int f14458H;

    /* renamed from: I */
    public int f14459I;

    /* renamed from: J */
    public Rect f14460J;

    /* renamed from: a */
    public final float f14461a;

    /* renamed from: b */
    public final float f14462b;

    /* renamed from: c */
    public final float f14463c;

    /* renamed from: d */
    public final float f14464d;

    /* renamed from: e */
    public final float f14465e;

    /* renamed from: f */
    public final TextPaint f14466f;

    /* renamed from: g */
    public final Paint f14467g;

    /* renamed from: h */
    public final Paint f14468h;

    /* renamed from: i */
    public CharSequence f14469i;

    /* renamed from: j */
    public Layout.Alignment f14470j;

    /* renamed from: k */
    public Bitmap f14471k;

    /* renamed from: l */
    public float f14472l;

    /* renamed from: m */
    public int f14473m;

    /* renamed from: n */
    public int f14474n;

    /* renamed from: o */
    public float f14475o;

    /* renamed from: p */
    public int f14476p;

    /* renamed from: q */
    public float f14477q;

    /* renamed from: r */
    public float f14478r;

    /* renamed from: s */
    public int f14479s;

    /* renamed from: t */
    public int f14480t;

    /* renamed from: u */
    public int f14481u;

    /* renamed from: v */
    public int f14482v;

    /* renamed from: w */
    public int f14483w;

    /* renamed from: x */
    public float f14484x;

    /* renamed from: y */
    public float f14485y;

    /* renamed from: z */
    public float f14486z;

    public C4028a0(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{16843287, 16843288}, 0, 0);
        this.f14465e = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f14464d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = (float) Math.round((((float) context.getResources().getDisplayMetrics().densityDpi) * 2.0f) / 160.0f);
        this.f14461a = round;
        this.f14462b = round;
        this.f14463c = round;
        TextPaint textPaint = new TextPaint();
        this.f14466f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f14467g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f14468h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    /* renamed from: a */
    public final void mo16659a(Canvas canvas, boolean z) {
        int i;
        if (z) {
            StaticLayout staticLayout = this.f14455E;
            StaticLayout staticLayout2 = this.f14456F;
            if (staticLayout != null && staticLayout2 != null) {
                int save = canvas.save();
                canvas.translate((float) this.f14457G, (float) this.f14458H);
                if (Color.alpha(this.f14481u) > 0) {
                    this.f14467g.setColor(this.f14481u);
                    canvas.drawRect((float) (-this.f14459I), BitmapDescriptorFactory.HUE_RED, (float) (staticLayout.getWidth() + this.f14459I), (float) staticLayout.getHeight(), this.f14467g);
                }
                int i2 = this.f14483w;
                boolean z2 = true;
                if (i2 == 1) {
                    this.f14466f.setStrokeJoin(Paint.Join.ROUND);
                    this.f14466f.setStrokeWidth(this.f14461a);
                    this.f14466f.setColor(this.f14482v);
                    this.f14466f.setStyle(Paint.Style.FILL_AND_STROKE);
                    staticLayout2.draw(canvas);
                } else if (i2 == 2) {
                    TextPaint textPaint = this.f14466f;
                    float f = this.f14462b;
                    float f2 = this.f14463c;
                    textPaint.setShadowLayer(f, f2, f2, this.f14482v);
                } else if (i2 == 3 || i2 == 4) {
                    if (i2 != 3) {
                        z2 = false;
                    }
                    int i3 = -1;
                    if (z2) {
                        i = -1;
                    } else {
                        i = this.f14482v;
                    }
                    if (z2) {
                        i3 = this.f14482v;
                    }
                    float f3 = this.f14462b / 2.0f;
                    this.f14466f.setColor(this.f14479s);
                    this.f14466f.setStyle(Paint.Style.FILL);
                    float f4 = -f3;
                    this.f14466f.setShadowLayer(this.f14462b, f4, f4, i);
                    staticLayout2.draw(canvas);
                    this.f14466f.setShadowLayer(this.f14462b, f3, f3, i3);
                }
                this.f14466f.setColor(this.f14479s);
                this.f14466f.setStyle(Paint.Style.FILL);
                staticLayout.draw(canvas);
                this.f14466f.setShadowLayer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
                canvas.restoreToCount(save);
                return;
            }
            return;
        }
        this.f14460J.getClass();
        this.f14471k.getClass();
        canvas.drawBitmap(this.f14471k, (Rect) null, this.f14460J, this.f14468h);
    }
}
