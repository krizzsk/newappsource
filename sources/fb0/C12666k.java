package fb0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import cb0.C7583b;
import com.p341rd.C7981a;
import eb0.C12631h;
import java.util.Iterator;

/* renamed from: fb0.k */
public class C12666k extends C12652a<AnimatorSet> {

    /* renamed from: d */
    public int f31295d;

    /* renamed from: e */
    public int f31296e;

    /* renamed from: f */
    public int f31297f;

    /* renamed from: g */
    public boolean f31298g;

    /* renamed from: h */
    public C12631h f31299h = new C12631h();

    /* renamed from: fb0.k$a */
    public class C12667a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ C12631h f31300a;

        /* renamed from: b */
        public final /* synthetic */ boolean f31301b;

        public C12667a(C12631h hVar, boolean z) {
            this.f31300a = hVar;
            this.f31301b = z;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C12666k kVar = C12666k.this;
            C12631h hVar = this.f31300a;
            boolean z = this.f31301b;
            kVar.getClass();
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (kVar.f31298g) {
                if (!z) {
                    hVar.f31227b = intValue;
                } else {
                    hVar.f31226a = intValue;
                }
            } else if (!z) {
                hVar.f31226a = intValue;
            } else {
                hVar.f31227b = intValue;
            }
            C7583b.C7584a aVar = kVar.f31271b;
            if (aVar != null) {
                ((C7981a) aVar).mo24975b(hVar);
            }
        }
    }

    /* renamed from: fb0.k$b */
    public class C12668b {

        /* renamed from: a */
        public final int f31303a;

        /* renamed from: b */
        public final int f31304b;

        /* renamed from: c */
        public final int f31305c;

        /* renamed from: d */
        public final int f31306d;

        public C12668b(int i, int i2, int i3, int i4) {
            this.f31303a = i;
            this.f31304b = i2;
            this.f31305c = i3;
            this.f31306d = i4;
        }
    }

    public C12666k(C7583b.C7584a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final Animator mo24976a() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        return animatorSet;
    }

    /* renamed from: d */
    public final C12668b mo39450d(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        if (z) {
            int i5 = this.f31295d;
            int i6 = this.f31297f;
            i4 = i5 + i6;
            int i7 = this.f31296e;
            i2 = i7 + i6;
            i = i5 - i6;
            i3 = i7 - i6;
        } else {
            int i8 = this.f31295d;
            int i9 = this.f31297f;
            i4 = i8 - i9;
            int i11 = this.f31296e;
            i2 = i11 - i9;
            i = i8 + i9;
            i3 = i11 + i9;
        }
        return new C12668b(i4, i2, i, i3);
    }

    /* renamed from: e */
    public final ValueAnimator mo39451e(int i, int i2, long j, boolean z, C12631h hVar) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new C12667a(hVar, z));
        return ofInt;
    }

    /* renamed from: f */
    public C12666k mo39446f(float f) {
        T t = this.f31272c;
        if (t == null) {
            return this;
        }
        long j = (long) (f * ((float) this.f31270a));
        Iterator<Animator> it = ((AnimatorSet) t).getChildAnimations().iterator();
        while (it.hasNext()) {
            ValueAnimator valueAnimator = (ValueAnimator) it.next();
            long duration = valueAnimator.getDuration();
            if (j <= duration) {
                duration = j;
            }
            valueAnimator.setCurrentPlayTime(duration);
            j -= duration;
        }
        return this;
    }
}
