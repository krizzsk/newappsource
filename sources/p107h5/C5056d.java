package p107h5;

import android.animation.Animator;
import android.graphics.PointF;
import android.view.Choreographer;
import com.airbnb.lottie.C1867f;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import p584jl.C17885a;

/* renamed from: h5.d */
public final class C5056d extends C5053a implements Choreographer.FrameCallback {

    /* renamed from: d */
    public float f17046d = 1.0f;

    /* renamed from: e */
    public boolean f17047e = false;

    /* renamed from: f */
    public long f17048f = 0;

    /* renamed from: g */
    public float f17049g = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: h */
    public int f17050h = 0;

    /* renamed from: i */
    public float f17051i = -2.14748365E9f;

    /* renamed from: j */
    public float f17052j = 2.14748365E9f;

    /* renamed from: k */
    public C1867f f17053k;

    /* renamed from: l */
    public boolean f17054l = false;

    public final void cancel() {
        Iterator it = this.f17043c.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        mo20807j(true);
    }

    public final void doFrame(long j) {
        boolean z;
        float f;
        float f2;
        if (this.f17054l) {
            mo20807j(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        C1867f fVar = this.f17053k;
        if (fVar != null && this.f17054l) {
            long j2 = this.f17048f;
            long j3 = 0;
            if (j2 != 0) {
                j3 = j - j2;
            }
            float abs = ((float) j3) / ((1.0E9f / fVar.f6461m) / Math.abs(this.f17046d));
            float f3 = this.f17049g;
            if (mo20805i()) {
                abs = -abs;
            }
            float f4 = f3 + abs;
            this.f17049g = f4;
            float h = mo20804h();
            float g = mo20800g();
            PointF pointF = C5058f.f17056a;
            if (f4 < h || f4 > g) {
                z = false;
            } else {
                z = true;
            }
            boolean z2 = !z;
            this.f17049g = C5058f.m12905b(this.f17049g, mo20804h(), mo20800g());
            this.f17048f = j;
            mo20789f();
            if (z2) {
                if (getRepeatCount() == -1 || this.f17050h < getRepeatCount()) {
                    Iterator it = this.f17043c.iterator();
                    while (it.hasNext()) {
                        ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
                    }
                    this.f17050h++;
                    if (getRepeatMode() == 2) {
                        this.f17047e = !this.f17047e;
                        this.f17046d = -this.f17046d;
                    } else {
                        if (mo20805i()) {
                            f = mo20800g();
                        } else {
                            f = mo20804h();
                        }
                        this.f17049g = f;
                    }
                    this.f17048f = j;
                } else {
                    if (this.f17046d < BitmapDescriptorFactory.HUE_RED) {
                        f2 = mo20804h();
                    } else {
                        f2 = mo20800g();
                    }
                    this.f17049g = f2;
                    mo20807j(true);
                    mo20786a(mo20805i());
                }
            }
            if (this.f17053k != null) {
                float f5 = this.f17049g;
                if (f5 < this.f17051i || f5 > this.f17052j) {
                    throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", new Object[]{Float.valueOf(this.f17051i), Float.valueOf(this.f17052j), Float.valueOf(this.f17049g)}));
                }
            }
            C17885a.m44412M();
        }
    }

    /* renamed from: g */
    public final float mo20800g() {
        C1867f fVar = this.f17053k;
        if (fVar == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f = this.f17052j;
        if (f == 2.14748365E9f) {
            return fVar.f6460l;
        }
        return f;
    }

    public final float getAnimatedFraction() {
        float h;
        float g;
        float h2;
        if (this.f17053k == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (mo20805i()) {
            h = mo20800g() - this.f17049g;
            g = mo20800g();
            h2 = mo20804h();
        } else {
            h = this.f17049g - mo20804h();
            g = mo20800g();
            h2 = mo20804h();
        }
        return h / (g - h2);
    }

    public final Object getAnimatedValue() {
        float f;
        C1867f fVar = this.f17053k;
        if (fVar == null) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            float f2 = this.f17049g;
            float f3 = fVar.f6459k;
            f = (f2 - f3) / (fVar.f6460l - f3);
        }
        return Float.valueOf(f);
    }

    public final long getDuration() {
        C1867f fVar = this.f17053k;
        if (fVar == null) {
            return 0;
        }
        return (long) fVar.mo6756b();
    }

    /* renamed from: h */
    public final float mo20804h() {
        C1867f fVar = this.f17053k;
        if (fVar == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f = this.f17051i;
        if (f == -2.14748365E9f) {
            return fVar.f6459k;
        }
        return f;
    }

    /* renamed from: i */
    public final boolean mo20805i() {
        return this.f17046d < BitmapDescriptorFactory.HUE_RED;
    }

    public final boolean isRunning() {
        return this.f17054l;
    }

    /* renamed from: j */
    public final void mo20807j(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.f17054l = false;
        }
    }

    /* renamed from: k */
    public final void mo20808k(float f) {
        if (this.f17049g != f) {
            this.f17049g = C5058f.m12905b(f, mo20804h(), mo20800g());
            this.f17048f = 0;
            mo20789f();
        }
    }

    /* renamed from: l */
    public final void mo20809l(float f, float f2) {
        float f3;
        float f4;
        if (f <= f2) {
            C1867f fVar = this.f17053k;
            if (fVar == null) {
                f3 = -3.4028235E38f;
            } else {
                f3 = fVar.f6459k;
            }
            if (fVar == null) {
                f4 = Float.MAX_VALUE;
            } else {
                f4 = fVar.f6460l;
            }
            float b = C5058f.m12905b(f, f3, f4);
            float b2 = C5058f.m12905b(f2, f3, f4);
            if (b != this.f17051i || b2 != this.f17052j) {
                this.f17051i = b;
                this.f17052j = b2;
                mo20808k((float) ((int) C5058f.m12905b(this.f17049g, b, b2)));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", new Object[]{Float.valueOf(f), Float.valueOf(f2)}));
    }

    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.f17047e) {
            this.f17047e = false;
            this.f17046d = -this.f17046d;
        }
    }
}
