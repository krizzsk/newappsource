package hh0;

import cg0.C21154b;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* renamed from: hh0.l */
public interface C23500l {

    /* renamed from: f0 */
    public static final C23501a f59341f0 = new C23501a();

    /* renamed from: hh0.l$a */
    public static class C23501a implements C23500l {
        /* renamed from: b */
        public static /* synthetic */ void m57627b(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public final void mo58617a(CallableMemberDescriptor callableMemberDescriptor) {
            if (callableMemberDescriptor == null) {
                m57627b(2);
                throw null;
            }
        }

        /* renamed from: f */
        public final void mo58618f(C21154b bVar, ArrayList arrayList) {
            if (bVar == null) {
                m57627b(0);
                throw null;
            }
        }
    }

    /* renamed from: a */
    void mo58617a(CallableMemberDescriptor callableMemberDescriptor);

    /* renamed from: f */
    void mo58618f(C21154b bVar, ArrayList arrayList);
}
