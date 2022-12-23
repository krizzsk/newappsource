package p789se;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;

/* renamed from: se.b */
public final class C19448b {

    /* renamed from: a */
    public final String f49468a;

    /* renamed from: b */
    public final Map<Class<?>, Object> f49469b;

    public C19448b(String str, Map<Class<?>, Object> map) {
        this.f49468a = str;
        this.f49469b = map;
    }

    /* renamed from: b */
    public static C19448b m46849b(String str) {
        return new C19448b(str, Collections.emptyMap());
    }

    /* renamed from: a */
    public final <T extends Annotation> T mo51855a(Class<T> cls) {
        return (Annotation) this.f49469b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19448b)) {
            return false;
        }
        C19448b bVar = (C19448b) obj;
        if (!this.f49468a.equals(bVar.f49468a) || !this.f49469b.equals(bVar.f49469b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f49469b.hashCode() + (this.f49468a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("FieldDescriptor{name=");
        k.append(this.f49468a);
        k.append(", properties=");
        k.append(this.f49469b.values());
        k.append("}");
        return k.toString();
    }
}
