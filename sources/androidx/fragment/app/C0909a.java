package androidx.fragment.app;

import androidx.fragment.app.C0932h0;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.moovit.C15682c;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;
import p001a0.C0016g;

/* renamed from: androidx.fragment.app.a */
public final class C0909a extends C0932h0 implements FragmentManager.C0894j, FragmentManager.C0898n {

    /* renamed from: r */
    public final FragmentManager f3707r;

    /* renamed from: s */
    public boolean f3708s;

    /* renamed from: t */
    public int f3709t;

    public C0909a(FragmentManager fragmentManager) {
        fragmentManager.mo3929G();
        C0969t<?> tVar = fragmentManager.f3643v;
        if (tVar != null) {
            tVar.f3854c.getClassLoader();
        }
        this.f3709t = -1;
        this.f3707r = fragmentManager;
    }

    /* renamed from: a */
    public final boolean mo4002a(ArrayList<C0909a> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.m2590J(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f3777g) {
            return true;
        }
        FragmentManager fragmentManager = this.f3707r;
        if (fragmentManager.f3625d == null) {
            fragmentManager.f3625d = new ArrayList<>();
        }
        fragmentManager.f3625d.add(this);
        return true;
    }

    /* renamed from: d */
    public final int mo4040d() {
        return mo4044j(false);
    }

    /* renamed from: e */
    public final void mo4041e(int i, Fragment fragment, String str, int i2) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            FragmentStrictMode.m2799d(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder k = C13555b.m33972k("Fragment ");
            k.append(cls.getCanonicalName());
            k.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(k.toString());
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 == null || str.equals(str3)) {
                fragment.mTag = str;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Can't change tag of fragment ");
                sb.append(fragment);
                sb.append(": was ");
                throw new IllegalStateException(C13715c.m34245k(sb, fragment.mTag, " now ", str));
            }
        }
        if (i != 0) {
            if (i != -1) {
                int i3 = fragment.mFragmentId;
                if (i3 == 0 || i3 == i) {
                    fragment.mFragmentId = i;
                    fragment.mContainerId = i;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        mo4109b(new C0932h0.C0933a(fragment, i2));
        fragment.mFragmentManager = this.f3707r;
    }

    public final int getId() {
        return this.f3709t;
    }

    public final String getName() {
        return this.f3779i;
    }

    /* renamed from: h */
    public final void mo4042h(int i) {
        if (this.f3777g) {
            if (FragmentManager.m2590J(2)) {
                toString();
            }
            int size = this.f3771a.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0932h0.C0933a aVar = this.f3771a.get(i2);
                Fragment fragment = aVar.f3789b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (FragmentManager.m2590J(2)) {
                        Objects.toString(aVar.f3789b);
                        int i3 = aVar.f3789b.mBackStackNesting;
                    }
                }
            }
        }
    }

    /* renamed from: i */
    public final int mo4043i() {
        return mo4044j(true);
    }

    /* renamed from: j */
    public final int mo4044j(boolean z) {
        if (!this.f3708s) {
            if (FragmentManager.m2590J(2)) {
                toString();
                PrintWriter printWriter = new PrintWriter(new C0964r0());
                mo4048n("  ", printWriter, true);
                printWriter.close();
            }
            this.f3708s = true;
            if (this.f3777g) {
                this.f3709t = this.f3707r.f3630i.getAndIncrement();
            } else {
                this.f3709t = -1;
            }
            this.f3707r.mo3975s(this, z);
            return this.f3709t;
        }
        throw new IllegalStateException("commit already called");
    }

    /* renamed from: k */
    public final void mo4045k() {
        if (!this.f3777g) {
            this.f3778h = false;
            this.f3707r.mo3979v(this, false);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* renamed from: l */
    public final void mo4046l() {
        if (!this.f3777g) {
            this.f3778h = false;
            this.f3707r.mo3979v(this, true);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* renamed from: m */
    public final C0909a mo4047m(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f3707r) {
            mo4109b(new C0932h0.C0933a(fragment, 6));
            return this;
        }
        StringBuilder k = C13555b.m33972k("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
        k.append(fragment.toString());
        k.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(k.toString());
    }

    /* renamed from: n */
    public final void mo4048n(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f3779i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f3709t);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f3708s);
            if (this.f3776f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f3776f));
            }
            if (!(this.f3772b == 0 && this.f3773c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3772b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3773c));
            }
            if (!(this.f3774d == 0 && this.f3775e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3774d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3775e));
            }
            if (!(this.f3780j == 0 && this.f3781k == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3780j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f3781k);
            }
            if (!(this.f3782l == 0 && this.f3783m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3782l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f3783m);
            }
        }
        if (!this.f3771a.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f3771a.size();
            for (int i = 0; i < size; i++) {
                C0932h0.C0933a aVar = this.f3771a.get(i);
                switch (aVar.f3788a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        StringBuilder k = C13555b.m33972k("cmd=");
                        k.append(aVar.f3788a);
                        str2 = k.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f3789b);
                if (z) {
                    if (!(aVar.f3791d == 0 && aVar.f3792e == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f3791d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f3792e));
                    }
                    if (aVar.f3793f != 0 || aVar.f3794g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f3793f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f3794g));
                    }
                }
            }
        }
    }

    /* renamed from: o */
    public final C0909a mo4049o(C15682c cVar) {
        FragmentManager fragmentManager = cVar.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f3707r) {
            mo4109b(new C0932h0.C0933a((Fragment) cVar, 4));
            return this;
        }
        StringBuilder k = C13555b.m33972k("Cannot hide Fragment attached to a different FragmentManager. Fragment ");
        k.append(cVar.toString());
        k.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(k.toString());
    }

    /* renamed from: p */
    public final C0909a mo4050p(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f3707r) {
            mo4109b(new C0932h0.C0933a(fragment, 3));
            return this;
        }
        StringBuilder k = C13555b.m33972k("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
        k.append(fragment.toString());
        k.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(k.toString());
    }

    /* renamed from: q */
    public final C0909a mo4051q(Fragment fragment, Lifecycle.State state) {
        if (fragment.mFragmentManager != this.f3707r) {
            StringBuilder k = C13555b.m33972k("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            k.append(this.f3707r);
            throw new IllegalArgumentException(k.toString());
        } else if (state == Lifecycle.State.INITIALIZED && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + " after the Fragment has been created");
        } else if (state != Lifecycle.State.DESTROYED) {
            mo4109b(new C0932h0.C0933a(fragment, state));
            return this;
        } else {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
    }

    public final String toString() {
        StringBuilder r = C0016g.m34r(RecyclerView.C1119a0.FLAG_IGNORE, "BackStackEntry{");
        r.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f3709t >= 0) {
            r.append(" #");
            r.append(this.f3709t);
        }
        if (this.f3779i != null) {
            r.append(" ");
            r.append(this.f3779i);
        }
        r.append("}");
        return r.toString();
    }
}
