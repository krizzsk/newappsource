package fh0;

import kotlin.reflect.jvm.internal.impl.descriptors.C23894a;
import lh0.C24307v;
import v00.C20064c;

/* renamed from: fh0.a */
public final class C23383a extends C20064c {

    /* renamed from: c */
    public final C23894a f59165c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23383a(C23894a aVar, C24307v vVar, C23385c cVar) {
        super(vVar, cVar);
        if (aVar == null) {
            m57498b(0);
            throw null;
        } else if (vVar != null) {
            this.f59165c = aVar;
        } else {
            m57498b(1);
            throw null;
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m57498b(int i) {
        String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 2 ? 3 : 2)];
        if (i == 1) {
            objArr[0] = "receiverType";
        } else if (i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i != 2) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String format = String.format(str, objArr);
        throw (i != 2 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    public final String toString() {
        return getType() + ": Ext {" + this.f59165c + "}";
    }
}
