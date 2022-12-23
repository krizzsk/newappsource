package cg0;

import ag0.C20989e;
import com.usebutton.sdk.internal.models.Configuration;
import fh0.C23385c;
import v00.C20064c;
import zf0.C25442g;

/* renamed from: cg0.g0 */
public final class C21171g0 extends C21163d {

    /* renamed from: d */
    public final C25442g f53067d;

    /* renamed from: e */
    public C23385c f53068e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21171g0(C25442g gVar, C20064c cVar, C20989e eVar) {
        super(eVar);
        if (gVar == null) {
            m49578A(0);
            throw null;
        } else if (eVar != null) {
            this.f53067d = gVar;
            this.f53068e = cVar;
        } else {
            m49578A(2);
            throw null;
        }
    }

    /* renamed from: A */
    public static /* synthetic */ void m49578A(int i) {
        String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 3 || i == 4) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "value";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 5:
                objArr[0] = "newOwner";
                break;
            case 6:
                objArr[0] = "outType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 3) {
            objArr[1] = "getValue";
        } else if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (!(i == 3 || i == 4)) {
            if (i == 5) {
                objArr[2] = Configuration.KEY_COPY;
            } else if (i != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "setOutType";
            }
        }
        String format = String.format(str, objArr);
        throw ((i == 3 || i == 4) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public final C25442g mo53399b() {
        C25442g gVar = this.f53067d;
        if (gVar != null) {
            return gVar;
        }
        m49578A(4);
        throw null;
    }

    public final C23385c getValue() {
        C23385c cVar = this.f53068e;
        if (cVar != null) {
            return cVar;
        }
        m49578A(3);
        throw null;
    }
}
