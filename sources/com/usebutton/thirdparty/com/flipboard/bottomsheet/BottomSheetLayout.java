package com.usebutton.thirdparty.com.flipboard.bottomsheet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.usebutton.sdk.C12238R;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class BottomSheetLayout extends FrameLayout {
    public static final long ANIMATION_DURATION = 300;
    private static final Property<BottomSheetLayout, Float> SHEET_TRANSLATION = new Property<BottomSheetLayout, Float>(Float.class, "sheetTranslation") {
        public Float get(BottomSheetLayout bottomSheetLayout) {
            return Float.valueOf(bottomSheetLayout.sheetTranslation);
        }

        public void set(BottomSheetLayout bottomSheetLayout, Float f) {
            bottomSheetLayout.setSheetTranslation(f.floatValue());
        }
    };
    private boolean alwaysPeekSheet;
    private TimeInterpolator animationInterpolator;
    public boolean bottomSheetOwnsTouch;
    private Rect contentClipRect;
    /* access modifiers changed from: private */
    public Animator currentAnimator;
    /* access modifiers changed from: private */
    public int currentSheetViewHeight;
    private final int defaultSheetWidth;
    private ViewTransformer defaultViewTransformer;
    private View dimView;
    private float downSheetTranslation;
    private State downState;
    private float downX;
    private float downY;
    private boolean hasIntercepted;
    private boolean initialized;
    private boolean interceptContentTouch;
    private boolean isKeyboardShown;
    private final boolean isTablet;
    private float maxTranslationOffset;
    private float minFlingVelocity;
    /* access modifiers changed from: private */
    public CopyOnWriteArraySet<OnSheetDismissedListener> onSheetDismissedListeners;
    private CopyOnWriteArraySet<OnSheetStateChangeListener> onSheetStateChangeListeners;
    private float peek;
    private float peekKeyline;
    private boolean peekOnDismiss;
    /* access modifiers changed from: private */
    public Runnable runAfterDismiss;
    private int screenHeight;
    private int screenWidth;
    private int sheetEndX;
    private int sheetStartX;
    /* access modifiers changed from: private */
    public float sheetTranslation;
    private View.OnLayoutChangeListener sheetViewOnLayoutChangeListener;
    private boolean sheetViewOwnsTouch;
    private boolean shouldDimContentView;
    /* access modifiers changed from: private */
    public State state;
    private float touchSlop;
    private boolean useHardwareLayerWhileAnimating;
    private VelocityTracker velocityTracker;
    /* access modifiers changed from: private */
    public ViewTransformer viewTransformer;

    public static class CancelDetectionAnimationListener extends AnimatorListenerAdapter {
        public boolean canceled;

        private CancelDetectionAnimationListener() {
        }

        public void onAnimationCancel(Animator animator) {
            this.canceled = true;
        }
    }

    public static class IdentityViewTransformer extends BaseViewTransformer {
        private IdentityViewTransformer() {
        }

        public void transformView(float f, float f2, float f3, BottomSheetLayout bottomSheetLayout, View view) {
        }
    }

    public interface OnSheetStateChangeListener {
        void onSheetReady(boolean z);

        void onSheetStateChanged(State state);
    }

    public enum State {
        HIDDEN,
        PREPARING,
        PEEKED,
        EXPANDED
    }

    public BottomSheetLayout(Context context) {
        super(context);
        this.initialized = false;
        this.contentClipRect = new Rect();
        this.state = State.HIDDEN;
        this.peekOnDismiss = false;
        this.animationInterpolator = new DecelerateInterpolator(1.6f);
        this.defaultViewTransformer = new IdentityViewTransformer();
        this.shouldDimContentView = true;
        this.useHardwareLayerWhileAnimating = true;
        this.onSheetDismissedListeners = new CopyOnWriteArraySet<>();
        this.onSheetStateChangeListeners = new CopyOnWriteArraySet<>();
        this.isKeyboardShown = false;
        this.interceptContentTouch = true;
        this.maxTranslationOffset = BitmapDescriptorFactory.HUE_RED;
        this.alwaysPeekSheet = false;
        this.screenHeight = 0;
        this.screenWidth = 0;
        this.isTablet = getResources().getBoolean(C12238R.bool.bottomsheet_is_tablet);
        this.defaultSheetWidth = getResources().getDimensionPixelSize(C12238R.dimen.bottomsheet_default_sheet_width);
        this.sheetStartX = 0;
        this.sheetEndX = 0;
        init();
    }

    private boolean canScrollUp(View view, float f, float f2) {
        boolean z;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                int left = childAt.getLeft() - view.getScrollX();
                int top = childAt.getTop() - view.getScrollY();
                int right = childAt.getRight() - view.getScrollX();
                int bottom = childAt.getBottom() - view.getScrollY();
                float f3 = (float) left;
                if (f <= f3 || f >= ((float) right) || f2 <= ((float) top) || f2 >= ((float) bottom)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z && canScrollUp(childAt, f - f3, f2 - ((float) top))) {
                    return true;
                }
            }
        }
        return view.canScrollVertically(-1);
    }

    private void cancelCurrentAnimation() {
        Animator animator = this.currentAnimator;
        if (animator != null) {
            animator.cancel();
        }
    }

    private static <T> T checkNotNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    private float getDefaultPeekTranslation() {
        return hasTallerKeylineHeightSheet() ? this.peekKeyline : (float) getSheetView().getHeight();
    }

    private float getDimAlpha(float f) {
        ViewTransformer viewTransformer2 = this.viewTransformer;
        if (viewTransformer2 != null) {
            return viewTransformer2.getDimAlpha(f, getMaxSheetTranslation(), getPeekSheetTranslation(), this, getContentView());
        }
        ViewTransformer viewTransformer3 = this.defaultViewTransformer;
        if (viewTransformer3 == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return viewTransformer3.getDimAlpha(f, getMaxSheetTranslation(), getPeekSheetTranslation(), this, getContentView());
    }

    private boolean hasFullHeightSheet() {
        return getSheetView() == null || getSheetView().getHeight() == getHeight();
    }

    private boolean hasTallerKeylineHeightSheet() {
        return getSheetView() == null || ((float) getSheetView().getHeight()) > this.peekKeyline;
    }

    private void init() {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.minFlingVelocity = (float) viewConfiguration.getScaledMinimumFlingVelocity();
        this.touchSlop = (float) viewConfiguration.getScaledTouchSlop();
        View view = new View(getContext());
        this.dimView = view;
        view.setBackgroundColor(-16777216);
        this.dimView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        this.dimView.setVisibility(4);
        setFocusableInTouchMode(true);
        Point point = new Point();
        ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getSize(point);
        int i = point.y;
        this.screenHeight = i;
        int i2 = point.x;
        this.screenWidth = i2;
        this.sheetEndX = i2;
        this.peek = BitmapDescriptorFactory.HUE_RED;
        this.peekKeyline = ((float) i) - (((float) i2) / 1.7777778f);
    }

    private void initSheetView(View view) {
        int i;
        if (this.initialized) {
            view.setVisibility(0);
            return;
        }
        this.initialized = true;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (layoutParams == null) {
            if (this.isTablet) {
                i = -2;
            } else {
                i = -1;
            }
            layoutParams = new FrameLayout.LayoutParams(i, -2, 1);
        }
        if (this.isTablet && layoutParams.width == -2) {
            if (layoutParams.gravity == -1) {
                layoutParams.gravity = 1;
            }
            int i2 = this.defaultSheetWidth;
            layoutParams.width = i2;
            int i3 = this.screenWidth;
            int i4 = (i3 - i2) / 2;
            this.sheetStartX = i4;
            this.sheetEndX = i3 - i4;
        }
        super.addView(view, -1, layoutParams);
        initializeSheetValues();
    }

    private void initializeSheetValues() {
        this.sheetTranslation = BitmapDescriptorFactory.HUE_RED;
        this.contentClipRect.set(0, 0, getWidth(), getHeight());
        getSheetView().setTranslationY((float) getHeight());
        this.dimView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        this.dimView.setVisibility(4);
    }

    private boolean isAnimating() {
        return this.currentAnimator != null;
    }

    public static boolean isTablet(Context context) {
        return context.getResources().getBoolean(C12238R.bool.bottomsheet_is_tablet);
    }

    private boolean isXInSheet(float f) {
        return !this.isTablet || (f >= ((float) this.sheetStartX) && f <= ((float) this.sheetEndX));
    }

    public static int predictedDefaultWidth(Context context) {
        if (isTablet(context)) {
            return context.getResources().getDimensionPixelSize(C12238R.dimen.bottomsheet_default_sheet_width);
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    /* access modifiers changed from: private */
    public void setSheetLayerTypeIfEnabled(int i) {
        if (this.useHardwareLayerWhileAnimating) {
            getSheetView().setLayerType(i, (Paint) null);
        }
    }

    /* access modifiers changed from: private */
    public void setSheetTranslation(float f) {
        this.sheetTranslation = Math.min(f, getMaxSheetTranslation());
        int i = 0;
        this.contentClipRect.set(0, 0, getWidth(), (int) (((double) getHeight()) - Math.ceil((double) this.sheetTranslation)));
        getSheetView().setTranslationY(((float) getHeight()) - this.sheetTranslation);
        transformView(this.sheetTranslation);
        if (this.shouldDimContentView) {
            float dimAlpha = getDimAlpha(this.sheetTranslation);
            this.dimView.setAlpha(dimAlpha);
            View view = this.dimView;
            if (dimAlpha <= BitmapDescriptorFactory.HUE_RED) {
                i = 4;
            }
            view.setVisibility(i);
        }
    }

    /* access modifiers changed from: private */
    public void setState(State state2) {
        if (state2 != this.state) {
            this.state = state2;
            Iterator<OnSheetStateChangeListener> it = this.onSheetStateChangeListeners.iterator();
            while (it.hasNext()) {
                it.next().onSheetStateChanged(state2);
            }
        }
    }

    private void transformView(float f) {
        ViewTransformer viewTransformer2 = this.viewTransformer;
        if (viewTransformer2 != null) {
            viewTransformer2.transformView(f, getMaxSheetTranslation(), getPeekSheetTranslation(), this, getContentView());
            return;
        }
        ViewTransformer viewTransformer3 = this.defaultViewTransformer;
        if (viewTransformer3 != null) {
            viewTransformer3.transformView(f, getMaxSheetTranslation(), getPeekSheetTranslation(), this, getContentView());
        }
    }

    public void addOnSheetDismissedListener(OnSheetDismissedListener onSheetDismissedListener) {
        checkNotNull(onSheetDismissedListener, "onSheetDismissedListener == null");
        this.onSheetDismissedListeners.add(onSheetDismissedListener);
    }

    public void addOnSheetStateChangeListener(OnSheetStateChangeListener onSheetStateChangeListener) {
        checkNotNull(onSheetStateChangeListener, "onSheetStateChangeListener == null");
        this.onSheetStateChangeListeners.add(onSheetStateChangeListener);
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            setContentView(view);
            return;
        }
        throw new IllegalArgumentException("You may not declare more then one child of bottom sheet. The sheet view must be added dynamically with showWithSheetView()");
    }

    public void dismissSheet() {
        dismissSheet((Runnable) null);
    }

    public void expandSheet() {
        cancelCurrentAnimation();
        setSheetLayerTypeIfEnabled(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, SHEET_TRANSLATION, new float[]{getMaxSheetTranslation()});
        ofFloat.setDuration(300);
        ofFloat.setInterpolator(this.animationInterpolator);
        ofFloat.addListener(new CancelDetectionAnimationListener() {
            public void onAnimationEnd(Animator animator) {
                if (!this.canceled) {
                    Animator unused = BottomSheetLayout.this.currentAnimator = null;
                }
            }
        });
        ofFloat.start();
        this.currentAnimator = ofFloat;
        setState(State.EXPANDED);
    }

    public View getContentView() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    public boolean getInterceptContentTouch() {
        return this.interceptContentTouch;
    }

    public float getMaxSheetTranslation() {
        int i;
        float f = this.maxTranslationOffset;
        if (this.state == State.EXPANDED) {
            this.maxTranslationOffset = BitmapDescriptorFactory.HUE_RED;
        }
        if (hasFullHeightSheet()) {
            i = getHeight() - getPaddingTop();
        } else {
            i = getSheetView().getHeight();
        }
        return ((float) i) + f;
    }

    public boolean getPeekOnDismiss() {
        return this.peekOnDismiss;
    }

    public float getPeekSheetTranslation() {
        float f = this.peek;
        return f == BitmapDescriptorFactory.HUE_RED ? getDefaultPeekTranslation() : f;
    }

    public View getSheetView() {
        if (getChildCount() > 2) {
            return getChildAt(2);
        }
        return null;
    }

    public State getState() {
        return this.state;
    }

    public boolean isSheetShowing() {
        return this.state != State.HIDDEN;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.velocityTracker = VelocityTracker.obtain();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.velocityTracker.clear();
        cancelCurrentAnimation();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2 = true;
        if (motionEvent.getActionMasked() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.hasIntercepted = false;
        }
        if ((!this.interceptContentTouch && (motionEvent.getY() <= ((float) getHeight()) - this.sheetTranslation || !isXInSheet(motionEvent.getX()))) || !z || !isSheetShowing()) {
            z2 = false;
        }
        this.hasIntercepted = z2;
        return z2;
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4 && isSheetShowing()) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            } else if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (isSheetShowing() && keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    if (this.state != State.EXPANDED || !this.peekOnDismiss) {
                        dismissSheet();
                    } else {
                        peekSheet();
                    }
                    return true;
                }
            }
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.contentClipRect.set(0, 0, getWidth(), (int) (((double) getHeight()) - Math.ceil((double) this.sheetTranslation)));
    }

    public void onMeasure(int i, int i2) {
        if (!this.initialized || !isSheetShowing()) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i2);
        Rect rect = new Rect();
        ((Activity) getContext()).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int i3 = (this.screenHeight - rect.top) - size;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C12238R.dimen.btn_keyboard_height);
        boolean z = this.isKeyboardShown;
        if (z && i3 < dimensionPixelSize) {
            this.isKeyboardShown = false;
            peekSheet();
        } else if (!z && i3 > dimensionPixelSize) {
            this.isKeyboardShown = true;
            peekSheet();
        }
        super.onMeasure(i, i2);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (!isSheetShowing() || isAnimating()) {
            return false;
        }
        if (!this.hasIntercepted) {
            return onInterceptTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            this.bottomSheetOwnsTouch = false;
            this.sheetViewOwnsTouch = false;
            this.downY = motionEvent.getY();
            this.downX = motionEvent.getX();
            this.downSheetTranslation = this.sheetTranslation;
            this.downState = this.state;
            this.velocityTracker.clear();
        }
        this.velocityTracker.addMovement(motionEvent);
        float maxSheetTranslation = getMaxSheetTranslation();
        float peekSheetTranslation = getPeekSheetTranslation();
        float y = this.downY - motionEvent.getY();
        float x = this.downX - motionEvent.getX();
        boolean z5 = this.bottomSheetOwnsTouch;
        float f = BitmapDescriptorFactory.HUE_RED;
        if (!z5 && !this.sheetViewOwnsTouch) {
            if (Math.abs(y) > this.touchSlop) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.bottomSheetOwnsTouch = z2;
            if (Math.abs(x) > this.touchSlop) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.sheetViewOwnsTouch = z3;
            if (this.bottomSheetOwnsTouch) {
                if (this.state == State.PEEKED) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(BitmapDescriptorFactory.HUE_RED, this.sheetTranslation - ((float) getHeight()));
                    obtain.setAction(3);
                    getSheetView().dispatchTouchEvent(obtain);
                    obtain.recycle();
                }
                this.sheetViewOwnsTouch = false;
                this.downY = motionEvent.getY();
                this.downX = motionEvent.getX();
                y = BitmapDescriptorFactory.HUE_RED;
            }
        }
        float f2 = this.downSheetTranslation + y;
        if (this.bottomSheetOwnsTouch) {
            if (y < BitmapDescriptorFactory.HUE_RED) {
                z = true;
            } else {
                z = false;
            }
            boolean canScrollUp = canScrollUp(getSheetView(), motionEvent.getX(), (this.sheetTranslation - ((float) getHeight())) + motionEvent.getY());
            State state2 = this.state;
            State state3 = State.EXPANDED;
            if (state2 == state3 && z && !canScrollUp) {
                this.downY = motionEvent.getY();
                this.downSheetTranslation = this.sheetTranslation;
                this.velocityTracker.clear();
                setState(State.PEEKED);
                setSheetLayerTypeIfEnabled(2);
                f2 = this.sheetTranslation;
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.setAction(3);
                getSheetView().dispatchTouchEvent(obtain2);
                obtain2.recycle();
            }
            if (this.state == State.PEEKED && f2 > maxSheetTranslation) {
                setSheetTranslation(maxSheetTranslation);
                f2 = Math.min(maxSheetTranslation, f2);
                MotionEvent obtain3 = MotionEvent.obtain(motionEvent);
                obtain3.setAction(0);
                getSheetView().dispatchTouchEvent(obtain3);
                obtain3.recycle();
                peekOrExpand();
                setSheetLayerTypeIfEnabled(0);
            }
            if (this.state == state3) {
                motionEvent.offsetLocation(BitmapDescriptorFactory.HUE_RED, this.sheetTranslation - ((float) getHeight()));
                getSheetView().dispatchTouchEvent(motionEvent);
            } else {
                if (f2 < peekSheetTranslation) {
                    f2 = peekSheetTranslation - ((peekSheetTranslation - f2) / 4.0f);
                }
                setSheetTranslation(f2);
                if (motionEvent.getAction() == 3) {
                    if (this.downState == state3) {
                        peekOrExpand();
                    } else {
                        peekSheet();
                    }
                }
                if (motionEvent.getAction() == 1) {
                    if (f2 < peekSheetTranslation) {
                        dismissSheet();
                    } else {
                        this.velocityTracker.computeCurrentVelocity(1000);
                        float yVelocity = this.velocityTracker.getYVelocity();
                        if (Math.abs(yVelocity) < this.minFlingVelocity) {
                            if (this.sheetTranslation > ((float) (getHeight() / 2))) {
                                peekOrExpand();
                            } else {
                                dismissSheet();
                            }
                        } else if (yVelocity < BitmapDescriptorFactory.HUE_RED) {
                            peekOrExpand();
                        } else {
                            dismissSheet();
                        }
                    }
                }
            }
        } else {
            if (motionEvent.getY() < ((float) getHeight()) - this.sheetTranslation || !isXInSheet(motionEvent.getX())) {
                z4 = true;
            }
            if (motionEvent.getAction() != 1 || !z4 || !this.interceptContentTouch) {
                if (this.isTablet) {
                    f = getX() - ((float) this.sheetStartX);
                }
                motionEvent.offsetLocation(f, this.sheetTranslation - ((float) getHeight()));
                getSheetView().dispatchTouchEvent(motionEvent);
            } else {
                dismissSheet();
                return true;
            }
        }
        return true;
    }

    public void peekOrExpand() {
        if (this.alwaysPeekSheet) {
            peekSheet();
        } else {
            expandSheet();
        }
    }

    public void peekSheet() {
        cancelCurrentAnimation();
        setSheetLayerTypeIfEnabled(2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, SHEET_TRANSLATION, new float[]{getPeekSheetTranslation()});
        ofFloat.setDuration(300);
        ofFloat.setInterpolator(this.animationInterpolator);
        ofFloat.addListener(new CancelDetectionAnimationListener() {
            public void onAnimationEnd(Animator animator) {
                if (!this.canceled) {
                    Animator unused = BottomSheetLayout.this.currentAnimator = null;
                }
            }
        });
        ofFloat.start();
        this.currentAnimator = ofFloat;
        setState(State.PEEKED);
    }

    public void removeOnSheetDismissedListener(OnSheetDismissedListener onSheetDismissedListener) {
        checkNotNull(onSheetDismissedListener, "onSheetDismissedListener == null");
        this.onSheetDismissedListeners.remove(onSheetDismissedListener);
    }

    public void removeOnSheetStateChangeListener(OnSheetStateChangeListener onSheetStateChangeListener) {
        checkNotNull(onSheetStateChangeListener, "onSheetStateChangeListener == null");
        this.onSheetStateChangeListeners.remove(onSheetStateChangeListener);
    }

    public void setAlwaysPeekSheet(boolean z) {
        this.alwaysPeekSheet = z;
    }

    public void setContentView(View view) {
        super.addView(view, -1, generateDefaultLayoutParams());
        super.addView(this.dimView, -1, generateDefaultLayoutParams());
    }

    public void setDefaultViewTransformer(ViewTransformer viewTransformer2) {
        this.defaultViewTransformer = viewTransformer2;
    }

    public void setInterceptContentTouch(boolean z) {
        this.interceptContentTouch = z;
    }

    public void setMaxTranslationOffset(float f) {
        this.maxTranslationOffset = f;
    }

    public void setPeekOnDismiss(boolean z) {
        this.peekOnDismiss = z;
    }

    public void setPeekSheetTranslation(float f) {
        this.peek = f;
    }

    public void setShouldDimContentView(boolean z) {
        this.shouldDimContentView = z;
    }

    public void setUseHardwareLayerWhileAnimating(boolean z) {
        this.useHardwareLayerWhileAnimating = z;
    }

    public boolean shouldDimContentView() {
        return this.shouldDimContentView;
    }

    public void showWithSheetView(View view) {
        showWithSheetView(view, (ViewTransformer) null, false);
    }

    private void dismissSheet(Runnable runnable) {
        State state2 = this.state;
        State state3 = State.HIDDEN;
        if (state2 == state3) {
            this.runAfterDismiss = null;
            return;
        }
        setState(state3);
        this.runAfterDismiss = runnable;
        final View sheetView = getSheetView();
        sheetView.removeOnLayoutChangeListener(this.sheetViewOnLayoutChangeListener);
        cancelCurrentAnimation();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, SHEET_TRANSLATION, new float[]{0.0f});
        ofFloat.setDuration(300);
        ofFloat.setInterpolator(this.animationInterpolator);
        ofFloat.addListener(new CancelDetectionAnimationListener() {
            public void onAnimationEnd(Animator animator) {
                if (!this.canceled) {
                    Animator unused = BottomSheetLayout.this.currentAnimator = null;
                    BottomSheetLayout.this.setState(State.HIDDEN);
                    BottomSheetLayout.this.setSheetLayerTypeIfEnabled(0);
                    sheetView.setVisibility(8);
                    Iterator it = BottomSheetLayout.this.onSheetDismissedListeners.iterator();
                    while (it.hasNext()) {
                        ((OnSheetDismissedListener) it.next()).onDismissed(BottomSheetLayout.this);
                    }
                    ViewTransformer unused2 = BottomSheetLayout.this.viewTransformer = null;
                    if (BottomSheetLayout.this.runAfterDismiss != null) {
                        BottomSheetLayout.this.runAfterDismiss.run();
                        Runnable unused3 = BottomSheetLayout.this.runAfterDismiss = null;
                    }
                }
            }
        });
        ofFloat.start();
        this.currentAnimator = ofFloat;
        this.sheetStartX = 0;
        this.sheetEndX = this.screenWidth;
    }

    public void showWithSheetView(final View view, final ViewTransformer viewTransformer2, final boolean z) {
        if (this.state != State.HIDDEN) {
            dismissSheet(new Runnable() {
                public void run() {
                    BottomSheetLayout.this.showWithSheetView(view, viewTransformer2, z);
                }
            });
            return;
        }
        setState(State.PREPARING);
        initSheetView(view);
        this.viewTransformer = viewTransformer2;
        if (getSheetView() != null) {
            Iterator<OnSheetStateChangeListener> it = this.onSheetStateChangeListeners.iterator();
            while (it.hasNext()) {
                it.next().onSheetReady(z);
            }
        }
        this.currentSheetViewHeight = view.getMeasuredHeight();
        C124025 r4 = new View.OnLayoutChangeListener() {
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                float f;
                BottomSheetLayout bottomSheetLayout = BottomSheetLayout.this;
                float access$000 = bottomSheetLayout.sheetTranslation;
                if (i8 < i4) {
                    f = -0.4f;
                } else {
                    f = 0.4f;
                }
                float unused = bottomSheetLayout.sheetTranslation = access$000 + f;
                if (BottomSheetLayout.this.state != State.HIDDEN) {
                    if (BottomSheetLayout.this.sheetTranslation < ((float) BottomSheetLayout.this.currentSheetViewHeight)) {
                        if (BottomSheetLayout.this.state == State.EXPANDED) {
                            BottomSheetLayout.this.setState(State.PEEKED);
                        }
                        BottomSheetLayout bottomSheetLayout2 = BottomSheetLayout.this;
                        bottomSheetLayout2.setSheetTranslation(bottomSheetLayout2.sheetTranslation);
                    } else if (BottomSheetLayout.this.currentSheetViewHeight > 0 && BottomSheetLayout.this.sheetTranslation > ((float) BottomSheetLayout.this.currentSheetViewHeight) && BottomSheetLayout.this.state == State.PEEKED) {
                        if (BottomSheetLayout.this.sheetTranslation == BottomSheetLayout.this.getMaxSheetTranslation()) {
                            BottomSheetLayout.this.setState(State.EXPANDED);
                        }
                        BottomSheetLayout bottomSheetLayout3 = BottomSheetLayout.this;
                        bottomSheetLayout3.setSheetTranslation(bottomSheetLayout3.sheetTranslation);
                    }
                }
                BottomSheetLayout bottomSheetLayout4 = BottomSheetLayout.this;
                int unused2 = bottomSheetLayout4.currentSheetViewHeight = (int) bottomSheetLayout4.sheetTranslation;
            }
        };
        this.sheetViewOnLayoutChangeListener = r4;
        view.addOnLayoutChangeListener(r4);
    }

    public void addView(View view, int i) {
        addView(view);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addView(view);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addView(view);
    }

    public void addView(View view, int i, int i2) {
        addView(view);
    }

    public BottomSheetLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BottomSheetLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.initialized = false;
        this.contentClipRect = new Rect();
        this.state = State.HIDDEN;
        this.peekOnDismiss = false;
        this.animationInterpolator = new DecelerateInterpolator(1.6f);
        this.defaultViewTransformer = new IdentityViewTransformer();
        this.shouldDimContentView = true;
        this.useHardwareLayerWhileAnimating = true;
        this.onSheetDismissedListeners = new CopyOnWriteArraySet<>();
        this.onSheetStateChangeListeners = new CopyOnWriteArraySet<>();
        this.isKeyboardShown = false;
        this.interceptContentTouch = true;
        this.maxTranslationOffset = BitmapDescriptorFactory.HUE_RED;
        this.alwaysPeekSheet = false;
        this.screenHeight = 0;
        this.screenWidth = 0;
        this.isTablet = getResources().getBoolean(C12238R.bool.bottomsheet_is_tablet);
        this.defaultSheetWidth = getResources().getDimensionPixelSize(C12238R.dimen.bottomsheet_default_sheet_width);
        this.sheetStartX = 0;
        this.sheetEndX = 0;
        init();
    }
}
