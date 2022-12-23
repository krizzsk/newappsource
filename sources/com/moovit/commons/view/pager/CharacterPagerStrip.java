package com.moovit.commons.view.pager;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.PagerAdapter;
import com.appboy.support.ValidationUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.commons.utils.UiUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import n00.C18498f;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p622kz.C18159a;
import p622kz.C18165g;

public class CharacterPagerStrip extends View {

    /* renamed from: b */
    public final C15822a f41269b;

    /* renamed from: c */
    public int f41270c;

    /* renamed from: d */
    public int f41271d;

    /* renamed from: e */
    public float f41272e;

    /* renamed from: f */
    public final Paint f41273f;

    /* renamed from: g */
    public Drawable f41274g;

    /* renamed from: h */
    public int f41275h;

    /* renamed from: i */
    public final ArrayList<Character> f41276i;

    /* renamed from: j */
    public final Rect f41277j;

    /* renamed from: k */
    public int[] f41278k;

    /* renamed from: l */
    public int[] f41279l;

    /* renamed from: com.moovit.commons.view.pager.CharacterPagerStrip$a */
    public class C15822a extends C18498f {
        public C15822a() {
        }

        /* renamed from: c */
        public final void mo47334c(float f, int i) {
            CharacterPagerStrip characterPagerStrip = CharacterPagerStrip.this;
            characterPagerStrip.f41271d = i;
            characterPagerStrip.f41272e = f;
            characterPagerStrip.invalidate();
        }

        /* renamed from: h */
        public final void mo47335h() {
            CharacterPagerStrip.this.requestLayout();
            CharacterPagerStrip.this.invalidate();
            ViewPager viewPager = this.f47110f;
            if (viewPager != null && this.f47111g != null) {
                viewPager.getCurrentItem();
            }
        }
    }

    public CharacterPagerStrip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C18159a.pagerIndicatorStripStyle);
    }

    private int getPageCount() {
        if (isInEditMode()) {
            return 4;
        }
        PagerAdapter pagerAdapter = this.f41269b.f47111g;
        if (pagerAdapter == null) {
            return 0;
        }
        return pagerAdapter.getCount();
    }

    /* renamed from: a */
    public final String mo47317a(int i) {
        ViewPager viewPager = this.f41269b.f47110f;
        if (viewPager != null) {
            i = viewPager.mo47353b(i);
        }
        if (i < 0 || i >= this.f41276i.size()) {
            return "X";
        }
        return Character.toString(this.f41276i.get(i).charValue());
    }

    public Drawable getIndicator() {
        return this.f41274g;
    }

    public List<Character> getIndicatorChars() {
        return Collections.unmodifiableList(this.f41276i);
    }

    public int getIndicatorSpacing() {
        return this.f41275h;
    }

    public int getTextColor() {
        return this.f41273f.getColor();
    }

    public float getTextSize() {
        return this.f41273f.getTextSize();
    }

    public Typeface getTypeface() {
        return this.f41273f.getTypeface();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41269b.mo50918b(this);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C15822a aVar = this.f41269b;
        aVar.f47108d = null;
        if (aVar.f47109e != -1) {
            aVar.mo50921g((ViewPager) null);
        }
    }

    public final void onDraw(Canvas canvas) {
        Drawable indicator;
        int i;
        float f;
        int i2;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        int pageCount = getPageCount();
        if (pageCount != 0 && (indicator = getIndicator()) != null) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = getPaddingRight();
            int paddingBottom = getPaddingBottom();
            int width = (getWidth() - paddingLeft) - paddingRight;
            int height = (((getHeight() - paddingTop) - paddingBottom) / 2) + paddingTop;
            int i3 = ((width / 2) + paddingLeft) - ((((pageCount - 1) * this.f41275h) + (this.f41270c * pageCount)) / 2);
            int intrinsicWidth = indicator.getIntrinsicWidth();
            int intrinsicHeight = indicator.getIntrinsicHeight();
            int i4 = (this.f41270c / 2) + i3;
            float f2 = this.f41272e;
            float f3 = 1.0f - f2;
            float f4 = BitmapDescriptorFactory.HUE_RED;
            int i5 = 0;
            while (i5 < pageCount) {
                int i6 = this.f41271d;
                if (i5 == i6) {
                    i2 = (int) (255.0f * f3);
                    i = (int) (f2 * 255.0f);
                    f = f3;
                } else if (i5 == i6 + 1) {
                    i2 = (int) (255.0f * f2);
                    i = (int) (f3 * 255.0f);
                    f = f2;
                } else {
                    f = f4;
                    i2 = 0;
                    i = ValidationUtils.APPBOY_STRING_MAX_LENGTH;
                }
                indicator.setState(this.f41278k);
                indicator.setAlpha(i);
                int i7 = i4 - (intrinsicWidth / 2);
                int i8 = height - (intrinsicHeight / 2);
                int i9 = i7 + intrinsicWidth;
                int i11 = pageCount;
                int i12 = i8 + intrinsicHeight;
                indicator.setBounds(i7, i8, i9, i12);
                indicator.draw(canvas2);
                int i13 = intrinsicWidth;
                int i14 = intrinsicHeight;
                if (!this.f41276i.isEmpty()) {
                    if (i2 > 0) {
                        String a = mo47317a(i5);
                        this.f41273f.setAlpha(i2);
                        this.f41273f.getTextBounds(a, 0, 1, this.f41277j);
                        float f5 = (float) height;
                        canvas.save();
                        float f6 = (float) i4;
                        canvas2.scale(f, f, f6, f5);
                        canvas2.drawText(a, f6, f5 - this.f41277j.exactCenterY(), this.f41273f);
                        canvas.restore();
                    }
                } else if (indicator.isStateful() && i2 > 0) {
                    indicator.setState(this.f41279l);
                    indicator.setAlpha(i2);
                    indicator.setBounds(i7, i8, i9, i12);
                    indicator.draw(canvas2);
                }
                i4 += this.f41270c + this.f41275h;
                i5++;
                f4 = f;
                pageCount = i11;
                intrinsicWidth = i13;
                intrinsicHeight = i14;
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
        this.f41273f.getTextBounds("M", 0, 1, this.f41277j);
        this.f41270c = this.f41277j.width();
        int height = this.f41277j.height();
        Drawable indicator = getIndicator();
        if (indicator != null) {
            this.f41270c = Math.max(this.f41270c, indicator.getIntrinsicWidth());
            height = Math.max(height, indicator.getIntrinsicHeight());
        }
        int pageCount = getPageCount();
        int i3 = this.f41270c * pageCount;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        int max = Math.max(paddingLeft + paddingRight + ((pageCount - 1) * this.f41275h) + i3, C6333d0.C6337d.m15045e(this));
        int max2 = Math.max(paddingTop + paddingBottom + height, C6333d0.C6337d.m15044d(this));
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

    public void setIndicator(Drawable drawable) {
        this.f41274g = drawable;
        if (drawable.isStateful()) {
            int[] state = drawable.getState();
            this.f41278k = state;
            int[] iArr = new int[(state.length + 1)];
            this.f41279l = iArr;
            System.arraycopy(state, 0, iArr, 0, state.length);
            int[] iArr2 = this.f41279l;
            iArr2[iArr2.length - 1] = 16842913;
        }
        if (this.f41269b.mo50917a()) {
            requestLayout();
            postInvalidate();
        }
    }

    public void setIndicatorChars(int i) {
        this.f41276i.clear();
        if (i != 0) {
            char[] charArray = getResources().getString(i).toCharArray();
            this.f41276i.ensureCapacity(charArray.length);
            for (char upperCase : charArray) {
                this.f41276i.add(Character.valueOf(Character.toUpperCase(upperCase)));
            }
        }
    }

    public void setIndicatorSpacing(int i) {
        this.f41275h = i;
        if (this.f41269b.mo50917a()) {
            requestLayout();
            postInvalidate();
        }
    }

    public void setTextColor(int i) {
        this.f41273f.setColor(i);
        if (this.f41269b.mo50917a()) {
            postInvalidate();
        }
    }

    public void setTextSize(float f) {
        this.f41273f.setTextSize(f);
        if (this.f41269b.mo50917a()) {
            requestLayout();
            postInvalidate();
        }
    }

    public void setTypeface(Typeface typeface) {
        this.f41273f.setTypeface(typeface);
        if (this.f41269b.mo50917a()) {
            requestLayout();
            postInvalidate();
        }
    }

    /* JADX INFO: finally extract failed */
    public CharacterPagerStrip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C15822a aVar = new C15822a();
        this.f41269b = aVar;
        this.f41271d = -1;
        this.f41272e = -1.0f;
        this.f41276i = new ArrayList<>();
        this.f41277j = new Rect();
        Paint paint = new Paint(1);
        this.f41273f = paint;
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setStyle(Paint.Style.FILL);
        TypedArray o = UiUtils.m40256o(context, attributeSet, C18165g.CharacterPagerStrip, i);
        try {
            aVar.mo50920f(o.getResourceId(C18165g.CharacterPagerStrip_pagerViewId, -1));
            setTextSize((float) o.getDimensionPixelSize(C18165g.CharacterPagerStrip_android_textSize, 16));
            setTextColor(o.getColor(C18165g.CharacterPagerStrip_android_textColor, -16777216));
            setTypeface(Typeface.create((String) null, o.getInt(C18165g.CharacterPagerStrip_android_textStyle, 0)));
            setIndicator(o.getDrawable(C18165g.CharacterPagerStrip_indicator));
            setIndicatorSpacing(o.getDimensionPixelOffset(C18165g.CharacterPagerStrip_indicatorSpacing, 0));
            setIndicatorChars(o.getResourceId(C18165g.CharacterPagerStrip_indicatorChars, 0));
            o.recycle();
            setWillNotDraw(false);
            if (isInEditMode()) {
                this.f41271d = 0;
                this.f41272e = BitmapDescriptorFactory.HUE_RED;
            }
        } catch (Throwable th) {
            o.recycle();
            throw th;
        }
    }
}
