package zg0;

import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24362h;
import zf0.C25485t;

/* renamed from: zg0.e */
public final class C25496e extends C25505m<Character> {
    public C25496e(char c) {
        super(Character.valueOf(c));
    }

    /* renamed from: a */
    public final C24307v mo62745a(C25485t tVar) {
        C24362h.m61211f(tVar, "module");
        C23867c m = tVar.mo59460m();
        m.getClass();
        C24312z t = m.mo59396t(PrimitiveType.CHAR);
        if (t != null) {
            return t;
        }
        C23867c.m58681a(62);
        throw null;
    }

    public final String toString() {
        String str;
        Object[] objArr = new Object[2];
        boolean z = false;
        objArr[0] = Integer.valueOf(((Character) this.f63774a).charValue());
        char charValue = ((Character) this.f63774a).charValue();
        if (charValue == 8) {
            str = "\\b";
        } else if (charValue == 9) {
            str = "\\t";
        } else if (charValue == 10) {
            str = "\\n";
        } else if (charValue == 12) {
            str = "\\f";
        } else if (charValue == 13) {
            str = "\\r";
        } else {
            byte type = (byte) Character.getType(charValue);
            if (!(type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19)) {
                z = true;
            }
            if (z) {
                str = String.valueOf(charValue);
            } else {
                str = "?";
            }
        }
        objArr[1] = str;
        return C13555b.m33971j(objArr, 2, "\\u%04X ('%s')", "format(this, *args)");
    }
}
