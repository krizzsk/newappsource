package kotlin.jvm.internal;

import mf0.C24357c;
import sf0.C24855b;
import sf0.C24857d;

public class PropertyReference1Impl extends PropertyReference1 {
    public PropertyReference1Impl(C24857d dVar, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((C24357c) dVar).mo59301a(), str, str2, (dVar instanceof C24855b) ^ true ? 1 : 0);
    }

    public Object get(Object obj) {
        return getGetter().mo59295a(obj);
    }

    public PropertyReference1Impl(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }
}
