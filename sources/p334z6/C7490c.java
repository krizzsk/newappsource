package p334z6;

import com.crashlytics.android.answers.CustomEvent;
import java.util.HashMap;

/* renamed from: z6.c */
public final class C7490c {

    /* renamed from: a */
    public final String f22970a;

    /* renamed from: b */
    public final HashMap f22971b = new HashMap();

    public C7490c(String str) {
        this.f22970a = str;
    }

    /* renamed from: a */
    public final CustomEvent mo23761a() {
        CustomEvent customEvent = new CustomEvent(this.f22970a);
        for (String str : this.f22971b.keySet()) {
            Object obj = this.f22971b.get(str);
            if (obj instanceof String) {
                customEvent.putCustomAttribute(str, (String) obj);
            } else if (obj instanceof Number) {
                customEvent.putCustomAttribute(str, (Number) obj);
            }
        }
        return customEvent;
    }
}
