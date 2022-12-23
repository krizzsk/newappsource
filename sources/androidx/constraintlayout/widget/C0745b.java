package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: androidx.constraintlayout.widget.b */
public final class C0745b {

    /* renamed from: a */
    public HashMap<Integer, HashSet<WeakReference<C0746a>>> f3240a = new HashMap<>();

    /* renamed from: androidx.constraintlayout.widget.b$a */
    public interface C0746a {
    }

    public C0745b() {
        new SparseIntArray();
    }

    /* renamed from: a */
    public final void mo3261a(int i, C0746a aVar) {
        HashSet hashSet = this.f3240a.get(Integer.valueOf(i));
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f3240a.put(Integer.valueOf(i), hashSet);
        }
        hashSet.add(new WeakReference(aVar));
    }
}
