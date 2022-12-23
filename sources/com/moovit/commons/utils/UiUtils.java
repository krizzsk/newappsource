package com.moovit.commons.utils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import ce0.C21100e;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tranzmate.R;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k00.C17988b;
import p141k1.C5450a;
import p242s1.C6391t;
import p242s1.C6396v0;
import p977zz.C20941h;

public final class UiUtils {

    public enum Edge {
        LEFT,
        TOP,
        RIGHT,
        BOTTOM
    }

    /* renamed from: com.moovit.commons.utils.UiUtils$a */
    public static /* synthetic */ class C15777a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f41033a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.moovit.commons.utils.UiUtils$Edge[] r0 = com.moovit.commons.utils.UiUtils.Edge.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f41033a = r0
                com.moovit.commons.utils.UiUtils$Edge r1 = com.moovit.commons.utils.UiUtils.Edge.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f41033a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.commons.utils.UiUtils$Edge r1 = com.moovit.commons.utils.UiUtils.Edge.TOP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f41033a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.commons.utils.UiUtils$Edge r1 = com.moovit.commons.utils.UiUtils.Edge.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f41033a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.commons.utils.UiUtils$Edge r1 = com.moovit.commons.utils.UiUtils.Edge.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.commons.utils.UiUtils.C15777a.<clinit>():void");
        }
    }

    /* renamed from: com.moovit.commons.utils.UiUtils$b */
    public static class C15778b implements C6391t {
        public final C6396v0 onApplyWindowInsets(View view, C6396v0 v0Var) {
            return v0Var;
        }
    }

    /* renamed from: com.moovit.commons.utils.UiUtils$c */
    public static class C15779c implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: b */
        public final View f41034b;

        /* renamed from: c */
        public final ViewTreeObserver.OnGlobalLayoutListener f41035c;

        public C15779c(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            C21100e.m49373x(view, Promotion.ACTION_VIEW);
            this.f41034b = view;
            C21100e.m49373x(onGlobalLayoutListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            this.f41035c = onGlobalLayoutListener;
        }

        public final void onGlobalLayout() {
            ViewTreeObserver viewTreeObserver = this.f41034b.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
            this.f41034b.removeOnAttachStateChangeListener(this);
            this.f41035c.onGlobalLayout();
        }

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = this.f41034b.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
            this.f41034b.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: A */
    public static void m40233A(TextView textView, int i) {
        m40235C(textView, i, 8);
    }

    /* renamed from: B */
    public static void m40234B(TextView textView, CharSequence charSequence) {
        m40236D(textView, charSequence, 8);
    }

    /* renamed from: C */
    public static void m40235C(TextView textView, int i, int i2) {
        if (i != 0) {
            textView.setText(i);
            textView.setVisibility(0);
            return;
        }
        textView.setText("");
        textView.setVisibility(i2);
    }

    /* renamed from: D */
    public static void m40236D(TextView textView, CharSequence charSequence, int i) {
        if (charSequence != null) {
            textView.setText(charSequence);
            textView.setVisibility(0);
            return;
        }
        textView.setText("");
        textView.setVisibility(i);
    }

    /* renamed from: E */
    public static void m40237E(int i, Collection<? extends View> collection) {
        for (View view : collection) {
            if (view != null) {
                view.setVisibility(i);
            }
        }
    }

    /* renamed from: F */
    public static void m40238F(int i, View... viewArr) {
        m40237E(i, Arrays.asList(viewArr));
    }

    /* renamed from: G */
    public static void m40239G(EditText editText) {
        InputMethodManager inputMethodManager;
        if (editText != null && (inputMethodManager = (InputMethodManager) editText.getContext().getSystemService("input_method")) != null && editText.requestFocus()) {
            inputMethodManager.showSoftInput(editText, 1);
        }
    }

    /* renamed from: H */
    public static void m40240H(Context context) {
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.toggleSoftInput(1, 1);
        }
    }

    /* renamed from: I */
    public static View m40241I(View view, int i, String str) {
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        return view.findViewWithTag(str);
    }

    /* renamed from: a */
    public static boolean m40242a(View... viewArr) {
        for (View view : Arrays.asList(viewArr)) {
            if (view != null && view.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static ColorStateList m40243b(Context context) {
        return new ColorStateList(new int[][]{new int[]{16843518}, new int[0]}, new int[]{C20941h.m49043f(R.attr.colorSecondary, context), C20941h.m49043f(R.attr.colorOnSurface, context)});
    }

    /* renamed from: c */
    public static Drawable m40244c(Context context, int i) {
        Drawable b = C17988b.m44611b(i, context);
        if (b == null) {
            return null;
        }
        Drawable g = C5450a.m13604g(b);
        C5450a.C5452b.m13617h(g, new ColorStateList(new int[][]{new int[]{16842910}, new int[0]}, new int[]{C20941h.m49043f(R.attr.colorTertiary, context), C20941h.m49043f(R.attr.colorOnSurfaceEmphasisLow, context)}));
        return g;
    }

    /* renamed from: d */
    public static int m40245d(Resources resources, float f) {
        return (int) Math.ceil((double) ((f * ((float) resources.getDisplayMetrics().densityDpi)) / 160.0f));
    }

    /* renamed from: e */
    public static float m40246e(Context context, float f) {
        return m40247f(context.getResources(), f);
    }

    /* renamed from: f */
    public static float m40247f(Resources resources, float f) {
        return TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
    }

    /* renamed from: g */
    public static int m40248g(Context context, float f) {
        return m40249h(context.getResources(), f);
    }

    /* renamed from: h */
    public static int m40249h(Resources resources, float f) {
        return (int) Math.ceil((double) TypedValue.applyDimension(1, f, resources.getDisplayMetrics()));
    }

    /* renamed from: i */
    public static void m40250i(ViewGroup viewGroup, int i, int i2, int i3) {
        int childCount = viewGroup.getChildCount() - i2;
        if (childCount != i3) {
            if (childCount > i3) {
                viewGroup.removeViews(i2 + i3, childCount - i3);
                return;
            }
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            while (childCount < i3) {
                from.inflate(i, viewGroup, true);
                childCount++;
            }
        }
    }

    /* renamed from: j */
    public static <T extends View> T m40251j(ViewGroup viewGroup, Class<? extends T> cls) {
        T j;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (cls.isInstance(childAt)) {
                return (View) cls.cast(childAt);
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = viewGroup.getChildAt(i2);
            if ((childAt2 instanceof ViewGroup) && (j = m40251j((ViewGroup) childAt2, cls)) != null) {
                return j;
            }
        }
        return null;
    }

    /* renamed from: k */
    public static void m40252k(View view) {
        if (view != null) {
            IBinder windowToken = view.getWindowToken();
            InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
            }
        }
    }

    /* renamed from: l */
    public static boolean m40253l(Context context) {
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public static ViewGroup.LayoutParams m40254m() {
        return new ViewGroup.LayoutParams(-1, -2);
    }

    /* renamed from: n */
    public static TypedArray m40255n(Context context, AttributeSet attributeSet, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (obtainStyledAttributes != null) {
            return obtainStyledAttributes;
        }
        throw new ApplicationBugException("Context.obtainStyledAttributes returned null");
    }

    /* renamed from: o */
    public static TypedArray m40256o(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        if (obtainStyledAttributes != null) {
            return obtainStyledAttributes;
        }
        throw new ApplicationBugException("Context.obtainStyledAttributes returned null");
    }

    /* renamed from: p */
    public static PorterDuff.Mode m40257p(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: q */
    public static void m40258q(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getHeight(), 1073741824));
        view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    /* renamed from: r */
    public static void m40259r(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        C15779c cVar = new C15779c(view, onGlobalLayoutListener);
        cVar.f41034b.getViewTreeObserver().addOnGlobalLayoutListener(cVar);
        cVar.f41034b.addOnAttachStateChangeListener(cVar);
    }

    /* renamed from: s */
    public static void m40260s(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setVisibility(8);
        }
    }

    /* renamed from: t */
    public static void m40261t(TextView textView, Edge edge, Drawable drawable) {
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        Drawable drawable2 = compoundDrawables[0];
        Drawable drawable3 = compoundDrawables[1];
        Drawable drawable4 = compoundDrawables[2];
        Drawable drawable5 = compoundDrawables[3];
        int i = C15777a.f41033a[edge.ordinal()];
        if (i != 1) {
            if (i == 2) {
                drawable3 = drawable;
            } else if (i == 3) {
                drawable4 = drawable;
            } else if (i == 4) {
                drawable5 = drawable;
            }
            drawable = drawable2;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable3, drawable4, drawable5);
    }

    /* renamed from: u */
    public static void m40262u(List list, boolean z) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setEnabled(z);
        }
    }

    /* renamed from: v */
    public static void m40263v(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (viewGroup.getChildAt(i).getVisibility() == 0) {
                viewGroup.setVisibility(0);
                return;
            }
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: w */
    public static void m40264w(ImageView imageView, int i, int i2) {
        if (i != 0) {
            imageView.setImageResource(i);
            imageView.setVisibility(0);
            return;
        }
        imageView.setImageDrawable((Drawable) null);
        imageView.setVisibility(i2);
    }

    /* renamed from: x */
    public static void m40265x(View view, View view2) {
        view2.setVisibility(view.getVisibility() == 0 ? 8 : 0);
    }

    /* renamed from: y */
    public static void m40266y(View view, Edge edge, int i) {
        int paddingLeft = view.getPaddingLeft();
        int paddingTop = view.getPaddingTop();
        int paddingRight = view.getPaddingRight();
        int paddingBottom = view.getPaddingBottom();
        int i2 = C15777a.f41033a[edge.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                paddingTop = i;
            } else if (i2 == 3) {
                paddingRight = i;
            } else if (i2 == 4) {
                paddingBottom = i;
            }
            i = paddingLeft;
        }
        view.setPadding(i, paddingTop, paddingRight, paddingBottom);
    }

    /* renamed from: z */
    public static void m40267z(View view, View view2) {
        view2.setVisibility(view.getVisibility());
    }
}
