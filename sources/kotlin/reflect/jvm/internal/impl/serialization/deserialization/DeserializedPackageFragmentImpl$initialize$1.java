package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import cf0.C21136j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import ug0.C25065b;
import ug0.C25069e;

public final class DeserializedPackageFragmentImpl$initialize$1 extends Lambda implements C24225a<Collection<? extends C25069e>> {
    public final /* synthetic */ DeserializedPackageFragmentImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedPackageFragmentImpl$initialize$1(DeserializedPackageFragmentImpl deserializedPackageFragmentImpl) {
        super(0);
        this.this$0 = deserializedPackageFragmentImpl;
    }

    public final Object invoke() {
        boolean z;
        Set keySet = this.this$0.f61238k.f59351d.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object next : keySet) {
            C25065b bVar = (C25065b) next;
            if (bVar.mo61578k() || ClassDeserializer.f61230c.contains(bVar)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C21136j.m49436X(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C25065b) it.next()).mo61577j());
        }
        return arrayList2;
    }
}
