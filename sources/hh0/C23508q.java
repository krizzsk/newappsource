package hh0;

import cf0.C21136j;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment;
import lf0.C24236l;
import mf0.C24362h;
import p389bl.C13637c;
import p584jl.C17885a;
import sg0.C24871a;
import sg0.C24876c;
import sg0.C24877d;
import ug0.C25065b;
import zf0.C25435d0;

/* renamed from: hh0.q */
public final class C23508q implements C23490e {

    /* renamed from: a */
    public final C24876c f59348a;

    /* renamed from: b */
    public final C24871a f59349b;

    /* renamed from: c */
    public final C24236l<C25065b, C25435d0> f59350c;

    /* renamed from: d */
    public final LinkedHashMap f59351d;

    public C23508q(ProtoBuf$PackageFragment protoBuf$PackageFragment, C24877d dVar, C24871a aVar, C24236l lVar) {
        this.f59348a = dVar;
        this.f59349b = aVar;
        this.f59350c = lVar;
        List<ProtoBuf$Class> w = protoBuf$PackageFragment.mo59762w();
        C24362h.m61210e(w, "proto.class_List");
        int z = C13637c.m34083z(C21136j.m49436X(w, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(z < 16 ? 16 : z);
        for (T next : w) {
            linkedHashMap.put(C17885a.m44421R(this.f59348a, ((ProtoBuf$Class) next).mo59663Z()), next);
        }
        this.f59351d = linkedHashMap;
    }

    /* renamed from: a */
    public final C23489d mo58605a(C25065b bVar) {
        C24362h.m61211f(bVar, "classId");
        ProtoBuf$Class protoBuf$Class = (ProtoBuf$Class) this.f59351d.get(bVar);
        if (protoBuf$Class == null) {
            return null;
        }
        return new C23489d(this.f59348a, protoBuf$Class, this.f59349b, this.f59350c.invoke(bVar));
    }
}
