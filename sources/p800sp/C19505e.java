package p800sp;

import java.lang.Enum;
import java.util.HashMap;
import p776rp.C19308a;

/* renamed from: sp.e */
public final class C19505e<E extends Enum & C19308a> extends C19506f {

    /* renamed from: a */
    public final HashMap f49605a = new HashMap();

    /* renamed from: b */
    public final HashMap f49606b = new HashMap();

    public C19505e(Class<E> cls) {
        for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
            this.f49605a.put(Byte.valueOf(((C19308a) enumR).getUniqueId()), enumR);
            this.f49606b.put(enumR.name(), enumR);
        }
    }
}
