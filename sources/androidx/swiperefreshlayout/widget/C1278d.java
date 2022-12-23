package androidx.swiperefreshlayout.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import com.appboy.support.ValidationUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p068e2.C4525b;

/* renamed from: androidx.swiperefreshlayout.widget.d */
public final class C1278d extends Drawable implements Animatable {

    /* renamed from: h */
    public static final LinearInterpolator f4830h = new LinearInterpolator();

    /* renamed from: i */
    public static final C4525b f4831i = new C4525b();

    /* renamed from: j */
    public static final int[] f4832j = {-16777216};

    /* renamed from: b */
    public final C1279a f4833b;

    /* renamed from: c */
    public float f4834c;

    /* renamed from: d */
    public Resources f4835d;

    /* renamed from: e */
    public ValueAnimator f4836e;

    /* renamed from: f */
    public float f4837f;

    /* renamed from: g */
    public boolean f4838g;

    /* renamed from: androidx.swiperefreshlayout.widget.d$a */
    public static class C1279a {

        /* renamed from: a */
        public final RectF f4839a = new RectF();

        /* renamed from: b */
        public final Paint f4840b;

        /* renamed from: c */
        public final Paint f4841c;

        /* renamed from: d */
        public final Paint f4842d;

        /* renamed from: e */
        public float f4843e;

        /* renamed from: f */
        public float f4844f;

        /* renamed from: g */
        public float f4845g;

        /* renamed from: h */
        public float f4846h;

        /* renamed from: i */
        public int[] f4847i;

        /* renamed from: j */
        public int f4848j;

        /* renamed from: k */
        public float f4849k;

        /* renamed from: l */
        public float f4850l;

        /* renamed from: m */
        public float f4851m;

        /* renamed from: n */
        public boolean f4852n;

        /* renamed from: o */
        public Path f4853o;

        /* renamed from: p */
        public float f4854p;

        /* renamed from: q */
        public float f4855q;

        /* renamed from: r */
        public int f4856r;

        /* renamed from: s */
        public int f4857s;

        /* renamed from: t */
        public int f4858t;

        /* renamed from: u */
        public int f4859u;

        public C1279a() {
            Paint paint = new Paint();
            this.f4840b = paint;
            Paint paint2 = new Paint();
            this.f4841c = paint2;
            Paint paint3 = new Paint();
            this.f4842d = paint3;
            this.f4843e = BitmapDescriptorFactory.HUE_RED;
            this.f4844f = BitmapDescriptorFactory.HUE_RED;
            this.f4845g = BitmapDescriptorFactory.HUE_RED;
            this.f4846h = 5.0f;
            this.f4854p = 1.0f;
            this.f4858t = ValidationUtils.APPBOY_STRING_MAX_LENGTH;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        /* renamed from: a */
        public final void mo5349a(int i) {
            this.f4848j = i;
            this.f4859u = this.f4847i[i];
        }
    }

    public C1278d(Context context) {
        context.getClass();
        this.f4835d = context.getResources();
        C1279a aVar = new C1279a();
        this.f4833b = aVar;
        aVar.f4847i = f4832j;
        aVar.mo5349a(0);
        aVar.f4846h = 2.5f;
        aVar.f4840b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f});
        ofFloat.addUpdateListener(new C1276b(this, aVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f4830h);
        ofFloat.addListener(new C1277c(this, aVar));
        this.f4836e = ofFloat;
    }

    /* renamed from: d */
    public static void m3453d(float f, C1279a aVar) {
        if (f > 0.75f) {
            float f2 = (f - 0.75f) / 0.25f;
            int[] iArr = aVar.f4847i;
            int i = aVar.f4848j;
            int i2 = iArr[i];
            int i3 = iArr[(i + 1) % iArr.length];
            int i4 = (i2 >> 24) & ValidationUtils.APPBOY_STRING_MAX_LENGTH;
            int i5 = (i2 >> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH;
            int i6 = (i2 >> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH;
            int i7 = i2 & ValidationUtils.APPBOY_STRING_MAX_LENGTH;
            aVar.f4859u = ((i4 + ((int) (((float) (((i3 >> 24) & ValidationUtils.APPBOY_STRING_MAX_LENGTH) - i4)) * f2))) << 24) | ((i5 + ((int) (((float) (((i3 >> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH) - i5)) * f2))) << 16) | ((i6 + ((int) (((float) (((i3 >> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH) - i6)) * f2))) << 8) | (i7 + ((int) (f2 * ((float) ((i3 & ValidationUtils.APPBOY_STRING_MAX_LENGTH) - i7)))));
            return;
        }
        aVar.f4859u = aVar.f4847i[aVar.f4848j];
    }

    /* renamed from: a */
    public final void mo5338a(float f, C1279a aVar, boolean z) {
        float f2;
        float f3;
        if (this.f4838g) {
            m3453d(f, aVar);
            float floor = (float) (Math.floor((double) (aVar.f4851m / 0.8f)) + 1.0d);
            float f4 = aVar.f4849k;
            float f5 = aVar.f4850l;
            aVar.f4843e = (((f5 - 0.01f) - f4) * f) + f4;
            aVar.f4844f = f5;
            float f6 = aVar.f4851m;
            aVar.f4845g = C16759e.m42347c(floor, f6, f, f6);
        } else if (f != 1.0f || z) {
            float f7 = aVar.f4851m;
            if (f < 0.5f) {
                f2 = aVar.f4849k;
                f3 = (f4831i.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + f2;
            } else {
                float f8 = aVar.f4849k + 0.79f;
                float f9 = f8;
                f2 = f8 - (((1.0f - f4831i.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f3 = f9;
            }
            aVar.f4843e = f2;
            aVar.f4844f = f3;
            aVar.f4845g = (0.20999998f * f) + f7;
            this.f4834c = (f + this.f4837f) * 216.0f;
        }
    }

    /* renamed from: b */
    public final void mo5339b(float f, float f2, float f3, float f4) {
        C1279a aVar = this.f4833b;
        float f5 = this.f4835d.getDisplayMetrics().density;
        float f6 = f2 * f5;
        aVar.f4846h = f6;
        aVar.f4840b.setStrokeWidth(f6);
        aVar.f4855q = f * f5;
        aVar.mo5349a(0);
        aVar.f4856r = (int) (f3 * f5);
        aVar.f4857s = (int) (f4 * f5);
    }

    /* renamed from: c */
    public final void mo5340c(int i) {
        if (i == 0) {
            mo5339b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            mo5339b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f4834c, bounds.exactCenterX(), bounds.exactCenterY());
        C1279a aVar = this.f4833b;
        RectF rectF = aVar.f4839a;
        float f = aVar.f4855q;
        float f2 = (aVar.f4846h / 2.0f) + f;
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            f2 = (((float) Math.min(bounds.width(), bounds.height())) / 2.0f) - Math.max((((float) aVar.f4856r) * aVar.f4854p) / 2.0f, aVar.f4846h / 2.0f);
        }
        rectF.set(((float) bounds.centerX()) - f2, ((float) bounds.centerY()) - f2, ((float) bounds.centerX()) + f2, ((float) bounds.centerY()) + f2);
        float f3 = aVar.f4843e;
        float f4 = aVar.f4845g;
        float f5 = (f3 + f4) * 360.0f;
        float f6 = ((aVar.f4844f + f4) * 360.0f) - f5;
        aVar.f4840b.setColor(aVar.f4859u);
        aVar.f4840b.setAlpha(aVar.f4858t);
        float f7 = aVar.f4846h / 2.0f;
        rectF.inset(f7, f7);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, aVar.f4842d);
        float f8 = -f7;
        rectF.inset(f8, f8);
        canvas.drawArc(rectF, f5, f6, false, aVar.f4840b);
        if (aVar.f4852n) {
            Path path = aVar.f4853o;
            if (path == null) {
                Path path2 = new Path();
                aVar.f4853o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            aVar.f4853o.moveTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            aVar.f4853o.lineTo(((float) aVar.f4856r) * aVar.f4854p, BitmapDescriptorFactory.HUE_RED);
            Path path3 = aVar.f4853o;
            float f9 = aVar.f4854p;
            path3.lineTo((((float) aVar.f4856r) * f9) / 2.0f, ((float) aVar.f4857s) * f9);
            aVar.f4853o.offset((rectF.centerX() + (Math.min(rectF.width(), rectF.height()) / 2.0f)) - ((((float) aVar.f4856r) * aVar.f4854p) / 2.0f), (aVar.f4846h / 2.0f) + rectF.centerY());
            aVar.f4853o.close();
            aVar.f4841c.setColor(aVar.f4859u);
            aVar.f4841c.setAlpha(aVar.f4858t);
            canvas.save();
            canvas.rotate(f5 + f6, rectF.centerX(), rectF.centerY());
            canvas.drawPath(aVar.f4853o, aVar.f4841c);
            canvas.restore();
        }
        canvas.restore();
    }

    public final int getAlpha() {
        return this.f4833b.f4858t;
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isRunning() {
        return this.f4836e.isRunning();
    }

    public final void setAlpha(int i) {
        this.f4833b.f4858t = i;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f4833b.f4840b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void start() {
        this.f4836e.cancel();
        C1279a aVar = this.f4833b;
        float f = aVar.f4843e;
        aVar.f4849k = f;
        float f2 = aVar.f4844f;
        aVar.f4850l = f2;
        aVar.f4851m = aVar.f4845g;
        if (f2 != f) {
            this.f4838g = true;
            this.f4836e.setDuration(666);
            this.f4836e.start();
            return;
        }
        aVar.mo5349a(0);
        C1279a aVar2 = this.f4833b;
        aVar2.f4849k = BitmapDescriptorFactory.HUE_RED;
        aVar2.f4850l = BitmapDescriptorFactory.HUE_RED;
        aVar2.f4851m = BitmapDescriptorFactory.HUE_RED;
        aVar2.f4843e = BitmapDescriptorFactory.HUE_RED;
        aVar2.f4844f = BitmapDescriptorFactory.HUE_RED;
        aVar2.f4845g = BitmapDescriptorFactory.HUE_RED;
        this.f4836e.setDuration(1332);
        this.f4836e.start();
    }

    public final void stop() {
        this.f4836e.cancel();
        this.f4834c = BitmapDescriptorFactory.HUE_RED;
        C1279a aVar = this.f4833b;
        if (aVar.f4852n) {
            aVar.f4852n = false;
        }
        aVar.mo5349a(0);
        C1279a aVar2 = this.f4833b;
        aVar2.f4849k = BitmapDescriptorFactory.HUE_RED;
        aVar2.f4850l = BitmapDescriptorFactory.HUE_RED;
        aVar2.f4851m = BitmapDescriptorFactory.HUE_RED;
        aVar2.f4843e = BitmapDescriptorFactory.HUE_RED;
        aVar2.f4844f = BitmapDescriptorFactory.HUE_RED;
        aVar2.f4845g = BitmapDescriptorFactory.HUE_RED;
        invalidateSelf();
    }
}
