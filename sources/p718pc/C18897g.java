package p718pc;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.util.Property;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import com.google.android.play.core.assetpacks.C14256d1;
import p004a3.C0050b;
import p068e2.C4525b;
import p188o.C5892b;
import p380bc.C13578b;
import p718pc.C18888b;

/* renamed from: pc.g */
public final class C18897g extends C5892b {

    /* renamed from: l */
    public static final int[] f48094l = {0, 1350, 2700, 4050};

    /* renamed from: m */
    public static final int[] f48095m = {667, 2017, 3367, 4717};

    /* renamed from: n */
    public static final int[] f48096n = {1000, 2350, 3700, 5050};

    /* renamed from: o */
    public static final C18898a f48097o = new C18898a();

    /* renamed from: p */
    public static final C18899b f48098p = new C18899b();

    /* renamed from: d */
    public ObjectAnimator f48099d;

    /* renamed from: e */
    public ObjectAnimator f48100e;

    /* renamed from: f */
    public final C4525b f48101f;

    /* renamed from: g */
    public final CircularProgressIndicatorSpec f48102g;

    /* renamed from: h */
    public int f48103h = 0;

    /* renamed from: i */
    public float f48104i;

    /* renamed from: j */
    public float f48105j;

    /* renamed from: k */
    public C0050b f48106k = null;

    /* renamed from: pc.g$a */
    public class C18898a extends Property<C18897g, Float> {
        public C18898a() {
            super(Float.class, "animationFraction");
        }

        public final Object get(Object obj) {
            return Float.valueOf(((C18897g) obj).f48104i);
        }

        public final void set(Object obj, Object obj2) {
            C18897g gVar = (C18897g) obj;
            float floatValue = ((Float) obj2).floatValue();
            gVar.f48104i = floatValue;
            int i = (int) (5400.0f * floatValue);
            float[] fArr = (float[]) gVar.f18962b;
            float f = floatValue * 1520.0f;
            fArr[0] = -20.0f + f;
            fArr[1] = f;
            for (int i2 = 0; i2 < 4; i2++) {
                float f2 = (float) 667;
                float[] fArr2 = (float[]) gVar.f18962b;
                fArr2[1] = (gVar.f48101f.getInterpolation(((float) (i - C18897g.f48094l[i2])) / f2) * 250.0f) + fArr2[1];
                float f3 = ((float) (i - C18897g.f48095m[i2])) / f2;
                float[] fArr3 = (float[]) gVar.f18962b;
                fArr3[0] = (gVar.f48101f.getInterpolation(f3) * 250.0f) + fArr3[0];
            }
            float[] fArr4 = (float[]) gVar.f18962b;
            float f4 = fArr4[0];
            float f5 = fArr4[1];
            float f6 = ((f5 - f4) * gVar.f48105j) + f4;
            fArr4[0] = f6;
            fArr4[0] = f6 / 360.0f;
            fArr4[1] = f5 / 360.0f;
            int i3 = 0;
            while (true) {
                if (i3 >= 4) {
                    break;
                }
                float f7 = ((float) (i - C18897g.f48096n[i3])) / ((float) 333);
                if (f7 >= BitmapDescriptorFactory.HUE_RED && f7 <= 1.0f) {
                    int i4 = i3 + gVar.f48103h;
                    int[] iArr = gVar.f48102g.f48084c;
                    int length = i4 % iArr.length;
                    int a = C14256d1.m35483a(iArr[length], ((C18907m) gVar.f18961a).f48125k);
                    int a2 = C14256d1.m35483a(gVar.f48102g.f48084c[(length + 1) % iArr.length], ((C18907m) gVar.f18961a).f48125k);
                    ((int[]) gVar.f18963c)[0] = C13578b.m33995a(gVar.f48101f.getInterpolation(f7), Integer.valueOf(a), Integer.valueOf(a2)).intValue();
                    break;
                }
                i3++;
            }
            ((C18907m) gVar.f18961a).invalidateSelf();
        }
    }

    /* renamed from: pc.g$b */
    public class C18899b extends Property<C18897g, Float> {
        public C18899b() {
            super(Float.class, "completeEndFraction");
        }

        public final Object get(Object obj) {
            return Float.valueOf(((C18897g) obj).f48105j);
        }

        public final void set(Object obj, Object obj2) {
            ((C18897g) obj).f48105j = ((Float) obj2).floatValue();
        }
    }

    public C18897g(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.f48102g = circularProgressIndicatorSpec;
        this.f48101f = new C4525b();
    }

    /* renamed from: c */
    public final void mo21794c() {
        ObjectAnimator objectAnimator = this.f48099d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: f */
    public final void mo21797f() {
        mo51389k();
    }

    /* renamed from: g */
    public final void mo21798g(C18888b.C18891c cVar) {
        this.f48106k = cVar;
    }

    /* renamed from: h */
    public final void mo21799h() {
        ObjectAnimator objectAnimator = this.f48100e;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            if (((C18907m) this.f18961a).isVisible()) {
                this.f48100e.start();
            } else {
                mo21794c();
            }
        }
    }

    /* renamed from: i */
    public final void mo21800i() {
        if (this.f48099d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f48097o, new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f});
            this.f48099d = ofFloat;
            ofFloat.setDuration(5400);
            this.f48099d.setInterpolator((TimeInterpolator) null);
            this.f48099d.setRepeatCount(-1);
            this.f48099d.addListener(new C18895e(this));
        }
        if (this.f48100e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f48098p, new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f});
            this.f48100e = ofFloat2;
            ofFloat2.setDuration(333);
            this.f48100e.setInterpolator(this.f48101f);
            this.f48100e.addListener(new C18896f(this));
        }
        mo51389k();
        this.f48099d.start();
    }

    /* renamed from: j */
    public final void mo21801j() {
        this.f48106k = null;
    }

    /* renamed from: k */
    public final void mo51389k() {
        this.f48103h = 0;
        ((int[]) this.f18963c)[0] = C14256d1.m35483a(this.f48102g.f48084c[0], ((C18907m) this.f18961a).f48125k);
        this.f48105j = BitmapDescriptorFactory.HUE_RED;
    }
}
