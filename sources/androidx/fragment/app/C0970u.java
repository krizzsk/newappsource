package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;
import p056d2.C4336c;
import p358af.C13437d;

/* renamed from: androidx.fragment.app.u */
public final class C0970u implements LayoutInflater.Factory2 {

    /* renamed from: b */
    public final FragmentManager f3857b;

    /* renamed from: androidx.fragment.app.u$a */
    public class C0971a implements View.OnAttachStateChangeListener {

        /* renamed from: b */
        public final /* synthetic */ C0923e0 f3858b;

        public C0971a(C0923e0 e0Var) {
            this.f3858b = e0Var;
        }

        public final void onViewAttachedToWindow(View view) {
            C0923e0 e0Var = this.f3858b;
            Fragment fragment = e0Var.f3743c;
            e0Var.mo4086j();
            SpecialEffectsController.m2672f((ViewGroup) fragment.mView.getParent(), C0970u.this.f3857b).mo4028e();
        }

        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public C0970u(FragmentManager fragmentManager) {
        this.f3857b = fragmentManager;
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        C0923e0 e0Var;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f3857b);
        }
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4336c.Fragment);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(C4336c.Fragment_android_name);
        }
        int resourceId = obtainStyledAttributes.getResourceId(C4336c.Fragment_android_id, -1);
        String string = obtainStyledAttributes.getString(C4336c.Fragment_android_tag);
        obtainStyledAttributes.recycle();
        if (attributeValue != null) {
            int i = 0;
            try {
                z = Fragment.class.isAssignableFrom(C0965s.m2793b(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            if (z) {
                if (view != null) {
                    i = view.getId();
                }
                if (i == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                if (resourceId != -1) {
                    fragment = this.f3857b.mo3983z(resourceId);
                }
                if (fragment == null && string != null) {
                    fragment = this.f3857b.mo3923A(string);
                }
                if (fragment == null && i != -1) {
                    fragment = this.f3857b.mo3983z(i);
                }
                if (fragment == null) {
                    C0965s G = this.f3857b.mo3929G();
                    context.getClassLoader();
                    fragment = G.mo3992a(attributeValue);
                    fragment.mFromLayout = true;
                    fragment.mFragmentId = resourceId != 0 ? resourceId : i;
                    fragment.mContainerId = i;
                    fragment.mTag = string;
                    fragment.mInLayout = true;
                    FragmentManager fragmentManager = this.f3857b;
                    fragment.mFragmentManager = fragmentManager;
                    C0969t<?> tVar = fragmentManager.f3643v;
                    fragment.mHost = tVar;
                    fragment.onInflate(tVar.f3854c, attributeSet, fragment.mSavedFragmentState);
                    e0Var = this.f3857b.mo3946a(fragment);
                    if (FragmentManager.m2590J(2)) {
                        fragment.toString();
                        Integer.toHexString(resourceId);
                    }
                } else if (!fragment.mInLayout) {
                    fragment.mInLayout = true;
                    FragmentManager fragmentManager2 = this.f3857b;
                    fragment.mFragmentManager = fragmentManager2;
                    C0969t<?> tVar2 = fragmentManager2.f3643v;
                    fragment.mHost = tVar2;
                    fragment.onInflate(tVar2.f3854c, attributeSet, fragment.mSavedFragmentState);
                    e0Var = this.f3857b.mo3958g(fragment);
                    if (FragmentManager.m2590J(2)) {
                        fragment.toString();
                        Integer.toHexString(resourceId);
                    }
                } else {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i) + " with another fragment for " + attributeValue);
                }
                ViewGroup viewGroup = (ViewGroup) view;
                FragmentStrictMode.C0968b bVar = FragmentStrictMode.f3849a;
                FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(fragment, viewGroup);
                FragmentStrictMode.m2798c(fragmentTagUsageViolation);
                FragmentStrictMode.C0968b a = FragmentStrictMode.m2796a(fragment);
                if (a.f3851a.contains(FragmentStrictMode.Flag.DETECT_FRAGMENT_TAG_USAGE) && FragmentStrictMode.m2801f(a, fragment.getClass(), FragmentTagUsageViolation.class)) {
                    FragmentStrictMode.m2797b(a, fragmentTagUsageViolation);
                }
                fragment.mContainer = viewGroup;
                e0Var.mo4086j();
                e0Var.mo4085i();
                View view2 = fragment.mView;
                if (view2 != null) {
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (fragment.mView.getTag() == null) {
                        fragment.mView.setTag(string);
                    }
                    fragment.mView.addOnAttachStateChangeListener(new C0971a(e0Var));
                    return fragment.mView;
                }
                throw new IllegalStateException(C13437d.m33706k("Fragment ", attributeValue, " did not create a view."));
            }
        }
        return null;
    }
}
