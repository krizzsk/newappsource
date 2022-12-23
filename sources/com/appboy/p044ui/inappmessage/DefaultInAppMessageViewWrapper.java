package com.appboy.p044ui.inappmessage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import com.appboy.enums.inappmessage.DismissType;
import com.appboy.enums.inappmessage.SlideFrom;
import com.appboy.models.IInAppMessage;
import com.appboy.models.IInAppMessageImmersive;
import com.appboy.models.InAppMessageSlideup;
import com.appboy.p044ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import com.appboy.p044ui.inappmessage.listeners.SwipeDismissTouchListener;
import com.appboy.p044ui.inappmessage.listeners.TouchAwareSwipeDismissTouchListener;
import com.appboy.p044ui.inappmessage.views.AppboyInAppMessageHtmlBaseView;
import com.appboy.p044ui.support.ViewUtils;
import com.appboy.support.AppboyLogger;
import com.braze.configuration.BrazeConfigurationProvider;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p242s1.C6396v0;
import p259t5.C6591a;
import p259t5.C6592b;
import p259t5.C6593c;
import p259t5.C6594d;
import p373au.C13533e;

/* renamed from: com.appboy.ui.inappmessage.DefaultInAppMessageViewWrapper */
public class DefaultInAppMessageViewWrapper implements IInAppMessageViewWrapper {
    /* access modifiers changed from: private */
    public static final String TAG = AppboyLogger.getBrazeLogTag(DefaultInAppMessageViewWrapper.class);
    public List<View> mButtonViews;
    public final View mClickableInAppMessageView;
    public View mCloseButton;
    public final Animation mClosingAnimation;
    public final BrazeConfigurationProvider mConfigurationProvider;
    private ViewGroup mContentViewGroupParentLayout;
    public Runnable mDismissRunnable;
    public final IInAppMessage mInAppMessage;
    public final InAppMessageCloser mInAppMessageCloser;
    public final View mInAppMessageView;
    public final IInAppMessageViewLifecycleListener mInAppMessageViewLifecycleListener;
    public boolean mIsAnimatingClose;
    public final Animation mOpeningAnimation;
    public View mPreviouslyFocusedView;
    public Map<Integer, Integer> mViewAccessibilityFlagMap;

    /* renamed from: com.appboy.ui.inappmessage.DefaultInAppMessageViewWrapper$6 */
    public static /* synthetic */ class C19996 {
        public static final /* synthetic */ int[] $SwitchMap$com$appboy$enums$inappmessage$MessageType;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.appboy.enums.inappmessage.MessageType[] r0 = com.appboy.enums.inappmessage.MessageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$appboy$enums$inappmessage$MessageType = r0
                com.appboy.enums.inappmessage.MessageType r1 = com.appboy.enums.inappmessage.MessageType.MODAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$appboy$enums$inappmessage$MessageType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.appboy.enums.inappmessage.MessageType r1 = com.appboy.enums.inappmessage.MessageType.FULL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appboy.p044ui.inappmessage.DefaultInAppMessageViewWrapper.C19996.<clinit>():void");
        }
    }

    public DefaultInAppMessageViewWrapper(View view, IInAppMessage iInAppMessage, IInAppMessageViewLifecycleListener iInAppMessageViewLifecycleListener, BrazeConfigurationProvider brazeConfigurationProvider, Animation animation, Animation animation2, View view2) {
        this.mPreviouslyFocusedView = null;
        this.mViewAccessibilityFlagMap = new HashMap();
        this.mInAppMessageView = view;
        this.mInAppMessage = iInAppMessage;
        this.mInAppMessageViewLifecycleListener = iInAppMessageViewLifecycleListener;
        this.mConfigurationProvider = brazeConfigurationProvider;
        this.mOpeningAnimation = animation;
        this.mClosingAnimation = animation2;
        this.mIsAnimatingClose = false;
        if (view2 != null) {
            this.mClickableInAppMessageView = view2;
        } else {
            this.mClickableInAppMessageView = view;
        }
        if (iInAppMessage instanceof InAppMessageSlideup) {
            TouchAwareSwipeDismissTouchListener touchAwareSwipeDismissTouchListener = new TouchAwareSwipeDismissTouchListener(view, createDismissCallbacks());
            touchAwareSwipeDismissTouchListener.setTouchListener(createTouchAwareListener());
            this.mClickableInAppMessageView.setOnTouchListener(touchAwareSwipeDismissTouchListener);
        }
        this.mClickableInAppMessageView.setOnClickListener(createClickListener());
        this.mInAppMessageCloser = new InAppMessageCloser(this);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C6396v0 lambda$addInAppMessageViewToViewGroup$0(View view, View view2, C6396v0 v0Var) {
        if (v0Var == null) {
            return v0Var;
        }
        IInAppMessageView iInAppMessageView = (IInAppMessageView) view;
        if (!iInAppMessageView.hasAppliedWindowInsets()) {
            AppboyLogger.m5457v(TAG, "Calling applyWindowInsets on in-app message view.");
            iInAppMessageView.applyWindowInsets(v0Var);
        } else {
            AppboyLogger.m5448d(TAG, "Not reapplying window insets to in-app message view.");
        }
        return v0Var;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$createButtonClickListener$2(View view) {
        IInAppMessageImmersive iInAppMessageImmersive = (IInAppMessageImmersive) this.mInAppMessage;
        if (iInAppMessageImmersive.getMessageButtons().isEmpty()) {
            AppboyLogger.m5448d(TAG, "Cannot create button click listener since this in-app message does not have message buttons.");
            return;
        }
        for (int i = 0; i < this.mButtonViews.size(); i++) {
            if (view.getId() == this.mButtonViews.get(i).getId()) {
                this.mInAppMessageViewLifecycleListener.onButtonClicked(this.mInAppMessageCloser, iInAppMessageImmersive.getMessageButtons().get(i), iInAppMessageImmersive);
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$createClickListener$1(View view) {
        IInAppMessage iInAppMessage = this.mInAppMessage;
        if (!(iInAppMessage instanceof IInAppMessageImmersive)) {
            this.mInAppMessageViewLifecycleListener.onClicked(this.mInAppMessageCloser, this.mInAppMessageView, iInAppMessage);
        } else if (((IInAppMessageImmersive) iInAppMessage).getMessageButtons().isEmpty()) {
            this.mInAppMessageViewLifecycleListener.onClicked(this.mInAppMessageCloser, this.mInAppMessageView, this.mInAppMessage);
        }
    }

    public static void resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAuto(ViewGroup viewGroup, Map<Integer, Integer> map) {
        if (viewGroup == null) {
            AppboyLogger.m5459w(TAG, "In-app message ViewGroup was null. Not resetting in-app message accessibility for exclusive mode.");
            return;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                int id = childAt.getId();
                if (map.containsKey(Integer.valueOf(id))) {
                    int intValue = map.get(Integer.valueOf(id)).intValue();
                    WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                    C6333d0.C6337d.m15059s(childAt, intValue);
                } else {
                    WeakHashMap<View, C6382p0> weakHashMap2 = C6333d0.f19990a;
                    C6333d0.C6337d.m15059s(childAt, 0);
                }
            }
        }
    }

    public static void setAllViewGroupChildrenAsNonAccessibilityImportant(ViewGroup viewGroup, Map<Integer, Integer> map) {
        if (viewGroup == null) {
            AppboyLogger.m5459w(TAG, "In-app message ViewGroup was null. Not preparing in-app message accessibility for exclusive mode.");
            return;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                map.put(Integer.valueOf(childAt.getId()), Integer.valueOf(childAt.getImportantForAccessibility()));
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                C6333d0.C6337d.m15059s(childAt, 4);
            }
        }
    }

    public void addDismissRunnable() {
        if (this.mDismissRunnable == null) {
            C6594d dVar = new C6594d(0);
            this.mDismissRunnable = dVar;
            this.mInAppMessageView.postDelayed(dVar, (long) this.mInAppMessage.getDurationInMilliseconds());
        }
    }

    public void addInAppMessageViewToViewGroup(ViewGroup viewGroup, IInAppMessage iInAppMessage, View view, IInAppMessageViewLifecycleListener iInAppMessageViewLifecycleListener) {
        iInAppMessageViewLifecycleListener.beforeOpened(view, iInAppMessage);
        String str = TAG;
        AppboyLogger.m5448d(str, "Adding In-app message view to parent view group.");
        viewGroup.addView(view, getLayoutParams(iInAppMessage));
        if (view instanceof IInAppMessageView) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6341h.m15083c(viewGroup);
            C6333d0.C6342i.m15104u(viewGroup, new C13533e(view, 3));
        }
        if (iInAppMessage.getAnimateIn()) {
            AppboyLogger.m5448d(str, "In-app message view will animate into the visible area.");
            setAndStartAnimation(true);
            return;
        }
        AppboyLogger.m5448d(str, "In-app message view will be placed instantly into the visible area.");
        if (iInAppMessage.getDismissType() == DismissType.AUTO_DISMISS) {
            addDismissRunnable();
        }
        finalizeViewBeforeDisplay(iInAppMessage, view, iInAppMessageViewLifecycleListener);
    }

    public void announceForAccessibilityIfNecessary() {
        announceForAccessibilityIfNecessary("In app message displayed.");
    }

    public void close() {
        if (this.mConfigurationProvider.getIsInAppMessageAccessibilityExclusiveModeEnabled()) {
            resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAuto(this.mContentViewGroupParentLayout, this.mViewAccessibilityFlagMap);
        }
        this.mInAppMessageView.removeCallbacks(this.mDismissRunnable);
        this.mInAppMessageViewLifecycleListener.beforeClosed(this.mInAppMessageView, this.mInAppMessage);
        if (this.mInAppMessage.getAnimateOut()) {
            this.mIsAnimatingClose = true;
            setAndStartAnimation(false);
            return;
        }
        closeInAppMessageView();
    }

    public void closeInAppMessageView() {
        String str = TAG;
        AppboyLogger.m5448d(str, "Closing in-app message view");
        ViewUtils.removeViewFromParent(this.mInAppMessageView);
        View view = this.mInAppMessageView;
        if (view instanceof AppboyInAppMessageHtmlBaseView) {
            ((AppboyInAppMessageHtmlBaseView) view).finishWebViewDisplay();
        }
        if (this.mPreviouslyFocusedView != null) {
            StringBuilder k = C13555b.m33972k("Returning focus to view after closing message. View: ");
            k.append(this.mPreviouslyFocusedView);
            AppboyLogger.m5448d(str, k.toString());
            this.mPreviouslyFocusedView.requestFocus();
        }
        this.mInAppMessageViewLifecycleListener.afterClosed(this.mInAppMessage);
    }

    public Animation.AnimationListener createAnimationListener(boolean z) {
        if (z) {
            return new Animation.AnimationListener() {
                public void onAnimationEnd(Animation animation) {
                    if (DefaultInAppMessageViewWrapper.this.mInAppMessage.getDismissType() == DismissType.AUTO_DISMISS) {
                        DefaultInAppMessageViewWrapper.this.addDismissRunnable();
                    }
                    AppboyLogger.m5448d(DefaultInAppMessageViewWrapper.TAG, "In-app message animated into view.");
                    DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper = DefaultInAppMessageViewWrapper.this;
                    defaultInAppMessageViewWrapper.finalizeViewBeforeDisplay(defaultInAppMessageViewWrapper.mInAppMessage, defaultInAppMessageViewWrapper.mInAppMessageView, defaultInAppMessageViewWrapper.mInAppMessageViewLifecycleListener);
                }

                public void onAnimationRepeat(Animation animation) {
                }

                public void onAnimationStart(Animation animation) {
                }
            };
        }
        return new Animation.AnimationListener() {
            public void onAnimationEnd(Animation animation) {
                DefaultInAppMessageViewWrapper.this.mInAppMessageView.clearAnimation();
                DefaultInAppMessageViewWrapper.this.mInAppMessageView.setVisibility(8);
                DefaultInAppMessageViewWrapper.this.closeInAppMessageView();
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        };
    }

    public View.OnClickListener createButtonClickListener() {
        return new C6593c(this, 0);
    }

    public View.OnClickListener createClickListener() {
        return new C6592b(this, 0);
    }

    public View.OnClickListener createCloseInAppMessageClickListener() {
        return new C6591a();
    }

    public SwipeDismissTouchListener.DismissCallbacks createDismissCallbacks() {
        return new SwipeDismissTouchListener.DismissCallbacks() {
            public boolean canDismiss(Object obj) {
                return true;
            }

            public void onDismiss(View view, Object obj) {
                DefaultInAppMessageViewWrapper.this.mInAppMessage.setAnimateOut(false);
                AppboyInAppMessageManager.getInstance().hideCurrentlyDisplayingInAppMessage(true);
            }
        };
    }

    public TouchAwareSwipeDismissTouchListener.ITouchListener createTouchAwareListener() {
        return new TouchAwareSwipeDismissTouchListener.ITouchListener() {
            public void onTouchEnded() {
                if (DefaultInAppMessageViewWrapper.this.mInAppMessage.getDismissType() == DismissType.AUTO_DISMISS) {
                    DefaultInAppMessageViewWrapper.this.addDismissRunnable();
                }
            }

            public void onTouchStartedOrContinued() {
                DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper = DefaultInAppMessageViewWrapper.this;
                defaultInAppMessageViewWrapper.mInAppMessageView.removeCallbacks(defaultInAppMessageViewWrapper.mDismissRunnable);
            }
        };
    }

    public void finalizeViewBeforeDisplay(IInAppMessage iInAppMessage, View view, IInAppMessageViewLifecycleListener iInAppMessageViewLifecycleListener) {
        if (ViewUtils.isDeviceNotInTouchMode(view)) {
            int i = C19996.$SwitchMap$com$appboy$enums$inappmessage$MessageType[iInAppMessage.getMessageType().ordinal()];
            if (!(i == 1 || i == 2)) {
                ViewUtils.setFocusableInTouchModeAndRequestFocus(view);
            }
        } else {
            ViewUtils.setFocusableInTouchModeAndRequestFocus(view);
        }
        announceForAccessibilityIfNecessary();
        iInAppMessageViewLifecycleListener.afterOpened(view, iInAppMessage);
    }

    public IInAppMessage getInAppMessage() {
        return this.mInAppMessage;
    }

    public View getInAppMessageView() {
        return this.mInAppMessageView;
    }

    public boolean getIsAnimatingClose() {
        return this.mIsAnimatingClose;
    }

    public ViewGroup.LayoutParams getLayoutParams(IInAppMessage iInAppMessage) {
        int i;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        if (iInAppMessage instanceof InAppMessageSlideup) {
            if (((InAppMessageSlideup) iInAppMessage).getSlideFrom() == SlideFrom.TOP) {
                i = 48;
            } else {
                i = 80;
            }
            layoutParams.gravity = i;
        }
        return layoutParams;
    }

    public ViewGroup getParentViewGroup(Activity activity) {
        return (ViewGroup) activity.getWindow().getDecorView().findViewById(16908290);
    }

    public void open(Activity activity) {
        String str = TAG;
        AppboyLogger.m5457v(str, "Opening in-app message view wrapper");
        final ViewGroup parentViewGroup = getParentViewGroup(activity);
        int height = parentViewGroup.getHeight();
        if (this.mConfigurationProvider.getIsInAppMessageAccessibilityExclusiveModeEnabled()) {
            this.mContentViewGroupParentLayout = parentViewGroup;
            this.mViewAccessibilityFlagMap.clear();
            setAllViewGroupChildrenAsNonAccessibilityImportant(this.mContentViewGroupParentLayout, this.mViewAccessibilityFlagMap);
        }
        this.mPreviouslyFocusedView = activity.getCurrentFocus();
        if (height == 0) {
            ViewTreeObserver viewTreeObserver = parentViewGroup.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                    public void onGlobalLayout() {
                        String access$000 = DefaultInAppMessageViewWrapper.TAG;
                        StringBuilder k = C13555b.m33972k("Detected root view height of ");
                        k.append(parentViewGroup.getHeight());
                        k.append(" in onGlobalLayout");
                        AppboyLogger.m5448d(access$000, k.toString());
                        parentViewGroup.removeView(DefaultInAppMessageViewWrapper.this.mInAppMessageView);
                        DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper = DefaultInAppMessageViewWrapper.this;
                        defaultInAppMessageViewWrapper.addInAppMessageViewToViewGroup(parentViewGroup, defaultInAppMessageViewWrapper.mInAppMessage, defaultInAppMessageViewWrapper.mInAppMessageView, defaultInAppMessageViewWrapper.mInAppMessageViewLifecycleListener);
                        parentViewGroup.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                });
                return;
            }
            return;
        }
        AppboyLogger.m5448d(str, "Detected root view height of " + height);
        addInAppMessageViewToViewGroup(parentViewGroup, this.mInAppMessage, this.mInAppMessageView, this.mInAppMessageViewLifecycleListener);
    }

    public void setAndStartAnimation(boolean z) {
        Animation animation;
        if (z) {
            animation = this.mOpeningAnimation;
        } else {
            animation = this.mClosingAnimation;
        }
        animation.setAnimationListener(createAnimationListener(z));
        this.mInAppMessageView.clearAnimation();
        this.mInAppMessageView.setAnimation(animation);
        animation.startNow();
        this.mInAppMessageView.invalidate();
    }

    public void announceForAccessibilityIfNecessary(String str) {
        View view = this.mInAppMessageView;
        if (view instanceof IInAppMessageImmersiveView) {
            String message = this.mInAppMessage.getMessage();
            IInAppMessage iInAppMessage = this.mInAppMessage;
            if (iInAppMessage instanceof IInAppMessageImmersive) {
                String header = ((IInAppMessageImmersive) iInAppMessage).getHeader();
                View view2 = this.mInAppMessageView;
                view2.announceForAccessibility(header + " . " + message);
                return;
            }
            this.mInAppMessageView.announceForAccessibility(message);
        } else if (view instanceof AppboyInAppMessageHtmlBaseView) {
            view.announceForAccessibility(str);
        }
    }

    public DefaultInAppMessageViewWrapper(View view, IInAppMessage iInAppMessage, IInAppMessageViewLifecycleListener iInAppMessageViewLifecycleListener, BrazeConfigurationProvider brazeConfigurationProvider, Animation animation, Animation animation2, View view2, List<View> list, View view3) {
        this(view, iInAppMessage, iInAppMessageViewLifecycleListener, brazeConfigurationProvider, animation, animation2, view2);
        if (view3 != null) {
            this.mCloseButton = view3;
            view3.setOnClickListener(createCloseInAppMessageClickListener());
        }
        if (list != null) {
            this.mButtonViews = list;
            for (View onClickListener : list) {
                onClickListener.setOnClickListener(createButtonClickListener());
            }
        }
    }
}
