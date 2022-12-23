package com.moovit.app.reports.service;

import a00.C13382a;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Space;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.commons.utils.UiUtils;
import com.tranzmate.R;
import java.util.ArrayList;
import p259t5.C6592b;
import p567iq.C17636c;
import p977zz.C20941h;

public class ReportBarView extends FrameLayout {

    /* renamed from: n */
    public static final LinearLayout.LayoutParams f39221n = new LinearLayout.LayoutParams(0, -1, 1.0f);

    /* renamed from: b */
    public final C6592b f39222b;

    /* renamed from: c */
    public int f39223c;

    /* renamed from: d */
    public int f39224d;

    /* renamed from: e */
    public int f39225e;

    /* renamed from: f */
    public int f39226f;

    /* renamed from: g */
    public Integer[] f39227g;

    /* renamed from: h */
    public int f39228h;

    /* renamed from: i */
    public int[] f39229i;

    /* renamed from: j */
    public final ProgressBar f39230j;

    /* renamed from: k */
    public final LinearLayout f39231k;

    /* renamed from: l */
    public AnimatorSet f39232l;

    /* renamed from: m */
    public C15217b f39233m;

    /* renamed from: com.moovit.app.reports.service.ReportBarView$a */
    public class C15216a extends Drawable {

        /* renamed from: a */
        public final int f39234a;

        /* renamed from: b */
        public final float f39235b;

        /* renamed from: c */
        public final float f39236c;

        /* renamed from: d */
        public final Path f39237d = new Path();

        /* renamed from: e */
        public final Paint f39238e;

        public C15216a(int i, float f, float f2, int i2) {
            this.f39234a = i;
            this.f39235b = f;
            this.f39236c = f2;
            Paint paint = new Paint(1);
            this.f39238e = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(f2);
            paint.setColor(i2);
        }

        public final void draw(Canvas canvas) {
            canvas.save();
            canvas.drawPath(this.f39237d, this.f39238e);
            canvas.restore();
        }

        public final int getOpacity() {
            return -1;
        }

        public final void onBoundsChange(Rect rect) {
            super.onBoundsChange(rect);
            float width = ((float) rect.width()) - this.f39236c;
            int i = this.f39234a;
            float f = (width - ((((float) i) * this.f39235b) * 2.0f)) / ((float) (i - 1));
            float exactCenterY = rect.exactCenterY();
            float f2 = this.f39236c * 0.5f;
            this.f39237d.reset();
            this.f39237d.moveTo(f2, exactCenterY);
            int i2 = this.f39234a;
            int[] iArr = new int[i2];
            int i3 = i2 - 1;
            for (int i4 = 0; i4 < this.f39234a; i4++) {
                float f3 = this.f39235b;
                float f4 = f2 + f3;
                this.f39237d.addCircle(f4, exactCenterY, f3, Path.Direction.CW);
                f2 = f4 + this.f39235b;
                iArr[i4] = Math.round(f2);
                if (i4 != i3) {
                    this.f39237d.moveTo(f2, exactCenterY);
                    f2 += f;
                    this.f39237d.lineTo(f2, exactCenterY);
                }
            }
            ReportBarView reportBarView = ReportBarView.this;
            reportBarView.f39229i = iArr;
            if (i2 != 0) {
                reportBarView.f39230j.setMax(iArr[i2 - 1]);
                reportBarView.f39230j.setProgress(iArr[reportBarView.f39228h]);
            }
        }

        public final void setAlpha(int i) {
            this.f39238e.setAlpha(i);
        }

        public final void setColorFilter(ColorFilter colorFilter) {
            this.f39238e.setColorFilter(colorFilter);
        }
    }

    /* renamed from: com.moovit.app.reports.service.ReportBarView$b */
    public interface C15217b {
    }

    public ReportBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setOptionBackground(ImageView imageView) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setStroke(this.f39224d, this.f39225e);
        gradientDrawable.setColor(C20941h.m49043f(R.attr.colorSurface, imageView.getContext()));
        imageView.setBackground(gradientDrawable);
    }

    /* renamed from: a */
    public final void mo45711a() {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new C15216a(this.f39227g.length, (float) this.f39223c, (float) this.f39224d, this.f39226f), new ClipDrawable(new C15216a(this.f39227g.length, (float) this.f39223c, (float) this.f39224d, this.f39225e), 8388611, 1)});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908301);
        this.f39230j.setProgressDrawable(layerDrawable);
    }

    /* JADX INFO: finally extract failed */
    public void setOptionsArray(int i) {
        float f;
        if (i == 0) {
            this.f39227g = new Integer[0];
            return;
        }
        TypedArray obtainTypedArray = getResources().obtainTypedArray(i);
        try {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                arrayList.add(Integer.valueOf(obtainTypedArray.getResourceId(i2, 0)));
            }
            Integer[] numArr = new Integer[arrayList.size()];
            this.f39227g = numArr;
            arrayList.toArray(numArr);
            obtainTypedArray.recycle();
            Context context = getContext();
            this.f39231k.removeAllViews();
            this.f39231k.setWeightSum((float) (this.f39227g.length - 1));
            LayoutInflater from = LayoutInflater.from(getContext());
            int length = this.f39227g.length;
            int i3 = 0;
            boolean z = true;
            int i4 = 0;
            while (i3 < length) {
                ImageView imageView = (ImageView) from.inflate(R.layout.report_bar_item_view, this.f39231k, false);
                setOptionBackground(imageView);
                imageView.setImageResource(this.f39227g[i3].intValue());
                imageView.setContentDescription(getContext().getString(R.string.voiceover_one_outof_another, new Object[]{Integer.valueOf(i3), Integer.valueOf(length)}));
                imageView.setOnClickListener(this.f39222b);
                if (!z) {
                    if (C13382a.m33671g(getContext())) {
                        f = BitmapDescriptorFactory.HUE_RED;
                    } else {
                        f = 0.01f;
                    }
                    imageView.setScaleX(f);
                    imageView.setScaleY(f);
                    this.f39231k.addView(new Space(context), f39221n);
                }
                imageView.setTag(Integer.valueOf(i4));
                this.f39231k.addView(imageView);
                i3++;
                i4++;
                z = false;
            }
            this.f39228h = 0;
            mo45711a();
        } catch (Throwable th) {
            obtainTypedArray.recycle();
            throw th;
        }
    }

    public void setReportOptionChangeListener(C15217b bVar) {
        this.f39233m = bVar;
    }

    public ReportBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f39222b = new C6592b(this, 22);
        this.f39228h = 0;
        this.f39232l = null;
        LayoutInflater.from(context).inflate(R.layout.report_bar_view, this, true);
        this.f39230j = (ProgressBar) findViewById(R.id.progress);
        this.f39231k = (LinearLayout) findViewById(R.id.options);
        TypedArray o = UiUtils.m40256o(context, attributeSet, C17636c.ReportBarView, i);
        try {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.report_bar_circle_radius);
            this.f39223c = dimensionPixelSize;
            this.f39223c = o.getDimensionPixelSize(0, dimensionPixelSize);
            int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.report_bar_stroke_size);
            this.f39224d = dimensionPixelSize2;
            this.f39224d = o.getDimensionPixelSize(4, dimensionPixelSize2);
            setOptionsArray(o.getResourceId(1, 0));
            ColorStateList b = C20941h.m49039b(context, o, 3);
            this.f39225e = b != null ? b.getDefaultColor() : C20941h.m49043f(R.attr.colorPrimary, context);
            ColorStateList b2 = C20941h.m49039b(context, o, 2);
            this.f39226f = b2 != null ? b2.getDefaultColor() : C20941h.m49043f(R.attr.colorOnSurfaceEmphasisLow, context);
            mo45711a();
        } finally {
            o.recycle();
        }
    }
}
