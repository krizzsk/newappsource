package p718pc;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.util.Property;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import com.google.android.play.core.assetpacks.C14256d1;
import java.util.Arrays;
import p068e2.C4525b;
import p188o.C5892b;
import p718pc.C18888b;

/* renamed from: pc.p */
public final class C18910p extends C5892b {

    /* renamed from: j */
    public static final C18911a f48134j = new C18911a();

    /* renamed from: d */
    public ObjectAnimator f48135d;

    /* renamed from: e */
    public C4525b f48136e;

    /* renamed from: f */
    public final LinearProgressIndicatorSpec f48137f;

    /* renamed from: g */
    public int f48138g = 1;

    /* renamed from: h */
    public boolean f48139h;

    /* renamed from: i */
    public float f48140i;

    /* renamed from: pc.p$a */
    public class C18911a extends Property<C18910p, Float> {
        public C18911a() {
            super(Float.class, "animationFraction");
        }

        public final Object get(Object obj) {
            return Float.valueOf(((C18910p) obj).f48140i);
        }

        public final void set(Object obj, Object obj2) {
            C18910p pVar = (C18910p) obj;
            float floatValue = ((Float) obj2).floatValue();
            pVar.f48140i = floatValue;
            float[] fArr = (float[]) pVar.f18962b;
            fArr[0] = 0.0f;
            float f = ((float) (((int) (floatValue * 333.0f)) - 0)) / ((float) 667);
            float interpolation = pVar.f48136e.getInterpolation(f);
            fArr[2] = interpolation;
            fArr[1] = interpolation;
            float[] fArr2 = (float[]) pVar.f18962b;
            float interpolation2 = pVar.f48136e.getInterpolation(f + 0.49925038f);
            fArr2[4] = interpolation2;
            fArr2[3] = interpolation2;
            float[] fArr3 = (float[]) pVar.f18962b;
            fArr3[5] = 1.0f;
            if (pVar.f48139h && fArr3[3] < 1.0f) {
                int[] iArr = (int[]) pVar.f18963c;
                iArr[2] = iArr[1];
                iArr[1] = iArr[0];
                iArr[0] = C14256d1.m35483a(pVar.f48137f.f48084c[pVar.f48138g], ((C18907m) pVar.f18961a).f48125k);
                pVar.f48139h = false;
            }
            ((C18907m) pVar.f18961a).invalidateSelf();
        }
    }

    public C18910p(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(3);
        this.f48137f = linearProgressIndicatorSpec;
        this.f48136e = new C4525b();
    }

    /* renamed from: c */
    public final void mo21794c() {
        ObjectAnimator objectAnimator = this.f48135d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: f */
    public final void mo21797f() {
        mo51421k();
    }

    /* renamed from: g */
    public final void mo21798g(C18888b.C18891c cVar) {
    }

    /* renamed from: h */
    public final void mo21799h() {
    }

    /* renamed from: i */
    public final void mo21800i() {
        if (this.f48135d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f48134j, new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f});
            this.f48135d = ofFloat;
            ofFloat.setDuration(333);
            this.f48135d.setInterpolator((TimeInterpolator) null);
            this.f48135d.setRepeatCount(-1);
            this.f48135d.addListener(new C18909o(this));
        }
        mo51421k();
        this.f48135d.start();
    }

    /* renamed from: j */
    public final void mo21801j() {
    }

    /* renamed from: k */
    public final void mo51421k() {
        this.f48139h = true;
        this.f48138g = 1;
        Arrays.fill((int[]) this.f18963c, C14256d1.m35483a(this.f48137f.f48084c[0], ((C18907m) this.f18961a).f48125k));
    }
}
