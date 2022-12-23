package bh0;

import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import mf0.C24362h;
import rh0.C24814b;

/* renamed from: bh0.a */
public final class C21060a implements C24814b.C24816b {

    /* renamed from: b */
    public boolean f52862b;

    public /* synthetic */ C21060a() {
    }

    public /* synthetic */ C21060a(boolean z) {
        this.f52862b = z;
    }

    /* renamed from: a */
    public synchronized boolean mo53185a() {
        if (this.f52862b) {
            return false;
        }
        this.f52862b = true;
        notifyAll();
        return true;
    }

    /* renamed from: b */
    public Iterable mo50617b(Object obj) {
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) obj;
        if (this.f52862b) {
            if (callableMemberDescriptor == null) {
                callableMemberDescriptor = null;
            } else {
                callableMemberDescriptor = callableMemberDescriptor.mo53407a();
            }
        }
        if (callableMemberDescriptor == null) {
            return EmptyList.f60173b;
        }
        Collection<? extends CallableMemberDescriptor> d = callableMemberDescriptor.mo53440d();
        C24362h.m61210e(d, "descriptor?.overriddenDescriptors ?: emptyList()");
        return d;
    }
}
