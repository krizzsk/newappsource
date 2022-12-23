package androidx.fragment.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: androidx.fragment.app.g0 */
public final class C0930g0 {

    /* renamed from: a */
    public final ArrayList<Fragment> f3764a = new ArrayList<>();

    /* renamed from: b */
    public final HashMap<String, C0923e0> f3765b = new HashMap<>();

    /* renamed from: c */
    public final HashMap<String, FragmentState> f3766c = new HashMap<>();

    /* renamed from: d */
    public C0916b0 f3767d;

    /* renamed from: a */
    public final void mo4099a(Fragment fragment) {
        if (!this.f3764a.contains(fragment)) {
            synchronized (this.f3764a) {
                this.f3764a.add(fragment);
            }
            fragment.mAdded = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* renamed from: b */
    public final Fragment mo4100b(String str) {
        C0923e0 e0Var = this.f3765b.get(str);
        if (e0Var != null) {
            return e0Var.f3743c;
        }
        return null;
    }

    /* renamed from: c */
    public final Fragment mo4101c(String str) {
        Fragment findFragmentByWho;
        for (C0923e0 next : this.f3765b.values()) {
            if (next != null && (findFragmentByWho = next.f3743c.findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final ArrayList mo4102d() {
        ArrayList arrayList = new ArrayList();
        for (C0923e0 next : this.f3765b.values()) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public final ArrayList mo4103e() {
        ArrayList arrayList = new ArrayList();
        for (C0923e0 next : this.f3765b.values()) {
            if (next != null) {
                arrayList.add(next.f3743c);
            } else {
                arrayList.add((Object) null);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public final List<Fragment> mo4104f() {
        ArrayList arrayList;
        if (this.f3764a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f3764a) {
            arrayList = new ArrayList(this.f3764a);
        }
        return arrayList;
    }

    /* renamed from: g */
    public final void mo4105g(C0923e0 e0Var) {
        boolean z;
        Fragment fragment = e0Var.f3743c;
        if (this.f3765b.get(fragment.mWho) != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f3765b.put(fragment.mWho, e0Var);
            if (fragment.mRetainInstanceChangedWhileDetached) {
                if (fragment.mRetainInstance) {
                    this.f3767d.mo4057a(fragment);
                } else {
                    this.f3767d.mo4059c(fragment);
                }
                fragment.mRetainInstanceChangedWhileDetached = false;
            }
            if (FragmentManager.m2590J(2)) {
                fragment.toString();
            }
        }
    }

    /* renamed from: h */
    public final void mo4106h(C0923e0 e0Var) {
        Fragment fragment = e0Var.f3743c;
        if (fragment.mRetainInstance) {
            this.f3767d.mo4059c(fragment);
        }
        if (this.f3765b.put(fragment.mWho, (Object) null) != null && FragmentManager.m2590J(2)) {
            fragment.toString();
        }
    }

    /* renamed from: i */
    public final FragmentState mo4107i(String str, FragmentState fragmentState) {
        if (fragmentState != null) {
            return this.f3766c.put(str, fragmentState);
        }
        return this.f3766c.remove(str);
    }
}
