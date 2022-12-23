package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import mf0.C24362h;
import p056d2.C4335b;
import p056d2.C4336c;
import p242s1.C6333d0;
import p242s1.C6396v0;
import p358af.C13437d;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0001J\u0019\u0010\u000e\u001a\u00028\u0000\"\n\b\u0000\u0010\r*\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, mo59060d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/animation/LayoutTransition;", "transition", "Lbf0/d;", "setLayoutTransition", "Landroid/view/View$OnApplyWindowInsetsListener;", "listener", "setOnApplyWindowInsetsListener", "", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "Landroidx/fragment/app/Fragment;", "F", "getFragment", "()Landroidx/fragment/app/Fragment;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "fragment_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: b */
    public final ArrayList f3603b;

    /* renamed from: c */
    public final ArrayList f3604c;

    /* renamed from: d */
    public View.OnApplyWindowInsetsListener f3605d;

    /* renamed from: e */
    public boolean f3606e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context) {
        super(context);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        this.f3603b = new ArrayList();
        this.f3604c = new ArrayList();
        this.f3606e = true;
    }

    /* renamed from: a */
    public final void mo3905a(View view) {
        if (this.f3604c.contains(view)) {
            this.f3603b.add(view);
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Fragment fragment;
        C24362h.m61211f(view, "child");
        Object tag = view.getTag(C4335b.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            fragment = (Fragment) tag;
        } else {
            fragment = null;
        }
        if (fragment != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C6396v0 v0Var;
        C24362h.m61211f(windowInsets, "insets");
        C6396v0 i = C6396v0.m15249i(windowInsets, (View) null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f3605d;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            C24362h.m61210e(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            v0Var = C6396v0.m15249i(onApplyWindowInsets, (View) null);
        } else {
            v0Var = C6333d0.m15024l(this, i);
        }
        C24362h.m61210e(v0Var, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!v0Var.f20044a.mo22528m()) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                C6333d0.m15014b(getChildAt(i2), v0Var);
            }
        }
        return windowInsets;
    }

    public final void dispatchDraw(Canvas canvas) {
        C24362h.m61211f(canvas, "canvas");
        if (this.f3606e) {
            Iterator it = this.f3603b.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    public final boolean drawChild(Canvas canvas, View view, long j) {
        C24362h.m61211f(canvas, "canvas");
        C24362h.m61211f(view, "child");
        if (!this.f3606e || !(!this.f3603b.isEmpty()) || !this.f3603b.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    public final void endViewTransition(View view) {
        C24362h.m61211f(view, Promotion.ACTION_VIEW);
        this.f3604c.remove(view);
        if (this.f3603b.remove(view)) {
            this.f3606e = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        Fragment fragment;
        FragmentManager fragmentManager;
        FragmentActivity fragmentActivity = null;
        View view = this;
        while (true) {
            if (view == null) {
                fragment = null;
                break;
            }
            Object tag = view.getTag(C4335b.fragment_container_view_tag);
            if (tag instanceof Fragment) {
                fragment = (Fragment) tag;
            } else {
                fragment = null;
            }
            if (fragment != null) {
                break;
            }
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        if (fragment == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof FragmentActivity) {
                    fragmentActivity = (FragmentActivity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (fragmentActivity != null) {
                fragmentManager = fragmentActivity.getSupportFragmentManager();
            } else {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
        } else if (fragment.isAdded()) {
            fragmentManager = fragment.getChildFragmentManager();
        } else {
            throw new IllegalStateException("The Fragment " + fragment + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        return fragmentManager.mo3983z(getId());
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        C24362h.m61211f(windowInsets, "insets");
        return windowInsets;
    }

    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View childAt = getChildAt(childCount);
                C24362h.m61210e(childAt, Promotion.ACTION_VIEW);
                mo3905a(childAt);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    public final void removeView(View view) {
        C24362h.m61211f(view, Promotion.ACTION_VIEW);
        mo3905a(view);
        super.removeView(view);
    }

    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        C24362h.m61210e(childAt, Promotion.ACTION_VIEW);
        mo3905a(childAt);
        super.removeViewAt(i);
    }

    public final void removeViewInLayout(View view) {
        C24362h.m61211f(view, Promotion.ACTION_VIEW);
        mo3905a(view);
        super.removeViewInLayout(view);
    }

    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            C24362h.m61210e(childAt, Promotion.ACTION_VIEW);
            mo3905a(childAt);
        }
        super.removeViews(i, i2);
    }

    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            C24362h.m61210e(childAt, Promotion.ACTION_VIEW);
            mo3905a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.f3606e = z;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        C24362h.m61211f(onApplyWindowInsetsListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f3605d = onApplyWindowInsetsListener;
    }

    public final void startViewTransition(View view) {
        C24362h.m61211f(view, Promotion.ACTION_VIEW);
        if (view.getParent() == this) {
            this.f3604c.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str;
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        this.f3603b = new ArrayList();
        this.f3604c = new ArrayList();
        this.f3606e = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] iArr = C4336c.FragmentContainerView;
            C24362h.m61210e(iArr, "FragmentContainerView");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(C4336c.FragmentContainerView_android_name);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        super(context, attributeSet);
        View view;
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(attributeSet, "attrs");
        C24362h.m61211f(fragmentManager, "fm");
        this.f3603b = new ArrayList();
        this.f3604c = new ArrayList();
        this.f3606e = true;
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = C4336c.FragmentContainerView;
        C24362h.m61210e(iArr, "FragmentContainerView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(C4336c.FragmentContainerView_android_name) : classAttribute;
        String string = obtainStyledAttributes.getString(C4336c.FragmentContainerView_android_tag);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment z = fragmentManager.mo3983z(id);
        if (classAttribute != null && z == null) {
            if (id == -1) {
                throw new IllegalStateException(C13437d.m33706k("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? C25541a.m63881k(" with tag ", string) : ""));
            }
            C0965s G = fragmentManager.mo3929G();
            context.getClassLoader();
            Fragment a = G.mo3992a(classAttribute);
            C24362h.m61210e(a, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a.onInflate(context, attributeSet, (Bundle) null);
            C0909a aVar = new C0909a(fragmentManager);
            aVar.f3786p = true;
            a.mContainer = this;
            aVar.mo4041e(getId(), a, string, 1);
            aVar.mo4046l();
        }
        Iterator it = fragmentManager.f3624c.mo4102d().iterator();
        while (it.hasNext()) {
            C0923e0 e0Var = (C0923e0) it.next();
            Fragment fragment = e0Var.f3743c;
            if (fragment.mContainerId == getId() && (view = fragment.mView) != null && view.getParent() == null) {
                fragment.mContainer = this;
                e0Var.mo4077a();
            }
        }
    }
}
