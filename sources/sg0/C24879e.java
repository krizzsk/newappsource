package sg0;

import cf0.C21136j;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import mf0.C24362h;
import p583jk.C17875h;

/* renamed from: sg0.e */
public final class C24879e {

    /* renamed from: a */
    public final List<ProtoBuf$Type> f62914a;

    public C24879e(ProtoBuf$TypeTable protoBuf$TypeTable) {
        List<ProtoBuf$Type> j = protoBuf$TypeTable.mo59885j();
        if (protoBuf$TypeTable.mo59886k()) {
            int i = protoBuf$TypeTable.mo59884i();
            List<ProtoBuf$Type> j2 = protoBuf$TypeTable.mo59885j();
            C24362h.m61210e(j2, "typeTable.typeList");
            ArrayList arrayList = new ArrayList(C21136j.m49436X(j2, 10));
            int i2 = 0;
            for (T next : j2) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) next;
                    if (i2 >= i) {
                        protoBuf$Type.getClass();
                        ProtoBuf$Type.C24034b j0 = ProtoBuf$Type.m59679j0(protoBuf$Type);
                        j0.f60935e |= 2;
                        j0.f60937g = true;
                        protoBuf$Type = j0.mo59850i();
                        if (!protoBuf$Type.isInitialized()) {
                            throw new UninitializedMessageException();
                        }
                    }
                    arrayList.add(protoBuf$Type);
                    i2 = i3;
                } else {
                    C17875h.m44294U();
                    throw null;
                }
            }
            j = arrayList;
        }
        C24362h.m61210e(j, "run {\n        val origin… else originalTypes\n    }");
        this.f62914a = j;
    }

    /* renamed from: a */
    public final ProtoBuf$Type mo61353a(int i) {
        return this.f62914a.get(i);
    }
}
