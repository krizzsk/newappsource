package p066e0;

import android.util.ArrayMap;
import java.util.Map;
import java.util.Set;

/* renamed from: e0.p0 */
public class C4450p0 {

    /* renamed from: b */
    public static final C4450p0 f15508b = new C4450p0(new ArrayMap());

    /* renamed from: a */
    public final Map<String, Object> f15509a;

    public C4450p0(ArrayMap arrayMap) {
        this.f15509a = arrayMap;
    }

    /* renamed from: a */
    public final Object mo19986a(String str) {
        return this.f15509a.get(str);
    }

    /* renamed from: b */
    public final Set<String> mo19987b() {
        return this.f15509a.keySet();
    }
}
