package com.veriff.sdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import com.appboy.support.ValidationUtils;
import com.veriff.sdk.internal.C21512ci;

/* renamed from: com.veriff.sdk.internal.cj */
final class C21522cj extends BitmapDrawable {

    /* renamed from: e */
    private static final Paint f54141e = new Paint();

    /* renamed from: a */
    public Drawable f54142a;

    /* renamed from: b */
    public long f54143b;

    /* renamed from: c */
    public boolean f54144c;

    /* renamed from: d */
    public int f54145d = ValidationUtils.APPBOY_STRING_MAX_LENGTH;

    /* renamed from: f */
    private final boolean f54146f;

    /* renamed from: g */
    private final float f54147g;

    /* renamed from: h */
    private final C21512ci.C21518d f54148h;

    public C21522cj(Context context, Bitmap bitmap, Drawable drawable, C21512ci.C21518d dVar, boolean z, boolean z2) {
        super(context.getResources(), bitmap);
        boolean z3;
        this.f54146f = z2;
        this.f54147g = context.getResources().getDisplayMetrics().density;
        this.f54148h = dVar;
        if (dVar == C21512ci.C21518d.MEMORY || z) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            this.f54142a = drawable;
            this.f54144c = true;
            this.f54143b = SystemClock.uptimeMillis();
        }
    }

    /* renamed from: a */
    public static void m51436a(ImageView imageView, Context context, Bitmap bitmap, C21512ci.C21518d dVar, boolean z, boolean z2) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        imageView.setImageDrawable(new C21522cj(context, bitmap, drawable, dVar, z, z2));
    }

    public void draw(Canvas canvas) {
        if (!this.f54144c) {
            super.draw(canvas);
        } else {
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.f54143b)) / 200.0f;
            if (uptimeMillis >= 1.0f) {
                this.f54144c = false;
                this.f54142a = null;
                super.draw(canvas);
            } else {
                Drawable drawable = this.f54142a;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                super.setAlpha((int) (((float) this.f54145d) * uptimeMillis));
                super.draw(canvas);
                super.setAlpha(this.f54145d);
            }
        }
        if (this.f54146f) {
            m51435a(canvas);
        }
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f54142a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    public void setAlpha(int i) {
        this.f54145d = i;
        Drawable drawable = this.f54142a;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        super.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f54142a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }

    /* renamed from: a */
    public static void m51437a(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof Animatable) {
            ((Animatable) imageView.getDrawable()).start();
        }
    }

    /* renamed from: a */
    private void m51435a(Canvas canvas) {
        Paint paint = f54141e;
        paint.setColor(-1);
        canvas.drawPath(m51434a(0, 0, (int) (this.f54147g * 16.0f)), paint);
        paint.setColor(this.f54148h.f54135d);
        canvas.drawPath(m51434a(0, 0, (int) (this.f54147g * 15.0f)), paint);
    }

    /* renamed from: a */
    private static Path m51434a(int i, int i2, int i3) {
        Path path = new Path();
        float f = (float) i;
        float f2 = (float) i2;
        path.moveTo(f, f2);
        path.lineTo((float) (i + i3), f2);
        path.lineTo(f, (float) (i2 + i3));
        return path;
    }
}
