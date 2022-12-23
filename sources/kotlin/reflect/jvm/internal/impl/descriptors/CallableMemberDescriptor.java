package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import zf0.C25442g;
import zf0.C25453l;
import zf0.C25484s;

public interface CallableMemberDescriptor extends C23894a, C25484s {

    public enum Kind {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        public boolean isReal() {
            return this != FAKE_OVERRIDE;
        }
    }

    /* renamed from: I0 */
    void mo53416I0(Collection<? extends CallableMemberDescriptor> collection);

    /* renamed from: L0 */
    CallableMemberDescriptor mo53420L0(C25442g gVar, Modality modality, C25453l lVar, Kind kind);

    /* renamed from: a */
    CallableMemberDescriptor mo53407a();

    /* renamed from: d */
    Collection<? extends CallableMemberDescriptor> mo53440d();

    /* renamed from: p */
    Kind mo53433p();
}
