package p242s1;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.View$OnUnhandledKeyEventListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p055d1.C4329e;
import p129j1.C5349b;
import p241s0.C6313h;
import p242s1.C6315a;
import p242s1.C6323c;
import p242s1.C6396v0;
import p255t1.C6531g;
import p255t1.C6541k;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: s1.d0 */
public final class C6333d0 {

    /* renamed from: a */
    public static WeakHashMap<View, C6382p0> f19990a = null;

    /* renamed from: b */
    public static Field f19991b;

    /* renamed from: c */
    public static boolean f19992c = false;

    /* renamed from: d */
    public static ThreadLocal<Rect> f19993d;

    /* renamed from: e */
    public static final int[] f19994e = {C4329e.accessibility_custom_action_0, C4329e.accessibility_custom_action_1, C4329e.accessibility_custom_action_2, C4329e.accessibility_custom_action_3, C4329e.accessibility_custom_action_4, C4329e.accessibility_custom_action_5, C4329e.accessibility_custom_action_6, C4329e.accessibility_custom_action_7, C4329e.accessibility_custom_action_8, C4329e.accessibility_custom_action_9, C4329e.accessibility_custom_action_10, C4329e.accessibility_custom_action_11, C4329e.accessibility_custom_action_12, C4329e.accessibility_custom_action_13, C4329e.accessibility_custom_action_14, C4329e.accessibility_custom_action_15, C4329e.accessibility_custom_action_16, C4329e.accessibility_custom_action_17, C4329e.accessibility_custom_action_18, C4329e.accessibility_custom_action_19, C4329e.accessibility_custom_action_20, C4329e.accessibility_custom_action_21, C4329e.accessibility_custom_action_22, C4329e.accessibility_custom_action_23, C4329e.accessibility_custom_action_24, C4329e.accessibility_custom_action_25, C4329e.accessibility_custom_action_26, C4329e.accessibility_custom_action_27, C4329e.accessibility_custom_action_28, C4329e.accessibility_custom_action_29, C4329e.accessibility_custom_action_30, C4329e.accessibility_custom_action_31};

    /* renamed from: f */
    public static final C6414y f19995f = new C6414y();

    /* renamed from: g */
    public static final C6334a f19996g = new C6334a();

    /* renamed from: s1.d0$a */
    public static class C6334a implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: b */
        public final WeakHashMap<View, Boolean> f19997b = new WeakHashMap<>();

        public final void onGlobalLayout() {
            boolean z;
            int i;
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry next : this.f19997b.entrySet()) {
                    View view = (View) next.getKey();
                    boolean booleanValue = ((Boolean) next.getValue()).booleanValue();
                    if (!view.isShown() || view.getWindowVisibility() != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (booleanValue != z) {
                        if (z) {
                            i = 16;
                        } else {
                            i = 32;
                        }
                        C6333d0.m15021i(i, view);
                        this.f19997b.put(view, Boolean.valueOf(z));
                    }
                }
            }
        }

        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        public final void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: s1.d0$b */
    public static abstract class C6335b<T> {

        /* renamed from: a */
        public final int f19998a;

        /* renamed from: b */
        public final Class<T> f19999b;

        /* renamed from: c */
        public final int f20000c;

        /* renamed from: d */
        public final int f20001d;

        public C6335b(int i, Class<T> cls, int i2, int i3) {
            this.f19998a = i;
            this.f19999b = cls;
            this.f20001d = i2;
            this.f20000c = i3;
        }

        /* renamed from: a */
        public static boolean m15034a(Boolean bool, Boolean bool2) {
            boolean z;
            boolean z2;
            if (bool == null || !bool.booleanValue()) {
                z = false;
            } else {
                z = true;
            }
            if (bool2 == null || !bool2.booleanValue()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z == z2) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public abstract T mo22448b(View view);

        /* renamed from: c */
        public abstract void mo22449c(View view, T t);

        /* renamed from: d */
        public final T mo22468d(View view) {
            boolean z;
            if (Build.VERSION.SDK_INT >= this.f20000c) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return mo22448b(view);
            }
            T tag = view.getTag(this.f19998a);
            if (this.f19999b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        /* renamed from: e */
        public final void mo22469e(View view, T t) {
            boolean z;
            if (Build.VERSION.SDK_INT >= this.f20000c) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                mo22449c(view, t);
            } else if (mo22450f(mo22468d(view), t)) {
                C6333d0.m15016d(view);
                view.setTag(this.f19998a, t);
                C6333d0.m15021i(this.f20001d, view);
            }
        }

        /* renamed from: f */
        public abstract boolean mo22450f(T t, T t2);
    }

    /* renamed from: s1.d0$c */
    public static class C6336c {
        /* renamed from: a */
        public static boolean m15040a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* renamed from: s1.d0$d */
    public static class C6337d {
        /* renamed from: a */
        public static AccessibilityNodeProvider m15041a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        /* renamed from: b */
        public static boolean m15042b(View view) {
            return view.getFitsSystemWindows();
        }

        /* renamed from: c */
        public static int m15043c(View view) {
            return view.getImportantForAccessibility();
        }

        /* renamed from: d */
        public static int m15044d(View view) {
            return view.getMinimumHeight();
        }

        /* renamed from: e */
        public static int m15045e(View view) {
            return view.getMinimumWidth();
        }

        /* renamed from: f */
        public static ViewParent m15046f(View view) {
            return view.getParentForAccessibility();
        }

        /* renamed from: g */
        public static int m15047g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        /* renamed from: h */
        public static boolean m15048h(View view) {
            return view.hasOverlappingRendering();
        }

        /* renamed from: i */
        public static boolean m15049i(View view) {
            return view.hasTransientState();
        }

        /* renamed from: j */
        public static boolean m15050j(View view, int i, Bundle bundle) {
            return view.performAccessibilityAction(i, bundle);
        }

        /* renamed from: k */
        public static void m15051k(View view) {
            view.postInvalidateOnAnimation();
        }

        /* renamed from: l */
        public static void m15052l(View view, int i, int i2, int i3, int i4) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        }

        /* renamed from: m */
        public static void m15053m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        /* renamed from: n */
        public static void m15054n(View view, Runnable runnable, long j) {
            view.postOnAnimationDelayed(runnable, j);
        }

        /* renamed from: o */
        public static void m15055o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        /* renamed from: p */
        public static void m15056p(View view) {
            view.requestFitSystemWindows();
        }

        /* renamed from: q */
        public static void m15057q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        /* renamed from: r */
        public static void m15058r(View view, boolean z) {
            view.setHasTransientState(z);
        }

        /* renamed from: s */
        public static void m15059s(View view, int i) {
            view.setImportantForAccessibility(i);
        }
    }

    /* renamed from: s1.d0$e */
    public static class C6338e {
        /* renamed from: a */
        public static int m15060a() {
            return View.generateViewId();
        }

        /* renamed from: b */
        public static Display m15061b(View view) {
            return view.getDisplay();
        }

        /* renamed from: c */
        public static int m15062c(View view) {
            return view.getLabelFor();
        }

        /* renamed from: d */
        public static int m15063d(View view) {
            return view.getLayoutDirection();
        }

        /* renamed from: e */
        public static int m15064e(View view) {
            return view.getPaddingEnd();
        }

        /* renamed from: f */
        public static int m15065f(View view) {
            return view.getPaddingStart();
        }

        /* renamed from: g */
        public static boolean m15066g(View view) {
            return view.isPaddingRelative();
        }

        /* renamed from: h */
        public static void m15067h(View view, int i) {
            view.setLabelFor(i);
        }

        /* renamed from: i */
        public static void m15068i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        /* renamed from: j */
        public static void m15069j(View view, int i) {
            view.setLayoutDirection(i);
        }

        /* renamed from: k */
        public static void m15070k(View view, int i, int i2, int i3, int i4) {
            view.setPaddingRelative(i, i2, i3, i4);
        }
    }

    /* renamed from: s1.d0$f */
    public static class C6339f {
        /* renamed from: a */
        public static Rect m15071a(View view) {
            return view.getClipBounds();
        }

        /* renamed from: b */
        public static boolean m15072b(View view) {
            return view.isInLayout();
        }

        /* renamed from: c */
        public static void m15073c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* renamed from: s1.d0$g */
    public static class C6340g {
        /* renamed from: a */
        public static int m15074a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        /* renamed from: b */
        public static boolean m15075b(View view) {
            return view.isAttachedToWindow();
        }

        /* renamed from: c */
        public static boolean m15076c(View view) {
            return view.isLaidOut();
        }

        /* renamed from: d */
        public static boolean m15077d(View view) {
            return view.isLayoutDirectionResolved();
        }

        /* renamed from: e */
        public static void m15078e(ViewParent viewParent, View view, View view2, int i) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
        }

        /* renamed from: f */
        public static void m15079f(View view, int i) {
            view.setAccessibilityLiveRegion(i);
        }

        /* renamed from: g */
        public static void m15080g(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    /* renamed from: s1.d0$h */
    public static class C6341h {
        /* renamed from: a */
        public static WindowInsets m15081a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        /* renamed from: b */
        public static WindowInsets m15082b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        /* renamed from: c */
        public static void m15083c(View view) {
            view.requestApplyInsets();
        }
    }

    /* renamed from: s1.d0$i */
    public static class C6342i {

        /* renamed from: s1.d0$i$a */
        public class C6343a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            public C6396v0 f20002a = null;

            /* renamed from: b */
            public final /* synthetic */ View f20003b;

            /* renamed from: c */
            public final /* synthetic */ C6391t f20004c;

            public C6343a(View view, C6391t tVar) {
                this.f20003b = view;
                this.f20004c = tVar;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C6396v0 i = C6396v0.m15249i(windowInsets, view);
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 30) {
                    C6342i.m15084a(windowInsets, this.f20003b);
                    if (i.equals(this.f20002a)) {
                        return this.f20004c.onApplyWindowInsets(view, i).mo22509h();
                    }
                }
                this.f20002a = i;
                C6396v0 onApplyWindowInsets = this.f20004c.onApplyWindowInsets(view, i);
                if (i2 >= 30) {
                    return onApplyWindowInsets.mo22509h();
                }
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                C6341h.m15083c(view);
                return onApplyWindowInsets.mo22509h();
            }
        }

        /* renamed from: a */
        public static void m15084a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(C4329e.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        /* renamed from: b */
        public static C6396v0 m15085b(View view, C6396v0 v0Var, Rect rect) {
            WindowInsets h = v0Var.mo22509h();
            if (h != null) {
                return C6396v0.m15249i(view.computeSystemWindowInsets(h, rect), view);
            }
            rect.setEmpty();
            return v0Var;
        }

        /* renamed from: c */
        public static boolean m15086c(View view, float f, float f2, boolean z) {
            return view.dispatchNestedFling(f, f2, z);
        }

        /* renamed from: d */
        public static boolean m15087d(View view, float f, float f2) {
            return view.dispatchNestedPreFling(f, f2);
        }

        /* renamed from: e */
        public static boolean m15088e(View view, int i, int i2, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }

        /* renamed from: f */
        public static boolean m15089f(View view, int i, int i2, int i3, int i4, int[] iArr) {
            return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
        }

        /* renamed from: g */
        public static ColorStateList m15090g(View view) {
            return view.getBackgroundTintList();
        }

        /* renamed from: h */
        public static PorterDuff.Mode m15091h(View view) {
            return view.getBackgroundTintMode();
        }

        /* renamed from: i */
        public static float m15092i(View view) {
            return view.getElevation();
        }

        /* renamed from: j */
        public static C6396v0 m15093j(View view) {
            C6396v0.C6401e eVar;
            if (C6396v0.C6397a.f20048d && view.isAttachedToWindow()) {
                try {
                    Object obj = C6396v0.C6397a.f20045a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) C6396v0.C6397a.f20046b.get(obj);
                        Rect rect2 = (Rect) C6396v0.C6397a.f20047c.get(obj);
                        if (!(rect == null || rect2 == null)) {
                            int i = Build.VERSION.SDK_INT;
                            if (i >= 30) {
                                eVar = new C6396v0.C6400d();
                            } else if (i >= 29) {
                                eVar = new C6396v0.C6399c();
                            } else {
                                eVar = new C6396v0.C6398b();
                            }
                            eVar.mo22512c(C5349b.m13418a(rect.left, rect.top, rect.right, rect.bottom));
                            eVar.mo22513d(C5349b.m13418a(rect2.left, rect2.top, rect2.right, rect2.bottom));
                            C6396v0 b = eVar.mo22511b();
                            b.f20044a.mo22522p(b);
                            b.f20044a.mo22515d(view.getRootView());
                            return b;
                        }
                    }
                } catch (IllegalAccessException e) {
                    e.getMessage();
                }
            }
            return null;
        }

        /* renamed from: k */
        public static String m15094k(View view) {
            return view.getTransitionName();
        }

        /* renamed from: l */
        public static float m15095l(View view) {
            return view.getTranslationZ();
        }

        /* renamed from: m */
        public static float m15096m(View view) {
            return view.getZ();
        }

        /* renamed from: n */
        public static boolean m15097n(View view) {
            return view.hasNestedScrollingParent();
        }

        /* renamed from: o */
        public static boolean m15098o(View view) {
            return view.isImportantForAccessibility();
        }

        /* renamed from: p */
        public static boolean m15099p(View view) {
            return view.isNestedScrollingEnabled();
        }

        /* renamed from: q */
        public static void m15100q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        /* renamed from: r */
        public static void m15101r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        /* renamed from: s */
        public static void m15102s(View view, float f) {
            view.setElevation(f);
        }

        /* renamed from: t */
        public static void m15103t(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        /* renamed from: u */
        public static void m15104u(View view, C6391t tVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(C4329e.tag_on_apply_window_listener, tVar);
            }
            if (tVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(C4329e.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new C6343a(view, tVar));
            }
        }

        /* renamed from: v */
        public static void m15105v(View view, String str) {
            view.setTransitionName(str);
        }

        /* renamed from: w */
        public static void m15106w(View view, float f) {
            view.setTranslationZ(f);
        }

        /* renamed from: x */
        public static void m15107x(View view, float f) {
            view.setZ(f);
        }

        /* renamed from: y */
        public static boolean m15108y(View view, int i) {
            return view.startNestedScroll(i);
        }

        /* renamed from: z */
        public static void m15109z(View view) {
            view.stopNestedScroll();
        }
    }

    /* renamed from: s1.d0$j */
    public static class C6344j {
        /* renamed from: a */
        public static C6396v0 m15110a(View view) {
            WindowInsets c = view.getRootWindowInsets();
            if (c == null) {
                return null;
            }
            C6396v0 i = C6396v0.m15249i(c, (View) null);
            i.f20044a.mo22522p(i);
            i.f20044a.mo22515d(view.getRootView());
            return i;
        }

        /* renamed from: b */
        public static int m15111b(View view) {
            return view.getScrollIndicators();
        }

        /* renamed from: c */
        public static void m15112c(View view, int i) {
            view.setScrollIndicators(i);
        }

        /* renamed from: d */
        public static void m15113d(View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* renamed from: s1.d0$k */
    public static class C6345k {
        /* renamed from: a */
        public static void m15114a(View view) {
            view.cancelDragAndDrop();
        }

        /* renamed from: b */
        public static void m15115b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        /* renamed from: c */
        public static void m15116c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        /* renamed from: d */
        public static void m15117d(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        /* renamed from: e */
        public static boolean m15118e(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i);
        }

        /* renamed from: f */
        public static void m15119f(View view, View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    /* renamed from: s1.d0$l */
    public static class C6346l {
        /* renamed from: a */
        public static void m15120a(View view, Collection<View> collection, int i) {
            view.addKeyboardNavigationClusters(collection, i);
        }

        /* renamed from: b */
        public static int m15121b(View view) {
            return view.getImportantForAutofill();
        }

        /* renamed from: c */
        public static int m15122c(View view) {
            return view.getNextClusterForwardId();
        }

        /* renamed from: d */
        public static boolean m15123d(View view) {
            return view.hasExplicitFocusable();
        }

        /* renamed from: e */
        public static boolean m15124e(View view) {
            return view.isFocusedByDefault();
        }

        /* renamed from: f */
        public static boolean m15125f(View view) {
            return view.isImportantForAutofill();
        }

        /* renamed from: g */
        public static boolean m15126g(View view) {
            return view.isKeyboardNavigationCluster();
        }

        /* renamed from: h */
        public static View m15127h(View view, View view2, int i) {
            return view.keyboardNavigationClusterSearch(view2, i);
        }

        /* renamed from: i */
        public static boolean m15128i(View view) {
            return view.restoreDefaultFocus();
        }

        /* renamed from: j */
        public static void m15129j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        /* renamed from: k */
        public static void m15130k(View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        /* renamed from: l */
        public static void m15131l(View view, int i) {
            view.setImportantForAutofill(i);
        }

        /* renamed from: m */
        public static void m15132m(View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        /* renamed from: n */
        public static void m15133n(View view, int i) {
            view.setNextClusterForwardId(i);
        }

        /* renamed from: o */
        public static void m15134o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* renamed from: s1.d0$m */
    public static class C6347m {
        /* renamed from: a */
        public static void m15135a(View view, C6352r rVar) {
            int i = C4329e.tag_unhandled_key_listeners;
            C6313h hVar = (C6313h) view.getTag(i);
            if (hVar == null) {
                hVar = new C6313h();
                view.setTag(i, hVar);
            }
            Objects.requireNonNull(rVar);
            C6358f0 f0Var = new C6358f0(rVar);
            hVar.put(rVar, f0Var);
            view.addOnUnhandledKeyEventListener(f0Var);
        }

        /* renamed from: b */
        public static CharSequence m15136b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* renamed from: c */
        public static boolean m15137c(View view) {
            return view.isAccessibilityHeading();
        }

        /* renamed from: d */
        public static boolean m15138d(View view) {
            return view.isScreenReaderFocusable();
        }

        /* renamed from: e */
        public static void m15139e(View view, C6352r rVar) {
            View$OnUnhandledKeyEventListener view$OnUnhandledKeyEventListener;
            C6313h hVar = (C6313h) view.getTag(C4329e.tag_unhandled_key_listeners);
            if (hVar != null && (view$OnUnhandledKeyEventListener = (View$OnUnhandledKeyEventListener) hVar.getOrDefault(rVar, null)) != null) {
                view.removeOnUnhandledKeyEventListener(view$OnUnhandledKeyEventListener);
            }
        }

        /* renamed from: f */
        public static <T> T m15140f(View view, int i) {
            return view.requireViewById(i);
        }

        /* renamed from: g */
        public static void m15141g(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        /* renamed from: h */
        public static void m15142h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* renamed from: i */
        public static void m15143i(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    /* renamed from: s1.d0$n */
    public static class C6348n {
        /* renamed from: a */
        public static View.AccessibilityDelegate m15144a(View view) {
            return view.getAccessibilityDelegate();
        }

        /* renamed from: b */
        public static List<Rect> m15145b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        /* renamed from: c */
        public static void m15146c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }

        /* renamed from: d */
        public static void m15147d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* renamed from: s1.d0$o */
    public static class C6349o {
        /* renamed from: a */
        public static CharSequence m15148a(View view) {
            return view.getStateDescription();
        }

        /* renamed from: b */
        public static void m15149b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* renamed from: s1.d0$p */
    public static final class C6350p {
        /* renamed from: a */
        public static String[] m15150a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        /* renamed from: b */
        public static C6323c m15151b(View view, C6323c cVar) {
            ContentInfo a = cVar.f19976a.mo22456a();
            Objects.requireNonNull(a);
            ContentInfo a2 = view.performReceiveContent(a);
            if (a2 == null) {
                return null;
            }
            if (a2 == a) {
                return cVar;
            }
            return new C6323c(new C6323c.C6327d(a2));
        }

        /* renamed from: c */
        public static void m15152c(View view, String[] strArr, C6393u uVar) {
            if (uVar == null) {
                view.setOnReceiveContentListener(strArr, (OnReceiveContentListener) null);
            } else {
                view.setOnReceiveContentListener(strArr, new C6351q(uVar));
            }
        }
    }

    /* renamed from: s1.d0$q */
    public static final class C6351q implements OnReceiveContentListener {

        /* renamed from: a */
        public final C6393u f20005a;

        public C6351q(C6393u uVar) {
            this.f20005a = uVar;
        }

        public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            C6323c cVar = new C6323c(new C6323c.C6327d(contentInfo));
            C6323c a = this.f20005a.mo3529a(view, cVar);
            if (a == null) {
                return null;
            }
            if (a == cVar) {
                return contentInfo;
            }
            ContentInfo a2 = a.f19976a.mo22456a();
            Objects.requireNonNull(a2);
            return a2;
        }
    }

    /* renamed from: s1.d0$r */
    public interface C6352r {
        /* renamed from: a */
        boolean mo22472a();
    }

    /* renamed from: s1.d0$s */
    public static class C6353s {

        /* renamed from: d */
        public static final ArrayList<WeakReference<View>> f20006d = new ArrayList<>();

        /* renamed from: a */
        public WeakHashMap<View, Boolean> f20007a = null;

        /* renamed from: b */
        public SparseArray<WeakReference<View>> f20008b = null;

        /* renamed from: c */
        public WeakReference<KeyEvent> f20009c = null;

        /* renamed from: b */
        public static boolean m15154b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C4329e.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((C6352r) arrayList.get(size)).mo22472a()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public final View mo22473a(View view, KeyEvent keyEvent) {
            View a;
            WeakHashMap<View, Boolean> weakHashMap = this.f20007a;
            if (weakHashMap == null || !weakHashMap.containsKey(view)) {
                return null;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                do {
                    childCount--;
                    if (childCount >= 0) {
                        a = mo22473a(viewGroup.getChildAt(childCount), keyEvent);
                    }
                } while (a == null);
                return a;
            }
            if (m15154b(view, keyEvent)) {
                return view;
            }
            return null;
        }
    }

    static {
        new AtomicInteger(1);
    }

    /* renamed from: a */
    public static C6382p0 m15013a(View view) {
        if (f19990a == null) {
            f19990a = new WeakHashMap<>();
        }
        C6382p0 p0Var = f19990a.get(view);
        if (p0Var != null) {
            return p0Var;
        }
        C6382p0 p0Var2 = new C6382p0(view);
        f19990a.put(view, p0Var2);
        return p0Var2;
    }

    /* renamed from: b */
    public static C6396v0 m15014b(View view, C6396v0 v0Var) {
        WindowInsets h = v0Var.mo22509h();
        if (h != null) {
            WindowInsets a = C6341h.m15081a(view, h);
            if (!a.equals(h)) {
                return C6396v0.m15249i(a, view);
            }
        }
        return v0Var;
    }

    /* renamed from: c */
    public static boolean m15015c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = C6353s.f20006d;
        int i = C4329e.tag_unhandled_key_event_manager;
        C6353s sVar = (C6353s) view.getTag(i);
        if (sVar == null) {
            sVar = new C6353s();
            view.setTag(i, sVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = sVar.f20007a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = C6353s.f20006d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (sVar.f20007a == null) {
                        sVar.f20007a = new WeakHashMap<>();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList<WeakReference<View>> arrayList3 = C6353s.f20006d;
                        View view2 = (View) arrayList3.get(size).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            sVar.f20007a.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                sVar.f20007a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View a = sVar.mo22473a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a != null && !KeyEvent.isModifierKey(keyCode)) {
                if (sVar.f20008b == null) {
                    sVar.f20008b = new SparseArray<>();
                }
                sVar.f20008b.put(keyCode, new WeakReference(a));
            }
        }
        if (a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static void m15016d(View view) {
        C6315a aVar;
        View.AccessibilityDelegate e = m15017e(view);
        if (e == null) {
            aVar = null;
        } else if (e instanceof C6315a.C6316a) {
            aVar = ((C6315a.C6316a) e).f19974a;
        } else {
            aVar = new C6315a(e);
        }
        if (aVar == null) {
            aVar = new C6315a();
        }
        m15029q(view, aVar);
    }

    /* renamed from: e */
    public static View.AccessibilityDelegate m15017e(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C6348n.m15144a(view);
        }
        if (f19992c) {
            return null;
        }
        if (f19991b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f19991b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f19992c = true;
                return null;
            }
        }
        try {
            Object obj = f19991b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f19992c = true;
            return null;
        }
    }

    /* renamed from: f */
    public static ArrayList m15018f(View view) {
        int i = C4329e.tag_accessibility_actions;
        ArrayList arrayList = (ArrayList) view.getTag(i);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i, arrayList2);
        return arrayList2;
    }

    /* renamed from: g */
    public static Rect m15019g() {
        if (f19993d == null) {
            f19993d = new ThreadLocal<>();
        }
        Rect rect = f19993d.get();
        if (rect == null) {
            rect = new Rect();
            f19993d.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: h */
    public static String[] m15020h(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C6350p.m15150a(view);
        }
        return (String[]) view.getTag(C4329e.tag_on_receive_content_mime_types);
    }

    /* renamed from: i */
    public static void m15021i(int i, View view) {
        boolean z;
        Object obj;
        boolean z2;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i2 = C4329e.tag_accessibility_pane_title;
            Class<CharSequence> cls = CharSequence.class;
            int i3 = Build.VERSION.SDK_INT;
            boolean z3 = false;
            if (i3 >= 28) {
                z = true;
            } else {
                z = false;
            }
            Object obj2 = null;
            if (z) {
                obj = C6347m.m15136b(view);
            } else {
                Object tag = view.getTag(i2);
                if (cls.isInstance(tag)) {
                    obj = tag;
                } else {
                    obj = null;
                }
            }
            if (((CharSequence) obj) == null || !view.isShown() || view.getWindowVisibility() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            int i4 = 32;
            if (C6340g.m15074a(view) != 0 || z2) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z2) {
                    i4 = 2048;
                }
                obtain.setEventType(i4);
                C6340g.m15080g(obtain, i);
                if (z2) {
                    List<CharSequence> text = obtain.getText();
                    Class<CharSequence> cls2 = CharSequence.class;
                    if (i3 >= 28) {
                        z3 = true;
                    }
                    if (z3) {
                        obj2 = C6347m.m15136b(view);
                    } else {
                        Object tag2 = view.getTag(i2);
                        if (cls2.isInstance(tag2)) {
                            obj2 = tag2;
                        }
                    }
                    text.add((CharSequence) obj2);
                    if (C6337d.m15043c(view) == 0) {
                        C6337d.m15059s(view, 1);
                    }
                    ViewParent parent = view.getParent();
                    while (true) {
                        if (!(parent instanceof View)) {
                            break;
                        } else if (C6337d.m15043c((View) parent) == 4) {
                            C6337d.m15059s(view, 2);
                            break;
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                C6340g.m15080g(obtain2, i);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                List<CharSequence> text2 = obtain2.getText();
                Class<CharSequence> cls3 = CharSequence.class;
                if (i3 >= 28) {
                    z3 = true;
                }
                if (z3) {
                    obj2 = C6347m.m15136b(view);
                } else {
                    Object tag3 = view.getTag(i2);
                    if (cls3.isInstance(tag3)) {
                        obj2 = tag3;
                    }
                }
                text2.add((CharSequence) obj2);
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    C6340g.m15078e(view.getParent(), view, view, i);
                } catch (AbstractMethodError unused) {
                    view.getParent().getClass();
                }
            }
        }
    }

    /* renamed from: j */
    public static void m15022j(int i, View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
            return;
        }
        Rect g = m15019g();
        boolean z = false;
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            g.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !g.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m15033u(view);
            ViewParent parent2 = view.getParent();
            if (parent2 instanceof View) {
                m15033u((View) parent2);
            }
        }
        if (z && g.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(g);
        }
    }

    /* renamed from: k */
    public static void m15023k(int i, View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
            return;
        }
        Rect g = m15019g();
        boolean z = false;
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            g.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !g.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m15033u(view);
            ViewParent parent2 = view.getParent();
            if (parent2 instanceof View) {
                m15033u((View) parent2);
            }
        }
        if (z && g.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(g);
        }
    }

    /* renamed from: l */
    public static C6396v0 m15024l(View view, C6396v0 v0Var) {
        WindowInsets h = v0Var.mo22509h();
        if (h != null) {
            WindowInsets b = C6341h.m15082b(view, h);
            if (!b.equals(h)) {
                return C6396v0.m15249i(b, view);
            }
        }
        return v0Var;
    }

    /* renamed from: m */
    public static C6323c m15025m(View view, C6323c cVar) {
        C6395v vVar;
        C6395v vVar2;
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(cVar);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return C6350p.m15151b(view, cVar);
        }
        C6393u uVar = (C6393u) view.getTag(C4329e.tag_on_receive_content_listener);
        if (uVar != null) {
            C6323c a = uVar.mo3529a(view, cVar);
            if (a == null) {
                return null;
            }
            if (view instanceof C6395v) {
                vVar2 = (C6395v) view;
            } else {
                vVar2 = f19995f;
            }
            return vVar2.mo1480a(a);
        }
        if (view instanceof C6395v) {
            vVar = (C6395v) view;
        } else {
            vVar = f19995f;
        }
        return vVar.mo1480a(cVar);
    }

    /* renamed from: n */
    public static void m15026n(int i, View view) {
        ArrayList f = m15018f(view);
        for (int i2 = 0; i2 < f.size(); i2++) {
            if (((C6531g.C6532a) f.get(i2)).mo22651a() == i) {
                f.remove(i2);
                return;
            }
        }
    }

    /* renamed from: o */
    public static void m15027o(View view, C6531g.C6532a aVar, C6541k kVar) {
        if (kVar == null) {
            m15026n(aVar.mo22651a(), view);
            m15021i(0, view);
            return;
        }
        C6531g.C6532a aVar2 = new C6531g.C6532a((Object) null, aVar.f20349b, (String) null, kVar, aVar.f20350c);
        m15016d(view);
        m15026n(aVar2.mo22651a(), view);
        m15018f(view).add(aVar2);
        m15021i(0, view);
    }

    /* renamed from: p */
    public static void m15028p(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            C6348n.m15146c(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* renamed from: q */
    public static void m15029q(View view, C6315a aVar) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (aVar == null && (m15017e(view) instanceof C6315a.C6316a)) {
            aVar = new C6315a();
        }
        if (aVar == null) {
            accessibilityDelegate = null;
        } else {
            accessibilityDelegate = aVar.getBridge();
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    /* renamed from: r */
    public static void m15030r(View view, boolean z) {
        new C6330c0(C4329e.tag_accessibility_heading).mo22469e(view, Boolean.valueOf(z));
    }

    /* renamed from: s */
    public static void m15031s(View view, CharSequence charSequence) {
        boolean z;
        new C6318a0(C4329e.tag_accessibility_pane_title, CharSequence.class).mo22469e(view, charSequence);
        if (charSequence != null) {
            C6334a aVar = f19996g;
            WeakHashMap<View, Boolean> weakHashMap = aVar.f19997b;
            if (!view.isShown() || view.getWindowVisibility() != 0) {
                z = false;
            } else {
                z = true;
            }
            weakHashMap.put(view, Boolean.valueOf(z));
            view.addOnAttachStateChangeListener(aVar);
            if (C6340g.m15075b(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
                return;
            }
            return;
        }
        C6334a aVar2 = f19996g;
        aVar2.f19997b.remove(view);
        view.removeOnAttachStateChangeListener(aVar2);
        C6337d.m15055o(view.getViewTreeObserver(), aVar2);
    }

    /* renamed from: t */
    public static void m15032t(View view, ColorStateList colorStateList) {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        C6342i.m15100q(view, colorStateList);
        if (i == 21) {
            Drawable background = view.getBackground();
            if (C6342i.m15090g(view) == null && C6342i.m15091h(view) == null) {
                z = false;
            } else {
                z = true;
            }
            if (background != null && z) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                C6337d.m15057q(view, background);
            }
        }
    }

    /* renamed from: u */
    public static void m15033u(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }
}
