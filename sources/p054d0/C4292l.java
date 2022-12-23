package p054d0;

import androidx.camera.core.impl.CameraInternal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p066e0.C4417b0;

/* renamed from: d0.l */
public final class C4292l {

    /* renamed from: b */
    public static final C4292l f15213b;

    /* renamed from: c */
    public static final C4292l f15214c;

    /* renamed from: a */
    public LinkedHashSet<C4286i> f15215a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new C4417b0(0));
        f15213b = new C4292l(linkedHashSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new C4417b0(1));
        f15214c = new C4292l(linkedHashSet2);
    }

    public C4292l(LinkedHashSet<C4286i> linkedHashSet) {
        this.f15215a = linkedHashSet;
    }

    /* renamed from: a */
    public final LinkedHashSet<CameraInternal> mo19814a(LinkedHashSet<CameraInternal> linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator<CameraInternal> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getCameraInfo());
        }
        List b = mo19815b(arrayList);
        LinkedHashSet<CameraInternal> linkedHashSet2 = new LinkedHashSet<>();
        Iterator<CameraInternal> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            CameraInternal next = it2.next();
            if (b.contains(next.getCameraInfo())) {
                linkedHashSet2.add(next);
            }
        }
        return linkedHashSet2;
    }

    /* renamed from: b */
    public final List mo19815b(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        Iterator<C4286i> it = this.f15215a.iterator();
        while (it.hasNext()) {
            arrayList2 = it.next().filter(Collections.unmodifiableList(arrayList2));
        }
        arrayList2.retainAll(arrayList);
        return arrayList2;
    }

    /* renamed from: c */
    public final Integer mo19816c() {
        Iterator<C4286i> it = this.f15215a.iterator();
        Integer num = null;
        while (it.hasNext()) {
            C4286i next = it.next();
            if (next instanceof C4417b0) {
                Integer valueOf = Integer.valueOf(((C4417b0) next).f15479b);
                if (num == null) {
                    num = valueOf;
                } else if (!num.equals(valueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    /* renamed from: d */
    public final void mo19817d(LinkedHashSet linkedHashSet) {
        Iterator<CameraInternal> it = mo19814a(linkedHashSet).iterator();
        if (it.hasNext()) {
            CameraInternal next = it.next();
            return;
        }
        throw new IllegalArgumentException("No available camera can be found");
    }
}
