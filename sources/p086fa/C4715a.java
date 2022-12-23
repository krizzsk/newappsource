package p086fa;

import android.util.SparseArray;
import com.google.android.datatransport.Priority;
import java.util.HashMap;

/* renamed from: fa.a */
public final class C4715a {

    /* renamed from: a */
    public static SparseArray<Priority> f16004a = new SparseArray<>();

    /* renamed from: b */
    public static HashMap<Priority, Integer> f16005b;

    static {
        HashMap<Priority, Integer> hashMap = new HashMap<>();
        f16005b = hashMap;
        hashMap.put(Priority.DEFAULT, 0);
        f16005b.put(Priority.VERY_LOW, 1);
        f16005b.put(Priority.HIGHEST, 2);
        for (Priority next : f16005b.keySet()) {
            f16004a.append(f16005b.get(next).intValue(), next);
        }
    }

    /* renamed from: a */
    public static int m12025a(Priority priority) {
        Integer num = f16005b.get(priority);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + priority);
    }

    /* renamed from: b */
    public static Priority m12026b(int i) {
        Priority priority = f16004a.get(i);
        if (priority != null) {
            return priority;
        }
        throw new IllegalArgumentException(C16759e.m42349e("Unknown Priority for value ", i));
    }
}
