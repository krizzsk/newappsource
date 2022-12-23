package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p002a1.C0042d;

/* renamed from: androidx.constraintlayout.motion.widget.b */
public final class C0721b {

    /* renamed from: E */
    public static final float[][] f2798E = {new float[]{0.5f, BitmapDescriptorFactory.HUE_RED}, new float[]{BitmapDescriptorFactory.HUE_RED, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{BitmapDescriptorFactory.HUE_RED, 0.5f}, new float[]{1.0f, 0.5f}};

    /* renamed from: F */
    public static final float[][] f2799F = {new float[]{BitmapDescriptorFactory.HUE_RED, -1.0f}, new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f}, new float[]{-1.0f, BitmapDescriptorFactory.HUE_RED}, new float[]{1.0f, BitmapDescriptorFactory.HUE_RED}, new float[]{-1.0f, BitmapDescriptorFactory.HUE_RED}, new float[]{1.0f, BitmapDescriptorFactory.HUE_RED}};

    /* renamed from: A */
    public float f2800A = Float.NaN;

    /* renamed from: B */
    public float f2801B = Float.NaN;

    /* renamed from: C */
    public int f2802C = 0;

    /* renamed from: D */
    public int f2803D = 0;

    /* renamed from: a */
    public int f2804a = 0;

    /* renamed from: b */
    public int f2805b = 0;

    /* renamed from: c */
    public int f2806c = 0;

    /* renamed from: d */
    public int f2807d = -1;

    /* renamed from: e */
    public int f2808e = -1;

    /* renamed from: f */
    public int f2809f = -1;

    /* renamed from: g */
    public float f2810g = 0.5f;

    /* renamed from: h */
    public float f2811h = 0.5f;

    /* renamed from: i */
    public int f2812i = -1;

    /* renamed from: j */
    public boolean f2813j = false;

    /* renamed from: k */
    public float f2814k = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: l */
    public float f2815l = 1.0f;

    /* renamed from: m */
    public boolean f2816m = false;

    /* renamed from: n */
    public float[] f2817n = new float[2];

    /* renamed from: o */
    public int[] f2818o = new int[2];

    /* renamed from: p */
    public float f2819p;

    /* renamed from: q */
    public float f2820q;

    /* renamed from: r */
    public final MotionLayout f2821r;

    /* renamed from: s */
    public float f2822s = 4.0f;

    /* renamed from: t */
    public float f2823t = 1.2f;

    /* renamed from: u */
    public boolean f2824u = true;

    /* renamed from: v */
    public float f2825v = 1.0f;

    /* renamed from: w */
    public int f2826w = 0;

    /* renamed from: x */
    public float f2827x = 10.0f;

    /* renamed from: y */
    public float f2828y = 10.0f;

    /* renamed from: z */
    public float f2829z = 1.0f;

    public C0721b(Context context, MotionLayout motionLayout, XmlResourceParser xmlResourceParser) {
        this.f2821r = motionLayout;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C0042d.OnSwipe);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C0042d.OnSwipe_touchAnchorId) {
                this.f2807d = obtainStyledAttributes.getResourceId(index, this.f2807d);
            } else if (index == C0042d.OnSwipe_touchAnchorSide) {
                int i2 = obtainStyledAttributes.getInt(index, this.f2804a);
                this.f2804a = i2;
                float[] fArr = f2798E[i2];
                this.f2811h = fArr[0];
                this.f2810g = fArr[1];
            } else if (index == C0042d.OnSwipe_dragDirection) {
                int i3 = obtainStyledAttributes.getInt(index, this.f2805b);
                this.f2805b = i3;
                float[][] fArr2 = f2799F;
                if (i3 < 6) {
                    float[] fArr3 = fArr2[i3];
                    this.f2814k = fArr3[0];
                    this.f2815l = fArr3[1];
                } else {
                    this.f2815l = Float.NaN;
                    this.f2814k = Float.NaN;
                    this.f2813j = true;
                }
            } else if (index == C0042d.OnSwipe_maxVelocity) {
                this.f2822s = obtainStyledAttributes.getFloat(index, this.f2822s);
            } else if (index == C0042d.OnSwipe_maxAcceleration) {
                this.f2823t = obtainStyledAttributes.getFloat(index, this.f2823t);
            } else if (index == C0042d.OnSwipe_moveWhenScrollAtTop) {
                this.f2824u = obtainStyledAttributes.getBoolean(index, this.f2824u);
            } else if (index == C0042d.OnSwipe_dragScale) {
                this.f2825v = obtainStyledAttributes.getFloat(index, this.f2825v);
            } else if (index == C0042d.OnSwipe_dragThreshold) {
                this.f2827x = obtainStyledAttributes.getFloat(index, this.f2827x);
            } else if (index == C0042d.OnSwipe_touchRegionId) {
                this.f2808e = obtainStyledAttributes.getResourceId(index, this.f2808e);
            } else if (index == C0042d.OnSwipe_onTouchUp) {
                this.f2806c = obtainStyledAttributes.getInt(index, this.f2806c);
            } else if (index == C0042d.OnSwipe_nestedScrollFlags) {
                this.f2826w = obtainStyledAttributes.getInteger(index, 0);
            } else if (index == C0042d.OnSwipe_limitBoundsTo) {
                this.f2809f = obtainStyledAttributes.getResourceId(index, 0);
            } else if (index == C0042d.OnSwipe_rotationCenterId) {
                this.f2812i = obtainStyledAttributes.getResourceId(index, this.f2812i);
            } else if (index == C0042d.OnSwipe_springDamping) {
                this.f2828y = obtainStyledAttributes.getFloat(index, this.f2828y);
            } else if (index == C0042d.OnSwipe_springMass) {
                this.f2829z = obtainStyledAttributes.getFloat(index, this.f2829z);
            } else if (index == C0042d.OnSwipe_springStiffness) {
                this.f2800A = obtainStyledAttributes.getFloat(index, this.f2800A);
            } else if (index == C0042d.OnSwipe_springStopThreshold) {
                this.f2801B = obtainStyledAttributes.getFloat(index, this.f2801B);
            } else if (index == C0042d.OnSwipe_springBoundary) {
                this.f2802C = obtainStyledAttributes.getInt(index, this.f2802C);
            } else if (index == C0042d.OnSwipe_autoCompleteMode) {
                this.f2803D = obtainStyledAttributes.getInt(index, this.f2803D);
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final RectF mo3018a(MotionLayout motionLayout, RectF rectF) {
        View findViewById;
        int i = this.f2809f;
        if (i == -1 || (findViewById = motionLayout.findViewById(i)) == null) {
            return null;
        }
        rectF.set((float) findViewById.getLeft(), (float) findViewById.getTop(), (float) findViewById.getRight(), (float) findViewById.getBottom());
        return rectF;
    }

    /* renamed from: b */
    public final RectF mo3019b(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i = this.f2808e;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set((float) findViewById.getLeft(), (float) findViewById.getTop(), (float) findViewById.getRight(), (float) findViewById.getBottom());
        return rectF;
    }

    /* renamed from: c */
    public final void mo3020c(boolean z) {
        if (z) {
            float[][] fArr = f2799F;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = f2798E;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = f2799F;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = f2798E;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[] fArr5 = f2798E[this.f2804a];
        this.f2811h = fArr5[0];
        this.f2810g = fArr5[1];
        int i = this.f2805b;
        float[][] fArr6 = f2799F;
        if (i < 6) {
            float[] fArr7 = fArr6[i];
            this.f2814k = fArr7[0];
            this.f2815l = fArr7[1];
        }
    }

    public final String toString() {
        if (Float.isNaN(this.f2814k)) {
            return "rotation";
        }
        return this.f2814k + " , " + this.f2815l;
    }
}
