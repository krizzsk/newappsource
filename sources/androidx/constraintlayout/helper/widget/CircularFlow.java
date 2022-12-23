package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import java.util.Arrays;
import p002a1.C0042d;

public class CircularFlow extends VirtualLayout {

    /* renamed from: v */
    public static int f2614v;

    /* renamed from: w */
    public static float f2615w;

    /* renamed from: l */
    public ConstraintLayout f2616l;

    /* renamed from: m */
    public int f2617m;

    /* renamed from: n */
    public float[] f2618n;

    /* renamed from: o */
    public int[] f2619o;

    /* renamed from: p */
    public int f2620p;

    /* renamed from: q */
    public int f2621q;

    /* renamed from: r */
    public String f2622r;

    /* renamed from: s */
    public String f2623s;

    /* renamed from: t */
    public Float f2624t;

    /* renamed from: u */
    public Integer f2625u;

    public CircularFlow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void setAngles(String str) {
        if (str != null) {
            int i = 0;
            this.f2621q = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    mo2871v(str.substring(i).trim());
                    return;
                } else {
                    mo2871v(str.substring(i, indexOf).trim());
                    i = indexOf + 1;
                }
            }
        }
    }

    private void setRadius(String str) {
        if (str != null) {
            int i = 0;
            this.f2620p = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    mo2872w(str.substring(i).trim());
                    return;
                } else {
                    mo2872w(str.substring(i, indexOf).trim());
                    i = indexOf + 1;
                }
            }
        }
    }

    public float[] getAngles() {
        return Arrays.copyOf(this.f2618n, this.f2621q);
    }

    public int[] getRadius() {
        return Arrays.copyOf(this.f2619o, this.f2620p);
    }

    /* renamed from: n */
    public final void mo2868n(AttributeSet attributeSet) {
        super.mo2868n(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0042d.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0042d.ConstraintLayout_Layout_circularflow_viewCenter) {
                    this.f2617m = obtainStyledAttributes.getResourceId(index, 0);
                } else if (index == C0042d.ConstraintLayout_Layout_circularflow_angles) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f2622r = string;
                    setAngles(string);
                } else if (index == C0042d.ConstraintLayout_Layout_circularflow_radiusInDP) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f2623s = string2;
                    setRadius(string2);
                } else if (index == C0042d.ConstraintLayout_Layout_circularflow_defaultAngle) {
                    Float valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, f2615w));
                    this.f2624t = valueOf;
                    setDefaultAngle(valueOf.floatValue());
                } else if (index == C0042d.ConstraintLayout_Layout_circularflow_defaultRadius) {
                    Integer valueOf2 = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(index, f2614v));
                    this.f2625u = valueOf2;
                    setDefaultRadius(valueOf2.intValue());
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f2622r;
        if (str != null) {
            this.f2618n = new float[1];
            setAngles(str);
        }
        String str2 = this.f2623s;
        if (str2 != null) {
            this.f2619o = new int[1];
            setRadius(str2);
        }
        Float f = this.f2624t;
        if (f != null) {
            setDefaultAngle(f.floatValue());
        }
        Integer num = this.f2625u;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        this.f2616l = (ConstraintLayout) getParent();
        for (int i = 0; i < this.f2998c; i++) {
            View viewById = this.f2616l.getViewById(this.f2997b[i]);
            if (viewById != null) {
                int i2 = f2614v;
                float f2 = f2615w;
                int[] iArr = this.f2619o;
                if (iArr == null || i >= iArr.length) {
                    Integer num2 = this.f2625u;
                    if (num2 == null || num2.intValue() == -1) {
                        String str3 = this.f3004i.get(Integer.valueOf(viewById.getId()));
                    } else {
                        this.f2620p++;
                        if (this.f2619o == null) {
                            this.f2619o = new int[1];
                        }
                        int[] radius = getRadius();
                        this.f2619o = radius;
                        radius[this.f2620p - 1] = i2;
                    }
                } else {
                    i2 = iArr[i];
                }
                float[] fArr = this.f2618n;
                if (fArr == null || i >= fArr.length) {
                    Float f3 = this.f2624t;
                    if (f3 == null || f3.floatValue() == -1.0f) {
                        String str4 = this.f3004i.get(Integer.valueOf(viewById.getId()));
                    } else {
                        this.f2621q++;
                        if (this.f2618n == null) {
                            this.f2618n = new float[1];
                        }
                        float[] angles = getAngles();
                        this.f2618n = angles;
                        angles[this.f2621q - 1] = f2;
                    }
                } else {
                    f2 = fArr[i];
                }
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) viewById.getLayoutParams();
                layoutParams.f3065r = f2;
                layoutParams.f3061p = this.f2617m;
                layoutParams.f3063q = i2;
                viewById.setLayoutParams(layoutParams);
            }
        }
        mo3158h();
    }

    public void setDefaultAngle(float f) {
        f2615w = f;
    }

    public void setDefaultRadius(int i) {
        f2614v = i;
    }

    /* renamed from: v */
    public final void mo2871v(String str) {
        float[] fArr;
        if (str != null && str.length() != 0 && this.f2999d != null && (fArr = this.f2618n) != null) {
            if (this.f2621q + 1 > fArr.length) {
                this.f2618n = Arrays.copyOf(fArr, fArr.length + 1);
            }
            this.f2618n[this.f2621q] = (float) Integer.parseInt(str);
            this.f2621q++;
        }
    }

    /* renamed from: w */
    public final void mo2872w(String str) {
        int[] iArr;
        if (str != null && str.length() != 0 && this.f2999d != null && (iArr = this.f2619o) != null) {
            if (this.f2620p + 1 > iArr.length) {
                this.f2619o = Arrays.copyOf(iArr, iArr.length + 1);
            }
            this.f2619o[this.f2620p] = (int) (((float) Integer.parseInt(str)) * this.f2999d.getResources().getDisplayMetrics().density);
            this.f2620p++;
        }
    }

    public CircularFlow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
