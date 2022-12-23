package com.p341rd.animation.type;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import cb0.C7583b;
import com.p341rd.C7981a;
import eb0.C12625b;
import fb0.C12652a;

/* renamed from: com.rd.animation.type.DropAnimation */
public final class DropAnimation extends C12652a<AnimatorSet> {

    /* renamed from: d */
    public int f24189d;

    /* renamed from: e */
    public int f24190e;

    /* renamed from: f */
    public int f24191f;

    /* renamed from: g */
    public int f24192g;

    /* renamed from: h */
    public int f24193h;

    /* renamed from: i */
    public C12625b f24194i = new C12625b();

    /* renamed from: com.rd.animation.type.DropAnimation$AnimationType */
    public enum AnimationType {
        Width,
        Height,
        Radius
    }

    /* renamed from: com.rd.animation.type.DropAnimation$a */
    public class C7983a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ AnimationType f24195a;

        public C7983a(AnimationType animationType) {
            this.f24195a = animationType;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            DropAnimation dropAnimation = DropAnimation.this;
            AnimationType animationType = this.f24195a;
            dropAnimation.getClass();
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            int i = C7984b.f24197a[animationType.ordinal()];
            if (i == 1) {
                dropAnimation.f24194i.f31213a = intValue;
            } else if (i == 2) {
                dropAnimation.f24194i.f31214b = intValue;
            } else if (i == 3) {
                dropAnimation.f24194i.f31215c = intValue;
            }
            C7583b.C7584a aVar = dropAnimation.f31271b;
            if (aVar != null) {
                ((C7981a) aVar).mo24975b(dropAnimation.f24194i);
            }
        }
    }

    /* renamed from: com.rd.animation.type.DropAnimation$b */
    public static /* synthetic */ class C7984b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24197a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.rd.animation.type.DropAnimation$AnimationType[] r0 = com.p341rd.animation.type.DropAnimation.AnimationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f24197a = r0
                com.rd.animation.type.DropAnimation$AnimationType r1 = com.p341rd.animation.type.DropAnimation.AnimationType.Width     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f24197a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.rd.animation.type.DropAnimation$AnimationType r1 = com.p341rd.animation.type.DropAnimation.AnimationType.Height     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f24197a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.rd.animation.type.DropAnimation$AnimationType r1 = com.p341rd.animation.type.DropAnimation.AnimationType.Radius     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p341rd.animation.type.DropAnimation.C7984b.<clinit>():void");
        }
    }

    public DropAnimation(C7583b.C7584a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final Animator mo24976a() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        return animatorSet;
    }

    /* renamed from: d */
    public final ValueAnimator mo24977d(int i, int i2, long j, AnimationType animationType) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new C7983a(animationType));
        return ofInt;
    }

    /* renamed from: e */
    public final void mo24978e(int i, int i2, int i3, int i4, int i5) {
        boolean z;
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        int i9 = i4;
        int i11 = i5;
        if (this.f24189d == i6 && this.f24190e == i7 && this.f24191f == i8 && this.f24192g == i9 && this.f24193h == i11) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            T animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            this.f31272c = animatorSet;
            this.f24189d = i6;
            this.f24190e = i7;
            this.f24191f = i8;
            this.f24192g = i9;
            this.f24193h = i11;
            int i12 = (int) (((double) i11) / 1.5d);
            long j = this.f31270a;
            ValueAnimator d = mo24977d(i, i2, j, AnimationType.Width);
            AnimationType animationType = AnimationType.Height;
            long j2 = j / 2;
            ValueAnimator d2 = mo24977d(i3, i4, j2, animationType);
            AnimationType animationType2 = AnimationType.Radius;
            ValueAnimator d3 = mo24977d(i4, i3, j2, animationType);
            ValueAnimator d4 = mo24977d(i12, i5, j2, animationType2);
            ((AnimatorSet) this.f31272c).play(d2).with(mo24977d(i5, i12, j2, animationType2)).with(d).before(d3).before(d4);
        }
    }
}
