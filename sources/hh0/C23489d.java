package hh0;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import mf0.C24362h;
import sg0.C24871a;
import sg0.C24876c;
import zf0.C25435d0;

/* renamed from: hh0.d */
public final class C23489d {

    /* renamed from: a */
    public final C24876c f59306a;

    /* renamed from: b */
    public final ProtoBuf$Class f59307b;

    /* renamed from: c */
    public final C24871a f59308c;

    /* renamed from: d */
    public final C25435d0 f59309d;

    public C23489d(C24876c cVar, ProtoBuf$Class protoBuf$Class, C24871a aVar, C25435d0 d0Var) {
        C24362h.m61211f(cVar, "nameResolver");
        C24362h.m61211f(protoBuf$Class, "classProto");
        C24362h.m61211f(aVar, "metadataVersion");
        C24362h.m61211f(d0Var, "sourceElement");
        this.f59306a = cVar;
        this.f59307b = protoBuf$Class;
        this.f59308c = aVar;
        this.f59309d = d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23489d)) {
            return false;
        }
        C23489d dVar = (C23489d) obj;
        return C24362h.m61206a(this.f59306a, dVar.f59306a) && C24362h.m61206a(this.f59307b, dVar.f59307b) && C24362h.m61206a(this.f59308c, dVar.f59308c) && C24362h.m61206a(this.f59309d, dVar.f59309d);
    }

    public final int hashCode() {
        int hashCode = this.f59307b.hashCode();
        int hashCode2 = this.f59308c.hashCode();
        return this.f59309d.hashCode() + ((hashCode2 + ((hashCode + (this.f59306a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("ClassData(nameResolver=");
        k.append(this.f59306a);
        k.append(", classProto=");
        k.append(this.f59307b);
        k.append(", metadataVersion=");
        k.append(this.f59308c);
        k.append(", sourceElement=");
        k.append(this.f59309d);
        k.append(')');
        return k.toString();
    }
}
