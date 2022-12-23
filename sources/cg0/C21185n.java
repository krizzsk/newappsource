package cg0;

import ag0.C20985b;
import ag0.C20989e;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import ug0.C25069e;
import zf0.C25442g;

/* renamed from: cg0.n */
public abstract class C21185n extends C20985b implements C25442g {

    /* renamed from: c */
    public final C25069e f53099c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21185n(C20989e eVar, C25069e eVar2) {
        super(eVar);
        if (eVar == null) {
            m49695A(0);
            throw null;
        } else if (eVar2 != null) {
            this.f53099c = eVar2;
        } else {
            m49695A(1);
            throw null;
        }
    }

    /* renamed from: A */
    public static /* synthetic */ void m49695A(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 2 || i == 3 || i == 5 || i == 6) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 5 || i == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (!(i == 2 || i == 3)) {
            if (i == 4) {
                objArr[2] = "toString";
            } else if (!(i == 5 || i == 6)) {
                objArr[2] = "<init>";
            }
        }
        String format = String.format(str, objArr);
        throw ((i == 2 || i == 3 || i == 5 || i == 6) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: C */
    public static String m49696C(C25442g gVar) {
        if (gVar != null) {
            try {
                String str = DescriptorRenderer.f61107b.mo60100E(gVar) + "[" + gVar.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(gVar)) + "]";
                if (str != null) {
                    return str;
                }
                m49695A(5);
                throw null;
            } catch (Throwable unused) {
                String str2 = gVar.getClass().getSimpleName() + " " + gVar.getName();
                if (str2 != null) {
                    return str2;
                }
                m49695A(6);
                throw null;
            }
        } else {
            m49695A(4);
            throw null;
        }
    }

    /* renamed from: a */
    public C25442g mo53407a() {
        return this;
    }

    public final C25069e getName() {
        C25069e eVar = this.f53099c;
        if (eVar != null) {
            return eVar;
        }
        m49695A(2);
        throw null;
    }

    public String toString() {
        return m49696C(this);
    }
}
