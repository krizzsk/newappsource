package j00;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.widget.TextView;
import j00.C17691i;
import p977zz.C20941h;
import p977zz.C20943i;

/* renamed from: j00.g */
public final class C17688g {
    /* renamed from: a */
    public static AnimatorSet m43897a(TextView textView, String str, int i) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        C17691i.C17702k kVar = C17691i.f45446d;
        int[] iArr = {textView.getCurrentTextColor(), 0};
        if (C20943i.m49051d(21)) {
            objectAnimator = ObjectAnimator.ofArgb(textView, kVar, iArr);
        } else {
            objectAnimator = ObjectAnimator.ofInt(textView, kVar, iArr);
            objectAnimator.setEvaluator(C17689h.f45442a);
        }
        int[] iArr2 = {0, C20941h.m49043f(i, textView.getContext())};
        if (C20943i.m49051d(21)) {
            objectAnimator2 = ObjectAnimator.ofArgb(textView, kVar, iArr2);
        } else {
            objectAnimator2 = ObjectAnimator.ofInt(textView, kVar, iArr2);
            objectAnimator2.setEvaluator(C17689h.f45442a);
        }
        objectAnimator2.addListener(new C17686e(textView, str));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(new Animator[]{objectAnimator, objectAnimator2});
        return animatorSet;
    }
}
