package com.moovit.app.tod.bottomsheet.stateviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.moovit.app.tod.model.TodRide;
import com.moovit.commons.utils.UiUtils;
import p400bx.C13706b;
import p502fx.C17122g;

public abstract class TodMotionLayoutView extends FrameLayout implements C13706b {

    /* renamed from: b */
    public int f40192b;

    /* renamed from: c */
    public TodRide f40193c;

    public TodMotionLayoutView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo40574a(TodRide todRide, C17122g gVar) {
        this.f40193c = todRide;
    }

    /* renamed from: b */
    public boolean mo46277b() {
        return false;
    }

    public TodRide getCurrentRide() {
        return this.f40193c;
    }

    public abstract MotionLayout getMotionLayout();

    public int getPeekHeight() {
        return this.f40192b;
    }

    /* renamed from: h */
    public final View mo40576h() {
        return this;
    }

    public final void onMeasure(int i, int i2) {
        if (this.f40192b == -1) {
            MotionLayout motionLayout = getMotionLayout();
            int startState = motionLayout.getStartState();
            int startState2 = motionLayout.getStartState();
            int endState = motionLayout.getEndState();
            motionLayout.mo2983z(startState, startState);
            measureChild(motionLayout, i, i2);
            int measuredHeight = motionLayout.getMeasuredHeight();
            motionLayout.mo2983z(startState2, endState);
            this.f40192b = measuredHeight;
            int endState2 = motionLayout.getEndState();
            int startState3 = motionLayout.getStartState();
            int endState3 = motionLayout.getEndState();
            motionLayout.mo2983z(endState2, endState2);
            measureChild(motionLayout, i, i2);
            int measuredHeight2 = motionLayout.getMeasuredHeight();
            motionLayout.mo2983z(startState3, endState3);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) motionLayout.getLayoutParams();
            layoutParams.height = measuredHeight2;
            motionLayout.setLayoutParams(layoutParams);
        }
        int e = (int) UiUtils.m40246e(getContext(), 40.0f);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        if (!mo46277b()) {
            e = 0;
        }
        setPadding(paddingLeft, paddingTop, paddingRight, e);
        super.onMeasure(i, i2);
    }

    public void setSlideOffset(float f) {
        getMotionLayout().setProgress(f);
    }

    public TodMotionLayoutView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40192b = -1;
    }
}
