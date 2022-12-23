package androidx.fragment.app;

import androidx.lifecycle.C1019k0;
import androidx.lifecycle.C1026n0;
import androidx.lifecycle.C1034p0;
import java.util.HashMap;
import java.util.Iterator;
import p091g2.C4749c;

/* renamed from: androidx.fragment.app.b0 */
public final class C0916b0 extends C1019k0 {

    /* renamed from: h */
    public static final C0917a f3719h = new C0917a();

    /* renamed from: b */
    public final HashMap<String, Fragment> f3720b = new HashMap<>();

    /* renamed from: c */
    public final HashMap<String, C0916b0> f3721c = new HashMap<>();

    /* renamed from: d */
    public final HashMap<String, C1034p0> f3722d = new HashMap<>();

    /* renamed from: e */
    public final boolean f3723e;

    /* renamed from: f */
    public boolean f3724f = false;

    /* renamed from: g */
    public boolean f3725g = false;

    /* renamed from: androidx.fragment.app.b0$a */
    public class C0917a implements C1026n0.C1028b {
        /* renamed from: a */
        public final <T extends C1019k0> T mo4064a(Class<T> cls) {
            return new C0916b0(true);
        }

        /* renamed from: b */
        public final C1019k0 mo4065b(Class cls, C4749c cVar) {
            return mo4064a(cls);
        }
    }

    public C0916b0(boolean z) {
        this.f3723e = z;
    }

    /* renamed from: a */
    public final void mo4057a(Fragment fragment) {
        if (!this.f3725g && !this.f3720b.containsKey(fragment.mWho)) {
            this.f3720b.put(fragment.mWho, fragment);
            if (FragmentManager.m2590J(2)) {
                fragment.toString();
            }
        }
    }

    /* renamed from: b */
    public final void mo4058b(String str) {
        C0916b0 b0Var = this.f3721c.get(str);
        if (b0Var != null) {
            b0Var.onCleared();
            this.f3721c.remove(str);
        }
        C1034p0 p0Var = this.f3722d.get(str);
        if (p0Var != null) {
            p0Var.mo4316a();
            this.f3722d.remove(str);
        }
    }

    /* renamed from: c */
    public final void mo4059c(Fragment fragment) {
        boolean z;
        if (!this.f3725g) {
            if (this.f3720b.remove(fragment.mWho) != null) {
                z = true;
            } else {
                z = false;
            }
            if (z && FragmentManager.m2590J(2)) {
                fragment.toString();
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0916b0.class != obj.getClass()) {
            return false;
        }
        C0916b0 b0Var = (C0916b0) obj;
        if (!this.f3720b.equals(b0Var.f3720b) || !this.f3721c.equals(b0Var.f3721c) || !this.f3722d.equals(b0Var.f3722d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f3721c.hashCode();
        return this.f3722d.hashCode() + ((hashCode + (this.f3720b.hashCode() * 31)) * 31);
    }

    public final void onCleared() {
        if (FragmentManager.m2590J(3)) {
            toString();
        }
        this.f3724f = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f3720b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f3721c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f3722d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
