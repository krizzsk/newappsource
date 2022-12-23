package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Arrays;
import p090g1.C4732a;
import p242s1.C6315a;
import p242s1.C6333d0;
import p255t1.C6531g;
import p355ac.C13401b;
import p355ac.C13402c;
import p355ac.C13403d;
import p355ac.C13405f;
import p355ac.C13407h;
import p355ac.C13410k;
import p355ac.C13411l;
import p742qc.C19099c;

class ClockFaceView extends RadialViewGroup implements ClockHandView.C14209a {

    /* renamed from: k */
    public final ClockHandView f35672k;

    /* renamed from: l */
    public final Rect f35673l;

    /* renamed from: m */
    public final RectF f35674m;

    /* renamed from: n */
    public final SparseArray<TextView> f35675n;

    /* renamed from: o */
    public final C14208b f35676o;

    /* renamed from: p */
    public final int[] f35677p;

    /* renamed from: q */
    public final float[] f35678q;

    /* renamed from: r */
    public final int f35679r;

    /* renamed from: s */
    public final int f35680s;

    /* renamed from: t */
    public final int f35681t;

    /* renamed from: u */
    public final int f35682u;

    /* renamed from: v */
    public String[] f35683v;

    /* renamed from: w */
    public float f35684w;

    /* renamed from: x */
    public final ColorStateList f35685x;

    /* renamed from: com.google.android.material.timepicker.ClockFaceView$a */
    public class C14207a implements ViewTreeObserver.OnPreDrawListener {
        public C14207a() {
        }

        public final boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView clockFaceView = ClockFaceView.this;
            int height = ((ClockFaceView.this.getHeight() / 2) - clockFaceView.f35672k.f35689c) - clockFaceView.f35679r;
            if (height != clockFaceView.f35699i) {
                clockFaceView.f35699i = height;
                clockFaceView.mo42657l();
                ClockHandView clockHandView = clockFaceView.f35672k;
                clockHandView.f35697k = clockFaceView.f35699i;
                clockHandView.invalidate();
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockFaceView$b */
    public class C14208b extends C6315a {
        public C14208b() {
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C6531g gVar) {
            super.onInitializeAccessibilityNodeInfo(view, gVar);
            int intValue = ((Integer) view.getTag(C13405f.material_value_index)).intValue();
            if (intValue > 0) {
                View view2 = ClockFaceView.this.f35675n.get(intValue - 1);
                if (Build.VERSION.SDK_INT >= 22) {
                    gVar.f20334a.setTraversalAfter(view2);
                } else {
                    gVar.getClass();
                }
            }
            gVar.mo22645j(C6531g.C6534c.m15467a(0, 1, intValue, 1, view.isSelected()));
            gVar.f20334a.setClickable(true);
            gVar.mo22635b(C6531g.C6532a.f20339g);
        }

        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (i != 16) {
                return super.performAccessibilityAction(view, i, bundle);
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            float x = view.getX() + (((float) view.getWidth()) / 2.0f);
            float height = (((float) view.getHeight()) / 2.0f) + view.getY();
            ClockFaceView.this.f35672k.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, x, height, 0));
            ClockFaceView.this.f35672k.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, x, height, 0));
            return true;
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C13401b.materialClockStyle);
    }

    /* renamed from: b */
    public final void mo42647b(float f) {
        if (Math.abs(this.f35684w - f) > 0.001f) {
            this.f35684w = f;
            mo42649q();
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C6531g.C6533b.m15466a(1, this.f35683v.length, 1, false).f20352a);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mo42649q();
    }

    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (((float) this.f35682u) / Math.max(Math.max(((float) this.f35680s) / ((float) displayMetrics.heightPixels), ((float) this.f35681t) / ((float) displayMetrics.widthPixels)), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    /* renamed from: q */
    public final void mo42649q() {
        RadialGradient radialGradient;
        RectF rectF = this.f35672k.f35692f;
        for (int i = 0; i < this.f35675n.size(); i++) {
            TextView textView = this.f35675n.get(i);
            if (textView != null) {
                textView.getDrawingRect(this.f35673l);
                offsetDescendantRectToMyCoords(textView, this.f35673l);
                textView.setSelected(rectF.contains((float) this.f35673l.centerX(), (float) this.f35673l.centerY()));
                this.f35674m.set(this.f35673l);
                this.f35674m.offset((float) textView.getPaddingLeft(), (float) textView.getPaddingTop());
                if (!RectF.intersects(rectF, this.f35674m)) {
                    radialGradient = null;
                } else {
                    radialGradient = new RadialGradient(rectF.centerX() - this.f35674m.left, rectF.centerY() - this.f35674m.top, 0.5f * rectF.width(), this.f35677p, this.f35678q, Shader.TileMode.CLAMP);
                }
                textView.getPaint().setShader(radialGradient);
                textView.invalidate();
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35673l = new Rect();
        this.f35674m = new RectF();
        SparseArray<TextView> sparseArray = new SparseArray<>();
        this.f35675n = sparseArray;
        this.f35678q = new float[]{BitmapDescriptorFactory.HUE_RED, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13411l.ClockFaceView, i, C13410k.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList a = C19099c.m46247a(context, obtainStyledAttributes, C13411l.ClockFaceView_clockNumberTextColor);
        this.f35685x = a;
        LayoutInflater.from(context).inflate(C13407h.material_clockface_view, this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(C13405f.material_clock_hand);
        this.f35672k = clockHandView;
        this.f35679r = resources.getDimensionPixelSize(C13403d.material_clock_hand_padding);
        int colorForState = a.getColorForState(new int[]{16842913}, a.getDefaultColor());
        this.f35677p = new int[]{colorForState, colorForState, a.getDefaultColor()};
        clockHandView.f35688b.add(this);
        int defaultColor = C4732a.getColorStateList(context, C13402c.material_timepicker_clockface).getDefaultColor();
        ColorStateList a2 = C19099c.m46247a(context, obtainStyledAttributes, C13411l.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(a2 != null ? a2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new C14207a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f35676o = new C14208b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f35683v = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        for (int i2 = 0; i2 < Math.max(this.f35683v.length, size); i2++) {
            TextView textView = this.f35675n.get(i2);
            if (i2 >= this.f35683v.length) {
                removeView(textView);
                this.f35675n.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(C13407h.material_clockface_textview, this, false);
                    this.f35675n.put(i2, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.f35683v[i2]);
                textView.setTag(C13405f.material_value_index, Integer.valueOf(i2));
                C6333d0.m15029q(textView, this.f35676o);
                textView.setTextColor(this.f35685x);
            }
        }
        this.f35680s = resources.getDimensionPixelSize(C13403d.material_time_picker_minimum_screen_height);
        this.f35681t = resources.getDimensionPixelSize(C13403d.material_time_picker_minimum_screen_width);
        this.f35682u = resources.getDimensionPixelSize(C13403d.material_clock_size);
    }
}
