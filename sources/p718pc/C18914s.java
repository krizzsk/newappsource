package p718pc;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Property;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import com.google.android.play.core.assetpacks.C14256d1;
import com.usebutton.sdk.internal.views.LoadingDots;
import java.util.Arrays;
import p004a3.C0050b;
import p188o.C5892b;
import p355ac.C13400a;
import p718pc.C18888b;

/* renamed from: pc.s */
public final class C18914s extends C5892b {

    /* renamed from: l */
    public static final int[] f48143l = {533, 567, 850, LoadingDots.PULSE_DURATION};

    /* renamed from: m */
    public static final int[] f48144m = {1267, 1000, 333, 0};

    /* renamed from: n */
    public static final C18915a f48145n = new C18915a();

    /* renamed from: d */
    public ObjectAnimator f48146d;

    /* renamed from: e */
    public ObjectAnimator f48147e;

    /* renamed from: f */
    public final Interpolator[] f48148f;

    /* renamed from: g */
    public final LinearProgressIndicatorSpec f48149g;

    /* renamed from: h */
    public int f48150h = 0;

    /* renamed from: i */
    public boolean f48151i;

    /* renamed from: j */
    public float f48152j;

    /* renamed from: k */
    public C0050b f48153k = null;

    /* renamed from: pc.s$a */
    public class C18915a extends Property<C18914s, Float> {
        public C18915a() {
            super(Float.class, "animationFraction");
        }

        public final Object get(Object obj) {
            return Float.valueOf(((C18914s) obj).f48152j);
        }

        public final void set(Object obj, Object obj2) {
            C18914s sVar = (C18914s) obj;
            float floatValue = ((Float) obj2).floatValue();
            sVar.f48152j = floatValue;
            int i = (int) (floatValue * 1800.0f);
            for (int i2 = 0; i2 < 4; i2++) {
                ((float[]) sVar.f18962b)[i2] = Math.max(BitmapDescriptorFactory.HUE_RED, Math.min(1.0f, sVar.f48148f[i2].getInterpolation(((float) (i - C18914s.f48144m[i2])) / ((float) C18914s.f48143l[i2]))));
            }
            if (sVar.f48151i) {
                Arrays.fill((int[]) sVar.f18963c, C14256d1.m35483a(sVar.f48149g.f48084c[sVar.f48150h], ((C18907m) sVar.f18961a).f48125k));
                sVar.f48151i = false;
            }
            ((C18907m) sVar.f18961a).invalidateSelf();
        }
    }

    public C18914s(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(2);
        this.f48149g = linearProgressIndicatorSpec;
        this.f48148f = new Interpolator[]{AnimationUtils.loadInterpolator(context, C13400a.linear_indeterminate_line1_head_interpolator), AnimationUtils.loadInterpolator(context, C13400a.linear_indeterminate_line1_tail_interpolator), AnimationUtils.loadInterpolator(context, C13400a.linear_indeterminate_line2_head_interpolator), AnimationUtils.loadInterpolator(context, C13400a.linear_indeterminate_line2_tail_interpolator)};
    }

    /* renamed from: c */
    public final void mo21794c() {
        ObjectAnimator objectAnimator = this.f48146d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: f */
    public final void mo21797f() {
        mo51426k();
    }

    /* renamed from: g */
    public final void mo21798g(C18888b.C18891c cVar) {
        this.f48153k = cVar;
    }

    /* renamed from: h */
    public final void mo21799h() {
        ObjectAnimator objectAnimator = this.f48147e;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            mo21794c();
            if (((C18907m) this.f18961a).isVisible()) {
                this.f48147e.setFloatValues(new float[]{this.f48152j, 1.0f});
                this.f48147e.setDuration((long) ((1.0f - this.f48152j) * 1800.0f));
                this.f48147e.start();
            }
        }
    }

    /* renamed from: i */
    public final void mo21800i() {
        if (this.f48146d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f48145n, new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f});
            this.f48146d = ofFloat;
            ofFloat.setDuration(1800);
            this.f48146d.setInterpolator((TimeInterpolator) null);
            this.f48146d.setRepeatCount(-1);
            this.f48146d.addListener(new C18912q(this));
        }
        if (this.f48147e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f48145n, new float[]{1.0f});
            this.f48147e = ofFloat2;
            ofFloat2.setDuration(1800);
            this.f48147e.setInterpolator((TimeInterpolator) null);
            this.f48147e.addListener(new C18913r(this));
        }
        mo51426k();
        this.f48146d.start();
    }

    /* renamed from: j */
    public final void mo21801j() {
        this.f48153k = null;
    }

    /* renamed from: k */
    public final void mo51426k() {
        this.f48150h = 0;
        int a = C14256d1.m35483a(this.f48149g.f48084c[0], ((C18907m) this.f18961a).f48125k);
        int[] iArr = (int[]) this.f18963c;
        iArr[0] = a;
        iArr[1] = a;
    }
}
