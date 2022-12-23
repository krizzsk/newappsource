package com.appboy.p044ui.inappmessage.listeners;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p284v5.C6864b;

/* renamed from: com.appboy.ui.inappmessage.listeners.SwipeDismissTouchListener */
public class SwipeDismissTouchListener implements View.OnTouchListener {
    private final long mAnimationTime;
    /* access modifiers changed from: private */
    public final DismissCallbacks mCallbacks;
    private float mDownX;
    private float mDownY;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int mSlop;
    private boolean mSwiping;
    private int mSwipingSlop;
    /* access modifiers changed from: private */
    public final Object mToken;
    private float mTranslationX;
    private VelocityTracker mVelocityTracker;
    /* access modifiers changed from: private */
    public final View mView;
    private int mViewWidth = 1;

    /* renamed from: com.appboy.ui.inappmessage.listeners.SwipeDismissTouchListener$DismissCallbacks */
    public interface DismissCallbacks {
        boolean canDismiss(Object obj);

        void onDismiss(View view, Object obj);
    }

    public SwipeDismissTouchListener(View view, Object obj, DismissCallbacks dismissCallbacks) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        this.mSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity() * 16;
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mAnimationTime = (long) view.getContext().getResources().getInteger(17694720);
        this.mView = view;
        this.mToken = obj;
        this.mCallbacks = dismissCallbacks;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$performDismiss$0(ViewGroup.LayoutParams layoutParams, ValueAnimator valueAnimator) {
        layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.mView.setLayoutParams(layoutParams);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        motionEvent.offsetLocation(this.mTranslationX, BitmapDescriptorFactory.HUE_RED);
        if (this.mViewWidth < 2) {
            this.mViewWidth = this.mView.getWidth();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            boolean z5 = true;
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    VelocityTracker velocityTracker = this.mVelocityTracker;
                    if (velocityTracker != null) {
                        velocityTracker.addMovement(motionEvent);
                        float rawX = motionEvent.getRawX() - this.mDownX;
                        float rawY = motionEvent.getRawY() - this.mDownY;
                        if (Math.abs(rawX) > ((float) this.mSlop) && Math.abs(rawY) < Math.abs(rawX) / 2.0f) {
                            this.mSwiping = true;
                            if (rawX > BitmapDescriptorFactory.HUE_RED) {
                                i2 = this.mSlop;
                            } else {
                                i2 = -this.mSlop;
                            }
                            this.mSwipingSlop = i2;
                            this.mView.getParent().requestDisallowInterceptTouchEvent(true);
                            MotionEvent obtain = MotionEvent.obtain(motionEvent);
                            obtain.setAction((motionEvent.getActionIndex() << 8) | 3);
                            this.mView.onTouchEvent(obtain);
                            obtain.recycle();
                        }
                        if (this.mSwiping) {
                            this.mTranslationX = rawX;
                            this.mView.setTranslationX(rawX - ((float) this.mSwipingSlop));
                            return true;
                        }
                    }
                } else if (actionMasked == 3 && this.mVelocityTracker != null) {
                    this.mView.animate().translationX(BitmapDescriptorFactory.HUE_RED).alpha(1.0f).setDuration(this.mAnimationTime).setListener((Animator.AnimatorListener) null);
                    this.mVelocityTracker.recycle();
                    this.mVelocityTracker = null;
                    this.mTranslationX = BitmapDescriptorFactory.HUE_RED;
                    this.mDownX = BitmapDescriptorFactory.HUE_RED;
                    this.mDownY = BitmapDescriptorFactory.HUE_RED;
                    this.mSwiping = false;
                }
            } else if (this.mVelocityTracker != null) {
                float rawX2 = motionEvent.getRawX() - this.mDownX;
                this.mVelocityTracker.addMovement(motionEvent);
                this.mVelocityTracker.computeCurrentVelocity(1000);
                float xVelocity = this.mVelocityTracker.getXVelocity();
                float abs = Math.abs(xVelocity);
                float abs2 = Math.abs(this.mVelocityTracker.getYVelocity());
                if (Math.abs(rawX2) <= ((float) (this.mViewWidth / 2)) || !this.mSwiping) {
                    if (((float) this.mMinFlingVelocity) > abs || abs > ((float) this.mMaxFlingVelocity) || abs2 >= abs || !this.mSwiping) {
                        z = false;
                        z5 = false;
                    } else {
                        if (xVelocity < BitmapDescriptorFactory.HUE_RED) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (rawX2 < BitmapDescriptorFactory.HUE_RED) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z2 == z3) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (this.mVelocityTracker.getXVelocity() <= BitmapDescriptorFactory.HUE_RED) {
                            z5 = false;
                        }
                        boolean z6 = z5;
                        z5 = z4;
                        z = z6;
                    }
                } else if (rawX2 > BitmapDescriptorFactory.HUE_RED) {
                    z = true;
                } else {
                    z = false;
                }
                if (z5) {
                    ViewPropertyAnimator animate = this.mView.animate();
                    if (z) {
                        i = this.mViewWidth;
                    } else {
                        i = -this.mViewWidth;
                    }
                    animate.translationX((float) i).alpha(BitmapDescriptorFactory.HUE_RED).setDuration(this.mAnimationTime).setListener(new AnimatorListenerAdapter() {
                        public void onAnimationEnd(Animator animator) {
                            SwipeDismissTouchListener.this.performDismiss();
                        }
                    });
                } else if (this.mSwiping) {
                    this.mView.animate().translationX(BitmapDescriptorFactory.HUE_RED).alpha(1.0f).setDuration(this.mAnimationTime).setListener((Animator.AnimatorListener) null);
                }
                this.mVelocityTracker.recycle();
                this.mVelocityTracker = null;
                this.mTranslationX = BitmapDescriptorFactory.HUE_RED;
                this.mDownX = BitmapDescriptorFactory.HUE_RED;
                this.mDownY = BitmapDescriptorFactory.HUE_RED;
                this.mSwiping = false;
            }
            return false;
        }
        this.mDownX = motionEvent.getRawX();
        this.mDownY = motionEvent.getRawY();
        if (this.mCallbacks.canDismiss(this.mToken)) {
            VelocityTracker obtain2 = VelocityTracker.obtain();
            this.mVelocityTracker = obtain2;
            obtain2.addMovement(motionEvent);
        }
        return false;
    }

    @TargetApi(12)
    public void performDismiss() {
        final ViewGroup.LayoutParams layoutParams = this.mView.getLayoutParams();
        final int height = this.mView.getHeight();
        ValueAnimator duration = ValueAnimator.ofInt(new int[]{height, 1}).setDuration(this.mAnimationTime);
        duration.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                SwipeDismissTouchListener.this.mCallbacks.onDismiss(SwipeDismissTouchListener.this.mView, SwipeDismissTouchListener.this.mToken);
                SwipeDismissTouchListener.this.mView.setAlpha(1.0f);
                SwipeDismissTouchListener.this.mView.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                layoutParams.height = height;
                SwipeDismissTouchListener.this.mView.setLayoutParams(layoutParams);
            }
        });
        duration.addUpdateListener(new C6864b(this, layoutParams));
        duration.start();
    }
}
