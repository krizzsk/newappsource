package r00;

import ce0.C21100e;
import java.util.Map;
import q00.C19047a;

/* renamed from: r00.g */
public abstract class C19215g<T> extends C19047a.C19049b<T> {

    /* renamed from: b */
    public final String f48814b;

    public C19215g(String str, T t) {
        super(t);
        C21100e.m49373x(str, "name");
        this.f48814b = str;
    }

    /* renamed from: a */
    public final T mo39882a(Map<String, String> map) throws Exception {
        String str = map.get(this.f48814b);
        if (str != null) {
            return mo49672b(str);
        }
        StringBuilder k = C13555b.m33972k("Missing configuration key: ");
        k.append(this.f48814b);
        throw new IllegalStateException(k.toString());
    }

    /* renamed from: b */
    public abstract T mo49672b(String str) throws Exception;
}
