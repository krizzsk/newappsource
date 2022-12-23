package ce0;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.List;

/* renamed from: ce0.r */
public final class C21117r extends ObjectInputStream {

    /* renamed from: b */
    public final List<Class<?>> f52983b;

    public C21117r(FileInputStream fileInputStream, List list) throws IOException {
        super(fileInputStream);
        this.f52983b = list;
    }

    public final Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException, IOException {
        Class<?> resolveClass = super.resolveClass(objectStreamClass);
        if (this.f52983b == null || Number.class.isAssignableFrom(resolveClass) || String.class.equals(resolveClass) || Boolean.class.equals(resolveClass) || resolveClass.isArray() || this.f52983b.contains(resolveClass)) {
            return resolveClass;
        }
        StringBuilder k = C13555b.m33972k("Deserialization is not allowed for ");
        k.append(objectStreamClass.getName());
        throw new IOException(k.toString());
    }
}
