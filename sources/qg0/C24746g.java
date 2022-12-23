package qg0;

import ch0.C21203b;
import jh0.C23730d;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import kotlin.text.C24179b;
import mf0.C24362h;
import p584jl.C17885a;
import tg0.C24989f;
import ug0.C25065b;
import ug0.C25066c;
import ug0.C25069e;

/* renamed from: qg0.g */
public final class C24746g implements C23730d {

    /* renamed from: b */
    public final C21203b f62644b;

    /* renamed from: c */
    public final C21203b f62645c;

    /* renamed from: d */
    public final C24757k f62646d;

    public C24746g() {
        throw null;
    }

    public C24746g(C24757k kVar, ProtoBuf$Package protoBuf$Package, C24989f fVar, DeserializedContainerAbiStability deserializedContainerAbiStability) {
        C24362h.m61211f(kVar, "kotlinClass");
        C24362h.m61211f(protoBuf$Package, "packageProto");
        C24362h.m61211f(fVar, "nameResolver");
        C24362h.m61211f(deserializedContainerAbiStability, "abiStability");
        C21203b b = C21203b.m49811b(kVar.mo58421d());
        KotlinClassHeader c = kVar.mo58420c();
        boolean z = true;
        C21203b bVar = null;
        String str = !(c.f60764a == KotlinClassHeader.Kind.MULTIFILE_CLASS_PART) ? null : c.f60769f;
        if (str != null) {
            if (str.length() <= 0 ? false : z) {
                bVar = C21203b.m49812c(str);
            }
        }
        this.f62644b = b;
        this.f62645c = bVar;
        this.f62646d = kVar;
        GeneratedMessageLite.C24069e<ProtoBuf$Package, Integer> eVar = JvmProtoBuf.f61011m;
        C24362h.m61210e(eVar, "packageModuleName");
        Integer num = (Integer) C17885a.m44423T(protoBuf$Package, eVar);
        if (num != null) {
            fVar.getString(num.intValue());
        }
    }

    /* renamed from: a */
    public final String mo58962a() {
        StringBuilder k = C13555b.m33972k("Class '");
        k.append(mo61226d().mo61569b().mo61580b());
        k.append('\'');
        return k.toString();
    }

    /* renamed from: b */
    public final void mo58414b() {
    }

    /* renamed from: d */
    public final C25065b mo61226d() {
        C25066c cVar;
        C21203b bVar = this.f62644b;
        int lastIndexOf = bVar.f53136a.lastIndexOf("/");
        if (lastIndexOf == -1) {
            cVar = C25066c.f63253c;
            if (cVar == null) {
                C21203b.m49810a(7);
                throw null;
            }
        } else {
            cVar = new C25066c(bVar.f53136a.substring(0, lastIndexOf).replace('/', '.'));
        }
        String d = this.f62644b.mo53547d();
        C24362h.m61210e(d, "className.internalName");
        return new C25065b(cVar, C25069e.m62820i(C24179b.m60581c0(d, '/')));
    }

    public final String toString() {
        return C24746g.class.getSimpleName() + ": " + this.f62644b;
    }
}
