package kotlin.jvm.internal;

import mf0.C24360f;
import mf0.C24362h;
import mf0.C24365j;
import sf0.C24854a;
import sf0.C24858e;

public class FunctionReference extends CallableReference implements C24360f, C24858e {
    private final int arity;
    private final int flags;

    public FunctionReference(int i) {
        this(i, CallableReference.NO_RECEIVER, (Class) null, (String) null, (String) null, 0);
    }

    public C24854a computeReflected() {
        return C24365j.f61688a.mo59363a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            if (!getName().equals(functionReference.getName()) || !getSignature().equals(functionReference.getSignature()) || this.flags != functionReference.flags || this.arity != functionReference.arity || !C24362h.m61206a(getBoundReceiver(), functionReference.getBoundReceiver()) || !C24362h.m61206a(getOwner(), functionReference.getOwner())) {
                return false;
            }
            return true;
        } else if (obj instanceof C24858e) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    public String toString() {
        C24854a compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        StringBuilder k = C13555b.m33972k("function ");
        k.append(getName());
        k.append(" (Kotlin reflection is not available)");
        return k.toString();
    }

    public FunctionReference(int i, Object obj) {
        this(i, obj, (Class) null, (String) null, (String) null, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FunctionReference(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = i2 >> 1;
    }
}
