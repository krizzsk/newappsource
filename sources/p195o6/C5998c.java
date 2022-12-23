package p195o6;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import p195o6.C6002f;
import p584jl.C17885a;

/* renamed from: o6.c */
public final class C5998c extends Drawable implements C6002f.C6004b, Animatable {

    /* renamed from: b */
    public final C5999a f19162b;

    /* renamed from: c */
    public boolean f19163c;

    /* renamed from: d */
    public boolean f19164d;

    /* renamed from: e */
    public boolean f19165e;

    /* renamed from: f */
    public boolean f19166f;

    /* renamed from: g */
    public int f19167g;

    /* renamed from: h */
    public int f19168h;

    /* renamed from: i */
    public boolean f19169i;

    /* renamed from: j */
    public Paint f19170j;

    /* renamed from: k */
    public Rect f19171k;

    /* renamed from: o6.c$a */
    public static final class C5999a extends Drawable.ConstantState {

        /* renamed from: a */
        public final C6002f f19172a;

        public C5999a(C6002f fVar) {
            this.f19172a = fVar;
        }

        public final int getChangingConfigurations() {
            return 0;
        }

        public final Drawable newDrawable() {
            return new C5998c(this);
        }

        public final Drawable newDrawable(Resources resources) {
            return new C5998c(this);
        }
    }

    public C5998c() {
        throw null;
    }

    public C5998c(C5999a aVar) {
        this.f19166f = true;
        this.f19168h = -1;
        C17885a.m44458r(aVar);
        this.f19162b = aVar;
    }

    /* renamed from: a */
    public final void mo21985a() {
        int i;
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        C6002f fVar = this.f19162b.f19172a;
        C6002f.C6003a aVar = fVar.f19182i;
        if (aVar != null) {
            i = aVar.f19192f;
        } else {
            i = -1;
        }
        if (i == fVar.f19174a.mo183c() - 1) {
            this.f19167g++;
        }
        int i2 = this.f19168h;
        if (i2 != -1 && this.f19167g >= i2) {
            stop();
        }
    }

    /* renamed from: b */
    public final void mo21986b() {
        C17885a.m44452o("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f19165e);
        if (this.f19162b.f19172a.f19174a.mo183c() == 1) {
            invalidateSelf();
        } else if (!this.f19163c) {
            this.f19163c = true;
            C6002f fVar = this.f19162b.f19172a;
            if (fVar.f19183j) {
                throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
            } else if (!fVar.f19176c.contains(this)) {
                boolean isEmpty = fVar.f19176c.isEmpty();
                fVar.f19176c.add(this);
                if (isEmpty && !fVar.f19179f) {
                    fVar.f19179f = true;
                    fVar.f19183j = false;
                    fVar.mo22002a();
                }
                invalidateSelf();
            } else {
                throw new IllegalStateException("Cannot subscribe twice in a row");
            }
        }
    }

    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        if (!this.f19165e) {
            if (this.f19169i) {
                int intrinsicWidth = getIntrinsicWidth();
                int intrinsicHeight = getIntrinsicHeight();
                Rect bounds = getBounds();
                if (this.f19171k == null) {
                    this.f19171k = new Rect();
                }
                Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f19171k);
                this.f19169i = false;
            }
            C6002f fVar = this.f19162b.f19172a;
            C6002f.C6003a aVar = fVar.f19182i;
            if (aVar != null) {
                bitmap = aVar.f19194h;
            } else {
                bitmap = fVar.f19185l;
            }
            if (this.f19171k == null) {
                this.f19171k = new Rect();
            }
            Rect rect = this.f19171k;
            if (this.f19170j == null) {
                this.f19170j = new Paint(2);
            }
            canvas.drawBitmap(bitmap, (Rect) null, rect, this.f19170j);
        }
    }

    public final Drawable.ConstantState getConstantState() {
        return this.f19162b;
    }

    public final int getIntrinsicHeight() {
        return this.f19162b.f19172a.f19190q;
    }

    public final int getIntrinsicWidth() {
        return this.f19162b.f19172a.f19189p;
    }

    public final int getOpacity() {
        return -2;
    }

    public final boolean isRunning() {
        return this.f19163c;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f19169i = true;
    }

    public final void setAlpha(int i) {
        if (this.f19170j == null) {
            this.f19170j = new Paint(2);
        }
        this.f19170j.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f19170j == null) {
            this.f19170j = new Paint(2);
        }
        this.f19170j.setColorFilter(colorFilter);
    }

    public final boolean setVisible(boolean z, boolean z2) {
        C17885a.m44452o("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f19165e);
        this.f19166f = z;
        if (!z) {
            this.f19163c = false;
            C6002f fVar = this.f19162b.f19172a;
            fVar.f19176c.remove(this);
            if (fVar.f19176c.isEmpty()) {
                fVar.f19179f = false;
            }
        } else if (this.f19164d) {
            mo21986b();
        }
        return super.setVisible(z, z2);
    }

    public final void start() {
        this.f19164d = true;
        this.f19167g = 0;
        if (this.f19166f) {
            mo21986b();
        }
    }

    public final void stop() {
        this.f19164d = false;
        this.f19163c = false;
        C6002f fVar = this.f19162b.f19172a;
        fVar.f19176c.remove(this);
        if (fVar.f19176c.isEmpty()) {
            fVar.f19179f = false;
        }
    }
}
