package qg0;

import jh0.C23730d;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import mf0.C24362h;

/* renamed from: qg0.m */
public final class C24762m implements C23730d {

    /* renamed from: b */
    public final C24757k f62662b;

    public C24762m(C24757k kVar, DeserializedContainerAbiStability deserializedContainerAbiStability) {
        C24362h.m61211f(deserializedContainerAbiStability, "abiStability");
        this.f62662b = kVar;
    }

    /* renamed from: a */
    public final String mo58962a() {
        StringBuilder k = C13555b.m33972k("Class '");
        k.append(this.f62662b.mo58421d().mo61569b().mo61580b());
        k.append('\'');
        return k.toString();
    }

    /* renamed from: b */
    public final void mo58414b() {
    }

    public final String toString() {
        return C24762m.class.getSimpleName() + ": " + this.f62662b;
    }
}
