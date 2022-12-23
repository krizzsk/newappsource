package p359ag;

import com.google.gson.internal.LinkedTreeMap;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* renamed from: ag.i */
public final class C13452i extends C13450g {

    /* renamed from: b */
    public final LinkedTreeMap<String, C13450g> f33306b = new LinkedTreeMap<>();

    /* renamed from: C */
    public final void mo40346C(C13450g gVar, String str) {
        LinkedTreeMap<String, C13450g> linkedTreeMap = this.f33306b;
        if (gVar == null) {
            gVar = C13451h.f33305b;
        }
        linkedTreeMap.put(str, gVar);
    }

    /* renamed from: D */
    public final void mo40347D(String str, Boolean bool) {
        mo40346C(bool == null ? C13451h.f33305b : new C13454k(bool), str);
    }

    /* renamed from: E */
    public final void mo40348E(String str, Number number) {
        mo40346C(number == null ? C13451h.f33305b : new C13454k(number), str);
    }

    /* renamed from: F */
    public final void mo40349F(String str, String str2) {
        mo40346C(str2 == null ? C13451h.f33305b : new C13454k(str2), str);
    }

    /* renamed from: G */
    public final C13452i mo40330e() {
        boolean z;
        C13452i iVar = new C13452i();
        LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
        LinkedTreeMap.C14559e<K, V> eVar = linkedTreeMap.header.f36719e;
        int i = linkedTreeMap.modCount;
        while (true) {
            if (eVar != linkedTreeMap.header) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return iVar;
            }
            if (eVar == linkedTreeMap.header) {
                throw new NoSuchElementException();
            } else if (linkedTreeMap.modCount == i) {
                LinkedTreeMap.C14559e<K, V> eVar2 = eVar.f36719e;
                iVar.mo40346C(((C13450g) eVar.getValue()).mo40330e(), (String) eVar.getKey());
                eVar = eVar2;
            } else {
                throw new ConcurrentModificationException();
            }
        }
    }

    /* renamed from: I */
    public final C13450g mo40351I(String str) {
        return this.f33306b.get(str);
    }

    /* renamed from: J */
    public final C13447d mo40352J(String str) {
        return (C13447d) this.f33306b.get(str);
    }

    /* renamed from: K */
    public final C13452i mo40353K(String str) {
        return (C13452i) this.f33306b.get(str);
    }

    /* renamed from: L */
    public final boolean mo40354L(String str) {
        return this.f33306b.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (obj == this || ((obj instanceof C13452i) && ((C13452i) obj).f33306b.equals(this.f33306b))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f33306b.hashCode();
    }
}
