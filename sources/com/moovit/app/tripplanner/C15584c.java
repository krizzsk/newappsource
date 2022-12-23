package com.moovit.app.tripplanner;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.tranzmate.R;
import p068e2.C4525b;
import p572iw.C17662e;
import p808sx.C19570f;

/* renamed from: com.moovit.app.tripplanner.c */
public final class C15584c extends C15682c<MoovitActivity> {

    /* renamed from: o */
    public static final /* synthetic */ int f40541o = 0;

    /* renamed from: n */
    public AnimatorSet f40542n = null;

    /* renamed from: com.moovit.app.tripplanner.c$a */
    public interface C15585a {
        /* renamed from: h1 */
        void mo45129h1();
    }

    public C15584c() {
        super(MoovitActivity.class);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.trip_plan_search_button_fragment, viewGroup, false);
        Button button = (Button) inflate.findViewById(R.id.search_button);
        button.setOnClickListener(new C17662e(this, 4));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(button, View.SCALE_X, new float[]{1.0f, 1.05f, 1.0f});
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(button, View.SCALE_Y, new float[]{1.0f, 1.05f, 1.0f});
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setRepeatMode(1);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(InstallSheetPresenter.LOADING_TIMER_DELAY_IN_MILLIS);
        animatorSet.setDuration(2000);
        animatorSet.setInterpolator(new C4525b());
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        animatorSet.addListener(new C19570f(button));
        this.f40542n = animatorSet;
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        AnimatorSet animatorSet = this.f40542n;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    public final void onStop() {
        super.onStop();
        AnimatorSet animatorSet = this.f40542n;
        if (animatorSet != null) {
            animatorSet.end();
        }
    }
}
