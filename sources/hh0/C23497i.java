package hh0;

import java.util.List;
import jh0.C23730d;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import mf0.C24362h;
import sg0.C24871a;
import sg0.C24876c;
import sg0.C24879e;
import sg0.C24880f;
import zf0.C25442g;

/* renamed from: hh0.i */
public final class C23497i {

    /* renamed from: a */
    public final C23494g f59331a;

    /* renamed from: b */
    public final C24876c f59332b;

    /* renamed from: c */
    public final C25442g f59333c;

    /* renamed from: d */
    public final C24879e f59334d;

    /* renamed from: e */
    public final C24880f f59335e;

    /* renamed from: f */
    public final C24871a f59336f;

    /* renamed from: g */
    public final C23730d f59337g;

    /* renamed from: h */
    public final TypeDeserializer f59338h;

    /* renamed from: i */
    public final MemberDeserializer f59339i;

    public C23497i(C23494g gVar, C24876c cVar, C25442g gVar2, C24879e eVar, C24880f fVar, C24871a aVar, C23730d dVar, TypeDeserializer typeDeserializer, List<ProtoBuf$TypeParameter> list) {
        String str;
        C24362h.m61211f(gVar, "components");
        C24362h.m61211f(cVar, "nameResolver");
        C24362h.m61211f(gVar2, "containingDeclaration");
        C24362h.m61211f(eVar, "typeTable");
        C24362h.m61211f(fVar, "versionRequirementTable");
        C24362h.m61211f(aVar, "metadataVersion");
        C24362h.m61211f(list, "typeParameters");
        this.f59331a = gVar;
        this.f59332b = cVar;
        this.f59333c = gVar2;
        this.f59334d = eVar;
        this.f59335e = fVar;
        this.f59336f = aVar;
        this.f59337g = dVar;
        StringBuilder k = C13555b.m33972k("Deserializer for \"");
        k.append(gVar2.getName());
        k.append('\"');
        String sb = k.toString();
        if (dVar == null) {
            str = "[container not found]";
        } else {
            str = dVar.mo58962a();
        }
        this.f59338h = new TypeDeserializer(this, typeDeserializer, list, sb, str);
        this.f59339i = new MemberDeserializer(this);
    }

    /* renamed from: a */
    public final C23497i mo58615a(C25442g gVar, List<ProtoBuf$TypeParameter> list, C24876c cVar, C24879e eVar, C24880f fVar, C24871a aVar) {
        C24880f fVar2;
        C24871a aVar2 = aVar;
        C25442g gVar2 = gVar;
        C24362h.m61211f(gVar, "descriptor");
        List<ProtoBuf$TypeParameter> list2 = list;
        C24362h.m61211f(list, "typeParameterProtos");
        C24362h.m61211f(cVar, "nameResolver");
        C24362h.m61211f(eVar, "typeTable");
        C24880f fVar3 = fVar;
        C24362h.m61211f(fVar3, "versionRequirementTable");
        C24362h.m61211f(aVar2, "metadataVersion");
        C23494g gVar3 = this.f59331a;
        boolean z = true;
        if (aVar2.f62865b != 1 || aVar2.f62866c < 4) {
            z = false;
        }
        if (z) {
            fVar2 = fVar3;
        } else {
            fVar2 = this.f59335e;
        }
        return new C23497i(gVar3, cVar, gVar, eVar, fVar2, aVar, this.f59337g, this.f59338h, list);
    }
}
