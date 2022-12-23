package p977zz;

import android.annotation.SuppressLint;
import java.util.HashMap;

/* renamed from: zz.m0 */
public final class C20952m0<T> {
    @SuppressLint({"UseSparseArrays"})

    /* renamed from: a */
    public final HashMap f52700a = new HashMap();

    /* renamed from: b */
    public final HashMap f52701b = new HashMap();

    /* renamed from: c */
    public boolean f52702c = false;

    /* renamed from: a */
    public final synchronized void mo53027a(int i, Object obj) {
        if (!this.f52702c) {
            if (this.f52700a.containsKey(Integer.valueOf(i))) {
                Object obj2 = this.f52700a.get(Integer.valueOf(i));
                if (!obj2.equals(obj)) {
                    throw new IllegalArgumentException("Can't modify an existing mapping of id " + i + " and " + obj2);
                }
            }
            this.f52700a.put(Integer.valueOf(i), obj);
            this.f52701b.put(obj, Integer.valueOf(i));
        } else {
            throw new IllegalStateException("Attempting to modify a sealed map");
        }
    }

    /* renamed from: b */
    public final synchronized void mo53028b(int i, Object obj) {
        if (!this.f52702c) {
            this.f52701b.put(obj, Integer.valueOf(i));
        } else {
            throw new IllegalStateException("Attempting to modify a sealed map");
        }
    }

    /* renamed from: c */
    public final synchronized T mo53029c(int i) {
        T t;
        t = this.f52700a.get(Integer.valueOf(i));
        if (t == null) {
            throw new IllegalArgumentException("Unknown internal resource id: " + i);
        }
        return t;
    }

    /* renamed from: d */
    public final synchronized int mo53030d(T t) {
        Integer num;
        num = (Integer) this.f52701b.get(t);
        if (num != null) {
        } else {
            throw new IllegalArgumentException("Unknown external resource id: " + t);
        }
        return num.intValue();
    }
}
