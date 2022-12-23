package cg0;

import ag0.C20989e;
import com.usebutton.sdk.internal.models.Configuration;
import fh0.C23384b;
import fh0.C23385c;
import zf0.C25432c;
import zf0.C25442g;

/* renamed from: cg0.u */
public final class C21196u extends C21163d {

    /* renamed from: d */
    public final C25432c f53116d;

    /* renamed from: e */
    public final C23384b f53117e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21196u(C21154b bVar) {
        super(C20989e.C20990a.f52739a);
        if (bVar != null) {
            this.f53116d = bVar;
            this.f53117e = new C23384b(bVar);
            return;
        }
        m49738A(0);
        throw null;
    }

    /* renamed from: A */
    public static /* synthetic */ void m49738A(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 1 || i == 2) ? 2 : 3)];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i == 1) {
            objArr[1] = "getValue";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (!(i == 1 || i == 2)) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = Configuration.KEY_COPY;
            }
        }
        String format = String.format(str, objArr);
        throw ((i == 1 || i == 2) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public final C25442g mo53399b() {
        C25432c cVar = this.f53116d;
        if (cVar != null) {
            return cVar;
        }
        m49738A(2);
        throw null;
    }

    public final C23385c getValue() {
        C23384b bVar = this.f53117e;
        if (bVar != null) {
            return bVar;
        }
        m49738A(1);
        throw null;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("class ");
        k.append(this.f53116d.getName());
        k.append("::this");
        return k.toString();
    }
}
