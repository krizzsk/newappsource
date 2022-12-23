package kotlin.jvm.internal;

import mf0.C24362h;
import sf0.C24854a;
import sf0.C24866j;

public abstract class PropertyReference extends CallableReference implements C24866j {
    public PropertyReference() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PropertyReference) {
            PropertyReference propertyReference = (PropertyReference) obj;
            if (!getOwner().equals(propertyReference.getOwner()) || !getName().equals(propertyReference.getName()) || !getSignature().equals(propertyReference.getSignature()) || !C24362h.m61206a(getBoundReceiver(), propertyReference.getBoundReceiver())) {
                return false;
            }
            return true;
        } else if (obj instanceof C24866j) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public C24866j getReflected() {
        return (C24866j) super.getReflected();
    }

    public int hashCode() {
        int hashCode = getName().hashCode();
        return getSignature().hashCode() + ((hashCode + (getOwner().hashCode() * 31)) * 31);
    }

    public String toString() {
        C24854a compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        StringBuilder k = C13555b.m33972k("property ");
        k.append(getName());
        k.append(" (Kotlin reflection is not available)");
        return k.toString();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PropertyReference(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
    }
}
