package p120i5;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.C1867f;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: i5.a */
public class C5280a<T> {

    /* renamed from: a */
    public final C1867f f17431a;

    /* renamed from: b */
    public final T f17432b;

    /* renamed from: c */
    public T f17433c;

    /* renamed from: d */
    public final Interpolator f17434d;

    /* renamed from: e */
    public final Interpolator f17435e;

    /* renamed from: f */
    public final Interpolator f17436f;

    /* renamed from: g */
    public final float f17437g;

    /* renamed from: h */
    public Float f17438h;

    /* renamed from: i */
    public float f17439i;

    /* renamed from: j */
    public float f17440j;

    /* renamed from: k */
    public int f17441k;

    /* renamed from: l */
    public int f17442l;

    /* renamed from: m */
    public float f17443m;

    /* renamed from: n */
    public float f17444n;

    /* renamed from: o */
    public PointF f17445o;

    /* renamed from: p */
    public PointF f17446p;

    public C5280a(C1867f fVar, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.f17439i = -3987645.8f;
        this.f17440j = -3987645.8f;
        this.f17441k = 784923401;
        this.f17442l = 784923401;
        this.f17443m = Float.MIN_VALUE;
        this.f17444n = Float.MIN_VALUE;
        this.f17445o = null;
        this.f17446p = null;
        this.f17431a = fVar;
        this.f17432b = t;
        this.f17433c = t2;
        this.f17434d = interpolator;
        this.f17435e = null;
        this.f17436f = null;
        this.f17437g = f;
        this.f17438h = f2;
    }

    /* renamed from: a */
    public final float mo21080a() {
        if (this.f17431a == null) {
            return 1.0f;
        }
        if (this.f17444n == Float.MIN_VALUE) {
            if (this.f17438h == null) {
                this.f17444n = 1.0f;
            } else {
                float b = mo21081b();
                float floatValue = this.f17438h.floatValue() - this.f17437g;
                C1867f fVar = this.f17431a;
                this.f17444n = (floatValue / (fVar.f6460l - fVar.f6459k)) + b;
            }
        }
        return this.f17444n;
    }

    /* renamed from: b */
    public final float mo21081b() {
        C1867f fVar = this.f17431a;
        if (fVar == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (this.f17443m == Float.MIN_VALUE) {
            float f = this.f17437g;
            float f2 = fVar.f6459k;
            this.f17443m = (f - f2) / (fVar.f6460l - f2);
        }
        return this.f17443m;
    }

    /* renamed from: c */
    public final boolean mo21082c() {
        return this.f17434d == null && this.f17435e == null && this.f17436f == null;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Keyframe{startValue=");
        k.append(this.f17432b);
        k.append(", endValue=");
        k.append(this.f17433c);
        k.append(", startFrame=");
        k.append(this.f17437g);
        k.append(", endFrame=");
        k.append(this.f17438h);
        k.append(", interpolator=");
        k.append(this.f17434d);
        k.append('}');
        return k.toString();
    }

    public C5280a(C1867f fVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f) {
        this.f17439i = -3987645.8f;
        this.f17440j = -3987645.8f;
        this.f17441k = 784923401;
        this.f17442l = 784923401;
        this.f17443m = Float.MIN_VALUE;
        this.f17444n = Float.MIN_VALUE;
        this.f17445o = null;
        this.f17446p = null;
        this.f17431a = fVar;
        this.f17432b = obj;
        this.f17433c = obj2;
        this.f17434d = null;
        this.f17435e = interpolator;
        this.f17436f = interpolator2;
        this.f17437g = f;
        this.f17438h = null;
    }

    public C5280a(C1867f fVar, PointF pointF, PointF pointF2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.f17439i = -3987645.8f;
        this.f17440j = -3987645.8f;
        this.f17441k = 784923401;
        this.f17442l = 784923401;
        this.f17443m = Float.MIN_VALUE;
        this.f17444n = Float.MIN_VALUE;
        this.f17445o = null;
        this.f17446p = null;
        this.f17431a = fVar;
        this.f17432b = pointF;
        this.f17433c = pointF2;
        this.f17434d = interpolator;
        this.f17435e = interpolator2;
        this.f17436f = interpolator3;
        this.f17437g = f;
        this.f17438h = f2;
    }

    public C5280a(T t) {
        this.f17439i = -3987645.8f;
        this.f17440j = -3987645.8f;
        this.f17441k = 784923401;
        this.f17442l = 784923401;
        this.f17443m = Float.MIN_VALUE;
        this.f17444n = Float.MIN_VALUE;
        this.f17445o = null;
        this.f17446p = null;
        this.f17431a = null;
        this.f17432b = t;
        this.f17433c = t;
        this.f17434d = null;
        this.f17435e = null;
        this.f17436f = null;
        this.f17437g = Float.MIN_VALUE;
        this.f17438h = Float.valueOf(Float.MAX_VALUE);
    }
}
