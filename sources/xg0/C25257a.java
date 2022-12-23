package xg0;

import ci0.C21211f;
import eh0.C23306d;
import eh0.C23312h;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import lh0.C24307v;
import mf0.C24362h;
import ug0.C25069e;
import zf0.C25432c;
import zf0.C25437e;
import zf0.C25442g;
import zf0.C25446h0;

/* renamed from: xg0.a */
public final class C25257a extends C21211f {
    /* renamed from: w */
    public static final void m63374w(DeserializedClassDescriptor deserializedClassDescriptor, LinkedHashSet linkedHashSet, MemberScope memberScope, boolean z) {
        boolean z2;
        for (C25442g gVar : C23312h.C23313a.m57410a(memberScope, C23306d.f59100o, 2)) {
            if (gVar instanceof C25432c) {
                C25432c cVar = (C25432c) gVar;
                if (cVar.mo53434p0()) {
                    C25069e name = cVar.getName();
                    C24362h.m61210e(name, "descriptor.name");
                    C25437e g = memberScope.mo58433g(name, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
                    if (g instanceof C25432c) {
                        cVar = (C25432c) g;
                    } else if (g instanceof C25446h0) {
                        cVar = ((C25446h0) g).mo58972t();
                    } else {
                        cVar = null;
                    }
                }
                if (cVar != null) {
                    int i = C25260c.f63536a;
                    Iterator<C24307v> it = cVar.mo53481j().mo53459n().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (C25260c.m63399p(it.next(), deserializedClassDescriptor)) {
                                z2 = true;
                                break;
                            }
                        } else {
                            z2 = false;
                            break;
                        }
                    }
                    if (z2) {
                        linkedHashSet.add(cVar);
                    }
                    if (z) {
                        MemberScope X = cVar.mo53405X();
                        C24362h.m61210e(X, "refinedDescriptor.unsubstitutedInnerClassesScope");
                        m63374w(deserializedClassDescriptor, linkedHashSet, X, z);
                    }
                }
            }
        }
    }
}
