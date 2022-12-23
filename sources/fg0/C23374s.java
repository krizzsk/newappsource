package fg0;

import dg0.C23269a;
import dg0.C23270b;
import dg0.C23271c;
import java.lang.reflect.Modifier;
import mf0.C24362h;
import og0.C24603r;
import zf0.C25468m0;
import zf0.C25479n0;

/* renamed from: fg0.s */
public interface C23374s extends C24603r {

    /* renamed from: fg0.s$a */
    public static final class C23375a {
        /* renamed from: a */
        public static C25479n0 m57476a(C23374s sVar) {
            C24362h.m61211f(sVar, "this");
            int modifiers = sVar.getModifiers();
            if (Modifier.isPublic(modifiers)) {
                return C25468m0.C25476h.f63764c;
            }
            if (Modifier.isPrivate(modifiers)) {
                return C25468m0.C25473e.f63761c;
            }
            if (!Modifier.isProtected(modifiers)) {
                return C23269a.f59024c;
            }
            if (Modifier.isStatic(modifiers)) {
                return C23271c.f59026c;
            }
            return C23270b.f59025c;
        }
    }

    int getModifiers();
}
