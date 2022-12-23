package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import androidx.transition.Transition;
import p330z2.C7434j;
import p330z2.C7441q;

/* renamed from: androidx.transition.i */
public final class C1333i {

    /* renamed from: androidx.transition.i$a */
    public static class C1334a extends AnimatorListenerAdapter implements Transition.C1315d {

        /* renamed from: a */
        public final View f5022a;

        /* renamed from: b */
        public final View f5023b;

        /* renamed from: c */
        public final int f5024c;

        /* renamed from: d */
        public final int f5025d;

        /* renamed from: e */
        public int[] f5026e;

        /* renamed from: f */
        public float f5027f;

        /* renamed from: g */
        public float f5028g;

        /* renamed from: h */
        public final float f5029h;

        /* renamed from: i */
        public final float f5030i;

        public C1334a(View view, View view2, int i, int i2, float f, float f2) {
            this.f5023b = view;
            this.f5022a = view2;
            this.f5024c = i - Math.round(view.getTranslationX());
            this.f5025d = i2 - Math.round(view.getTranslationY());
            this.f5029h = f;
            this.f5030i = f2;
            int i3 = C7434j.transition_position;
            int[] iArr = (int[]) view2.getTag(i3);
            this.f5026e = iArr;
            if (iArr != null) {
                view2.setTag(i3, (Object) null);
            }
        }

        /* renamed from: a */
        public final void mo5374a() {
        }

        /* renamed from: b */
        public final void mo5375b() {
        }

        /* renamed from: c */
        public final void mo5376c() {
        }

        /* renamed from: d */
        public final void mo5377d(Transition transition) {
            this.f5023b.setTranslationX(this.f5029h);
            this.f5023b.setTranslationY(this.f5030i);
            transition.mo5427w(this);
        }

        /* renamed from: e */
        public final void mo5432e() {
        }

        public final void onAnimationCancel(Animator animator) {
            if (this.f5026e == null) {
                this.f5026e = new int[2];
            }
            this.f5026e[0] = Math.round(this.f5023b.getTranslationX() + ((float) this.f5024c));
            this.f5026e[1] = Math.round(this.f5023b.getTranslationY() + ((float) this.f5025d));
            this.f5022a.setTag(C7434j.transition_position, this.f5026e);
        }

        public final void onAnimationPause(Animator animator) {
            this.f5027f = this.f5023b.getTranslationX();
            this.f5028g = this.f5023b.getTranslationY();
            this.f5023b.setTranslationX(this.f5029h);
            this.f5023b.setTranslationY(this.f5030i);
        }

        public final void onAnimationResume(Animator animator) {
            this.f5023b.setTranslationX(this.f5027f);
            this.f5023b.setTranslationY(this.f5028g);
        }
    }

    /* renamed from: a */
    public static ObjectAnimator m3636a(View view, C7441q qVar, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator, Transition transition) {
        float f5;
        float f6;
        View view2 = view;
        C7441q qVar2 = qVar;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) qVar2.f22855b.getTag(C7434j.transition_position);
        if (iArr != null) {
            f5 = ((float) (iArr[0] - i)) + translationX;
            f6 = ((float) (iArr[1] - i2)) + translationY;
        } else {
            f5 = f;
            f6 = f2;
        }
        int round = Math.round(f5 - translationX) + i;
        int round2 = Math.round(f6 - translationY) + i2;
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        if (f5 == f3 && f6 == f4) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f5, f3}), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f6, f4})});
        C1334a aVar = new C1334a(view, qVar2.f22855b, round, round2, translationX, translationY);
        transition.mo5411a(aVar);
        ofPropertyValuesHolder.addListener(aVar);
        ofPropertyValuesHolder.addPauseListener(aVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}
