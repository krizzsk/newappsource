package kotlin.jvm.internal;

import mf0.C24357c;
import sf0.C24855b;

public class MutablePropertyReference1Impl extends MutablePropertyReference1 {
    public MutablePropertyReference1Impl(C24855b bVar, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((C24357c) bVar).mo59301a(), str, str2, (bVar instanceof C24855b) ^ true ? 1 : 0);
    }

    public final Object get(Object obj) {
        return getGetter().mo59295a(obj);
    }
}
