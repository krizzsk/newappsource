package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.SpecialEffectsController;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.lifecycle.Lifecycle;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Objects;
import java.util.WeakHashMap;
import mf0.C24362h;
import p001a0.C0016g;
import p056d2.C4335b;
import p242s1.C6333d0;
import p242s1.C6382p0;

/* renamed from: androidx.fragment.app.e0 */
public final class C0923e0 {

    /* renamed from: a */
    public final C0972v f3741a;

    /* renamed from: b */
    public final C0930g0 f3742b;

    /* renamed from: c */
    public final Fragment f3743c;

    /* renamed from: d */
    public boolean f3744d = false;

    /* renamed from: e */
    public int f3745e = -1;

    /* renamed from: androidx.fragment.app.e0$a */
    public class C0924a implements View.OnAttachStateChangeListener {

        /* renamed from: b */
        public final /* synthetic */ View f3746b;

        public C0924a(View view) {
            this.f3746b = view;
        }

        public final void onViewAttachedToWindow(View view) {
            this.f3746b.removeOnAttachStateChangeListener(this);
            View view2 = this.f3746b;
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6341h.m15083c(view2);
        }

        public final void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.fragment.app.e0$b */
    public static /* synthetic */ class C0925b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3747a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.lifecycle.Lifecycle$State[] r0 = androidx.lifecycle.Lifecycle.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3747a = r0
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.RESUMED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3747a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3747a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f3747a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0923e0.C0925b.<clinit>():void");
        }
    }

    public C0923e0(C0972v vVar, C0930g0 g0Var, Fragment fragment) {
        this.f3741a = vVar;
        this.f3742b = g0Var;
        this.f3743c = fragment;
    }

    /* renamed from: a */
    public final void mo4077a() {
        View view;
        View view2;
        C0930g0 g0Var = this.f3742b;
        Fragment fragment = this.f3743c;
        g0Var.getClass();
        ViewGroup viewGroup = fragment.mContainer;
        int i = -1;
        if (viewGroup != null) {
            int indexOf = g0Var.f3764a.indexOf(fragment);
            int i2 = indexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= g0Var.f3764a.size()) {
                            break;
                        }
                        Fragment fragment2 = g0Var.f3764a.get(indexOf);
                        if (fragment2.mContainer == viewGroup && (view = fragment2.mView) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    Fragment fragment3 = g0Var.f3764a.get(i2);
                    if (fragment3.mContainer == viewGroup && (view2 = fragment3.mView) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        Fragment fragment4 = this.f3743c;
        fragment4.mContainer.addView(fragment4.mView, i);
    }

    /* renamed from: b */
    public final void mo4078b() {
        if (FragmentManager.m2590J(3)) {
            Objects.toString(this.f3743c);
        }
        Fragment fragment = this.f3743c;
        Fragment fragment2 = fragment.mTarget;
        C0923e0 e0Var = null;
        if (fragment2 != null) {
            C0930g0 g0Var = this.f3742b;
            C0923e0 e0Var2 = g0Var.f3765b.get(fragment2.mWho);
            if (e0Var2 != null) {
                Fragment fragment3 = this.f3743c;
                fragment3.mTargetWho = fragment3.mTarget.mWho;
                fragment3.mTarget = null;
                e0Var = e0Var2;
            } else {
                StringBuilder k = C13555b.m33972k("Fragment ");
                k.append(this.f3743c);
                k.append(" declared target fragment ");
                k.append(this.f3743c.mTarget);
                k.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(k.toString());
            }
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (e0Var = this.f3742b.f3765b.get(str)) == null) {
                StringBuilder k2 = C13555b.m33972k("Fragment ");
                k2.append(this.f3743c);
                k2.append(" declared target fragment ");
                throw new IllegalStateException(C0016g.m31o(k2, this.f3743c.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (e0Var != null) {
            e0Var.mo4086j();
        }
        Fragment fragment4 = this.f3743c;
        FragmentManager fragmentManager = fragment4.mFragmentManager;
        fragment4.mHost = fragmentManager.f3643v;
        fragment4.mParentFragment = fragmentManager.f3645x;
        this.f3741a.mo4202g(false);
        this.f3743c.performAttach();
        this.f3741a.mo4197b(false);
    }

    /* JADX WARNING: type inference failed for: r0v21, types: [androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact] */
    /* JADX WARNING: type inference failed for: r8v6, types: [androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo4079c() {
        /*
            r13 = this;
            androidx.fragment.app.Fragment r0 = r13.f3743c
            androidx.fragment.app.FragmentManager r1 = r0.mFragmentManager
            if (r1 != 0) goto L_0x0009
            int r0 = r0.mState
            return r0
        L_0x0009:
            int r1 = r13.f3745e
            int[] r2 = androidx.fragment.app.C0923e0.C0925b.f3747a
            androidx.lifecycle.Lifecycle$State r0 = r0.mMaxState
            int r0 = r0.ordinal()
            r0 = r2[r0]
            r2 = -1
            r3 = 5
            r4 = 3
            r5 = 4
            r6 = 2
            r7 = 1
            if (r0 == r7) goto L_0x0037
            if (r0 == r6) goto L_0x0033
            if (r0 == r4) goto L_0x002e
            if (r0 == r5) goto L_0x0028
            int r1 = java.lang.Math.min(r1, r2)
            goto L_0x0037
        L_0x0028:
            r0 = 0
            int r1 = java.lang.Math.min(r1, r0)
            goto L_0x0037
        L_0x002e:
            int r1 = java.lang.Math.min(r1, r7)
            goto L_0x0037
        L_0x0033:
            int r1 = java.lang.Math.min(r1, r3)
        L_0x0037:
            androidx.fragment.app.Fragment r0 = r13.f3743c
            boolean r8 = r0.mFromLayout
            if (r8 == 0) goto L_0x0067
            boolean r8 = r0.mInLayout
            if (r8 == 0) goto L_0x0058
            int r0 = r13.f3745e
            int r1 = java.lang.Math.max(r0, r6)
            androidx.fragment.app.Fragment r0 = r13.f3743c
            android.view.View r0 = r0.mView
            if (r0 == 0) goto L_0x0067
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0067
            int r1 = java.lang.Math.min(r1, r6)
            goto L_0x0067
        L_0x0058:
            int r8 = r13.f3745e
            if (r8 >= r5) goto L_0x0063
            int r0 = r0.mState
            int r1 = java.lang.Math.min(r1, r0)
            goto L_0x0067
        L_0x0063:
            int r1 = java.lang.Math.min(r1, r7)
        L_0x0067:
            androidx.fragment.app.Fragment r0 = r13.f3743c
            boolean r0 = r0.mAdded
            if (r0 != 0) goto L_0x0071
            int r1 = java.lang.Math.min(r1, r7)
        L_0x0071:
            androidx.fragment.app.Fragment r0 = r13.f3743c
            android.view.ViewGroup r8 = r0.mContainer
            r9 = 0
            if (r8 == 0) goto L_0x00bd
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.SpecialEffectsController r0 = androidx.fragment.app.SpecialEffectsController.m2672f(r8, r0)
            r0.getClass()
            androidx.fragment.app.Fragment r8 = r13.f3743c
            androidx.fragment.app.SpecialEffectsController$Operation r8 = r0.mo4027d(r8)
            if (r8 == 0) goto L_0x008e
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r8 = r8.f3693b
            goto L_0x008f
        L_0x008e:
            r8 = r9
        L_0x008f:
            androidx.fragment.app.Fragment r10 = r13.f3743c
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r0 = r0.f3689c
            java.util.Iterator r0 = r0.iterator()
        L_0x0097:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x00b0
            java.lang.Object r11 = r0.next()
            androidx.fragment.app.SpecialEffectsController$Operation r11 = (androidx.fragment.app.SpecialEffectsController.Operation) r11
            androidx.fragment.app.Fragment r12 = r11.f3694c
            boolean r12 = r12.equals(r10)
            if (r12 == 0) goto L_0x0097
            boolean r12 = r11.f3697f
            if (r12 != 0) goto L_0x0097
            r9 = r11
        L_0x00b0:
            if (r9 == 0) goto L_0x00bc
            if (r8 == 0) goto L_0x00b8
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE
            if (r8 != r0) goto L_0x00bc
        L_0x00b8:
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = r9.f3693b
            r9 = r0
            goto L_0x00bd
        L_0x00bc:
            r9 = r8
        L_0x00bd:
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING
            if (r9 != r0) goto L_0x00c7
            r0 = 6
            int r1 = java.lang.Math.min(r1, r0)
            goto L_0x00e5
        L_0x00c7:
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING
            if (r9 != r0) goto L_0x00d0
            int r1 = java.lang.Math.max(r1, r4)
            goto L_0x00e5
        L_0x00d0:
            androidx.fragment.app.Fragment r0 = r13.f3743c
            boolean r4 = r0.mRemoving
            if (r4 == 0) goto L_0x00e5
            boolean r0 = r0.isInBackStack()
            if (r0 == 0) goto L_0x00e1
            int r1 = java.lang.Math.min(r1, r7)
            goto L_0x00e5
        L_0x00e1:
            int r1 = java.lang.Math.min(r1, r2)
        L_0x00e5:
            androidx.fragment.app.Fragment r0 = r13.f3743c
            boolean r2 = r0.mDeferStart
            if (r2 == 0) goto L_0x00f3
            int r0 = r0.mState
            if (r0 >= r3) goto L_0x00f3
            int r1 = java.lang.Math.min(r1, r5)
        L_0x00f3:
            boolean r0 = androidx.fragment.app.FragmentManager.m2590J(r6)
            if (r0 == 0) goto L_0x00fe
            androidx.fragment.app.Fragment r0 = r13.f3743c
            java.util.Objects.toString(r0)
        L_0x00fe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0923e0.mo4079c():int");
    }

    /* renamed from: d */
    public final void mo4080d() {
        if (FragmentManager.m2590J(3)) {
            Objects.toString(this.f3743c);
        }
        Fragment fragment = this.f3743c;
        if (!fragment.mIsCreated) {
            this.f3741a.mo4203h(false);
            Fragment fragment2 = this.f3743c;
            fragment2.performCreate(fragment2.mSavedFragmentState);
            C0972v vVar = this.f3741a;
            Bundle bundle = this.f3743c.mSavedFragmentState;
            vVar.mo4198c(false);
            return;
        }
        fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
        this.f3743c.mState = 1;
    }

    /* renamed from: e */
    public final void mo4081e() {
        String str;
        if (!this.f3743c.mFromLayout) {
            if (FragmentManager.m2590J(3)) {
                Objects.toString(this.f3743c);
            }
            Fragment fragment = this.f3743c;
            LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
            ViewGroup viewGroup = null;
            Fragment fragment2 = this.f3743c;
            ViewGroup viewGroup2 = fragment2.mContainer;
            if (viewGroup2 != null) {
                viewGroup = viewGroup2;
            } else {
                int i = fragment2.mContainerId;
                if (i != 0) {
                    if (i != -1) {
                        viewGroup = (ViewGroup) fragment2.mFragmentManager.f3644w.mo3876b(i);
                        if (viewGroup == null) {
                            Fragment fragment3 = this.f3743c;
                            if (!fragment3.mRestored) {
                                try {
                                    str = fragment3.getResources().getResourceName(this.f3743c.mContainerId);
                                } catch (Resources.NotFoundException unused) {
                                    str = "unknown";
                                }
                                StringBuilder k = C13555b.m33972k("No view found for id 0x");
                                k.append(Integer.toHexString(this.f3743c.mContainerId));
                                k.append(" (");
                                k.append(str);
                                k.append(") for fragment ");
                                k.append(this.f3743c);
                                throw new IllegalArgumentException(k.toString());
                            }
                        } else if (!(viewGroup instanceof FragmentContainerView)) {
                            Fragment fragment4 = this.f3743c;
                            FragmentStrictMode.C0968b bVar = FragmentStrictMode.f3849a;
                            C24362h.m61211f(fragment4, "fragment");
                            WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(fragment4, viewGroup);
                            FragmentStrictMode.m2798c(wrongFragmentContainerViolation);
                            FragmentStrictMode.C0968b a = FragmentStrictMode.m2796a(fragment4);
                            if (a.f3851a.contains(FragmentStrictMode.Flag.DETECT_WRONG_FRAGMENT_CONTAINER) && FragmentStrictMode.m2801f(a, fragment4.getClass(), WrongFragmentContainerViolation.class)) {
                                FragmentStrictMode.m2797b(a, wrongFragmentContainerViolation);
                            }
                        }
                    } else {
                        StringBuilder k2 = C13555b.m33972k("Cannot create fragment ");
                        k2.append(this.f3743c);
                        k2.append(" for a container view with no id");
                        throw new IllegalArgumentException(k2.toString());
                    }
                }
            }
            Fragment fragment5 = this.f3743c;
            fragment5.mContainer = viewGroup;
            fragment5.performCreateView(performGetLayoutInflater, viewGroup, fragment5.mSavedFragmentState);
            View view = this.f3743c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment6 = this.f3743c;
                fragment6.mView.setTag(C4335b.fragment_container_view_tag, fragment6);
                if (viewGroup != null) {
                    mo4077a();
                }
                Fragment fragment7 = this.f3743c;
                if (fragment7.mHidden) {
                    fragment7.mView.setVisibility(8);
                }
                View view2 = this.f3743c.mView;
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                if (C6333d0.C6340g.m15075b(view2)) {
                    C6333d0.C6341h.m15083c(this.f3743c.mView);
                } else {
                    View view3 = this.f3743c.mView;
                    view3.addOnAttachStateChangeListener(new C0924a(view3));
                }
                this.f3743c.performViewCreated();
                C0972v vVar = this.f3741a;
                Fragment fragment8 = this.f3743c;
                vVar.mo4208m(fragment8, fragment8.mView, fragment8.mSavedFragmentState, false);
                int visibility = this.f3743c.mView.getVisibility();
                this.f3743c.setPostOnViewCreatedAlpha(this.f3743c.mView.getAlpha());
                Fragment fragment9 = this.f3743c;
                if (fragment9.mContainer != null && visibility == 0) {
                    View findFocus = fragment9.mView.findFocus();
                    if (findFocus != null) {
                        this.f3743c.setFocusedView(findFocus);
                        if (FragmentManager.m2590J(2)) {
                            findFocus.toString();
                            Objects.toString(this.f3743c);
                        }
                    }
                    this.f3743c.mView.setAlpha(BitmapDescriptorFactory.HUE_RED);
                }
            }
            this.f3743c.mState = 2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d7  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4082f() {
        /*
            r8 = this;
            r0 = 3
            boolean r1 = androidx.fragment.app.FragmentManager.m2590J(r0)
            if (r1 == 0) goto L_0x000c
            androidx.fragment.app.Fragment r1 = r8.f3743c
            java.util.Objects.toString(r1)
        L_0x000c:
            androidx.fragment.app.Fragment r1 = r8.f3743c
            boolean r2 = r1.mRemoving
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x001c
            boolean r1 = r1.isInBackStack()
            if (r1 != 0) goto L_0x001c
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            r2 = 0
            if (r1 == 0) goto L_0x002d
            androidx.fragment.app.Fragment r5 = r8.f3743c
            boolean r6 = r5.mBeingSaved
            if (r6 != 0) goto L_0x002d
            androidx.fragment.app.g0 r6 = r8.f3742b
            java.lang.String r5 = r5.mWho
            r6.mo4107i(r5, r2)
        L_0x002d:
            if (r1 != 0) goto L_0x004c
            androidx.fragment.app.g0 r5 = r8.f3742b
            androidx.fragment.app.b0 r5 = r5.f3767d
            androidx.fragment.app.Fragment r6 = r8.f3743c
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r7 = r5.f3720b
            java.lang.String r6 = r6.mWho
            boolean r6 = r7.containsKey(r6)
            if (r6 != 0) goto L_0x0041
        L_0x003f:
            r5 = 1
            goto L_0x0047
        L_0x0041:
            boolean r6 = r5.f3723e
            if (r6 == 0) goto L_0x003f
            boolean r5 = r5.f3724f
        L_0x0047:
            if (r5 == 0) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            r5 = 0
            goto L_0x004d
        L_0x004c:
            r5 = 1
        L_0x004d:
            if (r5 == 0) goto L_0x00d7
            androidx.fragment.app.Fragment r5 = r8.f3743c
            androidx.fragment.app.t<?> r5 = r5.mHost
            boolean r6 = r5 instanceof androidx.lifecycle.C1037q0
            if (r6 == 0) goto L_0x005e
            androidx.fragment.app.g0 r4 = r8.f3742b
            androidx.fragment.app.b0 r4 = r4.f3767d
            boolean r4 = r4.f3724f
            goto L_0x006b
        L_0x005e:
            android.content.Context r5 = r5.f3854c
            boolean r6 = r5 instanceof android.app.Activity
            if (r6 == 0) goto L_0x006b
            android.app.Activity r5 = (android.app.Activity) r5
            boolean r5 = r5.isChangingConfigurations()
            r4 = r4 ^ r5
        L_0x006b:
            if (r1 == 0) goto L_0x0073
            androidx.fragment.app.Fragment r1 = r8.f3743c
            boolean r1 = r1.mBeingSaved
            if (r1 == 0) goto L_0x0075
        L_0x0073:
            if (r4 == 0) goto L_0x008c
        L_0x0075:
            androidx.fragment.app.g0 r1 = r8.f3742b
            androidx.fragment.app.b0 r1 = r1.f3767d
            androidx.fragment.app.Fragment r4 = r8.f3743c
            r1.getClass()
            boolean r0 = androidx.fragment.app.FragmentManager.m2590J(r0)
            if (r0 == 0) goto L_0x0087
            java.util.Objects.toString(r4)
        L_0x0087:
            java.lang.String r0 = r4.mWho
            r1.mo4058b(r0)
        L_0x008c:
            androidx.fragment.app.Fragment r0 = r8.f3743c
            r0.performDestroy()
            androidx.fragment.app.v r0 = r8.f3741a
            r0.mo4199d(r3)
            androidx.fragment.app.g0 r0 = r8.f3742b
            java.util.ArrayList r0 = r0.mo4102d()
            java.util.Iterator r0 = r0.iterator()
        L_0x00a0:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00c3
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.e0 r1 = (androidx.fragment.app.C0923e0) r1
            if (r1 == 0) goto L_0x00a0
            androidx.fragment.app.Fragment r1 = r1.f3743c
            androidx.fragment.app.Fragment r3 = r8.f3743c
            java.lang.String r3 = r3.mWho
            java.lang.String r4 = r1.mTargetWho
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00a0
            androidx.fragment.app.Fragment r3 = r8.f3743c
            r1.mTarget = r3
            r1.mTargetWho = r2
            goto L_0x00a0
        L_0x00c3:
            androidx.fragment.app.Fragment r0 = r8.f3743c
            java.lang.String r1 = r0.mTargetWho
            if (r1 == 0) goto L_0x00d1
            androidx.fragment.app.g0 r2 = r8.f3742b
            androidx.fragment.app.Fragment r1 = r2.mo4100b(r1)
            r0.mTarget = r1
        L_0x00d1:
            androidx.fragment.app.g0 r0 = r8.f3742b
            r0.mo4106h(r8)
            goto L_0x00f1
        L_0x00d7:
            androidx.fragment.app.Fragment r0 = r8.f3743c
            java.lang.String r0 = r0.mTargetWho
            if (r0 == 0) goto L_0x00ed
            androidx.fragment.app.g0 r1 = r8.f3742b
            androidx.fragment.app.Fragment r0 = r1.mo4100b(r0)
            if (r0 == 0) goto L_0x00ed
            boolean r1 = r0.mRetainInstance
            if (r1 == 0) goto L_0x00ed
            androidx.fragment.app.Fragment r1 = r8.f3743c
            r1.mTarget = r0
        L_0x00ed:
            androidx.fragment.app.Fragment r0 = r8.f3743c
            r0.mState = r3
        L_0x00f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0923e0.mo4082f():void");
    }

    /* renamed from: g */
    public final void mo4083g() {
        View view;
        if (FragmentManager.m2590J(3)) {
            Objects.toString(this.f3743c);
        }
        Fragment fragment = this.f3743c;
        ViewGroup viewGroup = fragment.mContainer;
        if (!(viewGroup == null || (view = fragment.mView) == null)) {
            viewGroup.removeView(view);
        }
        this.f3743c.performDestroyView();
        this.f3741a.mo4209n(false);
        Fragment fragment2 = this.f3743c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.setValue(null);
        this.f3743c.mInLayout = false;
    }

    /* renamed from: h */
    public final void mo4084h() {
        if (FragmentManager.m2590J(3)) {
            Objects.toString(this.f3743c);
        }
        this.f3743c.performDetach();
        boolean z = false;
        this.f3741a.mo4200e(false);
        Fragment fragment = this.f3743c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        boolean z2 = true;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z = true;
        }
        if (!z) {
            C0916b0 b0Var = this.f3742b.f3767d;
            if (b0Var.f3720b.containsKey(this.f3743c.mWho) && b0Var.f3723e) {
                z2 = b0Var.f3724f;
            }
            if (!z2) {
                return;
            }
        }
        if (FragmentManager.m2590J(3)) {
            Objects.toString(this.f3743c);
        }
        this.f3743c.initState();
    }

    /* renamed from: i */
    public final void mo4085i() {
        Fragment fragment = this.f3743c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.m2590J(3)) {
                Objects.toString(this.f3743c);
            }
            Fragment fragment2 = this.f3743c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), (ViewGroup) null, this.f3743c.mSavedFragmentState);
            View view = this.f3743c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f3743c;
                fragment3.mView.setTag(C4335b.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.f3743c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f3743c.performViewCreated();
                C0972v vVar = this.f3741a;
                Fragment fragment5 = this.f3743c;
                vVar.mo4208m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.f3743c.mState = 2;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: j */
    public final void mo4086j() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (!this.f3744d) {
            try {
                this.f3744d = true;
                boolean z = false;
                while (true) {
                    int c = mo4079c();
                    Fragment fragment = this.f3743c;
                    int i = fragment.mState;
                    if (c != i) {
                        if (c <= i) {
                            switch (i - 1) {
                                case -1:
                                    mo4084h();
                                    break;
                                case 0:
                                    if (fragment.mBeingSaved) {
                                        C0930g0 g0Var = this.f3742b;
                                        if (g0Var.f3766c.get(fragment.mWho) == null) {
                                            mo4090n();
                                        }
                                    }
                                    mo4082f();
                                    break;
                                case 1:
                                    mo4083g();
                                    this.f3743c.mState = 1;
                                    break;
                                case 2:
                                    fragment.mInLayout = false;
                                    fragment.mState = 2;
                                    break;
                                case 3:
                                    if (FragmentManager.m2590J(3)) {
                                        Objects.toString(this.f3743c);
                                    }
                                    Fragment fragment2 = this.f3743c;
                                    if (fragment2.mBeingSaved) {
                                        mo4090n();
                                    } else if (fragment2.mView != null && fragment2.mSavedViewState == null) {
                                        mo4091o();
                                    }
                                    Fragment fragment3 = this.f3743c;
                                    if (!(fragment3.mView == null || (viewGroup2 = fragment3.mContainer) == null)) {
                                        SpecialEffectsController f = SpecialEffectsController.m2672f(viewGroup2, fragment3.getParentFragmentManager());
                                        f.getClass();
                                        if (FragmentManager.m2590J(2)) {
                                            Objects.toString(this.f3743c);
                                        }
                                        f.mo4024a(SpecialEffectsController.Operation.State.REMOVED, SpecialEffectsController.Operation.LifecycleImpact.REMOVING, this);
                                    }
                                    this.f3743c.mState = 3;
                                    break;
                                case 4:
                                    if (FragmentManager.m2590J(3)) {
                                        Objects.toString(this.f3743c);
                                    }
                                    this.f3743c.performStop();
                                    this.f3741a.mo4207l(false);
                                    break;
                                case 5:
                                    fragment.mState = 5;
                                    break;
                                case 6:
                                    if (FragmentManager.m2590J(3)) {
                                        Objects.toString(this.f3743c);
                                    }
                                    this.f3743c.performPause();
                                    this.f3741a.mo4201f(this.f3743c, false);
                                    break;
                            }
                        } else {
                            switch (i + 1) {
                                case 0:
                                    mo4078b();
                                    break;
                                case 1:
                                    mo4080d();
                                    break;
                                case 2:
                                    mo4085i();
                                    mo4081e();
                                    break;
                                case 3:
                                    if (FragmentManager.m2590J(3)) {
                                        Objects.toString(this.f3743c);
                                    }
                                    Fragment fragment4 = this.f3743c;
                                    fragment4.performActivityCreated(fragment4.mSavedFragmentState);
                                    C0972v vVar = this.f3741a;
                                    Bundle bundle = this.f3743c.mSavedFragmentState;
                                    vVar.mo4196a(false);
                                    break;
                                case 4:
                                    if (!(fragment.mView == null || (viewGroup3 = fragment.mContainer) == null)) {
                                        SpecialEffectsController f2 = SpecialEffectsController.m2672f(viewGroup3, fragment.getParentFragmentManager());
                                        SpecialEffectsController.Operation.State from = SpecialEffectsController.Operation.State.from(this.f3743c.mView.getVisibility());
                                        f2.getClass();
                                        if (FragmentManager.m2590J(2)) {
                                            Objects.toString(this.f3743c);
                                        }
                                        f2.mo4024a(from, SpecialEffectsController.Operation.LifecycleImpact.ADDING, this);
                                    }
                                    this.f3743c.mState = 4;
                                    break;
                                case 5:
                                    if (FragmentManager.m2590J(3)) {
                                        Objects.toString(this.f3743c);
                                    }
                                    this.f3743c.performStart();
                                    this.f3741a.mo4206k(false);
                                    break;
                                case 6:
                                    fragment.mState = 6;
                                    break;
                                case 7:
                                    mo4088l();
                                    break;
                            }
                        }
                        z = true;
                    } else {
                        if (!z && i == -1 && fragment.mRemoving && !fragment.isInBackStack() && !this.f3743c.mBeingSaved) {
                            if (FragmentManager.m2590J(3)) {
                                Objects.toString(this.f3743c);
                            }
                            C0916b0 b0Var = this.f3742b.f3767d;
                            Fragment fragment5 = this.f3743c;
                            b0Var.getClass();
                            if (FragmentManager.m2590J(3)) {
                                Objects.toString(fragment5);
                            }
                            b0Var.mo4058b(fragment5.mWho);
                            this.f3742b.mo4106h(this);
                            if (FragmentManager.m2590J(3)) {
                                Objects.toString(this.f3743c);
                            }
                            this.f3743c.initState();
                        }
                        Fragment fragment6 = this.f3743c;
                        if (fragment6.mHiddenChanged) {
                            if (!(fragment6.mView == null || (viewGroup = fragment6.mContainer) == null)) {
                                SpecialEffectsController f3 = SpecialEffectsController.m2672f(viewGroup, fragment6.getParentFragmentManager());
                                if (this.f3743c.mHidden) {
                                    f3.getClass();
                                    if (FragmentManager.m2590J(2)) {
                                        Objects.toString(this.f3743c);
                                    }
                                    f3.mo4024a(SpecialEffectsController.Operation.State.GONE, SpecialEffectsController.Operation.LifecycleImpact.NONE, this);
                                } else {
                                    f3.getClass();
                                    if (FragmentManager.m2590J(2)) {
                                        Objects.toString(this.f3743c);
                                    }
                                    f3.mo4024a(SpecialEffectsController.Operation.State.VISIBLE, SpecialEffectsController.Operation.LifecycleImpact.NONE, this);
                                }
                            }
                            Fragment fragment7 = this.f3743c;
                            FragmentManager fragmentManager = fragment7.mFragmentManager;
                            if (fragmentManager != null && fragment7.mAdded && FragmentManager.m2591K(fragment7)) {
                                fragmentManager.f3612F = true;
                            }
                            Fragment fragment8 = this.f3743c;
                            fragment8.mHiddenChanged = false;
                            fragment8.onHiddenChanged(fragment8.mHidden);
                            this.f3743c.mChildFragmentManager.mo3968l();
                        }
                        this.f3744d = false;
                        return;
                    }
                }
            } catch (Throwable th) {
                this.f3744d = false;
                throw th;
            }
        } else if (FragmentManager.m2590J(2)) {
            Objects.toString(this.f3743c);
        }
    }

    /* renamed from: k */
    public final void mo4087k(ClassLoader classLoader) {
        Bundle bundle = this.f3743c.mSavedFragmentState;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            Fragment fragment = this.f3743c;
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
            Fragment fragment2 = this.f3743c;
            fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
            Fragment fragment3 = this.f3743c;
            fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
            Fragment fragment4 = this.f3743c;
            if (fragment4.mTargetWho != null) {
                fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
            }
            Fragment fragment5 = this.f3743c;
            Boolean bool = fragment5.mSavedUserVisibleHint;
            if (bool != null) {
                fragment5.mUserVisibleHint = bool.booleanValue();
                this.f3743c.mSavedUserVisibleHint = null;
            } else {
                fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
            }
            Fragment fragment6 = this.f3743c;
            if (!fragment6.mUserVisibleHint) {
                fragment6.mDeferStart = true;
            }
        }
    }

    /* renamed from: l */
    public final void mo4088l() {
        if (FragmentManager.m2590J(3)) {
            Objects.toString(this.f3743c);
        }
        View focusedView = this.f3743c.getFocusedView();
        if (focusedView != null) {
            boolean z = true;
            if (focusedView != this.f3743c.mView) {
                ViewParent parent = focusedView.getParent();
                while (true) {
                    if (parent == null) {
                        z = false;
                        break;
                    } else if (parent == this.f3743c.mView) {
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
            }
            if (z) {
                focusedView.requestFocus();
                if (FragmentManager.m2590J(2)) {
                    focusedView.toString();
                    Objects.toString(this.f3743c);
                    Objects.toString(this.f3743c.mView.findFocus());
                }
            }
        }
        this.f3743c.setFocusedView((View) null);
        this.f3743c.performResume();
        this.f3741a.mo4204i(this.f3743c, false);
        Fragment fragment = this.f3743c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    /* renamed from: m */
    public final Bundle mo4089m() {
        Bundle bundle = new Bundle();
        this.f3743c.performSaveInstanceState(bundle);
        this.f3741a.mo4205j(false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f3743c.mView != null) {
            mo4091o();
        }
        if (this.f3743c.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f3743c.mSavedViewState);
        }
        if (this.f3743c.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f3743c.mSavedViewRegistryState);
        }
        if (!this.f3743c.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f3743c.mUserVisibleHint);
        }
        return bundle;
    }

    /* renamed from: n */
    public final void mo4090n() {
        FragmentState fragmentState = new FragmentState(this.f3743c);
        Fragment fragment = this.f3743c;
        if (fragment.mState <= -1 || fragmentState.f3682n != null) {
            fragmentState.f3682n = fragment.mSavedFragmentState;
        } else {
            Bundle m = mo4089m();
            fragmentState.f3682n = m;
            if (this.f3743c.mTargetWho != null) {
                if (m == null) {
                    fragmentState.f3682n = new Bundle();
                }
                fragmentState.f3682n.putString("android:target_state", this.f3743c.mTargetWho);
                int i = this.f3743c.mTargetRequestCode;
                if (i != 0) {
                    fragmentState.f3682n.putInt("android:target_req_state", i);
                }
            }
        }
        this.f3742b.mo4107i(this.f3743c.mWho, fragmentState);
    }

    /* renamed from: o */
    public final void mo4091o() {
        if (this.f3743c.mView != null) {
            if (FragmentManager.m2590J(2)) {
                Objects.toString(this.f3743c);
                Objects.toString(this.f3743c.mView);
            }
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f3743c.mView.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f3743c.mSavedViewState = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.f3743c.mViewLifecycleOwner.f3843f.mo22669c(bundle);
            if (!bundle.isEmpty()) {
                this.f3743c.mSavedViewRegistryState = bundle;
            }
        }
    }

    public C0923e0(C0972v vVar, C0930g0 g0Var, ClassLoader classLoader, C0965s sVar, FragmentState fragmentState) {
        this.f3741a = vVar;
        this.f3742b = g0Var;
        Fragment a = sVar.mo3992a(fragmentState.f3670b);
        Bundle bundle = fragmentState.f3679k;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a.setArguments(fragmentState.f3679k);
        a.mWho = fragmentState.f3671c;
        a.mFromLayout = fragmentState.f3672d;
        a.mRestored = true;
        a.mFragmentId = fragmentState.f3673e;
        a.mContainerId = fragmentState.f3674f;
        a.mTag = fragmentState.f3675g;
        a.mRetainInstance = fragmentState.f3676h;
        a.mRemoving = fragmentState.f3677i;
        a.mDetached = fragmentState.f3678j;
        a.mHidden = fragmentState.f3680l;
        a.mMaxState = Lifecycle.State.values()[fragmentState.f3681m];
        Bundle bundle2 = fragmentState.f3682n;
        if (bundle2 != null) {
            a.mSavedFragmentState = bundle2;
        } else {
            a.mSavedFragmentState = new Bundle();
        }
        this.f3743c = a;
        if (FragmentManager.m2590J(2)) {
            Objects.toString(a);
        }
    }

    public C0923e0(C0972v vVar, C0930g0 g0Var, Fragment fragment, FragmentState fragmentState) {
        this.f3741a = vVar;
        this.f3742b = g0Var;
        this.f3743c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = fragmentState.f3682n;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }
}
