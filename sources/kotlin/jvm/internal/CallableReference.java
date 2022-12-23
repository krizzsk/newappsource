package kotlin.jvm.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import mf0.C24365j;
import sf0.C24854a;
import sf0.C24857d;

public abstract class CallableReference implements C24854a, Serializable {
    public static final Object NO_RECEIVER = NoReceiver.f60191b;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    public final Object receiver;
    private transient C24854a reflected;
    private final String signature;

    public static class NoReceiver implements Serializable {

        /* renamed from: b */
        public static final NoReceiver f60191b = new NoReceiver();

        private NoReceiver() {
        }

        private Object readResolve() throws ObjectStreamException {
            return f60191b;
        }
    }

    public CallableReference() {
        this(NO_RECEIVER);
    }

    public C24854a compute() {
        C24854a aVar = this.reflected;
        if (aVar != null) {
            return aVar;
        }
        C24854a computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract C24854a computeReflected();

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public C24857d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            return C24365j.f61688a.mo59365c(cls, "");
        }
        return C24365j.m61219a(cls);
    }

    public C24854a getReflected() {
        C24854a compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new KotlinReflectionNotSupportedError();
    }

    public String getSignature() {
        return this.signature;
    }

    public CallableReference(Object obj) {
        this(obj, (Class) null, (String) null, (String) null, false);
    }

    public CallableReference(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }
}
