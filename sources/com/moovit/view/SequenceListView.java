package com.moovit.view;

import a00.C13382a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import ce0.C21100e;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.commons.utils.C15780a;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.moovit.util.time.C7925b;
import com.moovit.util.time.Time;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import p824tp.C19735m;
import p824tp.C19748z;
import p977zz.C20941h;
import p977zz.C20964s0;
import p977zz.C20975x0;

public class SequenceListView extends LinearLayout {

    /* renamed from: b */
    public List<String> f23987b;

    /* renamed from: c */
    public final float f23988c;

    /* renamed from: d */
    public final int f23989d;

    /* renamed from: e */
    public final float f23990e;

    /* renamed from: f */
    public final float f23991f;

    /* renamed from: g */
    public final float f23992g;

    /* renamed from: h */
    public final int f23993h;

    /* renamed from: i */
    public final int f23994i;

    /* renamed from: j */
    public final Paint f23995j;

    /* renamed from: k */
    public final Paint f23996k;

    /* renamed from: l */
    public final Paint f23997l;

    /* renamed from: m */
    public final Paint f23998m;

    /* renamed from: n */
    public final Paint f23999n;

    /* renamed from: o */
    public Integer f24000o;

    /* renamed from: p */
    public int f24001p;

    /* renamed from: q */
    public float f24002q;

    public SequenceListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public static float m18052a(View view) {
        return (float) ((view.getHeight() / 2) + view.getTop());
    }

    /* renamed from: d */
    public static void m18053d(int i, int i2) {
        C21100e.m49359q(i, "markerIndex");
        if (i >= i2) {
            Object[] objArr = {Integer.valueOf(i2 - 1), Integer.valueOf(i)};
            String str = C20964s0.f52718a;
            throw new IllegalArgumentException(String.format((Locale) null, "marker index must be within range [0-%d], actual value: %d", objArr));
        }
    }

    private float getMarkerY() {
        boolean z;
        float a = m18052a(getChildAt(this.f24000o.intValue()));
        Integer num = this.f24000o;
        boolean z2 = false;
        if (num != null) {
            z = true;
        } else {
            z = false;
        }
        if (!(!z || num.intValue() == this.f23987b.size() - 1 || this.f24001p == 0)) {
            z2 = true;
        }
        if (!z2) {
            return a;
        }
        return ((((float) this.f24001p) / 100.0f) * (m18052a(getChildAt(this.f24000o.intValue() + 1)) - a)) + a;
    }

    /* renamed from: b */
    public final boolean mo24748b(int i) {
        boolean z;
        Integer num = this.f24000o;
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
    public final void mo24749c(ListItemView listItemView, String str, Time time, boolean z) {
        String str2;
        int i;
        if (time != null) {
            str2 = C7925b.m18024l(getContext(), time.mo24631g());
        } else {
            str2 = null;
        }
        if (z) {
            i = this.f23994i;
        } else {
            i = this.f23993h;
        }
        listItemView.setTitle((CharSequence) str);
        listItemView.setTitleTextColor(i);
        listItemView.setAccessoryText((CharSequence) str2);
        listItemView.setAccessoryTextColor(i);
        C13382a.m33674j(listItemView, str, str2);
    }

    public float getLastMarkerY() {
        return this.f24002q;
    }

    public final void onDraw(Canvas canvas) {
        int i;
        Paint paint;
        float f;
        boolean z;
        float f2;
        boolean z2;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        boolean b = C15780a.m40269b(this);
        float strokeWidth = this.f23995j.getStrokeWidth();
        float f3 = 0.5f * strokeWidth;
        if (b) {
            i = getPaddingRight();
        } else {
            i = getPaddingLeft();
        }
        int i2 = ((int) this.f23988c) + i;
        if (b) {
            i2 = getWidth() - i2;
        }
        int i3 = i2;
        int childCount = getChildCount();
        boolean z3 = true;
        if (childCount >= 2) {
            float f4 = (float) i3;
            float f5 = f4 - f3;
            float f6 = f3 + f4;
            float height = (float) getHeight();
            View childAt = getChildAt(0);
            if (childAt != null) {
                f = m18052a(childAt);
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            if (this.f24000o != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                f2 = getMarkerY();
            } else {
                f2 = BitmapDescriptorFactory.HUE_RED;
            }
            View childAt2 = getChildAt(childCount - 1);
            if (childAt2 != null) {
                height = m18052a(childAt2);
            }
            float f7 = height;
            if (this.f24000o != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                C20975x0.m49117d(canvas, f5, f, f6, f7, this.f23995j);
            } else {
                Canvas canvas3 = canvas;
                float f8 = f5;
                float f9 = f;
                float f11 = f6;
                C20975x0.m49117d(canvas3, f8, f9, f11, f2, this.f23996k);
                C20975x0.m49117d(canvas3, f8, f2, f11, f7, this.f23995j);
            }
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            float a = m18052a(getChildAt(i4));
            if (mo24748b(i4)) {
                paint = this.f23996k;
            } else {
                paint = this.f23995j;
            }
            float f12 = (float) i3;
            float f13 = a + strokeWidth;
            canvas2.drawCircle(f12, f13, this.f23990e, this.f23997l);
            canvas2.drawCircle(f12, f13, this.f23990e, paint);
        }
        if (this.f24000o == null) {
            z3 = false;
        }
        if (z3) {
            float markerY = getMarkerY();
            float f14 = (float) i3;
            float f15 = strokeWidth + markerY;
            canvas2.drawCircle(f14, f15, this.f23991f, this.f23999n);
            canvas2.drawCircle(f14, f15, this.f23992g, this.f23998m);
            this.f24002q = markerY;
        }
    }

    public void setMarkerIndex(int i) {
        C21100e.m49373x(this.f23987b, "names");
        m18053d(i, this.f23987b.size());
        this.f24000o = Integer.valueOf(i);
        this.f24001p = 0;
        int size = this.f23987b.size();
        for (int i2 = 0; i2 < size; i2++) {
            mo24749c((ListItemView) getChildAt(i2), this.f23987b.get(i2), (Time) null, mo24748b(i2));
        }
    }

    public void setMarkerProgress(int i) {
        if (i < 0 || ((float) i) > 100.0f) {
            throw new IllegalArgumentException("invalid progress value: " + i + " must be positive and may not exceed: " + 100.0f);
        }
        C21100e.m49373x(this.f23987b, "names");
        this.f24001p = i;
        invalidate();
    }

    /* JADX INFO: finally extract failed */
    public SequenceListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        setWillNotDraw(false);
        TypedArray o = UiUtils.m40256o(context, attributeSet, C19748z.SequenceListView, i);
        try {
            float dimension = o.getDimension(C19748z.SequenceListView_startOffset, UiUtils.m40247f(context.getResources(), 6.0f));
            this.f23988c = dimension;
            this.f23990e = o.getDimension(C19748z.SequenceListView_fullRadius, 10.0f);
            float dimension2 = o.getDimension(C19748z.SequenceListView_markerFullRadius, 11.0f);
            this.f23991f = dimension2;
            this.f23992g = o.getDimension(C19748z.SequenceListView_markerFillRadius, dimension2 - ((float) UiUtils.m40249h(context.getResources(), 1.0f)));
            int i2 = C19748z.SequenceListView_fullColor;
            int i3 = C19735m.colorOnSurface;
            int a = C20941h.m49038a(context, o, i2, i3);
            this.f23993h = a;
            int a2 = C20941h.m49038a(context, o, C19748z.SequenceListView_behindMarkerColor, C19735m.colorOnSurfaceEmphasisMedium);
            this.f23994i = a2;
            float dimension3 = o.getDimension(C19748z.SequenceListView_fullWidth, UiUtils.m40247f(context.getResources(), 1.0f));
            Paint paint = new Paint(1);
            this.f23996k = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(a2);
            paint.setStrokeWidth(dimension3);
            Paint paint2 = new Paint(1);
            this.f23995j = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(a);
            paint2.setStrokeWidth(dimension3);
            int a3 = C20941h.m49038a(context, o, C19748z.SequenceListView_fillColor, C19735m.colorSurface);
            Paint paint3 = new Paint(1);
            this.f23997l = paint3;
            paint3.setStyle(Paint.Style.FILL_AND_STROKE);
            paint3.setColor(a3);
            int a4 = C20941h.m49038a(context, o, C19748z.SequenceListView_markerFillColor, C19735m.colorLive);
            Paint paint4 = new Paint(1);
            this.f23998m = paint4;
            paint4.setStyle(Paint.Style.FILL_AND_STROKE);
            paint4.setColor(a4);
            paint4.setStrokeWidth(dimension3);
            int a5 = C20941h.m49038a(context, o, C19748z.SequenceListView_markerFullColor, i3);
            Paint paint5 = new Paint(1);
            this.f23999n = paint5;
            paint5.setStyle(Paint.Style.FILL_AND_STROKE);
            paint5.setColor(a5);
            paint5.setStrokeWidth(dimension3);
            o.recycle();
            this.f23989d = UiUtils.m40248g(getContext(), 8.0f) + Math.round(dimension * 2.5f);
            if (isInEditMode()) {
                List<String> asList = Arrays.asList(new String[]{"Moorgate Station", "Tel Aviv Station", "Barbican Station"});
                List nCopies = Collections.nCopies(asList.size(), new Time(System.currentTimeMillis()));
                int size = asList.size();
                m18053d(0, size);
                if (asList.size() == nCopies.size()) {
                    this.f23987b = asList;
                    this.f24000o = 0;
                    this.f24001p = 50;
                    if (getChildCount() == size) {
                        int size2 = this.f23987b.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            mo24749c((ListItemView) getChildAt(i4), this.f23987b.get(i4), (Time) nCopies.get(i4), mo24748b(i4));
                        }
                        return;
                    }
                    removeAllViews();
                    for (int i5 = 0; i5 < size; i5++) {
                        ListItemView listItemView = new ListItemView(getContext(), (AttributeSet) null, 0);
                        listItemView.setPaddingRelative(this.f23989d, 0, 0, 0);
                        mo24749c(listItemView, asList.get(i5), (Time) nCopies.get(i5), mo24748b(i5));
                        addView(listItemView);
                    }
                    return;
                }
                Object[] objArr = {Integer.valueOf(asList.size()), Integer.valueOf(nCopies.size())};
                String str = C20964s0.f52718a;
                throw new IllegalArgumentException(String.format((Locale) null, "Names size must match arrivals size! names: %d, arrivals: %d", objArr));
            }
        } catch (Throwable th) {
            o.recycle();
            throw th;
        }
    }
}
