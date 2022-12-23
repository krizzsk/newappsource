package p906wz;

import java.util.HashMap;

/* renamed from: wz.d */
public final class C20432d {

    /* renamed from: a */
    public final HashMap f51771a = new HashMap();

    /* renamed from: a */
    public final void mo52632a(String str, int i) {
        mo52633b(str, Integer.toString(i));
    }

    /* renamed from: b */
    public final void mo52633b(String str, String str2) {
        if (str2 == null) {
            this.f51771a.remove(str);
        } else {
            this.f51771a.put(str, str2);
        }
    }
}
