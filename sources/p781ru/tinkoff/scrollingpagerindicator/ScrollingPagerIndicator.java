package p781ru.tinkoff.scrollingpagerindicator;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import fk0.C23402a;
import fk0.C23403b;
import fk0.C23404c;
import fk0.C23405d;
import fk0.C23406e;
import fk0.C23407f;

/* renamed from: ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator */
public class ScrollingPagerIndicator extends View {

    /* renamed from: b */
    public int f62816b;

    /* renamed from: c */
    public final int f62817c;

    /* renamed from: d */
    public final int f62818d;

    /* renamed from: e */
    public final int f62819e;

    /* renamed from: f */
    public final int f62820f;

    /* renamed from: g */
    public int f62821g;

    /* renamed from: h */
    public int f62822h;

    /* renamed from: i */
    public int f62823i;

    /* renamed from: j */
    public float f62824j;

    /* renamed from: k */
    public float f62825k;

    /* renamed from: l */
    public float f62826l;

    /* renamed from: m */
    public SparseArray<Float> f62827m;

    /* renamed from: n */
    public int f62828n;

    /* renamed from: o */
    public final Paint f62829o;

    /* renamed from: p */
    public final ArgbEvaluator f62830p;

    /* renamed from: q */
    public int f62831q;

    /* renamed from: r */
    public int f62832r;

    /* renamed from: s */
    public final Drawable f62833s;

    /* renamed from: t */
    public final Drawable f62834t;

    /* renamed from: u */
    public boolean f62835u;

    /* renamed from: v */
    public C24845a f62836v;

    /* renamed from: w */
    public C24846b<?> f62837w;

    /* renamed from: x */
    public boolean f62838x;

    /* renamed from: y */
    public boolean f62839y;

    /* renamed from: ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator$a */
    public class C24845a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Object f62840b;

        /* renamed from: c */
        public final /* synthetic */ C24846b f62841c;

        public C24845a(Object obj, C24846b bVar) {
            this.f62840b = obj;
            this.f62841c = bVar;
        }

        public final void run() {
            ScrollingPagerIndicator scrollingPagerIndicator = ScrollingPagerIndicator.this;
            scrollingPagerIndicator.f62828n = -1;
            scrollingPagerIndicator.mo61315b(this.f62840b, this.f62841c);
        }
    }

    /* renamed from: ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator$b */
    public interface C24846b<T> {
    }

    public ScrollingPagerIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C23402a.scrollingPagerIndicatorStyle);
    }

    private int getDotCount() {
        if (!this.f62835u || this.f62828n <= this.f62821g) {
            return this.f62828n;
        }
        return this.f62816b;
    }

    /* renamed from: a */
    public final void mo61314a(float f, int i) {
        int i2 = this.f62828n;
        int i3 = this.f62821g;
        if (i2 <= i3) {
            this.f62824j = BitmapDescriptorFactory.HUE_RED;
        } else if (this.f62835u || i2 <= i3) {
            this.f62824j = ((((float) this.f62820f) * f) + mo61316c(this.f62816b / 2)) - (this.f62825k / 2.0f);
        } else {
            this.f62824j = ((((float) this.f62820f) * f) + mo61316c(i)) - (this.f62825k / 2.0f);
            int i4 = this.f62821g / 2;
            float c = mo61316c((getDotCount() - 1) - i4);
            if ((this.f62825k / 2.0f) + this.f62824j < mo61316c(i4)) {
                this.f62824j = mo61316c(i4) - (this.f62825k / 2.0f);
                return;
            }
            float f2 = this.f62824j;
            float f3 = this.f62825k;
            if ((f3 / 2.0f) + f2 > c) {
                this.f62824j = c - (f3 / 2.0f);
            }
        }
    }

    /* renamed from: b */
    public final <T> void mo61315b(T t, C24846b<T> bVar) {
        C24846b<?> bVar2 = this.f62837w;
        if (bVar2 != null) {
            C23407f fVar = (C23407f) bVar2;
            fVar.f59189b.unregisterAdapterDataObserver(fVar.f59188a);
            ViewPager2 viewPager2 = fVar.f59191d;
            viewPager2.f5067d.f5104a.remove(fVar.f59190c);
            this.f62837w = null;
            this.f62836v = null;
            this.f62838x = true;
        }
        this.f62839y = false;
        C23407f fVar2 = (C23407f) bVar;
        fVar2.getClass();
        ViewPager2 viewPager22 = (ViewPager2) t;
        RecyclerView.Adapter adapter = viewPager22.getAdapter();
        fVar2.f59189b = adapter;
        if (adapter != null) {
            fVar2.f59191d = viewPager22;
            setDotCount(adapter.getItemCount());
            setCurrentPosition(fVar2.f59191d.getCurrentItem());
            C23405d dVar = new C23405d(this);
            fVar2.f59188a = dVar;
            fVar2.f59189b.registerAdapterDataObserver(dVar);
            C23406e eVar = new C23406e(fVar2, this);
            fVar2.f59190c = eVar;
            viewPager22.f5067d.f5104a.add(eVar);
            this.f62837w = bVar;
            this.f62836v = new C24845a(t, bVar);
            return;
        }
        throw new IllegalStateException("Set adapter before call attachToPager() method");
    }

    /* renamed from: c */
    public final float mo61316c(int i) {
        return this.f62826l + ((float) (i * this.f62820f));
    }

    /* renamed from: d */
    public final void mo61317d(float f, int i) {
        int i2;
        if (f < BitmapDescriptorFactory.HUE_RED || f > 1.0f) {
            throw new IllegalArgumentException("Offset must be [0, 1]");
        } else if (i < 0 || (i != 0 && i >= this.f62828n)) {
            throw new IndexOutOfBoundsException("page must be [0, adapter.getItemCount())");
        } else {
            if (!this.f62835u || ((i2 = this.f62828n) <= this.f62821g && i2 > 1)) {
                this.f62827m.clear();
                if (this.f62823i == 0) {
                    mo61319f(f, i);
                    int i3 = this.f62828n;
                    if (i < i3 - 1) {
                        mo61319f(1.0f - f, i + 1);
                    } else if (i3 > 1) {
                        mo61319f(1.0f - f, 0);
                    }
                } else {
                    mo61319f(f, i - 1);
                    mo61319f(1.0f - f, i);
                }
                invalidate();
            }
            if (this.f62823i == 0) {
                mo61314a(f, i);
            } else {
                mo61314a(f, i - 1);
            }
            invalidate();
        }
    }

    /* renamed from: e */
    public final void mo61318e() {
        C24845a aVar = this.f62836v;
        if (aVar != null) {
            aVar.run();
            invalidate();
        }
    }

    /* renamed from: f */
    public final void mo61319f(float f, int i) {
        if (this.f62827m != null && getDotCount() != 0) {
            float abs = 1.0f - Math.abs(f);
            if (abs == BitmapDescriptorFactory.HUE_RED) {
                this.f62827m.remove(i);
            } else {
                this.f62827m.put(i, Float.valueOf(abs));
            }
        }
    }

    public int getDotColor() {
        return this.f62831q;
    }

    public int getOrientation() {
        return this.f62823i;
    }

    public int getSelectedDotColor() {
        return this.f62832r;
    }

    public int getVisibleDotCount() {
        return this.f62821g;
    }

    public int getVisibleDotThreshold() {
        return this.f62822h;
    }

    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        boolean z;
        float f;
        int i;
        Canvas canvas2 = canvas;
        int dotCount = getDotCount();
        if (dotCount >= this.f62822h) {
            int i2 = this.f62820f;
            int i3 = this.f62819e;
            float f2 = ((float) (((i3 - this.f62818d) / 2) + i2)) * 0.7f;
            float f3 = (float) (i3 / 2);
            float f4 = ((float) i2) * 0.85714287f;
            float f5 = this.f62824j;
            int i4 = ((int) (f5 - this.f62826l)) / i2;
            int c = (((int) ((f5 + this.f62825k) - mo61316c(i4))) / this.f62820f) + i4;
            if (i4 == 0 && c + 1 > dotCount) {
                c = dotCount - 1;
            }
            for (int i5 = i4; i5 <= c; i5++) {
                float c2 = mo61316c(i5);
                float f6 = this.f62824j;
                if (c2 >= f6) {
                    float f7 = this.f62825k;
                    if (c2 < f6 + f7) {
                        boolean z2 = this.f62835u;
                        float f8 = BitmapDescriptorFactory.HUE_RED;
                        if (!z2 || this.f62828n <= this.f62821g) {
                            Float f9 = this.f62827m.get(i5);
                            if (f9 != null) {
                                f8 = f9.floatValue();
                            }
                        } else {
                            float f11 = (f7 / 2.0f) + f6;
                            if (c2 >= f11 - f4 && c2 <= f11) {
                                f8 = ((c2 - f11) + f4) / f4;
                            } else if (c2 > f11 && c2 < f11 + f4) {
                                f8 = 1.0f - ((c2 - f11) / f4);
                            }
                        }
                        int i6 = this.f62818d;
                        float f12 = (((float) (this.f62819e - i6)) * f8) + ((float) i6);
                        if (this.f62828n > this.f62821g) {
                            if (this.f62835u || !(i5 == 0 || i5 == dotCount - 1)) {
                                f = f2;
                            } else {
                                f = f3;
                            }
                            int width = getWidth();
                            if (this.f62823i == 1) {
                                width = getHeight();
                            }
                            float f13 = this.f62824j;
                            if (c2 - f13 < f) {
                                float f14 = ((c2 - f13) * f12) / f;
                                i = this.f62817c;
                                if (f14 > ((float) i)) {
                                    if (f14 < f12) {
                                        f12 = f14;
                                    }
                                }
                            } else {
                                float f15 = (float) width;
                                if (c2 - f13 > f15 - f) {
                                    float f16 = ((((-c2) + f13) + f15) * f12) / f;
                                    i = this.f62817c;
                                    if (f16 > ((float) i)) {
                                        if (f16 < f12) {
                                            f12 = f16;
                                        }
                                    }
                                }
                            }
                            f12 = (float) i;
                        }
                        this.f62829o.setColor(((Integer) this.f62830p.evaluate(f8, Integer.valueOf(this.f62831q), Integer.valueOf(this.f62832r))).intValue());
                        if (i5 == i4) {
                            drawable = this.f62833s;
                        } else if (i5 == c) {
                            drawable = this.f62834t;
                        } else {
                            drawable = null;
                        }
                        if (drawable != null) {
                            if (this.f62823i == 0) {
                                int i7 = this.f62819e;
                                drawable.setBounds((int) ((c2 - this.f62824j) - ((float) (this.f62819e / 2))), (getMeasuredHeight() / 2) - (i7 / 2), (int) ((c2 - this.f62824j) + ((float) (i7 / 2))), (this.f62819e / 2) + (getMeasuredHeight() / 2));
                            } else {
                                int i8 = this.f62819e;
                                int i9 = this.f62819e;
                                drawable.setBounds((getMeasuredWidth() / 2) - (i8 / 2), (int) ((c2 - this.f62824j) - ((float) (i8 / 2))), (i9 / 2) + (getMeasuredWidth() / 2), (int) ((c2 - this.f62824j) + ((float) (i9 / 2))));
                            }
                            drawable.setTint(this.f62829o.getColor());
                            drawable.draw(canvas2);
                        } else if (this.f62823i == 0) {
                            float f17 = c2 - this.f62824j;
                            if (this.f62838x) {
                                if (getLayoutDirection() == 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    f17 = ((float) getWidth()) - f17;
                                }
                            }
                            canvas2.drawCircle(f17, (float) (getMeasuredHeight() / 2), f12 / 2.0f, this.f62829o);
                        } else {
                            canvas2.drawCircle((float) (getMeasuredWidth() / 2), c2 - this.f62824j, f12 / 2.0f, this.f62829o);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r5, int r6) {
        /*
            r4 = this;
            int r0 = r4.f62823i
            r1 = 1073741824(0x40000000, float:2.0)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L_0x0042
            boolean r5 = r4.isInEditMode()
            if (r5 == 0) goto L_0x001a
            int r5 = r4.f62821g
            int r5 = r5 + -1
            int r0 = r4.f62820f
            int r5 = r5 * r0
            int r0 = r4.f62819e
        L_0x0018:
            int r5 = r5 + r0
            goto L_0x002d
        L_0x001a:
            int r5 = r4.f62828n
            int r0 = r4.f62821g
            if (r5 < r0) goto L_0x0024
            float r5 = r4.f62825k
            int r5 = (int) r5
            goto L_0x002d
        L_0x0024:
            int r5 = r5 + -1
            int r0 = r4.f62820f
            int r5 = r5 * r0
            int r0 = r4.f62819e
            goto L_0x0018
        L_0x002d:
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r3 = r4.f62819e
            if (r0 == r2) goto L_0x003d
            if (r0 == r1) goto L_0x007b
            r6 = r3
            goto L_0x007b
        L_0x003d:
            int r6 = java.lang.Math.min(r3, r6)
            goto L_0x007b
        L_0x0042:
            boolean r6 = r4.isInEditMode()
            if (r6 == 0) goto L_0x0054
            int r6 = r4.f62821g
            int r6 = r6 + -1
            int r0 = r4.f62820f
            int r6 = r6 * r0
            int r0 = r4.f62819e
        L_0x0052:
            int r6 = r6 + r0
            goto L_0x0067
        L_0x0054:
            int r6 = r4.f62828n
            int r0 = r4.f62821g
            if (r6 < r0) goto L_0x005e
            float r6 = r4.f62825k
            int r6 = (int) r6
            goto L_0x0067
        L_0x005e:
            int r6 = r6 + -1
            int r0 = r4.f62820f
            int r6 = r6 * r0
            int r0 = r4.f62819e
            goto L_0x0052
        L_0x0067:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r3 = r4.f62819e
            if (r0 == r2) goto L_0x0077
            if (r0 == r1) goto L_0x007b
            r5 = r3
            goto L_0x007b
        L_0x0077:
            int r5 = java.lang.Math.min(r3, r5)
        L_0x007b:
            r4.setMeasuredDimension(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p781ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator.onMeasure(int, int):void");
    }

    public void setAutoRtl(boolean z) {
        this.f62838x = z;
        invalidate();
    }

    public void setCurrentPosition(int i) {
        if (i != 0 && (i < 0 || i >= this.f62828n)) {
            throw new IndexOutOfBoundsException("Position must be [0, adapter.getItemCount()]");
        } else if (this.f62828n != 0) {
            mo61314a(BitmapDescriptorFactory.HUE_RED, i);
            if (!this.f62835u || this.f62828n < this.f62821g) {
                this.f62827m.clear();
                this.f62827m.put(i, Float.valueOf(1.0f));
                invalidate();
            }
        }
    }

    public void setDotColor(int i) {
        this.f62831q = i;
        invalidate();
    }

    public void setDotCount(int i) {
        float f;
        if (this.f62828n != i || !this.f62839y) {
            this.f62828n = i;
            this.f62839y = true;
            this.f62827m = new SparseArray<>();
            if (i < this.f62822h) {
                requestLayout();
                invalidate();
                return;
            }
            if (!this.f62835u || this.f62828n <= this.f62821g) {
                f = (float) (this.f62819e / 2);
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            this.f62826l = f;
            this.f62825k = (float) (((this.f62821g - 1) * this.f62820f) + this.f62819e);
            requestLayout();
            invalidate();
        }
    }

    public void setLooped(boolean z) {
        this.f62835u = z;
        mo61318e();
        invalidate();
    }

    public void setOrientation(int i) {
        this.f62823i = i;
        if (this.f62836v != null) {
            mo61318e();
        } else {
            requestLayout();
        }
    }

    public void setSelectedDotColor(int i) {
        this.f62832r = i;
        invalidate();
    }

    public void setVisibleDotCount(int i) {
        if (i % 2 != 0) {
            this.f62821g = i;
            this.f62816b = i + 2;
            if (this.f62836v != null) {
                mo61318e();
            } else {
                requestLayout();
            }
        } else {
            throw new IllegalArgumentException("visibleDotCount must be odd");
        }
    }

    public void setVisibleDotThreshold(int i) {
        this.f62822h = i;
        if (this.f62836v != null) {
            mo61318e();
        } else {
            requestLayout();
        }
    }

    public ScrollingPagerIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f62830p = new ArgbEvaluator();
        this.f62838x = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C23404c.ScrollingPagerIndicator, i, C23403b.ScrollingPagerIndicator);
        int color = obtainStyledAttributes.getColor(C23404c.ScrollingPagerIndicator_spi_dotColor, 0);
        this.f62831q = color;
        this.f62832r = obtainStyledAttributes.getColor(C23404c.ScrollingPagerIndicator_spi_dotSelectedColor, color);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C23404c.ScrollingPagerIndicator_spi_dotSize, 0);
        this.f62818d = dimensionPixelSize;
        this.f62819e = obtainStyledAttributes.getDimensionPixelSize(C23404c.ScrollingPagerIndicator_spi_dotSelectedSize, 0);
        int i2 = -1;
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(C23404c.ScrollingPagerIndicator_spi_dotMinimumSize, -1);
        this.f62817c = dimensionPixelSize2 <= dimensionPixelSize ? dimensionPixelSize2 : i2;
        this.f62820f = obtainStyledAttributes.getDimensionPixelSize(C23404c.ScrollingPagerIndicator_spi_dotSpacing, 0) + dimensionPixelSize;
        this.f62835u = obtainStyledAttributes.getBoolean(C23404c.ScrollingPagerIndicator_spi_looped, false);
        int i3 = obtainStyledAttributes.getInt(C23404c.ScrollingPagerIndicator_spi_visibleDotCount, 0);
        setVisibleDotCount(i3);
        this.f62822h = obtainStyledAttributes.getInt(C23404c.ScrollingPagerIndicator_spi_visibleDotThreshold, 2);
        this.f62823i = obtainStyledAttributes.getInt(C23404c.ScrollingPagerIndicator_spi_orientation, 0);
        this.f62833s = obtainStyledAttributes.getDrawable(C23404c.ScrollingPagerIndicator_spi_firstDotDrawable);
        this.f62834t = obtainStyledAttributes.getDrawable(C23404c.ScrollingPagerIndicator_spi_lastDotDrawable);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f62829o = paint;
        paint.setAntiAlias(true);
        if (isInEditMode()) {
            setDotCount(i3);
            mo61317d(BitmapDescriptorFactory.HUE_RED, i3 / 2);
        }
    }
}
