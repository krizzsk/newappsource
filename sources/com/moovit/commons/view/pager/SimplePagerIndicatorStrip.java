package com.moovit.commons.view.pager;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.PagerAdapter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.commons.utils.UiUtils;
import java.util.WeakHashMap;
import n00.C18498f;
import p141k1.C5450a;
import p141k1.C5456d;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p622kz.C18159a;
import p622kz.C18165g;
import p977zz.C20941h;

public class SimplePagerIndicatorStrip extends View {

    /* renamed from: b */
    public final C15824a f41287b;

    /* renamed from: c */
    public int f41288c;

    /* renamed from: d */
    public float f41289d;

    /* renamed from: e */
    public int f41290e;

    /* renamed from: f */
    public int f41291f;

    /* renamed from: g */
    public Drawable f41292g;

    /* renamed from: h */
    public int f41293h;

    /* renamed from: i */
    public int[] f41294i;

    /* renamed from: j */
    public int[] f41295j;

    /* renamed from: com.moovit.commons.view.pager.SimplePagerIndicatorStrip$a */
    public class C15824a extends C18498f {
        public C15824a() {
        }

        /* renamed from: c */
        public final void mo47334c(float f, int i) {
            SimplePagerIndicatorStrip simplePagerIndicatorStrip = SimplePagerIndicatorStrip.this;
            simplePagerIndicatorStrip.f41288c = i;
            simplePagerIndicatorStrip.f41289d = f;
            simplePagerIndicatorStrip.invalidate();
        }

        /* renamed from: h */
        public final void mo47335h() {
            SimplePagerIndicatorStrip.this.requestLayout();
            SimplePagerIndicatorStrip.this.invalidate();
            ViewPager viewPager = this.f47110f;
            if (viewPager != null && this.f47111g != null) {
                viewPager.getCurrentItem();
            }
        }
    }

    public SimplePagerIndicatorStrip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C18159a.simplePagerIndicatorStripStyle);
    }

    private int getPageCount() {
        if (isInEditMode()) {
            return 4;
        }
        PagerAdapter pagerAdapter = this.f41287b.f47111g;
        if (pagerAdapter == null) {
            return 0;
        }
        return pagerAdapter.getCount();
    }

    public Drawable getIndicator() {
        return this.f41292g;
    }

    public int getIndicatorSpacing() {
        return this.f41293h;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41287b.mo50918b(this);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C15824a aVar = this.f41287b;
        aVar.f47108d = null;
        if (aVar.f47109e != -1) {
            aVar.mo50921g((ViewPager) null);
        }
    }

    public final void onDraw(Canvas canvas) {
        Drawable indicator;
        super.onDraw(canvas);
        int pageCount = getPageCount();
        if (pageCount != 0 && (indicator = getIndicator()) != null) {
            int intrinsicWidth = indicator.getIntrinsicWidth();
            int intrinsicHeight = indicator.getIntrinsicHeight();
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int height = (((getHeight() - paddingTop) - getPaddingBottom()) / 2) + paddingTop;
            int i = this.f41293h + intrinsicWidth;
            float f = this.f41289d;
            float f2 = 1.0f - f;
            for (int i2 = 0; i2 < pageCount; i2++) {
                int i3 = this.f41288c;
                boolean z = true;
                if (i2 != i3 ? i2 != i3 + 1 || f < 0.5f : f2 < 0.5f) {
                    z = false;
                }
                if (!indicator.isStateful() || !z) {
                    indicator.setState(this.f41294i);
                } else {
                    indicator.setState(this.f41295j);
                }
                if (z) {
                    indicator.setTint(this.f41291f);
                } else {
                    indicator.setTint(this.f41290e);
                }
                int i4 = height - (intrinsicHeight / 2);
                indicator.setBounds(paddingLeft, i4, paddingLeft + intrinsicWidth, i4 + intrinsicHeight);
                indicator.draw(canvas);
                paddingLeft += i;
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        Drawable indicator = getIndicator();
        if (indicator != null) {
            int intrinsicWidth = indicator.getIntrinsicWidth();
            int intrinsicHeight = indicator.getIntrinsicHeight();
            int pageCount = getPageCount();
            int i3 = paddingLeft + paddingRight;
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            int max = Math.max(i3 + ((pageCount - 1) * this.f41293h) + (intrinsicWidth * pageCount), C6333d0.C6337d.m15045e(this));
            int max2 = Math.max(paddingTop + paddingBottom + intrinsicHeight, C6333d0.C6337d.m15044d(this));
            if (mode != 1073741824) {
                if (mode == Integer.MIN_VALUE) {
                    size = Math.min(max, size);
                } else {
                    size = max;
                }
            }
            if (mode2 != 1073741824) {
                if (mode2 == Integer.MIN_VALUE) {
                    size2 = Math.min(max2, size2);
                } else {
                    size2 = max2;
                }
            }
            setMeasuredDimension(View.resolveSize(size, i), View.resolveSize(size2, i2));
        }
    }

    public void setIndicator(Drawable drawable) {
        Drawable drawable2 = this.f41292g;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (drawable2 instanceof C5456d) {
            drawable2 = ((C5456d) drawable2).mo21301a();
        }
        if (drawable2 != drawable) {
            if (drawable != null) {
                drawable3 = C5450a.m13604g(drawable);
            }
            this.f41292g = drawable3;
            if (drawable != null && drawable.isStateful()) {
                int[] state = drawable.getState();
                this.f41294i = state;
                int[] iArr = new int[(state.length + 1)];
                this.f41295j = iArr;
                System.arraycopy(state, 0, iArr, 0, state.length);
                int[] iArr2 = this.f41295j;
                iArr2[iArr2.length - 1] = 16842913;
            }
            if (this.f41287b.mo50917a()) {
                requestLayout();
                postInvalidate();
            }
        }
    }

    public void setIndicatorSpacing(int i) {
        this.f41293h = i;
        if (this.f41287b.mo50917a()) {
            requestLayout();
            postInvalidate();
        }
    }

    /* JADX INFO: finally extract failed */
    public SimplePagerIndicatorStrip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C15824a aVar = new C15824a();
        this.f41287b = aVar;
        this.f41288c = -1;
        this.f41289d = -1.0f;
        TypedArray o = UiUtils.m40256o(context, attributeSet, C18165g.SimplePagerIndicatorStrip, i);
        try {
            aVar.mo50920f(o.getResourceId(C18165g.SimplePagerIndicatorStrip_pagerViewId, -1));
            int a = C20941h.m49038a(context, o, C18165g.SimplePagerIndicatorStrip_nonActiveColor, C18159a.colorOnSurface);
            int a2 = C20941h.m49038a(context, o, C18165g.SimplePagerIndicatorStrip_activeColor, C18159a.colorPrimary);
            this.f41290e = a;
            this.f41291f = a2;
            if (aVar.mo50917a()) {
                requestLayout();
                postInvalidate();
            }
            setIndicator(C20941h.m49042e(context, o, C18165g.SimplePagerIndicatorStrip_indicator));
            setIndicatorSpacing(o.getDimensionPixelOffset(C18165g.SimplePagerIndicatorStrip_indicatorSpacing, 0));
            o.recycle();
            setWillNotDraw(false);
            if (isInEditMode()) {
                this.f41288c = 0;
                this.f41289d = BitmapDescriptorFactory.HUE_RED;
            }
        } catch (Throwable th) {
            o.recycle();
            throw th;
        }
    }
}
