package ea0;

import a00.C13382a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import ce0.C21100e;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.textview.MaterialTextView;
import com.moovit.commons.utils.C15780a;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.moovit.transit.TransitStop;
import com.moovit.util.time.C7925b;
import com.moovit.util.time.Time;
import java.util.List;
import java.util.Locale;
import p129j1.C5348a;
import p824tp.C19735m;
import p977zz.C20941h;
import p977zz.C20964s0;
import p977zz.C20975x0;

/* renamed from: ea0.a */
public final class C12622a extends LinearLayout {

    /* renamed from: b */
    public List<TransitStop> f31194b;

    /* renamed from: c */
    public final float f31195c;

    /* renamed from: d */
    public final int f31196d;

    /* renamed from: e */
    public final int f31197e;

    /* renamed from: f */
    public final Paint f31198f;

    /* renamed from: g */
    public final Paint f31199g;

    /* renamed from: h */
    public final Paint f31200h;

    /* renamed from: i */
    public final float f31201i;

    /* renamed from: j */
    public Integer f31202j;

    /* renamed from: k */
    public int f31203k;

    /* renamed from: l */
    public final Paint f31204l;

    /* renamed from: m */
    public final Paint f31205m;

    /* renamed from: n */
    public final Paint f31206n;

    /* renamed from: o */
    public final float f31207o;

    /* renamed from: p */
    public final float f31208p;

    public C12622a(Context context, int i, int i2, int i3, int i4, int i5) {
        super(context);
        setOrientation(1);
        setWillNotDraw(false);
        float f = (float) (i + i2);
        this.f31195c = f;
        this.f31197e = i;
        this.f31196d = UiUtils.m40249h(context.getResources(), 8.0f) + Math.round((f * 2.0f) + 0.5f);
        float f2 = (float) i;
        this.f31207o = f2;
        this.f31208p = f2 * 0.7f;
        Paint paint = new Paint(1);
        this.f31198f = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(i3);
        float f3 = (float) i2;
        paint.setStrokeWidth(f3);
        int i6 = C5348a.m13413i(C20941h.m49043f(C19735m.colorOnSurfaceEmphasisMedium, context), i4);
        Paint paint2 = new Paint(1);
        this.f31199g = paint2;
        paint2.setStyle(Paint.Style.FILL_AND_STROKE);
        paint2.setColor(i6);
        paint2.setStrokeWidth(f3);
        Paint paint3 = new Paint(1);
        this.f31200h = paint3;
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(i4);
        this.f31201i = (float) (i - UiUtils.m40248g(getContext(), 1.0f));
        Paint paint4 = new Paint(1);
        this.f31204l = paint4;
        paint4.setStyle(Paint.Style.FILL);
        paint4.setColor(C20941h.m49043f(C19735m.colorSurface, context));
        paint4.setStrokeWidth(f3);
        Paint paint5 = new Paint(1);
        this.f31205m = paint5;
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setColor(C20941h.m49043f(C19735m.colorOnSurfaceEmphasisLow, context));
        paint5.setStrokeWidth(f3);
        Paint paint6 = new Paint(1);
        this.f31206n = paint6;
        paint6.setStyle(Paint.Style.FILL);
        paint6.setColor(i5);
    }

    /* renamed from: a */
    public static float m32346a(View view) {
        return (((float) view.getHeight()) / 2.0f) + ((float) view.getTop());
    }

    /* renamed from: e */
    public static void m32347e(int i, int i2) {
        C21100e.m49359q(i, "markerIndex");
        if (i >= i2) {
            Object[] objArr = {Integer.valueOf(i2 - 1), Integer.valueOf(i)};
            String str = C20964s0.f52718a;
            throw new IllegalArgumentException(String.format((Locale) null, "marker index must be within range [0-%d], actual value: %d", objArr));
        }
    }

    private float getMarkerY() {
        boolean z;
        float a = m32346a(getChildAt(this.f31202j.intValue()));
        Integer num = this.f31202j;
        boolean z2 = false;
        if (num != null) {
            z = true;
        } else {
            z = false;
        }
        if (!(!z || num.intValue() == this.f31194b.size() - 1 || this.f31203k == 0)) {
            z2 = true;
        }
        if (!z2) {
            return a;
        }
        return ((((float) this.f31203k) / 100.0f) * (m32346a(getChildAt(this.f31202j.intValue() + 1)) - a)) + a;
    }

    /* renamed from: b */
    public final boolean mo39413b(int i) {
        boolean z;
        Integer num = this.f31202j;
        if (num != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z || i > num.intValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final void mo39414c(Time time, List list) {
        boolean z;
        Time time2;
        this.f31202j = null;
        this.f31194b = list;
        removeAllViews();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ListItemView listItemView = new ListItemView(getContext(), (AttributeSet) null, 0);
            listItemView.setPaddingRelative(this.f31196d, 0, 0, 0);
            if (i == size - 1) {
                z = true;
            } else {
                z = false;
            }
            TransitStop transitStop = (TransitStop) list.get(i);
            if (z) {
                time2 = time;
            } else {
                time2 = null;
            }
            mo39415d(listItemView, transitStop, time2, mo39413b(i), z, false);
            addView(listItemView);
        }
    }

    /* renamed from: d */
    public final void mo39415d(ListItemView listItemView, TransitStop transitStop, Time time, boolean z, boolean z2, boolean z3) {
        String str;
        MaterialTextView materialTextView;
        int i = C19735m.textAppearanceCaption;
        int i2 = C19735m.colorOnSurfaceEmphasisHigh;
        if (z) {
            i2 = C19735m.colorOnSurfaceEmphasisMedium;
        } else if (z2) {
            i = C19735m.textAppearanceCaptionStrong;
        }
        listItemView.setTitleThemeTextAppearance(i);
        listItemView.setTitleThemeTextColor(i2);
        listItemView.setTitle((CharSequence) transitStop.f23731c);
        CharSequence charSequence = null;
        if ((z2 || !z) && time != null) {
            str = C7925b.m18024l(getContext(), time.mo24631g());
        } else {
            str = null;
        }
        if (str != null) {
            materialTextView = new MaterialTextView(getContext(), (AttributeSet) null);
            C20964s0.m49107y(materialTextView, i, i2);
            materialTextView.setText(str);
            if (z3) {
                materialTextView.setTextColor(C20941h.m49043f(C19735m.colorLive, getContext()));
            }
        } else {
            materialTextView = null;
        }
        listItemView.setAccessoryView((View) materialTextView);
        CharSequence[] charSequenceArr = new CharSequence[2];
        charSequenceArr[0] = transitStop.f23731c;
        if (materialTextView != null) {
            charSequence = materialTextView.getText();
        }
        charSequenceArr[1] = charSequence;
        C13382a.m33674j(listItemView, charSequenceArr);
    }

    public List<TransitStop> getStops() {
        return this.f31194b;
    }

    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        float f2;
        Paint paint;
        float f3;
        boolean z;
        float f4;
        boolean z2;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        boolean b = C15780a.m40269b(this);
        float strokeWidth = this.f31198f.getStrokeWidth();
        float f5 = 0.5f * strokeWidth;
        if (b) {
            i = getPaddingRight();
        } else {
            i = getPaddingLeft();
        }
        int i2 = ((int) this.f31195c) + i;
        if (b) {
            i2 = getWidth() - i2;
        }
        int i3 = i2;
        int childCount = getChildCount();
        boolean z3 = true;
        if (childCount >= 2) {
            float f6 = (float) i3;
            float f7 = f6 - f5;
            float f8 = f6 + f5;
            float height = (float) getHeight();
            View childAt = getChildAt(0);
            if (childAt != null) {
                f3 = m32346a(childAt);
            } else {
                f3 = BitmapDescriptorFactory.HUE_RED;
            }
            if (this.f31202j != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                f4 = getMarkerY();
            } else {
                f4 = BitmapDescriptorFactory.HUE_RED;
            }
            View childAt2 = getChildAt(childCount - 1);
            if (childAt2 != null) {
                height = m32346a(childAt2);
            }
            float f9 = height;
            if (this.f31202j != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                C20975x0.m49117d(canvas, f7, f3, f8, f9, this.f31198f);
            } else {
                Canvas canvas3 = canvas;
                float f11 = f7;
                float f12 = f3;
                float f13 = f8;
                C20975x0.m49117d(canvas3, f11, f12, f13, f4, this.f31199g);
                C20975x0.m49117d(canvas3, f11, f4, f13, f9, this.f31198f);
            }
        }
        if (b) {
            int i4 = this.f31197e;
            f = ((float) (i3 - i4)) - (((float) i4) / 2.0f);
        } else {
            f = (float) i3;
        }
        float f14 = f;
        if (b) {
            f2 = (float) i3;
        } else {
            int i5 = this.f31197e;
            f2 = (((float) i5) / 2.0f) + ((float) (i3 + i5));
        }
        float f15 = f2;
        for (int i6 = 0; i6 < childCount; i6++) {
            float a = m32346a(getChildAt(i6));
            if (mo39413b(i6)) {
                paint = this.f31199g;
            } else {
                paint = this.f31198f;
            }
            Paint paint2 = paint;
            if (i6 == 0) {
                float f16 = (float) i3;
                canvas2.drawCircle(f16, a, (float) this.f31197e, paint2);
                canvas2.drawCircle(f16, a, this.f31201i, this.f31200h);
            } else if (i6 == childCount - 1) {
                canvas2.drawCircle((float) i3, a + strokeWidth, (float) this.f31197e, paint2);
            } else {
                canvas.drawRect(f14, a, f15, a + strokeWidth, paint2);
            }
        }
        if (this.f31202j == null) {
            z3 = false;
        }
        if (z3) {
            float f17 = (float) i3;
            float markerY = getMarkerY() + strokeWidth;
            canvas2.drawCircle(f17, markerY, this.f31207o, this.f31204l);
            canvas2.drawCircle(f17, markerY, this.f31207o, this.f31205m);
            canvas2.drawCircle(f17, markerY, this.f31208p, this.f31206n);
        }
    }

    public void setMarkerIndex(int i) {
        boolean z;
        C21100e.m49373x(this.f31194b, "stops");
        m32347e(this.f31202j.intValue(), this.f31194b.size());
        this.f31202j = Integer.valueOf(i);
        this.f31203k = 0;
        int size = this.f31194b.size();
        for (int i2 = 0; i2 < size; i2++) {
            ListItemView listItemView = (ListItemView) getChildAt(i2);
            TransitStop transitStop = this.f31194b.get(i2);
            boolean b = mo39413b(i2);
            if (i2 == size - 1) {
                z = true;
            } else {
                z = false;
            }
            mo39415d(listItemView, transitStop, (Time) null, b, z, false);
        }
    }

    public void setMarkerProgress(int i) {
        if (i < 0 || ((float) i) > 100.0f) {
            throw new IllegalArgumentException("invalid progress value: " + i + " must be positive and may not exceed: " + 100.0f);
        }
        C21100e.m49373x(this.f31194b, "stops");
        this.f31203k = i;
        invalidate();
    }
}
